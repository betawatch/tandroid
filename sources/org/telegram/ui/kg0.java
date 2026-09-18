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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class kg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    public /* synthetic */ kg0(lg0 lg0Var, int i10) {
        this.a = i10;
        this.b = lg0Var;
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
                lg0 lg0Var = this.b;
                if (lg0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) lg0Var.getParent()).removeView(lg0Var);
                }
                lg0Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                lg0 lg0Var = this.b;
                lg0Var.c.setVisibility(8);
                int measuredWidth = (int) (lg0Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (lg0Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                lg0Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / ImageReceiver.DEFAULT_CROSSFADE_DURATION));
                lg0Var.d.setBackground(new BitmapDrawable(lg0Var.getContext().getResources(), createBitmap));
                lg0Var.d.setAlpha(0.0f);
                lg0Var.d.setVisibility(0);
                lg0Var.b.addView(lg0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
