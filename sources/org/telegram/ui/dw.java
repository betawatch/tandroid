package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ zw c;

    public /* synthetic */ dw(zw zwVar, float f10, int i7) {
        this.a = i7;
        this.c = zwVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                zw zwVar = this.c;
                zwVar.w3 = null;
                int i7 = 0;
                zwVar.O = false;
                zwVar.Q = true;
                zwVar.R = true;
                zwVar.fragmentView.invalidate();
                zwVar.z3 = -(org.telegram.messenger.g0.L((zwVar.K ? 81 : 0) + 48) - this.b);
                zwVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    yw[] ywVarArr = zwVar.e0;
                    if (i7 >= ywVarArr.length) {
                        zwVar.fragmentView.requestLayout();
                        ow owVar = zwVar.X;
                        if (owVar != null && zwVar.b.f) {
                            owVar.r.requestFocus();
                            org.telegram.messenger.g0.K3(zwVar.X.r);
                            break;
                        }
                    } else {
                        yw ywVar = ywVarArr[i7];
                        if (ywVar != null) {
                            ywVar.a.requestLayout();
                        }
                        i7++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                zw zwVar2 = this.c;
                zwVar2.w3 = null;
                zwVar2.P = 0;
                zwVar2.O = true;
                zwVar2.z3 = org.telegram.messenger.g0.L((zwVar2.K ? 81 : 0) + 48) - this.b;
                zwVar2.e0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    yw[] ywVarArr2 = zwVar2.e0;
                    if (i10 >= ywVarArr2.length) {
                        zwVar2.E0.l(false, 1.0f);
                        zwVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        yw ywVar2 = ywVarArr2[i10];
                        if (ywVar2 != null) {
                            ywVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
