// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ecb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tbb b;

    public /* synthetic */ ecb(tbb tbbVar, byte b) {
        this.a = b;
        this.b = tbbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tbb tbbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                lcb lcbVar = tbbVar.b;
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
                g6b g6bVar2 = tbbVar.b.u1;
                if (g6bVar2 != null) {
                    g6bVar2.a(true);
                    break;
                }
                break;
        }
    }
}
