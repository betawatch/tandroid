package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class gu extends zt {
    public final Paint X;

    public gu(ev evVar, Rect rect, int i7) {
        super(evVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return f3.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        ev evVar = this.a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.xl : org.telegram.ui.ActionBar.n6.wl, evVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f10 = -evVar.S;
        int i7 = evVar.C + evVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (evVar.s) {
            r2 = g0.T1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, evVar.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float T1 = g0.T1((-1.0f) - (this.M != null ? r0.b.bottom : 0), g0.L(6.0f), r2);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
