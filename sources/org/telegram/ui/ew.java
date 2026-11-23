package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ew extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ bx c;

    public /* synthetic */ ew(bx bxVar, float f10, int i7) {
        this.a = i7;
        this.c = bxVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                bx bxVar = this.c;
                bxVar.x3 = null;
                int i7 = 0;
                bxVar.P = false;
                bxVar.R = true;
                bxVar.S = true;
                bxVar.fragmentView.invalidate();
                bxVar.A3 = -(org.telegram.messenger.g0.L((bxVar.L ? 81 : 0) + 48) - this.b);
                bxVar.f0[0].setTranslationY(0.0f);
                while (true) {
                    ax[] axVarArr = bxVar.f0;
                    if (i7 >= axVarArr.length) {
                        bxVar.fragmentView.requestLayout();
                        pw pwVar = bxVar.Y;
                        if (pwVar != null && bxVar.b.f) {
                            pwVar.r.requestFocus();
                            org.telegram.messenger.g0.I3(bxVar.Y.r);
                            break;
                        }
                    } else {
                        ax axVar = axVarArr[i7];
                        if (axVar != null) {
                            axVar.a.requestLayout();
                        }
                        i7++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                bx bxVar2 = this.c;
                bxVar2.x3 = null;
                bxVar2.Q = 0;
                bxVar2.P = true;
                bxVar2.A3 = org.telegram.messenger.g0.L((bxVar2.L ? 81 : 0) + 48) - this.b;
                bxVar2.f0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    ax[] axVarArr2 = bxVar2.f0;
                    if (i10 >= axVarArr2.length) {
                        bxVar2.F0.l(false, 1.0f);
                        bxVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        ax axVar2 = axVarArr2[i10];
                        if (axVar2 != null) {
                            axVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
