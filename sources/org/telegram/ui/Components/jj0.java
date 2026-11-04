package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jj0(Object obj, float f10, float f11, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i3 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                tj0 tj0Var = (tj0) ((mj0) obj).b;
                if (tj0Var.d1 != null && (view = tj0Var.M1) != null) {
                    tj0Var.j1(view, f11, f10, true);
                    tj0Var.d1 = null;
                    break;
                }
                break;
            default:
                wg.h hVar = (wg.h) obj;
                wg.m mVar = hVar.b;
                ValueAnimator valueAnimator = mVar.d0;
                wg.g gVar = mVar.i0;
                wg.g gVar2 = mVar.h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.d0.cancel();
                    mVar.d0 = null;
                }
                AnimatorSet animatorSet = mVar.e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.e0.cancel();
                    mVar.e0 = null;
                }
                if (Math.abs(mVar.b.d) <= 10.0f) {
                    org.telegram.messenger.g0.r(mVar.f0);
                    mVar.e0 = new AnimatorSet();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.b.d, f11);
                    ofFloat.addUpdateListener(gVar2);
                    long j10 = org.telegram.messenger.hs.x3;
                    ofFloat.setDuration(j10);
                    xq xqVar = xq.h;
                    ofFloat.setInterpolator(xqVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(gVar2);
                    ofFloat2.setStartDelay(j10);
                    ofFloat2.setDuration(600L);
                    OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                    ofFloat2.setInterpolator(overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.b.i, f10);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(j10);
                    ofFloat3.setInterpolator(xqVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(gVar);
                    ofFloat4.setStartDelay(j10);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(overshootInterpolator);
                    mVar.e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    mVar.e0.addListener(new i81(hVar, 22));
                    mVar.e0.start();
                    break;
                } else {
                    mVar.l();
                    break;
                }
        }
    }
}
