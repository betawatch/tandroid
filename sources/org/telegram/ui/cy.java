package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cy extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ yy c;

    public /* synthetic */ cy(yy yyVar, float f7, int i10) {
        this.a = i10;
        this.c = yyVar;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                yy yyVar = this.c;
                yyVar.v3 = null;
                int i10 = 0;
                yyVar.O = false;
                yyVar.Q = true;
                yyVar.R = true;
                yyVar.fragmentView.invalidate();
                yyVar.y3 = -(AndroidUtilities.dp((yyVar.K ? 81 : 0) + 48) - this.b);
                yyVar.e0[0].setTranslationY(0.0f);
                while (true) {
                    xy[] xyVarArr = yyVar.e0;
                    if (i10 >= xyVarArr.length) {
                        yyVar.fragmentView.requestLayout();
                        oy oyVar = yyVar.X;
                        if (oyVar != null && yyVar.b.f) {
                            oyVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(yyVar.X.r);
                            break;
                        }
                    } else {
                        xy xyVar = xyVarArr[i10];
                        if (xyVar != null) {
                            xyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yy yyVar2 = this.c;
                yyVar2.v3 = null;
                yyVar2.P = 0;
                yyVar2.O = true;
                yyVar2.y3 = AndroidUtilities.dp((yyVar2.K ? 81 : 0) + 48) - this.b;
                yyVar2.e0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    xy[] xyVarArr2 = yyVar2.e0;
                    if (i11 >= xyVarArr2.length) {
                        yyVar2.E0.l(1.0f, false);
                        yyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        xy xyVar2 = xyVarArr2[i11];
                        if (xyVar2 != null) {
                            xyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
