// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kd extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd b;

    public /* synthetic */ kd(nd ndVar, byte b) {
        this.a = b;
        this.b = ndVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nd ndVar = this.b;
        switch (b) {
            case 0:
                DialogInterface.OnShowListener onShowListener = ndVar.q1;
                if (onShowListener != null) {
                    onShowListener.onShow(ndVar);
                    break;
                }
                break;
            default:
                ndVar.t().removeView(ndVar.n1);
                DialogInterface.OnDismissListener onDismissListener = ndVar.r1;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(ndVar);
                    break;
                }
                break;
        }
    }
}
