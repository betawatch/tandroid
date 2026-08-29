package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ek implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ ek(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.vg vgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                AnimatorSet animatorSet = tnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    tnVar.R9.start();
                    break;
                }
                break;
            default:
                tn tnVar2 = this.b;
                if (tnVar2.K2 == this && (vgVar = tnVar2.I0) != null && (frameLayout = tnVar2.J2) != null) {
                    vgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
