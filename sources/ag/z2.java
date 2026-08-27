package ag;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import gh.x5;
import gh.y5;
import hh.i5;
import hh.la;
import jh.c5;
import lh.w3;
import nh.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z2 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        lk0 lk0Var;
        lk0 lk0Var2;
        lk0 lk0Var3;
        int top;
        lk0 lk0Var4;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                if (i10 == 1) {
                    w1Var.Z2 = true;
                }
                if (i10 == 0) {
                    c3 c3Var = null;
                    for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                        c3 c3Var2 = (c3) w1Var.getChildAt(i13);
                        if (c3Var == null || c3Var2.a > c3Var.a) {
                            c3Var = c3Var2;
                        }
                    }
                    if (c3Var != null) {
                        w1Var.w1(c3Var, true);
                        w1Var.Z2 = false;
                        w1Var.v0(0, c3Var.getTop() - ((w1Var.getMeasuredHeight() - c3Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    w1Var.x1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(w1Var.a3);
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cg.i2) this.b).U.getEditText());
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
                    b6.a aVar = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.b;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.b).cancel();
                        aVar.b = null;
                    }
                    AndroidUtilities.hideKeyboard(c5Var);
                    break;
                }
                break;
            case 14:
                lh.z1 z1Var = (lh.z1) this.b;
                if (i10 == 0 && z1Var.n >= 0.0f && !z1Var.b.canScrollVertically(-1)) {
                    z1Var.n = -1.0f;
                    break;
                }
                break;
            case 18:
                oh.g0 g0Var = (oh.g0) this.b;
                if (i10 == 0) {
                    g0Var.e = !g0Var.d.canScrollVertically(-1);
                    g0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 22:
                b8 b8Var = (b8) this.b;
                n7 n7Var = b8Var.n;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i14 = b8Var.w0;
                    i11 = ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop;
                    int i15 = (i14 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) b8Var).backgroundPaddingTop;
                    if (i12 + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (lk0Var = (lk0) n7Var.K(b8Var.r0 ? 1 : 0)) != null) {
                        View view = lk0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            n7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                } else if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(b8Var.getCurrentFocus());
                    break;
                }
                break;
            case 25:
                ui uiVar = (ui) this.b;
                hh.f1 f1Var = uiVar.n;
                gi giVar = uiVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var = giVar.W0;
                    int dp3 = dp2 + (v0Var != null ? AndroidUtilities.dp(v0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var2 = (lk0) f1Var.K(0)) != null) {
                        View view2 = lk0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            f1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 27:
                bk bkVar = (bk) this.b;
                qj qjVar = bkVar.r;
                gi giVar2 = bkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = giVar2.getBackgroundPaddingTop();
                    if (((giVar2.X1[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var3 = (lk0) qjVar.K(0)) != null && (top = (lk0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        qjVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && bkVar.U && qjVar.getAdapter() == bkVar.y) {
                    AndroidUtilities.hideKeyboard(giVar2.getCurrentFocus());
                }
                bkVar.Q = i10 != 0;
                break;
            case 28:
                ck ckVar = (ck) this.b;
                zk0 zk0Var = ckVar.r;
                gi giVar3 = ckVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.v0 v0Var2 = giVar3.W0;
                    int dp6 = dp5 + (v0Var2 != null ? AndroidUtilities.dp(v0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = giVar3.getBackgroundPaddingTop();
                    if (((giVar3.X1[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var4 = (lk0) zk0Var.K(0)) != null) {
                        View view3 = lk0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            zk0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 29:
                if (i10 == 1) {
                    tk tkVar = (tk) this.b;
                    if (tkVar.h0 && tkVar.i0) {
                        AndroidUtilities.hideKeyboard(tkVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        float f10;
        boolean z10;
        float y10;
        int measuredHeight;
        ViewGroup viewGroup;
        boolean z11;
        lh.e2 e2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z12;
        lh.e2 e2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        pf.e0 e0Var;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                if (recyclerView.getScrollState() == 1) {
                    w1Var.w1(null, true);
                }
                w1Var.invalidate();
                break;
            case 2:
                ((ch.h) this.b).R();
                break;
            case 3:
                f2.k0 k0Var = (f2.k0) recyclerView.getLayoutManager();
                fh.v vVar = (fh.v) this.b;
                fh.i iVar = vVar.C;
                if (vVar.x && !vVar.w && k0Var != null) {
                    if (vVar.f.h() - k0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar);
                        break;
                    }
                }
                break;
            case 4:
                y5 y5Var = (y5) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < y5Var.n.getChildCount()) {
                        if (y5Var.n.getChildAt(i15) instanceof h00) {
                            y5Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                rl.o(y5Var.h.animate().alpha((y5Var.G && y5Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), er.h, 320L);
                break;
            case 5:
                ((x5) this.b).Z();
                break;
            case 6:
                hh.r rVar = (hh.r) this.b;
                if (rVar.a == 1) {
                    if (rVar.e.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < rVar.e.getChildCount(); i16++) {
                            if (!(rVar.e.getChildAt(i16) instanceof h00)) {
                            }
                        }
                        break;
                    }
                    hh.r.e0(rVar);
                    break;
                }
                break;
            case 7:
                hh.l1 l1Var = (hh.l1) this.b;
                jg.e eVar = l1Var.o0;
                View view = l1Var.m0;
                FrameLayout frameLayout = l1Var.h0;
                zk0 zk0Var = l1Var.d;
                int childCount = zk0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = zk0Var.getChildAt(childCount);
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
                    view.animate().alpha(z13 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new fh.f(1, l1Var, z13)).start();
                }
                l1Var.G = f10 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f10);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i17 >= 31 && eVar != null) {
                        l1Var.Q(1);
                        break;
                    }
                }
                break;
            case 8:
                ((i5) this.b).U.e();
                break;
            case 9:
                la laVar = (la) this.b;
                k51 k51Var = laVar.a;
                if (k51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < k51Var.getChildCount(); i18++) {
                        if (!(k51Var.getChildAt(i18) instanceof h00)) {
                        }
                    }
                    break;
                }
                laVar.h.run();
                break;
            case 10:
                ((ig.v) this.b).c(true);
                break;
            case 11:
                yw ywVar = (yw) this.b;
                ywVar.invalidate();
                ywVar.c();
                w3 w3Var = ywVar.F;
                if (w3Var != null) {
                    w3Var.e(true);
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                c5Var.c();
                c5Var.invalidate();
                break;
            case 13:
                lh.u1 u1Var = (lh.u1) this.b;
                lh.s1 s1Var = u1Var.c;
                lh.l2 l2Var = u1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.e3) l2Var).containerView;
                viewGroup.invalidate();
                z11 = ((org.telegram.ui.ActionBar.e3) l2Var).keyboardVisible;
                if (z11 && u1Var.b.G1 && (e2Var = u1Var.d) != null && e2Var.d != null) {
                    l2Var.o0();
                }
                if (u1Var.e.M0() + 7 >= s1Var.h() - 1) {
                    s1Var.G();
                    break;
                }
                break;
            case 14:
                lh.z1 z1Var = (lh.z1) this.b;
                lh.y1 y1Var = z1Var.c;
                lh.o1 o1Var = z1Var.b;
                lh.l2 l2Var2 = z1Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) l2Var2).containerView;
                viewGroup2.invalidate();
                int i19 = -1;
                if (z1Var.n < 0.0f) {
                    i12 = z1Var.d.I0();
                } else {
                    int i20 = 0;
                    while (true) {
                        if (i20 < o1Var.getChildCount()) {
                            View childAt2 = o1Var.getChildAt(i20);
                            if (childAt2.getY() + childAt2.getHeight() > z1Var.n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
                                i12 = RecyclerView.R(childAt2);
                            } else {
                                i20++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = y1Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = y1Var.y.keyAt(size);
                        int valueAt = y1Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i19 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i19 >= 0) {
                    z1Var.e.j(i19, true);
                }
                z12 = ((org.telegram.ui.ActionBar.e3) l2Var2).keyboardVisible;
                if (z12 && o1Var.G1 && (e2Var2 = z1Var.f) != null && e2Var2.d != null) {
                    l2Var2.o0();
                    break;
                }
                break;
            case 15:
                ze zeVar = (ze) this.b;
                View m10 = zeVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                zeVar.h = y11 >= 0.0f ? y11 : 0.0f;
                zeVar.b();
                break;
            case 16:
                s3 s3Var = (s3) this.b;
                long j10 = s3Var.L;
                int i21 = 0;
                while (true) {
                    if (i21 < s3Var.c.getChildCount()) {
                        if (!(s3Var.c.getChildAt(i21) instanceof h00)) {
                            i21++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.n2) s3Var).currentAccount;
                hh.c0.g(i13).d(j10).a();
                i14 = ((org.telegram.ui.ActionBar.n2) s3Var).currentAccount;
                hh.c0.g(i14).e(j10).a();
                break;
            case 17:
                oh.r rVar2 = (oh.r) this.b;
                rVar2.v.b(rVar2.d);
                break;
            case 18:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((oh.g0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 19:
                oh.i0 i0Var = (oh.i0) this.b;
                i0Var.h.I.b(i0Var.d);
                break;
            case 20:
                ((org.telegram.messenger.voip.l0) this.b).run();
                break;
            case 21:
                ((org.telegram.ui.Components.e0) this.b).r0();
                break;
            case 22:
                b8 b8Var = (b8) this.b;
                f2.k0 k0Var2 = b8Var.r;
                b8.P(b8Var);
                b8Var.E0();
                if (!b8Var.f) {
                    int L0 = k0Var2.L0();
                    if (b8Var.r0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(k0Var2.N0() - L0) + 1 : 0;
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
            case 23:
                ((zu0) this.b).invalidate();
                break;
            case 24:
                ri riVar = (ri) this.b;
                riVar.b.X1(riVar, i11);
                break;
            case 25:
                ui uiVar = (ui) this.b;
                if (uiVar.n.getChildCount() > 0) {
                    uiVar.b.X1(uiVar, i11);
                    break;
                }
                break;
            case 26:
                lj ljVar = (lj) this.b;
                ljVar.b.X1(ljVar, i11);
                ljVar.O();
                break;
            case 27:
                bk bkVar = (bk) this.b;
                zi ziVar = bkVar.A;
                bkVar.b.X1(bkVar, i11);
                bkVar.U();
                f2.q0 adapter = bkVar.r.getAdapter();
                ak akVar = bkVar.y;
                if (adapter == akVar) {
                    int L02 = ziVar.L0();
                    int N0 = ziVar.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        ak akVar2 = akVar.T.y;
                        if (!akVar2.O && !akVar2.R && (e0Var = akVar.y) != null) {
                            akVar.Z(akVar.x, akVar.A, akVar.B, e0Var, akVar.F, false);
                            break;
                        }
                    }
                }
                break;
            case 28:
                ck ckVar = (ck) this.b;
                ckVar.b.X1(ckVar, i11);
                ckVar.v.setTranslationY(Math.max(0, ckVar.getCurrentItemTop()));
                break;
        }
    }
}
