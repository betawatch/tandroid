package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ f30 c;

    public /* synthetic */ e30(f30 f30Var, boolean z10, int i7) {
        this.a = i7;
        this.c = f30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                f30 f30Var = this.c;
                f30Var.x = f10;
                f30Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                f30Var.e.setPadding(0, 0, 0, (int) (f30Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                f30 f30Var2 = this.c;
                f30Var2.F = f11;
                f30Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                f30Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, f30Var2.F));
                org.telegram.ui.nj njVar = f30Var2.f;
                if (njVar != null && (cnVar = njVar.a) != null && (b1Var = cnVar.a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                    f30Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                }
                f30Var2.h.setAlpha(f30Var2.F);
                if (!z10) {
                    f30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
