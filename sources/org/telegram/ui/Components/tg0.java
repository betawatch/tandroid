package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tg0 extends wl0 {
    public final yf.y X2;
    public long Y2;
    public final /* synthetic */ ah0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg0(ah0 ah0Var, Context context) {
        super(context, null);
        this.Z2 = ah0Var;
        this.X2 = new yf.y(8);
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.Z2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ah0 ah0Var = this.Z2;
        if (ah0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Y2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Y2 = elapsedRealtime;
            ah0Var.J += (abs * ah0Var.K) / 1800.0f;
            while (true) {
                f7 = ah0Var.J;
                float f10 = ah0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    ah0Var.J = f7 - f10;
                }
            }
            ah0Var.I.setTranslate(f7, 0.0f);
            ah0Var.H.setLocalMatrix(ah0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.X2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i5, this.p2));
        yVar.draw(canvas);
    }
}
