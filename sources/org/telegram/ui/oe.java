package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ oe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un unVar = this.b;
                unVar.Y8 = floatValue;
                km kmVar = unVar.l1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    unVar.z0.invalidate();
                    break;
                }
                break;
            case 1:
                un unVar2 = this.b;
                unVar2.getClass();
                unVar2.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar2.Kc();
                break;
            case 2:
                un unVar3 = this.b;
                unVar3.getClass();
                unVar3.w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar3.Kc();
                break;
            case 3:
                un unVar4 = this.b;
                unVar4.getClass();
                unVar4.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar4.F9();
                break;
            default:
                un unVar5 = this.b;
                unVar5.getClass();
                unVar5.Xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar5.F9();
                break;
        }
    }
}
