package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jg0 extends org.telegram.ui.Components.ao {
    public final /* synthetic */ og0 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(og0 og0Var, Context context) {
        super(context, null, false, null);
        this.B0 = og0Var;
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        og0 og0Var = this.B0;
        og0Var.X.y0(og0Var.c0.getAvatarImageView().getX(), og0Var.c0.getAvatarImageView().getY(), og0Var.c0.getAvatarImageView().getWidth(), og0Var.c0.getAvatarImageView().getHeight());
        if (og0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, og0Var.X.r(), og0Var.X.s());
            og0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (og0Var.Y) {
            int r10 = (int) (og0Var.X.r() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (og0Var.X.s() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.n6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.n6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.n6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.P();
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.R();
    }
}
