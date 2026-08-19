package org.telegram.ui.Components;

import android.text.TextUtils;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.ext.latex.JLatexMathBlock;
import io.noties.markwon.ext.latex.JLatexMathNode;
import io.noties.markwon.ext.latex.JLatexMathPlugin;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlParser;
import io.noties.markwon.html.MarkwonHtmlParserImpl;
import io.noties.markwon.inlineparser.InlineProcessor;
import io.noties.markwon.inlineparser.MarkwonInlineParserPlugin;
import j$.util.Comparator$-CC;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.CustomBlock;
import org.commonmark.node.CustomNode;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.MarkdownParser;
import org.telegram.ui.iv.Latex;

/* loaded from: classes5.dex */
public abstract class MarkdownParser {
    private static final Pattern FOOTNOTE_DEF = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    private static final Pattern FOOTNOTE_REF = Pattern.compile("\\[\\^([^\\]]+)\\]");
    private static final Pattern ORDERED_MARKER = Pattern.compile("^(\\d+)[.)]\\s");

    public static boolean isMarkdown(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return isExtensionMarkdown(messageObject.getExtension()) || isMimeMarkdown(messageObject.getMimeType());
    }

    public static boolean isExtensionMarkdown(String str) {
        return "md".equalsIgnoreCase(str) || "mkd".equalsIgnoreCase(str) || "mdwn".equalsIgnoreCase(str) || "mkdn".equalsIgnoreCase(str) || "mdown".equalsIgnoreCase(str) || "markdown".equalsIgnoreCase(str);
    }

    public static boolean isMimeMarkdown(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("text/markdown") || lowerCase.startsWith("text/x-markdown") || lowerCase.startsWith("text/x-web-markdown");
    }

