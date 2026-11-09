package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j4 c;

    public /* synthetic */ j2(j4 j4Var, boolean z9, int i7) {
        this.a = i7;
        this.c = j4Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    j4 j4Var = this.c;
                    j4Var.a3.setVisibility(8);
                    j4Var.a3.n();
                    break;
                }
                break;
            default:
                j4 j4Var2 = this.c;
                v8 v8Var = j4Var2.l0;
                b4 b4Var = j4Var2.h0;
                ImageView imageView = j4Var2.g0;
                ImageView imageView2 = j4Var2.f0;
                f4 f4Var = j4Var2.X0;
                j4Var2.N3 = this.b ? 1.0f : 0.0f;
                f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                f4Var.setAlpha(1.0f - j4Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                imageView2.setAlpha(1.0f - j4Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                imageView.setAlpha(1.0f - j4Var2.N3);
                b4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                b4Var.setAlpha((1.0f - j4Var2.N3) * j4Var2.N2);
                a3 a3Var = j4Var2.F1;
                if (a3Var != null) {
                    a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var2.N3);
                    j4Var2.F1.setAlpha(1.0f - j4Var2.N3);
                }
                if (v8Var != null) {
                    v8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                    v8Var.setAlpha(1.0f - j4Var2.N3);
                }
                j4Var2.t0.setAlpha(1.0f - j4Var2.N3);
                c4 c4Var = j4Var2.z1;
                float f10 = c4Var != null ? ((h9) c4Var).d.V : 0.0f;
                hideInterfaceAlpha = j4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = j4Var2.m0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - j4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = j4Var2.w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - j4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a3 a3Var3 = j4Var2.y0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - j4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                o2 o2Var = j4Var2.K1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - j4Var2.N3);
                    j4Var2.invalidate();
                }
                j4Var2.L0.invalidate();
                break;
        }
    }
}
