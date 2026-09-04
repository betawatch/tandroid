package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.s6;
import di.d2;
import di.e2;
import di.f4;
import di.l2;
import di.p1;
import di.t2;
import di.w1;
import di.z1;
import fi.e4;
import ji.b5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.ec1;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        vk0 vk0Var;
        vk0 vk0Var2;
        vk0 vk0Var3;
        int top;
        vk0 vk0Var4;
        vk0 vk0Var5;
        int top2;
        switch (this.a) {
            case 2:
                s6 s6Var = (s6) this.b;
                if (i10 == 0) {
                    s6Var.V = true;
                    s6Var.invalidate();
                }
                if (i10 == 1) {
                    s6Var.V = false;
                    a5.a aVar = s6Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.c).cancel();
                        aVar.c = null;
                    }
                    AndroidUtilities.hideKeyboard(s6Var);
                    break;
                }
                break;
            case 4:
                e2 e2Var = (e2) this.b;
                if (i10 == 0 && e2Var.n >= 0.0f && !e2Var.b.canScrollVertically(-1)) {
                    e2Var.n = -1.0f;
                    break;
                }
                break;
            case 8:
                gi.h0 h0Var = (gi.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 12:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ig.e2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 15:
                k8 k8Var = (k8) this.b;
                v7 v7Var = k8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(k8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i13 = k8Var.A0;
                    i11 = ((f3) k8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((f3) k8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && v7Var.canScrollVertically(1) && (vk0Var = (vk0) v7Var.K(k8Var.v0 ? 1 : 0)) != null) {
                        View view = vk0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            v7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                jj jjVar = (jj) this.b;
                bi.o0 o0Var = jjVar.n;
                vi viVar = jjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.a1;
                    int dp3 = dp2 + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var2 = (vk0) o0Var.K(0)) != null) {
                        View view2 = vk0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            o0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                ok okVar = (ok) this.b;
                dk dkVar = okVar.r;
                vi viVar2 = okVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var3 = (vk0) dkVar.K(0)) != null && (top = (vk0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.b0 && dkVar.getAdapter() == okVar.y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                okVar.U = i10 != 0;
                break;
            case 21:
                pk pkVar = (pk) this.b;
                ll0 ll0Var = pkVar.r;
                vi viVar3 = pkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = viVar3.a1;
                    int dp6 = dp5 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var4 = (vk0) ll0Var.K(0)) != null) {
                        View view3 = vk0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            ll0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    gl glVar = (gl) this.b;
                    if (glVar.l0 && glVar.m0) {
                        AndroidUtilities.hideKeyboard(glVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 23:
                tn tnVar = (tn) this.b;
                ec1 ec1Var = tnVar.s;
                vi viVar4 = tnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vk0Var5 = (vk0) ec1Var.K(1)) != null && (top2 = (vk0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ec1Var.v0(0, top2, null);
                    }
                    int i15 = tnVar.W0;
                    if (i15 >= 0) {
                        tn.K(tnVar, i15);
                        tnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 29:
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
        l2 l2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        l2 l2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        hg.q0 q0Var;
        i40 i40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                ((g0) this.b).c(true);
                break;
            case 1:
                lx lxVar = (lx) this.b;
                lxVar.invalidate();
                lxVar.c();
                f4 f4Var = lxVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    break;
                }
                break;
            case 2:
                s6 s6Var = (s6) this.b;
                s6Var.c();
                s6Var.invalidate();
                break;
            case 3:
                z1 z1Var = (z1) this.b;
                w1 w1Var = z1Var.c;
                t2 t2Var = z1Var.r;
                viewGroup = ((f3) t2Var).containerView;
                viewGroup.invalidate();
                z10 = ((f3) t2Var).keyboardVisible;
                if (z10 && z1Var.b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    break;
                }
                break;
            case 4:
                e2 e2Var = (e2) this.b;
                d2 d2Var = e2Var.c;
                p1 p1Var = e2Var.b;
                t2 t2Var2 = e2Var.s;
                viewGroup2 = ((f3) t2Var2).containerView;
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
                z11 = ((f3) t2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    break;
                }
                break;
            case 5:
                of ofVar = (of) this.b;
                View m10 = ofVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                ofVar.h = y3 >= 0.0f ? y3 : 0.0f;
                ofVar.b();
                break;
            case 6:
                e4 e4Var = (e4) this.b;
                long j3 = e4Var.P;
                int i17 = 0;
                while (true) {
                    if (i17 < e4Var.c.getChildCount()) {
                        if (!(e4Var.c.getChildAt(i17) instanceof t00)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((n2) e4Var).currentAccount;
                zh.o.g(i13).d(j3).a();
                i14 = ((n2) e4Var).currentAccount;
                zh.o.g(i14).e(j3).a();
                break;
            case 7:
                gi.s sVar = (gi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 8:
                viewGroup3 = ((f3) ((gi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 9:
                gi.j0 j0Var = (gi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 10:
                ig.m.b0((ig.m) this.b);
                break;
            case 11:
                ig.i0 i0Var = (ig.i0) this.b;
                i0Var.b.X1(i0Var, i11);
                i0Var.M();
                break;
            case 13:
                ((b5) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.f0) this.b).r0();
                break;
            case 15:
                k8 k8Var = (k8) this.b;
                s4.c0 c0Var = k8Var.r;
                k8.P(k8Var);
                k8Var.E0();
                if (!k8Var.f) {
                    int L0 = c0Var.L0();
                    if (k8Var.v0) {
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
                ((ov0) this.b).invalidate();
                break;
            case 17:
                gj gjVar = (gj) this.b;
                gjVar.b.X1(gjVar, i11);
                break;
            case 18:
                jj jjVar = (jj) this.b;
                if (jjVar.n.getChildCount() > 0) {
                    jjVar.b.X1(jjVar, i11);
                    break;
                }
                break;
            case 19:
                yj yjVar = (yj) this.b;
                yjVar.b.X1(yjVar, i11);
                yjVar.O();
                break;
            case 20:
                ok okVar = (ok) this.b;
                ig.e0 e0Var = okVar.E;
                okVar.b.X1(okVar, i11);
                okVar.U();
                s4.h0 adapter = okVar.r.getAdapter();
                nk nkVar = okVar.y;
                if (adapter == nkVar) {
                    int L02 = e0Var.L0();
                    int N0 = e0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        nk nkVar2 = nkVar.X.y;
                        if (!nkVar2.S && !nkVar2.V && (q0Var = nkVar.y) != null) {
                            nkVar.Z(nkVar.x, nkVar.E, nkVar.F, q0Var, nkVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                pk pkVar = (pk) this.b;
                pkVar.b.X1(pkVar, i11);
                pkVar.v.setTranslationY(Math.max(0, pkVar.getCurrentItemTop()));
                break;
            case 23:
                tn tnVar = (tn) this.b;
                ig.e0 e0Var2 = tnVar.w;
                tnVar.b.X1(tnVar, i11);
                in inVar = tnVar.x;
                if (inVar != null && inVar.s) {
                    ky0 delegate = inVar.getDelegate();
                    if (delegate instanceof c6) {
                        ec1 ec1Var = tnVar.s;
                        View F = ec1Var.F((c6) delegate);
                        s4.c1 T = F == null ? null : ec1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (inVar.getDirection() == 0) {
                                inVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                inVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                inVar.f();
                            }
                        } else {
                            inVar.f();
                        }
                    } else {
                        inVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = tnVar.y) != null) {
                    i40Var.b(true);
                    break;
                }
                break;
            case 24:
                un unVar = (un) this.b;
                unVar.b.X1(unVar, i11);
                break;
            case 25:
                lp lpVar = (lp) this.b;
                if (lpVar.x.M0() + 10 >= lpVar.h.h()) {
                    lpVar.w();
                    break;
                }
                break;
            case 26:
                rv rvVar = (rv) this.b;
                hv hvVar = rvVar.f;
                if (hvVar != null && rvVar.h.K1 && hvVar.w) {
                    hvVar.w = false;
                    hvVar.invalidate();
                    break;
                }
                break;
            case 27:
                k00 k00Var = (k00) this.b;
                k00Var.F.invalidate();
                k00Var.invalidate();
                break;
            case 28:
                n00.G((n00) this.b);
                break;
            case 29:
                na0 na0Var = (na0) this.b;
                s4.o0 layoutManager = na0Var.getLayoutManager();
                oa0 oa0Var = na0Var.b3;
                ha0 ha0Var = oa0Var.d;
                int N02 = layoutManager == ha0Var ? ha0Var.N0() : oa0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    hg.k1 k1Var = oa0Var.f;
                    if (N02 > k1Var.L0 - 5 && k1Var.u0 == 0 && (str = k1Var.s0) != null && str.length() != 0 && (user = k1Var.w0) != null && (str2 = k1Var.r0) != null) {
                        k1Var.T(true, user, str2, k1Var.s0);
                    }
                }
                boolean z12 = !na0Var.canScrollVertically(-1);
                na0Var.canScrollVertically(1);
                oa0Var.n(z12);
                oa0Var.b();
                break;
        }
    }
}
