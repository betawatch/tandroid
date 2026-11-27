// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e1b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1b b;

    public /* synthetic */ e1b(g1b g1bVar, byte b) {
        this.a = b;
        this.b = g1bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        g1b g1bVar = this.b;
        switch (b) {
            case 0:
                pf0 pf0Var = g1bVar.b;
                pf0Var.setVisibility(4);
                pf0Var.K = false;
                pf0 pf0Var2 = g1bVar.c;
                pf0Var2.K = true;
                pf0Var.z0 = (byte) 0;
                pf0Var2.z0 = (byte) 0;
                Window window = g1bVar.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                pf0 pf0Var3 = g1bVar.c;
                pf0Var3.setVisibility(4);
                pf0 pf0Var4 = g1bVar.b;
                pf0Var4.z0 = (byte) 0;
                pf0Var3.z0 = (byte) 0;
                pf0Var4.K = true;
                pf0Var3.K = false;
                if (pf0Var4 instanceof jqa) {
                    pf0Var4.v0 = false;
                    pf0Var4.d();
                } else {
                    pf0Var4.v0 = true;
                    pf0Var4.x((pf0Var4.H0 * pf0Var4.h0.k) - pf0.l1);
                    pf0Var4.c(true);
                    pf0Var4.invalidate();
                }
                Window window2 = g1bVar.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                g1bVar.b.z0 = (byte) 0;
                g1bVar.e.setVisibility(8);
                break;
        }
    }
}
