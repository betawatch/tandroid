package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.dr b;

    public qk(org.telegram.ui.dr drVar) {
        this.b = drVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((sk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.dr drVar = this.b;
                View view = drVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((sk) drVar.d).X.r.removeView(view);
                break;
        }
    }

    public qk(org.telegram.ui.dr drVar, s4.o0 o0Var) {
        this.b = drVar;
    }
}
