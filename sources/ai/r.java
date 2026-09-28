package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.hx;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        il0 il0Var;
        il0 il0Var2;
        il0 il0Var3;
        int top;
        il0 il0Var4;
        il0 il0Var5;
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
                ((li.e) this.b).f++;
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
                    i11 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) j8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (il0Var = (il0) u7Var.K(j8Var.v0 ? 1 : 0)) != null) {
                        View view = il0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                lj ljVar = (lj) this.b;
                w0 w0Var = ljVar.n;
                wi wiVar = ljVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.a1;
                    int dp3 = dp2 + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = wiVar.getBackgroundPaddingTop();
                    if (((wiVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var2 = (il0) w0Var.K(0)) != null) {
                        View view2 = il0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                qk qkVar = (qk) this.b;
                fk fkVar = qkVar.r;
                wi wiVar2 = qkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = wiVar2.getBackgroundPaddingTop();
                    if (((wiVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var3 = (il0) fkVar.K(0)) != null && (top = (il0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        fkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && qkVar.b0 && fkVar.getAdapter() == qkVar.y) {
                    AndroidUtilities.hideKeyboard(wiVar2.getCurrentFocus());
                }
                qkVar.U = i10 != 0;
                break;
            case 20:
                rk rkVar = (rk) this.b;
                yl0 yl0Var = rkVar.r;
                wi wiVar3 = rkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = wiVar3.a1;
                    int dp6 = dp5 + (u0Var2 != null ? AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = wiVar3.getBackgroundPaddingTop();
                    if (((wiVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var4 = (il0) yl0Var.K(0)) != null) {
                        View view3 = il0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            yl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    il ilVar = (il) this.b;
                    if (ilVar.l0 && ilVar.m0) {
                        AndroidUtilities.hideKeyboard(ilVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 22:
                wn wnVar = (wn) this.b;
                wb1 wb1Var = wnVar.s;
                wi wiVar4 = wnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = wiVar4.getBackgroundPaddingTop();
                    if (((wiVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var5 = (il0) wb1Var.K(1)) != null && (top2 = (il0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wb1Var.v0(0, top2, null);
                    }
                    int i15 = wnVar.W0;
                    if (i15 >= 0) {
                        wn.K(wnVar, i15);
                        wnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 28:
                ab0 ab0Var = (ab0) this.b;
                ab0Var.X2 = i10 != 0;
                ab0Var.Y2 = i10 == 1;
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
        l40 l40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                hx hxVar = (hx) this.b;
                hxVar.invalidate();
                hxVar.c();
                ci.e4 e4Var = hxVar.J;
                if (e4Var != null) {
                    e4Var.e(true);
                    break;
                }
                break;
            case 1:
                ci.z1 z1Var = (ci.z1) this.b;
                ci.w1 w1Var = z1Var.c;
                ci.s2 s2Var = z1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) s2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.e3) s2Var).keyboardVisible;
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
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) s2Var2).containerView;
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
                z11 = ((org.telegram.ui.ActionBar.e3) s2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f) != null && l2Var2.d != null) {
                    s2Var2.o0();
                    break;
                }
                break;
            case 3:
                of ofVar = (of) this.b;
                View m10 = ofVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                ofVar.h = y3 >= 0.0f ? y3 : 0.0f;
                ofVar.b();
                break;
            case 4:
                ei.e4 e4Var2 = (ei.e4) this.b;
                long j3 = e4Var2.P;
                int i17 = 0;
                while (true) {
                    if (i17 < e4Var2.c.getChildCount()) {
                        if (!(e4Var2.c.getChildAt(i17) instanceof v00)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.m2) e4Var2).currentAccount;
                yh.o.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.m2) e4Var2).currentAccount;
                yh.o.g(i14).e(j3).a();
                break;
            case 5:
                fi.s sVar = (fi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 6:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.h0) this.b).f).containerView;
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
                ((li.e) this.b).f++;
                break;
            case 12:
                ((ki.h0) this.b).run();
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
                ((cw0) this.b).invalidate();
                break;
            case 16:
                ij ijVar = (ij) this.b;
                ijVar.b.X1(ijVar, i11);
                break;
            case 17:
                lj ljVar = (lj) this.b;
                if (ljVar.n.getChildCount() > 0) {
                    ljVar.b.X1(ljVar, i11);
                    break;
                }
                break;
            case 18:
                ak akVar = (ak) this.b;
                akVar.b.X1(akVar, i11);
                akVar.O();
                break;
            case 19:
                qk qkVar = (qk) this.b;
                hg.g0 g0Var = qkVar.E;
                qkVar.b.X1(qkVar, i11);
                qkVar.U();
                s4.h0 adapter = qkVar.r.getAdapter();
                pk pkVar = qkVar.y;
                if (adapter == pkVar) {
                    int L02 = g0Var.L0();
                    int N0 = g0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        pk pkVar2 = pkVar.X.y;
                        if (!pkVar2.S && !pkVar2.V && (q0Var = pkVar.y) != null) {
                            pkVar.Z(pkVar.x, pkVar.E, pkVar.F, q0Var, pkVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 20:
                rk rkVar = (rk) this.b;
                rkVar.b.X1(rkVar, i11);
                rkVar.v.setTranslationY(Math.max(0, rkVar.getCurrentItemTop()));
                break;
            case 22:
                wn wnVar = (wn) this.b;
                hg.g0 g0Var2 = wnVar.w;
                wnVar.b.X1(wnVar, i11);
                ln lnVar = wnVar.x;
                if (lnVar != null && lnVar.s) {
                    xy0 delegate = lnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        wb1 wb1Var = wnVar.s;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : wb1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (lnVar.getDirection() == 0) {
                                lnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                lnVar.setTranslationY(view.getY());
                            }
                            if (b10 < g0Var2.L0() || b10 > g0Var2.N0()) {
                                lnVar.f();
                            }
                        } else {
                            lnVar.f();
                        }
                    } else {
                        lnVar.f();
                    }
                }
                if (i11 != 0 && (l40Var = wnVar.y) != null) {
                    l40Var.b(true);
                    break;
                }
                break;
            case 23:
                xn xnVar = (xn) this.b;
                xnVar.b.X1(xnVar, i11);
                break;
            case 24:
                op opVar = (op) this.b;
                if (opVar.x.M0() + 10 >= opVar.h.h()) {
                    opVar.w();
                    break;
                }
                break;
            case 25:
                uv uvVar = (uv) this.b;
                kv kvVar = uvVar.f;
                if (kvVar != null && uvVar.h.K1 && kvVar.w) {
                    kvVar.w = false;
                    kvVar.invalidate();
                    break;
                }
                break;
            case 26:
                m00 m00Var = (m00) this.b;
                m00Var.F.invalidate();
                m00Var.invalidate();
                break;
            case 27:
                p00.G((p00) this.b);
                break;
            case 28:
                ab0 ab0Var = (ab0) this.b;
                s4.o0 layoutManager = ab0Var.getLayoutManager();
                bb0 bb0Var = ab0Var.b3;
                ua0 ua0Var = bb0Var.d;
                int N02 = layoutManager == ua0Var ? ua0Var.N0() : bb0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    gg.k1 k1Var = bb0Var.f;
                    if (N02 > k1Var.M0 - 5 && k1Var.u0 == 0 && (str = k1Var.s0) != null && str.length() != 0 && (user = k1Var.w0) != null && (str2 = k1Var.r0) != null) {
                        k1Var.T(true, user, str2, k1Var.s0);
                    }
                }
                boolean z12 = !ab0Var.canScrollVertically(-1);
                ab0Var.canScrollVertically(1);
                bb0Var.n(z12);
                bb0Var.b();
                break;
            case 29:
                bc0 bc0Var = (bc0) this.b;
                org.telegram.ui.w8 w8Var = bc0Var.b;
                ub0 ub0Var = bc0Var.f;
                for (int i18 = 0; i18 < ub0Var.getChildCount(); i18++) {
                    View childAt2 = ub0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                tb0 tb0Var = bc0Var.e;
                if (tb0Var != null) {
                    tb0Var.x();
                    break;
                }
                break;
        }
    }
}
