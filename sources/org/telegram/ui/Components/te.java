package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                te teVar = chatActivityEnterView.f4;
                if ((chatActivityEnterView.D0() && chatActivityEnterView.A()) || org.telegram.ui.ActionBar.h2.hasSheets(chatActivityEnterView.D3) || chatActivityEnterView.M2 || chatActivityEnterView.F0 == null || !chatActivityEnterView.Y3 || chatActivityEnterView.n3 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    return;
                }
                kg kgVar = chatActivityEnterView.N3;
                if (kgVar != null) {
                    kgVar.o1();
                }
                chatActivityEnterView.F0.requestFocus();
                org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                org.telegram.messenger.g0.r(teVar);
                org.telegram.messenger.g0.h3(teVar, 100L);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                ai.l1 l1Var = chatActivityEnterView2.m6;
                if (l1Var == null || !l1Var.d) {
                    j3 = 0;
                } else {
                    long j11 = l1Var.e;
                    if (j11 == 0) {
                        j10 = 0;
                    } else {
                        j10 = j11 + l1Var.a + (l1Var.C ? 180L : 0L);
                    }
                    j3 = j10 - SystemClock.uptimeMillis();
                }
                if (j3 > 0) {
                    org.telegram.messenger.g0.h3(this, j3 + 16);
                    return;
                }
                chatActivityEnterView2.q6 = null;
                chatActivityEnterView2.o6 = false;
                chatActivityEnterView2.p6 = true;
                chatActivityEnterView2.r6 = SystemClock.uptimeMillis();
                ai.l1 l1Var2 = chatActivityEnterView2.m6;
                if (l1Var2 != null) {
                    l1Var2.c();
                }
                try {
                    chatActivityEnterView2.r1();
                    return;
                } finally {
                    chatActivityEnterView2.p6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                kg kgVar2 = this.b.N3;
                if (kgVar2 != null) {
                    kgVar2.o2(0, 0, 0, 0L, 0L, true);
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
