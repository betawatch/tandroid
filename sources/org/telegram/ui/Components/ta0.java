package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ta0 extends u5 {
    public final /* synthetic */ va0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(va0 va0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = va0Var;
    }

    @Override // org.telegram.ui.Components.u5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        va0 va0Var = this.a;
        int i15 = va0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        va0Var.c.set((int) f10, kh.a2.d(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
