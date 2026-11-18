package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        gf gfVar;
        int i7 = this.a;
        boolean z10 = false;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i7) {
            case 0:
                if (!chatActivityEnterView.M2) {
                    chatActivityEnterView.P(true);
                    break;
                }
                break;
            case 1:
                int i10 = ChatActivityEnterView.n7;
                org.telegram.messenger.g0.v1(chatActivityEnterView);
                int i11 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.E3;
                String str = chatActivityEnterView.j0;
                String str2 = chatActivityEnterView.k0;
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                ki.f4 b10 = ki.f4.b(i11, j3, j3, str, str2, 2, 0, bnVar != null ? bnVar.j9() : 0L, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.z zVar = chatActivityEnterView.m0;
                    if (zVar != null) {
                        zVar.setOpened(false);
                        break;
                    }
                } else if (!org.telegram.ui.s90.q(chatActivityEnterView.k0)) {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).c2(Long.valueOf(chatActivityEnterView.E3));
                    String H1 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).H1(c22 != null ? c22.restriction_reason : null);
                    if (!TextUtils.isEmpty(H1)) {
                        org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                        org.telegram.messenger.mp.d5(H1, bnVar);
                        break;
                    } else {
                        ki.t2 t2Var = new ki.t2(chatActivityEnterView.getContext(), chatActivityEnterView.K4);
                        t2Var.B(false);
                        t2Var.C0 = true;
                        t2Var.m0 = chatActivityEnterView.C3;
                        t2Var.x(bnVar, b10);
                        t2Var.show();
                        ki.z zVar2 = chatActivityEnterView.m0;
                        if (zVar2 != null) {
                            zVar2.setOpened(false);
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
                if (chatActivityEnterView.m0 != null && !org.telegram.messenger.c6.j(chatActivityEnterView.R, chatActivityEnterView.E3)) {
                    chatActivityEnterView.m0.setOpened(false);
                    break;
                }
                break;
            case 3:
                gf gfVar2 = chatActivityEnterView.F0;
                if (gfVar2 != null) {
                    gfVar2.setText("");
                    break;
                }
                break;
            case 4:
                gf gfVar3 = chatActivityEnterView.F0;
                if (gfVar3 != null) {
                    gfVar3.setText("");
                }
                chatActivityEnterView.P(true);
                break;
            case 5:
                kg kgVar = chatActivityEnterView.N3;
                if (kgVar != null) {
                    kgVar.n1();
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
                org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
                if (bnVar2 != null) {
                    bnVar2.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 9:
                int i12 = ChatActivityEnterView.n7;
                org.telegram.messenger.g0.g3(new dd(chatActivityEnterView, 13));
                break;
            case 10:
                if (chatActivityEnterView.o6 && (p0Var = chatActivityEnterView.l6) != null) {
                    p0Var.c(false);
                    break;
                }
                break;
            case 11:
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.g();
                    break;
                }
                break;
            case 12:
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.B2;
                if (recordCircle2 != null) {
                    recordCircle2.g();
                    break;
                }
                break;
            case 13:
                ki.z zVar3 = chatActivityEnterView.m0;
                if (zVar3 != null) {
                    zVar3.setOpened(false);
                    break;
                }
                break;
            case 14:
                if (chatActivityEnterView.F1 == ai.l1.J) {
                    ai.l1 l1Var = chatActivityEnterView.m6;
                    long j10 = l1Var.e;
                    chatActivityEnterView.E1 = j10 != 0 ? l1Var.a + j10 : 0L;
                    break;
                }
                break;
            case 15:
                chatActivityEnterView.E1 = 0L;
                chatActivityEnterView.F1 = null;
                break;
            case 16:
                chatActivityEnterView.G2 = null;
                if (org.telegram.messenger.g0.Q1()) {
                    Activity activity = chatActivityEnterView.C3;
                    if (activity instanceof LaunchActivity) {
                        ActionBarLayout actionBarLayout = ((LaunchActivity) activity).q0;
                        ViewGroup view = actionBarLayout != null ? actionBarLayout.getView() : null;
                        if (view != null) {
                            break;
                        }
                    }
                }
                z10 = true;
                if (!chatActivityEnterView.X2 && z10 && (gfVar = chatActivityEnterView.F0) != null) {
                    try {
                        gfVar.requestFocus();
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 17:
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    if (chatActivityEnterView.c7 == null) {
                        cgVar.getLayoutParams().height = chatActivityEnterView.r4;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.bn bnVar3 = chatActivityEnterView.D3;
                if (bnVar3 != null && !chatActivityEnterView.M2) {
                    chatActivityEnterView.n2(bnVar3.e, bnVar3.s8);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.bn bnVar4 = chatActivityEnterView.D3;
                if (bnVar4 == null || bnVar4.isLastFragment()) {
                    chatActivityEnterView.U();
                }
                chatActivityEnterView.I6 = null;
                break;
            case 20:
                chatActivityEnterView.r1();
                break;
            case 21:
                int i13 = ChatActivityEnterView.n7;
                chatActivityEnterView.w2();
                break;
            case 22:
                kg kgVar2 = chatActivityEnterView.N3;
                if (kgVar2 != null) {
                    kgVar2.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 23:
                chatActivityEnterView.b2();
                break;
            case 24:
                org.telegram.messenger.g0.E2(chatActivityEnterView.O);
                break;
            case 25:
                if (!chatActivityEnterView.X2 && !chatActivityEnterView.M2 && chatActivityEnterView.P3 != null) {
                    chatActivityEnterView.x0().t();
                    break;
                }
                break;
            case 26:
                chatActivityEnterView.removeView(chatActivityEnterView.M);
                break;
            case 27:
                int i14 = ChatActivityEnterView.n7;
                chatActivityEnterView.i1();
                break;
            case 28:
                chatActivityEnterView.Z3 = false;
                chatActivityEnterView.f1();
                break;
            default:
                lc.b0(chatActivityEnterView.D3).T(org.telegram.messenger.gd.M0(2131752700, null)).j();
                break;
        }
    }
}
