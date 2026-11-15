package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n90 extends p5 {
    public final /* synthetic */ o90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(o90 o90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = o90Var;
    }

    @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        o90 o90Var = this.a;
        int i14 = o90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        o90Var.c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
