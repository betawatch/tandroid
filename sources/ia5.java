// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ia5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ka5 b;

    public /* synthetic */ ia5(ka5 ka5Var, byte b) {
        this.a = b;
        this.b = ka5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                ka5Var.F = false;
                ka5Var.invalidate();
                break;
            case 1:
                ja5 ja5Var = ka5Var.b0;
                float f = ka5Var.W ? 0.0f : 1.0f;
                ka5Var.a0 = f;
                ja5Var.setAlpha(f);
                ja5Var.setVisibility(ka5Var.W ? 8 : 0);
                ka5Var.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                ka5Var.H0 = null;
                ga5 ga5Var = ka5Var.a;
                ga5Var.setRotationY(0.0f);
                if (!ka5Var.I0) {
                    ga5Var.d.a();
                    break;
                }
                break;
            case 3:
                ka5Var.F = false;
                break;
            default:
                ka5Var.F = false;
                break;
        }
    }
}
