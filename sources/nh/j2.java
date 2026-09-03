package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d4 c;

    public /* synthetic */ j2(d4 d4Var, boolean z4, int i10) {
        this.a = i10;
        this.c = d4Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    d4 d4Var = this.c;
                    d4Var.o3.setVisibility(8);
                    d4Var.o3.n();
                    break;
                }
                break;
            default:
                d4 d4Var2 = this.c;
                n8 n8Var = d4Var2.z0;
                dh.d dVar = d4Var2.v0;
                ImageView imageView = d4Var2.u0;
                ImageView imageView2 = d4Var2.t0;
                z3 z3Var = d4Var2.l1;
                d4Var2.a4 = this.b ? 1.0f : 0.0f;
                z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.a4);
                z3Var.setAlpha(1.0f - d4Var2.a4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.a4);
                imageView2.setAlpha(1.0f - d4Var2.a4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.a4);
                imageView.setAlpha(1.0f - d4Var2.a4);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.a4);
                dVar.setAlpha((1.0f - d4Var2.a4) * d4Var2.b3);
                z2 z2Var = d4Var2.T1;
                if (z2Var != null) {
                    z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var2.a4);
                    d4Var2.T1.setAlpha(1.0f - d4Var2.a4);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.a4);
                    n8Var.setAlpha(1.0f - d4Var2.a4);
                }
                d4Var2.H0.setAlpha(1.0f - d4Var2.a4);
                x3 x3Var = d4Var2.N1;
                float f10 = x3Var != null ? ((z8) x3Var).d.S : 0.0f;
                hideInterfaceAlpha = d4Var2.getHideInterfaceAlpha();
                z2 z2Var2 = d4Var2.A0;
                if (z2Var2 != null) {
                    z2Var2.setAlpha((1.0f - d4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = d4Var2.K0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - d4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                z2 z2Var3 = d4Var2.M0;
                if (z2Var3 != null) {
                    z2Var3.setAlpha((1.0f - d4Var2.a4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - d4Var2.a4);
                    d4Var2.invalidate();
                }
                d4Var2.Z0.invalidate();
                break;
        }
    }
}
