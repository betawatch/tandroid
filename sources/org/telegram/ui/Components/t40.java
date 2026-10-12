package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class t40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v40 b;

    public /* synthetic */ t40(v40 v40Var, int i10) {
        this.a = i10;
        this.b = v40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v40 v40Var = this.b;
                v40Var.f = null;
                if (!v40Var.H) {
                    kq kqVar = new kq(this, 21);
                    v40Var.h = kqVar;
                    AndroidUtilities.runOnUIThread(kqVar, v40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                v40 v40Var2 = this.b;
                v40Var2.f = null;
                if (!v40Var2.H) {
                    kq kqVar2 = new kq(this, 22);
                    v40Var2.h = kqVar2;
                    AndroidUtilities.runOnUIThread(kqVar2, v40Var2.E);
                    break;
                }
                break;
            default:
                v40 v40Var3 = this.b;
                v40Var3.setVisibility(4);
                v40Var3.getClass();
                v40Var3.e = null;
                v40Var3.d = null;
                v40Var3.f = null;
                break;
        }
    }
}
