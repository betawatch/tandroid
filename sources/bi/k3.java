package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class k3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q5 c;

    public /* synthetic */ k3(q5 q5Var, boolean z10, int i10) {
        this.a = i10;
        this.c = q5Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    q5 q5Var = this.c;
                    q5Var.r3.setVisibility(8);
                    q5Var.r3.n();
                    break;
                }
                break;
            default:
                q5 q5Var2 = this.c;
                xa xaVar = q5Var2.C0;
                i5 i5Var = q5Var2.y0;
                ImageView imageView = q5Var2.x0;
                ImageView imageView2 = q5Var2.w0;
                m5 m5Var = q5Var2.o1;
                q5Var2.d4 = this.b ? 1.0f : 0.0f;
                m5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.d4);
                m5Var.setAlpha(1.0f - q5Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.d4);
                imageView2.setAlpha(1.0f - q5Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.d4);
                imageView.setAlpha(1.0f - q5Var2.d4);
                i5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.d4);
                i5Var.setAlpha((1.0f - q5Var2.d4) * q5Var2.e3);
                c4 c4Var = q5Var2.W1;
                if (c4Var != null) {
                    c4Var.setTranslationY(AndroidUtilities.dp(8.0f) * q5Var2.d4);
                    q5Var2.W1.setAlpha(1.0f - q5Var2.d4);
                }
                if (xaVar != null) {
                    xaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.d4);
                    xaVar.setAlpha(1.0f - q5Var2.d4);
                }
                q5Var2.K0.setAlpha(1.0f - q5Var2.d4);
                j5 j5Var = q5Var2.Q1;
                float f7 = j5Var != null ? ((jb) j5Var).d.V : 0.0f;
                hideInterfaceAlpha = q5Var2.getHideInterfaceAlpha();
                c4 c4Var2 = q5Var2.D0;
                if (c4Var2 != null) {
                    c4Var2.setAlpha((1.0f - q5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q5Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                c4 c4Var3 = q5Var2.P0;
                if (c4Var3 != null) {
                    c4Var3.setAlpha((1.0f - q5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                q3 q3Var = q5Var2.b2;
                if (q3Var != null) {
                    q3Var.setAlpha(1.0f - q5Var2.d4);
                    q5Var2.invalidate();
                }
                q5Var2.c1.invalidate();
                break;
        }
    }
}
