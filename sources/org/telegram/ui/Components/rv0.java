package org.telegram.ui.Components;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class rv0 {
    public static final Layout.Alignment[] a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = a;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i9, float f10, int i10, int i11) {
        return c(charSequence, textPaint, i9, Layout.Alignment.ALIGN_NORMAL, f10, false, TextUtils.TruncateAt.END, i10, i11, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i9, Layout.Alignment alignment, float f10, boolean z10, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z11) {
        StaticLayout staticLayout;
        try {
            if (i11 == 1) {
                int indexOf = TextUtils.indexOf(charSequence, "\n") - 1;
                CharSequence ellipsize = TextUtils.ellipsize(indexOf > 0 ? SpannableStringBuilder.valueOf(charSequence.subSequence(0, indexOf)).append((CharSequence) "…") : charSequence, textPaint, i10, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i9, alignment, 1.0f, f10, z10);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i12 = 0;
                while (true) {
                    if (i12 >= staticLayout.getLineCount()) {
                        break;
                    }
                    if (staticLayout.getLineRight(i12) > i9) {
                        staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                    i12++;
                }
            } else {
                staticLayout = new StaticLayout(charSequence, textPaint, i9, alignment, 1.0f, f10, z10);
            }
            if (staticLayout.getLineCount() <= i11) {
                return staticLayout;
            }
            int i13 = i11 - 1;
            float lineLeft = staticLayout.getLineLeft(i13);
            float lineWidth = staticLayout.getLineWidth(i13);
            int offsetForHorizontal = lineLeft != 0.0f ? staticLayout.getOffsetForHorizontal(i13, lineLeft) : staticLayout.getOffsetForHorizontal(i13, lineWidth);
            if (lineWidth < i10 - AndroidUtilities.dp(10.0f)) {
                offsetForHorizontal += 3;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
            spannableStringBuilder.append((CharSequence) "…");
            if (Build.VERSION.SDK_INT >= 23) {
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i9).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(z10).setEllipsize(((t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.class)).length > 0 ? null : truncateAt).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(z11 ? 1 : 0).setHyphenationFrequency(0).build();
            }
            return new StaticLayout(spannableStringBuilder, textPaint, i9, alignment, 1.0f, f10, z10);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, int i9, boolean z10, int i10, int i11) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return Build.VERSION.SDK_INT >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setEllipsize(truncateAt).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(1).setHyphenationFrequency(0).build() : c(charSequence, textPaint, i9, alignment, 0.0f, z10, truncateAt, i10, i11, true);
    }
}
