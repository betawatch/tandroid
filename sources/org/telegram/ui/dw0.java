package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dw0 extends zf.p1 {
    public final /* synthetic */ ew0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(ew0 ew0Var, Context context) {
        super(context);
        this.J = ew0Var;
    }

    @Override // zf.p1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            ew0 ew0Var = this.J;
            ew0Var.d.n.j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ew0Var.d.n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ew0Var.d.n.j0.f);
        }
        super.dispatchDraw(canvas);
    }
}
