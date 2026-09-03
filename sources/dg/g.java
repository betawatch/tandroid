package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (animator == jVar.U) {
                    jVar.U = null;
                    break;
                }
                break;
            case 1:
                j jVar2 = this.b;
                if (animator == jVar2.V) {
                    jVar2.V = null;
                    break;
                }
                break;
            case 2:
                j jVar3 = this.b;
                if (animator == jVar3.M) {
                    jVar3.M = null;
                    jVar3.L = 0.0f;
                    break;
                }
                break;
            case 3:
                j jVar4 = this.b;
                if (animator == jVar4.N) {
                    jVar4.N = null;
                    break;
                }
                break;
            default:
                j jVar5 = this.b;
                if (!jVar5.i0) {
                    AndroidUtilities.removeFromParent(jVar5.E);
                    jVar5.E = null;
                    break;
                }
                break;
        }
    }
}
