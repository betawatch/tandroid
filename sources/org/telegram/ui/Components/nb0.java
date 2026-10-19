package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        ob0Var.c.set((int) f7, i2.e.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
