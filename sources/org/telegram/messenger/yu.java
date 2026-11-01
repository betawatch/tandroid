package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class yu extends ru {
    public final Paint W;

    public yu(wv wvVar, Rect rect, int i10) {
        super(wvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        return m5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return i0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        wv wvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.ul : org.telegram.ui.ActionBar.t6.tl, wvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f7 = -wvVar.S;
        int i10 = wvVar.C + wvVar.T;
        Rect rect = this.b;
        float f10 = (i10 - rect.left) - rect.right;
        if (wvVar.s) {
            r2 = i0.T1(this.R ? 1.0f : 0.0f, this.Q ? 1.0f : 0.0f, wvVar.t);
        } else if (this.Q) {
            r2 = 1.0f;
        }
        float T1 = i0.T1((-1.0f) - (this.L != null ? r0.b.bottom : 0), i0.L(6.0f), r2);
        canvas.drawRect(f7, T1, f10, T1 + 1.0f, paint);
    }
}
