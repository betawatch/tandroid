package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ua0 extends u5 {
    public final /* synthetic */ xa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(xa0 xa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = xa0Var;
    }

    @Override // org.telegram.ui.Components.u5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.a.c.set((int) f10, (i15 - i16) / 2, (int) (f10 + i16), (i15 + i16) / 2);
    }
}
