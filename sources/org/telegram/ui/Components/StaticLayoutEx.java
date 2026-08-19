package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* loaded from: classes5.dex */
public abstract class StaticLayoutEx {
    public static Layout.Alignment[] alignments = Layout.Alignment.values();

    public static Layout.Alignment ALIGN_RIGHT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static Layout.Alignment ALIGN_LEFT() {
        Layout.Alignment[] alignmentArr = alignments;
        return alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
    }

    public static StaticLayout createStaticLayout2(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout build;
        if (Build.VERSION.SDK_INT >= 23) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2);
            alignment2 = obtain.setAlignment(alignment);
            lineSpacing = alignment2.setLineSpacing(f2, f);
            includePad = lineSpacing.setIncludePad(z);
            ellipsize = includePad.setEllipsize(TextUtils.TruncateAt.END);
            ellipsizedWidth = ellipsize.setEllipsizedWidth(i2);
            maxLines = ellipsizedWidth.setMaxLines(i3);
            breakStrategy = maxLines.setBreakStrategy(1);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
            build = hyphenationFrequency.build();
            return build;
        }
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        return createStaticLayout(charSequence, textPaint, i, alignment, f, f2, z, truncateAt, i2, i3, true);
    }

    public static StaticLayout createStaticLayout(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, boolean z2) {
        StaticLayout staticLayout;
        int offsetForHorizontal;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder ellipsize;
        StaticLayout.Builder ellipsizedWidth;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder breakStrategy;
        StaticLayout.Builder hyphenationFrequency;
        StaticLayout build;
        StaticLayout.Builder obtain2;
        StaticLayout.Builder alignment3;
        StaticLayout.Builder lineSpacing2;
        StaticLayout.Builder includePad2;
        StaticLayout.Builder ellipsize2;
        StaticLayout.Builder ellipsizedWidth2;
        StaticLayout.Builder maxLines2;
        StaticLayout.Builder breakStrategy2;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout.Builder obtain3;
        StaticLayout.Builder alignment4;
        StaticLayout.Builder lineSpacing3;
        StaticLayout.Builder includePad3;
        StaticLayout.Builder ellipsize3;
        StaticLayout.Builder ellipsizedWidth3;
        StaticLayout.Builder maxLines3;
        StaticLayout.Builder breakStrategy3;
        StaticLayout.Builder hyphenationFrequency3;
        try {
            if (i3 == 1) {
                int indexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence ellipsize4 = TextUtils.ellipsize(indexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, indexOf)).append((CharSequence) "…") : charSequence, textPaint, i2, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize4, 0, ellipsize4.length(), textPaint, i, alignment, f, f2, z);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                obtain2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
                alignment3 = obtain2.setAlignment(alignment);
                lineSpacing2 = alignment3.setLineSpacing(f2, f);
                includePad2 = lineSpacing2.setIncludePad(z);
                ellipsize2 = includePad2.setEllipsize(null);
                ellipsizedWidth2 = ellipsize2.setEllipsizedWidth(i2);
                maxLines2 = ellipsizedWidth2.setMaxLines(i3);
                breakStrategy2 = maxLines2.setBreakStrategy(1);
                hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(0);
                staticLayout = hyphenationFrequency2.build();
                int i4 = 0;
                while (true) {
                    if (i4 >= staticLayout.getLineCount()) {
                        break;
                    }
                    if (staticLayout.getLineRight(i4) > i) {
                        obtain3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
                        alignment4 = obtain3.setAlignment(alignment);
                        lineSpacing3 = alignment4.setLineSpacing(f2, f);
                        includePad3 = lineSpacing3.setIncludePad(z);
                        ellipsize3 = includePad3.setEllipsize(null);
                        ellipsizedWidth3 = ellipsize3.setEllipsizedWidth(i2);
                        maxLines3 = ellipsizedWidth3.setMaxLines(i3);
                        breakStrategy3 = maxLines3.setBreakStrategy(0);
                        hyphenationFrequency3 = breakStrategy3.setHyphenationFrequency(0);
                        staticLayout = hyphenationFrequency3.build();
                        break;
                    }
                    i4++;
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i, alignment, f, f2, z);
            }
            if (staticLayout.getLineCount() <= i3) {
                return staticLayout;
            }
            int i5 = i3 - 1;
            float lineLeft = staticLayout.getLineLeft(i5);
            float lineWidth = staticLayout.getLineWidth(i5);
            if (lineLeft != 0.0f) {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i5, lineLeft);
            } else {
                offsetForHorizontal = staticLayout.getOffsetForHorizontal(i5, lineWidth);
            }
            if (lineWidth < i2 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append((CharSequence) "…");
            if (Build.VERSION.SDK_INT >= 23) {
                obtain = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i);
                alignment2 = obtain.setAlignment(alignment);
                lineSpacing = alignment2.setLineSpacing(f2, f);
                includePad = lineSpacing.setIncludePad(z);
                ellipsize = includePad.setEllipsize(((AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)).length > 0 ? null : truncateAt);
                ellipsizedWidth = ellipsize.setEllipsizedWidth(i2);
                maxLines = ellipsizedWidth.setMaxLines(i3);
                breakStrategy = maxLines.setBreakStrategy(z2 ? 1 : 0);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(0);
                build = hyphenationFrequency.build();
                return build;
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i, alignment, f, f2, z);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
