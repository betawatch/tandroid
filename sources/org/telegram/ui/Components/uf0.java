package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uf0 extends wk0 {
    public final ff.c0 T2;
    public long U2;
    public final /* synthetic */ ag0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(ag0 ag0Var, Context context) {
        super(context, null);
        this.V2 = ag0Var;
        this.T2 = new ff.c0(8);
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.V2.A + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ag0 ag0Var = this.V2;
        if (ag0Var.H) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.U2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.U2 = elapsedRealtime;
            ag0Var.F += (abs * ag0Var.G) / 1800.0f;
            while (true) {
                f10 = ag0Var.F;
                float f11 = ag0Var.G * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    ag0Var.F = f10 - f11;
                }
            }
            ag0Var.E.setTranslate(f10, 0.0f);
            ag0Var.D.setLocalMatrix(ag0Var.E);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        ff.c0 c0Var = this.T2;
        c0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        c0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, this.l2));
        c0Var.draw(canvas);
    }
}
