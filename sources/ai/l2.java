package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.a) {
            case 0:
                pf.e eVar = m2.Z.L;
                if (eVar != null && (view = eVar.j) != null) {
                    eVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                break;
            case 2:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
