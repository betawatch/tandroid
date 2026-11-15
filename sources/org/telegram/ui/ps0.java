package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ps0 extends ug.l1 {
    public final /* synthetic */ qs0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(qs0 qs0Var, Context context) {
        super(context);
        this.O = qs0Var;
    }

    @Override // ug.l1, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.r.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(r0.getLeft(), r0.getTop(), r0.getRight(), r0.getBottom());
            qs0 qs0Var = this.O;
            qs0Var.d.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, qs0Var.d.n.P);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), qs0Var.d.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
