package eg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kh.q5;
import kh.r5;
import lh.g5;
import lh.ga;
import nh.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.zi;
import org.telegram.ui.gx;
import org.telegram.ui.jb1;
import ph.f3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f2 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        el0 el0Var;
        el0 el0Var2;
        el0 el0Var3;
        int top;
        el0 el0Var4;
        el0 el0Var5;
        int top2;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                if (i10 == 1) {
                    g1Var.a3 = true;
                }
                if (i10 == 0) {
                    i2 i2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        i2 i2Var2 = (i2) g1Var.getChildAt(i13);
                        if (i2Var == null || i2Var2.a > i2Var.a) {
                            i2Var = i2Var2;
                        }
                    }
                    if (i2Var != null) {
                        g1Var.w1(i2Var, true);
                        g1Var.a3 = false;
                        g1Var.v0(0, i2Var.getTop() - ((g1Var.getMeasuredHeight() - i2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    g1Var.x1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(g1Var.b3);
                    break;
                }
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gg.f2) this.b).V.getEditText());
                    break;
                }
                break;
            case 12:
                d5 d5Var = (d5) this.b;
                if (i10 == 0) {
                    d5Var.S = true;
                    d5Var.invalidate();
                }
                if (i10 == 1) {
                    d5Var.S = false;
                    b4.e0 e0Var = d5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) e0Var.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) e0Var.c).cancel();
                        e0Var.c = null;
                    }
                    AndroidUtilities.hideKeyboard(d5Var);
                    break;
                }
                break;
            case 15:
                c8 c8Var = (c8) this.b;
                o7 o7Var = c8Var.n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i14 = c8Var.x0;
                    i11 = ((g3) c8Var).backgroundPaddingTop;
                    int i15 = (i14 - i11) - dp;
                    i12 = ((g3) c8Var).backgroundPaddingTop;
                    if (i12 + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o7Var.canScrollVertically(1) && (el0Var = (el0) o7Var.K(c8Var.s0 ? 1 : 0)) != null) {
                        View view = el0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            o7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(c8Var.getCurrentFocus());
                    break;
                }
                break;
            case 18:
                zi ziVar = (zi) this.b;
                lh.e1 e1Var = ziVar.n;
                li liVar = ziVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
                    int dp3 = dp2 + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
                    if (((liVar.Y1[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var2 = (el0) e1Var.K(0)) != null) {
                        View view2 = el0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            e1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                hk hkVar = (hk) this.b;
                vj vjVar = hkVar.r;
                li liVar2 = hkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = liVar2.getBackgroundPaddingTop();
                    if (((liVar2.Y1[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var3 = (el0) vjVar.K(0)) != null && (top = (el0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        vjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && hkVar.V && vjVar.getAdapter() == hkVar.y) {
                    AndroidUtilities.hideKeyboard(liVar2.getCurrentFocus());
                }
                hkVar.R = i10 != 0;
                break;
            case 21:
                ik ikVar = (ik) this.b;
                sl0 sl0Var = ikVar.r;
                li liVar3 = ikVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = liVar3.X0;
                    int dp6 = dp5 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = liVar3.getBackgroundPaddingTop();
                    if (((liVar3.Y1[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var4 = (el0) sl0Var.K(0)) != null) {
                        View view3 = el0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            sl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    al alVar = (al) this.b;
                    if (alVar.i0 && alVar.j0) {
                        AndroidUtilities.hideKeyboard(alVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 23:
                qn qnVar = (qn) this.b;
                jb1 jb1Var = qnVar.s;
                li liVar4 = qnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = liVar4.getBackgroundPaddingTop();
                    if (((liVar4.Y1[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var5 = (el0) jb1Var.K(1)) != null && (top2 = (el0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        jb1Var.v0(0, top2, null);
                    }
                    int i16 = qnVar.T0;
                    if (i16 >= 0) {
                        qn.J(qnVar, i16);
                        qnVar.T0 = -1;
                        break;
                    }
                }
                break;
            case 29:
                oa0 oa0Var = (oa0) this.b;
                oa0Var.U2 = i10 != 0;
                oa0Var.V2 = i10 == 1;
                break;
        }
    }

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        boolean z4;
        float y10;
        int measuredHeight;
        tf.e0 e0Var;
        k40 k40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                if (recyclerView.getScrollState() == 1) {
                    g1Var.w1(null, true);
                }
                g1Var.invalidate();
                break;
            case 2:
                ((gh.f) this.b).R();
                break;
            case 3:
                f2.i0 i0Var = (f2.i0) recyclerView.getLayoutManager();
                jh.v vVar = (jh.v) this.b;
                jh.i iVar = vVar.C;
                if (vVar.x && !vVar.w && i0Var != null) {
                    if (vVar.f.h() - i0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        break;
                    }
                }
                break;
            case 4:
                r5 r5Var = (r5) this.b;
                int i12 = 0;
                while (true) {
                    if (i12 < r5Var.n.getChildCount()) {
                        if (r5Var.n.getChildAt(i12) instanceof t00) {
                            r5Var.d.g(false);
                        } else {
                            i12++;
                        }
                    }
                }
                org.telegram.ui.b.p(r5Var.h.animate().alpha((r5Var.H && r5Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), nr.h, 320L);
                break;
            case 5:
                ((q5) this.b).Z();
                break;
            case 6:
                lh.q qVar = (lh.q) this.b;
                if (qVar.a == 1) {
                    if (qVar.e.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < qVar.e.getChildCount(); i13++) {
                            if (!(qVar.e.getChildAt(i13) instanceof t00)) {
                            }
                        }
                        break;
                    }
                    lh.q.e0(qVar);
                    break;
                }
                break;
            case 7:
                lh.j1 j1Var = (lh.j1) this.b;
                ng.e eVar = j1Var.p0;
                View view = j1Var.n0;
                FrameLayout frameLayout = j1Var.i0;
                sl0 sl0Var = j1Var.d;
                int childCount = sl0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = sl0Var.getChildAt(childCount);
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
                        z4 = false;
                    }
                }
                f10 = y10 - measuredHeight;
                z4 = true;
                boolean z10 = !z4 || ((float) frameLayout.getHeight()) + f10 < 0.0f;
                if (j1Var.u0 != z10) {
                    j1Var.u0 = z10;
                    if (z10) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new jh.f(2, j1Var, z10)).start();
                }
                j1Var.H = f10 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z4 ? 0 : 8);
                frameLayout.setTranslationY(f10);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i14 >= 31 && eVar != null) {
                        j1Var.Q(1);
                        break;
                    }
                }
                break;
            case 8:
                ((g5) this.b).V.e();
                break;
            case 9:
                ga gaVar = (ga) this.b;
                g61 g61Var = gaVar.a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < g61Var.getChildCount(); i15++) {
                        if (!(g61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    break;
                }
                gaVar.h.run();
                break;
            case 10:
                ((mg.v) this.b).c(true);
                break;
            case 11:
                gx gxVar = (gx) this.b;
                gxVar.invalidate();
                gxVar.c();
                f3 f3Var = gxVar.G;
                if (f3Var != null) {
                    f3Var.e(true);
                    break;
                }
                break;
            case 12:
                d5 d5Var = (d5) this.b;
                d5Var.c();
                d5Var.invalidate();
                break;
            case 13:
                ((org.telegram.messenger.voip.b) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.f0) this.b).r0();
                break;
            case 15:
                c8 c8Var = (c8) this.b;
                f2.i0 i0Var2 = c8Var.r;
                c8.P(c8Var);
                c8Var.E0();
                if (!c8Var.f) {
                    int L0 = i0Var2.L0();
                    if (c8Var.s0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(i0Var2.N0() - L0) + 1 : 0;
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
            case 16:
                ((qv0) this.b).invalidate();
                break;
            case 17:
                wi wiVar = (wi) this.b;
                wiVar.b.X1(wiVar, i11);
                break;
            case 18:
                zi ziVar = (zi) this.b;
                if (ziVar.n.getChildCount() > 0) {
                    ziVar.b.X1(ziVar, i11);
                    break;
                }
                break;
            case 19:
                qj qjVar = (qj) this.b;
                qjVar.b.X1(qjVar, i11);
                qjVar.O();
                break;
            case 20:
                hk hkVar = (hk) this.b;
                ej ejVar = hkVar.B;
                hkVar.b.X1(hkVar, i11);
                hkVar.U();
                f2.o0 adapter = hkVar.r.getAdapter();
                gk gkVar = hkVar.y;
                if (adapter == gkVar) {
                    int L02 = ejVar.L0();
                    int N0 = ejVar.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h9 - 10) {
                        gk gkVar2 = gkVar.U.y;
                        if (!gkVar2.P && !gkVar2.S && (e0Var = gkVar.y) != null) {
                            gkVar.Z(gkVar.x, gkVar.B, gkVar.C, e0Var, gkVar.G, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                ik ikVar = (ik) this.b;
                ikVar.b.X1(ikVar, i11);
                ikVar.v.setTranslationY(Math.max(0, ikVar.getCurrentItemTop()));
                break;
            case 23:
                qn qnVar = (qn) this.b;
                ej ejVar2 = qnVar.w;
                qnVar.b.X1(qnVar, i11);
                gn gnVar = qnVar.x;
                if (gnVar != null && gnVar.s) {
                    oy0 delegate = gnVar.getDelegate();
                    if (delegate instanceof c6) {
                        jb1 jb1Var = qnVar.s;
                        View F = jb1Var.F((c6) delegate);
                        f2.l1 T = F == null ? null : jb1Var.T(F);
                        if (T != null) {
                            View view2 = T.a;
                            int b10 = T.b();
                            if (gnVar.getDirection() == 0) {
                                gnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                gnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < ejVar2.L0() || b10 > ejVar2.N0()) {
                                gnVar.f();
                            }
                        } else {
                            gnVar.f();
                        }
                    } else {
                        gnVar.f();
                    }
                }
                if (i11 != 0 && (k40Var = qnVar.y) != null) {
                    k40Var.b(true);
                    break;
                }
                break;
            case 24:
                rn rnVar = (rn) this.b;
                rnVar.b.X1(rnVar, i11);
                break;
            case 25:
                kp kpVar = (kp) this.b;
                if (kpVar.x.M0() + 10 >= kpVar.h.h()) {
                    kpVar.w();
                    break;
                }
                break;
            case 26:
                mv mvVar = (mv) this.b;
                cv cvVar = mvVar.f;
                if (cvVar != null && mvVar.h.H1 && cvVar.w) {
                    cvVar.w = false;
                    cvVar.invalidate();
                    break;
                }
                break;
            case 27:
                j00 j00Var = (j00) this.b;
                j00Var.C.invalidate();
                j00Var.invalidate();
                break;
            case 28:
                n00.F((n00) this.b);
                break;
            case 29:
                oa0 oa0Var = (oa0) this.b;
                f2.v0 layoutManager = oa0Var.getLayoutManager();
                pa0 pa0Var = oa0Var.Y2;
                ia0 ia0Var = pa0Var.d;
                int N02 = layoutManager == ia0Var ? ia0Var.N0() : pa0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    tf.u0 u0Var = pa0Var.f;
                    if (N02 > u0Var.I0 - 5 && u0Var.r0 == 0 && (str = u0Var.p0) != null && str.length() != 0 && (user = u0Var.t0) != null && (str2 = u0Var.o0) != null) {
                        u0Var.T(true, user, str2, u0Var.p0);
                    }
                }
                boolean z11 = !oa0Var.canScrollVertically(-1);
                oa0Var.canScrollVertically(1);
                pa0Var.n(z11);
                pa0Var.b();
                break;
        }
    }
}
