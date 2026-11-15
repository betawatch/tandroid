package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kj0(Object obj, float f10, float f11, int i7) {
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
                uj0 uj0Var = (uj0) ((nj0) obj).b;
                if (uj0Var.d1 != null && (view = uj0Var.M1) != null) {
                    uj0Var.j1(view, f11, f10, true);
                    uj0Var.d1 = null;
                    break;
                }
                break;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.b;
                ValueAnimator valueAnimator = mVar.d0;
                vg.g gVar = mVar.i0;
                vg.g gVar2 = mVar.h0;
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
                    long j3 = org.telegram.messenger.ns.x3;
                    ofFloat.setDuration(j3);
                    er erVar = er.h;
                    ofFloat.setInterpolator(erVar);
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat2.addUpdateListener(gVar2);
                    ofFloat2.setStartDelay(j3);
                    ofFloat2.setDuration(600L);
                    OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                    ofFloat2.setInterpolator(overshootInterpolator);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.b.i, f10);
                    ofFloat3.addUpdateListener(gVar);
                    ofFloat3.setDuration(j3);
                    ofFloat3.setInterpolator(erVar);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat4.addUpdateListener(gVar);
                    ofFloat4.setStartDelay(j3);
                    ofFloat4.setDuration(600L);
                    ofFloat4.setInterpolator(overshootInterpolator);
                    mVar.e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    mVar.e0.addListener(new org.telegram.ui.g71(hVar, 23));
                    mVar.e0.start();
                    break;
                } else {
                    mVar.l();
                    break;
                }
        }
    }
}
