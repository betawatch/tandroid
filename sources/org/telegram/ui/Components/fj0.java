package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fj0(Object obj, float f10, float f11, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i7 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                pj0 pj0Var = (pj0) ((ij0) obj).b;
                if (pj0Var.c1 != null && (view = pj0Var.L1) != null) {
                    pj0Var.j1(view, f11, f10, true);
                    pj0Var.c1 = null;
                    break;
                }
                break;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.b;
                ValueAnimator valueAnimator = mVar.c0;
                vg.g gVar = mVar.h0;
                vg.g gVar2 = mVar.g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.c0.cancel();
                    mVar.c0 = null;
                }
                AnimatorSet animatorSet = mVar.d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.d0.cancel();
                    mVar.d0 = null;
                }
                if (Math.abs(mVar.b.d) <= 10.0f) {
                    org.telegram.messenger.g0.r(mVar.e0);
                    mVar.d0 = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.b.d, f11);
                    ofFloat.addUpdateListener(gVar2);
                    long j3 = org.telegram.messenger.qs.x3;
                    ofFloat.setDuration(j3);
                    xq xqVar = xq.h;
                    ofFloat.setInterpolator(xqVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(gVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                    ofFloat2.setInterpolator(overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.b.i, f10);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(xqVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(gVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(overshootInterpolator);
                    mVar.d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    mVar.d0.addListener(new r81(hVar, 22));
                    mVar.d0.start();
                    break;
                } else {
                    mVar.l();
                    break;
                }
        }
    }
}
