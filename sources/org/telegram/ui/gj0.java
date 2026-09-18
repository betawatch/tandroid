package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class gj0 extends org.telegram.ui.Components.eo {
    public final /* synthetic */ kj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(kj0 kj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = kj0Var;
    }

    @Override // org.telegram.ui.Components.eo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        kj0 kj0Var = this.v0;
        kj0Var.W.setImageCoords(kj0Var.b0.getAvatarImageView().getX(), kj0Var.b0.getAvatarImageView().getY(), kj0Var.b0.getAvatarImageView().getWidth(), kj0Var.b0.getAvatarImageView().getHeight());
        if (kj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, kj0Var.W.getCenterX(), kj0Var.W.getCenterY());
            kj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (kj0Var.X) {
            int centerX = (int) (kj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (kj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.eo, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.eo, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
