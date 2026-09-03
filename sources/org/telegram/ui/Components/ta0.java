package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ta0 extends u5 {
    public final /* synthetic */ wa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(wa0 wa0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = wa0Var;
    }

    @Override // org.telegram.ui.Components.u5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.a.c.set((int) f10, (i15 - i16) / 2, (int) (f10 + i16), (i15 + i16) / 2);
    }
}
