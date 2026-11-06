package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;

    public /* synthetic */ og(di diVar, int i7) {
        this.a = i7;
        this.b = diVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.Q1();
                break;
            case 1:
                this.b.x2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di diVar = this.b;
                diVar.C0 = floatValue;
                org.telegram.ui.ActionBar.l2 l2Var = diVar.c;
                if (l2Var != null) {
                    l2Var.invalidate();
                    break;
                }
                break;
            case 3:
                di diVar2 = this.b;
                diVar2.getClass();
                diVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                di diVar3 = this.b;
                vh vhVar = diVar3.s2;
                ik ikVar = diVar3.n2;
                if (vhVar == ikVar && ikVar != null) {
                    ikVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.Q1();
                break;
        }
    }
}
