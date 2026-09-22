package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fj0 extends org.telegram.ui.Components.eo {
    public final /* synthetic */ jj0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj0(jj0 jj0Var, Context context) {
        super(context, null, false, null);
        this.v0 = jj0Var;
    }

    @Override // org.telegram.ui.Components.eo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        jj0 jj0Var = this.v0;
        jj0Var.W.setImageCoords(jj0Var.b0.getAvatarImageView().getX(), jj0Var.b0.getAvatarImageView().getY(), jj0Var.b0.getAvatarImageView().getWidth(), jj0Var.b0.getAvatarImageView().getHeight());
        if (jj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, jj0Var.W.getCenterX(), jj0Var.W.getCenterY());
            jj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (jj0Var.X) {
            int centerX = (int) (jj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (jj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.i6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.i6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.i6.U0.draw(canvas);
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
