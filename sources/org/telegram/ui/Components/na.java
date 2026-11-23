package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class na extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        mj0 mj0Var2;
        int top;
        mj0 mj0Var3;
        mj0 mj0Var4;
        int top2;
        mj0 mj0Var5;
        mj0 mj0Var6;
        org.telegram.ui.Wallet.k9 k9Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 2:
                gj gjVar = (gj) obj;
                di.b1 b1Var = gjVar.n;
                ti tiVar = gjVar.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i11 = tiVar.t0;
                    if (((tiVar.Z3[0] - i11) - L2) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            b1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                kk kkVar = (kk) obj;
                ti tiVar2 = kkVar.b;
                zj zjVar = kkVar.r;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    int i12 = tiVar2.t0;
                    if (((tiVar2.Z3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var2 = (mj0) zjVar.K(0)) != null && (top = (mj0Var2.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        zjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && kkVar.c0 && zjVar.getAdapter() == kkVar.E) {
                    org.telegram.messenger.g0.v1(tiVar2.getCurrentFocus());
                }
                kkVar.V = i7 != 0;
                break;
            case 5:
                lk lkVar = (lk) obj;
                ek0 ek0Var = lkVar.r;
                ti tiVar3 = lkVar.b;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = tiVar3.Y2;
                    int L5 = L4 + (q0Var2 != null ? org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f) : 0);
                    int i13 = tiVar3.t0;
                    if (((tiVar3.Z3[0] - i13) - L5) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var3 = (mj0) ek0Var.K(0)) != null) {
                        View view2 = mj0Var3.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ek0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                qn qnVar = (qn) obj;
                org.telegram.ui.d61 d61Var = qnVar.s;
                if (i7 == 0) {
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    ti tiVar4 = qnVar.b;
                    int i14 = tiVar4.t0;
                    if (((tiVar4.Z3[0] - i14) - L6) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var4 = (mj0) d61Var.K(1)) != null && (top2 = (mj0Var4.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        d61Var.w0(0, top2, null);
                    }
                    int i15 = qnVar.X0;
                    if (i15 >= 0) {
                        qn.P(qnVar, i15);
                        qnVar.X0 = -1;
                        break;
                    }
                }
                break;
            case 12:
                r90 r90Var = (r90) obj;
                r90Var.f3 = i7 != 0;
                r90Var.g3 = i7 == 1;
                break;
            case 14:
                ef0 ef0Var = (ef0) obj;
                ye0 ye0Var = ef0Var.m1;
                if (i7 == 0) {
                    int L7 = org.telegram.messenger.g0.L(13.0f);
                    int i16 = ef0Var.z1;
                    int i17 = ef0Var.t0;
                    if (((i16 - i17) - L7) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ye0Var.canScrollVertically(1) && (mj0Var5 = (mj0) ye0Var.K(0)) != null) {
                        View view3 = mj0Var5.a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ye0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ek0 ek0Var2 = (ek0) obj;
                if (i7 == 0) {
                    if (ek0Var2.u2) {
                        ek0Var2.u2 = false;
                        org.telegram.messenger.ks.e().k(99, 512);
                    }
                } else if (!ek0Var2.u2 && ek0Var2.w1) {
                    ek0Var2.u2 = true;
                    org.telegram.messenger.ks.e().k(98, 512);
                }
                if (i7 != 0 && ek0Var2.M1 != null) {
                    uj0 uj0Var = ek0Var2.d1;
                    if (uj0Var != null) {
                        org.telegram.messenger.g0.r(uj0Var);
                        ek0Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ek0Var2.L1.I2(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ek0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = ek0Var2.M1;
                    ek0Var2.j1(view4, 0.0f, 0.0f, false);
                    ek0Var2.M1 = null;
                    ek0Var2.m1(view4, null);
                    ek0Var2.O1 = false;
                }
                v4.u0 u0Var = ek0Var2.Z0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i7);
                }
                boolean z10 = i7 == 1 || i7 == 2;
                ek0Var2.J1 = z10;
                if (z10) {
                    ek0Var2.K1 = true;
                    break;
                }
                break;
            case 17:
                sl0 sl0Var = (sl0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(sl0Var.G.getCurrentFocus());
                }
                sl0Var.a();
                break;
            case 22:
                q51 q51Var = (q51) obj;
                di.b1 b1Var2 = q51Var.o1;
                if (i7 == 0 && q51Var.B1 && org.telegram.messenger.g0.L(13.0f) + q51Var.y1 + q51Var.t0 < org.telegram.messenger.g0.m * 2 && b1Var2.canScrollVertically(1) && (mj0Var6 = (mj0) b1Var2.K(0)) != null) {
                    View view5 = mj0Var6.a;
                    if (view5.getTop() > 0) {
                        b1Var2.w0(0, view5.getTop(), null);
                        break;
                    }
                }
                break;
            case 24:
                if (i7 == 1 && (k9Var = ((org.telegram.ui.Wallet.o6) obj).j0) != null) {
                    k9Var.a();
                    break;
                }
                break;
            case 29:
                ((ri.q) obj).g++;
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        j30 j30Var;
        String str;
        TLRPC.User user;
        String str2;
        jj0 jj0Var;
        org.telegram.ui.Wallet.k6 k6Var;
        switch (this.a) {
            case 0:
                ((cu0) this.b).invalidate();
                break;
            case 1:
                dj djVar = (dj) this.b;
                djVar.b.N1(djVar, i10);
                break;
            case 2:
                gj gjVar = (gj) this.b;
                if (gjVar.n.getChildCount() > 0) {
                    gjVar.b.N1(gjVar, i10);
                    break;
                }
                break;
            case 3:
                uj ujVar = (uj) this.b;
                ujVar.b.N1(ujVar, i10);
                ujVar.T();
                break;
            case 4:
                kk kkVar = (kk) this.b;
                kg.d0 d0Var = kkVar.F;
                kkVar.b.N1(kkVar, i10);
                kkVar.Z();
                v4.i0 adapter = kkVar.r.getAdapter();
                jk jkVar = kkVar.E;
                if (adapter == jkVar) {
                    int L0 = d0Var.L0();
                    int N0 = d0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        jk jkVar2 = jkVar.Y.E;
                        if (!jkVar2.T && !jkVar2.W && (o0Var = jkVar.E) != null) {
                            jkVar.Z(jkVar.y, jkVar.F, jkVar.G, o0Var, jkVar.K, false);
                            break;
                        }
                    }
                }
                break;
            case 5:
                lk lkVar = (lk) this.b;
                lkVar.b.N1(lkVar, i10);
                lkVar.w.setTranslationY(Math.max(0, lkVar.getCurrentItemTop()));
                break;
            case 6:
                qn qnVar = (qn) this.b;
                kg.d0 d0Var2 = qnVar.x;
                qnVar.b.N1(qnVar, i10);
                hn hnVar = qnVar.y;
                if (hnVar != null && hnVar.s) {
                    xw0 delegate = hnVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.d61 d61Var = qnVar.s;
                        View F = d61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.f1 T = F == null ? null : d61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (hnVar.getDirection() == 0) {
                                hnVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                hnVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                hnVar.f();
                            }
                        } else {
                            hnVar.f();
                        }
                    } else {
                        hnVar.f();
                    }
                }
                if (i10 != 0 && (j30Var = qnVar.E) != null) {
                    j30Var.a();
                    break;
                }
                break;
            case 7:
                rn rnVar = (rn) this.b;
                rnVar.b.N1(rnVar, i10);
                break;
            case 8:
                kp kpVar = (kp) this.b;
                if (kpVar.x1.M0() + 10 >= kpVar.r1.b()) {
                    kpVar.R0();
                    break;
                }
                break;
            case 9:
                bv bvVar = (bv) this.b;
                tu tuVar = bvVar.q1;
                if (tuVar != null && bvVar.r1.J1 && tuVar.x) {
                    tuVar.x = false;
                    tuVar.invalidate();
                    break;
                }
                break;
            case 10:
                oz ozVar = (oz) this.b;
                ozVar.G.invalidate();
                ozVar.invalidate();
                break;
            case 11:
                pz.J0((pz) this.b);
                break;
            case 12:
                r90 r90Var = (r90) this.b;
                v4.p0 layoutManager = r90Var.getLayoutManager();
                s90 s90Var = r90Var.j3;
                l90 l90Var = s90Var.d;
                int N02 = layoutManager == l90Var ? l90Var.N0() : s90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.h1 h1Var = s90Var.f;
                    if (N02 > h1Var.N0 - 5 && h1Var.v0 == 0 && (str = h1Var.t0) != null && str.length() != 0 && (user = h1Var.x0) != null && (str2 = h1Var.s0) != null) {
                        h1Var.T(true, user, str2, h1Var.t0);
                    }
                }
                boolean z10 = !r90Var.canScrollVertically(-1);
                r90Var.canScrollVertically(1);
                s90Var.n(z10);
                s90Var.b();
                break;
            case 13:
                na0 na0Var = (na0) this.b;
                org.telegram.ui.w8 w8Var = na0Var.b;
                di.b1 b1Var = na0Var.f;
                for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                ha0 ha0Var = na0Var.e;
                if (ha0Var != null) {
                    ha0Var.w();
                    break;
                }
                break;
            case 14:
                ef0 ef0Var = (ef0) this.b;
                if (ef0Var.m1.getChildCount() > 0) {
                    ef0.J0(ef0Var);
                    break;
                }
                break;
            case 15:
                xi0 xi0Var = (xi0) this.b;
                di.b1 b1Var2 = xi0Var.b;
                int[] iArr = xi0Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    xi0.b(xi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    xi0.b(xi0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < b1Var2.getChildCount() - 1; i13++) {
                    xi0.b(xi0Var, b1Var2.getChildAt(i13), 1.0f);
                }
                xi0Var.invalidate();
                break;
            case 16:
                ek0 ek0Var = (ek0) this.b;
                Rect rect = ek0Var.F1;
                v4.u0 u0Var = ek0Var.Z0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i7, i10);
                }
                if (ek0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = ek0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    ek0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ek0Var.L0(false);
                if (i10 != 0 && (jj0Var = ek0Var.e1) != null) {
                    jj0Var.c();
                }
                nj0 nj0Var = ek0Var.T1;
                if (nj0Var != null) {
                    ek0Var.e1(nj0Var, 700, false);
                    break;
                }
                break;
            case 18:
                lt0.J0((lt0) this.b);
                break;
            case 19:
                st0 st0Var = (st0) this.b;
                if (recyclerView == st0Var.H) {
                    st0Var.S += i10;
                }
                if (st0Var.Q == null && st0Var.R == 0) {
                    st0Var.B();
                    break;
                }
                break;
            case 20:
                ((su0) this.b).T1.W();
                break;
            case 21:
                jw0.J0((jw0) this.b);
                break;
            case 22:
                ((q51) this.b).R0();
                break;
            case 23:
                ((j71) this.b).invalidate();
                break;
            case 24:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (k6Var = o6Var.t0) != null && k6Var.f) {
                    k6Var.d = true;
                }
                o6Var.Y0();
                break;
            case 25:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 26:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) this.b;
                if (oaVar.a.J1) {
                    org.telegram.messenger.g0.v1(oaVar.O);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) this.b;
                if (!mVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.w)) {
                        mVar.e.d();
                    } else {
                        org.telegram.ui.web.i iVar = mVar.f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (mVar.a.J1) {
                    org.telegram.messenger.g0.v1(mVar.fragmentView);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                if (x0Var.a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    break;
                }
                break;
            case 29:
                ((ri.q) this.b).h(i7, i10);
                break;
        }
    }
}
