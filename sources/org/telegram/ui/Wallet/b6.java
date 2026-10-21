package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
