package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ih0 extends mm0 {
    public final zf.y Y2;
    public long Z2;
    public final /* synthetic */ oh0 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(oh0 oh0Var, Context context) {
        super(context, null);
        this.a3 = oh0Var;
        this.Y2 = new zf.y(8);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (this.a3.E + AndroidUtilities.statusBarHeight));
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        oh0 oh0Var = this.a3;
        if (oh0Var.L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(this.Z2 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            this.Z2 = elapsedRealtime;
            oh0Var.J += (abs * oh0Var.K) / 1800.0f;
            while (true) {
                f7 = oh0Var.J;
                float f10 = oh0Var.K * 2.0f;
                if (f7 < f10) {
                    break;
                } else {
                    oh0Var.J = f7 - f10;
                }
            }
            oh0Var.I.setTranslate(f7, 0.0f);
            oh0Var.H.setLocalMatrix(oh0Var.I);
            g1();
            invalidate();
        }
        super.dispatchDraw(canvas);
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        zf.y yVar = this.Y2;
        yVar.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
        yVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, this.n2));
        yVar.draw(canvas);
    }
}
