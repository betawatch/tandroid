package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ld0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ md0 b;

    public /* synthetic */ ld0(md0 md0Var, int i3) {
        this.a = i3;
        this.b = md0Var;
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
                md0 md0Var = this.b;
                if (md0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) md0Var.getParent()).removeView(md0Var);
                }
                md0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                md0 md0Var = this.b;
                md0Var.c.setVisibility(8);
                int measuredWidth = (int) (md0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (md0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                md0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.hs.g2));
                md0Var.d.setBackground(new BitmapDrawable(md0Var.getContext().getResources(), createBitmap));
                md0Var.d.setAlpha(0.0f);
                md0Var.d.setVisibility(0);
                md0Var.b.addView(md0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
