package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ok(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.bh bhVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                AnimatorSet animatorSet = boVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    boVar.V9.start();
                    break;
                }
                break;
            default:
                bo boVar2 = this.b;
                if (boVar2.O2 == this && (bhVar = boVar2.M0) != null && (frameLayout = boVar2.N2) != null) {
                    bhVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
