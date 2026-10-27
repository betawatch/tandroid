package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q4 c;

    public /* synthetic */ p2(q4 q4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = q4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    q4 q4Var = this.c;
                    q4Var.g3.setVisibility(8);
                    q4Var.g3.n();
                    break;
                }
                break;
            default:
                q4 q4Var2 = this.c;
                d9 d9Var = q4Var2.r0;
                i4 i4Var = q4Var2.n0;
                ImageView imageView = q4Var2.m0;
                ImageView imageView2 = q4Var2.l0;
                m4 m4Var = q4Var2.d1;
                q4Var2.T3 = this.b ? 1.0f : 0.0f;
                m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.T3);
                m4Var.setAlpha(1.0f - q4Var2.T3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.T3);
                imageView2.setAlpha(1.0f - q4Var2.T3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.T3);
                imageView.setAlpha(1.0f - q4Var2.T3);
                i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.T3);
                i4Var.setAlpha((1.0f - q4Var2.T3) * q4Var2.T2);
                g3 g3Var = q4Var2.L1;
                if (g3Var != null) {
                    g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var2.T3);
                    q4Var2.L1.setAlpha(1.0f - q4Var2.T3);
                }
                if (d9Var != null) {
                    d9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.T3);
                    d9Var.setAlpha(1.0f - q4Var2.T3);
                }
                q4Var2.z0.setAlpha(1.0f - q4Var2.T3);
                j4 j4Var = q4Var2.F1;
                float f7 = j4Var != null ? ((p9) j4Var).d.V : 0.0f;
                hideInterfaceAlpha = q4Var2.getHideInterfaceAlpha();
                g3 g3Var2 = q4Var2.s0;
                if (g3Var2 != null) {
                    g3Var2.setAlpha((1.0f - q4Var2.T3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q4Var2.C0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q4Var2.T3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                g3 g3Var3 = q4Var2.E0;
                if (g3Var3 != null) {
                    g3Var3.setAlpha((1.0f - q4Var2.T3) * (1.0f - f7) * hideInterfaceAlpha);
                }
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.setAlpha(1.0f - q4Var2.T3);
                    q4Var2.invalidate();
                }
                q4Var2.R0.invalidate();
                break;
        }
    }
}
