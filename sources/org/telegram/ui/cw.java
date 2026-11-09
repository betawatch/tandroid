package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ yw c;

    public /* synthetic */ cw(yw ywVar, float f10, int i7) {
        this.a = i7;
        this.c = ywVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                yw ywVar = this.c;
                ywVar.w3 = null;
                int i7 = 0;
                ywVar.O = false;
                ywVar.Q = true;
                ywVar.R = true;
                ywVar.fragmentView.invalidate();
                ywVar.z3 = -(org.telegram.messenger.g0.L((ywVar.K ? 81 : 0) + 48) - this.b);
                ywVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    xw[] xwVarArr = ywVar.e0;
                    if (i7 >= xwVarArr.length) {
                        ywVar.fragmentView.requestLayout();
                        nw nwVar = ywVar.X;
                        if (nwVar != null && ywVar.b.f) {
                            nwVar.r.requestFocus();
                            org.telegram.messenger.g0.K3(ywVar.X.r);
                            break;
                        }
                    } else {
                        xw xwVar = xwVarArr[i7];
                        if (xwVar != null) {
                            xwVar.a.requestLayout();
                        }
                        i7++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yw ywVar2 = this.c;
                ywVar2.w3 = null;
                ywVar2.P = 0;
                ywVar2.O = true;
                ywVar2.z3 = org.telegram.messenger.g0.L((ywVar2.K ? 81 : 0) + 48) - this.b;
                ywVar2.e0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr2 = ywVar2.e0;
                    if (i10 >= xwVarArr2.length) {
                        ywVar2.E0.l(false, 1.0f);
                        ywVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        xw xwVar2 = xwVarArr2[i10];
                        if (xwVar2 != null) {
                            xwVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
