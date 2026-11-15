package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m90 extends p5 {
    public final /* synthetic */ n90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(n90 n90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = n90Var;
    }

    @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        n90 n90Var = this.a;
        int i14 = n90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        n90Var.c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
