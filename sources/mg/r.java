package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import nh.j1;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator, boolean z4) {
        View view;
        switch (this.a) {
            case 1:
                bf.f fVar = j1.W.I;
                if (fVar != null && (view = fVar.j) != null) {
                    fVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z4);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
