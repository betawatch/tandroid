package org.telegram.ui.iv;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public abstract class RichHtml {
    private static boolean isWs(char c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    public static String serialize(List list, int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        ListState listState = new ListState();
        serializeRange(sb, list, new int[]{i}, i2, i, i2, i3, i4, listState, false);
        listState.closeAll(sb);
        return sb.toString();
    }

    private static class ListState {
        final ArrayList stack;

        private ListState() {
            this.stack = new ArrayList();
        }

        void sync(StringBuilder sb, int i, boolean z) {
            while (this.stack.size() > i) {
                close(sb);
            }
            while (this.stack.size() < i) {
                open(sb, z);
            }
            if (this.stack.isEmpty()) {
                return;
            }
            if (((Boolean) this.stack.get(this.stack.size() - 1)).booleanValue() != z) {
                close(sb);
                open(sb, z);
            }
        }

        private void open(StringBuilder sb, boolean z) {
            sb.append(z ? "<ol>" : "<ul>");
            this.stack.add(Boolean.valueOf(z));
        }

        private void close(StringBuilder sb) {
            ArrayList arrayList = this.stack;
            sb.append(((Boolean) arrayList.remove(arrayList.size() + (-1))).booleanValue() ? "</ol>" : "</ul>");
        }

        void closeAll(StringBuilder sb) {
            while (!this.stack.isEmpty()) {
                close(sb);
            }
        }
    }

    private static void serializeRange(StringBuilder sb, List list, int[] iArr, int i, int i2, int i3, int i4, int i5, ListState listState, boolean z) {
        while (true) {
            int i6 = iArr[0];
            if (i6 > i) {
                return;
            }
            BlockRow blockRow = (BlockRow) list.get(i6);
            if (blockRow.detailsEnd) {
                if (z) {
                    return;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            } else if (RichEditorListView.isDetailsHeader(blockRow)) {
                listState.closeAll(sb);
                serializeDetails(sb, list, iArr, i, i2, i3, i4, i5);
            } else if (blockRow.level > 0 && isTextBlock(blockRow.block)) {
                listState.sync(sb, blockRow.level, blockRow.num > 0);
                sb.append("<li>");
                appendInline(sb, slicedStyled(blockRow, iArr[0], i2, i3, i4, i5));
                sb.append("</li>");
                iArr[0] = iArr[0] + 1;
            } else {
                listState.closeAll(sb);
                serializeLeaf(sb, blockRow, iArr[0], i2, i3, i4, i5);
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    private static void serializeDetails(StringBuilder sb, List list, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BlockRow blockRow = (BlockRow) list.get(iArr[0]);
        sb.append(((TL_iv.pageBlockDetails) blockRow.block).open ? "<details open>" : "<details>");
        sb.append("<summary>");
        appendInline(sb, slicedStyled(blockRow, iArr[0], i2, i3, i4, i5));
        sb.append("</summary>");
        iArr[0] = iArr[0] + 1;
        ListState listState = new ListState();
        serializeRange(sb, list, iArr, i, i2, i3, i4, i5, listState, true);
        listState.closeAll(sb);
        int i6 = iArr[0];
        if (i6 <= i && i6 < list.size() && ((BlockRow) list.get(iArr[0])).detailsEnd) {
            iArr[0] = iArr[0] + 1;
        }
        sb.append("</details>");
    }

    private static void serializeLeaf(StringBuilder sb, BlockRow blockRow, int i, int i2, int i3, int i4, int i5) {
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            sb.append("<hr>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            serializeTable(sb, (TL_iv.pageBlockTable) pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            serializeSingleMedia(sb, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, blockRow.media, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            serializeSingleMedia(sb, MediaStreamTrack.VIDEO_TRACK_KIND, ((TL_iv.pageBlockVideo) pageBlock).video_id, blockRow.media, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            serializeSingleMedia(sb, MediaStreamTrack.AUDIO_TRACK_KIND, ((TL_iv.pageBlockAudio) pageBlock).audio_id, blockRow.media, pageBlock);
            return;
        }
        if (RichEditorListView.isGallery(pageBlock)) {
            serializeGallery(sb, pageBlock, blockRow);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            serializeMap(sb, (TL_iv.pageBlockMap) pageBlock);
            return;
        }
        String blockTag = blockTag(pageBlock);
        if (blockTag == null) {
            CharSequence captionOf = captionOf(pageBlock);
            if (captionOf == null || captionOf.length() <= 0) {
                return;
            }
            sb.append("<p>");
            appendInline(sb, captionOf);
            sb.append("</p>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            if (!TextUtils.isEmpty(str)) {
                sb.append("<pre lang=\"");
                sb.append(escapeAttr(str));
                sb.append("\">");
            } else {
                sb.append("<pre>");
            }
            appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
            sb.append("</pre>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            sb.append("<blockquote class=\"pull\">");
            appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
            sb.append("</blockquote>");
            return;
        }
        sb.append('<');
        sb.append(blockTag);
        sb.append('>');
        appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
        sb.append("</");
        sb.append(blockTag);
        sb.append('>');
    }

    private static CharSequence slicedStyled(BlockRow blockRow, int i, int i2, int i3, int i4, int i5) {
        CharSequence readStyledText;
        if (RichEditorListView.isDetailsHeader(blockRow)) {
            readStyledText = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title);
        } else {
            readStyledText = RichTextCell.readStyledText(blockRow.block);
        }
        if (readStyledText == null) {
            readStyledText = "";
        }
        int length = readStyledText.length();
        int max = i == i2 ? Math.max(0, Math.min(i4, length)) : 0;
        int max2 = i == i3 ? Math.max(0, Math.min(i5, length)) : length;
        if (max > max2) {
            int i6 = max;
            max = max2;
            max2 = i6;
        }
        return (max == 0 && max2 == length) ? readStyledText : readStyledText.subSequence(max, max2);
    }

    private static boolean isTextBlock(TL_iv.PageBlock pageBlock) {
        return blockTag(pageBlock) != null;
    }

    private static String blockTag(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    private static CharSequence captionOf(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        CharSequence spannable;
        if (pageBlock == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null || (spannable = RichTextStyle.toSpannable(richText)) == null || spannable.length() <= 0) {
            return null;
        }
        return spannable;
    }

    private static void serializeTable(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb.append("<table");
        if (pageblocktable.bordered) {
            sb.append(" border=\"1\"");
        }
        if (pageblocktable.striped) {
            sb.append(" class=\"striped\"");
        }
        sb.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        CharSequence spannable = richText != null ? RichTextStyle.toSpannable(richText) : null;
        if (spannable != null && spannable.length() > 0) {
            sb.append("<caption>");
            appendInline(sb, spannable);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            Iterator<TL_iv.pageTableRow> it = arrayList2.iterator();
            while (it.hasNext()) {
                TL_iv.pageTableRow next = it.next();
                sb.append("<tr>");
                if (next != null && (arrayList = next.cells) != null) {
                    Iterator<TL_iv.pageTableCell> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        TL_iv.pageTableCell next2 = it2.next();
                        if (next2 != null) {
                            String str = next2.header ? "th" : "td";
                            sb.append('<');
                            sb.append(str);
                            int i = next2.colspan;
                            if (i <= 1) {
                                i = 0;
                            }
                            if (i > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i);
                                sb.append('\"');
                            }
                            int i2 = next2.rowspan;
                            int i3 = i2 > 1 ? i2 : 0;
                            if (i3 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            String str2 = next2.align_right ? "right" : next2.align_center ? "center" : null;
                            if (str2 != null) {
                                sb.append(" align=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            String str3 = next2.valign_bottom ? "bottom" : next2.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb.append(" valign=\"");
                                sb.append(str3);
                                sb.append('\"');
                            }
                            sb.append('>');
                            appendInline(sb, TableModel.readStyledText(next2));
                            sb.append("</");
                            sb.append(str);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    private static void serializeSingleMedia(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
        if (j == 0) {
            return;
        }
        CharSequence captionOf = captionOf(pageBlock);
        boolean z = captionOf != null && captionOf.length() > 0;
        if (z) {
            sb.append("<figure>");
        }
        appendMediaTag(sb, str, j, mediaUploadState, pageBlock);
        if (z) {
            sb.append("<figcaption>");
            appendInline(sb, captionOf);
            sb.append("</figcaption></figure>");
        }
    }

    private static void appendMediaTag(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
        sb.append('<');
        sb.append(str);
        sb.append(" src=\"");
        sb.append(j);
        sb.append('\"');
        if (mediaUploadState != null) {
            if (mediaUploadState.width > 0) {
                sb.append(" width=\"");
                sb.append(mediaUploadState.width);
                sb.append('\"');
            }
            if (mediaUploadState.height > 0) {
                sb.append(" height=\"");
                sb.append(mediaUploadState.height);
                sb.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        sb.append(" />");
    }

    private static void serializeGallery(StringBuilder sb, TL_iv.PageBlock pageBlock, BlockRow blockRow) {
        String str = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
        sb.append("<div class=\"");
        sb.append(str);
        sb.append("\">");
        ArrayList galleryItems = RichEditorListView.galleryItems(pageBlock);
        if (galleryItems != null) {
            int i = 0;
            while (i < galleryItems.size()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) galleryItems.get(i);
                ArrayList arrayList = blockRow.medias;
                MediaUploadState mediaUploadState = (arrayList == null || i >= arrayList.size()) ? null : (MediaUploadState) blockRow.medias.get(i);
                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                    long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                    if (j != 0) {
                        appendMediaTag(sb, MediaStreamTrack.VIDEO_TRACK_KIND, j, mediaUploadState, pageBlock2);
                    }
                } else if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                    long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                    if (j2 != 0) {
                        appendMediaTag(sb, "img", j2, mediaUploadState, pageBlock2);
                    }
                }
                i++;
            }
        }
        CharSequence captionOf = captionOf(pageBlock);
        if (captionOf != null && captionOf.length() > 0) {
            sb.append("<figcaption>");
            appendInline(sb, captionOf);
            sb.append("</figcaption>");
        }
        sb.append("</div>");
    }

    private static void serializeMap(StringBuilder sb, TL_iv.pageBlockMap pageblockmap) {
        CharSequence captionOf = captionOf(pageblockmap);
        boolean z = captionOf != null && captionOf.length() > 0;
        if (z) {
            sb.append("<figure>");
        }
        sb.append("<location");
        if (pageblockmap.geo != null) {
            sb.append(" lat=\"");
            sb.append(pageblockmap.geo.lat);
            sb.append('\"');
            sb.append(" long=\"");
            sb.append(pageblockmap.geo._long);
            sb.append('\"');
            if (pageblockmap.geo.access_hash != 0) {
                sb.append(" access=\"");
                sb.append(pageblockmap.geo.access_hash);
                sb.append('\"');
            }
        }
        if (pageblockmap.zoom != 0) {
            sb.append(" zoom=\"");
            sb.append(pageblockmap.zoom);
            sb.append('\"');
        }
        if (pageblockmap.w != 0) {
            sb.append(" w=\"");
            sb.append(pageblockmap.w);
            sb.append('\"');
        }
        if (pageblockmap.h != 0) {
            sb.append(" h=\"");
            sb.append(pageblockmap.h);
            sb.append('\"');
        }
        sb.append(" />");
        if (z) {
            sb.append("<figcaption>");
            appendInline(sb, captionOf);
            sb.append("</figcaption></figure>");
        }
    }

    private static void appendInline(StringBuilder sb, CharSequence charSequence) {
        long j;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (!(charSequence instanceof Spanned)) {
            escape(sb, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i, length, CharacterStyle.class);
            int i2 = 0;
            for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spanned.getSpans(i, nextSpanTransition, TextStyleSpan.class)) {
                TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.getTextStyleRun();
                if (textStyleRun != null) {
                    i2 |= textStyleRun.flags;
                }
            }
            URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i, nextSpanTransition, URLSpanReplacement.class);
            String url = uRLSpanReplacementArr.length > 0 ? uRLSpanReplacementArr[0].getURL() : null;
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, nextSpanTransition, AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr.length > 0) {
                AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[0];
                if (!animatedEmojiSpan.standard) {
                    j = animatedEmojiSpan.getDocumentId();
                    openInline(sb, i2, url, j);
                    escape(sb, charSequence, i, nextSpanTransition);
                    closeInline(sb, i2, url, j);
                    i = nextSpanTransition;
                }
            }
            j = 0;
            openInline(sb, i2, url, j);
            escape(sb, charSequence, i, nextSpanTransition);
            closeInline(sb, i2, url, j);
            i = nextSpanTransition;
        }
    }

    private static void openInline(StringBuilder sb, int i, String str, long j) {
        if ((i & 256) != 0) {
            sb.append("<spoiler>");
        }
        if ((i & 1) != 0) {
            sb.append("<b>");
        }
        if ((i & 2) != 0) {
            sb.append("<i>");
        }
        if ((i & 16) != 0) {
            sb.append("<u>");
        }
        if ((i & 8) != 0) {
            sb.append("<s>");
        }
        if ((i & 4) != 0) {
            sb.append("<code>");
        }
        if ((i & 16384) != 0) {
            sb.append("<sub>");
        }
        if ((i & 32768) != 0) {
            sb.append("<sup>");
        }
        if (str != null) {
            sb.append("<a href=\"");
            sb.append(escapeAttr(str));
            sb.append("\">");
        }
        if (j != 0) {
            sb.append("<animated-emoji data-document-id=\"");
            sb.append(j);
            sb.append("\">");
        }
    }

    private static void closeInline(StringBuilder sb, int i, String str, long j) {
        if (j != 0) {
            sb.append("</animated-emoji>");
        }
        if (str != null) {
            sb.append("</a>");
        }
        if ((32768 & i) != 0) {
            sb.append("</sup>");
        }
        if ((i & 16384) != 0) {
            sb.append("</sub>");
        }
        if ((i & 4) != 0) {
            sb.append("</code>");
        }
        if ((i & 8) != 0) {
            sb.append("</s>");
        }
        if ((i & 16) != 0) {
            sb.append("</u>");
        }
        if ((i & 2) != 0) {
            sb.append("</i>");
        }
        if ((i & 1) != 0) {
            sb.append("</b>");
        }
        if ((i & 256) != 0) {
            sb.append("</spoiler>");
        }
    }

    private static void escape(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\n') {
                sb.append("<br>");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(charAt);
            }
            i++;
        }
    }

    private static String escapeAttr(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static List parse(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        parseBlocks(new Parser(str).parse(), arrayList, 0);
        if (arrayList.isEmpty()) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        return arrayList;
    }

    private static void parseBlocks(List list, ArrayList arrayList, int i) {
        Iterator it = list.iterator();
        SpannableStringBuilder spannableStringBuilder = null;
        while (it.hasNext()) {
            Node node = (Node) it.next();
            if (node.isText) {
                if (!isBlank(node.text)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) decode(node.text));
                }
            } else {
                String str = node.tag;
                if (isInlineTag(str)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    appendInlineNode(spannableStringBuilder, node, 0, null, 0L);
                } else {
                    spannableStringBuilder = flushParagraph(arrayList, spannableStringBuilder, i);
                    str.hashCode();
                    switch (str) {
                        case "summary":
                            addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                            break;
                        case "figure":
                            parseFigure(node, arrayList, i);
                            break;
                        case "footer":
                            addText(arrayList, new TL_iv.pageBlockFooter(), node, i);
                            break;
                        case "p":
                            addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                            break;
                        case "h1":
                            addText(arrayList, new TL_iv.pageBlockHeading1(), node, i);
                            break;
                        case "h2":
                            addText(arrayList, new TL_iv.pageBlockHeading2(), node, i);
                            break;
                        case "h3":
                            addText(arrayList, new TL_iv.pageBlockHeading3(), node, i);
                            break;
                        case "h4":
                            addText(arrayList, new TL_iv.pageBlockHeading4(), node, i);
                            break;
                        case "h5":
                            addText(arrayList, new TL_iv.pageBlockHeading5(), node, i);
                            break;
                        case "h6":
                            addText(arrayList, new TL_iv.pageBlockHeading6(), node, i);
                            break;
                        case "hr":
                            arrayList.add(new BlockRow(new TL_iv.pageBlockDivider()));
                            break;
                        case "ol":
                        case "ul":
                            parseList(node, arrayList, i, "ol".equals(str));
                            break;
                        case "td":
                        case "th":
                        case "tr":
                        case "tbody":
                        case "thead":
                            parseBlocks(node.children, arrayList, i);
                            break;
                        case "div":
                            String attr = node.attr("class");
                            String lowerCase = attr == null ? "" : attr.toLowerCase();
                            if (lowerCase.contains("collage")) {
                                addRow(arrayList, parseGallery(node, false));
                                break;
                            } else if (lowerCase.contains("slideshow")) {
                                addRow(arrayList, parseGallery(node, true));
                                break;
                            } else {
                                addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                                break;
                            }
                        case "img":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "pre":
                            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                            pageblockpreformatted.language = node.attr("lang");
                            addText(arrayList, pageblockpreformatted, node, i);
                            break;
                        case "audio":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "table":
                            arrayList.add(parseTable(node));
                            break;
                        case "video":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "blockquote":
                            addText(arrayList, hasPullClass(node) ? new TL_iv.pageBlockPullquote() : new TL_iv.pageBlockBlockquote(), node, i);
                            break;
                        case "details":
                            parseDetails(node, arrayList, i);
                            break;
                        case "location":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        default:
                            if (!node.children.isEmpty()) {
                                parseBlocks(node.children, arrayList, i);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        flushParagraph(arrayList, spannableStringBuilder, i);
    }

    private static SpannableStringBuilder flushParagraph(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder == null || isBlank(spannableStringBuilder.toString())) {
            return null;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageblockparagraph, i, 0));
        return null;
    }

    private static void addText(ArrayList arrayList, TL_iv.PageBlock pageBlock, Node node, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInline(spannableStringBuilder, node, 0, null, 0L);
        RichTextCell.applyStyledTextToBlock(pageBlock, trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageBlock, i, 0));
    }

    private static void addRow(ArrayList arrayList, BlockRow blockRow) {
        if (blockRow != null) {
            arrayList.add(blockRow);
        }
    }

    private static CharSequence inlineOf(Node node) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInline(spannableStringBuilder, node, 0, null, 0L);
        return trim(spannableStringBuilder);
    }

    private static BlockRow parseTable(Node node) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        pageblocktable.bordered = node.has("border");
        String attr = node.attr("class");
        pageblocktable.striped = attr != null && attr.toLowerCase().contains("striped");
        collectTableRows(node, pageblocktable);
        if (pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
            pagetablerow.cells = arrayList;
            arrayList.add(TableModel.newEmptyCell());
            pageblocktable.rows.add(pagetablerow);
        }
        return new BlockRow(pageblocktable);
    }

    private static void collectTableRows(Node node, TL_iv.pageBlockTable pageblocktable) {
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText) {
                String str = node2.tag;
                str.hashCode();
                switch (str) {
                    case "tr":
                        pageblocktable.rows.add(parseTableRow(node2));
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        collectTableRows(node2, pageblocktable);
                        break;
                    case "caption":
                        pageblocktable.title = RichTextStyle.fromSpannable(inlineOf(node2));
                        break;
                }
            }
        }
    }

    private static TL_iv.pageTableRow parseTableRow(Node node) {
        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
        pagetablerow.cells = new ArrayList<>();
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText && ("td".equals(node2.tag) || "th".equals(node2.tag))) {
                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                pagetablecell.colspan = parseIntAttr(node2.attr("colspan"), 0);
                pagetablecell.rowspan = parseIntAttr(node2.attr("rowspan"), 0);
                TableModel.applyStyledText(pagetablecell, inlineOf(node2));
                TableModel.setHeader(pagetablecell, "th".equals(node2.tag) || node2.has("header"));
                String attr = node2.attr("align");
                if (attr == null) {
                    attr = alignFromStyle(node2.attr("style"));
                }
                if ("center".equalsIgnoreCase(attr)) {
                    TableModel.setAlign(pagetablecell, 1);
                } else if ("right".equalsIgnoreCase(attr)) {
                    TableModel.setAlign(pagetablecell, 2);
                }
                String attr2 = node2.attr("valign");
                if ("middle".equalsIgnoreCase(attr2)) {
                    TableModel.setVAlign(pagetablecell, 1);
                } else if ("bottom".equalsIgnoreCase(attr2)) {
                    TableModel.setVAlign(pagetablecell, 2);
                }
                pagetablerow.cells.add(pagetablecell);
            }
        }
        if (pagetablerow.cells.isEmpty()) {
            pagetablerow.cells.add(TableModel.newEmptyCell());
        }
        return pagetablerow;
    }

    private static String alignFromStyle(String str) {
        String lowerCase;
        int indexOf;
        if (str == null || (indexOf = (lowerCase = str.toLowerCase()).indexOf("text-align")) < 0) {
            return null;
        }
        if (lowerCase.indexOf("center", indexOf) >= 0) {
            return "center";
        }
        if (lowerCase.indexOf("right", indexOf) >= 0) {
            return "right";
        }
        return null;
    }

    private static BlockRow buildMediaRow(Node node) {
        String str = node.tag;
        str.hashCode();
        switch (str) {
            case "div":
                String attr = node.attr("class");
                String lowerCase = attr == null ? "" : attr.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return parseGallery(node, true);
                }
                if (lowerCase.contains("collage")) {
                    return parseGallery(node, false);
                }
                return null;
            case "img":
                return buildPhotoOrVideo(node, false);
            case "audio":
                return buildAudio(node);
            case "video":
                return buildPhotoOrVideo(node, true);
            case "location":
                return buildMap(node);
            default:
                return null;
        }
    }

    private static BlockRow buildPhotoOrVideo(Node node, boolean z) {
        long parseLongAttr = parseLongAttr(node.attr("src"), 0L);
        if (parseLongAttr <= 0) {
            return null;
        }
        TL_iv.PageBlock newMediaItemBlock = newMediaItemBlock(z, parseLongAttr, node.has("data-spoiler"));
        setEmptyCaption(newMediaItemBlock);
        return new BlockRow(newMediaItemBlock);
    }

    private static BlockRow buildAudio(Node node) {
        long parseLongAttr = parseLongAttr(node.attr("src"), 0L);
        if (parseLongAttr <= 0) {
            return null;
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        pageblockaudio.audio_id = parseLongAttr;
        setEmptyCaption(pageblockaudio);
        return new BlockRow(pageblockaudio);
    }

    private static BlockRow buildMap(Node node) {
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_geoPoint.lat = parseDoubleAttr(node.attr("lat"), 0.0d);
        tL_geoPoint._long = parseDoubleAttr(node.attr("long"), 0.0d);
        tL_geoPoint.access_hash = parseLongAttr(node.attr("access"), 0L);
        pageblockmap.geo = tL_geoPoint;
        pageblockmap.zoom = parseIntAttr(node.attr("zoom"), 15);
        pageblockmap.w = parseIntAttr(node.attr("w"), 600);
        pageblockmap.h = parseIntAttr(node.attr("h"), 400);
        setEmptyCaption(pageblockmap);
        return new BlockRow(pageblockmap);
    }

    private static TL_iv.PageBlock newMediaItemBlock(boolean z, long j, boolean z2) {
        if (z) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j <= 0) {
                j = 0;
            }
            pageblockvideo.video_id = j;
            pageblockvideo.spoiler = z2;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j <= 0) {
            j = 0;
        }
        pageblockphoto.photo_id = j;
        pageblockphoto.spoiler = z2;
        return pageblockphoto;
    }

    private static BlockRow parseGallery(Node node, boolean z) {
        TL_iv.PageBlock pageblockslideshow = z ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList galleryItems = RichEditorListView.galleryItems(pageblockslideshow);
        Iterator it = node.children.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText) {
                if ("figcaption".equals(node2.tag)) {
                    charSequence = inlineOf(node2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(node2.tag);
                    if (equals || "img".equals(node2.tag)) {
                        long parseLongAttr = parseLongAttr(node2.attr("src"), 0L);
                        if (parseLongAttr > 0) {
                            TL_iv.PageBlock newMediaItemBlock = newMediaItemBlock(equals, parseLongAttr, node2.has("data-spoiler"));
                            setEmptyCaption(newMediaItemBlock);
                            galleryItems.add(newMediaItemBlock);
                        }
                    }
                }
            }
        }
        if (galleryItems.isEmpty()) {
            return null;
        }
        if (galleryItems.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) galleryItems.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                setCaption(pageBlock, charSequence);
            }
            return new BlockRow(pageBlock);
        }
        setEmptyCaption(pageblockslideshow);
        if (charSequence != null && charSequence.length() > 0) {
            setCaption(pageblockslideshow, charSequence);
        }
        return new BlockRow(pageblockslideshow);
    }

    private static void parseFigure(Node node, ArrayList arrayList, int i) {
        Iterator it = node.children.iterator();
        BlockRow blockRow = null;
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText) {
                if ("figcaption".equals(node2.tag)) {
                    charSequence = inlineOf(node2);
                } else if (blockRow == null) {
                    blockRow = buildMediaRow(node2);
                }
            }
        }
        if (blockRow != null) {
            if (charSequence != null && charSequence.length() > 0) {
                setCaption(blockRow.block, charSequence);
            }
            arrayList.add(blockRow);
            return;
        }
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = RichTextStyle.fromSpannable(charSequence);
        arrayList.add(new BlockRow(pageblockparagraph, i, 0));
    }

    private static void setCaption(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = RichTextStyle.fromSpannable(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    private static void setEmptyCaption(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    private static long parseLongAttr(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return j;
        }
    }

    private static int parseIntAttr(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i;
        }
    }

    private static double parseDoubleAttr(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str.trim());
        } catch (Exception unused) {
            return d;
        }
    }

    private static void parseList(Node node, ArrayList arrayList, int i, boolean z) {
        int i2 = i + 1;
        Iterator it = node.children.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText && "li".equals(node2.tag)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = node2.children.iterator();
                while (it2.hasNext()) {
                    Node node3 = (Node) it2.next();
                    if (!node3.isText && ("ul".equals(node3.tag) || "ol".equals(node3.tag))) {
                        arrayList2.add(node3);
                    } else if (node3.isText) {
                        spannableStringBuilder.append((CharSequence) decode(node3.text));
                    } else {
                        appendInlineNode(spannableStringBuilder, node3, 0, null, 0L);
                    }
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
                BlockRow blockRow = new BlockRow(pageblockparagraph, i2, z ? i3 : 0);
                blockRow.checkbox = node2.has("data-checkbox") || hasCheckboxClass(node2);
                blockRow.checked = node2.has("data-checked");
                arrayList.add(blockRow);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Node node4 = (Node) it3.next();
                    parseList(node4, arrayList, i2, "ol".equals(node4.tag));
                }
                i3++;
            }
        }
    }

    private static void parseDetails(Node node, ArrayList arrayList, int i) {
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = node.has("open");
        pageblockdetails.blocks = new ArrayList<>();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (!node2.isText && "summary".equals(node2.tag)) {
                appendChildrenInline(spannableStringBuilder, node2, 0, null, 0L);
            } else {
                arrayList2.add(node2);
            }
        }
        pageblockdetails.title = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageblockdetails));
        int size = arrayList.size();
        parseBlocks(arrayList2, arrayList, i);
        if (arrayList.size() == size) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
        blockRow.detailsEnd = true;
        arrayList.add(blockRow);
    }

    private static boolean isInlineTag(String str) {
        str.hashCode();
        switch (str) {
            case "spoiler":
            case "strike":
            case "strong":
            case "a":
            case "b":
            case "i":
            case "s":
            case "u":
            case "br":
            case "em":
            case "tt":
            case "del":
            case "sub":
            case "sup":
            case "code":
            case "font":
            case "span":
            case "animated-emoji":
                return true;
            default:
                return false;
        }
    }

    private static void appendChildrenInline(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        Iterator it = node.children.iterator();
        while (it.hasNext()) {
            Node node2 = (Node) it.next();
            if (node2.isText) {
                appendStyled(spannableStringBuilder, decode(node2.text), i, str, j);
            } else {
                appendInlineNode(spannableStringBuilder, node2, i, str, j);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void appendInlineNode(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        int i2;
        String str2;
        long j2;
        String str3 = node.tag;
        str3.hashCode();
        switch (str3) {
            case "spoiler":
                i |= 256;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty() || node.isText) {
                    appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i |= 8;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "strong":
            case "b":
                i |= 1;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "a":
                String attr = node.attr("href");
                if (attr != null) {
                    i2 = i;
                    j2 = j;
                    str2 = attr;
                    if (node.children.isEmpty()) {
                    }
                    appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "i":
            case "em":
                i |= 2;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "u":
                i |= 16;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "br":
                appendStyled(spannableStringBuilder, "\n", i, str, j);
                break;
            case "tt":
            case "code":
                i |= 4;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "sub":
                i |= 16384;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "sup":
                i |= 32768;
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "animated-emoji":
                String attr2 = node.attr("data-document-id");
                if (attr2 != null) {
                    try {
                        j = Long.parseLong(attr2.trim());
                    } catch (Exception unused) {
                    }
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            default:
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
        }
    }

    private static void appendStyled(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, String str, long j) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        int length2 = spannableStringBuilder.length();
        if (j != 0) {
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i != 0) {
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags = i & 49439;
            spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str != null) {
            spannableStringBuilder.setSpan(new URLSpanReplacement(str), length, length2, 33);
        }
    }

    private static boolean hasPullClass(Node node) {
        String attr = node.attr("class");
        return attr != null && attr.toLowerCase().contains("pull");
    }

    private static boolean hasCheckboxClass(Node node) {
        String attr = node.attr("class");
        return attr != null && attr.toLowerCase().contains("checkbox");
    }

    private static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    private static CharSequence trim(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && isWs(spannableStringBuilder.charAt(i))) {
            i++;
        }
        while (length > i && isWs(spannableStringBuilder.charAt(length - 1))) {
            length--;
        }
        return (i == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String decode(String str) {
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '&') {
                sb.append(charAt);
            } else {
                int i2 = i + 1;
                int indexOf = str.indexOf(59, i2);
                if (indexOf < 0 || indexOf - i > 12) {
                    sb.append(charAt);
                } else {
                    String entity = entity(str.substring(i2, indexOf));
                    if (entity != null) {
                        sb.append(entity);
                        i = indexOf;
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private static String entity(String str) {
        int parseInt;
        str.hashCode();
        switch (str) {
            case "gt":
                return ">";
            case "lt":
                return "<";
            case "amp":
                return "&";
            case "apos":
                return "'";
            case "nbsp":
                return " ";
            case "quot":
                return "\"";
            default:
                if (str.length() > 1 && str.charAt(0) == '#') {
                    try {
                        if (str.charAt(1) != 'x' && str.charAt(1) != 'X') {
                            parseInt = Integer.parseInt(str.substring(1));
                            return new String(Character.toChars(parseInt));
                        }
                        parseInt = Integer.parseInt(str.substring(2), 16);
                        return new String(Character.toChars(parseInt));
                    } catch (Exception unused) {
                    }
                }
                return null;
        }
    }

    private static class Node {
        Map attrs;
        final ArrayList children = new ArrayList();
        boolean isText;
        String tag;
        String text;

        private Node() {
        }

        static Node text(String str) {
            Node node = new Node();
            node.isText = true;
            node.text = str;
            return node;
        }

        static Node el(String str) {
            Node node = new Node();
            node.tag = str;
            return node;
        }

        String attr(String str) {
            Map map = this.attrs;
            if (map == null) {
                return null;
            }
            return (String) map.get(str);
        }

        boolean has(String str) {
            Map map = this.attrs;
            return map != null && map.containsKey(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVoid(String str) {
        str.hashCode();
        switch (str) {
            case "br":
            case "hr":
            case "img":
            case "wbr":
            case "link":
            case "meta":
            case "input":
                return true;
            default:
                return false;
        }
    }

    private static class Parser {
        int p;
        final String s;

        private boolean isSpace(char c) {
            return c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '\f';
        }

        Parser(String str) {
            this.s = str == null ? "" : str;
        }

        List parse() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                if (this.p >= this.s.length()) {
                    break;
                }
                if (this.s.charAt(this.p) == '<') {
                    if (this.s.startsWith("<!--", this.p)) {
                        int indexOf = this.s.indexOf("-->", this.p + 4);
                        this.p = indexOf < 0 ? this.s.length() : indexOf + 3;
                    } else if (this.p + 1 < this.s.length() && this.s.charAt(this.p + 1) == '!') {
                        int indexOf2 = this.s.indexOf(62, this.p);
                        this.p = indexOf2 < 0 ? this.s.length() : indexOf2 + 1;
                    } else if (this.p + 1 < this.s.length() && this.s.charAt(this.p + 1) == '/') {
                        int indexOf3 = this.s.indexOf(62, this.p);
                        String str = this.s;
                        String lowerCase = str.substring(this.p + 2, indexOf3 < 0 ? str.length() : indexOf3).trim().toLowerCase();
                        this.p = indexOf3 < 0 ? this.s.length() : indexOf3 + 1;
                        closeTag(arrayList2, lowerCase);
                    } else {
                        int findTagEnd = findTagEnd(this.p);
                        if (findTagEnd < 0) {
                            addText(arrayList2, arrayList, this.s.substring(this.p));
                            break;
                        }
                        String substring = this.s.substring(this.p + 1, findTagEnd);
                        this.p = findTagEnd + 1;
                        boolean endsWith = substring.endsWith("/");
                        if (endsWith) {
                            substring = substring.substring(0, substring.length() - 1);
                        }
                        Node parseTag = parseTag(substring);
                        if (parseTag != null) {
                            addChild(arrayList2, arrayList, parseTag);
                            if (!endsWith && !RichHtml.isVoid(parseTag.tag)) {
                                arrayList2.add(parseTag);
                            }
                        }
                    }
                } else {
                    int indexOf4 = this.s.indexOf(60, this.p);
                    if (indexOf4 < 0) {
                        indexOf4 = this.s.length();
                    }
                    addText(arrayList2, arrayList, this.s.substring(this.p, indexOf4));
                    this.p = indexOf4;
                }
            }
            return arrayList;
        }

        private int findTagEnd(int i) {
            boolean z = false;
            char c = 0;
            for (int i2 = i + 1; i2 < this.s.length(); i2++) {
                char charAt = this.s.charAt(i2);
                if (z) {
                    if (charAt == c) {
                        z = false;
                    }
                } else if (charAt == '\"' || charAt == '\'') {
                    c = charAt;
                    z = true;
                } else if (charAt == '>') {
                    return i2;
                }
            }
            return -1;
        }

        private void closeTag(ArrayList arrayList, String str) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((Node) arrayList.get(size)).tag.equals(str)) {
                    while (arrayList.size() > size) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    return;
                }
            }
        }

        private void addChild(ArrayList arrayList, ArrayList arrayList2, Node node) {
            if (arrayList.isEmpty()) {
                arrayList2.add(node);
            } else {
                ((Node) arrayList.get(arrayList.size() - 1)).children.add(node);
            }
        }

        private void addText(ArrayList arrayList, ArrayList arrayList2, String str) {
            if (str.isEmpty()) {
                return;
            }
            addChild(arrayList, arrayList2, Node.text(str));
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0125 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Node parseTag(String str) {
            String str2;
            int i;
            String str3;
            int i2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int i3 = 0;
            while (i3 < trim.length() && !isSpace(trim.charAt(i3))) {
                i3++;
            }
            String lowerCase = trim.substring(0, i3).toLowerCase();
            if (lowerCase.isEmpty()) {
                return null;
            }
            Node el = Node.el(lowerCase);
            while (i3 < trim.length()) {
                while (i3 < trim.length() && isSpace(trim.charAt(i3))) {
                    i3++;
                }
                if (i3 >= trim.length()) {
                    break;
                }
                int i4 = i3;
                while (i4 < trim.length() && trim.charAt(i4) != '=' && !isSpace(trim.charAt(i4))) {
                    i4++;
                }
                String lowerCase2 = trim.substring(i3, i4).toLowerCase();
                while (i4 < trim.length() && isSpace(trim.charAt(i4))) {
                    i4++;
                }
                if (i4 < trim.length() && trim.charAt(i4) == '=') {
                    while (true) {
                        i2 = i4 + 1;
                        if (i2 >= trim.length() || !isSpace(trim.charAt(i2))) {
                            break;
                        }
                        i4 = i2;
                    }
                    if (i2 < trim.length() && (trim.charAt(i2) == '\"' || trim.charAt(i2) == '\'')) {
                        char charAt = trim.charAt(i2);
                        int i5 = i4 + 2;
                        i = i5;
                        while (i < trim.length() && trim.charAt(i) != charAt) {
                            i++;
                        }
                        str3 = trim.substring(i5, Math.min(i, trim.length()));
                        if (i < trim.length()) {
                            i++;
                        }
                        if (!lowerCase2.isEmpty()) {
                            if (el.attrs == null) {
                                el.attrs = new HashMap();
                            }
                            el.attrs.put(lowerCase2, RichHtml.decode(str3));
                        }
                        i3 = i;
                    } else {
                        i4 = i2;
                        while (i4 < trim.length() && !isSpace(trim.charAt(i4))) {
                            i4++;
                        }
                        str2 = trim.substring(i2, i4);
                    }
                } else {
                    str2 = "";
                }
                i = i4;
                str3 = str2;
                if (!lowerCase2.isEmpty()) {
                }
                i3 = i;
            }
            return el;
        }
    }
}
