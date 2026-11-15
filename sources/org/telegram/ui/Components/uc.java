package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ uc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x015d, code lost:
    
        if (r5.getVisibility() == 0) goto L94;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        xe xeVar;
        int i7 = this.a;
        int i10 = 2;
        boolean z10 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                int i11 = ChatActivityEnterView.N6;
                org.telegram.messenger.g0.v1(chatActivityEnterView);
                int i12 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.y3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                ki.k4 b10 = ki.k4.b(i12, j3, j3, str, str2, 2, 0, anVar == null ? 0L : anVar.j9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.a0 a0Var = chatActivityEnterView.m0;
                    if (a0Var != null) {
                        a0Var.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.q90.q(chatActivityEnterView.k0)) {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(chatActivityEnterView.R).a2(Long.valueOf(chatActivityEnterView.y3));
                    String F1 = org.telegram.messenger.np.s1(chatActivityEnterView.R).F1(a22 != null ? a22.restriction_reason : null);
                    if (!TextUtils.isEmpty(F1)) {
                        org.telegram.messenger.np.s1(chatActivityEnterView.R);
                        org.telegram.messenger.np.S4(F1, anVar);
                        break;
                    } else {
                        ki.x2 x2Var = new ki.x2(chatActivityEnterView.getContext(), chatActivityEnterView.E4);
                        x2Var.B(false);
                        x2Var.C0 = true;
                        x2Var.m0 = chatActivityEnterView.w3;
                        x2Var.x(anVar, b10);
                        x2Var.show();
                        ki.a0 a0Var2 = chatActivityEnterView.m0;
                        if (a0Var2 != null) {
                            a0Var2.setOpened(false);
                            break;
                        }
                    }
                } else {
                    vf.b bVar = new vf.b();
                    bVar.c = new uc(chatActivityEnterView, 5);
                    vf.c.l(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, bVar);
                    break;
                }
                break;
            case 1:
                if (chatActivityEnterView.m0 != null && !org.telegram.messenger.b6.j(chatActivityEnterView.R, chatActivityEnterView.y3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 2:
                xe xeVar2 = chatActivityEnterView.F0;
                if (xeVar2 != null) {
                    xeVar2.setText("");
                    break;
                }
                break;
            case 3:
                xe xeVar3 = chatActivityEnterView.F0;
                if (xeVar3 != null) {
                    xeVar3.setText("");
                }
                chatActivityEnterView.N(true);
                break;
            case 4:
                org.telegram.ui.an anVar2 = chatActivityEnterView.x3;
                if (anVar2 != null) {
                    anVar2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                int i13 = ChatActivityEnterView.N6;
                org.telegram.messenger.g0.h3(new uc(chatActivityEnterView, 8));
                break;
            case 6:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
                if (recordCircle != null) {
                    recordCircle.g();
                    break;
                }
                break;
            case 7:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.v2;
                if (recordCircle2 != null) {
                    recordCircle2.g();
                    break;
                }
                break;
            case 8:
                ki.a0 a0Var3 = chatActivityEnterView.m0;
                if (a0Var3 != null) {
                    a0Var3.setOpened(false);
                    break;
                }
                break;
            case 9:
                chatActivityEnterView.A2 = null;
                if (org.telegram.messenger.g0.Q1()) {
                    Activity activity = chatActivityEnterView.w3;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).q0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (!chatActivityEnterView.R2 && z10 && (xeVar = chatActivityEnterView.F0) != null) {
                    try {
                        xeVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 10:
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    if (chatActivityEnterView.C6 == null) {
                        sfVar.getLayoutParams().height = chatActivityEnterView.l4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.an anVar3 = chatActivityEnterView.x3;
                if (anVar3 == null || anVar3.isLastFragment()) {
                    chatActivityEnterView.S();
                }
                chatActivityEnterView.i6 = null;
                break;
            case 12:
                int i14 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                break;
            case 13:
                chatActivityEnterView.j1();
                break;
            case 14:
                int i15 = ChatActivityEnterView.N6;
                chatActivityEnterView.m2();
                break;
            case 15:
                cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 16:
                org.telegram.messenger.g0.E2(chatActivityEnterView.O);
                break;
            case 17:
                if (!chatActivityEnterView.R2 && !chatActivityEnterView.G2 && chatActivityEnterView.J3 != null) {
                    chatActivityEnterView.p0().s();
                    break;
                }
                break;
            case 18:
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
            case 19:
                int i16 = ChatActivityEnterView.N6;
                chatActivityEnterView.a1();
                break;
            case 20:
                cc.a0(chatActivityEnterView.x3).T(org.telegram.messenger.hd.M0(2131752711, null)).j();
                break;
            case 21:
                xe xeVar4 = chatActivityEnterView.F0;
                if (xeVar4 != null) {
                    xeVar4.setText("");
                    break;
                }
                break;
            case 22:
                xe xeVar5 = chatActivityEnterView.F0;
                if (xeVar5 != null) {
                    xeVar5.setText("");
                }
                chatActivityEnterView.N(true);
                break;
            case 23:
                org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.i3(new nd(chatActivityEnterView, 9), 600L);
                break;
            case 24:
                t4.J(chatActivityEnterView.w3, chatActivityEnterView.x3.a(), new be(chatActivityEnterView, i10), chatActivityEnterView.E4);
                break;
            case 25:
                int i17 = ChatActivityEnterView.N6;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.k1(true, 2147483646, 0, 0L, true);
                org.telegram.ui.bg0 bg0Var2 = chatActivityEnterView2.M0;
                if (bg0Var2 != null) {
                    bg0Var2.h(false);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.an anVar4 = chatActivityEnterView.x3;
                TL_iv.RichMessage richMessage = chatActivityEnterView.m2;
                if (richMessage != null && chatActivityEnterView.F0 != null && anVar4 != null) {
                    org.telegram.messenger.np.s1(chatActivityEnterView.R);
                    boolean z11 = org.telegram.messenger.r2.a;
                    oi.z1 z1Var = new oi.z1(richMessage);
                    z1Var.e = true;
                    z1Var.setResourceProvider(chatActivityEnterView.E4);
                    z1Var.K = anVar4;
                    z1Var.s = anVar4.U;
                    z1Var.w = anVar4.a0;
                    z1Var.M = new nd(chatActivityEnterView, i10);
                    z1Var.L = new nd(chatActivityEnterView, 3);
                    anVar4.presentFragment(z1Var);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.an anVar5 = chatActivityEnterView.x3;
                if (anVar5 != null) {
                    anVar5.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar5, 43, true));
                    break;
                }
                break;
            case 28:
                chatActivityEnterView.T3 = false;
                chatActivityEnterView.X0();
                break;
            default:
                org.telegram.ui.bg0 bg0Var3 = chatActivityEnterView.M0;
                if (bg0Var3 != null) {
                    bg0Var3.h(chatActivityEnterView.W5);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
        }
    }
}
