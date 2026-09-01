package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class va0 extends u5 {
    public final /* synthetic */ xa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(xa0 xa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = xa0Var;
    }

    @Override // org.telegram.ui.Components.u5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        xa0 xa0Var = this.a;
        int i15 = xa0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        xa0Var.c.set((int) f10, l.d.d(i16, i17, 2, i15), (int) (f10 + i17), ((i16 + i17) / 2) + i15);
    }
}
