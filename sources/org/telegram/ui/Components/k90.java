package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k90 extends q5 {
    public final /* synthetic */ l90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(l90 l90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = l90Var;
    }

    @Override // org.telegram.ui.Components.q5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        l90 l90Var = this.a;
        int i14 = l90Var.D;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        l90Var.c.set((int) f10, jg.g.D(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
