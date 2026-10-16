package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kh0 extends mm0 {
    public final zf.z V2;
    public long W2;
    public final /* synthetic */ qh0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(qh0 qh0Var, Context context) {
        super(context, null);
        this.X2 = qh0Var;
        this.V2 = new zf.z(8);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.X2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        qh0 qh0Var = this.X2;
        if (qh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            qh0Var.J += (abs * qh0Var.K) / 1800.0f;
            while (true) {
                f7 = qh0Var.J;
                float f10 = qh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    qh0Var.J = f7 - f10;
                }
            }
            qh0Var.I.setTranslate(f7, 0.0f);
            qh0Var.H.setLocalMatrix(qh0Var.I);
            f1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        zf.z zVar = this.V2;
        zVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        zVar.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i5, this.n2));
        zVar.draw(canvas);
    }
}
