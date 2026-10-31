package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ay c;

    public /* synthetic */ fx(ay ayVar, float f7, int i10) {
        this.a = i10;
        this.c = ayVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ay ayVar = this.c;
                ayVar.v3 = null;
                int i10 = 0;
                ayVar.O = false;
                ayVar.Q = true;
                ayVar.R = true;
                ayVar.fragmentView.invalidate();
                ayVar.y3 = -(org.telegram.messenger.i0.L((ayVar.K ? 81 : 0) + 48) - this.b);
                ayVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    zx[] zxVarArr = ayVar.e0;
                    if (i10 >= zxVarArr.length) {
                        ayVar.fragmentView.requestLayout();
                        px pxVar = ayVar.X;
                        if (pxVar != null && ayVar.b.f) {
                            pxVar.r.requestFocus();
                            org.telegram.messenger.i0.J3(ayVar.X.r);
                            break;
                        }
                    } else {
                        zx zxVar = zxVarArr[i10];
                        if (zxVar != null) {
                            zxVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ay ayVar2 = this.c;
                ayVar2.v3 = null;
                ayVar2.P = 0;
                ayVar2.O = true;
                ayVar2.y3 = org.telegram.messenger.i0.L((ayVar2.K ? 81 : 0) + 48) - this.b;
                ayVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    zx[] zxVarArr2 = ayVar2.e0;
                    if (i11 >= zxVarArr2.length) {
                        ayVar2.E0.l(false, 1.0f);
                        ayVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        zx zxVar2 = zxVarArr2[i11];
                        if (zxVar2 != null) {
                            zxVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
