package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ m(s sVar, int i9) {
        this.a = i9;
        this.b = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.a;
        s sVar = this.b;
        switch (i9) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f.setFocusableInTouchMode(false);
                    break;
                }
                break;
            case 1:
                sVar.n.setFocusableInTouchMode(true);
                break;
            case 2:
                sVar.w.setVisibility(4);
                break;
            default:
                sVar.n.setFocusableInTouchMode(false);
                sVar.f.setVisibility(4);
                break;
        }
    }
}
