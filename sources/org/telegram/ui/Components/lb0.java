package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lb0 extends c6 {
    public final /* synthetic */ mb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(mb0 mb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = mb0Var;
    }

    @Override // org.telegram.ui.Components.c6, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        mb0 mb0Var = this.a;
        int i15 = mb0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        mb0Var.c.set((int) f7, ic.a.A(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
