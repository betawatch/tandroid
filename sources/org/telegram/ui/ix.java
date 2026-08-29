package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ix extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fy c;

    public /* synthetic */ ix(fy fyVar, float f9, int i10) {
        this.a = i10;
        this.c = fyVar;
        this.b = f9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                fy fyVar = this.c;
                fyVar.q3 = null;
                int i10 = 0;
                fyVar.K = false;
                fyVar.M = true;
                fyVar.N = true;
                fyVar.fragmentView.invalidate();
                fyVar.t3 = -(AndroidUtilities.dp((fyVar.G ? 81 : 0) + 48) - this.b);
                fyVar.a0[0].setTranslationY(0.0f);
                while (true) {
                    ey[] eyVarArr = fyVar.a0;
                    if (i10 >= eyVarArr.length) {
                        fyVar.fragmentView.requestLayout();
                        ux uxVar = fyVar.T;
                        if (uxVar != null && fyVar.b.f) {
                            uxVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(fyVar.T.r);
                            break;
                        }
                    } else {
                        ey eyVar = eyVarArr[i10];
                        if (eyVar != null) {
                            eyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                fy fyVar2 = this.c;
                fyVar2.q3 = null;
                fyVar2.L = 0;
                fyVar2.K = true;
                fyVar2.t3 = AndroidUtilities.dp((fyVar2.G ? 81 : 0) + 48) - this.b;
                fyVar2.a0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    ey[] eyVarArr2 = fyVar2.a0;
                    if (i11 >= eyVarArr2.length) {
                        fyVar2.A0.l(1.0f, false);
                        fyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        ey eyVar2 = eyVarArr2[i11];
                        if (eyVar2 != null) {
                            eyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
