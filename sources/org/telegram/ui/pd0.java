package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;

    public /* synthetic */ pd0(qd0 qd0Var, int i7) {
        this.a = i7;
        this.b = qd0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.b.h.requestFocus();
                    break;
                }
                break;
            default:
                qd0 qd0Var = this.b;
                if (qd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qd0Var.getParent()).removeView(qd0Var);
                }
                qd0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                qd0 qd0Var = this.b;
                qd0Var.c.setVisibility(8);
                int measuredWidth = (int) (qd0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (qd0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
                qd0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ks.g2));
                qd0Var.d.setBackground(new BitmapDrawable(qd0Var.getContext().getResources(), createBitmap));
                qd0Var.d.setAlpha(0.0f);
                qd0Var.d.setVisibility(0);
                qd0Var.b.addView(qd0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
