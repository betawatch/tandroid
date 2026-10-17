package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class eh0 extends im0 {
    public final zf.y V2;
    public long W2;
    public final /* synthetic */ kh0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(kh0 kh0Var, Context context) {
        super(context, null);
        this.X2 = kh0Var;
        this.V2 = new zf.y(8);
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.X2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        kh0 kh0Var = this.X2;
        if (kh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            kh0Var.J += (abs * kh0Var.K) / 1800.0f;
            while (true) {
                f7 = kh0Var.J;
                float f10 = kh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    kh0Var.J = f7 - f10;
                }
            }
            kh0Var.I.setTranslate(f7, 0.0f);
            kh0Var.H.setLocalMatrix(kh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        zf.y yVar = this.V2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, this.n2));
        yVar.draw(canvas);
    }
}
