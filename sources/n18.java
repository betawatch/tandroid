// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class n18 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ y28 c;

    public /* synthetic */ n18(y28 y28Var, boolean z, byte b) {
        this.a = b;
        this.c = y28Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        byte b = this.a;
        boolean z = this.b;
        y28 y28Var = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    y28Var.h3.setVisibility(8);
                    y28Var.h3.k();
                    break;
                }
                break;
            default:
                z5b z5bVar = y28Var.s0;
                a6 a6Var = y28Var.o0;
                ImageView imageView = y28Var.n0;
                ImageView imageView2 = y28Var.m0;
                v28 v28Var = y28Var.e1;
                y28Var.T3 = z ? 1.0f : 0.0f;
                v28Var.setTranslationY((-gl.L(8.0f)) * y28Var.T3);
                v28Var.setAlpha(1.0f - y28Var.T3);
                imageView2.setTranslationY((-gl.L(8.0f)) * y28Var.T3);
                imageView2.setAlpha(1.0f - y28Var.T3);
                imageView.setTranslationY((-gl.L(8.0f)) * y28Var.T3);
                imageView.setAlpha(1.0f - y28Var.T3);
                a6Var.setTranslationY((-gl.L(8.0f)) * y28Var.T3);
                a6Var.setAlpha((1.0f - y28Var.T3) * y28Var.U2);
                y18 y18Var = y28Var.M1;
                if (y18Var != null) {
                    y18Var.setTranslationY(gl.L(8.0f) * y28Var.T3);
                    y28Var.M1.setAlpha(1.0f - y28Var.T3);
                }
                if (z5bVar != null) {
                    z5bVar.setTranslationY((-gl.L(8.0f)) * y28Var.T3);
                    z5bVar.setAlpha(1.0f - y28Var.T3);
                }
                y28Var.A0.setAlpha(1.0f - y28Var.T3);
                t28 t28Var = y28Var.G1;
                float f = t28Var != null ? ((d8b) t28Var).d.W : 0.0f;
                hideInterfaceAlpha = y28Var.getHideInterfaceAlpha();
                y18 y18Var2 = y28Var.t0;
                if (y18Var2 != null) {
                    y18Var2.setAlpha((1.0f - y28Var.T3) * (1.0f - f) * hideInterfaceAlpha);
                }
                ImageView imageView3 = y28Var.D0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - y28Var.T3) * (1.0f - f) * hideInterfaceAlpha);
                }
                y18 y18Var3 = y28Var.F0;
                if (y18Var3 != null) {
                    y18Var3.setAlpha((1.0f - y28Var.T3) * (1.0f - f) * hideInterfaceAlpha);
                }
                q18 q18Var = y28Var.R1;
                if (q18Var != null) {
                    q18Var.setAlpha(1.0f - y28Var.T3);
                    y28Var.invalidate();
                }
                y28Var.S0.invalidate();
                break;
        }
    }
}
