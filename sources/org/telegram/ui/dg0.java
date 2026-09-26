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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class dg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ dg0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
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
                eg0 eg0Var = this.b;
                if (eg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eg0Var.getParent()).removeView(eg0Var);
                }
                eg0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                eg0 eg0Var = this.b;
                eg0Var.c.setVisibility(8);
                int measuredWidth = (int) (eg0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (eg0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                eg0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                eg0Var.d.setBackground(new BitmapDrawable(eg0Var.getContext().getResources(), createBitmap));
                eg0Var.d.setAlpha(0.0f);
                eg0Var.d.setVisibility(0);
                eg0Var.b.addView(eg0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
