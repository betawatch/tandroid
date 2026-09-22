package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qa0 extends x5 {
    public final /* synthetic */ ta0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(ta0 ta0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ta0Var;
    }

    @Override // org.telegram.ui.Components.x5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.a.c.set((int) f7, (i15 - i16) / 2, (int) (f7 + i16), (i15 + i16) / 2);
    }
}
