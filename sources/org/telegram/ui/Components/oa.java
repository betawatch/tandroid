package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        kj0 kj0Var;
        kj0 kj0Var2;
        int top;
        kj0 kj0Var3;
        kj0 kj0Var4;
        int top2;
        kj0 kj0Var5;
        kj0 kj0Var6;
        org.telegram.ui.Wallet.j9 j9Var;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 2:
                fj fjVar = (fj) obj;
                di.b1 b1Var = fjVar.n;
                si siVar = fjVar.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.Y2;
                    int L2 = L + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i11 = siVar.t0;
                    if (((siVar.Z3[0] - i11) - L2) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) b1Var.K(0)) != null) {
                        View view = kj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            b1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                kk kkVar = (kk) obj;
                si siVar2 = kkVar.b;
                yj yjVar = kkVar.r;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    int i12 = siVar2.t0;
                    if (((siVar2.Z3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var2 = (kj0) yjVar.K(0)) != null && (top = (kj0Var2.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        yjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && kkVar.c0 && yjVar.getAdapter() == kkVar.E) {
                    org.telegram.messenger.g0.v1(siVar2.getCurrentFocus());
                }
                kkVar.V = i7 != 0;
                break;
            case 5:
                lk lkVar = (lk) obj;
                ck0 ck0Var = lkVar.r;
                si siVar3 = lkVar.b;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var2 = siVar3.Y2;
                    int L5 = L4 + (r0Var2 != null ? org.telegram.messenger.g0.L(r0Var2.getAlpha() * 26.0f) : 0);
                    int i13 = siVar3.t0;
                    if (((siVar3.Z3[0] - i13) - L5) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var3 = (kj0) ck0Var.K(0)) != null) {
                        View view2 = kj0Var3.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ck0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                rn rnVar = (rn) obj;
                org.telegram.ui.f61 f61Var = rnVar.s;
                if (i7 == 0) {
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    si siVar4 = rnVar.b;
                    int i14 = siVar4.t0;
                    if (((siVar4.Z3[0] - i14) - L6) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var4 = (kj0) f61Var.K(1)) != null && (top2 = (kj0Var4.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
                    }
                    int i15 = rnVar.X0;
                    if (i15 >= 0) {
                        rn.P(rnVar, i15);
                        rnVar.X0 = -1;
                        break;
                    }
                }
                break;
            case 12:
                s90 s90Var = (s90) obj;
                s90Var.f3 = i7 != 0;
                s90Var.g3 = i7 == 1;
                break;
            case 14:
                df0 df0Var = (df0) obj;
                xe0 xe0Var = df0Var.m1;
                if (i7 == 0) {
                    int L7 = org.telegram.messenger.g0.L(13.0f);
                    int i16 = df0Var.z1;
                    int i17 = df0Var.t0;
                    if (((i16 - i17) - L7) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && xe0Var.canScrollVertically(1) && (kj0Var5 = (kj0) xe0Var.K(0)) != null) {
                        View view3 = kj0Var5.a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            xe0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 16:
                ck0 ck0Var2 = (ck0) obj;
                if (i7 == 0) {
                    if (ck0Var2.u2) {
                        ck0Var2.u2 = false;
                        org.telegram.messenger.ks.e().k(99, 512);
                    }
                } else if (!ck0Var2.u2 && ck0Var2.w1) {
                    ck0Var2.u2 = true;
                    org.telegram.messenger.ks.e().k(98, 512);
                }
                if (i7 != 0 && ck0Var2.M1 != null) {
                    sj0 sj0Var = ck0Var2.d1;
                    if (sj0Var != null) {
                        org.telegram.messenger.g0.r(sj0Var);
                        ck0Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ck0Var2.L1.w0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    ck0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = ck0Var2.M1;
                    ck0Var2.j1(view4, 0.0f, 0.0f, false);
                    ck0Var2.M1 = null;
                    ck0Var2.m1(view4, null);
                    ck0Var2.O1 = false;
                }
                v4.u0 u0Var = ck0Var2.Z0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i7);
                }
                boolean z10 = i7 == 1 || i7 == 2;
                ck0Var2.J1 = z10;
                if (z10) {
                    ck0Var2.K1 = true;
                    break;
                }
                break;
            case 17:
                ql0 ql0Var = (ql0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(ql0Var.G.getCurrentFocus());
                }
                ql0Var.a();
                break;
            case 22:
                o51 o51Var = (o51) obj;
                di.b1 b1Var2 = o51Var.o1;
                if (i7 == 0 && o51Var.B1 && org.telegram.messenger.g0.L(13.0f) + o51Var.y1 + o51Var.t0 < org.telegram.messenger.g0.m * 2 && b1Var2.canScrollVertically(1) && (kj0Var6 = (kj0) b1Var2.K(0)) != null) {
                    View view5 = kj0Var6.a;
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
        j30 j30Var;
        String str;
        TLRPC.User user;
        String str2;
        hj0 hj0Var;
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.a) {
            case 0:
                ((au0) this.b).invalidate();
                break;
            case 1:
                cj cjVar = (cj) this.b;
                cjVar.b.N1(cjVar, i10);
                break;
            case 2:
                fj fjVar = (fj) this.b;
                if (fjVar.n.getChildCount() > 0) {
                    fjVar.b.N1(fjVar, i10);
                    break;
                }
                break;
            case 3:
                tj tjVar = (tj) this.b;
                tjVar.b.N1(tjVar, i10);
                tjVar.T();
                break;
            case 4:
                kk kkVar = (kk) this.b;
                kg.c0 c0Var = kkVar.F;
                kkVar.b.N1(kkVar, i10);
                kkVar.Z();
                v4.i0 adapter = kkVar.r.getAdapter();
                jk jkVar = kkVar.E;
                if (adapter == jkVar) {
                    int L0 = c0Var.L0();
                    int N0 = c0Var.N0();
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
                rn rnVar = (rn) this.b;
                kg.c0 c0Var2 = rnVar.x;
                rnVar.b.N1(rnVar, i10);
                in inVar = rnVar.y;
                if (inVar != null && inVar.s) {
                    ww0 delegate = inVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.b6) {
                        org.telegram.ui.f61 f61Var = rnVar.s;
                        View F = f61Var.F((org.telegram.ui.Cells.b6) delegate);
                        v4.f1 T = F == null ? null : f61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (inVar.getDirection() == 0) {
                                inVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                inVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                inVar.f();
                            }
                        } else {
                            inVar.f();
                        }
                    } else {
                        inVar.f();
                    }
                }
                if (i10 != 0 && (j30Var = rnVar.E) != null) {
                    j30Var.a();
                    break;
                }
                break;
            case 7:
                sn snVar = (sn) this.b;
                snVar.b.N1(snVar, i10);
                break;
            case 8:
                lp lpVar = (lp) this.b;
                if (lpVar.x1.M0() + 10 >= lpVar.r1.b()) {
                    lpVar.R0();
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
                pz pzVar = (pz) this.b;
                pzVar.G.invalidate();
                pzVar.invalidate();
                break;
            case 11:
                qz.J0((qz) this.b);
                break;
            case 12:
                s90 s90Var = (s90) this.b;
                v4.p0 layoutManager = s90Var.getLayoutManager();
                t90 t90Var = s90Var.j3;
                m90 m90Var = t90Var.d;
                int N02 = layoutManager == m90Var ? m90Var.N0() : t90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.h1 h1Var = t90Var.f;
                    if (N02 > h1Var.N0 - 5 && h1Var.v0 == 0 && (str = h1Var.t0) != null && str.length() != 0 && (user = h1Var.x0) != null && (str2 = h1Var.s0) != null) {
                        h1Var.T(true, user, str2, h1Var.t0);
                    }
                }
                boolean z10 = !s90Var.canScrollVertically(-1);
                s90Var.canScrollVertically(1);
                t90Var.n(z10);
                t90Var.b();
                break;
            case 13:
                oa0 oa0Var = (oa0) this.b;
                org.telegram.ui.v8 v8Var = oa0Var.b;
                di.b1 b1Var = oa0Var.f;
                for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) childAt).A3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                ia0 ia0Var = oa0Var.e;
                if (ia0Var != null) {
                    ia0Var.w();
                    break;
                }
                break;
            case 14:
                df0 df0Var = (df0) this.b;
                if (df0Var.m1.getChildCount() > 0) {
                    df0.J0(df0Var);
                    break;
                }
                break;
            case 15:
                vi0 vi0Var = (vi0) this.b;
                di.b1 b1Var2 = vi0Var.b;
                int[] iArr = vi0Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    vi0.b(vi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    vi0.b(vi0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < b1Var2.getChildCount() - 1; i13++) {
                    vi0.b(vi0Var, b1Var2.getChildAt(i13), 1.0f);
                }
                vi0Var.invalidate();
                break;
            case 16:
                ck0 ck0Var = (ck0) this.b;
                Rect rect = ck0Var.F1;
                v4.u0 u0Var = ck0Var.Z0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i7, i10);
                }
                if (ck0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = ck0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    ck0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ck0Var.L0(false);
                if (i10 != 0 && (hj0Var = ck0Var.e1) != null) {
                    hj0Var.c();
                }
                lj0 lj0Var = ck0Var.T1;
                if (lj0Var != null) {
                    ck0Var.e1(lj0Var, 700, false);
                    break;
                }
                break;
            case 18:
                jt0.J0((jt0) this.b);
                break;
            case 19:
                qt0 qt0Var = (qt0) this.b;
                if (recyclerView == qt0Var.H) {
                    qt0Var.S += i10;
                }
                if (qt0Var.Q == null && qt0Var.R == 0) {
                    qt0Var.B();
                    break;
                }
                break;
            case 20:
                ((qu0) this.b).T1.W();
                break;
            case 21:
                iw0.J0((iw0) this.b);
                break;
            case 22:
                ((o51) this.b).R0();
                break;
            case 23:
                ((f71) this.b).invalidate();
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
