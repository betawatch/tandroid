package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d4 c;

    public /* synthetic */ i2(d4 d4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = d4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    d4 d4Var = this.c;
                    d4Var.n3.setVisibility(8);
                    d4Var.n3.n();
                    break;
                }
                break;
            default:
                d4 d4Var2 = this.c;
                n8 n8Var = d4Var2.y0;
                bh.d dVar = d4Var2.u0;
                ImageView imageView = d4Var2.t0;
                ImageView imageView2 = d4Var2.s0;
                z3 z3Var = d4Var2.k1;
                d4Var2.Z3 = this.b ? 1.0f : 0.0f;
                z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                z3Var.setAlpha(1.0f - d4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                imageView2.setAlpha(1.0f - d4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                imageView.setAlpha(1.0f - d4Var2.Z3);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                dVar.setAlpha((1.0f - d4Var2.Z3) * d4Var2.a3);
                y2 y2Var = d4Var2.S1;
                if (y2Var != null) {
                    y2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var2.Z3);
                    d4Var2.S1.setAlpha(1.0f - d4Var2.Z3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                    n8Var.setAlpha(1.0f - d4Var2.Z3);
                }
                d4Var2.G0.setAlpha(1.0f - d4Var2.Z3);
                x3 x3Var = d4Var2.M1;
                float f9 = x3Var != null ? ((z8) x3Var).d.R : 0.0f;
                hideInterfaceAlpha = d4Var2.getHideInterfaceAlpha();
                y2 y2Var2 = d4Var2.z0;
                if (y2Var2 != null) {
                    y2Var2.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f9) * hideInterfaceAlpha);
                }
                ImageView imageView3 = d4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f9) * hideInterfaceAlpha);
                }
                y2 y2Var3 = d4Var2.L0;
                if (y2Var3 != null) {
                    y2Var3.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f9) * hideInterfaceAlpha);
                }
                n2 n2Var = d4Var2.X1;
                if (n2Var != null) {
                    n2Var.setAlpha(1.0f - d4Var2.Z3);
                    d4Var2.invalidate();
                }
                d4Var2.Y0.invalidate();
                break;
        }
    }
}
