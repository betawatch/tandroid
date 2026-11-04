package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ lg(bi biVar, int i3) {
        this.a = i3;
        this.b = biVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.Q1();
                break;
            case 1:
                this.b.y2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi biVar = this.b;
                biVar.D0 = floatValue;
                org.telegram.ui.ActionBar.j2 j2Var = biVar.c;
                if (j2Var != null) {
                    j2Var.invalidate();
                    break;
                }
                break;
            case 3:
                bi biVar2 = this.b;
                biVar2.getClass();
                biVar2.z1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                bi biVar3 = this.b;
                th thVar = biVar3.t2;
                hk hkVar = biVar3.o2;
                if (thVar == hkVar && hkVar != null) {
                    hkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.Q1();
                break;
        }
    }
}
