package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c7 extends FrameLayout {
    public final /* synthetic */ f7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(f7 f7Var, Context context) {
        super(context);
        this.a = f7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        f7 f7Var = this.a;
        f7Var.j.c(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (f7Var.j.d()) {
            postInvalidateOnAnimation();
        }
    }
}
