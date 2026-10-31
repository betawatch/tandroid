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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ tc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.a = i10;
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
        se seVar;
        int i10 = this.a;
        int i11 = 1;
        boolean z10 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i10) {
            case 0:
                chatActivityEnterView.p0.callOnClick();
                break;
            case 1:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                if (recordCircle != null) {
                    recordCircle.d();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.d();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                int i12 = ChatActivityEnterView.s5;
                org.telegram.messenger.i0.g3(new tc(chatActivityEnterView, 5));
                break;
            case 5:
                xh.w wVar = chatActivityEnterView.l0;
                if (wVar != null) {
                    wVar.setOpened(false);
                    break;
                }
                break;
            case 6:
                chatActivityEnterView.S1 = null;
                if (org.telegram.messenger.i0.Q1()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).r0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (!chatActivityEnterView.j2 && z10 && (seVar = chatActivityEnterView.E0) != null) {
                    try {
                        seVar.requestFocus();
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            case 7:
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        gfVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 8:
                pe peVar = chatActivityEnterView.L0;
                if (peVar != null) {
                    peVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
                if (unVar2 == null || unVar2.isLastFragment()) {
                    chatActivityEnterView.L();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 10:
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView.R1();
                break;
            case 11:
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 12:
                org.telegram.messenger.i0.E2(chatActivityEnterView.N);
                break;
            case 13:
                chatActivityEnterView.removeView(chatActivityEnterView.L);
                break;
            case 14:
                int i14 = ChatActivityEnterView.s5;
                chatActivityEnterView.J0();
                break;
            case 15:
                cc.a0(chatActivityEnterView.P2).T(org.telegram.messenger.cd.L0(2131752711, null)).j();
                break;
            case 16:
                se seVar2 = chatActivityEnterView.E0;
                if (seVar2 != null) {
                    seVar2.setText("");
                    break;
                }
                break;
            case 17:
                se seVar3 = chatActivityEnterView.E0;
                if (seVar3 != null) {
                    seVar3.setText("");
                }
                chatActivityEnterView.F(true);
                break;
            case 18:
                pe peVar2 = chatActivityEnterView.L0;
                if (peVar2 != null) {
                    peVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                org.telegram.messenger.i0.h3(new ld(chatActivityEnterView, i11), 600L);
                break;
            case 19:
                s4.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new ud(chatActivityEnterView, i11), chatActivityEnterView.W3);
                break;
            case 20:
                int i15 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.R0(true, 2147483646, 0, 0L, true);
                pe peVar3 = chatActivityEnterView2.L0;
                if (peVar3 != null) {
                    peVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && unVar3 != null) {
                    org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
                    boolean z11 = org.telegram.messenger.v2.a;
                    bi.k2 k2Var = new bi.k2(richMessage);
                    k2Var.e = true;
                    k2Var.setResourceProvider(chatActivityEnterView.W3);
                    k2Var.J = unVar3;
                    k2Var.s = unVar3.T;
                    k2Var.w = unVar3.Z;
                    k2Var.L = new tc(chatActivityEnterView, 25);
                    k2Var.K = new tc(chatActivityEnterView, 26);
                    unVar3.presentFragment(k2Var);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.un unVar4 = chatActivityEnterView.P2;
                if (unVar4 != null) {
                    unVar4.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar4, 43, true));
                    break;
                }
                break;
            case 23:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.G0();
                break;
            case 24:
                int i16 = ChatActivityEnterView.s5;
                chatActivityEnterView.v1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 25:
                se seVar4 = chatActivityEnterView.E0;
                if (seVar4 != null) {
                    seVar4.setText("");
                    break;
                }
                break;
            case 26:
                se seVar5 = chatActivityEnterView.E0;
                if (seVar5 != null) {
                    seVar5.setText("");
                }
                chatActivityEnterView.F(true);
                break;
            case 27:
                int i17 = ChatActivityEnterView.s5;
                chatActivityEnterView.U0();
                break;
            case 28:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.G0();
                break;
            default:
                int i18 = ChatActivityEnterView.s5;
                org.telegram.messenger.i0.v1(chatActivityEnterView);
                int i19 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.un unVar5 = chatActivityEnterView.P2;
                xh.s3 b10 = xh.s3.b(i19, j10, j10, str, str2, 2, 0, unVar5 == null ? 0L : unVar5.a9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.I1.O().m(b10) != null) {
                    xh.w wVar2 = chatActivityEnterView.l0;
                    if (wVar2 != null) {
                        wVar2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.ua0.q(chatActivityEnterView.j0)) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).Z1(Long.valueOf(chatActivityEnterView.Q2));
                    String E1 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).E1(Z1 != null ? Z1.restriction_reason : null);
                    if (!TextUtils.isEmpty(E1)) {
                        org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
                        org.telegram.messenger.vp.O4(E1, unVar5);
                        break;
                    } else {
                        xh.m2 m2Var = new xh.m2(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        m2Var.B(false);
                        m2Var.B0 = true;
                        m2Var.l0 = chatActivityEnterView.O2;
                        m2Var.x(unVar5, b10);
                        m2Var.show();
                        xh.w wVar3 = chatActivityEnterView.l0;
                        if (wVar3 != null) {
                            wVar3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    gf.e eVar = new gf.e();
                    eVar.c = new tc(chatActivityEnterView, 4);
                    gf.f.j(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, eVar);
                    break;
                }
                break;
        }
    }
}
