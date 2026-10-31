package org.telegram.ui;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class or0 implements LineHeightSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ or0(int i10) {
        this.a = i10;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                fontMetricsInt.descent = org.telegram.messenger.i0.L(4.0f) + fontMetricsInt.descent;
                fontMetricsInt.ascent = fontMetricsInt.ascent;
                break;
            default:
                fontMetricsInt.ascent -= org.telegram.messenger.i0.L(2.0f);
                fontMetricsInt.top -= org.telegram.messenger.i0.L(2.0f);
                break;
        }
    }
}
