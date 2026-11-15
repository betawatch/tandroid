package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ri extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        cj0 cj0Var;
        cj0 cj0Var2;
        int top;
        cj0 cj0Var3;
        cj0 cj0Var4;
        int top2;
        cj0 cj0Var5;
        cj0 cj0Var6;
        org.telegram.ui.Wallet.u8 u8Var;
        int i10 = this.a;
        ug.j1 j1Var = null;
        Object obj = this.b;
        switch (i10) {
            case 1:
                yi yiVar = (yi) obj;
                di.c1 c1Var = yiVar.n;
                ki kiVar = yiVar.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = kiVar.Y2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i11 = kiVar.t0;
                    if (((kiVar.Z3[0] - i11) - L2) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var = (cj0) c1Var.K(0)) != null) {
                        View view = cj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            c1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                dk dkVar = (dk) obj;
                ki kiVar2 = dkVar.b;
                rj rjVar = dkVar.r;
                if (i7 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    int i12 = kiVar2.t0;
                    if (((kiVar2.Z3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var2 = (cj0) rjVar.K(0)) != null && (top = (cj0Var2.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        rjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && dkVar.c0 && rjVar.getAdapter() == dkVar.E) {
                    org.telegram.messenger.g0.v1(kiVar2.getCurrentFocus());
                }
                dkVar.V = i7 != 0;
                break;
            case 4:
                ek ekVar = (ek) obj;
                uj0 uj0Var = ekVar.r;
                ki kiVar3 = ekVar.b;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = kiVar3.Y2;
                    int L5 = L4 + (q0Var2 != null ? org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f) : 0);
                    int i13 = kiVar3.t0;
                    if (((kiVar3.Z3[0] - i13) - L5) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var3 = (cj0) uj0Var.K(0)) != null) {
                        View view2 = cj0Var3.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            uj0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 5:
                jn jnVar = (jn) obj;
                org.telegram.ui.b61 b61Var = jnVar.s;
                if (i7 == 0) {
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    ki kiVar4 = jnVar.b;
                    int i14 = kiVar4.t0;
                    if (((kiVar4.Z3[0] - i14) - L6) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (cj0Var4 = (cj0) b61Var.K(1)) != null && (top2 = (cj0Var4.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        b61Var.w0(0, top2, null);
                    }
                    int i15 = jnVar.X0;
                    if (i15 >= 0) {
                        jn.P(jnVar, i15);
                        jnVar.X0 = -1;
                        break;
                    }
                }
                break;
            case 11:
                h90 h90Var = (h90) obj;
                h90Var.f3 = i7 != 0;
                h90Var.g3 = i7 == 1;
                break;
            case 13:
                te0 te0Var = (te0) obj;
                ne0 ne0Var = te0Var.m1;
                if (i7 == 0) {
                    int L7 = org.telegram.messenger.g0.L(13.0f);
                    int i16 = te0Var.z1;
                    int i17 = te0Var.t0;
                    if (((i16 - i17) - L7) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ne0Var.canScrollVertically(1) && (cj0Var5 = (cj0) ne0Var.K(0)) != null) {
                        View view3 = cj0Var5.a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ne0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                uj0 uj0Var2 = (uj0) obj;
                if (i7 == 0) {
                    if (uj0Var2.u2) {
                        uj0Var2.u2 = false;
                        org.telegram.messenger.ns.e().k(99, 512);
                    }
                } else if (!uj0Var2.u2 && uj0Var2.w1) {
                    uj0Var2.u2 = true;
                    org.telegram.messenger.ns.e().k(98, 512);
                }
                if (i7 != 0 && uj0Var2.M1 != null) {
                    kj0 kj0Var = uj0Var2.d1;
                    if (kj0Var != null) {
                        org.telegram.messenger.g0.r(kj0Var);
                        uj0Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        uj0Var2.L1.B0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    uj0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = uj0Var2.M1;
                    uj0Var2.j1(view4, 0.0f, 0.0f, false);
                    uj0Var2.M1 = null;
                    uj0Var2.m1(view4, null);
                    uj0Var2.O1 = false;
                }
                v4.t0 t0Var = uj0Var2.Z0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i7);
                }
                boolean z10 = i7 == 1 || i7 == 2;
                uj0Var2.J1 = z10;
                if (z10) {
                    uj0Var2.K1 = true;
                    break;
                }
                break;
            case 16:
                il0 il0Var = (il0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(il0Var.G.getCurrentFocus());
                }
                il0Var.a();
                break;
            case 21:
                e51 e51Var = (e51) obj;
                di.c1 c1Var2 = e51Var.o1;
                if (i7 == 0 && e51Var.B1 && org.telegram.messenger.g0.L(13.0f) + e51Var.y1 + e51Var.t0 < org.telegram.messenger.g0.m * 2 && c1Var2.canScrollVertically(1) && (cj0Var6 = (cj0) c1Var2.K(0)) != null) {
                    View view5 = cj0Var6.a;
                    if (view5.getTop() > 0) {
                        c1Var2.w0(0, view5.getTop(), null);
                        break;
                    }
                }
                break;
            case 23:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.y5) obj).j0) != null) {
                    u8Var.a();
                    break;
                }
                break;
            case 28:
                ((ri.q) obj).g++;
                break;
            case 29:
                ug.t0 t0Var2 = (ug.t0) obj;
                if (i7 == 1) {
                    t0Var2.l3 = true;
                }
                if (i7 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        ug.j1 j1Var2 = (ug.j1) t0Var2.getChildAt(i18);
                        if (j1Var == null || j1Var2.a > j1Var.a) {
                            j1Var = j1Var2;
                        }
                    }
                    if (j1Var != null) {
                        t0Var2.z1(j1Var, true);
                        t0Var2.l3 = false;
                        t0Var2.w0(0, j1Var.getTop() - ((t0Var2.getMeasuredHeight() - j1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    t0Var2.A1();
                    break;
                } else {
                    org.telegram.messenger.g0.r(t0Var2.m3);
                    break;
                }
                break;
        }
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        b30 b30Var;
        String str;
        TLRPC.User user;
        String str2;
        zi0 zi0Var;
        org.telegram.ui.Wallet.u5 u5Var;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.b;
                viVar.b.M1(viVar, i10);
                break;
            case 1:
                yi yiVar = (yi) this.b;
                if (yiVar.n.getChildCount() > 0) {
                    yiVar.b.M1(yiVar, i10);
                    break;
                }
                break;
            case 2:
                mj mjVar = (mj) this.b;
                mjVar.b.M1(mjVar, i10);
                mjVar.T();
                break;
            case 3:
                dk dkVar = (dk) this.b;
                kg.c0 c0Var = dkVar.F;
                dkVar.b.M1(dkVar, i10);
                dkVar.Z();
                v4.h0 adapter = dkVar.r.getAdapter();
                ck ckVar = dkVar.E;
                if (adapter == ckVar) {
                    int L0 = c0Var.L0();
                    int N0 = c0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        ck ckVar2 = ckVar.Y.E;
                        if (!ckVar2.T && !ckVar2.W && (o0Var = ckVar.E) != null) {
                            ckVar.Z(ckVar.y, ckVar.F, ckVar.G, o0Var, ckVar.K, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ek ekVar = (ek) this.b;
                ekVar.b.M1(ekVar, i10);
                ekVar.w.setTranslationY(Math.max(0, ekVar.getCurrentItemTop()));
                break;
            case 5:
                jn jnVar = (jn) this.b;
                kg.c0 c0Var2 = jnVar.x;
                jnVar.b.M1(jnVar, i10);
                an anVar = jnVar.y;
                if (anVar != null && anVar.s) {
                    pw0 delegate = anVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        org.telegram.ui.b61 b61Var = jnVar.s;
                        View F = b61Var.F((org.telegram.ui.Cells.z5) delegate);
                        v4.e1 T = F == null ? null : b61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (anVar.getDirection() == 0) {
                                anVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                anVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                anVar.f();
                            }
                        } else {
                            anVar.f();
                        }
                    } else {
                        anVar.f();
                    }
                }
                if (i10 != 0 && (b30Var = jnVar.E) != null) {
                    b30Var.a();
                    break;
                }
                break;
            case 6:
                kn knVar = (kn) this.b;
                knVar.b.M1(knVar, i10);
                break;
            case 7:
                ep epVar = (ep) this.b;
                if (epVar.x1.M0() + 10 >= epVar.r1.b()) {
                    epVar.Q0();
                    break;
                }
                break;
            case 8:
                wu wuVar = (wu) this.b;
                ou ouVar = wuVar.q1;
                if (ouVar != null && wuVar.r1.J1 && ouVar.x) {
                    ouVar.x = false;
                    ouVar.invalidate();
                    break;
                }
                break;
            case 9:
                iz izVar = (iz) this.b;
                izVar.G.invalidate();
                izVar.invalidate();
                break;
            case 10:
                jz.I0((jz) this.b);
                break;
            case 11:
                h90 h90Var = (h90) this.b;
                v4.o0 layoutManager = h90Var.getLayoutManager();
                i90 i90Var = h90Var.j3;
                b90 b90Var = i90Var.d;
                int N02 = layoutManager == b90Var ? b90Var.N0() : i90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.h1 h1Var = i90Var.f;
                    if (N02 > h1Var.N0 - 5 && h1Var.v0 == 0 && (str = h1Var.t0) != null && str.length() != 0 && (user = h1Var.x0) != null && (str2 = h1Var.s0) != null) {
                        h1Var.T(true, user, str2, h1Var.t0);
                    }
                }
                boolean z10 = !h90Var.canScrollVertically(-1);
                h90Var.canScrollVertically(1);
                i90Var.n(z10);
                i90Var.b();
                break;
            case 12:
                da0 da0Var = (da0) this.b;
                org.telegram.ui.v8 v8Var = da0Var.b;
                di.c1 c1Var = da0Var.f;
                for (int i11 = 0; i11 < c1Var.getChildCount(); i11++) {
                    View childAt = c1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                x90 x90Var = da0Var.e;
                if (x90Var != null) {
                    x90Var.w();
                    break;
                }
                break;
            case 13:
                te0 te0Var = (te0) this.b;
                if (te0Var.m1.getChildCount() > 0) {
                    te0.I0(te0Var);
                    break;
                }
                break;
            case 14:
                mi0 mi0Var = (mi0) this.b;
                di.c1 c1Var2 = mi0Var.b;
                int[] iArr = mi0Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    mi0.b(mi0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    mi0.b(mi0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < c1Var2.getChildCount() - 1; i13++) {
                    mi0.b(mi0Var, c1Var2.getChildAt(i13), 1.0f);
                }
                mi0Var.invalidate();
                break;
            case 15:
                uj0 uj0Var = (uj0) this.b;
                Rect rect = uj0Var.F1;
                v4.t0 t0Var = uj0Var.Z0;
                if (t0Var != null) {
                    t0Var.b(recyclerView, i7, i10);
                }
                if (uj0Var.D1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = uj0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    uj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                uj0Var.L0(false);
                if (i10 != 0 && (zi0Var = uj0Var.e1) != null) {
                    zi0Var.c();
                }
                dj0 dj0Var = uj0Var.T1;
                if (dj0Var != null) {
                    uj0Var.e1(dj0Var, 700, false);
                    break;
                }
                break;
            case 17:
                bt0.I0((bt0) this.b);
                break;
            case 18:
                it0 it0Var = (it0) this.b;
                if (recyclerView == it0Var.H) {
                    it0Var.S += i10;
                }
                if (it0Var.Q == null && it0Var.R == 0) {
                    it0Var.B();
                    break;
                }
                break;
            case 19:
                ((iu0) this.b).T1.W();
                break;
            case 20:
                bw0.I0((bw0) this.b);
                break;
            case 21:
                ((e51) this.b).Q0();
                break;
            case 22:
                ((v61) this.b).invalidate();
                break;
            case 23:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (u5Var = y5Var.r0) != null && u5Var.f) {
                    u5Var.d = true;
                }
                y5Var.U0();
                break;
            case 24:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 25:
                org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) this.b;
                if (z9Var.a.J1) {
                    org.telegram.messenger.g0.v1(z9Var.O);
                    break;
                }
                break;
            case 26:
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
            case 27:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                if (x0Var.a.J1) {
                    org.telegram.messenger.g0.v1(x0Var.fragmentView);
                    break;
                }
                break;
            case 28:
                ((ri.q) this.b).h(i7, i10);
                break;
            case 29:
                ug.t0 t0Var2 = (ug.t0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var2.z1(null, true);
                }
                t0Var2.invalidate();
                break;
        }
    }
}
