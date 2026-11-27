// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class d58 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ o68 c;

    public /* synthetic */ d58(o68 o68Var, boolean z, byte b) {
        this.a = b;
        this.c = o68Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        byte b = this.a;
        boolean z = this.b;
        o68 o68Var = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    o68Var.b3.setVisibility(8);
                    o68Var.b3.k();
                    break;
                }
                break;
            default:
                x9b x9bVar = o68Var.m0;
                b6 b6Var = o68Var.i0;
                ImageView imageView = o68Var.h0;
                ImageView imageView2 = o68Var.g0;
                l68 l68Var = o68Var.Y0;
                o68Var.N3 = z ? 1.0f : 0.0f;
                l68Var.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                l68Var.setAlpha(1.0f - o68Var.N3);
                imageView2.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                imageView2.setAlpha(1.0f - o68Var.N3);
                imageView.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                imageView.setAlpha(1.0f - o68Var.N3);
                b6Var.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                b6Var.setAlpha((1.0f - o68Var.N3) * o68Var.O2);
                o58 o58Var = o68Var.G1;
                if (o58Var != null) {
                    o58Var.setTranslationY(hl.L(8.0f) * o68Var.N3);
                    o68Var.G1.setAlpha(1.0f - o68Var.N3);
                }
                if (x9bVar != null) {
                    x9bVar.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                    x9bVar.setAlpha(1.0f - o68Var.N3);
                }
                o68Var.u0.setAlpha(1.0f - o68Var.N3);
                k68 k68Var = o68Var.A1;
                float f = k68Var != null ? ((ccb) k68Var).d.W : 0.0f;
                hideInterfaceAlpha = o68Var.getHideInterfaceAlpha();
                o58 o58Var2 = o68Var.n0;
                if (o58Var2 != null) {
                    o58Var2.setAlpha((1.0f - o68Var.N3) * (1.0f - f) * hideInterfaceAlpha);
                }
                ImageView imageView3 = o68Var.x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - o68Var.N3) * (1.0f - f) * hideInterfaceAlpha);
                }
                o58 o58Var3 = o68Var.z0;
                if (o58Var3 != null) {
                    o58Var3.setAlpha((1.0f - o68Var.N3) * (1.0f - f) * hideInterfaceAlpha);
                }
                g58 g58Var = o68Var.L1;
                if (g58Var != null) {
                    g58Var.setAlpha(1.0f - o68Var.N3);
                    o68Var.invalidate();
                }
                o68Var.M0.invalidate();
                break;
        }
    }
}
