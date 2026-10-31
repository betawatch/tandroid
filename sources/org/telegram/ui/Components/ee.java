package org.telegram.ui.Components;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ee(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ee eeVar = chatActivityEnterView.r3;
                if ((!chatActivityEnterView.f0() || !chatActivityEnterView.r()) && !org.telegram.ui.ActionBar.k2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.k3 && !chatActivityEnterView.z2 && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E) {
                    sf sfVar = chatActivityEnterView.Z2;
                    if (sfVar != null) {
                        sfVar.b1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    org.telegram.messenger.i0.J3(chatActivityEnterView.E0);
                    org.telegram.messenger.i0.r(eeVar);
                    org.telegram.messenger.i0.h3(eeVar, 100L);
                    break;
                }
                break;
            case 1:
                sf sfVar2 = this.b.Z2;
                if (sfVar2 != null) {
                    sfVar2.V1(0, 0, 0, 0L, 0L, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    break;
                }
                break;
        }
    }
}
