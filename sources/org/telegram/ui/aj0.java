package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class aj0 extends org.telegram.ui.Components.fo {
    public final /* synthetic */ ej0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(ej0 ej0Var, Context context) {
        super(context, null, false, null);
        this.v0 = ej0Var;
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ej0 ej0Var = this.v0;
        ej0Var.W.setImageCoords(ej0Var.b0.getAvatarImageView().getX(), ej0Var.b0.getAvatarImageView().getY(), ej0Var.b0.getAvatarImageView().getWidth(), ej0Var.b0.getAvatarImageView().getHeight());
        if (ej0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ej0Var.W.getCenterX(), ej0Var.W.getCenterY());
            ej0Var.W.draw(canvas);
            canvas.restore();
        }
        if (ej0Var.X) {
            int centerX = (int) (ej0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (ej0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.fo, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.W.onDetachedFromWindow();
    }
}
