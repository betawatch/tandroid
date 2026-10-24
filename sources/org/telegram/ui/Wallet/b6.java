package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout {
    public final /* synthetic */ e6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(e6 e6Var, Context context) {
        super(context);
        this.a = e6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e6 e6Var = this.a;
        e6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
