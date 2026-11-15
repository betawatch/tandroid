package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ne0 extends uj0 {
    public final bg.c0 f3;
    public long g3;
    public final /* synthetic */ te0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(te0 te0Var, Context context) {
        super(context, null);
        this.h3 = te0Var;
        this.f3 = new bg.c0(8);
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.h3.z1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        te0 te0Var = this.h3;
        if (te0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            te0Var.E1 += (abs * te0Var.F1) / 1800.0f;
            while (true) {
                f10 = te0Var.E1;
                float f11 = te0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    te0Var.E1 = f10 - f11;
                }
            }
            te0Var.D1.setTranslate(f10, 0.0f);
            te0Var.C1.setLocalMatrix(te0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.c0 c0Var = this.f3;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.i5, this.o2));
        c0Var.draw(canvas);
    }
}
