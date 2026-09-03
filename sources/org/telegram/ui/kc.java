package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ kc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bd bdVar = (bd) this.c;
                bdVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.j0.invalidate();
                if (!this.b && bdVar.k0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                np0 np0Var = (np0) this.c;
                np0Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                np0Var.U.invalidate();
                if (!this.b && np0Var.V > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                jd1 jd1Var = (jd1) this.c;
                jd1Var.f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.e2.invalidate();
                if (!this.b && jd1Var.f2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                qh.ba baVar = (qh.ba) this.c;
                baVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.wo woVar = baVar.z2;
                if (woVar != null) {
                    woVar.invalidate();
                }
                if (!this.b && baVar.A2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
