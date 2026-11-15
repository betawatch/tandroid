package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b4 c;

    public /* synthetic */ f2(b4 b4Var, boolean z10, int i7) {
        this.a = i7;
        this.c = b4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    b4 b4Var = this.c;
                    b4Var.b3.setVisibility(8);
                    b4Var.b3.n();
                    break;
                }
                break;
            default:
                b4 b4Var2 = this.c;
                n8 n8Var = b4Var2.m0;
                bi.v1 v1Var = b4Var2.i0;
                ImageView imageView = b4Var2.h0;
                ImageView imageView2 = b4Var2.g0;
                x3 x3Var = b4Var2.Y0;
                b4Var2.O3 = this.b ? 1.0f : 0.0f;
                x3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                x3Var.setAlpha(1.0f - b4Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                imageView2.setAlpha(1.0f - b4Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                imageView.setAlpha(1.0f - b4Var2.O3);
                v1Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                v1Var.setAlpha((1.0f - b4Var2.O3) * b4Var2.O2);
                v2 v2Var = b4Var2.G1;
                if (v2Var != null) {
                    v2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * b4Var2.O3);
                    b4Var2.G1.setAlpha(1.0f - b4Var2.O3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                    n8Var.setAlpha(1.0f - b4Var2.O3);
                }
                b4Var2.u0.setAlpha(1.0f - b4Var2.O3);
                u3 u3Var = b4Var2.A1;
                float f10 = u3Var != null ? ((z8) u3Var).d.W : 0.0f;
                hideInterfaceAlpha = b4Var2.getHideInterfaceAlpha();
                v2 v2Var2 = b4Var2.n0;
                if (v2Var2 != null) {
                    v2Var2.setAlpha((1.0f - b4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = b4Var2.x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - b4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                v2 v2Var3 = b4Var2.z0;
                if (v2Var3 != null) {
                    v2Var3.setAlpha((1.0f - b4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                k2 k2Var = b4Var2.L1;
                if (k2Var != null) {
                    k2Var.setAlpha(1.0f - b4Var2.O3);
                    b4Var2.invalidate();
                }
                b4Var2.M0.invalidate();
                break;
        }
    }
}
