package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class oa extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa(Object obj, int i7) {
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
        org.telegram.ui.Wallet.j9 j9Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 2:
                hj hjVar = (hj) obj;
                di.b1 b1Var = hjVar.n;
                ui uiVar = hjVar.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = uiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i11 = uiVar.t0;
                    if (((uiVar.Z3[0] - i11) - L2) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            b1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                mk mkVar = (mk) obj;
                ui uiVar2 = mkVar.b;
                ak akVar = mkVar.r;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    int i12 = uiVar2.t0;
                    if (((uiVar2.Z3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var2 = (mj0) akVar.K(0)) != null && (top = (mj0Var2.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        akVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && mkVar.c0 && akVar.getAdapter() == mkVar.E) {
                    org.telegram.messenger.g0.v1(uiVar2.getCurrentFocus());
                }
                mkVar.V = i7 != 0;
                break;
            case 5:
                nk nkVar = (nk) obj;
                ek0 ek0Var = nkVar.r;
                ui uiVar3 = nkVar.b;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = uiVar3.Y2;
                    int L5 = L4 + (q0Var2 != null ? org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f) : 0);
                    int i13 = uiVar3.t0;
                    if (((uiVar3.Z3[0] - i13) - L5) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var3 = (mj0) ek0Var.K(0)) != null) {
                        View view2 = mj0Var3.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ek0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                tn tnVar = (tn) obj;
                org.telegram.ui.f61 f61Var = tnVar.s;
                if (i7 == 0) {
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    ui uiVar4 = tnVar.b;
                    int i14 = uiVar4.t0;
                    if (((uiVar4.Z3[0] - i14) - L6) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var4 = (mj0) f61Var.K(1)) != null && (top2 = (mj0Var4.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
                    }
                    int i15 = tnVar.X0;
                    if (i15 >= 0) {
                        tn.P(tnVar, i15);
                        tnVar.X0 = -1;
                        break;
                    }
                }
                break;
            case 12:
                u90 u90Var = (u90) obj;
                u90Var.f3 = i7 != 0;
                u90Var.g3 = i7 == 1;
                break;
            case 14:
                ff0 ff0Var = (ff0) obj;
                ze0 ze0Var = ff0Var.m1;
                if (i7 == 0) {
                    int L7 = org.telegram.messenger.g0.L(13.0f);
                    int i16 = ff0Var.z1;
                    int i17 = ff0Var.t0;
                    if (((i16 - i17) - L7) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ze0Var.canScrollVertically(1) && (mj0Var5 = (mj0) ze0Var.K(0)) != null) {
                        View view3 = mj0Var5.a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ze0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
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
                        org.telegram.messenger.ls.e().k(99, 512);
                    }
                } else if (!ek0Var2.u2 && ek0Var2.w1) {
                    ek0Var2.u2 = true;
                    org.telegram.messenger.ls.e().k(98, 512);
                }
                if (i7 != 0 && ek0Var2.M1 != null) {
                    uj0 uj0Var = ek0Var2.d1;
                    if (uj0Var != null) {
                        org.telegram.messenger.g0.r(uj0Var);
                        ek0Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ek0Var2.L1.w0(obtain);
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
                r51 r51Var = (r51) obj;
                di.b1 b1Var2 = r51Var.o1;
                if (i7 == 0 && r51Var.B1 && org.telegram.messenger.g0.L(13.0f) + r51Var.y1 + r51Var.t0 < org.telegram.messenger.g0.m * 2 && b1Var2.canScrollVertically(1) && (mj0Var6 = (mj0) b1Var2.K(0)) != null) {
                    View view5 = mj0Var6.a;
                    if (view5.getTop() > 0) {
                        b1Var2.w0(0, view5.getTop(), null);
                        break;
                    }
                }
                break;
            case 24:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) obj).j0) != null) {
                    j9Var.a();
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
        m30 m30Var;
        String str;
        TLRPC.User user;
        String str2;
        jj0 jj0Var;
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.a) {
            case 0:
                ((du0) this.b).invalidate();
                break;
            case 1:
                ej ejVar = (ej) this.b;
                ejVar.b.N1(ejVar, i10);
                break;
            case 2:
                hj hjVar = (hj) this.b;
                if (hjVar.n.getChildCount() > 0) {
                    hjVar.b.N1(hjVar, i10);
                    break;
                }
                break;
            case 3:
                vj vjVar = (vj) this.b;
                vjVar.b.N1(vjVar, i10);
                vjVar.T();
                break;
            case 4:
                mk mkVar = (mk) this.b;
                kg.d0 d0Var = mkVar.F;
                mkVar.b.N1(mkVar, i10);
                mkVar.Z();
                v4.i0 adapter = mkVar.r.getAdapter();
                lk lkVar = mkVar.E;
                if (adapter == lkVar) {
                    int L0 = d0Var.L0();
                    int N0 = d0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        lk lkVar2 = lkVar.Y.E;
                        if (!lkVar2.T && !lkVar2.W && (o0Var = lkVar.E) != null) {
                            lkVar.Z(lkVar.y, lkVar.F, lkVar.G, o0Var, lkVar.K, false);
                            break;
                        }
                    }
                }
                break;
            case 5:
                nk nkVar = (nk) this.b;
                nkVar.b.N1(nkVar, i10);
                nkVar.w.setTranslationY(Math.max(0, nkVar.getCurrentItemTop()));
                break;
            case 6:
                tn tnVar = (tn) this.b;
                kg.d0 d0Var2 = tnVar.x;
                tnVar.b.N1(tnVar, i10);
                kn knVar = tnVar.y;
                if (knVar != null && knVar.s) {
                    yw0 delegate = knVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        org.telegram.ui.f61 f61Var = tnVar.s;
                        View F = f61Var.F((org.telegram.ui.Cells.b6) delegate);
                        v4.f1 T = F == null ? null : f61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (knVar.getDirection() == 0) {
                                knVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                knVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                knVar.f();
                            }
                        } else {
                            knVar.f();
                        }
                    } else {
                        knVar.f();
                    }
                }
                if (i10 != 0 && (m30Var = tnVar.E) != null) {
                    m30Var.a();
                    break;
                }
                break;
            case 7:
                un unVar = (un) this.b;
                unVar.b.N1(unVar, i10);
                break;
            case 8:
                np npVar = (np) this.b;
                if (npVar.x1.M0() + 10 >= npVar.r1.b()) {
                    npVar.R0();
                    break;
                }
                break;
            case 9:
                ev evVar = (ev) this.b;
                wu wuVar = evVar.q1;
                if (wuVar != null && evVar.r1.J1 && wuVar.x) {
                    wuVar.x = false;
                    wuVar.invalidate();
                    break;
                }
                break;
            case 10:
                rz rzVar = (rz) this.b;
                rzVar.G.invalidate();
                rzVar.invalidate();
                break;
            case 11:
                sz.J0((sz) this.b);
                break;
            case 12:
                u90 u90Var = (u90) this.b;
                v4.p0 layoutManager = u90Var.getLayoutManager();
                v90 v90Var = u90Var.j3;
                o90 o90Var = v90Var.d;
                int N02 = layoutManager == o90Var ? o90Var.N0() : v90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.h1 h1Var = v90Var.f;
                    if (N02 > h1Var.N0 - 5 && h1Var.v0 == 0 && (str = h1Var.t0) != null && str.length() != 0 && (user = h1Var.x0) != null && (str2 = h1Var.s0) != null) {
                        h1Var.T(true, user, str2, h1Var.t0);
                    }
                }
                boolean z10 = !u90Var.canScrollVertically(-1);
                u90Var.canScrollVertically(1);
                v90Var.n(z10);
                v90Var.b();
                break;
            case 13:
                qa0 qa0Var = (qa0) this.b;
                org.telegram.ui.w8 w8Var = qa0Var.b;
                di.b1 b1Var = qa0Var.f;
                for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                ka0 ka0Var = qa0Var.e;
                if (ka0Var != null) {
                    ka0Var.w();
                    break;
                }
                break;
            case 14:
                ff0 ff0Var = (ff0) this.b;
                if (ff0Var.m1.getChildCount() > 0) {
                    ff0.J0(ff0Var);
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
                mt0.J0((mt0) this.b);
                break;
            case 19:
                tt0 tt0Var = (tt0) this.b;
                if (recyclerView == tt0Var.H) {
                    tt0Var.S += i10;
                }
                if (tt0Var.Q == null && tt0Var.R == 0) {
                    tt0Var.B();
                    break;
                }
                break;
            case 20:
                ((tu0) this.b).T1.W();
                break;
            case 21:
                kw0.J0((kw0) this.b);
                break;
            case 22:
                ((r51) this.b).R0();
                break;
            case 23:
                ((i71) this.b).invalidate();
                break;
            case 24:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (j6Var = n6Var.t0) != null && j6Var.f) {
                    j6Var.d = true;
                }
                n6Var.Y0();
                break;
            case 25:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 26:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.b;
                if (naVar.a.J1) {
                    org.telegram.messenger.g0.v1(naVar.O);
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
