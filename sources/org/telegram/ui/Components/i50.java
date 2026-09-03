package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y50 b;

    public /* synthetic */ i50(y50 y50Var, int i10) {
        this.a = i10;
        this.b = y50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y50 y50Var = this.b;
                if (animator.equals(y50Var.D)) {
                    y50Var.D = null;
                    break;
                }
                break;
            case 1:
                y50 y50Var2 = this.b;
                if (y50Var2.Y0 != null) {
                    y50Var2.Y0 = null;
                    break;
                }
                break;
            default:
                y50 y50Var3 = this.b;
                if (animator.equals(y50Var3.T)) {
                    y50Var3.h(true);
                    y50Var3.T0 = false;
                    y50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
