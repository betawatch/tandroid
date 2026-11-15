package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class ju extends cu {
    public final Paint X;

    public ju(iv ivVar, Rect rect, int i7) {
        super(ivVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        iv ivVar = this.a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.xl : org.telegram.ui.ActionBar.j6.wl, ivVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        float f10 = -ivVar.S;
        int i7 = ivVar.C + ivVar.T;
        Rect rect = this.b;
        float f11 = (i7 - rect.left) - rect.right;
        if (ivVar.s) {
            r2 = g0.T1(this.S ? 1.0f : 0.0f, this.R ? 1.0f : 0.0f, ivVar.t);
        } else if (this.R) {
            r2 = 1.0f;
        }
        float T1 = g0.T1((-1.0f) - (this.M != null ? r0.b.bottom : 0), g0.L(6.0f), r2);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
