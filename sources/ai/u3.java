package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f6 c;

    public /* synthetic */ u3(f6 f6Var, boolean z10, int i10) {
        this.a = i10;
        this.c = f6Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    f6 f6Var = this.c;
                    f6Var.r3.setVisibility(8);
                    f6Var.r3.n();
                    break;
                }
                break;
            default:
                f6 f6Var2 = this.c;
                nb nbVar = f6Var2.C0;
                x5 x5Var = f6Var2.y0;
                ImageView imageView = f6Var2.x0;
                ImageView imageView2 = f6Var2.w0;
                b6 b6Var = f6Var2.o1;
                f6Var2.d4 = this.b ? 1.0f : 0.0f;
                b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                b6Var.setAlpha(1.0f - f6Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                imageView2.setAlpha(1.0f - f6Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                imageView.setAlpha(1.0f - f6Var2.d4);
                x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                x5Var.setAlpha((1.0f - f6Var2.d4) * f6Var2.e3);
                m4 m4Var = f6Var2.W1;
                if (m4Var != null) {
                    m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var2.d4);
                    f6Var2.W1.setAlpha(1.0f - f6Var2.d4);
                }
                if (nbVar != null) {
                    nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                    nbVar.setAlpha(1.0f - f6Var2.d4);
                }
                f6Var2.K0.setAlpha(1.0f - f6Var2.d4);
                y5 y5Var = f6Var2.Q1;
                float f7 = y5Var != null ? ((ac) y5Var).d.V : 0.0f;
                hideInterfaceAlpha = f6Var2.getHideInterfaceAlpha();
                m4 m4Var2 = f6Var2.D0;
                if (m4Var2 != null) {
                    m4Var2.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                m4 m4Var3 = f6Var2.P0;
                if (m4Var3 != null) {
                    m4Var3.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                a4 a4Var = f6Var2.b2;
                if (a4Var != null) {
                    a4Var.setAlpha(1.0f - f6Var2.d4);
                    f6Var2.invalidate();
                }
                f6Var2.c1.invalidate();
                break;
        }
    }
}
