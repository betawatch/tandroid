package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ze0 extends ek0 {
    public final bg.d0 f3;
    public long g3;
    public final /* synthetic */ ff0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze0(ff0 ff0Var, Context context) {
        super(context, null);
        this.h3 = ff0Var;
        this.f3 = new bg.d0(8);
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.h3.z1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ff0 ff0Var = this.h3;
        if (ff0Var.G1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            ff0Var.E1 += (abs * ff0Var.F1) / 1800.0f;
            while (true) {
                f10 = ff0Var.E1;
                float f11 = ff0Var.F1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    ff0Var.E1 = f10 - f11;
                }
            }
            ff0Var.D1.setTranslate(f10, 0.0f);
            ff0Var.C1.setLocalMatrix(ff0Var.D1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        bg.d0 d0Var = this.f3;
        d0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        d0Var.b(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i5, this.o2));
        d0Var.draw(canvas);
    }
}
