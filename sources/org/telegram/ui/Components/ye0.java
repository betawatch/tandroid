package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ye0 extends ek0 {
    public final bg.d0 f3;
    public long g3;
    public final /* synthetic */ ef0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(ef0 ef0Var, Context context) {
        super(context, null);
        this.h3 = ef0Var;
        this.f3 = new bg.d0(8);
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.h3.z1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ef0 ef0Var = this.h3;
        if (ef0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            ef0Var.E1 += (abs * ef0Var.F1) / 1800.0f;
            while (true) {
                f10 = ef0Var.E1;
                float f11 = ef0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    ef0Var.E1 = f10 - f11;
                }
            }
            ef0Var.D1.setTranslate(f10, 0.0f);
            ef0Var.C1.setLocalMatrix(ef0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.d0 d0Var = this.f3;
        d0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        d0Var.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, this.o2));
        d0Var.draw(canvas);
    }
}
