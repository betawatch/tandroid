package ah;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.c2;
import di.d2;
import di.d4;
import di.k2;
import di.o1;
import di.r2;
import di.v1;
import di.y1;
import fi.f4;
import ig.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zj;
import org.telegram.ui.Components.zp;
import org.telegram.ui.kc1;
import org.telegram.ui.px;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        wl0 wl0Var;
        wl0 wl0Var2;
        wl0 wl0Var3;
        int top;
        wl0 wl0Var4;
        wl0 wl0Var5;
        int top2;
        switch (this.a) {
            case 3:
                d2 d2Var = (d2) this.b;
                if (i10 == 0 && d2Var.n >= 0.0f && !d2Var.b.canScrollVertically(-1)) {
                    d2Var.n = -1.0f;
                    break;
                }
                break;
            case 7:
                gi.h0 h0Var = (gi.h0) this.b;
                if (i10 == 0) {
                    h0Var.e = !h0Var.d.canScrollVertically(-1);
                    h0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 11:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e2) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                ((mi.e) this.b).f++;
                break;
            case 15:
                m8 m8Var = (m8) this.b;
                x7 x7Var = m8Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AndroidUtilities.hideKeyboard(m8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i13 = m8Var.A0;
                    i11 = ((e3) m8Var).backgroundPaddingTop;
                    int i14 = (i13 - i11) - dp;
                    i12 = ((e3) m8Var).backgroundPaddingTop;
                    if (i12 + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && x7Var.canScrollVertically(1) && (wl0Var = (wl0) x7Var.K(m8Var.v0 ? 1 : 0)) != null) {
                        View view = wl0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            x7Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                kj kjVar = (kj) this.b;
                bi.o0 o0Var = kjVar.n;
                vi viVar = kjVar.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.d1;
                    int dp3 = dp2 + (u0Var != null ? AndroidUtilities.dp(u0Var.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop = viVar.getBackgroundPaddingTop();
                    if (((viVar.e2[0] - backgroundPaddingTop) - dp3) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var2 = (wl0) o0Var.K(0)) != null) {
                        View view2 = wl0Var2.a;
                        if (view2.getTop() > AndroidUtilities.dp(7.0f)) {
                            o0Var.v0(0, view2.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                pk pkVar = (pk) this.b;
                ek ekVar = pkVar.r;
                vi viVar2 = pkVar.b;
                if (i10 == 0) {
                    int dp4 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop2 = viVar2.getBackgroundPaddingTop();
                    if (((viVar2.e2[0] - backgroundPaddingTop2) - dp4) + backgroundPaddingTop2 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var3 = (wl0) ekVar.K(0)) != null && (top = (wl0Var3.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(56.0f)) > 0) {
                        ekVar.v0(0, top, null);
                    }
                }
                if (i10 == 1 && pkVar.b0 && ekVar.getAdapter() == pkVar.y) {
                    AndroidUtilities.hideKeyboard(viVar2.getCurrentFocus());
                }
                pkVar.U = i10 != 0;
                break;
            case 21:
                qk qkVar = (qk) this.b;
                mm0 mm0Var = qkVar.r;
                vi viVar3 = qkVar.b;
                if (i10 == 0) {
                    int dp5 = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.u0 u0Var2 = viVar3.d1;
                    int dp6 = dp5 + (u0Var2 != null ? AndroidUtilities.dp(u0Var2.getAlpha() * 26.0f) : 0);
                    int backgroundPaddingTop3 = viVar3.getBackgroundPaddingTop();
                    if (((viVar3.e2[0] - backgroundPaddingTop3) - dp6) + backgroundPaddingTop3 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var4 = (wl0) mm0Var.K(0)) != null) {
                        View view3 = wl0Var4.a;
                        if (view3.getTop() > AndroidUtilities.dp(7.0f)) {
                            mm0Var.v0(0, view3.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    tl tlVar = (tl) this.b;
                    if (tlVar.l0 && tlVar.m0) {
                        AndroidUtilities.hideKeyboard(tlVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 23:
                io ioVar = (io) this.b;
                kc1 kc1Var = ioVar.s;
                vi viVar4 = ioVar.b;
                if (i10 == 0) {
                    int dp7 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop4 = viVar4.getBackgroundPaddingTop();
                    if (((viVar4.e2[0] - backgroundPaddingTop4) - dp7) + backgroundPaddingTop4 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var5 = (wl0) kc1Var.K(1)) != null && (top2 = (wl0Var5.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        kc1Var.v0(0, top2, null);
                    }
                    int i15 = ioVar.W0;
                    if (i15 >= 0) {
                        io.N(ioVar, i15);
                        ioVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 29:
                nb0 nb0Var = (nb0) this.b;
                nb0Var.V2 = i10 != 0;
                nb0Var.W2 = i10 == 1;
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        boolean z10;
        k2 k2Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z11;
        k2 k2Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        hg.p0 p0Var;
        v40 v40Var;
        String str;
        TLRPC.User user;
        String str2;
        switch (this.a) {
            case 0:
                ((f0) this.b).c(true);
                break;
            case 1:
                px pxVar = (px) this.b;
                pxVar.invalidate();
                pxVar.c();
                d4 d4Var = pxVar.J;
                if (d4Var != null) {
                    d4Var.e(true);
                    break;
                }
                break;
            case 2:
                y1 y1Var = (y1) this.b;
                v1 v1Var = y1Var.c;
                r2 r2Var = y1Var.r;
                viewGroup = ((e3) r2Var).containerView;
                viewGroup.invalidate();
                z10 = ((e3) r2Var).keyboardVisible;
                if (z10 && y1Var.b.I1 && (k2Var = y1Var.d) != null && k2Var.d != null) {
                    r2Var.p0();
                }
                if (y1Var.e.M0() + 7 >= v1Var.h() - 1) {
                    v1Var.G();
                    break;
                }
                break;
            case 3:
                d2 d2Var = (d2) this.b;
                c2 c2Var = d2Var.c;
                o1 o1Var = d2Var.b;
                r2 r2Var2 = d2Var.s;
                viewGroup2 = ((e3) r2Var2).containerView;
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
                z11 = ((e3) r2Var2).keyboardVisible;
                if (z11 && o1Var.I1 && (k2Var2 = d2Var.f) != null && k2Var2.d != null) {
                    r2Var2.p0();
                    break;
                }
                break;
            case 4:
                pf pfVar = (pf) this.b;
                View m10 = pfVar.c.getLayoutManager().m(0);
                float y3 = m10 != null ? m10.getY() : 0.0f;
                pfVar.h = y3 >= 0.0f ? y3 : 0.0f;
                pfVar.b();
                break;
            case 5:
                f4 f4Var = (f4) this.b;
                long j10 = f4Var.P;
                int i17 = 0;
                while (true) {
                    if (i17 < f4Var.c.getChildCount()) {
                        if (!(f4Var.c.getChildAt(i17) instanceof f10)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((m2) f4Var).currentAccount;
                zh.p.g(i13).d(j10).a();
                i14 = ((m2) f4Var).currentAccount;
                zh.p.g(i14).e(j10).a();
                break;
            case 6:
                gi.s sVar = (gi.s) this.b;
                sVar.v.b(sVar.d);
                break;
            case 7:
                viewGroup3 = ((e3) ((gi.h0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 8:
                gi.j0 j0Var = (gi.j0) this.b;
                j0Var.h.M.b(j0Var.d);
                break;
            case 9:
                ig.m.b0((ig.m) this.b);
                break;
            case 10:
                ig.i0 i0Var = (ig.i0) this.b;
                i0Var.b.b2(i0Var, i11);
                i0Var.P();
                break;
            case 12:
                ((mi.e) this.b).f++;
                break;
            case 13:
                ((org.telegram.messenger.voip.p0) this.b).run();
                break;
            case 14:
                ((org.telegram.ui.Components.e0) this.b).s0();
                break;
            case 15:
                m8 m8Var = (m8) this.b;
                s4.b0 b0Var = m8Var.r;
                m8.Q(m8Var);
                m8Var.E0();
                if (!m8Var.f) {
                    int L0 = b0Var.L0();
                    if (m8Var.v0) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(b0Var.N0() - L0) + 1 : 0;
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
                ((ow0) this.b).invalidate();
                break;
            case 17:
                hj hjVar = (hj) this.b;
                hjVar.b.b2(hjVar, i11);
                break;
            case 18:
                kj kjVar = (kj) this.b;
                if (kjVar.n.getChildCount() > 0) {
                    kjVar.b.b2(kjVar, i11);
                    break;
                }
                break;
            case 19:
                zj zjVar = (zj) this.b;
                zjVar.b.b2(zjVar, i11);
                zjVar.R();
                break;
            case 20:
                pk pkVar = (pk) this.b;
                ig.e0 e0Var = pkVar.E;
                pkVar.b.b2(pkVar, i11);
                pkVar.X();
                s4.g0 adapter = pkVar.r.getAdapter();
                ok okVar = pkVar.y;
                if (adapter == okVar) {
                    int L02 = e0Var.L0();
                    int N0 = e0Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && N0 >= h10 - 10) {
                        ok okVar2 = okVar.X.y;
                        if (!okVar2.S && !okVar2.V && (p0Var = okVar.y) != null) {
                            okVar.Z(okVar.x, okVar.E, okVar.F, p0Var, okVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 21:
                qk qkVar = (qk) this.b;
                qkVar.b.b2(qkVar, i11);
                qkVar.v.setTranslationY(Math.max(0, qkVar.getCurrentItemTop()));
                break;
            case 23:
                io ioVar = (io) this.b;
                ig.e0 e0Var2 = ioVar.w;
                ioVar.b.b2(ioVar, i11);
                wn wnVar = ioVar.x;
                if (wnVar != null && wnVar.s) {
                    jz0 delegate = wnVar.getDelegate();
                    if (delegate instanceof d6) {
                        kc1 kc1Var = ioVar.s;
                        View F = kc1Var.F((d6) delegate);
                        s4.b1 T = F == null ? null : kc1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (wnVar.getDirection() == 0) {
                                wnVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                wnVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var2.L0() || b10 > e0Var2.N0()) {
                                wnVar.f();
                            }
                        } else {
                            wnVar.f();
                        }
                    } else {
                        wnVar.f();
                    }
                }
                if (i11 != 0 && (v40Var = ioVar.y) != null) {
                    v40Var.b(true);
                    break;
                }
                break;
            case 24:
                jo joVar = (jo) this.b;
                joVar.b.b2(joVar, i11);
                break;
            case 25:
                zp zpVar = (zp) this.b;
                if (zpVar.x.M0() + 10 >= zpVar.h.h()) {
                    zpVar.y();
                    break;
                }
                break;
            case 26:
                ew ewVar = (ew) this.b;
                uv uvVar = ewVar.f;
                if (uvVar != null && ewVar.h.I1 && uvVar.w) {
                    uvVar.w = false;
                    uvVar.invalidate();
                    break;
                }
                break;
            case 27:
                w00 w00Var = (w00) this.b;
                w00Var.F.invalidate();
                w00Var.invalidate();
                break;
            case 28:
                z00.H((z00) this.b);
                break;
            case 29:
                nb0 nb0Var = (nb0) this.b;
                s4.n0 layoutManager = nb0Var.getLayoutManager();
                ob0 ob0Var = nb0Var.Z2;
                hb0 hb0Var = ob0Var.d;
                int N02 = layoutManager == hb0Var ? hb0Var.N0() : ob0Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    hg.j1 j1Var = ob0Var.f;
                    if (N02 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z12 = !nb0Var.canScrollVertically(-1);
                nb0Var.canScrollVertically(1);
                ob0Var.n(z12);
                ob0Var.b();
                break;
        }
    }
}
