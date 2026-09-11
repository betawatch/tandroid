package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ o5 c;

    public /* synthetic */ h3(o5 o5Var, boolean z10, int i10) {
        this.a = i10;
        this.c = o5Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    o5 o5Var = this.c;
                    o5Var.r3.setVisibility(8);
                    o5Var.r3.n();
                    break;
                }
                break;
            default:
                o5 o5Var2 = this.c;
                ua uaVar = o5Var2.C0;
                g5 g5Var = o5Var2.y0;
                ImageView imageView = o5Var2.x0;
                ImageView imageView2 = o5Var2.w0;
                k5 k5Var = o5Var2.o1;
                o5Var2.d4 = this.b ? 1.0f : 0.0f;
                k5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.d4);
                k5Var.setAlpha(1.0f - o5Var2.d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.d4);
                imageView2.setAlpha(1.0f - o5Var2.d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.d4);
                imageView.setAlpha(1.0f - o5Var2.d4);
                g5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.d4);
                g5Var.setAlpha((1.0f - o5Var2.d4) * o5Var2.e3);
                z3 z3Var = o5Var2.W1;
                if (z3Var != null) {
                    z3Var.setTranslationY(AndroidUtilities.dp(8.0f) * o5Var2.d4);
                    o5Var2.W1.setAlpha(1.0f - o5Var2.d4);
                }
                if (uaVar != null) {
                    uaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.d4);
                    uaVar.setAlpha(1.0f - o5Var2.d4);
                }
                o5Var2.K0.setAlpha(1.0f - o5Var2.d4);
                h5 h5Var = o5Var2.Q1;
                float f7 = h5Var != null ? ((gb) h5Var).d.V : 0.0f;
                hideInterfaceAlpha = o5Var2.getHideInterfaceAlpha();
                z3 z3Var2 = o5Var2.D0;
                if (z3Var2 != null) {
                    z3Var2.setAlpha((1.0f - o5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                ImageView imageView3 = o5Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - o5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                z3 z3Var3 = o5Var2.P0;
                if (z3Var3 != null) {
                    z3Var3.setAlpha((1.0f - o5Var2.d4) * (1.0f - f7) * hideInterfaceAlpha);
                }
                n3 n3Var = o5Var2.b2;
                if (n3Var != null) {
                    n3Var.setAlpha(1.0f - o5Var2.d4);
                    o5Var2.invalidate();
                }
                o5Var2.c1.invalidate();
                break;
        }
    }
}
