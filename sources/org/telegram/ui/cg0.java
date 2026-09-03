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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dg0 b;

    public /* synthetic */ cg0(dg0 dg0Var, int i10) {
        this.a = i10;
        this.b = dg0Var;
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
                dg0 dg0Var = this.b;
                if (dg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) dg0Var.getParent()).removeView(dg0Var);
                }
                dg0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                dg0 dg0Var = this.b;
                dg0Var.c.setVisibility(8);
                int measuredWidth = (int) (dg0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (dg0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                dg0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                dg0Var.d.setBackground(new BitmapDrawable(dg0Var.getContext().getResources(), createBitmap));
                dg0Var.d.setAlpha(0.0f);
                dg0Var.d.setVisibility(0);
                dg0Var.b.addView(dg0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
