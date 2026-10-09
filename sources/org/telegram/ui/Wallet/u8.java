package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u8 extends FrameLayout {
    public final /* synthetic */ w8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(w8 w8Var, Context context) {
        super(context);
        this.a = w8Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        w8 w8Var = this.a;
        w8Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (w8Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
