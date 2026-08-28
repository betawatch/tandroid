package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s30 b;

    public /* synthetic */ q30(s30 s30Var, int i9) {
        this.a = i9;
        this.b = s30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s30 s30Var = this.b;
                s30Var.f = null;
                if (!s30Var.D) {
                    np npVar = new np(this, 21);
                    s30Var.h = npVar;
                    AndroidUtilities.runOnUIThread(npVar, s30Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                s30 s30Var2 = this.b;
                s30Var2.f = null;
                if (!s30Var2.D) {
                    np npVar2 = new np(this, 22);
                    s30Var2.h = npVar2;
                    AndroidUtilities.runOnUIThread(npVar2, s30Var2.A);
                    break;
                }
                break;
            default:
                s30 s30Var3 = this.b;
                s30Var3.setVisibility(4);
                s30Var3.getClass();
                s30Var3.e = null;
                s30Var3.d = null;
                s30Var3.f = null;
                break;
        }
    }
}
