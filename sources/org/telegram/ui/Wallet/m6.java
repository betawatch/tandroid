package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class m6 extends FrameLayout {
    public final /* synthetic */ p6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(p6 p6Var, Context context) {
        super(context);
        this.a = p6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        p6 p6Var = this.a;
        p6Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (p6Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
