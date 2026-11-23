package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setText("");
                    break;
                }
                break;
            case 1:
                gf gfVar2 = chatActivityEnterView.F0;
                if (gfVar2 != null) {
                    gfVar2.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 2:
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 5), 600L);
                break;
            case 3:
                c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new ke(chatActivityEnterView, 2), chatActivityEnterView.M4);
                break;
            case 4:
                int i10 = ChatActivityEnterView.s7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.w1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.u2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
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
                chatActivityEnterView.c2(true, true);
                chatActivityEnterView.W = null;
                break;
            case 10:
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView.D2();
                break;
            case 11:
                gf gfVar3 = chatActivityEnterView.F0;
                if (gfVar3 != null) {
                    gfVar3.setText("");
                    break;
                }
                break;
            case 12:
                org.telegram.ui.eg0 eg0Var3 = chatActivityEnterView.M0;
                if (eg0Var3 != null) {
                    eg0Var3.h(chatActivityEnterView.e6);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 13:
                gf gfVar4 = chatActivityEnterView.F0;
                if (gfVar4 != null) {
                    gfVar4.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 14:
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView.y1();
                break;
            case 15:
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.j1();
                break;
            case 16:
                int i15 = ChatActivityEnterView.s7;
                chatActivityEnterView.I();
                break;
            case 17:
                int i16 = ChatActivityEnterView.s7;
                q0 q0Var = chatActivityEnterView.n6;
                if (q0Var != null && q0Var.d) {
                    q0Var.d = false;
                    q0Var.a.invalidate();
                }
                if (chatActivityEnterView.x6) {
                    chatActivityEnterView.x6 = false;
                    chatActivityEnterView.F1 = false;
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.invalidate();
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
