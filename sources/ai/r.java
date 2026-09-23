package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.zj;
import org.telegram.ui.ix;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class r extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        wk0 wk0Var;
        wk0 wk0Var2;
        wk0 wk0Var3;
        int top;
        wk0 wk0Var4;
        wk0 wk0Var5;
        int top2;
        switch (this.a) {
            case 2:
                ci.e2 e2Var = (ci.e2) this.b;
                if (i10 == 0 && e2Var.n >= 0.0f && !e2Var.b.canScrollVertically(-1)) {
                    e2Var.n = -1.0f;
                    break;
                }
                break;
            case 6:
                fi.h0 h0Var = (fi.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                ((ki.e) this.b).f++;
                break;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.Components.u7 u7Var = j8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(j8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i13 = j8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.f3) j8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) j8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (wk0Var = (wk0) u7Var.K(j8Var.v0 ? 1 : 0)) != null) {
                        View view = wk0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                kj kjVar = (kj) this.b;
                w0 w0Var = kjVar.n;
                wi wiVar = kjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = wiVar.a1;
                    int dp3 = dp2 + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var2 = (wk0) w0Var.K(0)) != null) {
                        View view2 = wk0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                pk pkVar = (pk) this.b;
                ek ekVar = pkVar.r;
                wi wiVar2 = pkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = wiVar2.getBackgroundPaddingTop();
                    if (((wiVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var3 = (wk0) ekVar.K(0)) != null && (top = (wk0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ekVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && pkVar.b0 && ekVar.getAdapter() == pkVar.y) {
                    AndroidUtilities.hideKeyboard(wiVar2.getCurrentFocus());
                }
                pkVar.U = i10 != 0;
                break;
            case 20:
                qk qkVar = (qk) this.b;
                ml0 ml0Var = qkVar.r;
                wi wiVar3 = qkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = wiVar3.a1;
                    int dp6 = dp5 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = wiVar3.getBackgroundPaddingTop();
                    if (((wiVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var4 = (wk0) ml0Var.K(0)) != null) {
                        View view3 = wk0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            ml0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    hl hlVar = (hl) this.b;
                    if (hlVar.l0 && hlVar.m0) {
                        AndroidUtilities.hideKeyboard(hlVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 22:
                vn vnVar = (vn) this.b;
                wb1 wb1Var = vnVar.s;
                wi wiVar4 = vnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = wiVar4.getBackgroundPaddingTop();
                    if (((wiVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var5 = (wk0) wb1Var.K(1)) != null && (top2 = (wk0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wb1Var.v0(0, top2, null);
                    }
                    int i15 = vnVar.W0;
                    if (i15 >= 0) {
                        vn.K(vnVar, i15);
                        vnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 28:
                na0 na0Var = (na0) this.b;
                na0Var.X2 = i10 != 0;
                na0Var.Y2 = i10 == 1;
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        ci.l2 l2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        ci.l2 l2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        gg.q0 q0Var;
        j40 j40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                ix ixVar = (ix) this.b;
                ixVar.invalidate();
                ixVar.c();
                ci.e4 e4Var = ixVar.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    break;
                }
                break;
            case 1:
                ci.z1 z1Var = (ci.z1) this.b;
                ci.w1 w1Var = z1Var.c;
                ci.s2 s2Var = z1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) s2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.f3) s2Var).keyboardVisible;
                if (z10 && z1Var.b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    s2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    break;
                }
                break;
            case 2:
                ci.e2 e2Var = (ci.e2) this.b;
                ci.d2 d2Var = e2Var.c;
                ci.p1 p1Var = e2Var.b;
                ci.s2 s2Var2 = e2Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) s2Var2).containerView;
                viewGroup2.invalidate();
                int i15 = -1;
                if (e2Var.n < 0.0f) {
                    i12 = e2Var.d.I0();
                } else {
                    int i16 = 0;
                    while (true) {
                        if (i16 < p1Var.getChildCount()) {
                            View childAt = p1Var.getChildAt(i16);
                            if (childAt.getY() + childAt.getHeight() > e2Var.n + p1Var.getPaddingTop()) {
                                p1Var.getClass();
                                i12 = RecyclerView.R(childAt);
                            } else {
                                i16++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = d2Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = d2Var.y.keyAt(size);
                        int valueAt = d2Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    e2Var.e.j(i15, true);
                }
                z11 = ((org.telegram.ui.ActionBar.f3) s2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f) != null && l2Var2.d != null) {
                    s2Var2.o0();
                    break;
                }
                break;
            case 3:
                nf nfVar = (nf) this.b;
                View m10 = nfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                nfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                nfVar.b();
                break;
            case 4:
                ei.e4 e4Var2 = (ei.e4) this.b;
                long j3 = e4Var2.P;
                int i17 = 0;
                while (true) {
                    if (i17 < e4Var2.c.getChildCount()) {
                        if (!(e4Var2.c.getChildAt(i17) instanceof u00)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.n2) e4Var2).currentAccount;
                yh.o.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.n2) e4Var2).currentAccount;
                yh.o.g(i14).e(j3).a();
                break;
            case 5:
                fi.s sVar = (fi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 7:
                fi.j0 j0Var = (fi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 8:
                hg.n.b0((hg.n) this.b);
                break;
            case 9:
                hg.k0 k0Var = (hg.k0) this.b;
                k0Var.b.X1(k0Var, i11);
                k0Var.M();
                break;
            case 11:
                ((ki.e) this.b).f++;
                break;
            case 12:
                ((m4.g0) this.b).run();
                break;
            case 13:
                ((org.telegram.ui.Components.e0) this.b).r0();
                break;
            case 14:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                s4.c0 c0Var = j8Var.r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f) {
                    int L0 = c0Var.L0();
                    if (j8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(c0Var.N0() - L0) + 1 : 0;
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (SharedConfig.playOrderReversed) {
                        if (L0 < 10) {
                            MediaController.getInstance().loadMoreMusic();
                            break;
                        }
                    } else if (L0 + abs > h - 10) {
                        MediaController.getInstance().loadMoreMusic();
                        break;
                    }
                }
                break;
            case 15:
                ((pv0) this.b).invalidate();
                break;
            case 16:
                hj hjVar = (hj) this.b;
                hjVar.b.X1(hjVar, i11);
                break;
            case 17:
                kj kjVar = (kj) this.b;
                if (kjVar.n.getChildCount() > 0) {
                    kjVar.b.X1(kjVar, i11);
                    break;
                }
                break;
            case 18:
                zj zjVar = (zj) this.b;
                zjVar.b.X1(zjVar, i11);
                zjVar.O();
                break;
            case 19:
                pk pkVar = (pk) this.b;
                hg.g0 g0Var = pkVar.E;
                pkVar.b.X1(pkVar, i11);
                pkVar.U();
                s4.h0 adapter = pkVar.r.getAdapter();
                ok okVar = pkVar.y;
                if (adapter == okVar) {
                    int L02 = g0Var.L0();
                    int N0 = g0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        ok okVar2 = okVar.X.y;
                        if (!okVar2.S && !okVar2.V && (q0Var = okVar.y) != null) {
                            okVar.Z(okVar.x, okVar.E, okVar.F, q0Var, okVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 20:
                qk qkVar = (qk) this.b;
                qkVar.b.X1(qkVar, i11);
                qkVar.v.setTranslationY(Math.max(0, qkVar.getCurrentItemTop()));
                break;
            case 22:
                vn vnVar = (vn) this.b;
                hg.g0 g0Var2 = vnVar.w;
                vnVar.b.X1(vnVar, i11);
                kn knVar = vnVar.x;
                if (knVar != null && knVar.s) {
                    ky0 delegate = knVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = vnVar.s;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : wb1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (knVar.getDirection() == 0) {
                                knVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                knVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                knVar.f();
                            }
                        } else {
                            knVar.f();
                        }
                    } else {
                        knVar.f();
                    }
                }
                if (i11 != 0 && (j40Var = vnVar.y) != null) {
                    j40Var.b(true);
                    break;
                }
                break;
            case 23:
                wn wnVar = (wn) this.b;
                wnVar.b.X1(wnVar, i11);
                break;
            case 24:
                np npVar = (np) this.b;
                if (npVar.x.M0() + 10 >= npVar.h.h()) {
                    npVar.w();
                    break;
                }
                break;
            case 25:
                tv tvVar = (tv) this.b;
                jv jvVar = tvVar.f;
                if (jvVar != null && tvVar.h.K1 && jvVar.w) {
                    jvVar.w = false;
                    jvVar.invalidate();
                    break;
                }
                break;
            case 26:
                l00 l00Var = (l00) this.b;
                l00Var.F.invalidate();
                l00Var.invalidate();
                break;
            case 27:
                o00.G((o00) this.b);
                break;
            case 28:
                na0 na0Var = (na0) this.b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                oa0 oa0Var = na0Var.b3;
                ha0 ha0Var = oa0Var.d;
                int N02 = layoutManager == ha0Var ? ha0Var.N0() : oa0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    gg.k1 k1Var = oa0Var.f;
                    if (N02 > k1Var.M0 - 5 && k1Var.u0 == 0 && (str = k1Var.s0) != null && str.length() != 0 && (user = k1Var.w0) != null && (str2 = k1Var.r0) != null) {
                        k1Var.T(true, user, str2, k1Var.s0);
                    }
                }
                boolean z12 = !na0Var.canScrollVertically(-1);
                na0Var.canScrollVertically(1);
                oa0Var.n(z12);
                oa0Var.b();
                break;
            case 29:
                ob0 ob0Var = (ob0) this.b;
                org.telegram.ui.w8 w8Var = ob0Var.b;
                hb0 hb0Var = ob0Var.f;
                for (int i18 = 0; i18 < hb0Var.getChildCount(); i18++) {
                    View childAt2 = hb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                gb0 gb0Var = ob0Var.e;
                if (gb0Var != null) {
                    gb0Var.x();
                    break;
                }
                break;
        }
    }
}
