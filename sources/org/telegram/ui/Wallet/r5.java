package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class r5 extends FrameLayout {
    public final /* synthetic */ u5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(u5 u5Var, Context context) {
        super(context);
        this.a = u5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        u5 u5Var = this.a;
        u5Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (u5Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
