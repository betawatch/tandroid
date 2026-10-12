package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class mj0 extends org.telegram.ui.Components.ro {
    public final /* synthetic */ qj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(qj0 qj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = qj0Var;
    }

    @Override // org.telegram.ui.Components.ro, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qj0 qj0Var = this.v0;
        qj0Var.W.setImageCoords(qj0Var.b0.getAvatarImageView().getX(), qj0Var.b0.getAvatarImageView().getY(), qj0Var.b0.getAvatarImageView().getWidth(), qj0Var.b0.getAvatarImageView().getHeight());
        if (qj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, qj0Var.W.getCenterX(), qj0Var.W.getCenterY());
            qj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (qj0Var.X) {
            int centerX = (int) (qj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (qj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ro, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ro, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
