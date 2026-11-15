package org.telegram.ui.Components;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ke keVar = chatActivityEnterView.Z3;
                if ((!chatActivityEnterView.v0() || !chatActivityEnterView.y()) && !org.telegram.ui.ActionBar.e2.hasSheets(chatActivityEnterView.x3) && !chatActivityEnterView.G2 && chatActivityEnterView.F0 != null && chatActivityEnterView.S3 && !chatActivityEnterView.h3 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    cg cgVar = chatActivityEnterView.H3;
                    if (cgVar != null) {
                        cgVar.o1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.J3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(keVar);
                    org.telegram.messenger.g0.i3(keVar, 100L);
                    break;
                }
                break;
            case 1:
                cg cgVar2 = this.b.H3;
                if (cgVar2 != null) {
                    cgVar2.o2(0, 0, 0, 0L, 0L, true);
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
