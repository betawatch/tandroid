package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ em0(Object obj, float f7, float f10, int i10) {
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
                nm0 nm0Var = (nm0) ((hm0) obj).b;
                if (nm0Var.c1 != null && (view = nm0Var.L1) != null) {
                    nm0Var.k1(view, f10, f7, true);
                    nm0Var.c1 = null;
                    break;
                }
                break;
            default:
                ug.i iVar = (ug.i) obj;
                ug.n nVar = iVar.b;
                ValueAnimator valueAnimator = nVar.c0;
                ug.h hVar = nVar.h0;
                ug.h hVar2 = nVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.c0.cancel();
                    nVar.c0 = null;
                }
                AnimatorSet animatorSet = nVar.d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.d0.cancel();
                    nVar.d0 = null;
                }
                if (Math.abs(nVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(nVar.e0);
                    nVar.d0 = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.b.d, f10);
                    ofFloat.addUpdateListener(hVar2);
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    ds dsVar = ds.h;
                    ofFloat.setInterpolator(dsVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(hVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.b.i, f7);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(dsVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(hVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    nVar.d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    nVar.d0.addListener(new org.telegram.ui.hc1(iVar, 22));
                    nVar.d0.start();
                    break;
                } else {
                    nVar.l();
                    break;
                }
        }
    }
}
