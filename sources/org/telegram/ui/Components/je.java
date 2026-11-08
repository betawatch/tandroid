package org.telegram.ui.Components;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                je jeVar = chatActivityEnterView.r3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.f2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.k3 && !chatActivityEnterView.z2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    wf wfVar = chatActivityEnterView.Z2;
                    if (wfVar != null) {
                        wfVar.f1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    org.telegram.messenger.g0.K3(chatActivityEnterView.E0);
                    org.telegram.messenger.g0.r(jeVar);
                    org.telegram.messenger.g0.i3(jeVar, 100L);
                    break;
                }
                break;
            case 1:
                wf wfVar2 = this.b.Z2;
                if (wfVar2 != null) {
                    wfVar2.Z1(0, 0, 0, 0L, 0L, true);
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
