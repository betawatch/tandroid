package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class v9 extends FrameLayout {
    public final /* synthetic */ x9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(x9 x9Var, Context context) {
        super(context);
        this.a = x9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        x9 x9Var = this.a;
        x9Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (x9Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
