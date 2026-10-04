package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dj0 extends org.telegram.ui.Components.ho {
    public final /* synthetic */ hj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(hj0 hj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = hj0Var;
    }

    @Override // org.telegram.ui.Components.ho, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        hj0 hj0Var = this.v0;
        hj0Var.W.setImageCoords(hj0Var.b0.getAvatarImageView().getX(), hj0Var.b0.getAvatarImageView().getY(), hj0Var.b0.getAvatarImageView().getWidth(), hj0Var.b0.getAvatarImageView().getHeight());
        if (hj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, hj0Var.W.getCenterX(), hj0Var.W.getCenterY());
            hj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (hj0Var.X) {
            int centerX = (int) (hj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (hj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.i6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.i6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ho, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ho, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
