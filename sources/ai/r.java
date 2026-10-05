package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.jx;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
            case 7:
                fi.h0 h0Var = (fi.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.e2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                ((li.p) this.b).e++;
                break;
            case 15:
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
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (il0Var = (il0) u7Var.K(j8Var.v0 ? 1 : 0)) != null) {
                        View view = il0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                mj mjVar = (mj) this.b;
                w0 w0Var = mjVar.n;
                xi xiVar = mjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.a1;
                    int dp3 = dp2 + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = xiVar.getBackgroundPaddingTop();
                    if (((xiVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var2 = (il0) w0Var.K(0)) != null) {
                        View view2 = il0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.w0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                rk rkVar = (rk) this.b;
                gk gkVar = rkVar.r;
                xi xiVar2 = rkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = xiVar2.getBackgroundPaddingTop();
                    if (((xiVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var3 = (il0) gkVar.K(0)) != null && (top = (il0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        gkVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && rkVar.b0 && gkVar.getAdapter() == rkVar.y) {
                    AndroidUtilities.hideKeyboard(xiVar2.getCurrentFocus());
                }
                rkVar.U = i10 != 0;
                break;
            case 21:
                sk skVar = (sk) this.b;
                zl0 zl0Var = skVar.r;
                xi xiVar3 = skVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = xiVar3.a1;
                    int dp6 = dp5 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = xiVar3.getBackgroundPaddingTop();
                    if (((xiVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var4 = (il0) zl0Var.K(0)) != null) {
                        View view3 = il0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            zl0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    jl jlVar = (jl) this.b;
                    if (jlVar.l0 && jlVar.m0) {
                        AndroidUtilities.hideKeyboard(jlVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 23:
                xn xnVar = (xn) this.b;
                xb1 xb1Var = xnVar.s;
                xi xiVar4 = xnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = xiVar4.getBackgroundPaddingTop();
                    if (((xiVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (il0Var5 = (il0) xb1Var.K(1)) != null && (top2 = (il0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        xb1Var.w0(0, top2, null);
                    }
                    int i15 = xnVar.W0;
                    if (i15 >= 0) {
                        xn.I(xnVar, i15);
                        xnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 29:
                ab0 ab0Var = (ab0) this.b;
                ab0Var.e3 = i10 != 0;
                ab0Var.f3 = i10 == 1;
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
        boolean z12;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        gg.q0 q0Var;
        m40 m40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                jx jxVar = (jx) this.b;
                jxVar.invalidate();
                jxVar.c();
                ci.e4 e4Var = jxVar.J;
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
                di.k kVar2 = (di.k) this.b;
                le.b bVar = kVar2.V;
                if (!kVar2.c.canScrollVertically(-1)) {
                    kVar = ((org.telegram.ui.ActionBar.n2) kVar2).actionBar;
                    if (!kVar.s()) {
                        z12 = false;
                        bVar.a(z12, true);
                        break;
                    }
                }
                z12 = true;
                bVar.a(z12, true);
            case 4:
                pf pfVar = (pf) this.b;
                View m10 = pfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                pfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                pfVar.b();
                break;
            case 5:
                ei.f4 f4Var = (ei.f4) this.b;
                long j3 = f4Var.P;
                int i17 = 0;
                while (true) {
                    if (i17 < f4Var.c.getChildCount()) {
                        if (!(f4Var.c.getChildAt(i17) instanceof w00)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.n2) f4Var).currentAccount;
                yh.p.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.n2) f4Var).currentAccount;
                yh.p.g(i14).e(j3).a();
                break;
            case 6:
                fi.s sVar = (fi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 8:
                fi.j0 j0Var = (fi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 9:
                hg.n.b0((hg.n) this.b);
                break;
            case 10:
                hg.j0 j0Var2 = (hg.j0) this.b;
                j0Var2.b.W1(j0Var2, i11);
                j0Var2.K();
                break;
            case 12:
                ((li.p) this.b).h(i10, i11);
                break;
            case 13:
                ((ki.h0) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.e0) this.b).r0();
                break;
            case 15:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                s4.c0 c0Var = j8Var.r;
                org.telegram.ui.Components.j8.N(j8Var);
                j8Var.E0();
                if (!j8Var.f) {
                    int L0 = c0Var.L0();
                    if (j8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(c0Var.N0() - L0) + 1 : 0;
                    int h = recyclerView.getAdapter().h();
                    MediaController.getInstance().getPlayingMessageObject();
                    if (!SharedConfig.playOrderReversed) {
                        if (L0 + abs > h - 10) {
                            MediaController.getInstance().loadMoreMusic();
                            break;
                        }
                    } else if (L0 < 10) {
                        MediaController.getInstance().loadMoreMusic();
                        break;
                    }
                }
                break;
            case 16:
                ((mw0) this.b).invalidate();
                break;
            case 17:
                jj jjVar = (jj) this.b;
                jjVar.b.W1(jjVar, i11);
                break;
            case 18:
                mj mjVar = (mj) this.b;
                if (mjVar.n.getChildCount() > 0) {
                    mjVar.b.W1(mjVar, i11);
                    break;
                }
                break;
            case 19:
                bk bkVar = (bk) this.b;
                bkVar.b.W1(bkVar, i11);
                bkVar.M();
                break;
            case 20:
                rk rkVar = (rk) this.b;
                hg.f0 f0Var = rkVar.E;
                rkVar.b.W1(rkVar, i11);
                rkVar.S();
                s4.h0 adapter = rkVar.r.getAdapter();
                qk qkVar = rkVar.y;
                if (adapter == qkVar) {
                    int L02 = f0Var.L0();
                    int N0 = f0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        qk qkVar2 = qkVar.X.y;
                        if (!qkVar2.S && !qkVar2.V && (q0Var = qkVar.y) != null) {
                            qkVar.Z(qkVar.x, qkVar.E, qkVar.F, q0Var, qkVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                sk skVar = (sk) this.b;
                skVar.b.W1(skVar, i11);
                skVar.v.setTranslationY(Math.max(0, skVar.getCurrentItemTop()));
                break;
            case 23:
                xn xnVar = (xn) this.b;
                hg.f0 f0Var2 = xnVar.w;
                xnVar.b.W1(xnVar, i11);
                mn mnVar = xnVar.x;
                if (mnVar != null && mnVar.s) {
                    hz0 delegate = mnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        xb1 xb1Var = xnVar.s;
                        View F = xb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : xb1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (mnVar.getDirection() == 0) {
                                mnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mnVar.setTranslationY(view.getY());
                            }
                            if (b10 < f0Var2.L0() || b10 > f0Var2.N0()) {
                                mnVar.f();
                            }
                        } else {
                            mnVar.f();
                        }
                    } else {
                        mnVar.f();
                    }
                }
                if (i11 != 0 && (m40Var = xnVar.y) != null) {
                    m40Var.b(true);
                    break;
                }
                break;
            case 24:
                yn ynVar = (yn) this.b;
                ynVar.b.W1(ynVar, i11);
                break;
            case 25:
                pp ppVar = (pp) this.b;
                if (ppVar.x.M0() + 10 >= ppVar.h.h()) {
                    ppVar.w();
                    break;
                }
                break;
            case 26:
                wv wvVar = (wv) this.b;
                mv mvVar = wvVar.f;
                if (mvVar != null && wvVar.h.K1 && mvVar.w) {
                    mvVar.w = false;
                    mvVar.invalidate();
                    break;
                }
                break;
            case 27:
                n00 n00Var = (n00) this.b;
                n00Var.F.invalidate();
                n00Var.invalidate();
                break;
            case 28:
                q00.E((q00) this.b);
                break;
            case 29:
                ab0 ab0Var = (ab0) this.b;
                s4.o0 layoutManager = ab0Var.getLayoutManager();
                bb0 bb0Var = ab0Var.i3;
                ua0 ua0Var = bb0Var.d;
                int N02 = layoutManager == ua0Var ? ua0Var.N0() : bb0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    gg.k1 k1Var = bb0Var.f;
                    if (N02 > k1Var.M0 - 5 && k1Var.u0 == 0 && (str = k1Var.s0) != null && str.length() != 0 && (user = k1Var.w0) != null && (str2 = k1Var.r0) != null) {
                        k1Var.T(true, user, str2, k1Var.s0);
                    }
                }
                boolean z13 = !ab0Var.canScrollVertically(-1);
                ab0Var.canScrollVertically(1);
                bb0Var.n(z13);
                bb0Var.b();
                break;
        }
    }
}
