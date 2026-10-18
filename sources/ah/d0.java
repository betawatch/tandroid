package ah;

import ai.a2;
import ai.jd;
import ai.k7;
import ai.u1;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ei.b2;
import ei.h2;
import ei.n2;
import ei.o1;
import ei.t1;
import ei.v1;
import ei.x3;
import gi.u3;
import ig.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xj;
import org.telegram.ui.ua1;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class d0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        sl0 sl0Var;
        sl0 sl0Var2;
        sl0 sl0Var3;
        int top;
        sl0 sl0Var4;
        sl0 sl0Var5;
        int top2;
        switch (this.a) {
            case 7:
                b2 b2Var = (b2) this.b;
                if (i10 == 0 && b2Var.n >= 0.0f && !b2Var.b.canScrollVertically(-1)) {
                    b2Var.n = -1.0f;
                    break;
                }
                break;
            case 11:
                hi.h0 h0Var = (hi.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((d2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                ((ni.e) this.b).f++;
                break;
            case 19:
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
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && v7Var.canScrollVertically(1) && (sl0Var = (sl0) v7Var.K(k8Var.v0 ? 1 : 0)) != null) {
                        View view = sl0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            v7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                ij ijVar = (ij) this.b;
                u1 u1Var = ijVar.n;
                ti tiVar = ijVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = tiVar.d1;
                    int dp3 = dp2 + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.e2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var2 = (sl0) u1Var.K(0)) != null) {
                        View view2 = sl0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            u1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 24:
                nk nkVar = (nk) this.b;
                ck ckVar = nkVar.r;
                ti tiVar2 = nkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = tiVar2.getBackgroundPaddingTop();
                    if (((tiVar2.e2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var3 = (sl0) ckVar.K(0)) != null && (top = (sl0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ckVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && nkVar.b0 && ckVar.getAdapter() == nkVar.y) {
                    AndroidUtilities.hideKeyboard(tiVar2.getCurrentFocus());
                }
                nkVar.U = i10 != 0;
                break;
            case 25:
                ok okVar = (ok) this.b;
                im0 im0Var = okVar.r;
                ti tiVar3 = okVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = tiVar3.d1;
                    int dp6 = dp5 + (u0Var2 != null ? AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = tiVar3.getBackgroundPaddingTop();
                    if (((tiVar3.e2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var4 = (sl0) im0Var.K(0)) != null) {
                        View view3 = sl0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            im0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 26:
                if (i10 == 1) {
                    rl rlVar = (rl) this.b;
                    if (rlVar.l0 && rlVar.m0) {
                        AndroidUtilities.hideKeyboard(rlVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 27:
                fo foVar = (fo) this.b;
                ua1 ua1Var = foVar.s;
                ti tiVar4 = foVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = tiVar4.getBackgroundPaddingTop();
                    if (((tiVar4.e2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (sl0Var5 = (sl0) ua1Var.K(1)) != null && (top2 = (sl0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ua1Var.v0(0, top2, null);
                    }
                    int i15 = foVar.W0;
                    if (i15 >= 0) {
                        fo.N(foVar, i15);
                        foVar.W0 = -1;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x038b, code lost:
    
        r3 = r3 - r4;
     */
    @Override // s4.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        float y3;
        int measuredHeight;
        ViewGroup viewGroup;
        boolean z11;
        h2 h2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z12;
        h2 h2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        hg.o0 o0Var;
        r40 r40Var;
        switch (this.a) {
            case 0:
                ((f0) this.b).c(true);
                break;
            case 1:
                ai.x xVar = (ai.x) this.b;
                if (xVar.a == 1) {
                    if (xVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < xVar.e.getChildCount(); i15++) {
                            if (!(xVar.e.getChildAt(i15) instanceof b10)) {
                            }
                        }
                        break;
                    }
                    ai.x.e0(xVar);
                    break;
                }
                break;
            case 2:
                a2 a2Var = (a2) this.b;
                bh.f fVar = a2Var.s0;
                View view = a2Var.q0;
                FrameLayout frameLayout = a2Var.l0;
                im0 im0Var = a2Var.d;
                int childCount = im0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = im0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (R == 1) {
                                f7 = childAt.getY();
                            } else if (R == 0) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            }
                        }
                        childCount--;
                    } else {
                        z10 = false;
                        f7 = 0.0f;
                    }
                }
                z10 = true;
                boolean z13 = !z10 || ((float) frameLayout.getHeight()) + f7 < 0.0f;
                if (a2Var.x0 != z13) {
                    a2Var.x0 = z13;
                    if (z13) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z13 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new t(1, a2Var, z13)).start();
                }
                a2Var.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && fVar != null) {
                    fVar.f(i10, i11);
                    if (i16 >= 31 && fVar != null) {
                        a2Var.R(1);
                        break;
                    }
                }
                break;
            case 3:
                ((k7) this.b).Y.e();
                break;
            case 4:
                jd jdVar = (jd) this.b;
                a71 a71Var = jdVar.a;
                if (a71Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < a71Var.getChildCount(); i17++) {
                        if (!(a71Var.getChildAt(i17) instanceof b10)) {
                        }
                    }
                    break;
                }
                jdVar.h.run();
                break;
            case 5:
                vw vwVar = (vw) this.b;
                vwVar.invalidate();
                vwVar.c();
                x3 x3Var = vwVar.J;
                if (x3Var != null) {
                    x3Var.e(true);
                    break;
                }
                break;
            case 6:
                v1 v1Var = (v1) this.b;
                t1 t1Var = v1Var.c;
                n2 n2Var = v1Var.r;
                viewGroup = ((f3) n2Var).containerView;
                viewGroup.invalidate();
                z11 = ((f3) n2Var).keyboardVisible;
                if (z11 && v1Var.b.I1 && (h2Var = v1Var.d) != null && h2Var.d != null) {
                    n2Var.p0();
                }
                if (v1Var.e.M0() + 7 >= t1Var.h() - 1) {
                    t1Var.G();
                    break;
                }
                break;
            case 7:
                b2 b2Var = (b2) this.b;
                ei.a2 a2Var2 = b2Var.c;
                o1 o1Var = b2Var.b;
                n2 n2Var2 = b2Var.s;
                viewGroup2 = ((f3) n2Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (b2Var.n < 0.0f) {
                    i12 = b2Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < o1Var.getChildCount()) {
                            View childAt2 = o1Var.getChildAt(i19);
                            if (childAt2.getY() + childAt2.getHeight() > b2Var.n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
                                i12 = RecyclerView.R(childAt2);
                            } else {
                                i19++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = a2Var2.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = a2Var2.y.keyAt(size);
                        int valueAt = a2Var2.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i18 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i18 >= 0) {
                    b2Var.e.j(i18, true);
                }
                z12 = ((f3) n2Var2).keyboardVisible;
                if (z12 && o1Var.I1 && (h2Var2 = b2Var.f) != null && h2Var2.d != null) {
                    n2Var2.p0();
                    break;
                }
                break;
            case 8:
                nf nfVar = (nf) this.b;
                View m10 = nfVar.c.getLayoutManager().m(0);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                nfVar.h = y10 >= 0.0f ? y10 : 0.0f;
                nfVar.b();
                break;
            case 9:
                u3 u3Var = (u3) this.b;
                long j10 = u3Var.P;
                int i20 = 0;
                while (true) {
                    if (i20 < u3Var.c.getChildCount()) {
                        if (!(u3Var.c.getChildAt(i20) instanceof b10)) {
                            i20++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.n2) u3Var).currentAccount;
                ai.k0.g(i13).d(j10).a();
                i14 = ((org.telegram.ui.ActionBar.n2) u3Var).currentAccount;
                ai.k0.g(i14).e(j10).a();
                break;
            case 10:
                hi.r rVar = (hi.r) this.b;
                rVar.v.b(rVar.d);
                break;
            case 11:
                viewGroup3 = ((f3) ((hi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 12:
                hi.j0 j0Var = (hi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 13:
                ig.m.b0((ig.m) this.b);
                break;
            case 14:
                ig.i0 i0Var = (ig.i0) this.b;
                i0Var.b.b2(i0Var, i11);
                i0Var.P();
                break;
            case 16:
                ((ni.e) this.b).f++;
                break;
            case 17:
                ((m4.z) this.b).run();
                break;
            case 18:
                ((org.telegram.ui.Components.e0) this.b).s0();
                break;
            case 19:
                k8 k8Var = (k8) this.b;
                s4.b0 b0Var = k8Var.r;
                k8.Q(k8Var);
                k8Var.E0();
                if (!k8Var.f) {
                    int L0 = b0Var.L0();
                    if (k8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(b0Var.N0() - L0) + 1 : 0;
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
            case 20:
                ((jw0) this.b).invalidate();
                break;
            case 21:
                fj fjVar = (fj) this.b;
                fjVar.b.b2(fjVar, i11);
                break;
            case 22:
                ij ijVar = (ij) this.b;
                if (ijVar.n.getChildCount() > 0) {
                    ijVar.b.b2(ijVar, i11);
                    break;
                }
                break;
            case 23:
                xj xjVar = (xj) this.b;
                xjVar.b.b2(xjVar, i11);
                xjVar.R();
                break;
            case 24:
                nk nkVar = (nk) this.b;
                ig.e0 e0Var = nkVar.E;
                nkVar.b.b2(nkVar, i11);
                nkVar.X();
                s4.g0 adapter = nkVar.r.getAdapter();
                mk mkVar = nkVar.y;
                if (adapter == mkVar) {
                    int L02 = e0Var.L0();
                    int N0 = e0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        mk mkVar2 = mkVar.X.y;
                        if (!mkVar2.S && !mkVar2.V && (o0Var = mkVar.y) != null) {
                            mkVar.Z(mkVar.x, mkVar.E, mkVar.F, o0Var, mkVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 25:
                ok okVar = (ok) this.b;
                okVar.b.b2(okVar, i11);
                okVar.v.setTranslationY(Math.max(0, okVar.getCurrentItemTop()));
                break;
            case 27:
                fo foVar = (fo) this.b;
                ig.e0 e0Var2 = foVar.w;
                foVar.b.b2(foVar, i11);
                tn tnVar = foVar.x;
                if (tnVar != null && tnVar.s) {
                    ez0 delegate = tnVar.getDelegate();
                    if (delegate instanceof c6) {
                        ua1 ua1Var = foVar.s;
                        View F = ua1Var.F((c6) delegate);
                        s4.b1 T = F == null ? null : ua1Var.T(F);
                        if (T != null) {
                            View view2 = T.a;
                            int b10 = T.b();
                            if (tnVar.getDirection() == 0) {
                                tnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                tnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                tnVar.f();
                            }
                        } else {
                            tnVar.f();
                        }
                    } else {
                        tnVar.f();
                    }
                }
                if (i11 != 0 && (r40Var = foVar.y) != null) {
                    r40Var.b(true);
                    break;
                }
                break;
            case 28:
                go goVar = (go) this.b;
                goVar.b.b2(goVar, i11);
                break;
            case 29:
                wp wpVar = (wp) this.b;
                if (wpVar.x.M0() + 10 >= wpVar.h.h()) {
                    wpVar.y();
                    break;
                }
                break;
        }
    }
}
