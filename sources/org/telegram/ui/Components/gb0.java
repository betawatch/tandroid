package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class gb0 extends z5 {
    public final /* synthetic */ hb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(hb0 hb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = hb0Var;
    }

    @Override // org.telegram.ui.Components.z5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        hb0 hb0Var = this.a;
        int i15 = hb0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        hb0Var.c.set((int) f7, hg.c.y(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