    public static TLRPC.WebPage fromMarkdown(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || messageObject.messageOwner == null || (document = messageObject.getDocument()) == null) {
            return null;
        }
        File file = !TextUtils.isEmpty(messageObject.messageOwner.attachPath) ? new File(messageObject.messageOwner.attachPath) : null;
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
        }
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
        }
        if (file == null || !file.exists() || file.length() > 65536) {
            return null;
        }
        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
        String str = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.url = str == null ? "" : str;
        tL_webPage.display_url = str != null ? str : "";
        if (!TextUtils.isEmpty(str)) {
            tL_webPage.flags |= 4;
            tL_webPage.title = str;
        }
        TL_iv.TL_page tL_page = new TL_iv.TL_page();
        tL_page.local = file;
        tL_page.url = tL_webPage.url;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                String str2 = new String(bArr, StandardCharsets.UTF_8);
                fileInputStream.close();
                if (str2.length() > 65536) {
                    return null;
                }
                String parse = parse(str2, tL_page.blocks);
                if (!TextUtils.isEmpty(parse)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = parse;
                }
                tL_webPage.flags |= 1024;
                tL_webPage.cached_page = tL_page;
                return tL_webPage;
            } finally {
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String parse(String str, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rewriteFootnoteRefs = rewriteFootnoteRefs(extractFootnoteDefs(str, linkedHashMap));
        List asList = Arrays.asList(StrikethroughExtension.create(), TablesExtension.create());
        final MarkwonInlineParserPlugin create = MarkwonInlineParserPlugin.create();
        JLatexMathPlugin create2 = JLatexMathPlugin.create(AndroidUtilities.dp(18.0f), new JLatexMathPlugin.BuilderConfigure() { // from class: org.telegram.ui.Components.MarkdownParser$$ExternalSyntheticLambda0
            @Override // io.noties.markwon.ext.latex.JLatexMathPlugin.BuilderConfigure
            public final void configureBuilder(JLatexMathPlugin.Builder builder) {
                builder.inlinesEnabled(true);
            }
        });
        create2.configure(new MarkwonPlugin.Registry() { // from class: org.telegram.ui.Components.MarkdownParser.1
            @Override // io.noties.markwon.MarkwonPlugin.Registry
            public MarkwonPlugin require(Class cls) {
                if (cls == MarkwonInlineParserPlugin.class) {
                    return MarkwonInlineParserPlugin.this;
                }
                throw new IllegalStateException("plugin not registered: " + cls);
            }
        });
        create.factoryBuilder().addInlineProcessor(new SingleDollarLatexInlineProcessor());
        Parser.Builder extensions = Parser.builder().extensions(asList);
        create.configureParser(extensions);
        create2.configureParser(extensions);
        Parser build = extensions.build();
        BlockVisitor blockVisitor = new BlockVisitor(arrayList, scanOrderedListMarkers(rewriteFootnoteRefs));
        build.parse(rewriteFootnoteRefs).accept(blockVisitor);
        blockVisitor.finish();
        appendFootnotes(build, arrayList, linkedHashMap);
        TL_iv.RichText richText = blockVisitor.title;
        if (richText != null) {
            return richTextToString(richText);
        }
        return null;
    }

    public static class SingleDollarLatexInlineProcessor extends InlineProcessor {
        private static final Pattern RE = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

        @Override // io.noties.markwon.inlineparser.InlineProcessor
        public char specialCharacter() {
            return '$';
        }

        @Override // io.noties.markwon.inlineparser.InlineProcessor
        protected Node parse() {
            String match = match(RE);
            if (match == null) {
                return null;
            }
            JLatexMathNode jLatexMathNode = new JLatexMathNode();
            jLatexMathNode.latex(match.substring(1, match.length() - 1));
            return jLatexMathNode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TL_iv.textMath makeLatex(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String trim = str == null ? "" : str.trim();
        textmath.source = trim;
        textmath.tried = true;
        Latex render = Latex.render(trim, AndroidUtilities.dp(20.0f), true);
        if (render != null) {
            textmath.w = render.width;
            textmath.h = render.height;
            textmath.depth = render.depth;
            textmath.bitmap = render.bitmap;
        }
        return textmath;
    }

    private static ArrayDeque scanOrderedListMarkers(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        String str2 = null;
        boolean z = false;
        for (String str3 : str.split("\n", -1)) {
            int i = 0;
            while (i < str3.length() && i < 3 && str3.charAt(i) == ' ') {
                i++;
            }
            String substring = str3.substring(i);
            if (z) {
                if (substring.startsWith(str2)) {
                    str2 = null;
                    z = false;
                }
            } else {
                String str4 = "```";
                if (!substring.startsWith("```")) {
                    str4 = "~~~";
                    if (!substring.startsWith("~~~")) {
                        Matcher matcher = ORDERED_MARKER.matcher(str3);
                        if (matcher.find()) {
                            arrayDeque.add(matcher.group(1));
                        }
                    }
                }
                str2 = str4;
                z = true;
            }
        }
        return arrayDeque;
    }

    private static String extractFootnoteDefs(String str, LinkedHashMap linkedHashMap) {
        String[] split = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            Matcher matcher = FOOTNOTE_DEF.matcher(split[i]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                while (true) {
                    i++;
                    while (i < split.length) {
                        String str2 = split[i];
                        if (str2.startsWith("    ") || str2.startsWith("\t")) {
                            sb2.append('\n');
                            sb2.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        } else {
                            if (!str2.trim().isEmpty()) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = i2;
                            while (i3 < split.length && split[i3].trim().isEmpty()) {
                                i3++;
                            }
                            if (i3 >= split.length || (!split[i3].startsWith("    ") && !split[i3].startsWith("\t"))) {
                                break;
                            }
                            sb2.append('\n');
                            i = i2;
                        }
                    }
                    break;
                }
                linkedHashMap.put(group, sb2.toString().trim());
            } else {
                sb.append(split[i]);
                if (i < split.length - 1) {
                    sb.append('\n');
                }
                i++;
            }
        }
        return sb.toString();
    }

    private static String rewriteFootnoteRefs(String str) {
        Matcher matcher = FOOTNOTE_REF.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group + "\\]](#fn-" + group + ")</sup>"));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static void appendFootnotes(Parser parser, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.title = bold(LocaleController.getString(R.string.InstantViewReferences));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            BlockVisitor blockVisitor = new BlockVisitor(arrayList2);
            parser.parse(str2).accept(blockVisitor);
            blockVisitor.finish();
            TL_iv.RichText first = first(combineParagraphs(arrayList2));
            TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
            textanchor.name = "fn-" + str;
            textanchor.text = first;
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = concat(bold(str + ". "), textanchor);
            pageblockdetails.blocks.add(pageblockparagraph);
        }
        arrayList.add(pageblockdetails);
    }

    private static TL_iv.RichText combineParagraphs(ArrayList arrayList) {
        TL_iv.RichText richText;
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                richText = ((TL_iv.pageBlockParagraph) pageBlock).text;
            } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                richText = ((TL_iv.pageBlockHeader) pageBlock).text;
            } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                richText = ((TL_iv.pageBlockSubheader) pageBlock).text;
            } else {
                richText = pageBlock instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock).text : null;
            }
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                if (!textconcat.texts.isEmpty()) {
                    textconcat.texts.add(plain("\n\n"));
                }
                textconcat.texts.add(richText);
            }
        }
        return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TL_iv.RichText richTextOf(Node node, TL_iv.PageBlock pageBlock) {
        RichTextParser richTextParser = new RichTextParser(pageBlock);
        node.accept(richTextParser);
        return materializeStyles(pairHtml(richTextParser.getText()));
    }

    private static TL_iv.RichText pairHtml(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, pairHtml(arrayList.get(i)));
            }
            return pairHtmlConcat(textconcat);
        }
        TL_iv.RichText richText2 = richText;
        while (true) {
            TL_iv.RichText richText3 = richText2.text;
            if (richText3 == null) {
                return richText;
            }
            if (richText3 instanceof TL_iv.textConcat) {
                richText2.text = pairHtml(richText3);
                return richText;
            }
            richText2 = richText3;
        }
    }

    private static TL_iv.RichText pairHtmlConcat(TL_iv.textConcat textconcat) {
        TL_iv.RichText textconcat2;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        MarkwonHtmlParserImpl create = MarkwonHtmlParserImpl.create();
        ArrayList<TL_iv.RichText> arrayList3 = textconcat.texts;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText = arrayList3.get(i);
            i++;
            TL_iv.RichText richText2 = richText;
            if (richText2 instanceof TL_iv.textPlain) {
                TL_iv.textPlain textplain = (TL_iv.textPlain) richText2;
                if (looksLikeHtmlTag(textplain.text)) {
                    int length = sb.length();
                    try {
                        create.processFragment(sb, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        sb.append(textplain.text);
                    }
                    int length2 = sb.length();
                    if (length2 > length) {
                        arrayList.add(plain(sb.substring(length, length2)));
                        arrayList2.add(new int[]{length, length2});
                    }
                }
            }
            String richTextToString = richTextToString(richText2);
            int length3 = sb.length();
            sb.append(richTextToString);
            int length4 = sb.length();
            arrayList.add(richText2);
            arrayList2.add(new int[]{length3, length4});
        }
        final ArrayList arrayList4 = new ArrayList();
        try {
            create.flushInlineTags(sb.length(), new MarkwonHtmlParser.FlushAction() { // from class: org.telegram.ui.Components.MarkdownParser$$ExternalSyntheticLambda1
                @Override // io.noties.markwon.html.MarkwonHtmlParser.FlushAction
                public final void apply(List list) {
                    arrayList4.addAll(list);
                }
            });
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        try {
            create.flushBlockTags(sb.length(), new MarkwonHtmlParser.FlushAction() { // from class: org.telegram.ui.Components.MarkdownParser$$ExternalSyntheticLambda2
                @Override // io.noties.markwon.html.MarkwonHtmlParser.FlushAction
                public final void apply(List list) {
                    MarkdownParser.flattenBlocks(list, arrayList4);
                }
            });
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        Collections.sort(arrayList4, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Components.MarkdownParser$$ExternalSyntheticLambda3
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return MarkdownParser.$r8$lambda$TSB6PtQnqwUe3b0sV6pwV-mIyyw((HtmlTag) obj);
            }
        }));
        int size2 = arrayList4.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList4.get(i2);
            i2++;
            HtmlTag htmlTag = (HtmlTag) obj;
            if (htmlTag.isClosed()) {
                int start = htmlTag.start();
                int end = htmlTag.end();
                int i3 = -1;
                int i4 = -1;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    int i6 = ((int[]) arrayList2.get(i5))[0];
                    int i7 = ((int[]) arrayList2.get(i5))[1];
                    if (i6 >= start && i7 <= end) {
                        if (i3 == -1) {
                            i3 = i5;
                        }
                        i4 = i5;
                    }
                }
                if (i3 != -1) {
                    if (i3 == i4) {
                        textconcat2 = (TL_iv.RichText) arrayList.get(i3);
                    } else {
                        textconcat2 = new TL_iv.textConcat();
                        for (int i8 = i3; i8 <= i4; i8++) {
                            textconcat2.texts.add((TL_iv.RichText) arrayList.get(i8));
                        }
                    }
                    TL_iv.RichText wrapByTag = wrapByTag(htmlTag.name(), textconcat2);
                    while (i4 >= i3) {
                        arrayList.remove(i4);
                        arrayList2.remove(i4);
                        i4--;
                    }
                    arrayList.add(i3, wrapByTag);
                    arrayList2.add(i3, new int[]{start, end});
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            TL_iv.RichText richText3 = (TL_iv.RichText) arrayList.get(0);
            if ((richText3 instanceof TL_iv.textPlain) || (richText3 instanceof TL_iv.textEmpty)) {
                return richText3;
            }
        }
        TL_iv.textConcat textconcat3 = new TL_iv.textConcat();
        textconcat3.texts.addAll(arrayList);
        return textconcat3;
    }

    public static /* synthetic */ int $r8$lambda$TSB6PtQnqwUe3b0sV6pwV-mIyyw(HtmlTag htmlTag) {
        return htmlTag.end() - htmlTag.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void flattenBlocks(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HtmlTag.Block block = (HtmlTag.Block) it.next();
            list2.add(block);
            flattenBlocks(block.children(), list2);
        }
    }

    private static boolean looksLikeHtmlTag(String str) {
        return str != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>';
    }

    private static final class TextStyle extends TL_iv.RichText {
        int styleFlags;

        private TextStyle() {
        }
    }

    private static int flagFor(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 0;
    }

    private static TL_iv.RichText wrapByTag(String str, TL_iv.RichText richText) {
        int flagFor = flagFor(str);
        if (flagFor == 0) {
            return richText;
        }
        if (richText instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) richText;
            textStyle.styleFlags = flagFor | textStyle.styleFlags;
            return richText;
        }
        TextStyle textStyle2 = new TextStyle();
        textStyle2.styleFlags = flagFor;
        textStyle2.text = richText;
        return textStyle2;
    }

    private static TL_iv.RichText materializeStyles(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, materializeStyles(arrayList.get(i)));
            }
            return textconcat;
        }
        if (richText instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) richText;
            TL_iv.RichText materializeStyles = materializeStyles(textStyle.text);
            int i2 = textStyle.styleFlags;
            if ((i2 & 4) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textFixed(), materializeStyles);
            }
            if ((i2 & 32) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textStrike(), materializeStyles);
            }
            if ((i2 & 16) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textUnderline(), materializeStyles);
            }
            if ((i2 & 64) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textMarked(), materializeStyles);
            }
            if ((i2 & 128) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textSubscript(), materializeStyles);
            }
            if ((i2 & 256) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textSuperscript(), materializeStyles);
            }
            if ((i2 & 2) != 0) {
                materializeStyles = wrapStyle(new TL_iv.textItalic(), materializeStyles);
            }
            return (i2 & 1) != 0 ? wrapStyle(new TL_iv.textBold(), materializeStyles) : materializeStyles;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            richText.text = materializeStyles(richText2);
        }
        return richText;
    }

    private static TL_iv.RichText wrapStyle(TL_iv.RichText richText, TL_iv.RichText richText2) {
        richText.text = richText2;
        return richText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TL_iv.RichText plain(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    private static TL_iv.RichText bold(String str) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = plain(str);
        return textbold;
    }

    private static TL_iv.RichText concat(TL_iv.RichText... richTextArr) {
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        for (TL_iv.RichText richText : richTextArr) {
            textconcat.texts.add(richText);
        }
        return textconcat;
    }

    private static int richTextLength(TL_iv.RichText richText) {
        int i = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i2 = 0;
            while (i < size) {
                TL_iv.RichText richText2 = arrayList.get(i);
                i++;
                i2 += richTextLength(richText2);
            }
            return i2;
        }
        return richTextLength(richText.text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TL_iv.RichText first(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richTextLength(richText) <= 8192) {
            return richText;
        }
        String richTextToString = richTextToString(richText);
        return plain(richTextToString.substring(0, Math.min(richTextToString.length(), 8192)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List split(TL_iv.RichText richText) {
        int i;
        if (richText == null) {
            return Collections.singletonList(plain(""));
        }
        if (richTextLength(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String richTextToString = richTextToString(richText);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < richTextToString.length()) {
            if (richTextToString.length() - i2 <= 8192) {
                arrayList.add(plain(richTextToString.substring(i2)));
                return arrayList;
            }
            int i3 = i2 + 8192;
            int i4 = i2 + 8191;
            int lastIndexOf = richTextToString.lastIndexOf(10, i4);
            if (lastIndexOf <= i2) {
                lastIndexOf = richTextToString.lastIndexOf(32, i4);
            }
            if (lastIndexOf <= i2) {
                i = 0;
            } else {
                i3 = lastIndexOf;
                i = 1;
            }
            arrayList.add(plain(richTextToString.substring(i2, i3)));
            i2 = i3 + i;
        }
        return arrayList;
    }

    public static String richTextToString(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_iv.RichText richText2 = arrayList.get(i);
                i++;
                sb.append(richTextToString(richText2));
            }
            return sb.toString();
        }
        return richTextToString(richText.text);
    }

    public static class BlockVisitor extends AbstractVisitor {
        public final ArrayList blocks;
        private final MarkwonHtmlParser htmlParser;
        private final List items;
        private final ArrayDeque orderedMarkers;
        private final StringBuilder synth;
        public TL_iv.RichText title;

        private static final class Item {
            final TL_iv.PageBlock block;
            final int end;
            final int start;

            Item(TL_iv.PageBlock pageBlock, int i, int i2) {
                this.block = pageBlock;
                this.start = i;
                this.end = i2;
            }
        }

        public BlockVisitor(ArrayList arrayList) {
            this(arrayList, new ArrayDeque());
        }

        public BlockVisitor(ArrayList arrayList, ArrayDeque arrayDeque) {
            this.items = new ArrayList();
            this.synth = new StringBuilder();
            this.htmlParser = MarkwonHtmlParserImpl.create();
            this.blocks = arrayList;
            this.orderedMarkers = arrayDeque;
        }

        private void emit(TL_iv.PageBlock pageBlock) {
            int length = this.synth.length();
            this.synth.append((char) 1);
            this.items.add(new Item(pageBlock, length, this.synth.length()));
        }

        public void finish() {
            final ArrayList arrayList = new ArrayList();
            try {
                this.htmlParser.flushBlockTags(this.synth.length(), new MarkwonHtmlParser.FlushAction() { // from class: org.telegram.ui.Components.MarkdownParser$BlockVisitor$$ExternalSyntheticLambda0
                    @Override // io.noties.markwon.html.MarkwonHtmlParser.FlushAction
                    public final void apply(List list) {
                        arrayList.addAll(list);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
            ArrayList arrayList2 = new ArrayList();
            flattenBlockTags(arrayList, arrayList2);
            HashMap hashMap = new HashMap();
            for (Item item : this.items) {
                hashMap.put(Integer.valueOf(item.start), item);
            }
            TreeSet treeSet = new TreeSet();
            int i = 0;
            treeSet.add(0);
            treeSet.add(Integer.valueOf(this.synth.length()));
            for (Integer num : hashMap.keySet()) {
                treeSet.add(num);
                treeSet.add(Integer.valueOf(num.intValue() + 1));
            }
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                HtmlTag.Block block = (HtmlTag.Block) obj;
                treeSet.add(Integer.valueOf(block.start()));
                treeSet.add(Integer.valueOf(block.end()));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = treeSet.iterator();
            Integer num2 = null;
            while (it.hasNext()) {
                Integer num3 = (Integer) it.next();
                if (num2 != null && num3.intValue() > num2.intValue()) {
                    int intValue = num2.intValue();
                    int intValue2 = num3.intValue();
                    if (intValue2 - intValue == 1 && hashMap.containsKey(num2)) {
                        arrayList3.add((Item) hashMap.get(num2));
                    } else {
                        String trim = this.synth.substring(intValue, intValue2).trim();
                        if (!trim.isEmpty()) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = MarkdownParser.first(MarkdownParser.plain(trim));
                            arrayList3.add(new Item(pageblockparagraph, intValue, intValue2));
                        }
                    }
                }
                num2 = num3;
            }
            Collections.sort(arrayList2, new Comparator() { // from class: org.telegram.ui.Components.MarkdownParser$BlockVisitor$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return MarkdownParser.BlockVisitor.$r8$lambda$rwbGcvNvTfWRyBs26W2mPxgJxss((HtmlTag.Block) obj2, (HtmlTag.Block) obj3);
                }
            });
            Scope scope = new Scope(null, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(scope);
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                Item item2 = (Item) obj2;
                while (i3 < arrayList2.size() && ((HtmlTag.Block) arrayList2.get(i3)).start() <= item2.start) {
                    int i4 = i3 + 1;
                    HtmlTag.Block block2 = (HtmlTag.Block) arrayList2.get(i3);
                    if (block2.end() >= item2.start) {
                        while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= block2.start()) {
                            arrayDeque.pop();
                        }
                        Scope scope2 = new Scope(block2, block2.start(), block2.end());
                        ((Scope) arrayDeque.peek()).children.add(scope2);
                        arrayDeque.push(scope2);
                    }
                    i3 = i4;
                }
                while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= item2.start) {
                    arrayDeque.pop();
                }
                if (item2.block != null) {
                    ((Scope) arrayDeque.peek()).children.add(item2);
                }
            }
            materialize(scope.children, this.blocks);
        }

        public static /* synthetic */ int $r8$lambda$rwbGcvNvTfWRyBs26W2mPxgJxss(HtmlTag.Block block, HtmlTag.Block block2) {
            int compare = Integer.compare(block.start(), block2.start());
            return compare != 0 ? compare : Integer.compare(block2.end(), block.end());
        }

        private static void flattenBlockTags(List list, List list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HtmlTag.Block block = (HtmlTag.Block) it.next();
                list2.add(block);
                flattenBlockTags(block.children(), list2);
            }
        }

        private static final class Scope {
            final List children = new ArrayList();
            final int end;
            final int start;
            final HtmlTag.Block tag;

            Scope(HtmlTag.Block block, int i, int i2) {
                this.tag = block;
                this.start = i;
                this.end = i2;
            }
        }

        private void materialize(List list, List list2) {
            materialize(list, list2, 0);
        }

        private void materialize(List list, List list2, int i) {
            for (Object obj : list) {
                if (obj instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock != null) {
                        list2.add(pageBlock);
                    }
                } else if (obj instanceof Scope) {
                    wrapScope((Scope) obj, list2, i);
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void wrapScope(Scope scope, List list, int i) {
            char c;
            String lowerCase = scope.tag.name() == null ? "" : scope.tag.name().toLowerCase();
            if (i >= 64) {
                materialize(scope.children, list, i + 1);
                return;
            }
            boolean z = false;
            switch (lowerCase.hashCode()) {
                case -1857640538:
                    if (lowerCase.equals("summary")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1268861541:
                    if (lowerCase.equals("footer")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1221270899:
                    if (lowerCase.equals("header")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -732377866:
                    if (lowerCase.equals("article")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 112:
                    if (lowerCase.equals("p")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 99473:
                    if (lowerCase.equals("div")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 108835:
                    if (lowerCase.equals("nav")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3343801:
                    if (lowerCase.equals("main")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 93111608:
                    if (lowerCase.equals("aside")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1557721666:
                    if (lowerCase.equals("details")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1970241253:
                    if (lowerCase.equals("section")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    materialize(scope.children, list, i + 1);
                    return;
                }
                return;
            }
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            if (scope.tag.attributes() != null && scope.tag.attributes().containsKey("open")) {
                z = true;
            }
            pageblockdetails.open = z;
            pageblockdetails.title = new TL_iv.textEmpty();
            ArrayList arrayList = new ArrayList();
            for (Object obj : scope.children) {
                boolean z2 = obj instanceof Scope;
                if (z2) {
                    Scope scope2 = (Scope) obj;
                    if ("summary".equalsIgnoreCase(scope2.tag.name())) {
                        pageblockdetails.title = scopeToRichText(scope2);
                    }
                }
                if (obj instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock != null) {
                        arrayList.add(pageBlock);
                    }
                } else if (z2) {
                    wrapScope((Scope) obj, arrayList, i + 1);
                }
            }
            pageblockdetails.blocks.addAll(arrayList);
            list.add(pageblockdetails);
        }

        private TL_iv.RichText scopeToRichText(Scope scope) {
            StringBuilder sb = new StringBuilder();
            collectText(scope.children, sb);
            String trim = sb.toString().trim();
            return trim.isEmpty() ? new TL_iv.textEmpty() : MarkdownParser.plain(trim);
        }

        private void collectText(List list, StringBuilder sb) {
            for (Object obj : list) {
                if (obj instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockParagraph) pageBlock).text));
                    } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockHeader) pageBlock).text));
                    } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockSubheader) pageBlock).text));
                    }
                } else if (obj instanceof Scope) {
                    collectText(((Scope) obj).children, sb);
                }
            }
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Heading heading) {
            TL_iv.RichText first = MarkdownParser.first(MarkdownParser.richTextOf(heading, null));
            if (this.items.isEmpty()) {
                this.title = first;
            }
            switch (heading.getLevel()) {
                case 1:
                    TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                    pageblockheading1.text = first;
                    emit(pageblockheading1);
                    break;
                case 2:
                    TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                    pageblockheading2.text = first;
                    emit(pageblockheading2);
                    break;
                case 3:
                    TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                    pageblockheading3.text = first;
                    emit(pageblockheading3);
                    break;
                case 4:
                    TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                    pageblockheading4.text = first;
                    emit(pageblockheading4);
                    break;
                case 5:
                    TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                    pageblockheading5.text = first;
                    emit(pageblockheading5);
                    break;
                case 6:
                    TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                    pageblockheading6.text = first;
                    emit(pageblockheading6);
                    break;
                default:
                    TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                    pageblockheader.text = first;
                    emit(pageblockheader);
                    break;
            }
        }

        @Override // org.commonmark.node.Visitor
        public void visit(Paragraph paragraph) {
            for (TL_iv.RichText richText : MarkdownParser.split(MarkdownParser.richTextOf(paragraph, null))) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = richText;
                emit(pageblockparagraph);
            }
        }

        @Override // org.commonmark.node.Visitor
        public void visit(BlockQuote blockQuote) {
            for (TL_iv.RichText richText : MarkdownParser.split(MarkdownParser.richTextOf(blockQuote, null))) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.text = richText;
                pageblockblockquote.caption = new TL_iv.textEmpty();
                emit(pageblockblockquote);
            }
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(ThematicBreak thematicBreak) {
            emit(new TL_iv.pageBlockDivider());
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(FencedCodeBlock fencedCodeBlock) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.text = MarkdownParser.first(MarkdownParser.plain(fencedCodeBlock.getLiteral()));
            pageblockpreformatted.language = fencedCodeBlock.getInfo() == null ? "" : fencedCodeBlock.getInfo();
            emit(pageblockpreformatted);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(IndentedCodeBlock indentedCodeBlock) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.text = MarkdownParser.first(MarkdownParser.plain(indentedCodeBlock.getLiteral()));
            pageblockpreformatted.language = "";
            emit(pageblockpreformatted);
        }

        @Override // org.commonmark.node.Visitor
        public void visit(BulletList bulletList) {
            TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
            for (Node firstChild = bulletList.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof ListItem) {
                    int stripCheckboxPrefix = stripCheckboxPrefix(firstChild);
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    if (stripCheckboxPrefix >= 0) {
                        tL_pageListItemText.checkbox = true;
                        tL_pageListItemText.checked = stripCheckboxPrefix == 1;
                    }
                    tL_pageListItemText.text = MarkdownParser.first(MarkdownParser.richTextOf(firstChild, pageblocklist));
                    pageblocklist.items.add(tL_pageListItemText);
                }
            }
            emit(pageblocklist);
        }

        @Override // org.commonmark.node.Visitor
        public void visit(OrderedList orderedList) {
            String valueOf;
            TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            boolean z = orderedList.getParent() instanceof Document;
            int startNumber = orderedList.getStartNumber();
            for (Node firstChild = orderedList.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof ListItem) {
                    if (!z || this.orderedMarkers.isEmpty()) {
                        valueOf = String.valueOf(startNumber);
                        startNumber++;
                    } else {
                        valueOf = (String) this.orderedMarkers.poll();
                    }
                    int stripCheckboxPrefix = stripCheckboxPrefix(firstChild);
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                    if (stripCheckboxPrefix >= 0) {
                        tL_pageListOrderedItemText.checkbox = true;
                        tL_pageListOrderedItemText.checked = stripCheckboxPrefix == 1;
                    }
                    tL_pageListOrderedItemText.num = valueOf;
                    tL_pageListOrderedItemText.text = MarkdownParser.first(MarkdownParser.richTextOf(firstChild, pageblockorderedlist));
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                }
            }
            emit(pageblockorderedlist);
        }

        private static int stripCheckboxPrefix(Node node) {
            org.commonmark.node.Text text;
            String literal;
            Node firstChild = node.getFirstChild();
            if (!(firstChild instanceof Paragraph)) {
                return -1;
            }
            Node firstChild2 = firstChild.getFirstChild();
            if ((firstChild2 instanceof org.commonmark.node.Text) && (literal = (text = (org.commonmark.node.Text) firstChild2).getLiteral()) != null) {
                int i = 3;
                if (literal.length() >= 3) {
                    int i2 = 0;
                    if (literal.charAt(0) == '[' && literal.charAt(2) == ']') {
                        char charAt = literal.charAt(1);
                        if (charAt != ' ') {
                            if (charAt != 'x' && charAt != 'X') {
                                return -1;
                            }
                            i2 = 1;
                        }
                        if (literal.length() > 3 && literal.charAt(3) == ' ') {
                            i = 4;
                        }
                        text.setLiteral(literal.substring(i));
                        return i2;
                    }
                }
            }
            return -1;
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(HtmlBlock htmlBlock) {
            String literal = htmlBlock.getLiteral();
            if (literal == null) {
                return;
            }
            try {
                this.htmlParser.processFragment(this.synth, literal);
            } catch (Throwable th) {
                FileLog.e(th);
                this.synth.append(literal);
            }
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(CustomBlock customBlock) {
            if (customBlock instanceof TableBlock) {
                emit(buildTable((TableBlock) customBlock));
            } else {
                if (customBlock instanceof JLatexMathBlock) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex());
                    emit(pageblockparagraph);
                    return;
                }
                super.visit(customBlock);
            }
        }

        private TL_iv.pageBlockTable buildTable(TableBlock tableBlock) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (Node firstChild = tableBlock.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                boolean z = firstChild instanceof TableHead;
                if (z || (firstChild instanceof TableBody)) {
                    for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNext()) {
                        if (firstChild2 instanceof TableRow) {
                            pageblocktable.rows.add(buildTableRow((TableRow) firstChild2, z));
                        }
                    }
                }
            }
            return pageblocktable;
        }

        private TL_iv.pageTableRow buildTableRow(TableRow tableRow, boolean z) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            for (Node firstChild = tableRow.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof TableCell) {
                    pagetablerow.cells.add(buildTableCell((TableCell) firstChild, z));
                }
            }
            return pagetablerow;
        }

        private TL_iv.pageTableCell buildTableCell(TableCell tableCell, boolean z) {
            TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
            pagetablecell.header = z || tableCell.isHeader();
            TableCell.Alignment alignment = tableCell.getAlignment();
            if (alignment == TableCell.Alignment.CENTER) {
                pagetablecell.align_center = true;
            } else if (alignment == TableCell.Alignment.RIGHT) {
                pagetablecell.align_right = true;
            }
            pagetablecell.text = MarkdownParser.first(MarkdownParser.richTextOf(tableCell, null));
            pagetablecell.flags |= 128;
            return pagetablecell;
        }
    }

    public static class RichTextParser extends AbstractVisitor {
        private final TL_iv.PageBlock block;
        private int blockDepth;
        private TL_iv.textConcat current = new TL_iv.textConcat();

        public RichTextParser(TL_iv.PageBlock pageBlock) {
            this.block = pageBlock;
        }

        @Override // org.commonmark.node.Visitor
        public void visit(BlockQuote blockQuote) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(blockQuote);
            } finally {
                this.blockDepth--;
            }
        }

        @Override // org.commonmark.node.Visitor
        public void visit(BulletList bulletList) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(bulletList);
            } finally {
                this.blockDepth--;
            }
        }

        @Override // org.commonmark.node.Visitor
        public void visit(OrderedList orderedList) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(orderedList);
            } finally {
                this.blockDepth--;
            }
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(ListItem listItem) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(listItem);
            } finally {
                this.blockDepth--;
            }
        }

        public TL_iv.RichText getText() {
            return collapse(this.current);
        }

        private static TL_iv.RichText collapse(TL_iv.textConcat textconcat) {
            return textconcat.texts.isEmpty() ? new TL_iv.textEmpty() : textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
        }

        private void append(TL_iv.RichText richText) {
            this.current.texts.add(richText);
        }

        private TL_iv.RichText collectChildren(Node node) {
            TL_iv.textConcat textconcat = this.current;
            this.current = new TL_iv.textConcat();
            visitChildren(node);
            TL_iv.RichText collapse = collapse(this.current);
            this.current = textconcat;
            return collapse;
        }

        @Override // org.commonmark.node.Visitor
        public void visit(Paragraph paragraph) {
            if (!this.current.texts.isEmpty()) {
                append(MarkdownParser.plain("\n\n"));
            }
            visitChildren(paragraph);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(org.commonmark.node.Text text) {
            append(MarkdownParser.plain(text.getLiteral()));
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Emphasis emphasis) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = collectChildren(emphasis);
            append(textitalic);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(StrongEmphasis strongEmphasis) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = collectChildren(strongEmphasis);
            append(textbold);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Code code) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = MarkdownParser.plain(code.getLiteral());
            append(textfixed);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Link link) {
            String trim = (link.getDestination() == null ? "" : link.getDestination()).trim();
            if (trim.startsWith("mailto:")) {
                TL_iv.RichText textemail = new TL_iv.textEmail();
                textemail.text = collectChildren(link);
                textemail.email = trim.substring(7);
                append(textemail);
                return;
            }
            if (trim.startsWith("tel:")) {
                TL_iv.textPhone textphone = new TL_iv.textPhone();
                textphone.text = collectChildren(link);
                textphone.phone = trim.substring(4);
                append(textphone);
                return;
            }
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = collectChildren(link);
            texturl.url = trim;
            append(texturl);
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(Image image) {
            append(collectChildren(image));
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(HardLineBreak hardLineBreak) {
            append(MarkdownParser.plain("\n"));
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(SoftLineBreak softLineBreak) {
            append(MarkdownParser.plain(this.block instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(HtmlInline htmlInline) {
            append(MarkdownParser.plain(htmlInline.getLiteral()));
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(CustomNode customNode) {
            if (customNode instanceof Strikethrough) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = collectChildren(customNode);
                append(textstrike);
            } else if (customNode instanceof JLatexMathNode) {
                append(MarkdownParser.makeLatex(((JLatexMathNode) customNode).latex()));
            } else {
                super.visit(customNode);
            }
        }

        @Override // org.commonmark.node.AbstractVisitor, org.commonmark.node.Visitor
        public void visit(CustomBlock customBlock) {
            if (customBlock instanceof JLatexMathBlock) {
                if (!this.current.texts.isEmpty()) {
                    append(MarkdownParser.plain("\n"));
                }
                append(MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex()));
                append(MarkdownParser.plain("\n"));
                return;
            }
            super.visit(customBlock);
        }
    }
}
