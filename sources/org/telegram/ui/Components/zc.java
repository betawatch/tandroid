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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ zc(ChatActivityEnterView chatActivityEnterView, int i7) {
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
        we weVar;
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
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                if (cnVar != null) {
                    cnVar.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                int i11 = ChatActivityEnterView.s5;
                org.telegram.messenger.g0.h3(new zc(chatActivityEnterView, 5));
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
                if (!chatActivityEnterView.j2 && z9 && (weVar = chatActivityEnterView.E0) != null) {
                    try {
                        weVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 7:
                lf lfVar = chatActivityEnterView.U0;
                if (lfVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        lfVar.getLayoutParams().height = chatActivityEnterView.D3;
                    }
                    chatActivityEnterView.U0.setLayerType(0, null);
                    break;
                }
                break;
            case 8:
                te teVar = chatActivityEnterView.L0;
                if (teVar != null) {
                    teVar.g(chatActivityEnterView.E4);
                    chatActivityEnterView.L0 = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
                if (cnVar2 == null || cnVar2.isLastFragment()) {
                    chatActivityEnterView.L();
                }
                chatActivityEnterView.N4 = null;
                break;
            case 10:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.U1();
                break;
            case 11:
                vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.w(0.0f);
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
                gc.a0(chatActivityEnterView.P2).T(org.telegram.messenger.id.M0(2131752711, null)).j();
                break;
            case 16:
                we weVar2 = chatActivityEnterView.E0;
                if (weVar2 != null) {
                    weVar2.setText("");
                    break;
                }
                break;
            case 17:
                we weVar3 = chatActivityEnterView.E0;
                if (weVar3 != null) {
                    weVar3.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 18:
                te teVar2 = chatActivityEnterView.L0;
                if (teVar2 != null) {
                    teVar2.g(false);
                    chatActivityEnterView.L0 = null;
                }
                org.telegram.messenger.g0.i3(new qd(chatActivityEnterView, i10), 600L);
                break;
            case 19:
                u4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new zd(chatActivityEnterView, i10), chatActivityEnterView.W3);
                break;
            case 20:
                int i14 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                chatActivityEnterView2.T0(true, 2147483646, 0, 0L, true);
                te teVar3 = chatActivityEnterView2.L0;
                if (teVar3 != null) {
                    teVar3.g(false);
                    chatActivityEnterView2.L0 = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
                TL_iv.RichMessage richMessage = chatActivityEnterView.E1;
                if (richMessage != null && chatActivityEnterView.E0 != null && cnVar3 != null) {
                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                    boolean z10 = org.telegram.messenger.r2.a;
                    li.b2 b2Var = new li.b2(richMessage);
                    b2Var.e = true;
                    b2Var.setResourceProvider(chatActivityEnterView.W3);
                    b2Var.J = cnVar3;
                    b2Var.s = cnVar3.T;
                    b2Var.w = cnVar3.Z;
                    b2Var.L = new zc(chatActivityEnterView, 25);
                    b2Var.K = new zc(chatActivityEnterView, 26);
                    cnVar3.presentFragment(b2Var);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.cn cnVar4 = chatActivityEnterView.P2;
                if (cnVar4 != null) {
                    cnVar4.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar4, 43, true));
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
                we weVar4 = chatActivityEnterView.E0;
                if (weVar4 != null) {
                    weVar4.setText("");
                    break;
                }
                break;
            case 26:
                we weVar5 = chatActivityEnterView.E0;
                if (weVar5 != null) {
                    weVar5.setText("");
                }
                chatActivityEnterView.E(true);
                break;
            case 27:
                int i16 = ChatActivityEnterView.s5;
                chatActivityEnterView.W0();
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
                org.telegram.ui.cn cnVar5 = chatActivityEnterView.P2;
                hi.q4 b10 = hi.q4.b(i18, j3, j3, str, str2, 2, 0, cnVar5 == null ? 0L : cnVar5.i9(), null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
                    hi.y yVar2 = chatActivityEnterView.l0;
                    if (yVar2 != null) {
                        yVar2.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.s90.q(chatActivityEnterView.j0)) {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).a2(Long.valueOf(chatActivityEnterView.Q2));
                    String F1 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).F1(a22 != null ? a22.restriction_reason : null);
                    if (!TextUtils.isEmpty(F1)) {
                        org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                        org.telegram.messenger.qp.R4(F1, cnVar5);
                        break;
                    } else {
                        hi.a3 a3Var = new hi.a3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                        a3Var.B(false);
                        a3Var.B0 = true;
                        a3Var.l0 = chatActivityEnterView.O2;
                        a3Var.x(cnVar5, b10);
                        a3Var.show();
                        hi.y yVar3 = chatActivityEnterView.l0;
                        if (yVar3 != null) {
                            yVar3.setOpened(false);
                            break;
                        }
                    }
                } else {
                    vf.b bVar = new vf.b();
                    bVar.c = new zc(chatActivityEnterView, 4);
                    vf.c.l(chatActivityEnterView.getContext(), chatActivityEnterView.j0, false, false, bVar);
                    break;
                }
                break;
        }
    }
}
