package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p4 c;

    public /* synthetic */ p2(p4 p4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = p4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    p4 p4Var = this.c;
                    p4Var.r3.setVisibility(8);
                    p4Var.r3.n();
                    break;
                }
                break;
            default:
                p4 p4Var2 = this.c;
                e9 e9Var = p4Var2.C0;
                h4 h4Var = p4Var2.y0;
                ImageView imageView = p4Var2.x0;
                ImageView imageView2 = p4Var2.w0;
                l4 l4Var = p4Var2.o1;
                p4Var2.d4 = this.b ? 1.0f : 0.0f;
                l4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.d4);
                l4Var.setAlpha(1.0f - p4Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.d4);
                imageView2.setAlpha(1.0f - p4Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.d4);
                imageView.setAlpha(1.0f - p4Var2.d4);
                h4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.d4);
                h4Var.setAlpha((1.0f - p4Var2.d4) * p4Var2.e3);
                g3 g3Var = p4Var2.W1;
                if (g3Var != null) {
                    g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * p4Var2.d4);
                    p4Var2.W1.setAlpha(1.0f - p4Var2.d4);
                }
                if (e9Var != null) {
                    e9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.d4);
                    e9Var.setAlpha(1.0f - p4Var2.d4);
                }
                p4Var2.K0.setAlpha(1.0f - p4Var2.d4);
                i4 i4Var = p4Var2.Q1;
                float f7 = i4Var != null ? ((q9) i4Var).d.V : 0.0f;
                hideInterfaceAlpha = p4Var2.getHideInterfaceAlpha();
                g3 g3Var2 = p4Var2.D0;
                if (g3Var2 != null) {
                    g3Var2.setAlpha((1.0f - p4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = p4Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - p4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                g3 g3Var3 = p4Var2.P0;
                if (g3Var3 != null) {
                    g3Var3.setAlpha((1.0f - p4Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                u2 u2Var = p4Var2.b2;
                if (u2Var != null) {
                    u2Var.setAlpha(1.0f - p4Var2.d4);
                    p4Var2.invalidate();
                }
                p4Var2.c1.invalidate();
                break;
        }
    }
}
