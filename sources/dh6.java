// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dh6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eh6 b;

    public /* synthetic */ dh6(eh6 eh6Var, byte b) {
        this.a = b;
        this.b = eh6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        eh6 eh6Var = this.b;
        switch (b) {
            case 0:
                if (hl.A1()) {
                    eh6Var.h.requestFocus();
                    break;
                }
                break;
            default:
                if (eh6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eh6Var.getParent()).removeView(eh6Var);
                }
                eh6Var.c.setVisibility(0);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                eh6 eh6Var = this.b;
                eh6Var.c.setVisibility(8);
                int measuredWidth = (int) (eh6Var.b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (eh6Var.b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(aob.w0(null, aob.d6, false));
                eh6Var.b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / jn7.f2));
                eh6Var.d.setBackground(new BitmapDrawable(eh6Var.getContext().getResources(), createBitmap));
                eh6Var.d.setAlpha(0.0f);
                eh6Var.d.setVisibility(0);
                eh6Var.b.addView(eh6Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
