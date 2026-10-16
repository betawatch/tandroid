package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ng0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ ng0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.b.h.requestFocus();
                    break;
                }
                break;
            default:
                og0 og0Var = this.b;
                if (og0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) og0Var.getParent()).removeView(og0Var);
                }
                og0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                og0Var.c.setVisibility(8);
                int measuredWidth = (int) (og0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (og0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                og0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                og0Var.d.setBackground(new BitmapDrawable(og0Var.getContext().getResources(), createBitmap));
                og0Var.d.setAlpha(0.0f);
                og0Var.d.setVisibility(0);
                og0Var.b.addView(og0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
