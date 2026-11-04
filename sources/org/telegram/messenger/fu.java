package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fu extends xt {
    public final Paint X;

    public fu(cv cvVar, Rect rect, int i3) {
        super(cvVar, rect, i3);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        return g0.L(32.0f);
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        cv cvVar = this.a;
        int i3 = cvVar.C;
        int i10 = cvVar.S;
        int i11 = i3 + i10 + cvVar.T;
        Rect rect = this.b;
        int i12 = rect.left;
        int i13 = ((i11 - i12) - rect.right) / 2;
        float f10 = (((r1 - i13) / 2.0f) - i10) + i12;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.kl : org.telegram.ui.ActionBar.k6.jl, cvVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i13 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
