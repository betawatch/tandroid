// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eza extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gza b;

    public /* synthetic */ eza(gza gzaVar, byte b) {
        this.a = b;
        this.b = gzaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gza gzaVar = this.b;
        switch (b) {
            case 0:
                ng0 ng0Var = gzaVar.b;
                ng0Var.setVisibility(4);
                ng0Var.K = false;
                ng0 ng0Var2 = gzaVar.c;
                ng0Var2.K = true;
                ng0Var.z0 = (byte) 0;
                ng0Var2.z0 = (byte) 0;
                Window window = gzaVar.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                ng0 ng0Var3 = gzaVar.c;
                ng0Var3.setVisibility(4);
                ng0 ng0Var4 = gzaVar.b;
                ng0Var4.z0 = (byte) 0;
                ng0Var3.z0 = (byte) 0;
                ng0Var4.K = true;
                ng0Var3.K = false;
                if (ng0Var4 instanceof noa) {
                    ng0Var4.v0 = false;
                    ng0Var4.d();
                } else {
                    ng0Var4.v0 = true;
                    ng0Var4.x((ng0Var4.H0 * ng0Var4.h0.k) - ng0.l1);
                    ng0Var4.c(true);
                    ng0Var4.invalidate();
                }
                Window window2 = gzaVar.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                gzaVar.b.z0 = (byte) 0;
                gzaVar.e.setVisibility(8);
                break;
        }
    }
}
