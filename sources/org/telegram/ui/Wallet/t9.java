package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class t9 extends FrameLayout {
    public final /* synthetic */ v9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(v9 v9Var, Context context) {
        super(context);
        this.a = v9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        v9 v9Var = this.a;
        v9Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (v9Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
