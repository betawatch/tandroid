package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ dh(ti tiVar, int i7) {
        this.a = i7;
        this.b = tiVar;
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
                ti tiVar = this.b;
                tiVar.D0 = floatValue;
                org.telegram.ui.ActionBar.m2 m2Var = tiVar.c;
                if (m2Var != null) {
                    m2Var.invalidate();
                    break;
                }
                break;
            case 3:
                ti tiVar2 = this.b;
                tiVar2.getClass();
                tiVar2.A1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ti tiVar3 = this.b;
                li liVar = tiVar3.w2;
                xk xkVar = tiVar3.r2;
                if (liVar == xkVar && xkVar != null) {
                    xkVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.R1();
                break;
        }
    }
}
