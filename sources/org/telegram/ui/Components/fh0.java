package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fh0 extends jm0 {
    public final zf.y V2;
    public long W2;
    public final /* synthetic */ lh0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(lh0 lh0Var, Context context) {
        super(context, null);
        this.X2 = lh0Var;
        this.V2 = new zf.y(8);
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.X2.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.jm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        lh0 lh0Var = this.X2;
        if (lh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.W2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.W2 = elapsedRealtime;
            lh0Var.J += (abs * lh0Var.K) / 1800.0f;
            while (true) {
                f7 = lh0Var.J;
                float f10 = lh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    lh0Var.J = f7 - f10;
                }
            }
            lh0Var.I.setTranslate(f7, 0.0f);
            lh0Var.H.setLocalMatrix(lh0Var.I);
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
