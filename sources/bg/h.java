package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ h(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (animator == kVar.T) {
                    kVar.T = null;
                    break;
                }
                break;
            case 1:
                k kVar2 = this.b;
                if (animator == kVar2.U) {
                    kVar2.U = null;
                    break;
                }
                break;
            case 2:
                k kVar3 = this.b;
                if (animator == kVar3.L) {
                    kVar3.L = null;
                    kVar3.K = 0.0f;
                    break;
                }
                break;
            case 3:
                k kVar4 = this.b;
                if (animator == kVar4.M) {
                    kVar4.M = null;
                    break;
                }
                break;
            default:
                k kVar5 = this.b;
                if (!kVar5.h0) {
                    AndroidUtilities.removeFromParent(kVar5.D);
                    kVar5.D = null;
                    break;
                }
                break;
        }
    }
}
