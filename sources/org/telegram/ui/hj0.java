package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hj0 extends org.telegram.ui.Components.co {
    public final /* synthetic */ lj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(lj0 lj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = lj0Var;
    }

    @Override // org.telegram.ui.Components.co, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lj0 lj0Var = this.v0;
        lj0Var.W.setImageCoords(lj0Var.b0.getAvatarImageView().getX(), lj0Var.b0.getAvatarImageView().getY(), lj0Var.b0.getAvatarImageView().getWidth(), lj0Var.b0.getAvatarImageView().getHeight());
        if (lj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, lj0Var.W.getCenterX(), lj0Var.W.getCenterY());
            lj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (lj0Var.X) {
            int centerX = (int) (lj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (lj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.co, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.co, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
