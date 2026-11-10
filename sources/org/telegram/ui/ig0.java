package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ig0 extends org.telegram.ui.Components.jn {
    public final /* synthetic */ mg0 A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(mg0 mg0Var, Context context) {
        super(context, null, false, null);
        this.A0 = mg0Var;
    }

    @Override // org.telegram.ui.Components.jn, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        mg0 mg0Var = this.A0;
        mg0Var.W.y0(mg0Var.b0.getAvatarImageView().getX(), mg0Var.b0.getAvatarImageView().getY(), mg0Var.b0.getAvatarImageView().getWidth(), mg0Var.b0.getAvatarImageView().getHeight());
        if (mg0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, mg0Var.W.r(), mg0Var.W.s());
            mg0Var.W.h(canvas, null);
            canvas.restore();
        }
        if (mg0Var.X) {
            int r10 = (int) (mg0Var.W.r() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicWidth() / 2));
            int s5 = (int) (mg0Var.W.s() - (org.telegram.ui.ActionBar.m6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.m6.U0;
            drawable.setBounds(r10, s5, drawable.getIntrinsicWidth() + r10, org.telegram.ui.ActionBar.m6.U0.getIntrinsicHeight() + s5);
            org.telegram.ui.ActionBar.m6.U0.draw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.jn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.P();
    }

    @Override // org.telegram.ui.Components.jn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.R();
    }
}
