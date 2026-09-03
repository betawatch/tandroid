package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ mk(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                AnimatorSet animatorSet = znVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.S9.start();
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.L2 == this && (sgVar = znVar2.J0) != null && (frameLayout = znVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
