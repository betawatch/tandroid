package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q4 c;

    public /* synthetic */ q2(q4 q4Var, boolean z10, int i10) {
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
                    q4Var.r3.setVisibility(8);
                    q4Var.r3.n();
                    break;
                }
                break;
            default:
                q4 q4Var2 = this.c;
                f9 f9Var = q4Var2.C0;
                i4 i4Var = q4Var2.y0;
                ImageView imageView = q4Var2.x0;
                ImageView imageView2 = q4Var2.w0;
                m4 m4Var = q4Var2.o1;
                q4Var2.d4 = this.b ? 1.0f : 0.0f;
                m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.d4);
                m4Var.setAlpha(1.0f - q4Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.d4);
                imageView2.setAlpha(1.0f - q4Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.d4);
                imageView.setAlpha(1.0f - q4Var2.d4);
                i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.d4);
                i4Var.setAlpha((1.0f - q4Var2.d4) * q4Var2.e3);
                h3 h3Var = q4Var2.W1;
                if (h3Var != null) {
                    h3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var2.d4);
                    q4Var2.W1.setAlpha(1.0f - q4Var2.d4);
                }
                if (f9Var != null) {
                    f9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.d4);
                    f9Var.setAlpha(1.0f - q4Var2.d4);
                }
                q4Var2.K0.setAlpha(1.0f - q4Var2.d4);
                j4 j4Var = q4Var2.Q1;
                float f7 = j4Var != null ? ((r9) j4Var).d.V : 0.0f;
                hideInterfaceAlpha = q4Var2.getHideInterfaceAlpha();
                h3 h3Var2 = q4Var2.D0;
                if (h3Var2 != null) {
                    h3Var2.setAlpha((1.0f - q4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q4Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                h3 h3Var3 = q4Var2.P0;
                if (h3Var3 != null) {
                    h3Var3.setAlpha((1.0f - q4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                v2 v2Var = q4Var2.b2;
                if (v2Var != null) {
                    v2Var.setAlpha(1.0f - q4Var2.d4);
                    q4Var2.invalidate();
                }
                q4Var2.c1.invalidate();
                break;
        }
    }
}
