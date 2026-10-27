package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
