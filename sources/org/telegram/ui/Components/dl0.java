package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.oj1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dl0(Object obj, float f7, float f10, int i10) {
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
                ll0 ll0Var = (ll0) ((gl0) obj).b;
                if (ll0Var.e1 != null && (view = ll0Var.N1) != null) {
                    ll0Var.g1(view, f10, f7, true);
                    ll0Var.e1 = null;
                    break;
                }
                break;
            default:
                bi.t5 t5Var = (bi.t5) obj;
                tg.e eVar = (tg.e) t5Var.b;
                ValueAnimator valueAnimator = eVar.S;
                tg.b bVar = eVar.a0;
                tg.b bVar2 = eVar.W;
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
                    pr prVar = pr.h;
                    ofFloat.setInterpolator(prVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat2.addUpdateListener(bVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.b.g, f7);
                    ofFloat3.addUpdateListener(bVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(prVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                    ofFloat4.addUpdateListener(bVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    eVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    eVar.T.addListener(new oj1(t5Var, 8));
                    eVar.T.start();
                    break;
                } else {
                    eVar.i();
                    break;
                }
        }
    }
}
