package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ am0(Object obj, float f7, float f10, int i10) {
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
                im0 im0Var = (im0) ((dm0) obj).b;
                if (im0Var.c1 != null && (view = im0Var.L1) != null) {
                    im0Var.h1(view, f10, f7, true);
                    im0Var.c1 = null;
                    break;
                }
                break;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.b;
                ValueAnimator valueAnimator = nVar.W;
                tg.h hVar = nVar.e0;
                tg.h hVar2 = nVar.d0;
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
                    long j10 = 220;
                    ofFloat.setDuration(j10);
                    bs bsVar = bs.h;
                    ofFloat.setInterpolator(bsVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(hVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.b.i, f7);
                    ofFloat3.addUpdateListener(hVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(bsVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(hVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    nVar.a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    nVar.a0.addListener(new vf1(iVar, 20));
                    nVar.a0.start();
                    break;
                } else {
                    nVar.l();
                    break;
                }
        }
    }
}
