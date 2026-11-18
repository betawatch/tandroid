package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ig0 extends org.telegram.ui.Components.ao {
    public final /* synthetic */ ng0 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(ng0 ng0Var, Context context) {
        super(context, null, false, null);
        this.B0 = ng0Var;
    }

    @Override // org.telegram.ui.Components.ao, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ng0 ng0Var = this.B0;
        ng0Var.X.y0(ng0Var.c0.getAvatarImageView().getX(), ng0Var.c0.getAvatarImageView().getY(), ng0Var.c0.getAvatarImageView().getWidth(), ng0Var.c0.getAvatarImageView().getHeight());
        if (ng0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, ng0Var.X.r(), ng0Var.X.s());
            ng0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (ng0Var.Y) {
            int r10 = (int) (ng0Var.X.r() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (ng0Var.X.s() - (org.telegram.ui.ActionBar.n6.U0.getIntrinsicHeight() / 2));
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
