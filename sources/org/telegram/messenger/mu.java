package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class mu extends fu {
    public final Paint W;

    public mu(kv kvVar, Rect rect, int i7) {
        super(kvVar, rect, i7);
        this.W = new Paint(1);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        kv kvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.ul : org.telegram.ui.ActionBar.k6.tl, kvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f10 = -kvVar.S;
        int i7 = kvVar.C + kvVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (kvVar.s) {
            r2 = g0.T1(this.R ? 1.0f : 0.0f, this.Q ? 1.0f : 0.0f, kvVar.t);
        } else if (this.Q) {
            r2 = 1.0f;
        }
        float T1 = g0.T1((-1.0f) - (this.L != null ? r0.b.bottom : 0), g0.L(6.0f), r2);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
