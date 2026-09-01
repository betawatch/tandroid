package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class lc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ lc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
                ip0 ip0Var = (ip0) this.c;
                ip0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ip0Var.L.invalidate();
                if (!this.b && ip0Var.M > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                ed1 ed1Var = (ed1) this.c;
                ed1Var.f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var.e2.invalidate();
                if (!this.b && ed1Var.f2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                qh.ca caVar = (qh.ca) this.c;
                caVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.wo woVar = caVar.z2;
                if (woVar != null) {
                    woVar.invalidate();
                }
                if (!this.b && caVar.A2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
