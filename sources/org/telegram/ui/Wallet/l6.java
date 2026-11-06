package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
    public final /* synthetic */ o6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(o6 o6Var, Context context) {
        super(context);
        this.a = o6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        o6 o6Var = this.a;
        o6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (o6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
