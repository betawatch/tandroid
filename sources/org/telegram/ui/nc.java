package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ nc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dd ddVar = (dd) this.c;
                ddVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddVar.j0.invalidate();
                if (!this.b && ddVar.k0 > 0.5f) {
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
                ph.da daVar = (ph.da) this.c;
                daVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.to toVar = daVar.z2;
                if (toVar != null) {
                    toVar.invalidate();
                }
                if (!this.b && daVar.A2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
