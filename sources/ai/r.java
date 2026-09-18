package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.fc1;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
            case 1:
                j7 j7Var = (j7) this.b;
                if (i10 == 0) {
                    j7Var.V = true;
                    j7Var.invalidate();
                }
                if (i10 == 1) {
                    j7Var.V = false;
                    a5.a aVar = j7Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.c).cancel();
                        aVar.c = null;
                    }
                    AndroidUtilities.hideKeyboard(j7Var);
                    break;
                }
                break;
            case 3:
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
                ((ki.i) this.b).e++;
                break;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.b;
                org.telegram.ui.Components.s7 s7Var = h8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(h8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i13 = h8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.g3) h8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.g3) h8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && s7Var.canScrollVertically(1) && (wk0Var = (wk0) s7Var.L(h8Var.v0 ? 1 : 0)) != null) {
                        View view = wk0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            s7Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                jj jjVar = (jj) this.b;
                w0 w0Var = jjVar.n;
                vi viVar = jjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = viVar.a1;
                    int dp3 = dp2 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var2 = (wk0) w0Var.L(0)) != null) {
                        View view2 = wk0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            w0Var.w0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
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
                    if (((viVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var3 = (wk0) dkVar.L(0)) != null && (top = (wk0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        dkVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && okVar.b0 && dkVar.getAdapter() == okVar.y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                okVar.U = i10 != 0;
                break;
            case 21:
                pk pkVar = (pk) this.b;
                ml0 ml0Var = pkVar.r;
                vi viVar3 = pkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var3 = viVar3.a1;
                    int dp6 = dp5 + (w0Var3 != null ? AndroidUtilities.dp(w0Var3.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var4 = (wk0) ml0Var.L(0)) != null) {
                        View view3 = wk0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            ml0Var.w0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
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
                un unVar = (un) this.b;
                fc1 fc1Var = unVar.s;
                vi viVar4 = unVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wk0Var5 = (wk0) fc1Var.L(1)) != null && (top2 = (wk0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        fc1Var.w0(0, top2, null);
                    }
                    int i15 = unVar.W0;
                    if (i15 >= 0) {
                        un.K(unVar, i15);
                        unVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 29:
                ma0 ma0Var = (ma0) this.b;
                ma0Var.X2 = i10 != 0;
                ma0Var.Y2 = i10 == 1;
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
        i40 i40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                nx nxVar = (nx) this.b;
                nxVar.invalidate();
                nxVar.c();
                ci.f4 f4Var = nxVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                    break;
                }
                break;
            case 1:
                j7 j7Var = (j7) this.b;
                j7Var.c();
                j7Var.invalidate();
                break;
            case 2:
                ci.z1 z1Var = (ci.z1) this.b;
                ci.w1 w1Var = z1Var.c;
                ci.t2 t2Var = z1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.g3) t2Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.g3) t2Var).keyboardVisible;
                if (z10 && z1Var.b.K1 && (l2Var = z1Var.d) != null && l2Var.d != null) {
                    t2Var.o0();
                }
                if (z1Var.e.M0() + 7 >= w1Var.h() - 1) {
                    w1Var.G();
                    break;
                }
                break;
            case 3:
                ci.e2 e2Var = (ci.e2) this.b;
                ci.d2 d2Var = e2Var.c;
                ci.p1 p1Var = e2Var.b;
                ci.t2 t2Var2 = e2Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) t2Var2).containerView;
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
                                i12 = RecyclerView.S(childAt);
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
                z11 = ((org.telegram.ui.ActionBar.g3) t2Var2).keyboardVisible;
                if (z11 && p1Var.K1 && (l2Var2 = e2Var.f) != null && l2Var2.d != null) {
                    t2Var2.o0();
                    break;
                }
                break;
            case 4:
                lf lfVar = (lf) this.b;
                View m10 = lfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                lfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                lfVar.b();
                break;
            case 5:
                ei.e4 e4Var = (ei.e4) this.b;
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
                i13 = ((org.telegram.ui.ActionBar.o2) e4Var).currentAccount;
                yh.o.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.o2) e4Var).currentAccount;
                yh.o.g(i14).e(j3).a();
                break;
            case 6:
                fi.s sVar = (fi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) ((fi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 8:
                fi.j0 j0Var = (fi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 9:
                hg.m.b0((hg.m) this.b);
                break;
            case 10:
                hg.i0 i0Var = (hg.i0) this.b;
                i0Var.b.X1(i0Var, i11);
                i0Var.M();
                break;
            case 12:
                ((ki.i) this.b).e++;
                break;
            case 13:
                ((m4.g0) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.e0) this.b).r0();
                break;
            case 15:
                org.telegram.ui.Components.h8 h8Var = (org.telegram.ui.Components.h8) this.b;
                s4.c0 c0Var = h8Var.r;
                org.telegram.ui.Components.h8.P(h8Var);
                h8Var.E0();
                if (!h8Var.f) {
                    int L0 = c0Var.L0();
                    if (h8Var.v0) {
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
                ((qv0) this.b).invalidate();
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
                hg.e0 e0Var = okVar.E;
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
                un unVar = (un) this.b;
                hg.e0 e0Var2 = unVar.w;
                unVar.b.X1(unVar, i11);
                jn jnVar = unVar.x;
                if (jnVar != null && jnVar.s) {
                    my0 delegate = jnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.c6) {
                        fc1 fc1Var = unVar.s;
                        View G = fc1Var.G((org.telegram.ui.Cells.c6) delegate);
                        s4.c1 U = G == null ? null : fc1Var.U(G);
                        if (U != null) {
                            View view = U.a;
                            int b10 = U.b();
                            if (jnVar.getDirection() == 0) {
                                jnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                jnVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                jnVar.f();
                            }
                        } else {
                            jnVar.f();
                        }
                    } else {
                        jnVar.f();
                    }
                }
                if (i11 != 0 && (i40Var = unVar.y) != null) {
                    i40Var.b(true);
                    break;
                }
                break;
            case 24:
                vn vnVar = (vn) this.b;
                vnVar.b.X1(vnVar, i11);
                break;
            case 25:
                mp mpVar = (mp) this.b;
                if (mpVar.x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    break;
                }
                break;
            case 26:
                sv svVar = (sv) this.b;
                iv ivVar = svVar.f;
                if (ivVar != null && svVar.h.K1 && ivVar.w) {
                    ivVar.w = false;
                    ivVar.invalidate();
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
                ma0 ma0Var = (ma0) this.b;
                s4.o0 layoutManager = ma0Var.getLayoutManager();
                na0 na0Var = ma0Var.b3;
                ga0 ga0Var = na0Var.d;
                int N02 = layoutManager == ga0Var ? ga0Var.N0() : na0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    gg.k1 k1Var = na0Var.f;
                    if (N02 > k1Var.M0 - 5 && k1Var.u0 == 0 && (str = k1Var.s0) != null && str.length() != 0 && (user = k1Var.w0) != null && (str2 = k1Var.r0) != null) {
                        k1Var.T(true, user, str2, k1Var.s0);
                    }
                }
                boolean z12 = !ma0Var.canScrollVertically(-1);
                ma0Var.canScrollVertically(1);
                na0Var.n(z12);
                na0Var.b();
                break;
        }
    }
}
