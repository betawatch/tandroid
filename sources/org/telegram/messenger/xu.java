package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class xu extends qu {
    public final Paint W;

    public xu(vv vvVar, Rect rect, int i10) {
        super(vvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return m5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return i0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        vv vvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.ul : org.telegram.ui.ActionBar.t6.tl, vvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f7 = -vvVar.S;
        int i10 = vvVar.C + vvVar.T;
        Rect rect = this.b;
        float f10 = (i10 - rect.left) - rect.right;
        if (vvVar.s) {
            r2 = i0.T1(this.R ? 1.0f : 0.0f, this.Q ? 1.0f : 0.0f, vvVar.t);
        } else if (this.Q) {
            r2 = 1.0f;
        }
        float T1 = i0.T1((-1.0f) - (this.L != null ? r0.b.bottom : 0), i0.L(6.0f), r2);
        canvas.drawRect(f7, T1, f10, T1 + 1.0f, paint);
    }
}
