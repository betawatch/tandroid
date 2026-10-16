package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tb0 extends b6 {
    public final /* synthetic */ ub0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(ub0 ub0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ub0Var;
    }

    @Override // org.telegram.ui.Components.b6, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ub0 ub0Var = this.a;
        int i15 = ub0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ub0Var.c.set((int) f7, i2.d.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
