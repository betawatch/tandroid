package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class vb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ vb(xb xbVar, int i10) {
        this.a = i10;
        this.b = xbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jc jcVar = this.b.I0;
                jcVar.X = 0.0f;
                jc.k(jcVar);
                break;
            default:
                jc jcVar2 = this.b.I0;
                jcVar2.W = 0.0f;
                jcVar2.Z = 0.0f;
                jc.k(jcVar2);
                break;
        }
    }
}
