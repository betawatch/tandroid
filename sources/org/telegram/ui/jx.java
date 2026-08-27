package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gy c;

    public /* synthetic */ jx(gy gyVar, float f10, int i10) {
        this.a = i10;
        this.c = gyVar;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                gy gyVar = this.c;
                gyVar.q3 = null;
                int i10 = 0;
                gyVar.K = false;
                gyVar.M = true;
                gyVar.N = true;
                gyVar.fragmentView.invalidate();
                gyVar.t3 = -(AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48) - this.b);
                gyVar.a0[0].setTranslationY(0.0f);
                while (true) {
                    fy[] fyVarArr = gyVar.a0;
                    if (i10 >= fyVarArr.length) {
                        gyVar.fragmentView.requestLayout();
                        vx vxVar = gyVar.T;
                        if (vxVar != null && gyVar.b.f) {
                            vxVar.r.requestFocus();
                            AndroidUtilities.showKeyboard(gyVar.T.r);
                            break;
                        }
                    } else {
                        fy fyVar = fyVarArr[i10];
                        if (fyVar != null) {
                            fyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                gy gyVar2 = this.c;
                gyVar2.q3 = null;
                gyVar2.L = 0;
                gyVar2.K = true;
                gyVar2.t3 = AndroidUtilities.dp((gyVar2.G ? 81 : 0) + 48) - this.b;
                gyVar2.a0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    fy[] fyVarArr2 = gyVar2.a0;
                    if (i11 >= fyVarArr2.length) {
                        gyVar2.A0.l(1.0f, false);
                        gyVar2.fragmentView.requestLayout();
                        break;
                    } else {
                        fy fyVar2 = fyVarArr2[i11];
                        if (fyVar2 != null) {
                            fyVar2.a.requestLayout();
                        }
                        i11++;
                    }
                }
        }
    }
}
