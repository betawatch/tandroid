package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class is0 extends vg.n1 {
    public final /* synthetic */ js0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(js0 js0Var, Context context) {
        super(context);
        this.O = js0Var;
    }

    @Override // vg.n1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            js0 js0Var = this.O;
            js0Var.d.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, js0Var.d.n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), js0Var.d.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
