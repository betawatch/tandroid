package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ im0(Object obj, float f7, float f10, int i10) {
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
                qm0 qm0Var = (qm0) ((lm0) obj).b;
                if (qm0Var.c1 != null && (view = qm0Var.L1) != null) {
                    qm0Var.h1(view, f10, f7, true);
                    qm0Var.c1 = null;
                    break;
                }
                break;
            default:
                sg.i iVar = (sg.i) obj;
                sg.n nVar = iVar.b;
                ValueAnimator valueAnimator = nVar.W;
                sg.h hVar = nVar.e0;
                sg.h hVar2 = nVar.d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.a0.cancel();
                    nVar.a0 = null;
                }
                if (Math.abs(nVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(nVar.b0);
                    nVar.a0 = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.b.d, f10);
                    ofFloat.addUpdateListener(hVar2);
                    long j3 = 220;
                    ofFloat.setDuration(j3);
                    hs hsVar = hs.h;
                    ofFloat.setInterpolator(hsVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(hVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.b.i, f7);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(hsVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(hVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    nVar.a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    nVar.a0.addListener(new org.telegram.ui.Wallet.x4(iVar, 14));
                    nVar.a0.start();
                    break;
                } else {
                    nVar.l();
                    break;
                }
        }
    }
}
