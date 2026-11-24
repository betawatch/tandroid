// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ah6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bh6 b;

    public /* synthetic */ ah6(bh6 bh6Var, byte b) {
        this.a = b;
        this.b = bh6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        bh6 bh6Var = this.b;
        switch (b) {
            case 0:
                if (gm.A1()) {
                    bh6Var.h.requestFocus();
                    break;
                }
                break;
            default:
                if (bh6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) bh6Var.getParent()).removeView(bh6Var);
                }
                bh6Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                bh6 bh6Var = this.b;
                bh6Var.c.setVisibility(8);
                int measuredWidth = (int) (bh6Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (bh6Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(cmb.w0(null, cmb.c6, false));
                bh6Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / nm7.f2));
                bh6Var.d.setBackground(new BitmapDrawable(bh6Var.getContext().getResources(), createBitmap));
                bh6Var.d.setAlpha(0.0f);
                bh6Var.d.setVisibility(0);
                bh6Var.b.addView(bh6Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
