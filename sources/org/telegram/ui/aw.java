package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class aw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ww c;

    public /* synthetic */ aw(ww wwVar, float f10, int i7) {
        this.a = i7;
        this.c = wwVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ww wwVar = this.c;
                wwVar.v3 = null;
                int i7 = 0;
                wwVar.O = false;
                wwVar.Q = true;
                wwVar.R = true;
                wwVar.fragmentView.invalidate();
                wwVar.y3 = -(org.telegram.messenger.g0.L((wwVar.K ? 81 : 0) + 48) - this.b);
                wwVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    vw[] vwVarArr = wwVar.e0;
                    if (i7 >= vwVarArr.length) {
                        wwVar.fragmentView.requestLayout();
                        lw lwVar = wwVar.X;
                        if (lwVar != null && wwVar.b.f) {
                            lwVar.r.requestFocus();
                            org.telegram.messenger.g0.K3(wwVar.X.r);
                            break;
                        }
                    } else {
                        vw vwVar = vwVarArr[i7];
                        if (vwVar != null) {
                            vwVar.a.requestLayout();
                        }
                        i7++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ww wwVar2 = this.c;
                wwVar2.v3 = null;
                wwVar2.P = 0;
                wwVar2.O = true;
                wwVar2.y3 = org.telegram.messenger.g0.L((wwVar2.K ? 81 : 0) + 48) - this.b;
                wwVar2.e0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    vw[] vwVarArr2 = wwVar2.e0;
                    if (i10 >= vwVarArr2.length) {
                        wwVar2.E0.l(false, 1.0f);
                        wwVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        vw vwVar2 = vwVarArr2[i10];
                        if (vwVar2 != null) {
                            vwVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
