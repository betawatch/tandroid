package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b7 extends FrameLayout {
    public final /* synthetic */ e7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(e7 e7Var, Context context) {
        super(context);
        this.a = e7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        e7 e7Var = this.a;
        e7Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (e7Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
