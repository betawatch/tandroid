// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ntc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ otc b;

    public /* synthetic */ ntc(otc otcVar, byte b) {
        this.a = b;
        this.b = otcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        otc otcVar = this.b;
        switch (b) {
            case 0:
                otcVar.E = null;
                break;
            default:
                otcVar.E = null;
                break;
        }
    }
}
