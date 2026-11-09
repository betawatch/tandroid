package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class x9 extends FrameLayout {
    public final /* synthetic */ z9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(z9 z9Var, Context context) {
        super(context);
        this.a = z9Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        z9 z9Var = this.a;
        z9Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (z9Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
