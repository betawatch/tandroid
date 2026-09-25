package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e6 c;

    public /* synthetic */ u3(e6 e6Var, boolean z10, int i10) {
        this.a = i10;
        this.c = e6Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    e6 e6Var = this.c;
                    e6Var.r3.setVisibility(8);
                    e6Var.r3.n();
                    break;
                }
                break;
            default:
                e6 e6Var2 = this.c;
                nb nbVar = e6Var2.C0;
                w5 w5Var = e6Var2.y0;
                ImageView imageView = e6Var2.x0;
                ImageView imageView2 = e6Var2.w0;
                a6 a6Var = e6Var2.o1;
                e6Var2.d4 = this.b ? 1.0f : 0.0f;
                a6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.d4);
                a6Var.setAlpha(1.0f - e6Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.d4);
                imageView2.setAlpha(1.0f - e6Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.d4);
                imageView.setAlpha(1.0f - e6Var2.d4);
                w5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.d4);
                w5Var.setAlpha((1.0f - e6Var2.d4) * e6Var2.e3);
                m4 m4Var = e6Var2.W1;
                if (m4Var != null) {
                    m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * e6Var2.d4);
                    e6Var2.W1.setAlpha(1.0f - e6Var2.d4);
                }
                if (nbVar != null) {
                    nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.d4);
                    nbVar.setAlpha(1.0f - e6Var2.d4);
                }
                e6Var2.K0.setAlpha(1.0f - e6Var2.d4);
                x5 x5Var = e6Var2.Q1;
                float f7 = x5Var != null ? ((ac) x5Var).d.V : 0.0f;
                hideInterfaceAlpha = e6Var2.getHideInterfaceAlpha();
                m4 m4Var2 = e6Var2.D0;
                if (m4Var2 != null) {
                    m4Var2.setAlpha((1.0f - e6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = e6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - e6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                m4 m4Var3 = e6Var2.P0;
                if (m4Var3 != null) {
                    m4Var3.setAlpha((1.0f - e6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                a4 a4Var = e6Var2.b2;
                if (a4Var != null) {
                    a4Var.setAlpha(1.0f - e6Var2.d4);
                    e6Var2.invalidate();
                }
                e6Var2.c1.invalidate();
                break;
        }
    }
}
