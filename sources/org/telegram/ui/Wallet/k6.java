package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class k6 extends FrameLayout {
    public final /* synthetic */ n6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(n6 n6Var, Context context) {
        super(context);
        this.a = n6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        n6 n6Var = this.a;
        n6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (n6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
