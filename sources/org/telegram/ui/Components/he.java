package org.telegram.ui.Components;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ he(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                he heVar = chatActivityEnterView.s3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.d2.hasSheets(chatActivityEnterView.Q2) && !chatActivityEnterView.Z1 && chatActivityEnterView.F0 != null && chatActivityEnterView.l3 && !chatActivityEnterView.A2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    uf ufVar = chatActivityEnterView.a3;
                    if (ufVar != null) {
                        ufVar.e1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.K3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(heVar);
                    org.telegram.messenger.g0.i3(heVar, 100L);
                    break;
                }
                break;
            case 1:
                uf ufVar2 = this.b.a3;
                if (ufVar2 != null) {
                    ufVar2.d2(0, 0, 0, 0L, 0L, true);
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView2.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.W0.start();
                    break;
                }
                break;
        }
    }
}
