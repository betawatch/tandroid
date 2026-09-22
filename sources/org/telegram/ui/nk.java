package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ nk(bo boVar, int i10) {
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
