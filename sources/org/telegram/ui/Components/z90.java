package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z90 extends y5 {
    public final /* synthetic */ aa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(aa0 aa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = aa0Var;
    }

    @Override // org.telegram.ui.Components.y5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        aa0 aa0Var = this.a;
        int i14 = aa0Var.E;
        int i15 = i13 + i11;
        int i16 = this.measuredSize;
        aa0Var.c.set((int) f10, i5.c.e(i15, i16, 2, i14), (int) (f10 + i16), ((i15 + i16) / 2) + i14);
    }
}
