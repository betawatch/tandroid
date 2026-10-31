package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p6 extends FrameLayout {
    public final /* synthetic */ s6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(s6 s6Var, Context context) {
        super(context);
        this.a = s6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        s6 s6Var = this.a;
        s6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (s6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
