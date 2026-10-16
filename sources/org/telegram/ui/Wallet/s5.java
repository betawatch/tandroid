package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class s5 extends FrameLayout {
    public final /* synthetic */ v5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(v5 v5Var, Context context) {
        super(context);
        this.a = v5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        v5 v5Var = this.a;
        v5Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (v5Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
