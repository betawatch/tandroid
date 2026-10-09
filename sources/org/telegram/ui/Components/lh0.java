package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lh0 extends qm0 {
    public final yf.y V2;
    public long W2;
    public final /* synthetic */ sh0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh0(sh0 sh0Var, Context context) {
        super(context, null);
        this.X2 = sh0Var;
        this.V2 = new yf.y(8);
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.X2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        sh0 sh0Var = this.X2;
        if (sh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            sh0Var.J += (abs * sh0Var.K) / 1800.0f;
            while (true) {
                f7 = sh0Var.J;
                float f10 = sh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    sh0Var.J = f7 - f10;
                }
            }
            sh0Var.I.setTranslate(f7, 0.0f);
            sh0Var.H.setLocalMatrix(sh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        yf.y yVar = this.V2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i5, this.n2));
        yVar.draw(canvas);
    }
}
