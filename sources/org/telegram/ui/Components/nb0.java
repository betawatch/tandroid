package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class nb0 extends a6 {
    public final /* synthetic */ ob0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(ob0 ob0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ob0Var;
    }

    @Override // org.telegram.ui.Components.a6, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ob0 ob0Var = this.a;
        int i15 = ob0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ob0Var.c.set((int) f7, i0.a.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
