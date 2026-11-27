// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ld extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ od b;

    public /* synthetic */ ld(od odVar, byte b) {
        this.a = b;
        this.b = odVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        od odVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = odVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(odVar);
                    break;
                }
                break;
            default:
                odVar.t().removeView(odVar.n1);
                DialogInterface.OnDismissListener onDismissListener = odVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(odVar);
                    break;
                }
                break;
        }
    }
}
