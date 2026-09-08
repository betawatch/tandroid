package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ta0 extends z5 {
    public final /* synthetic */ ua0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(ua0 ua0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ua0Var;
    }

    @Override // org.telegram.ui.Components.z5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        ua0 ua0Var = this.a;
        int i15 = ua0Var.y;
        int i16 = i14 + i12;
        int i17 = this.measuredSize;
        ua0Var.c.set((int) f7, i2.g.C(i16, i17, 2, i15), (int) (f7 + i17), ((i16 + i17) / 2) + i15);
    }
}
