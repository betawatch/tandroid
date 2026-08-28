package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i4 c;

    public /* synthetic */ k2(i4 i4Var, boolean z10, int i9) {
        this.a = i9;
        this.c = i4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    i4 i4Var = this.c;
                    i4Var.n3.setVisibility(8);
                    i4Var.n3.n();
                    break;
                }
                break;
            default:
                i4 i4Var2 = this.c;
                r8 r8Var = i4Var2.y0;
                dh.g gVar = i4Var2.u0;
                ImageView imageView = i4Var2.t0;
                ImageView imageView2 = i4Var2.s0;
                e4 e4Var = i4Var2.k1;
                i4Var2.Z3 = this.b ? 1.0f : 0.0f;
                e4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                e4Var.setAlpha(1.0f - i4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                imageView2.setAlpha(1.0f - i4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                imageView.setAlpha(1.0f - i4Var2.Z3);
                gVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                gVar.setAlpha((1.0f - i4Var2.Z3) * i4Var2.a3);
                a3 a3Var = i4Var2.S1;
                if (a3Var != null) {
                    a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * i4Var2.Z3);
                    i4Var2.S1.setAlpha(1.0f - i4Var2.Z3);
                }
                if (r8Var != null) {
                    r8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                    r8Var.setAlpha(1.0f - i4Var2.Z3);
                }
                i4Var2.G0.setAlpha(1.0f - i4Var2.Z3);
                c4 c4Var = i4Var2.M1;
                float f10 = c4Var != null ? ((d9) c4Var).d.R : 0.0f;
                hideInterfaceAlpha = i4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = i4Var2.z0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = i4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a3 a3Var3 = i4Var2.L0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                p2 p2Var = i4Var2.X1;
                if (p2Var != null) {
                    p2Var.setAlpha(1.0f - i4Var2.Z3);
                    i4Var2.invalidate();
                }
                i4Var2.Y0.invalidate();
                break;
        }
    }
}
