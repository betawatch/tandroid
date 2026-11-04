package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class eu extends xt {
    public final Paint X;

    public eu(cv cvVar, Rect rect, int i3) {
        super(cvVar, rect, i3);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        cv cvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.ul : org.telegram.ui.ActionBar.k6.tl, cvVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f10 = -cvVar.S;
        int i3 = cvVar.C + cvVar.T;
        Rect rect = this.b;
        float f11 = (i3 - rect.left) - rect.right;
        if (cvVar.s) {
            r2 = g0.T1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, cvVar.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float T1 = g0.T1((-1.0f) - (this.M != null ? r0.b.bottom : 0), g0.L(6.0f), r2);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
