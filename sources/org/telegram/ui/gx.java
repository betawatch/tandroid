package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ dy c;

    public /* synthetic */ gx(dy dyVar, float f10, int i9) {
        this.a = i9;
        this.c = dyVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                dy dyVar = this.c;
                dyVar.q3 = null;
                int i9 = 0;
                dyVar.K = false;
                dyVar.M = true;
                dyVar.N = true;
                dyVar.fragmentView.invalidate();
                dyVar.t3 = -(AndroidUtilities.dp((dyVar.G ? 81 : 0) + 48) - this.b);
                dyVar.a0[0].setTranslationY(0.0f);
                while (true) {
                    cy[] cyVarArr = dyVar.a0;
                    if (i9 >= cyVarArr.length) {
                        dyVar.fragmentView.requestLayout();
                        sx sxVar = dyVar.T;
                        if (sxVar != null && dyVar.b.f) {
                            sxVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(dyVar.T.r);
                            break;
                        }
                    } else {
                        cy cyVar = cyVarArr[i9];
                        if (cyVar != null) {
                            cyVar.a.requestLayout();
                        }
                        i9++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                dy dyVar2 = this.c;
                dyVar2.q3 = null;
                dyVar2.L = 0;
                dyVar2.K = true;
                dyVar2.t3 = AndroidUtilities.dp((dyVar2.G ? 81 : 0) + 48) - this.b;
                dyVar2.a0[0].setTranslationY(0.0f);
                int i10 = 0;
                while (true) {
                    cy[] cyVarArr2 = dyVar2.a0;
                    if (i10 >= cyVarArr2.length) {
                        dyVar2.A0.l(1.0f, false);
                        dyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        cy cyVar2 = cyVarArr2[i10];
                        if (cyVar2 != null) {
                            cyVar2.a.requestLayout();
                        }
                        i10++;
                    }
                }
        }
    }
}
