package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nl0(Object obj, float f7, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i10 = this.a;
        float f7 = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                vl0 vl0Var = (vl0) ((ql0) obj).b;
                if (vl0Var.e1 != null && (view = vl0Var.N1) != null) {
                    vl0Var.g1(view, f10, f7, true);
                    vl0Var.e1 = null;
                    break;
                }
                break;
            default:
                rg.c cVar = (rg.c) obj;
                rg.f fVar = (rg.f) cVar.b;
                ValueAnimator valueAnimator = fVar.S;
                rg.b bVar = fVar.a0;
                rg.b bVar2 = fVar.W;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    fVar.S.cancel();
                    fVar.S = null;
                }
                AnimatorSet animatorSet = fVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    fVar.T.cancel();
                    fVar.T = null;
                }
                if (Math.abs(fVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(fVar.U);
                    fVar.T = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fVar.b.d, f10);
                    ofFloat.addUpdateListener(bVar2);
                    long j3 = 220;
                    ofFloat.setDuration(j3);
                    wr wrVar = wr.h;
                    ofFloat.setInterpolator(wrVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fVar.b.g, f7);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(wrVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    fVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    fVar.T.addListener(new org.telegram.ui.mv0(cVar, 24));
                    fVar.T.start();
                    break;
                } else {
                    fVar.i();
                    break;
                }
        }
    }
}
