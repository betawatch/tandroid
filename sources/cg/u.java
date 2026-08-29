package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
