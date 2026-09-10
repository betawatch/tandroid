package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s40 b;

    public /* synthetic */ q40(s40 s40Var, int i10) {
        this.a = i10;
        this.b = s40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s40 s40Var = this.b;
                s40Var.f = null;
                if (!s40Var.H) {
                    dq dqVar = new dq(this, 21);
                    s40Var.h = dqVar;
                    AndroidUtilities.runOnUIThread(dqVar, s40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                s40 s40Var2 = this.b;
                s40Var2.f = null;
                if (!s40Var2.H) {
                    dq dqVar2 = new dq(this, 22);
                    s40Var2.h = dqVar2;
                    AndroidUtilities.runOnUIThread(dqVar2, s40Var2.E);
                    break;
                }
                break;
            default:
                s40 s40Var3 = this.b;
                s40Var3.setVisibility(4);
                s40Var3.getClass();
                s40Var3.e = null;
                s40Var3.d = null;
                s40Var3.f = null;
                break;
        }
    }
}
