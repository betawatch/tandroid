package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ywVar.x3 = null;
                int i7 = 0;
                ywVar.P = false;
                ywVar.R = true;
                ywVar.S = true;
                ywVar.fragmentView.invalidate();
                ywVar.A3 = -(org.telegram.messenger.g0.L((ywVar.L ? 81 : 0) + 48) - this.b);
                ywVar.f0[0].setTranslationY(0.0f);
                while (true) {
                    xw[] xwVarArr = ywVar.f0;
                    if (i7 >= xwVarArr.length) {
                        ywVar.fragmentView.requestLayout();
                        nw nwVar = ywVar.Y;
                        if (nwVar != null && ywVar.b.f) {
                            nwVar.r.requestFocus();
                            org.telegram.messenger.g0.J3(ywVar.Y.r);
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
                ywVar2.x3 = null;
                ywVar2.Q = 0;
                ywVar2.P = true;
                ywVar2.A3 = org.telegram.messenger.g0.L((ywVar2.L ? 81 : 0) + 48) - this.b;
                ywVar2.f0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr2 = ywVar2.f0;
                    if (i10 >= xwVarArr2.length) {
                        ywVar2.F0.l(false, 1.0f);
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
