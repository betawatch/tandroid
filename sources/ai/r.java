package ai;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yv;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zn;
import org.telegram.ui.fc1;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.t0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        am0 am0Var;
        am0 am0Var2;
        am0 am0Var3;
        int top;
        am0 am0Var4;
        am0 am0Var5;
        int top2;
        switch (this.a) {
            case 2:
                ci.d2 d2Var = (ci.d2) this.b;
                if (i10 == 0 && d2Var.n >= 0.0f && !d2Var.b.canScrollVertically(-1)) {
                    d2Var.n = -1.0f;
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
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.b;
                org.telegram.ui.Components.w7 w7Var = l8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(l8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i13 = l8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.f3) l8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) l8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && w7Var.canScrollVertically(1) && (am0Var = (am0) w7Var.K(l8Var.v0 ? 1 : 0)) != null) {
                        View view = am0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            w7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                nj njVar = (nj) this.b;
                w0 w0Var = njVar.n;
                yi yiVar = njVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.d1;
                    int dp3 = dp2 + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.e2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var2 = (am0) w0Var.K(0)) != null) {
                        View view2 = am0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                sk skVar = (sk) this.b;
                hk hkVar = skVar.r;
                yi yiVar2 = skVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = yiVar2.getBackgroundPaddingTop();
                    if (((yiVar2.e2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var3 = (am0) hkVar.K(0)) != null && (top = (am0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        hkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && skVar.b0 && hkVar.getAdapter() == skVar.y) {
                    AndroidUtilities.hideKeyboard(yiVar2.getCurrentFocus());
                }
                skVar.U = i10 != 0;
                break;
            case 20:
                tk tkVar = (tk) this.b;
                qm0 qm0Var = tkVar.r;
                yi yiVar3 = tkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = yiVar3.d1;
                    int dp6 = dp5 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = yiVar3.getBackgroundPaddingTop();
                    if (((yiVar3.e2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var4 = (am0) qm0Var.K(0)) != null) {
                        View view3 = am0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            qm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    xl xlVar = (xl) this.b;
                    if (xlVar.l0 && xlVar.m0) {
                        AndroidUtilities.hideKeyboard(xlVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 22:
                lo loVar = (lo) this.b;
                fc1 fc1Var = loVar.s;
                yi yiVar4 = loVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = yiVar4.getBackgroundPaddingTop();
                    if (((yiVar4.e2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (am0Var5 = (am0) fc1Var.K(1)) != null && (top2 = (am0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        fc1Var.v0(0, top2, null);
                    }
                    int i15 = loVar.W0;
                    if (i15 >= 0) {
                        lo.N(loVar, i15);
                        loVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 28:
                ob0 ob0Var = (ob0) this.b;
                ob0Var.V2 = i10 != 0;
                ob0Var.W2 = i10 == 1;
                break;
        }
    }

    @Override // s4.t0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        ci.k2 k2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        ci.k2 k2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        gg.p0 p0Var;
        z40 z40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                kx kxVar = (kx) this.b;
                kxVar.invalidate();
                kxVar.c();
                ci.d4 d4Var = kxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    break;
                }
                break;
            case 1:
                ci.y1 y1Var = (ci.y1) this.b;
                ci.v1 v1Var = y1Var.c;
                ci.r2 r2Var = y1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.f3) r2Var).keyboardVisible;
                if (z10 && y1Var.b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    break;
                }
                break;
            case 2:
                ci.d2 d2Var = (ci.d2) this.b;
                ci.c2 c2Var = d2Var.c;
                ci.o1 o1Var = d2Var.b;
                ci.r2 r2Var2 = d2Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) r2Var2).containerView;
                viewGroup2.invalidate();
                int i15 = -1;
                if (d2Var.n < 0.0f) {
                    i12 = d2Var.d.I0();
                } else {
                    int i16 = 0;
                    while (true) {
                        if (i16 < o1Var.getChildCount()) {
                            View childAt = o1Var.getChildAt(i16);
                            if (childAt.getY() + childAt.getHeight() > d2Var.n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
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
                int size = c2Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = c2Var.y.keyAt(size);
                        int valueAt = c2Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    d2Var.e.j(i15, true);
                }
                z11 = ((org.telegram.ui.ActionBar.f3) r2Var2).keyboardVisible;
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    break;
                }
                break;
            case 3:
                qf qfVar = (qf) this.b;
                View m10 = qfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                qfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                qfVar.b();
                break;
            case 4:
                ei.e4 e4Var = (ei.e4) this.b;
                long j3 = e4Var.P;
                int i17 = 0;
                while (true) {
                    if (i17 < e4Var.c.getChildCount()) {
                        if (!(e4Var.c.getChildAt(i17) instanceof j10)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.n2) e4Var).currentAccount;
                yh.o.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.n2) e4Var).currentAccount;
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
                hg.j0 j0Var2 = (hg.j0) this.b;
                j0Var2.b.b2(j0Var2, i11);
                j0Var2.P();
                break;
            case 11:
                ((li.e) this.b).f++;
                break;
            case 12:
                ((ki.i0) this.b).run();
                break;
            case 13:
                ((org.telegram.ui.Components.e0) this.b).s0();
                break;
            case 14:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.b;
                s4.d0 d0Var = l8Var.r;
                org.telegram.ui.Components.l8.Q(l8Var);
                l8Var.E0();
                if (!l8Var.f) {
                    int L0 = d0Var.L0();
                    if (l8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(d0Var.N0() - L0) + 1 : 0;
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
                ((sw0) this.b).invalidate();
                break;
            case 16:
                kj kjVar = (kj) this.b;
                kjVar.b.b2(kjVar, i11);
                break;
            case 17:
                nj njVar = (nj) this.b;
                if (njVar.n.getChildCount() > 0) {
                    njVar.b.b2(njVar, i11);
                    break;
                }
                break;
            case 18:
                ck ckVar = (ck) this.b;
                ckVar.b.b2(ckVar, i11);
                ckVar.R();
                break;
            case 19:
                sk skVar = (sk) this.b;
                hg.f0 f0Var = skVar.E;
                skVar.b.b2(skVar, i11);
                skVar.X();
                s4.i0 adapter = skVar.r.getAdapter();
                rk rkVar = skVar.y;
                if (adapter == rkVar) {
                    int L02 = f0Var.L0();
                    int N0 = f0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        rk rkVar2 = rkVar.X.y;
                        if (!rkVar2.S && !rkVar2.V && (p0Var = rkVar.y) != null) {
                            rkVar.Z(rkVar.x, rkVar.E, rkVar.F, p0Var, rkVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 20:
                tk tkVar = (tk) this.b;
                tkVar.b.b2(tkVar, i11);
                tkVar.v.setTranslationY(Math.max(0, tkVar.getCurrentItemTop()));
                break;
            case 22:
                lo loVar = (lo) this.b;
                hg.f0 f0Var2 = loVar.w;
                loVar.b.b2(loVar, i11);
                zn znVar = loVar.x;
                if (znVar != null && znVar.s) {
                    mz0 delegate = znVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.d6) {
                        fc1 fc1Var = loVar.s;
                        View F = fc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.d1 T = F == null ? null : fc1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (znVar.getDirection() == 0) {
                                znVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                znVar.setTranslationY(view.getY());
                            }
                            if (b10 < f0Var2.L0() || b10 > f0Var2.N0()) {
                                znVar.f();
                            }
                        } else {
                            znVar.f();
                        }
                    } else {
                        znVar.f();
                    }
                }
                if (i11 != 0 && (z40Var = loVar.y) != null) {
                    z40Var.b(true);
                    break;
                }
                break;
            case 23:
                mo moVar = (mo) this.b;
                moVar.b.b2(moVar, i11);
                break;
            case 24:
                cq cqVar = (cq) this.b;
                if (cqVar.x.M0() + 10 >= cqVar.h.h()) {
                    cqVar.y();
                    break;
                }
                break;
            case 25:
                iw iwVar = (iw) this.b;
                yv yvVar = iwVar.f;
                if (yvVar != null && iwVar.h.I1 && yvVar.w) {
                    yvVar.w = false;
                    yvVar.invalidate();
                    break;
                }
                break;
            case 26:
                a10 a10Var = (a10) this.b;
                a10Var.F.invalidate();
                a10Var.invalidate();
                break;
            case 27:
                d10.H((d10) this.b);
                break;
            case 28:
                ob0 ob0Var = (ob0) this.b;
                s4.p0 layoutManager = ob0Var.getLayoutManager();
                pb0 pb0Var = ob0Var.Z2;
                ib0 ib0Var = pb0Var.d;
                int N02 = layoutManager == ib0Var ? ib0Var.N0() : pb0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    gg.j1 j1Var = pb0Var.f;
                    if (N02 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z12 = !ob0Var.canScrollVertically(-1);
                ob0Var.canScrollVertically(1);
                pb0Var.n(z12);
                pb0Var.b();
                break;
            case 29:
                pc0 pc0Var = (pc0) this.b;
                org.telegram.ui.v8 v8Var = pc0Var.b;
                ic0 ic0Var = pc0Var.f;
                for (int i18 = 0; i18 < ic0Var.getChildCount(); i18++) {
                    View childAt2 = ic0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt2).Z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                hc0 hc0Var = pc0Var.e;
                if (hc0Var != null) {
                    hc0Var.w();
                    break;
                }
                break;
        }
    }
}
