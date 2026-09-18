package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sa0 extends x5 {
    public final /* synthetic */ ta0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(ta0 ta0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ta0Var;
    }

    @Override // org.telegram.ui.Components.x5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ta0 ta0Var = this.a;
        int i15 = ta0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ta0Var.c.set((int) f7, hg.k0.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
