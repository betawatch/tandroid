package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z90 extends t5 {
    public final /* synthetic */ ca0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(ca0 ca0Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = ca0Var;
    }

    @Override // org.telegram.ui.Components.t5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = i13 + i11;
        int i15 = this.measuredSize;
        this.a.c.set((int) f10, (i14 - i15) / 2, (int) (f10 + i15), (i14 + i15) / 2);
    }
}
