package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
