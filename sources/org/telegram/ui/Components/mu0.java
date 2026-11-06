package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class mu0 {
    public static final Layout.Alignment[] a = Layout.Alignment.values();

    public static Layout.Alignment a() {
        Layout.Alignment[] alignmentArr = a;
        return alignmentArr.length >= 5 ? alignmentArr[4] : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i7, float f10, int i10, int i11) {
        return c(charSequence, textPaint, i7, Layout.Alignment.ALIGN_NORMAL, f10, TextUtils.TruncateAt.END, i10, i11, true);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i7, Layout.Alignment alignment, float f10, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z9) {
        boolean z10;
        CharSequence charSequence2 = charSequence;
        if (i11 == 1) {
            try {
                int indexOf = TextUtils.indexOf(charSequence2, "\n") - 1;
                if (indexOf > 0) {
                    charSequence2 = SpannableStringBuilder.valueOf(charSequence2.subSequence(0, indexOf)).append((CharSequence) "…");
                }
                CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textPaint, i10, TextUtils.TruncateAt.END);
                return new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, i7, alignment, 1.0f, f10, false);
            } catch (Exception e10) {
                e = e10;
                z10 = true;
            }
        } else {
            try {
                StaticLayout build = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), textPaint, i7).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(1).setHyphenationFrequency(0).build();
                int i12 = 0;
                while (true) {
                    if (i12 >= build.getLineCount()) {
                        break;
                    }
                    if (build.getLineRight(i12) > i7) {
                        build = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), textPaint, i7).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false).setEllipsize(null).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(0).setHyphenationFrequency(0).build();
                        break;
                    }
                    i12++;
                }
                if (build.getLineCount() <= i11) {
                    return build;
                }
                int i13 = i11 - 1;
                float lineLeft = build.getLineLeft(i13);
                float lineWidth = build.getLineWidth(i13);
                int offsetForHorizontal = lineLeft != 0.0f ? build.getOffsetForHorizontal(i13, lineLeft) : build.getOffsetForHorizontal(i13, lineWidth);
                if (lineWidth < i10 - org.telegram.messenger.g0.L(10.0f)) {
                    offsetForHorizontal += 3;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2.subSequence(0, Math.max(0, offsetForHorizontal - 3)));
                spannableStringBuilder.append((CharSequence) "…");
                return StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, i7).setAlignment(alignment).setLineSpacing(f10, 1.0f).setIncludePad(false).setEllipsize(((r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r5.class)).length > 0 ? null : truncateAt).setEllipsizedWidth(i10).setMaxLines(i11).setBreakStrategy(z9 ? 1 : 0).setHyphenationFrequency(0).build();
            } catch (Exception e11) {
                e = e11;
                z10 = true;
            }
        }
        org.telegram.messenger.a8.g(e, z10);
        return null;
    }

    public static StaticLayout d(CharSequence charSequence, TextPaint textPaint, boolean z9, int i7, int i10) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(z9).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setMaxLines(i10).setBreakStrategy(1).setHyphenationFrequency(0).build();
    }
}
