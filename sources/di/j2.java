package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i4 c;

    public /* synthetic */ j2(i4 i4Var, boolean z9, int i7) {
        this.a = i7;
        this.c = i4Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float hideInterfaceAlpha;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    i4 i4Var = this.c;
                    i4Var.a3.setVisibility(8);
                    i4Var.a3.n();
                    break;
                }
                break;
            default:
                i4 i4Var2 = this.c;
                u8 u8Var = i4Var2.l0;
                a4 a4Var = i4Var2.h0;
                ImageView imageView = i4Var2.g0;
                ImageView imageView2 = i4Var2.f0;
                e4 e4Var = i4Var2.X0;
                i4Var2.N3 = this.b ? 1.0f : 0.0f;
                e4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                e4Var.setAlpha(1.0f - i4Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                imageView2.setAlpha(1.0f - i4Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                imageView.setAlpha(1.0f - i4Var2.N3);
                a4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                a4Var.setAlpha((1.0f - i4Var2.N3) * i4Var2.N2);
                a3 a3Var = i4Var2.F1;
                if (a3Var != null) {
                    a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * i4Var2.N3);
                    i4Var2.F1.setAlpha(1.0f - i4Var2.N3);
                }
                if (u8Var != null) {
                    u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                    u8Var.setAlpha(1.0f - i4Var2.N3);
                }
                i4Var2.t0.setAlpha(1.0f - i4Var2.N3);
                b4 b4Var = i4Var2.z1;
                float f10 = b4Var != null ? ((g9) b4Var).d.V : 0.0f;
                hideInterfaceAlpha = i4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = i4Var2.m0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - i4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = i4Var2.w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - i4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a3 a3Var3 = i4Var2.y0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - i4Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                o2 o2Var = i4Var2.K1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - i4Var2.N3);
                    i4Var2.invalidate();
                }
                i4Var2.L0.invalidate();
                break;
        }
    }
}
