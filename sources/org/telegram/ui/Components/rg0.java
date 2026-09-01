package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rg0 extends tl0 {
    public final lf.b0 U2;
    public long V2;
    public final /* synthetic */ xg0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(xg0 xg0Var, Context context) {
        super(context, null);
        this.W2 = xg0Var;
        this.U2 = new lf.b0(8);
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E0(float f10) {
        return f10 >= ((float) (this.W2.B + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        xg0 xg0Var = this.W2;
        if (xg0Var.I) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.V2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.V2 = elapsedRealtime;
            xg0Var.G += (abs * xg0Var.H) / 1800.0f;
            while (true) {
                f10 = xg0Var.G;
                float f11 = xg0Var.H * 2.0f;
                if (f10 < f11) {
                    break;
                } else {
                    xg0Var.G = f10 - f11;
                }
            }
            xg0Var.F.setTranslate(f10, 0.0f);
            xg0Var.E.setLocalMatrix(xg0Var.F);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        lf.b0 b0Var = this.U2;
        b0Var.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        b0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i5, this.m2));
        b0Var.draw(canvas);
    }
}
