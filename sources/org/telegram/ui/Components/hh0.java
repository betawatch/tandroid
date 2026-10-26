package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hh0 extends mm0 {
    public final ag.h0 f3;
    public long g3;
    public final /* synthetic */ nh0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh0(nh0 nh0Var, Context context) {
        super(context, null);
        this.h3 = nh0Var;
        this.f3 = new ag.h0(8);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.h3.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        nh0 nh0Var = this.h3;
        if (nh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.g3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.g3 = elapsedRealtime;
            nh0Var.J += (abs * nh0Var.K) / 1800.0f;
            while (true) {
                f7 = nh0Var.J;
                float f10 = nh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    nh0Var.J = f7 - f10;
                }
            }
            nh0Var.I.setTranslate(f7, 0.0f);
            nh0Var.H.setLocalMatrix(nh0Var.I);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        ag.h0 h0Var = this.f3;
        h0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        h0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i5, this.n2));
        h0Var.draw(canvas);
    }
}
