package org.telegram.ui.iv;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.SquigglyLinesSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanReplacement;

/* loaded from: classes5.dex */
public abstract class RichTextStyle {
    private static final int[] STYLE_FLAGS = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static CharSequence toSpannable(TL_iv.RichText richText) {
        return toSpannable(richText, null);
    }

    public static CharSequence toSpannable(TL_iv.RichText richText, TL_iv.PageBlock pageBlock) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        append(spannableStringBuilder, richText, 0, pageBlock);
        return spannableStringBuilder;
    }

    private static void append(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i, TL_iv.PageBlock pageBlock) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                append(spannableStringBuilder, it.next(), i, pageBlock);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean isEmpty = isEmpty(textdiff.text);
            boolean isEmpty2 = isEmpty(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (isEmpty) {
                append(spannableStringBuilder, textdiff.old_text, i, pageBlock);
                setDiffStyle(spannableStringBuilder, length, 8192);
                return;
            }
            append(spannableStringBuilder, textdiff.text, i, pageBlock);
            if (isEmpty2) {
                setDiffStyle(spannableStringBuilder, length, 4096);
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new SquigglyLinesSpan(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            appendLeaf(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
            spannableStringBuilder.setSpan(animatedEmojiSpan, length2, spannableStringBuilder.length(), 33);
            if (i != 0) {
                spannableStringBuilder.setSpan(spanFor(i, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            append(spannableStringBuilder, texturl.text, i, pageBlock);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(linkSpan(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            append(spannableStringBuilder, textdate.text, i, pageBlock);
            if (spannableStringBuilder.length() > length4) {
                spannableStringBuilder.setSpan(dateSpan(textdate, spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString()), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object create = MathSpan.create(textmath.source, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (create != null) {
                spannableStringBuilder.setSpan(create, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence2 = textmath.source;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence2);
            }
            if (spannableStringBuilder.length() <= length5 || i == 0) {
                return;
            }
            spannableStringBuilder.setSpan(spanFor(i, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        int flagOf = flagOf(richText);
        if (flagOf != 0) {
            append(spannableStringBuilder, richText.text, i | flagOf, pageBlock);
        } else {
            appendLeaf(spannableStringBuilder, plainOf(richText), i, pageBlock);
        }
    }

    private static void setDiffStyle(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (spannableStringBuilder.length() > i) {
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags = i2;
            spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), i, spannableStringBuilder.length(), 33);
        }
    }

    private static void appendLeaf(SpannableStringBuilder spannableStringBuilder, String str, int i, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i != 0) {
            spannableStringBuilder.setSpan(spanFor(i, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    private static int flagOf(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textBold) {
            return 1;
        }
        if (richText instanceof TL_iv.textItalic) {
            return 2;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return 8;
        }
        if (richText instanceof TL_iv.textFixed) {
            return 4;
        }
        if (richText instanceof TL_iv.textSpoiler) {
            return 256;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return 16384;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return 32768;
        }
        return richText instanceof TL_iv.textMarked ? 65536 : 0;
    }

    public static String plainOf(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null ? "" : str;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            return str2 == null ? "" : str2;
        }
        if (richText instanceof TL_iv.textMath) {
            return " ";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                sb.append(plainOf(it.next()));
            }
            return sb.toString();
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return isEmpty(textdiff.text) ? plainOf(textdiff.old_text) : plainOf(textdiff.text);
        }
        return plainOf(richText.text);
    }

    public static boolean isEmpty(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null || str.isEmpty();
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            return str2 == null || str2.isEmpty();
        }
        if (richText instanceof TL_iv.textConcat) {
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                if (!isEmpty(it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return isEmpty(textdiff.text) && isEmpty(textdiff.old_text);
        }
        return isEmpty(richText.text);
    }

    private static FormattedDateSpan dateSpan(TL_iv.textDate textdate, String str) {
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.flags = textdate.flags;
        tL_messageEntityFormattedDate.date = textdate.date;
        tL_messageEntityFormattedDate.applyFlags();
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 128;
        return new FormattedDateSpan(str, textStyleRun, tL_messageEntityFormattedDate);
    }

    public static TL_iv.RichText fromSpannable(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return new TL_iv.textEmpty();
        }
        if (!(charSequence instanceof Spanned)) {
            return plainNode(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        Run run = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i, length, CharacterStyle.class);
            Run runAt = runAt(spanned, i, nextSpanTransition);
            if (run != null) {
                if (run.equals(runAt)) {
                    i = nextSpanTransition;
                } else {
                    arrayList.add(wrap(charSequence.subSequence(i2, i).toString(), run));
                    i2 = i;
                }
            }
            run = runAt;
            i = nextSpanTransition;
        }
        String charSequence2 = charSequence.subSequence(i2, length).toString();
        if (run == null) {
            run = new Run();
        }
        arrayList.add(wrap(charSequence2, run));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    private static TL_iv.RichText wrap(String str, Run run) {
        if (run.mathSource != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = run.mathSource;
            return textmath;
        }
        long j = run.emojiDocId;
        TL_iv.RichText customEmojiNode = j != 0 ? customEmojiNode(j, str) : plainNode(str);
        int i = run.flags;
        if ((i & 1) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textBold(), customEmojiNode);
        }
        if ((i & 2) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textItalic(), customEmojiNode);
        }
        if ((i & 16) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textUnderline(), customEmojiNode);
        }
        if ((i & 8) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textStrike(), customEmojiNode);
        }
        if ((i & 4) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textFixed(), customEmojiNode);
        }
        if ((i & 256) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textSpoiler(), customEmojiNode);
        }
        if ((i & 16384) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textSubscript(), customEmojiNode);
        }
        if ((32768 & i) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textSuperscript(), customEmojiNode);
        }
        if ((i & 65536) != 0) {
            customEmojiNode = wrapOne(new TL_iv.textMarked(), customEmojiNode);
        }
        if (run.url != null) {
            TL_iv.textUrl texturl = new TL_iv.textUrl();
            texturl.text = customEmojiNode;
            texturl.url = run.url;
            customEmojiNode = texturl;
        }
        FormattedDateSpan formattedDateSpan = run.date;
        return formattedDateSpan != null ? dateNode(formattedDateSpan, customEmojiNode) : customEmojiNode;
    }

    private static TL_iv.RichText dateNode(FormattedDateSpan formattedDateSpan, TL_iv.RichText richText) {
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = formattedDateSpan.entity;
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText;
        textdate.flags = tL_messageEntityFormattedDate.flags;
        textdate.relative = tL_messageEntityFormattedDate.relative;
        textdate.short_time = tL_messageEntityFormattedDate.short_time;
        textdate.long_time = tL_messageEntityFormattedDate.long_time;
        textdate.short_date = tL_messageEntityFormattedDate.short_date;
        textdate.long_date = tL_messageEntityFormattedDate.long_date;
        textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
        textdate.date = tL_messageEntityFormattedDate.date;
        return textdate;
    }

    private static TL_iv.textPlain plainNode(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        return textplain;
    }

    private static TL_iv.textCustomEmoji customEmojiNode(long j, String str) {
        TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
        textcustomemoji.document_id = j;
        if (str == null) {
            str = "";
        }
        textcustomemoji.alt = str;
        return textcustomemoji;
    }

    private static TL_iv.RichText wrapOne(TL_iv.RichText richText, TL_iv.RichText richText2) {
        richText.text = richText2;
        return richText;
    }

    public static boolean hasStyle(CharSequence charSequence, int i, int i2, int i3) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, TextStyleSpan.class);
            if ((flagsBetween(spanned, max, nextSpanTransition) & i3) == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static boolean hasLink(CharSequence charSequence, int i, int i2) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, URLSpanReplacement.class);
            if (((URLSpanReplacement[]) spanned.getSpans(max, nextSpanTransition, URLSpanReplacement.class)).length == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static boolean hasDate(CharSequence charSequence, int i, int i2) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, FormattedDateSpan.class);
            if (((FormattedDateSpan[]) spanned.getSpans(max, nextSpanTransition, FormattedDateSpan.class)).length == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static int stylesFullyCovering(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int i4 : STYLE_FLAGS) {
            if (hasStyle(charSequence, i, i2, i4)) {
                i3 |= i4;
            }
        }
        return i3;
    }

    public static void setStyle(Spannable spannable, int i, int i2, int i3, boolean z) {
        setStyle(spannable, i, i2, i3, z, null);
    }

    public static void setStyle(Spannable spannable, int i, int i2, int i3, boolean z, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2) {
            return;
        }
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(max, max2, TextStyleSpan.class)) {
            int spanStart = spannable.getSpanStart(textStyleSpan);
            int spanEnd = spannable.getSpanEnd(textStyleSpan);
            int styleFlags = textStyleSpan.getStyleFlags();
            spannable.removeSpan(textStyleSpan);
            applyRun(spannable, spanStart, max, styleFlags, pageBlock);
            applyRun(spannable, max2, spanEnd, styleFlags, pageBlock);
            applyRun(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z ? styleFlags | i3 : (~i3) & styleFlags, pageBlock);
        }
        if (z) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, TextStyleSpan.class);
                if (flagsBetween(spannable, max, nextSpanTransition) == 0) {
                    applyRun(spannable, max, nextSpanTransition, i3, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static void removeLink(Spannable spannable, int i, int i2) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2) {
            return;
        }
        for (URLSpanReplacement uRLSpanReplacement : (URLSpanReplacement[]) spannable.getSpans(max, max2, URLSpanReplacement.class)) {
            int spanStart = spannable.getSpanStart(uRLSpanReplacement);
            int spanEnd = spannable.getSpanEnd(uRLSpanReplacement);
            spannable.removeSpan(uRLSpanReplacement);
            if (spanStart < max) {
                spannable.setSpan(linkSpan(uRLSpanReplacement.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                spannable.setSpan(linkSpan(uRLSpanReplacement.getURL()), max2, spanEnd, 33);
            }
        }
    }

    static URLSpanReplacement linkSpan(String str) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = 1024;
        return new URLSpanReplacement(str, textStyleRun);
    }

    public static void removeDate(Spannable spannable, int i, int i2) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2) {
            return;
        }
        for (FormattedDateSpan formattedDateSpan : (FormattedDateSpan[]) spannable.getSpans(max, max2, FormattedDateSpan.class)) {
            spannable.removeSpan(formattedDateSpan);
        }
    }

    private static void applyRun(Spannable spannable, int i, int i2, int i3, TL_iv.PageBlock pageBlock) {
        if (i >= i2 || i3 == 0) {
            return;
        }
        spannable.setSpan(spanFor(i3, pageBlock), i, i2, 33);
    }

    private static int flagsBetween(Spanned spanned, int i, int i2) {
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i, i2, TextStyleSpan.class);
        int i3 = 0;
        for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
            int styleFlags = textStyleSpan.getStyleFlags();
            if ((styleFlags & 512) != 0) {
                styleFlags |= 256;
            }
            i3 |= styleFlags;
        }
        return 114975 & i3;
    }

    private static Run runAt(Spanned spanned, int i, int i2) {
        Run run = new Run();
        run.flags = flagsBetween(spanned, i, i2);
        if (((URLSpanMono[]) spanned.getSpans(i, i2, URLSpanMono.class)).length > 0) {
            run.flags |= 4;
        }
        URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i, i2, URLSpanReplacement.class);
        if (uRLSpanReplacementArr.length > 0) {
            run.url = uRLSpanReplacementArr[0].getURL();
        }
        FormattedDateSpan[] formattedDateSpanArr = (FormattedDateSpan[]) spanned.getSpans(i, i2, FormattedDateSpan.class);
        if (formattedDateSpanArr.length > 0) {
            run.date = formattedDateSpanArr[0];
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, i2, AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr.length > 0) {
            run.emojiDocId = animatedEmojiSpanArr[0].getDocumentId();
        }
        MathSpan[] mathSpanArr = (MathSpan[]) spanned.getSpans(i, i2, MathSpan.class);
        if (mathSpanArr.length > 0) {
            run.mathSource = mathSpanArr[0].source;
        }
        return run;
    }

    private static TextStyleSpan spanFor(int i, TL_iv.PageBlock pageBlock) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        textStyleRun.header = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new TextStyleSpan(textStyleRun);
    }

    private static class Run {
        FormattedDateSpan date;
        long emojiDocId;
        int flags;
        String mathSource;
        String url;

        private Run() {
        }

        boolean equals(Run run) {
            if (this.emojiDocId != 0 || run.emojiDocId != 0 || this.mathSource != null || run.mathSource != null || this.flags != run.flags) {
                return false;
            }
            String str = this.url;
            if (str == null) {
                if (run.url != null) {
                    return false;
                }
            } else if (!str.equals(run.url)) {
                return false;
            }
            return this.date == run.date;
        }
    }
}
