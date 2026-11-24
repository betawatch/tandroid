// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ke extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne b;

    public /* synthetic */ ke(ne neVar, byte b) {
        this.a = b;
        this.b = neVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ne neVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = neVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(neVar);
                    break;
                }
                break;
            default:
                neVar.t().removeView(neVar.n1);
                DialogInterface.OnDismissListener onDismissListener = neVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(neVar);
                    break;
                }
                break;
        }
    }
}
