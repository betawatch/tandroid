package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bu0 extends kg.a2 {
    public final /* synthetic */ cu0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(cu0 cu0Var, Context context) {
        super(context);
        this.N = cu0Var;
    }

    @Override // kg.a2, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            cu0 cu0Var = this.N;
            cu0Var.d.n.n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, cu0Var.d.n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), cu0Var.d.n.n0.f);
        }
        super.dispatchDraw(canvas);
    }
}
