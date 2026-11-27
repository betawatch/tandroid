// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ecb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ubb b;

    public /* synthetic */ ecb(ubb ubbVar, byte b) {
        this.a = b;
        this.b = ubbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ubb ubbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                lcb lcbVar = ubbVar.b;
                g6b g6bVar = lcbVar.u1;
                if (g6bVar != null) {
                    g6bVar.b();
                    lcbVar.w.removeView(lcbVar.u1);
                }
                lcbVar.u1 = null;
                lcbVar.U();
                break;
            default:
                super.onAnimationEnd(animator);
                g6b g6bVar2 = ubbVar.b.u1;
                if (g6bVar2 != null) {
                    g6bVar2.a(true);
                    break;
                }
                break;
        }
    }
}
