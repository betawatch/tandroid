package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new ke(chatActivityEnterView, 2), chatActivityEnterView.K4);
                break;
            case 4:
                int i10 = ChatActivityEnterView.n7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.s1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.eg0 eg0Var2 = chatActivityEnterView2.M0;
                if (eg0Var2 != null) {
                    eg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.s2;
                if (richMessage != null && chatActivityEnterView.F0 != null && bnVar != null) {
                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                    boolean z10 = org.telegram.messenger.s2.a;
                    oi.z1 z1Var = new oi.z1(richMessage);
                    z1Var.e = true;
                    z1Var.setResourceProvider(chatActivityEnterView.K4);
                    z1Var.K = bnVar;
                    z1Var.s = bnVar.U;
                    z1Var.w = bnVar.a0;
                    z1Var.M = new td(chatActivityEnterView, 11);
                    z1Var.L = new td(chatActivityEnterView, 13);
                    bnVar.presentFragment(z1Var);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
                if (bnVar2 != null) {
                    bnVar2.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) bnVar2, 43, true));
                    break;
                }
                break;
            case 7:
                int i11 = ChatActivityEnterView.n7;
                chatActivityEnterView.getClass();
                break;
            case 8:
                if (!chatActivityEnterView.M2 && !chatActivityEnterView.t3) {
                    chatActivityEnterView.P(true);
                    break;
                }
                break;
            case 9:
                int i12 = ChatActivityEnterView.n7;
                chatActivityEnterView.Y1(true, true);
                chatActivityEnterView.W = null;
                break;
            case 10:
                int i13 = ChatActivityEnterView.n7;
                chatActivityEnterView.A2();
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
                    eg0Var3.h(chatActivityEnterView.c6);
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
                int i14 = ChatActivityEnterView.n7;
                chatActivityEnterView.u1();
                break;
            case 15:
                chatActivityEnterView.Z3 = false;
                chatActivityEnterView.f1();
                break;
            case 16:
                int i15 = ChatActivityEnterView.n7;
                chatActivityEnterView.I();
                break;
            default:
                int i16 = ChatActivityEnterView.n7;
                p0 p0Var = chatActivityEnterView.l6;
                if (p0Var != null && p0Var.d) {
                    p0Var.d = false;
                    p0Var.a.invalidate();
                }
                if (chatActivityEnterView.v6) {
                    chatActivityEnterView.v6 = false;
                    chatActivityEnterView.D1 = false;
                    gf gfVar5 = chatActivityEnterView.F0;
                    if (gfVar5 != null) {
                        gfVar5.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
