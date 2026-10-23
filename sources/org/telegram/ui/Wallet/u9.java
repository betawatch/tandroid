package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class u9 extends FrameLayout {
    public final /* synthetic */ w9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(w9 w9Var, Context context) {
        super(context);
        this.a = w9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        w9 w9Var = this.a;
        w9Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (w9Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
