package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ku extends cu {
    public final Paint X;

    public ku(iv ivVar, Rect rect, int i7) {
        super(ivVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        return g0.L(32.0f);
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        iv ivVar = this.a;
        int i7 = ivVar.C;
        int i10 = ivVar.S;
        int i11 = i7 + i10 + ivVar.T;
        Rect rect = this.b;
        int i12 = rect.left;
        int i13 = ((i11 - i12) - rect.right) / 2;
        float f10 = (((r1 - i13) / 2.0f) - i10) + i12;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        int w02 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.nl : org.telegram.ui.ActionBar.j6.ml, ivVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i13 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
