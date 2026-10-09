package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f6 c;

    public /* synthetic */ v3(f6 f6Var, boolean z10, int i10) {
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
                ob obVar = f6Var2.C0;
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
                n4 n4Var = f6Var2.W1;
                if (n4Var != null) {
                    n4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var2.d4);
                    f6Var2.W1.setAlpha(1.0f - f6Var2.d4);
                }
                if (obVar != null) {
                    obVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.d4);
                    obVar.setAlpha(1.0f - f6Var2.d4);
                }
                f6Var2.K0.setAlpha(1.0f - f6Var2.d4);
                y5 y5Var = f6Var2.Q1;
                float f7 = y5Var != null ? ((bc) y5Var).d.V : 0.0f;
                hideInterfaceAlpha = f6Var2.getHideInterfaceAlpha();
                n4 n4Var2 = f6Var2.D0;
                if (n4Var2 != null) {
                    n4Var2.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                n4 n4Var3 = f6Var2.P0;
                if (n4Var3 != null) {
                    n4Var3.setAlpha((1.0f - f6Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                b4 b4Var = f6Var2.b2;
                if (b4Var != null) {
                    b4Var.setAlpha(1.0f - f6Var2.d4);
                    f6Var2.invalidate();
                }
                f6Var2.c1.invalidate();
                break;
        }
    }
}
