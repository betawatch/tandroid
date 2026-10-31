package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ca0 extends o5 {
    public final /* synthetic */ da0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(da0 da0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = da0Var;
    }

    @Override // org.telegram.ui.Components.o5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        da0 da0Var = this.a;
        int i15 = da0Var.D;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        da0Var.c.set((int) f7, i0.a.u(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
