package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ dd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
    
        if (r6.getVisibility() == 0) goto L64;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        p0 p0Var;
        hf hfVar;
        int i7 = this.a;
        boolean z10 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                if (!chatActivityEnterView.O2) {
                    chatActivityEnterView.P(true);
                    break;
                }
                break;
            case 1:
                int i10 = ChatActivityEnterView.s7;
                org.telegram.messenger.g0.v1(chatActivityEnterView);
                int i11 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.G3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                ki.f4 b10 = ki.f4.b(i11, j3, j3, str, str2, 2, 0, bnVar != null ? bnVar.j9() : 0L, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.y yVar = chatActivityEnterView.m0;
                    if (yVar != null) {
                        yVar.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.r90.q(chatActivityEnterView.k0)) {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).c2(Long.valueOf(chatActivityEnterView.G3));
                    String H1 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).H1(c22 != null ? c22.restriction_reason : null);
                    if (!TextUtils.isEmpty(H1)) {
                        org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                        org.telegram.messenger.mp.d5(H1, bnVar);
                        break;
                    } else {
                        ki.t2 t2Var = new ki.t2(chatActivityEnterView.getContext(), chatActivityEnterView.M4);
                        t2Var.B(false);
                        t2Var.C0 = true;
                        t2Var.m0 = chatActivityEnterView.E3;
                        t2Var.x(bnVar, b10);
                        t2Var.show();
                        ki.y yVar2 = chatActivityEnterView.m0;
                        if (yVar2 != null) {
                            yVar2.setOpened(false);
                            break;
                        }
                    }
                } else {
                    vf.b bVar = new vf.b();
                    bVar.c = new dd(chatActivityEnterView, 9);
                    vf.c.l(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, bVar);
                    break;
                }
                break;
            case 2:
                if (chatActivityEnterView.m0 != null && !org.telegram.messenger.c6.j(chatActivityEnterView.R, chatActivityEnterView.G3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 3:
                hf hfVar2 = chatActivityEnterView.F0;
                if (hfVar2 != null) {
                    hfVar2.setText("");
                    break;
                }
                break;
            case 4:
                hf hfVar3 = chatActivityEnterView.F0;
                if (hfVar3 != null) {
                    hfVar3.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 5:
                mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    mgVar.n1();
                    break;
                }
                break;
            case 6:
                chatActivityEnterView.q0.callOnClick();
                break;
            case 7:
                chatActivityEnterView.q0.callOnClick();
                break;
            case 8:
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
                if (bnVar2 != null) {
                    bnVar2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 9:
                int i12 = ChatActivityEnterView.s7;
                org.telegram.messenger.g0.g3(new dd(chatActivityEnterView, 13));
                break;
            case 10:
                if (chatActivityEnterView.q6 && (p0Var = chatActivityEnterView.n6) != null) {
                    p0Var.c(false);
                    break;
                }
                break;
            case 11:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                    break;
                }
                break;
            case 12:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.g();
                    break;
                }
                break;
            case 13:
                ki.y yVar3 = chatActivityEnterView.m0;
                if (yVar3 != null) {
                    yVar3.setOpened(false);
                    break;
                }
                break;
            case 14:
                if (chatActivityEnterView.H1 == ai.j1.J) {
                    ai.j1 j1Var = chatActivityEnterView.o6;
                    long j10 = j1Var.e;
                    chatActivityEnterView.G1 = j10 != 0 ? j1Var.a + j10 : 0L;
                    break;
                }
                break;
            case 15:
                chatActivityEnterView.G1 = 0L;
                chatActivityEnterView.H1 = null;
                break;
            case 16:
                chatActivityEnterView.I2 = null;
                if (org.telegram.messenger.g0.Q1()) {
                    Activity activity = chatActivityEnterView.E3;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).q0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (!chatActivityEnterView.Z2 && z10 && (hfVar = chatActivityEnterView.F0) != null) {
                    try {
                        hfVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 17:
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.e7 == null) {
                        egVar.getLayoutParams().height = chatActivityEnterView.t4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
                if (bnVar3 != null && !chatActivityEnterView.O2) {
                    chatActivityEnterView.t2(bnVar3.e, bnVar3.s8);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.bn bnVar4 = chatActivityEnterView.F3;
                if (bnVar4 == null || bnVar4.isLastFragment()) {
                    chatActivityEnterView.U();
                }
                chatActivityEnterView.K6 = null;
                break;
            case 20:
                chatActivityEnterView.w1();
                break;
            case 21:
                int i13 = ChatActivityEnterView.s7;
                chatActivityEnterView.C2();
                break;
            case 22:
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    mgVar2.u(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 23:
                chatActivityEnterView.h2();
                break;
            case 24:
                org.telegram.messenger.g0.E2(chatActivityEnterView.O);
                break;
            case 25:
                if (!chatActivityEnterView.Z2 && !chatActivityEnterView.O2 && chatActivityEnterView.R3 != null) {
                    chatActivityEnterView.B0().q();
                    break;
                }
                break;
            case 26:
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
            case 27:
                int i14 = ChatActivityEnterView.s7;
                chatActivityEnterView.n1();
                break;
            case 28:
                chatActivityEnterView.b4 = false;
                chatActivityEnterView.k1();
                break;
            default:
                kc.b0(chatActivityEnterView.F3).T(org.telegram.messenger.gd.N0(2131752699, null)).j();
                break;
        }
    }
}
