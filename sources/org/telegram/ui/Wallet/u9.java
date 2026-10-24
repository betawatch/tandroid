package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
