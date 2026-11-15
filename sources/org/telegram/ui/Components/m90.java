package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m90 extends p5 {
    public final /* synthetic */ o90 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(o90 o90Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = o90Var;
    }

    @Override // org.telegram.ui.Components.p5, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14 = i13 + i11;
        int i15 = this.measuredSize;
        this.a.c.set((int) f10, (i14 - i15) / 2, (int) (f10 + i15), (i14 + i15) / 2);
    }
}
