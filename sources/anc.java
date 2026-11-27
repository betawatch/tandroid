// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class anc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cnc b;

    public /* synthetic */ anc(cnc cncVar, byte b) {
        this.a = b;
        this.b = cncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        cnc cncVar = this.b;
        switch (b) {
            case 0:
                cncVar.r = 0;
                cncVar.invalidate();
                break;
            default:
                cncVar.s = 0;
                cncVar.invalidate();
                break;
        }
    }
}
