package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fg0 extends org.telegram.ui.Components.sn {
    public final /* synthetic */ jg0 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg0(jg0 jg0Var, Context context) {
        super(context, null, false, null);
        this.B0 = jg0Var;
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        jg0 jg0Var = this.B0;
        jg0Var.X.y0(jg0Var.c0.getAvatarImageView().getX(), jg0Var.c0.getAvatarImageView().getY(), jg0Var.c0.getAvatarImageView().getWidth(), jg0Var.c0.getAvatarImageView().getHeight());
        if (jg0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, jg0Var.X.r(), jg0Var.X.s());
            jg0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (jg0Var.Y) {
            int r10 = (int) (jg0Var.X.r() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (jg0Var.X.s() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.P();
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.R();
    }
}
