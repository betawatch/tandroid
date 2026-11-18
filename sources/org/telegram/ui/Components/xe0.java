package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xe0 extends ck0 {
    public final bg.d0 f3;
    public long g3;
    public final /* synthetic */ df0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe0(df0 df0Var, Context context) {
        super(context, null);
        this.h3 = df0Var;
        this.f3 = new bg.d0(8);
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.h3.z1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        df0 df0Var = this.h3;
        if (df0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            df0Var.E1 += (abs * df0Var.F1) / 1800.0f;
            while (true) {
                f10 = df0Var.E1;
                float f11 = df0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    df0Var.E1 = f10 - f11;
                }
            }
            df0Var.D1.setTranslate(f10, 0.0f);
            df0Var.C1.setLocalMatrix(df0Var.D1);
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
