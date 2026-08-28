package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ck extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.nq b;

    public ck(org.telegram.ui.nq nqVar) {
        this.b = nqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ek) this.b.d).Q.unlock();
                break;
            default:
                org.telegram.ui.nq nqVar = this.b;
                View view = nqVar.b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((ek) nqVar.d).T.r.removeView(view);
                break;
        }
    }

    public ck(org.telegram.ui.nq nqVar, f2.z0 z0Var) {
        this.b = nqVar;
    }
}
