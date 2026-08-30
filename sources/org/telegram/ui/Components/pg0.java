package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pg0 extends sl0 {
    public final lf.b0 U2;
    public long V2;
    public final /* synthetic */ vg0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(vg0 vg0Var, Context context) {
        super(context, null);
        this.W2 = vg0Var;
        this.U2 = new lf.b0(8);
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.W2.B + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        vg0 vg0Var = this.W2;
        if (vg0Var.I) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.V2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.V2 = elapsedRealtime;
            vg0Var.G += (abs * vg0Var.H) / 1800.0f;
            while (true) {
                f10 = vg0Var.G;
                float f11 = vg0Var.H * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    vg0Var.G = f10 - f11;
                }
            }
            vg0Var.F.setTranslate(f10, 0.0f);
            vg0Var.E.setLocalMatrix(vg0Var.F);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        lf.b0 b0Var = this.U2;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, this.m2));
        b0Var.draw(canvas);
    }
}
