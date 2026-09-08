package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ r(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        b0 b0Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b0Var.c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    b0Var.f.setFocusableInTouchMode(false);
                    break;
                }
                break;
            case 1:
                b0Var.n.setFocusableInTouchMode(true);
                break;
            case 2:
                b0Var.w.setVisibility(4);
                break;
            default:
                b0Var.n.setFocusableInTouchMode(false);
                b0Var.f.setVisibility(4);
                break;
        }
    }
}
