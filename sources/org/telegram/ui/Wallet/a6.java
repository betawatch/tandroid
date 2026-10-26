package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout {
    public final /* synthetic */ d6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(d6 d6Var, Context context) {
        super(context);
        this.a = d6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        d6 d6Var = this.a;
        d6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (d6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
