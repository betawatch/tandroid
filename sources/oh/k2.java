package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f4 c;

    public /* synthetic */ k2(f4 f4Var, boolean z4, int i10) {
        this.a = i10;
        this.c = f4Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    f4 f4Var = this.c;
                    f4Var.o3.setVisibility(8);
                    f4Var.o3.n();
                    break;
                }
                break;
            default:
                f4 f4Var2 = this.c;
                n8 n8Var = f4Var2.z0;
                eh.d dVar = f4Var2.v0;
                ImageView imageView = f4Var2.u0;
                ImageView imageView2 = f4Var2.t0;
                b4 b4Var = f4Var2.l1;
                f4Var2.a4 = this.b ? 1.0f : 0.0f;
                b4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.a4);
                b4Var.setAlpha(1.0f - f4Var2.a4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.a4);
                imageView2.setAlpha(1.0f - f4Var2.a4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.a4);
                imageView.setAlpha(1.0f - f4Var2.a4);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.a4);
                dVar.setAlpha((1.0f - f4Var2.a4) * f4Var2.b3);
                a3 a3Var = f4Var2.T1;
                if (a3Var != null) {
                    a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * f4Var2.a4);
                    f4Var2.T1.setAlpha(1.0f - f4Var2.a4);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.a4);
                    n8Var.setAlpha(1.0f - f4Var2.a4);
                }
                f4Var2.H0.setAlpha(1.0f - f4Var2.a4);
                z3 z3Var = f4Var2.N1;
                float f10 = z3Var != null ? ((z8) z3Var).d.S : 0.0f;
                hideInterfaceAlpha = f4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = f4Var2.A0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - f4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f4Var2.K0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a3 a3Var3 = f4Var2.M0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - f4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null) {
                    p2Var.setAlpha(1.0f - f4Var2.a4);
                    f4Var2.invalidate();
                }
                f4Var2.Z0.invalidate();
                break;
        }
    }
}
