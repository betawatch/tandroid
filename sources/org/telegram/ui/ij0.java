package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ij0 extends org.telegram.ui.Components.eo {
    public final /* synthetic */ mj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(mj0 mj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = mj0Var;
    }

    @Override // org.telegram.ui.Components.eo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mj0 mj0Var = this.v0;
        mj0Var.W.setImageCoords(mj0Var.b0.getAvatarImageView().getX(), mj0Var.b0.getAvatarImageView().getY(), mj0Var.b0.getAvatarImageView().getWidth(), mj0Var.b0.getAvatarImageView().getHeight());
        if (mj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, mj0Var.W.getCenterX(), mj0Var.W.getCenterY());
            mj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (mj0Var.X) {
            int centerX = (int) (mj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (mj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
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
