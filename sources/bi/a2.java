package bi;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a2 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        fl0 fl0Var;
        fl0 fl0Var2;
        fl0 fl0Var3;
        int top;
        fl0 fl0Var4;
        fl0 fl0Var5;
        int top2;
        int i13;
        int i14;
        switch (this.a) {
            case 1:
                q2 q2Var = (q2) this.b;
                if (i10 == 0 && q2Var.n >= 0.0f && !q2Var.b.canScrollVertically(-1)) {
                    q2Var.n = -1.0f;
                    break;
                }
                break;
            case 5:
                ei.h0 h0Var = (ei.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((gg.n2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.Components.u7 u7Var = j8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(j8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = j8Var.A0;
                    i11 = ((org.telegram.ui.ActionBar.h3) j8Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.h3) j8Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && u7Var.canScrollVertically(1) && (fl0Var = (fl0) u7Var.K(j8Var.v0 ? 1 : 0)) != null) {
                        View view = fl0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            u7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                mj mjVar = (mj) this.b;
                y1 y1Var = mjVar.n;
                yi yiVar = mjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = yiVar.a1;
                    int dp3 = dp2 + (w0Var != null ? AndroidUtilities.dp(w0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = yiVar.getBackgroundPaddingTop();
                    if (((yiVar.b2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var2 = (fl0) y1Var.K(0)) != null) {
                        View view2 = fl0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            y1Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                tk tkVar = (tk) this.b;
                ik ikVar = tkVar.r;
                yi yiVar2 = tkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = yiVar2.getBackgroundPaddingTop();
                    if (((yiVar2.b2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var3 = (fl0) ikVar.K(0)) != null && (top = (fl0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ikVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && tkVar.b0 && ikVar.getAdapter() == tkVar.y) {
                    AndroidUtilities.hideKeyboard(yiVar2.getCurrentFocus());
                }
                tkVar.U = i10 != 0;
                break;
            case 18:
                uk ukVar = (uk) this.b;
                vl0 vl0Var = ukVar.r;
                yi yiVar3 = ukVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var2 = yiVar3.a1;
                    int dp6 = dp5 + (w0Var2 != null ? AndroidUtilities.dp(w0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = yiVar3.getBackgroundPaddingTop();
                    if (((yiVar3.b2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var4 = (fl0) vl0Var.K(0)) != null) {
                        View view3 = fl0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            vl0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                if (i10 == 1) {
                    ll llVar = (ll) this.b;
                    if (llVar.l0 && llVar.m0) {
                        AndroidUtilities.hideKeyboard(llVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 20:
                zn znVar = (zn) this.b;
                ic1 ic1Var = znVar.s;
                yi yiVar4 = znVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = yiVar4.getBackgroundPaddingTop();
                    if (((yiVar4.b2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (fl0Var5 = (fl0) ic1Var.K(1)) != null && (top2 = (fl0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ic1Var.v0(0, top2, null);
                    }
                    int i17 = znVar.W0;
                    if (i17 >= 0) {
                        zn.K(znVar, i17);
                        znVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 26:
                wa0 wa0Var = (wa0) this.b;
                wa0Var.X2 = i10 != 0;
                wa0Var.Y2 = i10 == 1;
                break;
            case 28:
                zg0 zg0Var = (zg0) this.b;
                tg0 tg0Var = zg0Var.b;
                if (i10 == 0) {
                    int dp8 = AndroidUtilities.dp(13.0f);
                    int i18 = zg0Var.E;
                    i13 = ((org.telegram.ui.ActionBar.h3) zg0Var).backgroundPaddingTop;
                    i14 = ((org.telegram.ui.ActionBar.h3) zg0Var).backgroundPaddingTop;
                    if (i14 + ((i18 - i13) - dp8) < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && tg0Var.canScrollVertically(1)) {
                        tg0Var.getChildAt(0);
                        fl0 fl0Var6 = (fl0) tg0Var.K(0);
                        if (fl0Var6 != null) {
                            View view4 = fl0Var6.a;
                            if (view4.getTop() > AndroidUtilities.dp(7.0f)) {
                                tg0Var.v0(0, view4.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        x2 x2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        x2 x2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        fg.q0 q0Var;
        s40 s40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.b;
                h2 h2Var = k2Var.c;
                f3 f3Var = k2Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) f3Var).containerView;
                viewGroup.invalidate();
                z10 = ((org.telegram.ui.ActionBar.h3) f3Var).keyboardVisible;
                if (z10 && k2Var.b.K1 && (x2Var = k2Var.d) != null && x2Var.d != null) {
                    f3Var.o0();
                }
                if (k2Var.e.M0() + 7 >= h2Var.h() - 1) {
                    h2Var.G();
                    break;
                }
                break;
            case 1:
                q2 q2Var = (q2) this.b;
                p2 p2Var = q2Var.c;
                w1 w1Var = q2Var.b;
                f3 f3Var2 = q2Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) f3Var2).containerView;
                viewGroup2.invalidate();
                int i15 = -1;
                if (q2Var.n < 0.0f) {
                    i12 = q2Var.d.I0();
                } else {
                    int i16 = 0;
                    while (true) {
                        if (i16 < w1Var.getChildCount()) {
                            View childAt = w1Var.getChildAt(i16);
                            if (childAt.getY() + childAt.getHeight() > q2Var.n + w1Var.getPaddingTop()) {
                                w1Var.getClass();
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
                int size = p2Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = p2Var.y.keyAt(size);
                        int valueAt = p2Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    q2Var.e.j(i15, true);
                }
                z11 = ((org.telegram.ui.ActionBar.h3) f3Var2).keyboardVisible;
                if (z11 && w1Var.K1 && (x2Var2 = q2Var.f) != null && x2Var2.d != null) {
                    f3Var2.o0();
                    break;
                }
                break;
            case 2:
                pf pfVar = (pf) this.b;
                View m10 = pfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                pfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                pfVar.b();
                break;
            case 3:
                di.h4 h4Var = (di.h4) this.b;
                long j3 = h4Var.P;
                int i17 = 0;
                while (true) {
                    if (i17 < h4Var.c.getChildCount()) {
                        if (!(h4Var.c.getChildAt(i17) instanceof a10)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.p2) h4Var).currentAccount;
                xh.p.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.p2) h4Var).currentAccount;
                xh.p.g(i14).e(j3).a();
                break;
            case 4:
                ei.s sVar = (ei.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 5:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((ei.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 6:
                ei.j0 j0Var = (ei.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 7:
                gg.n.b0((gg.n) this.b);
                break;
            case 8:
                gg.n0 n0Var = (gg.n0) this.b;
                n0Var.b.X1(n0Var, i11);
                n0Var.M();
                break;
            case 10:
                ((m4.w) this.b).run();
                break;
            case 11:
                ((org.telegram.ui.Components.g0) this.b).r0();
                break;
            case 12:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                s4.c0 c0Var = j8Var.r;
                org.telegram.ui.Components.j8.P(j8Var);
                j8Var.E0();
                if (!j8Var.f) {
                    int L0 = c0Var.L0();
                    if (j8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(c0Var.N0() - L0) + 1 : 0;
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
            case 13:
                ((aw0) this.b).invalidate();
                break;
            case 14:
                jj jjVar = (jj) this.b;
                jjVar.b.X1(jjVar, i11);
                break;
            case 15:
                mj mjVar = (mj) this.b;
                if (mjVar.n.getChildCount() > 0) {
                    mjVar.b.X1(mjVar, i11);
                    break;
                }
                break;
            case 16:
                bk bkVar = (bk) this.b;
                bkVar.b.X1(bkVar, i11);
                bkVar.O();
                break;
            case 17:
                tk tkVar = (tk) this.b;
                gg.j0 j0Var2 = tkVar.E;
                tkVar.b.X1(tkVar, i11);
                tkVar.U();
                s4.h0 adapter = tkVar.r.getAdapter();
                sk skVar = tkVar.y;
                if (adapter == skVar) {
                    int L02 = j0Var2.L0();
                    int N0 = j0Var2.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        sk skVar2 = skVar.X.y;
                        if (!skVar2.S && !skVar2.V && (q0Var = skVar.y) != null) {
                            skVar.Z(skVar.x, skVar.E, skVar.F, q0Var, skVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 18:
                uk ukVar = (uk) this.b;
                ukVar.b.X1(ukVar, i11);
                ukVar.v.setTranslationY(Math.max(0, ukVar.getCurrentItemTop()));
                break;
            case 20:
                zn znVar = (zn) this.b;
                gg.j0 j0Var3 = znVar.w;
                znVar.b.X1(znVar, i11);
                pn pnVar = znVar.x;
                if (pnVar != null && pnVar.s) {
                    xy0 delegate = pnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.e6) {
                        ic1 ic1Var = znVar.s;
                        View F = ic1Var.F((org.telegram.ui.Cells.e6) delegate);
                        s4.c1 T = F == null ? null : ic1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (pnVar.getDirection() == 0) {
                                pnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pnVar.setTranslationY(view.getY());
                            }
                            if (b10 < j0Var3.L0() || b10 > j0Var3.N0()) {
                                pnVar.f();
                            }
                        } else {
                            pnVar.f();
                        }
                    } else {
                        pnVar.f();
                    }
                }
                if (i11 != 0 && (s40Var = znVar.y) != null) {
                    s40Var.b(true);
                    break;
                }
                break;
            case 21:
                ao aoVar = (ao) this.b;
                aoVar.b.X1(aoVar, i11);
                break;
            case 22:
                sp spVar = (sp) this.b;
                if (spVar.x.M0() + 10 >= spVar.h.h()) {
                    spVar.w();
                    break;
                }
                break;
            case 23:
                wv wvVar = (wv) this.b;
                mv mvVar = wvVar.f;
                if (mvVar != null && wvVar.h.K1 && mvVar.w) {
                    mvVar.w = false;
                    mvVar.invalidate();
                    break;
                }
                break;
            case 24:
                r00 r00Var = (r00) this.b;
                r00Var.F.invalidate();
                r00Var.invalidate();
                break;
            case 25:
                u00.F((u00) this.b);
                break;
            case 26:
                wa0 wa0Var = (wa0) this.b;
                s4.o0 layoutManager = wa0Var.getLayoutManager();
                xa0 xa0Var = wa0Var.b3;
                qa0 qa0Var = xa0Var.d;
                int N02 = layoutManager == qa0Var ? qa0Var.N0() : xa0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    fg.l1 l1Var = xa0Var.f;
                    if (N02 > l1Var.L0 - 5 && l1Var.u0 == 0 && (str = l1Var.s0) != null && str.length() != 0 && (user = l1Var.w0) != null && (str2 = l1Var.r0) != null) {
                        l1Var.T(true, user, str2, l1Var.s0);
                    }
                }
                boolean z12 = !wa0Var.canScrollVertically(-1);
                wa0Var.canScrollVertically(1);
                xa0Var.n(z12);
                xa0Var.b();
                break;
            case 27:
                yb0 yb0Var = (yb0) this.b;
                org.telegram.ui.w8 w8Var = yb0Var.b;
                rb0 rb0Var = yb0Var.f;
                for (int i18 = 0; i18 < rb0Var.getChildCount(); i18++) {
                    View childAt2 = rb0Var.getChildAt(i18);
                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt2).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                qb0 qb0Var = yb0Var.e;
                if (qb0Var != null) {
                    qb0Var.x();
                    break;
                }
                break;
            case 28:
                zg0 zg0Var = (zg0) this.b;
                if (zg0Var.b.getChildCount() > 0) {
                    zg0.t(zg0Var);
                    break;
                }
                break;
            case 29:
                pk0 pk0Var = (pk0) this.b;
                y1 y1Var = pk0Var.b;
                int[] iArr = pk0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i19 = iArr[0];
                    View childAt3 = recyclerView.getChildAt(0);
                    childAt3.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i19, 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    pk0.b(pk0Var, childAt3, min);
                    View childAt4 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt4.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i19) - (childAt4.getWidth() + iArr[0]), 0.0f)) / childAt4.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    pk0.b(pk0Var, childAt4, min2);
                }
                for (int i20 = 1; i20 < y1Var.getChildCount() - 1; i20++) {
                    pk0.b(pk0Var, y1Var.getChildAt(i20), 1.0f);
                }
                pk0Var.invalidate();
                break;
        }
    }
}
