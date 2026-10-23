package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class j40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q50 b;

    public /* synthetic */ j40(q50 q50Var, int i10) {
        this.a = i10;
        this.b = q50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q50 q50Var = this.b;
                q50Var.V.setVisibility(4);
                q50Var.W.setVisibility(4);
                q50Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                q50 q50Var2 = this.b;
                q50Var2.h1 = null;
                q50Var2.g1.setColor(q50Var2.T1 == 3 ? -1163700 : -12761513);
                q50Var2.f1.invalidate();
                break;
        }
    }
}
