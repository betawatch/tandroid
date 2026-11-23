package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class d2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z3 c;

    public /* synthetic */ d2(z3 z3Var, boolean z10, int i7) {
        this.a = i7;
        this.c = z3Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    z3 z3Var = this.c;
                    z3Var.b3.setVisibility(8);
                    z3Var.b3.n();
                    break;
                }
                break;
            default:
                z3 z3Var2 = this.c;
                k8 k8Var = z3Var2.m0;
                bi.t2 t2Var = z3Var2.i0;
                ImageView imageView = z3Var2.h0;
                ImageView imageView2 = z3Var2.g0;
                v3 v3Var = z3Var2.Y0;
                z3Var2.O3 = this.b ? 1.0f : 0.0f;
                v3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                v3Var.setAlpha(1.0f - z3Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                imageView2.setAlpha(1.0f - z3Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                imageView.setAlpha(1.0f - z3Var2.O3);
                t2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                t2Var.setAlpha((1.0f - z3Var2.O3) * z3Var2.O2);
                t2 t2Var2 = z3Var2.G1;
                if (t2Var2 != null) {
                    t2Var2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * z3Var2.O3);
                    z3Var2.G1.setAlpha(1.0f - z3Var2.O3);
                }
                if (k8Var != null) {
                    k8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                    k8Var.setAlpha(1.0f - z3Var2.O3);
                }
                z3Var2.u0.setAlpha(1.0f - z3Var2.O3);
                s3 s3Var = z3Var2.A1;
                float f10 = s3Var != null ? ((w8) s3Var).d.W : 0.0f;
                hideInterfaceAlpha = z3Var2.getHideInterfaceAlpha();
                t2 t2Var3 = z3Var2.n0;
                if (t2Var3 != null) {
                    t2Var3.setAlpha((1.0f - z3Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = z3Var2.x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - z3Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                t2 t2Var4 = z3Var2.z0;
                if (t2Var4 != null) {
                    t2Var4.setAlpha((1.0f - z3Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                i2 i2Var = z3Var2.L1;
                if (i2Var != null) {
                    i2Var.setAlpha(1.0f - z3Var2.O3);
                    z3Var2.invalidate();
                }
                z3Var2.M0.invalidate();
                break;
        }
    }
}
