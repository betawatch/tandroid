package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ue(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        long j10;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.b;
                ue ueVar = chatActivityEnterView.h4;
                if ((chatActivityEnterView.H0() && chatActivityEnterView.A()) || org.telegram.ui.ActionBar.g2.hasSheets(chatActivityEnterView.F3) || chatActivityEnterView.O2 || chatActivityEnterView.F0 == null || !chatActivityEnterView.a4 || chatActivityEnterView.p3 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    return;
                }
                mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    mgVar.o1();
                }
                chatActivityEnterView.F0.requestFocus();
                org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                org.telegram.messenger.g0.r(ueVar);
                org.telegram.messenger.g0.h3(ueVar, 100L);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                ai.j1 j1Var = chatActivityEnterView2.o6;
                if (j1Var == null || !j1Var.d) {
                    j3 = 0;
                } else {
                    long j11 = j1Var.e;
                    if (j11 == 0) {
                        j10 = 0;
                    } else {
                        j10 = j11 + j1Var.a + (j1Var.C ? 180L : 0L);
                    }
                    j3 = j10 - SystemClock.uptimeMillis();
                }
                if (j3 > 0) {
                    org.telegram.messenger.g0.h3(this, j3 + 16);
                    return;
                }
                chatActivityEnterView2.s6 = null;
                chatActivityEnterView2.q6 = false;
                chatActivityEnterView2.r6 = true;
                chatActivityEnterView2.t6 = SystemClock.uptimeMillis();
                ai.j1 j1Var2 = chatActivityEnterView2.o6;
                if (j1Var2 != null) {
                    j1Var2.c();
                }
                try {
                    chatActivityEnterView2.w1();
                    return;
                } finally {
                    chatActivityEnterView2.r6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                mg mgVar2 = this.b.P3;
                if (mgVar2 != null) {
                    mgVar2.o2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                AnimatorSet animatorSet = chatActivityEnterView3.W0;
                if (animatorSet == null || animatorSet.isRunning()) {
                    return;
                }
                chatActivityEnterView3.W0.start();
                return;
        }
    }
}
