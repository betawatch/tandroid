package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha b;

    public /* synthetic */ ga(ha haVar, int i3) {
        this.a = i3;
        this.b = haVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ha haVar = this.b;
                haVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.n = floatValue;
                haVar.f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                haVar.d.setAlpha(haVar.n);
                break;
            default:
                ha haVar2 = this.b;
                haVar2.getClass();
                haVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i3 = org.telegram.ui.ActionBar.k6.z6;
                org.telegram.ui.ActionBar.e6 e6Var = haVar2.b;
                int f10 = i0.a.f(haVar2.F, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var));
                haVar2.e.b(f10);
                haVar2.f.setTextColor(f10);
                break;
        }
    }
}
