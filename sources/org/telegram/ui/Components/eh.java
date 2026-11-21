package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    public /* synthetic */ eh(ui uiVar, int i7) {
        this.a = i7;
        this.b = uiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.R1();
                break;
            case 1:
                this.b.B2.invalidate();
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui uiVar = this.b;
                uiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = uiVar.c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    break;
                }
                break;
            case 3:
                ui uiVar2 = this.b;
                uiVar2.getClass();
                uiVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ui uiVar3 = this.b;
                mi miVar = uiVar3.w2;
                zk zkVar = uiVar3.r2;
                if (miVar == zkVar && zkVar != null) {
                    zkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.R1();
                break;
        }
    }
}
