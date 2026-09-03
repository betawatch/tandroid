package fg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import lh.q5;
import lh.r5;
import mh.g5;
import mh.ga;
import oh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xj;
import org.telegram.ui.hx;
import org.telegram.ui.qb1;
import qh.e3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e2 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
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
                f1 f1Var = (f1) this.b;
                if (i10 == 1) {
                    f1Var.a3 = true;
                }
                if (i10 == 0) {
                    h2 h2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        h2 h2Var2 = (h2) f1Var.getChildAt(i13);
                        if (h2Var == null || h2Var2.a > h2Var.a) {
                            h2Var = h2Var2;
                        }
                    }
                    if (h2Var != null) {
                        f1Var.v1(h2Var, true);
                        f1Var.a3 = false;
                        f1Var.v0(0, h2Var.getTop() - ((f1Var.getMeasuredHeight() - h2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    f1Var.w1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(f1Var.b3);
                    break;
                }
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hg.f2) this.b).V.getEditText());
                    break;
                }
                break;
            case 12:
                e5 e5Var = (e5) this.b;
                if (i10 == 0) {
                    e5Var.S = true;
                    e5Var.invalidate();
                }
                if (i10 == 1) {
                    e5Var.S = false;
                    b4.e0 e0Var = e5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) e0Var.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) e0Var.c).cancel();
                        e0Var.c = null;
                    }
                    AndroidUtilities.hideKeyboard(e5Var);
                    break;
                }
                break;
            case 15:
                c8 c8Var = (c8) this.b;
                o7 o7Var = c8Var.n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i14 = c8Var.x0;
                    i11 = ((h3) c8Var).backgroundPaddingTop;
                    int i15 = (i14 - i11) - dp;
                    i12 = ((h3) c8Var).backgroundPaddingTop;
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
                bj bjVar = (bj) this.b;
                mh.d1 d1Var = bjVar.n;
                mi miVar = bjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.X0;
                    int dp3 = dp2 + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
                    if (((miVar.Y1[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var2 = (el0) d1Var.K(0)) != null) {
                        View view2 = el0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            d1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                jk jkVar = (jk) this.b;
                xj xjVar = jkVar.r;
                mi miVar2 = jkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = miVar2.getBackgroundPaddingTop();
                    if (((miVar2.Y1[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var3 = (el0) xjVar.K(0)) != null && (top = (el0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        xjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && jkVar.V && xjVar.getAdapter() == jkVar.y) {
                    AndroidUtilities.hideKeyboard(miVar2.getCurrentFocus());
                }
                jkVar.R = i10 != 0;
                break;
            case 21:
                kk kkVar = (kk) this.b;
                sl0 sl0Var = kkVar.r;
                mi miVar3 = kkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = miVar3.X0;
                    int dp6 = dp5 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = miVar3.getBackgroundPaddingTop();
                    if (((miVar3.Y1[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var4 = (el0) sl0Var.K(0)) != null) {
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
                    cl clVar = (cl) this.b;
                    if (clVar.i0 && clVar.j0) {
                        AndroidUtilities.hideKeyboard(clVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 23:
                rn rnVar = (rn) this.b;
                qb1 qb1Var = rnVar.s;
                mi miVar4 = rnVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = miVar4.getBackgroundPaddingTop();
                    if (((miVar4.Y1[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var5 = (el0) qb1Var.K(1)) != null && (top2 = (el0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        qb1Var.v0(0, top2, null);
                    }
                    int i16 = rnVar.T0;
                    if (i16 >= 0) {
                        rn.J(rnVar, i16);
                        rnVar.T0 = -1;
                        break;
                    }
                }
                break;
            case 29:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.U2 = i10 != 0;
                qa0Var.V2 = i10 == 1;
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        boolean z4;
        float y10;
        int measuredHeight;
        uf.e0 e0Var;
        m40 m40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.b;
                if (recyclerView.getScrollState() == 1) {
                    f1Var.v1(null, true);
                }
                f1Var.invalidate();
                break;
            case 2:
                ((hh.f) this.b).R();
                break;
            case 3:
                f2.j0 j0Var = (f2.j0) recyclerView.getLayoutManager();
                kh.v vVar = (kh.v) this.b;
                kh.i iVar = vVar.C;
                if (vVar.x && !vVar.w && j0Var != null) {
                    if (vVar.f.h() - j0Var.N0() < 10) {
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
                        if (r5Var.n.getChildAt(i12) instanceof u00) {
                            r5Var.d.g(false);
                        } else {
                            i12++;
                        }
                    }
                }
                org.telegram.ui.b.p(r5Var.h.animate().alpha((r5Var.H && r5Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), pr.h, 320L);
                break;
            case 5:
                ((q5) this.b).Z();
                break;
            case 6:
                mh.p pVar = (mh.p) this.b;
                if (pVar.a == 1) {
                    if (pVar.e.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < pVar.e.getChildCount(); i13++) {
                            if (!(pVar.e.getChildAt(i13) instanceof u00)) {
                            }
                        }
                        break;
                    }
                    mh.p.e0(pVar);
                    break;
                }
                break;
            case 7:
                mh.i1 i1Var = (mh.i1) this.b;
                og.e eVar = i1Var.p0;
                View view = i1Var.n0;
                FrameLayout frameLayout = i1Var.i0;
                sl0 sl0Var = i1Var.d;
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
                if (i1Var.u0 != z10) {
                    i1Var.u0 = z10;
                    if (z10) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new kh.f(2, i1Var, z10)).start();
                }
                i1Var.H = f10 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z4 ? 0 : 8);
                frameLayout.setTranslationY(f10);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i14 >= 31 && eVar != null) {
                        i1Var.Q(1);
                        break;
                    }
                }
                break;
            case 8:
                ((g5) this.b).V.e();
                break;
            case 9:
                ga gaVar = (ga) this.b;
                h61 h61Var = gaVar.a;
                if (h61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < h61Var.getChildCount(); i15++) {
                        if (!(h61Var.getChildAt(i15) instanceof u00)) {
                        }
                    }
                    break;
                }
                gaVar.h.run();
                break;
            case 10:
                ((ng.v) this.b).c(true);
                break;
            case 11:
                hx hxVar = (hx) this.b;
                hxVar.invalidate();
                hxVar.c();
                e3 e3Var = hxVar.G;
                if (e3Var != null) {
                    e3Var.e(true);
                    break;
                }
                break;
            case 12:
                e5 e5Var = (e5) this.b;
                e5Var.c();
                e5Var.invalidate();
                break;
            case 13:
                ((org.telegram.messenger.voip.h) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.f0) this.b).r0();
                break;
            case 15:
                c8 c8Var = (c8) this.b;
                f2.j0 j0Var2 = c8Var.r;
                c8.P(c8Var);
                c8Var.E0();
                if (!c8Var.f) {
                    int L0 = j0Var2.L0();
                    if (c8Var.s0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(j0Var2.N0() - L0) + 1 : 0;
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
                ((pv0) this.b).invalidate();
                break;
            case 17:
                xi xiVar = (xi) this.b;
                xiVar.b.X1(xiVar, i11);
                break;
            case 18:
                bj bjVar = (bj) this.b;
                if (bjVar.n.getChildCount() > 0) {
                    bjVar.b.X1(bjVar, i11);
                    break;
                }
                break;
            case 19:
                sj sjVar = (sj) this.b;
                sjVar.b.X1(sjVar, i11);
                sjVar.O();
                break;
            case 20:
                jk jkVar = (jk) this.b;
                gj gjVar = jkVar.B;
                jkVar.b.X1(jkVar, i11);
                jkVar.U();
                f2.p0 adapter = jkVar.r.getAdapter();
                ik ikVar = jkVar.y;
                if (adapter == ikVar) {
                    int L02 = gjVar.L0();
                    int N0 = gjVar.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h9 - 10) {
                        ik ikVar2 = ikVar.U.y;
                        if (!ikVar2.P && !ikVar2.S && (e0Var = ikVar.y) != null) {
                            ikVar.Z(ikVar.x, ikVar.B, ikVar.C, e0Var, ikVar.G, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                kk kkVar = (kk) this.b;
                kkVar.b.X1(kkVar, i11);
                kkVar.v.setTranslationY(Math.max(0, kkVar.getCurrentItemTop()));
                break;
            case 23:
                rn rnVar = (rn) this.b;
                gj gjVar2 = rnVar.w;
                rnVar.b.X1(rnVar, i11);
                hn hnVar = rnVar.x;
                if (hnVar != null && hnVar.s) {
                    oy0 delegate = hnVar.getDelegate();
                    if (delegate instanceof c6) {
                        qb1 qb1Var = rnVar.s;
                        View F = qb1Var.F((c6) delegate);
                        f2.m1 T = F == null ? null : qb1Var.T(F);
                        if (T != null) {
                            View view2 = T.a;
                            int b10 = T.b();
                            if (hnVar.getDirection() == 0) {
                                hnVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                hnVar.setTranslationY(view2.getY());
                            }
                            if (b10 < gjVar2.L0() || b10 > gjVar2.N0()) {
                                hnVar.f();
                            }
                        } else {
                            hnVar.f();
                        }
                    } else {
                        hnVar.f();
                    }
                }
                if (i11 != 0 && (m40Var = rnVar.y) != null) {
                    m40Var.b(true);
                    break;
                }
                break;
            case 24:
                sn snVar = (sn) this.b;
                snVar.b.X1(snVar, i11);
                break;
            case 25:
                mp mpVar = (mp) this.b;
                if (mpVar.x.M0() + 10 >= mpVar.h.h()) {
                    mpVar.w();
                    break;
                }
                break;
            case 26:
                ov ovVar = (ov) this.b;
                ev evVar = ovVar.f;
                if (evVar != null && ovVar.h.H1 && evVar.w) {
                    evVar.w = false;
                    evVar.invalidate();
                    break;
                }
                break;
            case 27:
                l00 l00Var = (l00) this.b;
                l00Var.C.invalidate();
                l00Var.invalidate();
                break;
            case 28:
                o00.F((o00) this.b);
                break;
            case 29:
                qa0 qa0Var = (qa0) this.b;
                f2.w0 layoutManager = qa0Var.getLayoutManager();
                ra0 ra0Var = qa0Var.Y2;
                ka0 ka0Var = ra0Var.d;
                int N02 = layoutManager == ka0Var ? ka0Var.N0() : ra0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    uf.u0 u0Var = ra0Var.f;
                    if (N02 > u0Var.I0 - 5 && u0Var.r0 == 0 && (str = u0Var.p0) != null && str.length() != 0 && (user = u0Var.t0) != null && (str2 = u0Var.o0) != null) {
                        u0Var.T(true, user, str2, u0Var.p0);
                    }
                }
                boolean z11 = !qa0Var.canScrollVertically(-1);
                qa0Var.canScrollVertically(1);
                ra0Var.n(z11);
                ra0Var.b();
                break;
        }
    }
}
