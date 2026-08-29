package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class fa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ fa(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gb gbVar = this.b;
                gbVar.f2 = null;
                gbVar.r.setTranslationY(0.0f);
                gbVar.r.b(0.0f);
                break;
            case 1:
                gb gbVar2 = this.b;
                gbVar2.n.removeView(gbVar2.I0);
                gbVar2.I0 = null;
                gbVar2.j2 = null;
                gbVar2.l2 = null;
                gbVar2.Y0.H.b(gbVar2.b0 != 1);
                break;
            default:
                gb gbVar3 = this.b;
                pa paVar = gbVar3.y2;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) gbVar3.y2.getParent()).removeView(gbVar3.y2);
                    }
                    gbVar3.y2 = null;
                }
                gbVar3.A2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
