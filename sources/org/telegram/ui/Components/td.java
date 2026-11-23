package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ td(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null) {
                    hfVar.setText("");
                    break;
                }
                break;
            case 1:
                hf hfVar2 = chatActivityEnterView.F0;
                if (hfVar2 != null) {
                    hfVar2.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 2:
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 5), 600L);
                break;
            case 3:
                b5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new le(chatActivityEnterView, 2), chatActivityEnterView.M4);
                break;
            case 4:
                int i10 = ChatActivityEnterView.s7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.x1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.dg0 dg0Var2 = chatActivityEnterView2.M0;
                if (dg0Var2 != null) {
                    dg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                    boolean z10 = org.telegram.messenger.s2.a;
                    oi.b2 b2Var = new oi.b2(richMessage);
                    b2Var.e = true;
                    b2Var.setResourceProvider(chatActivityEnterView.M4);
                    b2Var.K = bnVar;
                    b2Var.s = bnVar.U;
                    b2Var.w = bnVar.a0;
                    b2Var.M = new td(chatActivityEnterView, 11);
                    b2Var.L = new td(chatActivityEnterView, 13);
                    bnVar.presentFragment(b2Var);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                if (bnVar2 != null) {
                    bnVar2.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar2, 43, true));
                    break;
                }
                break;
            case 7:
                int i11 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                break;
            case 8:
                if (!chatActivityEnterView.O2 && !chatActivityEnterView.v3) {
                    chatActivityEnterView.P(true);
                    break;
                }
                break;
            case 9:
                int i12 = ChatActivityEnterView.s7;
                chatActivityEnterView.e2(true, true);
                chatActivityEnterView.W = null;
                break;
            case 10:
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView.G2();
                break;
            case 11:
                hf hfVar3 = chatActivityEnterView.F0;
                if (hfVar3 != null) {
                    hfVar3.setText("");
                    break;
                }
                break;
            case 12:
                org.telegram.ui.dg0 dg0Var3 = chatActivityEnterView.M0;
                if (dg0Var3 != null) {
                    dg0Var3.h(chatActivityEnterView.e6);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 13:
                hf hfVar4 = chatActivityEnterView.F0;
                if (hfVar4 != null) {
                    hfVar4.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 14:
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView.z1();
                break;
            case 15:
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.k1();
                break;
            case 16:
                int i15 = ChatActivityEnterView.s7;
                chatActivityEnterView.H();
                break;
            case 17:
                int i16 = ChatActivityEnterView.s7;
                p0 p0Var = chatActivityEnterView.n6;
                if (p0Var != null && p0Var.d) {
                    p0Var.d = false;
                    p0Var.a.invalidate();
                }
                if (chatActivityEnterView.x6) {
                    chatActivityEnterView.x6 = false;
                    chatActivityEnterView.F1 = false;
                    hf hfVar5 = chatActivityEnterView.F0;
                    if (hfVar5 != null) {
                        hfVar5.invalidate();
                        break;
                    }
                }
                break;
            default:
                chatActivityEnterView.q0();
                break;
        }
    }
}
