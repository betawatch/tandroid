package cg;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ih.q5;
import ih.r5;
import jh.fa;
import jh.h5;
import lh.c5;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.wa1;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g2 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
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
            case 0:
                h1 h1Var = (h1) this.b;
                if (i10 == 1) {
                    h1Var.Z2 = true;
                }
                if (i10 == 0) {
                    j2 j2Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        j2 j2Var2 = (j2) h1Var.getChildAt(i13);
                        if (j2Var == null || j2Var2.a > j2Var.a) {
                            j2Var = j2Var2;
                        }
                    }
                    if (j2Var != null) {
                        h1Var.w1(j2Var, true);
                        h1Var.Z2 = false;
                        h1Var.v0(0, j2Var.getTop() - ((h1Var.getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    h1Var.x1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(h1Var.a3);
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((eg.g2) this.b).U.getEditText());
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                if (i10 == 0) {
                    c5Var.R = true;
                    c5Var.invalidate();
                }
                if (i10 == 1) {
                    c5Var.R = false;
                    ag.j2 j2Var3 = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) j2Var3.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) j2Var3.c).cancel();
                        j2Var3.c = null;
                    }
                    AndroidUtilities.hideKeyboard(c5Var);
                    break;
                }
                break;
            case 14:
                nh.y1 y1Var = (nh.y1) this.b;
                if (i10 == 0 && y1Var.n >= 0.0f && !y1Var.b.canScrollVertically(-1)) {
                    y1Var.n = -1.0f;
                    break;
                }
                break;
            case 17:
                g8 g8Var = (g8) this.b;
                s7 s7Var = g8Var.n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i14 = g8Var.w0;
                    i11 = ((f3) g8Var).backgroundPaddingTop;
                    int i15 = (i14 - i11) - dp;
                    i12 = ((f3) g8Var).backgroundPaddingTop;
                    if (i12 + i15 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && s7Var.canScrollVertically(1) && (vk0Var = (vk0) s7Var.K(g8Var.r0 ? 1 : 0)) != null) {
                        View view = vk0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            s7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(g8Var.getCurrentFocus());
                    break;
                }
                break;
            case 20:
                bj bjVar = (bj) this.b;
                jh.e1 e1Var = bjVar.n;
                ni niVar = bjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = niVar.W0;
                    int dp3 = dp2 + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
                    if (((niVar.X1[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var2 = (vk0) e1Var.K(0)) != null) {
                        View view2 = vk0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            e1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                jk jkVar = (jk) this.b;
                xj xjVar = jkVar.r;
                ni niVar2 = jkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = niVar2.getBackgroundPaddingTop();
                    if (((niVar2.X1[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var3 = (vk0) xjVar.K(0)) != null && (top = (vk0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        xjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && jkVar.U && xjVar.getAdapter() == jkVar.y) {
                    AndroidUtilities.hideKeyboard(niVar2.getCurrentFocus());
                }
                jkVar.Q = i10 != 0;
                break;
            case 23:
                kk kkVar = (kk) this.b;
                jl0 jl0Var = kkVar.r;
                ni niVar3 = kkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = niVar3.W0;
                    int dp6 = dp5 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = niVar3.getBackgroundPaddingTop();
                    if (((niVar3.X1[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var4 = (vk0) jl0Var.K(0)) != null) {
                        View view3 = vk0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            jl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 24:
                if (i10 == 1) {
                    bl blVar = (bl) this.b;
                    if (blVar.h0 && blVar.i0) {
                        AndroidUtilities.hideKeyboard(blVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 25:
                on onVar = (on) this.b;
                wa1 wa1Var = onVar.s;
                ni niVar4 = onVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = niVar4.getBackgroundPaddingTop();
                    if (((niVar4.X1[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (vk0Var5 = (vk0) wa1Var.K(1)) != null && (top2 = (vk0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        wa1Var.v0(0, top2, null);
                    }
                    int i16 = onVar.S0;
                    if (i16 >= 0) {
                        on.J(onVar, i16);
                        onVar.S0 = -1;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0315, code lost:
    
        r3 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0317, code lost:
    
        r4 = true;
     */
    @Override // f2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f9;
        boolean z10;
        float y8;
        int measuredHeight;
        ViewGroup viewGroup;
        boolean z11;
        nh.d2 d2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z12;
        nh.d2 d2Var2;
        rf.f0 f0Var;
        g40 g40Var;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                if (recyclerView.getScrollState() == 1) {
                    h1Var.w1(null, true);
                }
                h1Var.invalidate();
                break;
            case 2:
                ((eh.f) this.b).R();
                break;
            case 3:
                f2.j0 j0Var = (f2.j0) recyclerView.getLayoutManager();
                hh.v vVar = (hh.v) this.b;
                hh.i iVar = vVar.C;
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
                int i13 = 0;
                while (true) {
                    if (i13 < r5Var.n.getChildCount()) {
                        if (r5Var.n.getChildAt(i13) instanceof p00) {
                            r5Var.d.g(false);
                        } else {
                            i13++;
                        }
                    }
                }
                org.telegram.ui.b.q(r5Var.h.animate().alpha((r5Var.G && r5Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), jr.h, 320L);
                break;
            case 5:
                ((q5) this.b).Z();
                break;
            case 6:
                jh.q qVar = (jh.q) this.b;
                if (qVar.a == 1) {
                    if (qVar.e.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < qVar.e.getChildCount(); i14++) {
                            if (!(qVar.e.getChildAt(i14) instanceof p00)) {
                            }
                        }
                        break;
                    }
                    jh.q.e0(qVar);
                    break;
                }
                break;
            case 7:
                jh.j1 j1Var = (jh.j1) this.b;
                lg.e eVar = j1Var.o0;
                View view = j1Var.m0;
                FrameLayout frameLayout = j1Var.h0;
                jl0 jl0Var = j1Var.d;
                int childCount = jl0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = jl0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y8 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (R == 1) {
                                f9 = childAt.getY();
                                break;
                            } else if (R == 0) {
                                y8 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            }
                        }
                        childCount--;
                    } else {
                        f9 = 0.0f;
                        z10 = false;
                    }
                }
                boolean z13 = !z10 || ((float) frameLayout.getHeight()) + f9 < 0.0f;
                if (j1Var.t0 != z13) {
                    j1Var.t0 = z13;
                    if (z13) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z13 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new hh.f(1, j1Var, z13)).start();
                }
                j1Var.G = f9 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f9);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i15 >= 31 && eVar != null) {
                        j1Var.Q(1);
                        break;
                    }
                }
                break;
            case 8:
                ((h5) this.b).U.e();
                break;
            case 9:
                fa faVar = (fa) this.b;
                u51 u51Var = faVar.a;
                if (u51Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < u51Var.getChildCount(); i16++) {
                        if (!(u51Var.getChildAt(i16) instanceof p00)) {
                        }
                    }
                    break;
                }
                faVar.h.run();
                break;
            case 10:
                ((kg.v) this.b).c(true);
                break;
            case 11:
                xw xwVar = (xw) this.b;
                xwVar.invalidate();
                xwVar.c();
                t3 t3Var = xwVar.F;
                if (t3Var != null) {
                    t3Var.e(true);
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                c5Var.c();
                c5Var.invalidate();
                break;
            case 13:
                nh.t1 t1Var = (nh.t1) this.b;
                nh.r1 r1Var = t1Var.c;
                nh.k2 k2Var = t1Var.r;
                viewGroup = ((f3) k2Var).containerView;
                viewGroup.invalidate();
                z11 = ((f3) k2Var).keyboardVisible;
                if (z11 && t1Var.b.G1 && (d2Var = t1Var.d) != null && d2Var.d != null) {
                    k2Var.o0();
                }
                if (t1Var.e.M0() + 7 >= r1Var.h() - 1) {
                    r1Var.G();
                    break;
                }
                break;
            case 14:
                nh.y1 y1Var = (nh.y1) this.b;
                nh.x1 x1Var = y1Var.c;
                nh.n1 n1Var = y1Var.b;
                nh.k2 k2Var2 = y1Var.s;
                viewGroup2 = ((f3) k2Var2).containerView;
                viewGroup2.invalidate();
                int i17 = -1;
                if (y1Var.n < 0.0f) {
                    i12 = y1Var.d.I0();
                } else {
                    int i18 = 0;
                    while (true) {
                        if (i18 < n1Var.getChildCount()) {
                            View childAt2 = n1Var.getChildAt(i18);
                            if (childAt2.getY() + childAt2.getHeight() > y1Var.n + n1Var.getPaddingTop()) {
                                n1Var.getClass();
                                i12 = RecyclerView.R(childAt2);
                            } else {
                                i18++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = x1Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = x1Var.y.keyAt(size);
                        int valueAt = x1Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i17 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i17 >= 0) {
                    y1Var.e.j(i17, true);
                }
                z12 = ((f3) k2Var2).keyboardVisible;
                if (z12 && n1Var.G1 && (d2Var2 = y1Var.f) != null && d2Var2.d != null) {
                    k2Var2.o0();
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.ActionBar.c) this.b).run();
                break;
            case 16:
                ((org.telegram.ui.Components.g0) this.b).r0();
                break;
            case 17:
                g8 g8Var = (g8) this.b;
                f2.j0 j0Var2 = g8Var.r;
                g8.P(g8Var);
                g8Var.E0();
                if (!g8Var.f) {
                    int L0 = j0Var2.L0();
                    if (g8Var.r0) {
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
            case 18:
                ((hv0) this.b).invalidate();
                break;
            case 19:
                yi yiVar = (yi) this.b;
                yiVar.b.X1(yiVar, i11);
                break;
            case 20:
                bj bjVar = (bj) this.b;
                if (bjVar.n.getChildCount() > 0) {
                    bjVar.b.X1(bjVar, i11);
                    break;
                }
                break;
            case 21:
                sj sjVar = (sj) this.b;
                sjVar.b.X1(sjVar, i11);
                sjVar.O();
                break;
            case 22:
                jk jkVar = (jk) this.b;
                gj gjVar = jkVar.A;
                jkVar.b.X1(jkVar, i11);
                jkVar.U();
                f2.p0 adapter = jkVar.r.getAdapter();
                ik ikVar = jkVar.y;
                if (adapter == ikVar) {
                    int L02 = gjVar.L0();
                    int N0 = gjVar.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        ik ikVar2 = ikVar.T.y;
                        if (!ikVar2.O && !ikVar2.R && (f0Var = ikVar.y) != null) {
                            ikVar.Z(ikVar.x, ikVar.A, ikVar.B, f0Var, ikVar.F, false);
                            break;
                        }
                    }
                }
                break;
            case 23:
                kk kkVar = (kk) this.b;
                kkVar.b.X1(kkVar, i11);
                kkVar.v.setTranslationY(Math.max(0, kkVar.getCurrentItemTop()));
                break;
            case 25:
                on onVar = (on) this.b;
                gj gjVar2 = onVar.w;
                onVar.b.X1(onVar, i11);
                en enVar = onVar.x;
                if (enVar != null && enVar.s) {
                    dy0 delegate = enVar.getDelegate();
                    if (delegate instanceof a6) {
                        wa1 wa1Var = onVar.s;
                        View F = wa1Var.F((a6) delegate);
                        f2.n1 T = F == null ? null : wa1Var.T(F);
                        if (T != null) {
                            View view2 = T.a;
                            int b10 = T.b();
                            if (enVar.getDirection() == 0) {
                                enVar.setTranslationY((view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight());
                            } else {
                                enVar.setTranslationY(view2.getY());
                            }
                            if (b10 < gjVar2.L0() || b10 > gjVar2.N0()) {
                                enVar.f();
                            }
                        } else {
                            enVar.f();
                        }
                    } else {
                        enVar.f();
                    }
                }
                if (i11 != 0 && (g40Var = onVar.y) != null) {
                    g40Var.b(true);
                    break;
                }
                break;
            case 26:
                pn pnVar = (pn) this.b;
                pnVar.b.X1(pnVar, i11);
                break;
            case 27:
                gp gpVar = (gp) this.b;
                if (gpVar.x.M0() + 10 >= gpVar.h.h()) {
                    gpVar.w();
                    break;
                }
                break;
            case 28:
                jv jvVar = (jv) this.b;
                zu zuVar = jvVar.f;
                if (zuVar != null && jvVar.h.G1 && zuVar.w) {
                    zuVar.w = false;
                    zuVar.invalidate();
                    break;
                }
                break;
            case 29:
                f00 f00Var = (f00) this.b;
                f00Var.B.invalidate();
                f00Var.invalidate();
                break;
        }
    }
}
