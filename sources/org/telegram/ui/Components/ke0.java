package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ke0 extends pj0 {
    public final bg.c0 e3;
    public long f3;
    public final /* synthetic */ qe0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(qe0 qe0Var, Context context) {
        super(context, null);
        this.g3 = qe0Var;
        this.e3 = new bg.c0(8);
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.g3.v1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        qe0 qe0Var = this.g3;
        if (qe0Var.C1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f3 = elapsedRealtime;
            qe0Var.A1 += (abs * qe0Var.B1) / 1800.0f;
            while (true) {
                f10 = qe0Var.A1;
                float f11 = qe0Var.B1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    qe0Var.A1 = f10 - f11;
                }
            }
            qe0Var.z1.setTranslate(f10, 0.0f);
            qe0Var.y1.setLocalMatrix(qe0Var.z1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.e3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.n2));
        c0Var.draw(canvas);
    }
}
