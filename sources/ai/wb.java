package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class wb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb b;

    public /* synthetic */ wb(yb ybVar, int i10) {
        this.a = i10;
        this.b = ybVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kc kcVar = this.b.I0;
                kcVar.X = 0.0f;
                kc.k(kcVar);
                break;
            default:
                kc kcVar2 = this.b.I0;
                kcVar2.W = 0.0f;
                kcVar2.Z = 0.0f;
                kc.k(kcVar2);
                break;
        }
    }
}
