package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class hu extends au {
    public final Paint X;

    public hu(fv fvVar, Rect rect, int i7) {
        super(fvVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        return f3.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        fv fvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.xl : org.telegram.ui.ActionBar.m6.wl, fvVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f10 = -fvVar.S;
        int i7 = fvVar.C + fvVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (fvVar.s) {
            r2 = g0.T1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, fvVar.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float T1 = g0.T1((-1.0f) - (this.M != null ? r0.b.bottom : 0), g0.L(6.0f), r2);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
