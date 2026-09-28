package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class j40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l40 b;

    public /* synthetic */ j40(l40 l40Var, int i10) {
        this.a = i10;
        this.b = l40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l40 l40Var = this.b;
                l40Var.f = null;
                if (!l40Var.H) {
                    zp zpVar = new zp(this, 21);
                    l40Var.h = zpVar;
                    AndroidUtilities.runOnUIThread(zpVar, l40Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                l40 l40Var2 = this.b;
                l40Var2.f = null;
                if (!l40Var2.H) {
                    zp zpVar2 = new zp(this, 22);
                    l40Var2.h = zpVar2;
                    AndroidUtilities.runOnUIThread(zpVar2, l40Var2.E);
                    break;
                }
                break;
            default:
                l40 l40Var3 = this.b;
                l40Var3.setVisibility(4);
                l40Var3.getClass();
                l40Var3.e = null;
                l40Var3.d = null;
                l40Var3.f = null;
                break;
        }
    }
}
