package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class wg0 extends zl0 {
    public final yf.y e3;
    public long f3;
    public final /* synthetic */ ch0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ch0 ch0Var, Context context) {
        super(context, null);
        this.g3 = ch0Var;
        this.e3 = new yf.y(8);
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        return f7 >= ((float) (this.g3.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ch0 ch0Var = this.g3;
        if (ch0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.f3 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.f3 = elapsedRealtime;
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
            h1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.e3;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, this.p2));
        yVar.draw(canvas);
    }
}
