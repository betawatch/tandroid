package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wj0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj0 b;

    public /* synthetic */ k5(wj0 wj0Var, int i10) {
        this.a = i10;
        this.b = wj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                AndroidUtilities.removeFromParent(this.b);
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.H0.unlock();
                break;
            default:
                super.onAnimationEnd(animator);
                wj0 wj0Var = this.b;
                wj0Var.M = null;
                wj0Var.j0 = 0.0f;
                wj0Var.h0 = null;
                wj0Var.invalidate();
                break;
        }
    }
}
