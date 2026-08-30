package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                gp0 gp0Var = (gp0) this.c;
                gp0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gp0Var.L.invalidate();
                if (!this.b && gp0Var.M > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                cd1 cd1Var = (cd1) this.c;
                cd1Var.f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var.e2.invalidate();
                if (!this.b && cd1Var.f2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                ph.da daVar = (ph.da) this.c;
                daVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.uo uoVar = daVar.z2;
                if (uoVar != null) {
                    uoVar.invalidate();
                }
                if (!this.b && daVar.A2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
