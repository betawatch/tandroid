package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
