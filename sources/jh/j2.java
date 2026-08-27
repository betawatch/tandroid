package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e4 c;

    public /* synthetic */ j2(e4 e4Var, boolean z10, int i10) {
        this.a = i10;
        this.c = e4Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    e4 e4Var = this.c;
                    e4Var.n3.setVisibility(8);
                    e4Var.n3.n();
                    break;
                }
                break;
            default:
                e4 e4Var2 = this.c;
                n8 n8Var = e4Var2.y0;
                ag.d dVar = e4Var2.u0;
                ImageView imageView = e4Var2.t0;
                ImageView imageView2 = e4Var2.s0;
                a4 a4Var = e4Var2.k1;
                e4Var2.Z3 = this.b ? 1.0f : 0.0f;
                a4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                a4Var.setAlpha(1.0f - e4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                imageView2.setAlpha(1.0f - e4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                imageView.setAlpha(1.0f - e4Var2.Z3);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                dVar.setAlpha((1.0f - e4Var2.Z3) * e4Var2.a3);
                z2 z2Var = e4Var2.S1;
                if (z2Var != null) {
                    z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * e4Var2.Z3);
                    e4Var2.S1.setAlpha(1.0f - e4Var2.Z3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                    n8Var.setAlpha(1.0f - e4Var2.Z3);
                }
                e4Var2.G0.setAlpha(1.0f - e4Var2.Z3);
                y3 y3Var = e4Var2.M1;
                float f10 = y3Var != null ? ((z8) y3Var).d.R : 0.0f;
                hideInterfaceAlpha = e4Var2.getHideInterfaceAlpha();
                z2 z2Var2 = e4Var2.z0;
                if (z2Var2 != null) {
                    z2Var2.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = e4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                z2 z2Var3 = e4Var2.L0;
                if (z2Var3 != null) {
                    z2Var3.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                o2 o2Var = e4Var2.X1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - e4Var2.Z3);
                    e4Var2.invalidate();
                }
                e4Var2.Y0.invalidate();
                break;
        }
    }
}
