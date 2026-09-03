package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ w c;

    public /* synthetic */ u(w wVar, v vVar, int i10) {
        this.a = i10;
        this.c = wVar;
        this.b = vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f = null;
                w.a(this.c);
                break;
            default:
                this.b.f = null;
                w.a(this.c);
                break;
        }
    }
}
