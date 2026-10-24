package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ob0 extends a6 {
    public final /* synthetic */ pb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(pb0 pb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = pb0Var;
    }

    @Override // org.telegram.ui.Components.a6, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        pb0 pb0Var = this.a;
        int i15 = pb0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        pb0Var.c.set((int) f7, i2.o1.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
