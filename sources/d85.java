// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d85 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ka5 b;
    public final /* synthetic */ j95 c;

    public /* synthetic */ d85(j95 j95Var, ka5 ka5Var, byte b) {
        this.a = b;
        this.c = j95Var;
        this.b = ka5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        j95 j95Var = this.c;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                if (ka5Var.getParent() != null) {
                    j95Var.b.removeView(ka5Var);
                    break;
                }
                break;
            default:
                if (ka5Var.getParent() != null) {
                    j95Var.b.removeView(ka5Var);
                    break;
                }
                break;
        }
    }
}
