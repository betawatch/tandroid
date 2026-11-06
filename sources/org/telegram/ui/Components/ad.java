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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ad(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
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
        xe xeVar;
        int i7 = this.a;
        int i10 = 1;
        boolean z9 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
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
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                int i11 = ChatActivityEnterView.s5;
                org.telegram.messenger.g0.h3(new ad(chatActivityEnterView, 5));
                break;
            case 5:
                hi.y yVar = chatActivityEnterView.l0;
                if (yVar != null) {
                    yVar.setOpened(false);
                    break;
                }
                break;
            case 6:
                chatActivityEnterView.S1 = null;
                if (org.telegram.messenger.g0.Q1()) {
                    Activity activity = chatActivityEnterView.O2;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).p0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z9 = true;
                if (!chatActivityEnterView.j2 && z9 && (xeVar = chatActivityEnterView.E0) != null) {
                    try {
                        xeVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 7:
                mf mfVar = chatActivityEnterView.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        mfVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 8:
                ue ueVar = chatActivityEnterView.L0;
                if (ueVar != null) {
                    ueVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.an anVar2 = chatActivityEnterView.P2;
                if (anVar2 == null || anVar2.isLastFragment()) {
                    chatActivityEnterView.L();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 10:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.U1();
                break;
            case 11:
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 12:
                org.telegram.messenger.g0.E2(chatActivityEnterView.N);
                break;
            case 13:
                chatActivityEnterView.removeView(chatActivityEnterView.L);
                break;
            case 14:
                int i13 = ChatActivityEnterView.s5;
                chatActivityEnterView.L0();
                break;
            case 15:
                hc.a0(chatActivityEnterView.P2).T(org.telegram.messenger.hd.M0(2131752711, null)).j();
                break;
            case 16:
                xe xeVar2 = chatActivityEnterView.E0;
                if (xeVar2 != null) {
                    xeVar2.setText("");
                    break;
                }
                break;
            case 17:
                xe xeVar3 = chatActivityEnterView.E0;
                if (xeVar3 != null) {
                    xeVar3.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 18:
                ue ueVar2 = chatActivityEnterView.L0;
                if (ueVar2 != null) {
                    ueVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                org.telegram.messenger.g0.i3(new rd(chatActivityEnterView, i10), 600L);
                break;
            case 19:
                v4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new ae(chatActivityEnterView, i10), chatActivityEnterView.W3);
                break;
            case 20:
                int i14 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(true, 2147483646, 0, 0L, true);
                ue ueVar3 = chatActivityEnterView2.L0;
                if (ueVar3 != null) {
                    ueVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.an anVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && anVar3 != null) {
                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                    boolean z10 = org.telegram.messenger.r2.a;
                    li.b2 b2Var = new li.b2(richMessage);
                    b2Var.e = true;
                    b2Var.setResourceProvider(chatActivityEnterView.W3);
                    b2Var.J = anVar3;
                    b2Var.s = anVar3.T;
                    b2Var.w = anVar3.Z;
                    b2Var.L = new ad(chatActivityEnterView, 25);
                    b2Var.K = new ad(chatActivityEnterView, 26);
                    anVar3.presentFragment(b2Var);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.an anVar4 = chatActivityEnterView.P2;
                if (anVar4 != null) {
                    anVar4.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar4, 43, true));
                    break;
                }
                break;
            case 23:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.I0();
                break;
            case 24:
                int i15 = ChatActivityEnterView.s5;
                chatActivityEnterView.y1(true, true);
                chatActivityEnterView.V = null;
                break;
            case 25:
                xe xeVar4 = chatActivityEnterView.E0;
                if (xeVar4 != null) {
                    xeVar4.setText("");
                    break;
                }
                break;
            case 26:
                xe xeVar5 = chatActivityEnterView.E0;
                if (xeVar5 != null) {
                    xeVar5.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 27:
                int i16 = ChatActivityEnterView.s5;
                chatActivityEnterView.V0();
                break;
            case 28:
                chatActivityEnterView.l3 = false;
                chatActivityEnterView.I0();
                break;
            default:
                int i17 = ChatActivityEnterView.s5;
                org.telegram.messenger.g0.v1(chatActivityEnterView);
                int i18 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.i0;
                String str2 = chatActivityEnterView.j0;
                org.telegram.ui.an anVar5 = chatActivityEnterView.P2;
                hi.q4 b10 = hi.q4.b(i18, j3, j3, str, str2, 2, 0, anVar5 == null ? 0L : anVar5.h9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
                    hi.y yVar2 = chatActivityEnterView.l0;
                    if (yVar2 != null) {
                        yVar2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.p90.q(chatActivityEnterView.j0)) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).a2(Long.valueOf(chatActivityEnterView.Q2));
                    String F1 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).F1(a22 != null ? a22.restriction_reason : null);
                    if (!TextUtils.isEmpty(F1)) {
                        org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                        org.telegram.messenger.qp.R4(F1, anVar5);
                        break;
                    } else {
                        hi.a3 a3Var = new hi.a3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        a3Var.B(false);
                        a3Var.B0 = true;
                        a3Var.l0 = chatActivityEnterView.O2;
                        a3Var.x(anVar5, b10);
                        a3Var.show();
                        hi.y yVar3 = chatActivityEnterView.l0;
                        if (yVar3 != null) {
                            yVar3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    vf.b bVar = new vf.b();
                    bVar.c = new ad(chatActivityEnterView, 4);
                    vf.c.l(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, bVar);
                    break;
                }
                break;
        }
    }
}
