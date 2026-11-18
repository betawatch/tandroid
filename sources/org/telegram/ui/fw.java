package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cx c;

    public /* synthetic */ fw(cx cxVar, float f10, int i7) {
        this.a = i7;
        this.c = cxVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                cx cxVar = this.c;
                cxVar.x3 = null;
                int i7 = 0;
                cxVar.P = false;
                cxVar.R = true;
                cxVar.S = true;
                cxVar.fragmentView.invalidate();
                cxVar.A3 = -(org.telegram.messenger.g0.L((cxVar.L ? 81 : 0) + 48) - this.b);
                cxVar.f0[0].setTranslationY(0.0f);
                while (true) {
                    bx[] bxVarArr = cxVar.f0;
                    if (i7 >= bxVarArr.length) {
                        cxVar.fragmentView.requestLayout();
                        qw qwVar = cxVar.Y;
                        if (qwVar != null && cxVar.b.f) {
                            qwVar.r.requestFocus();
                            org.telegram.messenger.g0.I3(cxVar.Y.r);
                            break;
                        }
                    } else {
                        bx bxVar = bxVarArr[i7];
                        if (bxVar != null) {
                            bxVar.a.requestLayout();
                        }
                        i7++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cx cxVar2 = this.c;
                cxVar2.x3 = null;
                cxVar2.Q = 0;
                cxVar2.P = true;
                cxVar2.A3 = org.telegram.messenger.g0.L((cxVar2.L ? 81 : 0) + 48) - this.b;
                cxVar2.f0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    bx[] bxVarArr2 = cxVar2.f0;
                    if (i10 >= bxVarArr2.length) {
                        cxVar2.F0.l(false, 1.0f);
                        cxVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        bx bxVar2 = bxVarArr2[i10];
                        if (bxVar2 != null) {
                            bxVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
