package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
