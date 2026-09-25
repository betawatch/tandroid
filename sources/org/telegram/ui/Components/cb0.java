package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cb0 extends z5 {
    public final /* synthetic */ fb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(fb0 fb0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = fb0Var;
    }

    @Override // org.telegram.ui.Components.z5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = i14 + i12;
        int i16 = this.measuredSize;
        this.a.c.set((int) f7, (i15 - i16) / 2, (int) (f7 + i16), (i15 + i16) / 2);
    }
}
