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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ yc(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0223, code lost:
    
        if (r4.getVisibility() == 0) goto L125;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ve veVar;
        int i3 = this.a;
        int i10 = 1;
        boolean z10 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i3) {
            case 0:
                chatActivityEnterView.q0.callOnClick();
                break;
            case 1:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.O1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                if (wmVar != null) {
                    wmVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                int i11 = ChatActivityEnterView.t5;
                org.telegram.messenger.g0.h3(new yc(chatActivityEnterView, 5));
                break;
            case 5:
                ii.a0 a0Var = chatActivityEnterView.m0;
                if (a0Var != null) {
                    a0Var.setOpened(false);
                    break;
                }
                break;
            case 6:
                chatActivityEnterView.T1 = null;
                if (org.telegram.messenger.g0.Q1()) {
                    Activity activity = chatActivityEnterView.P2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).s0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (!chatActivityEnterView.k2 && z10 && (veVar = chatActivityEnterView.F0) != null) {
                    try {
                        veVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 7:
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null) {
                    if (chatActivityEnterView.i5 == null) {
                        kfVar.getLayoutParams().height = chatActivityEnterView.E3;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 8:
                se seVar = chatActivityEnterView.M0;
                if (seVar != null) {
                    seVar.g(chatActivityEnterView.F4);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
                if (wmVar2 == null || wmVar2.isLastFragment()) {
                    chatActivityEnterView.L();
                }
                chatActivityEnterView.O4 = null;
                break;
            case 10:
                int i12 = ChatActivityEnterView.t5;
                chatActivityEnterView.T1();
                break;
            case 11:
                uf ufVar = chatActivityEnterView.a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 12:
                org.telegram.messenger.g0.E2(chatActivityEnterView.O);
                break;
            case 13:
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
            case 14:
                int i13 = ChatActivityEnterView.t5;
                chatActivityEnterView.K0();
                break;
            case 15:
                fc.a0(chatActivityEnterView.Q2).T(org.telegram.messenger.bd.M0(2131752711, null)).j();
                break;
            case 16:
                ve veVar2 = chatActivityEnterView.F0;
                if (veVar2 != null) {
                    veVar2.setText("");
                    break;
                }
                break;
            case 17:
                ve veVar3 = chatActivityEnterView.F0;
                if (veVar3 != null) {
                    veVar3.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 18:
                se seVar2 = chatActivityEnterView.M0;
                if (seVar2 != null) {
                    seVar2.g(false);
                    chatActivityEnterView.M0 = null;
                }
                org.telegram.messenger.g0.i3(new pd(chatActivityEnterView, i10), 600L);
                break;
            case 19:
                t4.L(chatActivityEnterView.P2, chatActivityEnterView.Q2.a(), new yd(chatActivityEnterView, i10), chatActivityEnterView.X3);
                break;
            case 20:
                int i14 = ChatActivityEnterView.t5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.S0(true, 2147483646, 0, 0L, true);
                se seVar3 = chatActivityEnterView2.M0;
                if (seVar3 != null) {
                    seVar3.g(false);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.wm wmVar3 = chatActivityEnterView.Q2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.F1;
                if (richMessage != null && chatActivityEnterView.F0 != null && wmVar3 != null) {
                    org.telegram.messenger.hp.s1(chatActivityEnterView.R);
                    boolean z11 = org.telegram.messenger.r2.a;
                    mi.c2 c2Var = new mi.c2(richMessage);
                    c2Var.e = true;
                    c2Var.setResourceProvider(chatActivityEnterView.X3);
                    c2Var.K = wmVar3;
                    c2Var.s = wmVar3.U;
                    c2Var.w = wmVar3.a0;
                    c2Var.M = new yc(chatActivityEnterView, 25);
                    c2Var.L = new yc(chatActivityEnterView, 26);
                    wmVar3.presentFragment(c2Var);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.wm wmVar4 = chatActivityEnterView.Q2;
                if (wmVar4 != null) {
                    wmVar4.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar4, 43, true));
                    break;
                }
                break;
            case 23:
                chatActivityEnterView.m3 = false;
                chatActivityEnterView.H0();
                break;
            case 24:
                int i15 = ChatActivityEnterView.t5;
                chatActivityEnterView.x1(true, true);
                chatActivityEnterView.W = null;
                break;
            case 25:
                ve veVar4 = chatActivityEnterView.F0;
                if (veVar4 != null) {
                    veVar4.setText("");
                    break;
                }
                break;
            case 26:
                ve veVar5 = chatActivityEnterView.F0;
                if (veVar5 != null) {
                    veVar5.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 27:
                int i16 = ChatActivityEnterView.t5;
                chatActivityEnterView.V0();
                break;
            case 28:
                chatActivityEnterView.m3 = false;
                chatActivityEnterView.H0();
                break;
            default:
                int i17 = ChatActivityEnterView.t5;
                org.telegram.messenger.g0.v1(chatActivityEnterView);
                int i18 = chatActivityEnterView.R;
                long j10 = chatActivityEnterView.R2;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                org.telegram.ui.wm wmVar5 = chatActivityEnterView.Q2;
                ii.q4 b10 = ii.q4.b(i18, j10, j10, str, str2, 2, 0, wmVar5 == null ? 0L : wmVar5.h9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.K1.O().k(b10) != null) {
                    ii.a0 a0Var2 = chatActivityEnterView.m0;
                    if (a0Var2 != null) {
                        a0Var2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.m90.q(chatActivityEnterView.k0)) {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(chatActivityEnterView.R).a2(Long.valueOf(chatActivityEnterView.R2));
                    String F1 = org.telegram.messenger.hp.s1(chatActivityEnterView.R).F1(a22 != null ? a22.restriction_reason : null);
                    if (!TextUtils.isEmpty(F1)) {
                        org.telegram.messenger.hp.s1(chatActivityEnterView.R);
                        org.telegram.messenger.hp.R4(F1, wmVar5);
                        break;
                    } else {
                        ii.a3 a3Var = new ii.a3(chatActivityEnterView.getContext(), chatActivityEnterView.X3);
                        a3Var.B(false);
                        a3Var.C0 = true;
                        a3Var.m0 = chatActivityEnterView.P2;
                        a3Var.x(wmVar5, b10);
                        a3Var.show();
                        ii.a0 a0Var3 = chatActivityEnterView.m0;
                        if (a0Var3 != null) {
                            a0Var3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    sf.b bVar = new sf.b();
                    bVar.c = new yc(chatActivityEnterView, 4);
                    sf.c.l(chatActivityEnterView.getContext(), chatActivityEnterView.k0, false, false, bVar);
                    break;
                }
                break;
        }
    }
}
