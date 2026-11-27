// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f0c extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0c b;

    public /* synthetic */ f0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                if (n0cVar.b0 == animator) {
                    n0cVar.b0 = null;
                    break;
                }
                break;
            case 1:
                if (n0cVar.k0 == animator) {
                    n0cVar.k0 = null;
                }
                n0cVar.b(1.0f);
                break;
            default:
                if (n0cVar.K == animator) {
                    n0cVar.K = null;
                    break;
                }
                break;
        }
    }
}
