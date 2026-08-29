package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oa0 extends y5 {
    public final /* synthetic */ qa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(qa0 qa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = qa0Var;
    }

    @Override // org.telegram.ui.Components.y5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        qa0 qa0Var = this.a;
        int i15 = qa0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        qa0Var.c.set((int) f9, j7.l1.e(i16, i17, 2, i15), (int) (f9 + i17), ((i16 + i17) / 2) + i15);
    }
}
