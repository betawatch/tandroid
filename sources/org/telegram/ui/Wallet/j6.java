package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j6 extends FrameLayout {
    public final /* synthetic */ m6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(m6 m6Var, Context context) {
        super(context);
        this.a = m6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        m6 m6Var = this.a;
        m6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (m6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
