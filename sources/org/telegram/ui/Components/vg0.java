package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vg0 extends yl0 {
    public final yf.y X2;
    public long Y2;
    public final /* synthetic */ ch0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(ch0 ch0Var, Context context) {
        super(context, null);
        this.Z2 = ch0Var;
        this.X2 = new yf.y(8);
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.Z2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.yl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ch0 ch0Var = this.Z2;
        if (ch0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Y2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Y2 = elapsedRealtime;
            ch0Var.J += (abs * ch0Var.K) / 1800.0f;
            while (true) {
                f7 = ch0Var.J;
                float f10 = ch0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    ch0Var.J = f7 - f10;
                }
            }
            ch0Var.I.setTranslate(f7, 0.0f);
            ch0Var.H.setLocalMatrix(ch0Var.I);
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
