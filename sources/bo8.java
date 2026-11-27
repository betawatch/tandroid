// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bo8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fo8 b;

    public /* synthetic */ bo8(fo8 fo8Var, byte b) {
        this.a = b;
        this.b = fo8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fo8 fo8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    break;
                }
                break;
            case 1:
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                if (fo8Var.getParent() != null) {
                    ((ViewGroup) fo8Var.getParent()).removeView(fo8Var);
                    break;
                }
                break;
        }
    }
}
