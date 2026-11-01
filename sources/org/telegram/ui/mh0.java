package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mh0 extends org.telegram.ui.Components.sn {
    public final /* synthetic */ qh0 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(qh0 qh0Var, Context context) {
        super(context, null, false, null);
        this.A0 = qh0Var;
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qh0 qh0Var = this.A0;
        qh0Var.W.y0(qh0Var.b0.getAvatarImageView().getX(), qh0Var.b0.getAvatarImageView().getY(), qh0Var.b0.getAvatarImageView().getWidth(), qh0Var.b0.getAvatarImageView().getHeight());
        if (qh0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, qh0Var.W.r(), qh0Var.W.s());
            qh0Var.W.h(canvas, null);
            canvas.restore();
        }
        if (qh0Var.X) {
            int r10 = (int) (qh0Var.W.r() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicWidth() / 2));
            int s10 = (int) (qh0Var.W.s() - (org.telegram.ui.ActionBar.t6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.t6.U0;
            drawable.setBounds(r10, s10, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.t6.U0.getIntrinsicHeight() + s10);
            org.telegram.ui.ActionBar.t6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.P();
    }

    @Override // org.telegram.ui.Components.sn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.R();
    }
}
