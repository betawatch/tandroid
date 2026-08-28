package bg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import fh.f6;
import fh.g6;
import gh.k5;
import gh.la;
import ih.g5;
import kh.x3;
import mh.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zm;
import org.telegram.ui.va1;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o2 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        int i10;
        int i11;
        ik0 ik0Var;
        ik0 ik0Var2;
        ik0 ik0Var3;
        int top;
        ik0 ik0Var4;
        ik0 ik0Var5;
        int top2;
        switch (this.a) {
            case 0:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((q2) this.b).U.getEditText());
                    break;
                }
                break;
            case 11:
                g5 g5Var = (g5) this.b;
                if (i9 == 0) {
                    g5Var.R = true;
                    g5Var.invalidate();
                }
                if (i9 == 1) {
                    g5Var.R = false;
                    a6.a aVar = g5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.b).cancel();
                        aVar.b = null;
                    }
                    AndroidUtilities.hideKeyboard(g5Var);
                    break;
                }
                break;
            case 13:
                kh.b2 b2Var = (kh.b2) this.b;
                if (i9 == 0 && b2Var.n >= 0.0f && !b2Var.b.canScrollVertically(-1)) {
                    b2Var.n = -1.0f;
                    break;
                }
                break;
            case 17:
                nh.g0 g0Var = (nh.g0) this.b;
                if (i9 == 0) {
                    g0Var.e = !g0Var.d.canScrollVertically(-1);
                    g0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 21:
                c8 c8Var = (c8) this.b;
                n7 n7Var = c8Var.n;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AndroidUtilities.hideKeyboard(c8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i12 = c8Var.w0;
                    i10 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                    int i13 = (i12 - i10) - dp;
                    i11 = ((org.telegram.ui.ActionBar.f3) c8Var).backgroundPaddingTop;
                    if (i11 + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (ik0Var = (ik0) n7Var.K(c8Var.r0 ? 1 : 0)) != null) {
                        View view = ik0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            n7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 24:
                yi yiVar = (yi) this.b;
                gh.f1 f1Var = yiVar.n;
                ki kiVar = yiVar.b;
                if (i9 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.W0;
                    int dp3 = dp2 + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
                    if (((kiVar.X1[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var2 = (ik0) f1Var.K(0)) != null) {
                        View view2 = ik0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            f1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 26:
                fk fkVar = (fk) this.b;
                uj ujVar = fkVar.r;
                ki kiVar2 = fkVar.b;
                if (i9 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = kiVar2.getBackgroundPaddingTop();
                    if (((kiVar2.X1[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var3 = (ik0) ujVar.K(0)) != null && (top = (ik0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ujVar.v0(0, top, null);
                    }
                }
                if (i9 == 1 && fkVar.U && ujVar.getAdapter() == fkVar.y) {
                    AndroidUtilities.hideKeyboard(kiVar2.getCurrentFocus());
                }
                fkVar.Q = i9 != 0;
                break;
            case 27:
                gk gkVar = (gk) this.b;
                wk0 wk0Var = gkVar.r;
                ki kiVar3 = gkVar.b;
                if (i9 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = kiVar3.W0;
                    int dp6 = dp5 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = kiVar3.getBackgroundPaddingTop();
                    if (((kiVar3.X1[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var4 = (ik0) wk0Var.K(0)) != null) {
                        View view3 = ik0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            wk0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 28:
                if (i9 == 1) {
                    xk xkVar = (xk) this.b;
                    if (xkVar.h0 && xkVar.i0) {
                        AndroidUtilities.hideKeyboard(xkVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 29:
                jn jnVar = (jn) this.b;
                va1 va1Var = jnVar.s;
                ki kiVar4 = jnVar.b;
                if (i9 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = kiVar4.getBackgroundPaddingTop();
                    if (((kiVar4.X1[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (ik0Var5 = (ik0) va1Var.K(1)) != null && (top2 = (ik0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        va1Var.v0(0, top2, null);
                    }
                    int i14 = jnVar.S0;
                    if (i14 >= 0) {
                        jn.J(jnVar, i14);
                        jnVar.S0 = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        float f10;
        boolean z10;
        float y10;
        int measuredHeight;
        ViewGroup viewGroup;
        boolean z11;
        kh.g2 g2Var;
        ViewGroup viewGroup2;
        int i11;
        boolean z12;
        kh.g2 g2Var2;
        int i12;
        int i13;
        ViewGroup viewGroup3;
        of.m0 m0Var;
        s30 s30Var;
        switch (this.a) {
            case 1:
                ((bh.j) this.b).Q();
                break;
            case 2:
                f2.m0 m0Var2 = (f2.m0) recyclerView.getLayoutManager();
                eh.x xVar = (eh.x) this.b;
                eh.i iVar = xVar.C;
                if (xVar.x && !xVar.w && m0Var2 != null) {
                    if (xVar.f.h() - m0Var2.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        break;
                    }
                }
                break;
            case 3:
                g6 g6Var = (g6) this.b;
                int i14 = 0;
                while (true) {
                    if (i14 < g6Var.n.getChildCount()) {
                        if (g6Var.n.getChildAt(i14) instanceof e00) {
                            g6Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                ll.r(g6Var.h.animate().alpha((g6Var.G && g6Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), gr.h, 320L);
                break;
            case 4:
                ((f6) this.b).Y();
                break;
            case 5:
                gh.r rVar = (gh.r) this.b;
                if (rVar.a == 1) {
                    if (rVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < rVar.e.getChildCount(); i15++) {
                            if (!(rVar.e.getChildAt(i15) instanceof e00)) {
                            }
                        }
                        break;
                    }
                    gh.r.d0(rVar);
                    break;
                }
                break;
            case 6:
                gh.l1 l1Var = (gh.l1) this.b;
                ig.e eVar = l1Var.o0;
                View view = l1Var.m0;
                FrameLayout frameLayout = l1Var.h0;
                wk0 wk0Var = l1Var.d;
                int childCount = wk0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = wk0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f10 = childAt.getY();
                            } else if (R == 0) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        f10 = 0.0f;
                        z10 = false;
                    }
                }
                f10 = y10 - measuredHeight;
                z10 = true;
                boolean z13 = !z10 || ((float) frameLayout.getHeight()) + f10 < 0.0f;
                if (l1Var.t0 != z13) {
                    l1Var.t0 = z13;
                    if (z13) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z13 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new eh.f(1, l1Var, z13)).start();
                }
                l1Var.G = f10 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f10);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && eVar != null) {
                    eVar.f(i9, i10);
                    if (i16 >= 31 && eVar != null) {
                        l1Var.P(1);
                        break;
                    }
                }
                break;
            case 7:
                ((k5) this.b).U.e();
                break;
            case 8:
                la laVar = (la) this.b;
                i51 i51Var = laVar.a;
                if (i51Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < i51Var.getChildCount(); i17++) {
                        if (!(i51Var.getChildAt(i17) instanceof e00)) {
                        }
                    }
                    break;
                }
                laVar.h.run();
                break;
            case 9:
                ((hg.v) this.b).c(true);
                break;
            case 10:
                vw vwVar = (vw) this.b;
                vwVar.invalidate();
                vwVar.c();
                x3 x3Var = vwVar.F;
                if (x3Var != null) {
                    x3Var.e(true);
                    break;
                }
                break;
            case 11:
                g5 g5Var = (g5) this.b;
                g5Var.c();
                g5Var.invalidate();
                break;
            case 12:
                kh.w1 w1Var = (kh.w1) this.b;
                kh.u1 u1Var = w1Var.c;
                kh.n2 n2Var = w1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.f3) n2Var).containerView;
                viewGroup.invalidate();
                z11 = ((org.telegram.ui.ActionBar.f3) n2Var).keyboardVisible;
                if (z11 && w1Var.b.G1 && (g2Var = w1Var.d) != null && g2Var.d != null) {
                    n2Var.n0();
                }
                if (w1Var.e.M0() + 7 >= u1Var.h() - 1) {
                    u1Var.G();
                    break;
                }
                break;
            case 13:
                kh.b2 b2Var = (kh.b2) this.b;
                kh.a2 a2Var = b2Var.c;
                kh.q1 q1Var = b2Var.b;
                kh.n2 n2Var2 = b2Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) n2Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (b2Var.n < 0.0f) {
                    i11 = b2Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < q1Var.getChildCount()) {
                            View childAt2 = q1Var.getChildAt(i19);
                            if (childAt2.getY() + childAt2.getHeight() > b2Var.n + q1Var.getPaddingTop()) {
                                q1Var.getClass();
                                i11 = RecyclerView.R(childAt2);
                            } else {
                                i19++;
                            }
                        } else {
                            i11 = -1;
                        }
                    }
                    if (i11 == -1) {
                    }
                }
                int size = a2Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = a2Var.y.keyAt(size);
                        int valueAt = a2Var.y.valueAt(size);
                        if (i11 >= keyAt) {
                            i18 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i18 >= 0) {
                    b2Var.e.j(i18, true);
                }
                z12 = ((org.telegram.ui.ActionBar.f3) n2Var2).keyboardVisible;
                if (z12 && q1Var.G1 && (g2Var2 = b2Var.f) != null && g2Var2.d != null) {
                    n2Var2.n0();
                    break;
                }
                break;
            case 14:
                df dfVar = (df) this.b;
                View m10 = dfVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                dfVar.h = y11 >= 0.0f ? y11 : 0.0f;
                dfVar.b();
                break;
            case 15:
                u3 u3Var = (u3) this.b;
                long j10 = u3Var.L;
                int i20 = 0;
                while (true) {
                    if (i20 < u3Var.c.getChildCount()) {
                        if (!(u3Var.c.getChildAt(i20) instanceof e00)) {
                            i20++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.o2) u3Var).currentAccount;
                gh.c0.g(i12).d(j10).a();
                i13 = ((org.telegram.ui.ActionBar.o2) u3Var).currentAccount;
                gh.c0.g(i13).e(j10).a();
                break;
            case 16:
                nh.r rVar2 = (nh.r) this.b;
                rVar2.v.b(rVar2.d);
                break;
            case 17:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((nh.g0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 18:
                nh.i0 i0Var = (nh.i0) this.b;
                i0Var.h.I.b(i0Var.d);
                break;
            case 19:
                ((org.telegram.messenger.voip.l0) this.b).run();
                break;
            case 20:
                ((org.telegram.ui.Components.e0) this.b).q0();
                break;
            case 21:
                c8 c8Var = (c8) this.b;
                f2.m0 m0Var3 = c8Var.r;
                c8.O(c8Var);
                c8Var.D0();
                if (!c8Var.f) {
                    int L0 = m0Var3.L0();
                    if (c8Var.r0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(m0Var3.N0() - L0) + 1 : 0;
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
            case 22:
                ((xu0) this.b).invalidate();
                break;
            case 23:
                vi viVar = (vi) this.b;
                viVar.b.X1(viVar, i10);
                break;
            case 24:
                yi yiVar = (yi) this.b;
                if (yiVar.n.getChildCount() > 0) {
                    yiVar.b.X1(yiVar, i10);
                    break;
                }
                break;
            case 25:
                pj pjVar = (pj) this.b;
                pjVar.b.X1(pjVar, i10);
                pjVar.N();
                break;
            case 26:
                fk fkVar = (fk) this.b;
                dj djVar = fkVar.A;
                fkVar.b.X1(fkVar, i10);
                fkVar.T();
                f2.r0 adapter = fkVar.r.getAdapter();
                ek ekVar = fkVar.y;
                if (adapter == ekVar) {
                    int L02 = djVar.L0();
                    int N0 = djVar.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        ek ekVar2 = ekVar.T.y;
                        if (!ekVar2.O && !ekVar2.R && (m0Var = ekVar.y) != null) {
                            ekVar.Z(ekVar.x, ekVar.A, ekVar.B, m0Var, ekVar.F, false);
                            break;
                        }
                    }
                }
                break;
            case 27:
                gk gkVar = (gk) this.b;
                gkVar.b.X1(gkVar, i10);
                gkVar.v.setTranslationY(Math.max(0, gkVar.getCurrentItemTop()));
                break;
            case 29:
                jn jnVar = (jn) this.b;
                dj djVar2 = jnVar.w;
                jnVar.b.X1(jnVar, i10);
                zm zmVar = jnVar.x;
                if (zmVar != null && zmVar.s) {
                    sx0 delegate = zmVar.getDelegate();
                    if (delegate instanceof c6) {
                        va1 va1Var = jnVar.s;
                        View F = va1Var.F((c6) delegate);
                        f2.q1 T = F == null ? null : va1Var.T(F);
                        if (T != null) {
                            View view2 = T.a;
                            int b10 = T.b();
                            if (zmVar.getDirection() == 0) {
                                zmVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                zmVar.setTranslationY(view2.getY());
                            }
                            if (b10 < djVar2.L0() || b10 > djVar2.N0()) {
                                zmVar.f();
                            }
                        } else {
                            zmVar.f();
                        }
                    } else {
                        zmVar.f();
                    }
                }
                if (i10 != 0 && (s30Var = jnVar.y) != null) {
                    s30Var.b(true);
                    break;
                }
                break;
        }
    }
}
