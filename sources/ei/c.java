package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                break;
            default:
                d dVar2 = this.b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                break;
        }
    }
}
