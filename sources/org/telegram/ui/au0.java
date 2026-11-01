package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class au0 extends kg.a2 {
    public final /* synthetic */ bu0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au0(bu0 bu0Var, Context context) {
        super(context);
        this.N = bu0Var;
    }

    @Override // kg.a2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            bu0 bu0Var = this.N;
            bu0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, bu0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), bu0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
