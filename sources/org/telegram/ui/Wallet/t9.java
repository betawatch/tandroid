package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
