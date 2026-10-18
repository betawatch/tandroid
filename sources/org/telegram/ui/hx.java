package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ey c;

    public /* synthetic */ hx(ey eyVar, float f7, int i10) {
        this.a = i10;
        this.c = eyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ey eyVar = this.c;
                eyVar.v3 = null;
                int i10 = 0;
                eyVar.O = false;
                eyVar.Q = true;
                eyVar.R = true;
                eyVar.fragmentView.invalidate();
                eyVar.y3 = -(AndroidUtilities.dp((eyVar.K ? 81 : 0) + 48) - this.b);
                eyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    dy[] dyVarArr = eyVar.e0;
                    if (i10 >= dyVarArr.length) {
                        eyVar.fragmentView.requestLayout();
                        tx txVar = eyVar.X;
                        if (txVar != null && eyVar.b.f) {
                            txVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(eyVar.X.r);
                            break;
                        }
                    } else {
                        dy dyVar = dyVarArr[i10];
                        if (dyVar != null) {
                            dyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ey eyVar2 = this.c;
                eyVar2.v3 = null;
                eyVar2.P = 0;
                eyVar2.O = true;
                eyVar2.y3 = AndroidUtilities.dp((eyVar2.K ? 81 : 0) + 48) - this.b;
                eyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    dy[] dyVarArr2 = eyVar2.e0;
                    if (i11 >= dyVarArr2.length) {
                        eyVar2.E0.l(1.0f, false);
                        eyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        dy dyVar2 = dyVarArr2[i11];
                        if (dyVar2 != null) {
                            dyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
