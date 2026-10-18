package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h6 extends FrameLayout {
    public final /* synthetic */ k6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(k6 k6Var, Context context) {
        super(context);
        this.a = k6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        k6 k6Var = this.a;
        k6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (k6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
