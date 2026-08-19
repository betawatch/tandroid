package io.noties.markwon.html;

import io.noties.markwon.html.HtmlTagImpl;
import io.noties.markwon.html.MarkwonHtmlParser;
import io.noties.markwon.html.jsoup.nodes.Attribute;
import io.noties.markwon.html.jsoup.nodes.Attributes;
import io.noties.markwon.html.jsoup.parser.CharacterReader;
import io.noties.markwon.html.jsoup.parser.ParseErrorList;
import io.noties.markwon.html.jsoup.parser.Token;
import io.noties.markwon.html.jsoup.parser.Tokeniser;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class MarkwonHtmlParserImpl extends MarkwonHtmlParser {
    private final HtmlEmptyTagReplacement emptyTagReplacement;
    private boolean isInsidePreTag;
    private boolean previousIsBlock;
    private final TrimmingAppender trimmingAppender;
    static final Set INLINE_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    private static final Set VOID_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));
    private static final Set BLOCK_TAGS = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", MediaStreamTrack.VIDEO_TRACK_KIND)));
    private final List inlineTags = new ArrayList(0);
    private HtmlTagImpl.BlockImpl currentBlock = HtmlTagImpl.BlockImpl.root();

    public static MarkwonHtmlParserImpl create() {
        return create(HtmlEmptyTagReplacement.create());
    }

    public static MarkwonHtmlParserImpl create(HtmlEmptyTagReplacement htmlEmptyTagReplacement) {
        return new MarkwonHtmlParserImpl(htmlEmptyTagReplacement, TrimmingAppender.create());
    }

    MarkwonHtmlParserImpl(HtmlEmptyTagReplacement htmlEmptyTagReplacement, TrimmingAppender trimmingAppender) {
        this.emptyTagReplacement = htmlEmptyTagReplacement;
        this.trimmingAppender = trimmingAppender;
    }

    @Override // io.noties.markwon.html.MarkwonHtmlParser
    public void processFragment(Appendable appendable, String str) {
        Tokeniser tokeniser = new Tokeniser(new CharacterReader(str), ParseErrorList.noTracking());
        while (true) {
            Token read = tokeniser.read();
            Token.TokenType tokenType = read.type;
            if (Token.TokenType.EOF == tokenType) {
                return;
            }
            int i = 1.$SwitchMap$io$noties$markwon$html$jsoup$parser$Token$TokenType[tokenType.ordinal()];
            if (i == 1) {
                Token.StartTag startTag = (Token.StartTag) read;
                if (isInlineTag(startTag.normalName)) {
                    processInlineTagStart(appendable, startTag);
                } else {
                    processBlockTagStart(appendable, startTag);
                }
            } else if (i == 2) {
                Token.EndTag endTag = (Token.EndTag) read;
                if (isInlineTag(endTag.normalName)) {
                    processInlineTagEnd(appendable, endTag);
                } else {
                    processBlockTagEnd(appendable, endTag);
                }
            } else if (i == 3) {
                processCharacter(appendable, (Token.Character) read);
            }
            read.reset();
        }
    }

    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$io$noties$markwon$html$jsoup$parser$Token$TokenType;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            $SwitchMap$io$noties$markwon$html$jsoup$parser$Token$TokenType = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$noties$markwon$html$jsoup$parser$Token$TokenType[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$noties$markwon$html$jsoup$parser$Token$TokenType[Token.TokenType.Character.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // io.noties.markwon.html.MarkwonHtmlParser
    public void flushInlineTags(int i, MarkwonHtmlParser.FlushAction flushAction) {
        if (this.inlineTags.size() > 0) {
            if (i > -1) {
                Iterator it = this.inlineTags.iterator();
                while (it.hasNext()) {
                    ((HtmlTagImpl.InlineImpl) it.next()).closeAt(i);
                }
            }
            flushAction.apply(DesugarCollections.unmodifiableList(this.inlineTags));
            this.inlineTags.clear();
            return;
        }
        flushAction.apply(Collections.EMPTY_LIST);
    }

    @Override // io.noties.markwon.html.MarkwonHtmlParser
    public void flushBlockTags(int i, MarkwonHtmlParser.FlushAction flushAction) {
        HtmlTagImpl.BlockImpl blockImpl = this.currentBlock;
        while (true) {
            HtmlTagImpl.BlockImpl blockImpl2 = blockImpl.parent;
            if (blockImpl2 == null) {
                break;
            } else {
                blockImpl = blockImpl2;
            }
        }
        if (i > -1) {
            blockImpl.closeAt(i);
        }
        List children = blockImpl.children();
        if (children.size() > 0) {
            flushAction.apply(children);
        } else {
            flushAction.apply(Collections.EMPTY_LIST);
        }
        this.currentBlock = HtmlTagImpl.BlockImpl.root();
    }

    protected void processInlineTagStart(Appendable appendable, Token.StartTag startTag) {
        String str = startTag.normalName;
        CharSequence charSequence = (CharSequence) appendable;
        HtmlTagImpl.InlineImpl inlineImpl = new HtmlTagImpl.InlineImpl(str, charSequence.length(), extractAttributes(startTag));
        ensureNewLineIfPreviousWasBlock(appendable);
        if (isVoidTag(str) || startTag.selfClosing) {
            String replace = this.emptyTagReplacement.replace(inlineImpl);
            if (replace != null && replace.length() > 0) {
                AppendableUtils.appendQuietly(appendable, replace);
            }
            inlineImpl.closeAt(charSequence.length());
        }
        this.inlineTags.add(inlineImpl);
    }

    protected void processInlineTagEnd(Appendable appendable, Token.EndTag endTag) {
        HtmlTagImpl.InlineImpl findOpenInlineTag = findOpenInlineTag(endTag.normalName);
        if (findOpenInlineTag != null) {
            if (isEmpty(appendable, findOpenInlineTag)) {
                appendEmptyTagReplacement(appendable, findOpenInlineTag);
            }
            findOpenInlineTag.closeAt(((CharSequence) appendable).length());
        }
    }

    protected void processBlockTagStart(Appendable appendable, Token.StartTag startTag) {
        String str = startTag.normalName;
        if ("p".equals(this.currentBlock.name)) {
            this.currentBlock.closeAt(((CharSequence) appendable).length());
            AppendableUtils.appendQuietly(appendable, '\n');
            this.currentBlock = this.currentBlock.parent;
        } else if ("li".equals(str) && "li".equals(this.currentBlock.name)) {
            this.currentBlock.closeAt(((CharSequence) appendable).length());
            this.currentBlock = this.currentBlock.parent;
        }
        if (isBlockTag(str)) {
            this.isInsidePreTag = "pre".equals(str);
            ensureNewLine(appendable);
        } else {
            ensureNewLineIfPreviousWasBlock(appendable);
        }
        CharSequence charSequence = (CharSequence) appendable;
        HtmlTagImpl.BlockImpl create = HtmlTagImpl.BlockImpl.create(str, charSequence.length(), extractAttributes(startTag), this.currentBlock);
        boolean z = isVoidTag(str) || startTag.selfClosing;
        if (z) {
            String replace = this.emptyTagReplacement.replace(create);
            if (replace != null && replace.length() > 0) {
                AppendableUtils.appendQuietly(appendable, replace);
            }
            create.closeAt(charSequence.length());
        }
        appendBlockChild(create.parent, create);
        if (z) {
            return;
        }
        this.currentBlock = create;
    }

    protected void processBlockTagEnd(Appendable appendable, Token.EndTag endTag) {
        String str = endTag.normalName;
        HtmlTagImpl.BlockImpl findOpenBlockTag = findOpenBlockTag(str);
        if (findOpenBlockTag != null) {
            if ("pre".equals(str)) {
                this.isInsidePreTag = false;
            }
            if (isEmpty(appendable, findOpenBlockTag)) {
                appendEmptyTagReplacement(appendable, findOpenBlockTag);
            }
            findOpenBlockTag.closeAt(((CharSequence) appendable).length());
            if (!findOpenBlockTag.isEmpty()) {
                this.previousIsBlock = isBlockTag(findOpenBlockTag.name);
            }
            if ("p".equals(str)) {
                AppendableUtils.appendQuietly(appendable, '\n');
            }
            this.currentBlock = findOpenBlockTag.parent;
        }
    }

    protected void processCharacter(Appendable appendable, Token.Character character) {
        if (this.isInsidePreTag) {
            AppendableUtils.appendQuietly(appendable, character.getData());
        } else {
            ensureNewLineIfPreviousWasBlock(appendable);
            this.trimmingAppender.append(appendable, character.getData());
        }
    }

    protected void appendBlockChild(HtmlTagImpl.BlockImpl blockImpl, HtmlTagImpl.BlockImpl blockImpl2) {
        List list = blockImpl.children;
        if (list == null) {
            list = new ArrayList(2);
            blockImpl.children = list;
        }
        list.add(blockImpl2);
    }

    protected HtmlTagImpl.InlineImpl findOpenInlineTag(String str) {
        int size = this.inlineTags.size();
        while (true) {
            size--;
            if (size <= -1) {
                return null;
            }
            HtmlTagImpl.InlineImpl inlineImpl = (HtmlTagImpl.InlineImpl) this.inlineTags.get(size);
            if (str.equals(inlineImpl.name) && inlineImpl.end < 0) {
                return inlineImpl;
            }
        }
    }

    protected HtmlTagImpl.BlockImpl findOpenBlockTag(String str) {
        HtmlTagImpl.BlockImpl blockImpl = this.currentBlock;
        while (blockImpl != null && !str.equals(blockImpl.name) && !blockImpl.isClosed()) {
            blockImpl = blockImpl.parent;
        }
        return blockImpl;
    }

    protected void ensureNewLineIfPreviousWasBlock(Appendable appendable) {
        if (this.previousIsBlock) {
            ensureNewLine(appendable);
            this.previousIsBlock = false;
        }
    }

    protected static boolean isInlineTag(String str) {
        return INLINE_TAGS.contains(str);
    }

    protected static boolean isVoidTag(String str) {
        return VOID_TAGS.contains(str);
    }

    protected static boolean isBlockTag(String str) {
        return BLOCK_TAGS.contains(str);
    }

    protected static void ensureNewLine(Appendable appendable) {
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        if (length <= 0 || '\n' == charSequence.charAt(length - 1)) {
            return;
        }
        AppendableUtils.appendQuietly(appendable, '\n');
    }

    protected static Map extractAttributes(Token.StartTag startTag) {
        Attributes attributes = startTag.attributes;
        int size = attributes.size();
        if (size > 0) {
            HashMap hashMap = new HashMap(size);
            Iterator it = attributes.iterator();
            while (it.hasNext()) {
                Attribute attribute = (Attribute) it.next();
                hashMap.put(attribute.getKey().toLowerCase(Locale.US), attribute.getValue());
            }
            return DesugarCollections.unmodifiableMap(hashMap);
        }
        return Collections.EMPTY_MAP;
    }

    protected static boolean isEmpty(Appendable appendable, HtmlTagImpl htmlTagImpl) {
        return htmlTagImpl.start == ((CharSequence) appendable).length();
    }

    protected void appendEmptyTagReplacement(Appendable appendable, HtmlTagImpl htmlTagImpl) {
        String replace = this.emptyTagReplacement.replace(htmlTagImpl);
        if (replace != null) {
            AppendableUtils.appendQuietly(appendable, replace);
        }
    }
}
