package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pi0 extends org.telegram.ui.Components.tn {
    public final /* synthetic */ ti0 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(ti0 ti0Var, Context context) {
        super(context, null, false, null);
        this.r0 = ti0Var;
    }

    @Override // org.telegram.ui.Components.tn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ti0 ti0Var = this.r0;
        ti0Var.S.setImageCoords(ti0Var.X.getAvatarImageView().getX(), ti0Var.X.getAvatarImageView().getY(), ti0Var.X.getAvatarImageView().getWidth(), ti0Var.X.getAvatarImageView().getHeight());
        if (ti0Var.U) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ti0Var.S.getCenterX(), ti0Var.S.getCenterY());
            ti0Var.S.draw(canvas);
            canvas.restore();
        }
        if (ti0Var.T) {
            int centerX = (int) (ti0Var.S.getCenterX() - (org.telegram.ui.ActionBar.f6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ti0Var.S.getCenterY() - (org.telegram.ui.ActionBar.f6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.f6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.f6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.f6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.tn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r0.S.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.tn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r0.S.onDetachedFromWindow();
    }
}
