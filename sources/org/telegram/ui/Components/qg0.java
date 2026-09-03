package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qg0 extends rl0 {
    public final kf.b0 U2;
    public long V2;
    public final /* synthetic */ wg0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(wg0 wg0Var, Context context) {
        super(context, null);
        this.W2 = wg0Var;
        this.U2 = new kf.b0(8);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.W2.B + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        wg0 wg0Var = this.W2;
        if (wg0Var.I) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.V2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.V2 = elapsedRealtime;
            wg0Var.G += (abs * wg0Var.H) / 1800.0f;
            while (true) {
                f10 = wg0Var.G;
                float f11 = wg0Var.H * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    wg0Var.G = f10 - f11;
                }
            }
            wg0Var.F.setTranslate(f10, 0.0f);
            wg0Var.E.setLocalMatrix(wg0Var.F);
            e1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        kf.b0 b0Var = this.U2;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, this.m2));
        b0Var.draw(canvas);
    }
}
