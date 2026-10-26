package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ne(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.b;
                unVar.W8 = floatValue;
                mm mmVar = unVar.j1;
                if (mmVar != null) {
                    mmVar.invalidate();
                    unVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b;
                unVar2.getClass();
                unVar2.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.yc();
                break;
            case 2:
                un unVar3 = this.b;
                unVar3.getClass();
                unVar3.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar3.yc();
                break;
            case 3:
                un unVar4 = this.b;
                unVar4.getClass();
                unVar4.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar4.x9();
                break;
            default:
                un unVar5 = this.b;
                unVar5.getClass();
                unVar5.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar5.x9();
                break;
        }
    }
}
