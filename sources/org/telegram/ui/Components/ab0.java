package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ab0 extends y5 {
    public final /* synthetic */ bb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(bb0 bb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = bb0Var;
    }

    @Override // org.telegram.ui.Components.y5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        bb0 bb0Var = this.a;
        int i15 = bb0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        bb0Var.c.set((int) f7, hg.k0.z(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
