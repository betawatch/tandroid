package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x90 extends x5 {
    public final /* synthetic */ y90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(y90 y90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = y90Var;
    }

    @Override // org.telegram.ui.Components.x5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        y90 y90Var = this.a;
        int i14 = y90Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        y90Var.c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
