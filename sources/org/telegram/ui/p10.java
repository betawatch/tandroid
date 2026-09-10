package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dr b;

    public p10(dr drVar) {
        this.b = drVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((z10) this.b.d).l0.unlock();
                break;
            default:
                dr drVar = this.b;
                View view = drVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((z10) drVar.d).b.removeView(view);
                break;
        }
    }

    public p10(dr drVar, s4.o0 o0Var) {
        this.b = drVar;
    }
}
