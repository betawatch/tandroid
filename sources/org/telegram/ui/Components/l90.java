package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l90 extends r5 {
    public final /* synthetic */ m90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(m90 m90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = m90Var;
    }

    @Override // org.telegram.ui.Components.r5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        m90 m90Var = this.a;
        int i14 = m90Var.D;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        m90Var.c.set((int) f10, jg.g.D(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
