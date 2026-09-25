package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.b;
                if (e3Var.startAnimationRunnable == this) {
                    z10 = e3Var.dismissed;
                    if (!z10) {
                        e3Var.startAnimationRunnable = null;
                        e3.access$2400(e3Var);
                        break;
                    }
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.d0(false, true, false);
                    break;
                }
                break;
            case 2:
                o1 o1Var = (o1) this.b;
                ValueAnimator valueAnimator = o1Var.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    o1Var.m.start();
                    break;
                }
                break;
            default:
                t4 t4Var = (t4) this.b;
                t4Var.k();
                t4Var.j();
                t4Var.f.setAlpha(1.0f);
                break;
        }
    }
}
