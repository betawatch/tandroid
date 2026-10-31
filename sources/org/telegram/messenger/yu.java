package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class yu extends qu {
    public final Paint W;

    public yu(vv vvVar, Rect rect, int i10) {
        super(vvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return i0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        return i0.L(32.0f);
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        vv vvVar = this.a;
        int i10 = vvVar.C;
        int i11 = vvVar.S;
        int i12 = i10 + i11 + vvVar.T;
        Rect rect = this.b;
        int i13 = rect.left;
        int i14 = ((i12 - i13) - rect.right) / 2;
        float f7 = (((r1 - i14) / 2.0f) - i11) + i13;
        float L = (i0.L(12.0f) - i0.L(1.0f)) / 2.0f;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.kl : org.telegram.ui.ActionBar.t6.jl, vvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        RectF rectF = i0.P;
        rectF.set(f7, L, i14 + f7, i0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, i0.L(0.5f), i0.L(0.5f), paint);
    }
}
