package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ly0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ ly0(my0 my0Var, int i3) {
        this.a = i3;
        this.b = my0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                my0 my0Var = this.b;
                if (my0Var.h != null) {
                    my0Var.h = null;
                    my0Var.e = 0.0f;
                    my0Var.g();
                    my0Var.n.e();
                    wv wvVar = my0Var.a;
                    if (wvVar != null) {
                        wvVar.onPause();
                        my0Var.a.onFragmentDestroy();
                        my0Var.removeAllViews();
                        my0Var.a = null;
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.r4, new Object[0]);
                    }
                    my0Var.d(false);
                    break;
                }
                break;
            default:
                my0 my0Var2 = this.b;
                if (my0Var2.h != null) {
                    my0Var2.h = null;
                    my0Var2.d(true);
                    break;
                }
                break;
        }
    }
}
