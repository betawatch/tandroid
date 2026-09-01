package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class lw0 {
    public static final Layout.Alignment[] a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = a;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i10, float f10, int i11, int i12) {
        return c(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, f10, false, TextUtils.TruncateAt.END, i11, i12, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, boolean z4, TextUtils.TruncateAt truncateAt, int i11, int i12, boolean z10) {
        StaticLayout staticLayout;
        try {
            if (i12 == 1) {
                int indexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence ellipsize = TextUtils.ellipsize(indexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, indexOf)).append((CharSequence) "…") : charSequence, textPaint, i11, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i10, alignment, 1.0f, f10, z4);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i13 = 0;
                while (true) {
                    if (i13 >= staticLayout.getLineCount()) {
                        break;
                    }
                    if (staticLayout.getLineRight(i13) > i10) {
                        staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4).setEllipsize(null).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                    i13++;
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i10, alignment, 1.0f, f10, z4);
            }
            if (staticLayout.getLineCount() <= i12) {
                return staticLayout;
            }
            int i14 = i12 - 1;
            float lineLeft = staticLayout.getLineLeft(i14);
            float lineWidth = staticLayout.getLineWidth(i14);
            int offsetForHorizontal = lineLeft != 0.0f ? staticLayout.getOffsetForHorizontal(i14, lineLeft) : staticLayout.getOffsetForHorizontal(i14, lineWidth);
            if (lineWidth < i11 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append((CharSequence) "…");
            if (Build.VERSION.SDK_INT >= 23) {
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z4).setEllipsize(((u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u5.class)).length > 0 ? null : truncateAt).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(z10 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i10, alignment, 1.0f, f10, z4);
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, int i10, boolean z4, int i11, int i12) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return Build.VERSION.SDK_INT >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z4).setEllipsize(truncateAt).setEllipsizedWidth(i11).setMaxLines(i12).setBreakStrategy(1).setHyphenationFrequency(0).build() : c(charSequence, textPaint, i10, alignment, 0.0f, z4, truncateAt, i11, i12, true);
    }
}
