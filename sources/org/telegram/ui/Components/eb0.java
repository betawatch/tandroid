package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class eb0 extends z5 {
    public final /* synthetic */ fb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(fb0 fb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = fb0Var;
    }

    @Override // org.telegram.ui.Components.z5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        fb0 fb0Var = this.a;
        int i15 = fb0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        fb0Var.c.set((int) f7, hg.c.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
