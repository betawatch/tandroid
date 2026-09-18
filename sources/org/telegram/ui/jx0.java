package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jx0 extends rg.p1 {
    public final /* synthetic */ kx0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(kx0 kx0Var, Context context) {
        super(context);
        this.N = kx0Var;
    }

    @Override // rg.p1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            kx0 kx0Var = this.N;
            kx0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, kx0Var.d.n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), kx0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
