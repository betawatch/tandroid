// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oic extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qic b;

    public /* synthetic */ oic(qic qicVar, byte b) {
        this.a = b;
        this.b = qicVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qic qicVar = this.b;
        switch (b) {
            case 0:
                qicVar.r = 0;
                qicVar.invalidate();
                break;
            default:
                qicVar.s = 0;
                qicVar.invalidate();
                break;
        }
    }
}
