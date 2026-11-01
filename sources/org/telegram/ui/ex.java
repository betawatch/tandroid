package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ex extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ zx c;

    public /* synthetic */ ex(zx zxVar, float f7, int i10) {
        this.a = i10;
        this.c = zxVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                zx zxVar = this.c;
                zxVar.v3 = null;
                int i10 = 0;
                zxVar.O = false;
                zxVar.Q = true;
                zxVar.R = true;
                zxVar.fragmentView.invalidate();
                zxVar.y3 = -(org.telegram.messenger.i0.L((zxVar.K ? 81 : 0) + 48) - this.b);
                zxVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    yx[] yxVarArr = zxVar.e0;
                    if (i10 >= yxVarArr.length) {
                        zxVar.fragmentView.requestLayout();
                        ox oxVar = zxVar.X;
                        if (oxVar != null && zxVar.b.f) {
                            oxVar.r.requestFocus();
                            org.telegram.messenger.i0.J3(zxVar.X.r);
                            break;
                        }
                    } else {
                        yx yxVar = yxVarArr[i10];
                        if (yxVar != null) {
                            yxVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                zx zxVar2 = this.c;
                zxVar2.v3 = null;
                zxVar2.P = 0;
                zxVar2.O = true;
                zxVar2.y3 = org.telegram.messenger.i0.L((zxVar2.K ? 81 : 0) + 48) - this.b;
                zxVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    yx[] yxVarArr2 = zxVar2.e0;
                    if (i11 >= yxVarArr2.length) {
                        zxVar2.E0.l(false, 1.0f);
                        zxVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        yx yxVar2 = yxVarArr2[i11];
                        if (yxVar2 != null) {
                            yxVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
