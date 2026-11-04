package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j4 c;

    public /* synthetic */ n2(j4 j4Var, boolean z10, int i3) {
        this.a = i3;
        this.c = j4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    j4 j4Var = this.c;
                    j4Var.b3.setVisibility(8);
                    j4Var.b3.n();
                    break;
                }
                break;
            default:
                j4 j4Var2 = this.c;
                u8 u8Var = j4Var2.m0;
                ai.d2 d2Var = j4Var2.i0;
                ImageView imageView = j4Var2.h0;
                ImageView imageView2 = j4Var2.g0;
                f4 f4Var = j4Var2.Y0;
                j4Var2.O3 = this.b ? 1.0f : 0.0f;
                f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                f4Var.setAlpha(1.0f - j4Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                imageView2.setAlpha(1.0f - j4Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                imageView.setAlpha(1.0f - j4Var2.O3);
                d2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                d2Var.setAlpha((1.0f - j4Var2.O3) * j4Var2.O2);
                d3 d3Var = j4Var2.G1;
                if (d3Var != null) {
                    d3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var2.O3);
                    j4Var2.G1.setAlpha(1.0f - j4Var2.O3);
                }
                if (u8Var != null) {
                    u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                    u8Var.setAlpha(1.0f - j4Var2.O3);
                }
                j4Var2.u0.setAlpha(1.0f - j4Var2.O3);
                c4 c4Var = j4Var2.A1;
                float f10 = c4Var != null ? ((i9) c4Var).d.W : 0.0f;
                hideInterfaceAlpha = j4Var2.getHideInterfaceAlpha();
                d3 d3Var2 = j4Var2.n0;
                if (d3Var2 != null) {
                    d3Var2.setAlpha((1.0f - j4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = j4Var2.x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - j4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                d3 d3Var3 = j4Var2.z0;
                if (d3Var3 != null) {
                    d3Var3.setAlpha((1.0f - j4Var2.O3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                s2 s2Var = j4Var2.L1;
                if (s2Var != null) {
                    s2Var.setAlpha(1.0f - j4Var2.O3);
                    j4Var2.invalidate();
                }
                j4Var2.M0.invalidate();
                break;
        }
    }
}
