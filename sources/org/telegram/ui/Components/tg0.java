package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tg0 extends vl0 {
    public final xf.z X2;
    public long Y2;
    public final /* synthetic */ zg0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(zg0 zg0Var, Context context) {
        super(context, null);
        this.Z2 = zg0Var;
        this.X2 = new xf.z(8);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.Z2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        zg0 zg0Var = this.Z2;
        if (zg0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Y2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Y2 = elapsedRealtime;
            zg0Var.J += (abs * zg0Var.K) / 1800.0f;
            while (true) {
                f7 = zg0Var.J;
                float f10 = zg0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    zg0Var.J = f7 - f10;
                }
            }
            zg0Var.I.setTranslate(f7, 0.0f);
            zg0Var.H.setLocalMatrix(zg0Var.I);
            e1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        xf.z zVar = this.X2;
        zVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        zVar.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, this.p2));
        zVar.draw(canvas);
    }
}
