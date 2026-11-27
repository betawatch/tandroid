// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
