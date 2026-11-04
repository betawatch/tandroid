package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class me0 extends tj0 {
    public final cg.b0 f3;
    public long g3;
    public final /* synthetic */ se0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(se0 se0Var, Context context) {
        super(context, null);
        this.h3 = se0Var;
        this.f3 = new cg.b0(8);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.h3.w1 + org.telegram.messenger.g0.m));
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        se0 se0Var = this.h3;
        if (se0Var.D1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            se0Var.B1 += (abs * se0Var.C1) / 1800.0f;
            while (true) {
                f10 = se0Var.B1;
                float f11 = se0Var.C1 * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    se0Var.B1 = f10 - f11;
                }
            }
            se0Var.A1.setTranslate(f10, 0.0f);
            se0Var.z1.setLocalMatrix(se0Var.A1);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.n;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        cg.b0 b0Var = this.f3;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.o2));
        b0Var.draw(canvas);
    }
}
