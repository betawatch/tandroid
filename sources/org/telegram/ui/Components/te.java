package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ te(ChatActivityEnterView chatActivityEnterView, int i7) {
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
                te teVar = chatActivityEnterView.h4;
                if ((chatActivityEnterView.H0() && chatActivityEnterView.A()) || org.telegram.ui.ActionBar.g2.hasSheets(chatActivityEnterView.F3) || chatActivityEnterView.O2 || chatActivityEnterView.F0 == null || !chatActivityEnterView.a4 || chatActivityEnterView.p3 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    return;
                }
                ng ngVar = chatActivityEnterView.P3;
                if (ngVar != null) {
                    ngVar.o1();
                }
                chatActivityEnterView.F0.requestFocus();
                org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                org.telegram.messenger.g0.r(teVar);
                org.telegram.messenger.g0.h3(teVar, 100L);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                ai.o1 o1Var = chatActivityEnterView2.o6;
                if (o1Var == null || !o1Var.d) {
                    j3 = 0;
                } else {
                    long j11 = o1Var.e;
                    if (j11 == 0) {
                        j10 = 0;
                    } else {
                        j10 = j11 + o1Var.a + (o1Var.C ? 180L : 0L);
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
                ai.o1 o1Var2 = chatActivityEnterView2.o6;
                if (o1Var2 != null) {
                    o1Var2.c();
                }
                try {
                    chatActivityEnterView2.v1();
                    return;
                } finally {
                    chatActivityEnterView2.r6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                ng ngVar2 = this.b.P3;
                if (ngVar2 != null) {
                    ngVar2.o2(0, 0, 0, 0L, 0L, true);
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
