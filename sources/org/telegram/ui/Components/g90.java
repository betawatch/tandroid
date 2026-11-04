package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g90 extends p5 {
    public final /* synthetic */ h90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(h90 h90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = h90Var;
    }

    @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h90 h90Var = this.a;
        int i14 = h90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        h90Var.c.set((int) f10, k2.p1.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
