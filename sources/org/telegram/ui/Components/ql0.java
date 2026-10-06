package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ql0(Object obj, float f7, float f10, int i10) {
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
                zl0 zl0Var = (zl0) ((tl0) obj).b;
                if (zl0Var.e1 != null && (view = zl0Var.N1) != null) {
                    zl0Var.j1(view, f10, f7, true);
                    zl0Var.e1 = null;
                    break;
                }
                break;
            default:
                ai.j6 j6Var = (ai.j6) obj;
                sg.e eVar = (sg.e) j6Var.b;
                ValueAnimator valueAnimator = eVar.S;
                sg.b bVar = eVar.a0;
                sg.b bVar2 = eVar.W;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    eVar.S.cancel();
                    eVar.S = null;
                }
                AnimatorSet animatorSet = eVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    eVar.T.cancel();
                    eVar.T = null;
                }
                if (Math.abs(eVar.b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(eVar.U);
                    eVar.T = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(eVar.b.d, f10);
                    ofFloat.addUpdateListener(bVar2);
                    long j3 = 220;
                    ofFloat.setDuration(j3);
                    tr trVar = tr.h;
                    ofFloat.setInterpolator(trVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.b.g, f7);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(trVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    eVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    eVar.T.addListener(new pg.d0(j6Var, 6));
                    eVar.T.start();
                    break;
                } else {
                    eVar.i();
                    break;
                }
        }
    }
}
