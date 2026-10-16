package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lj0 extends org.telegram.ui.Components.ro {
    public final /* synthetic */ pj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(pj0 pj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = pj0Var;
    }

    @Override // org.telegram.ui.Components.ro, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        pj0 pj0Var = this.v0;
        pj0Var.W.setImageCoords(pj0Var.b0.getAvatarImageView().getX(), pj0Var.b0.getAvatarImageView().getY(), pj0Var.b0.getAvatarImageView().getWidth(), pj0Var.b0.getAvatarImageView().getHeight());
        if (pj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, pj0Var.W.getCenterX(), pj0Var.W.getCenterY());
            pj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (pj0Var.X) {
            int centerX = (int) (pj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (pj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
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
