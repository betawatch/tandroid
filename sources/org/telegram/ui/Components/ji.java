package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ji extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ji(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        bj0 bj0Var;
        bj0 bj0Var2;
        int top;
        bj0 bj0Var3;
        bj0 bj0Var4;
        int top2;
        bj0 bj0Var5;
        bj0 bj0Var6;
        org.telegram.ui.Wallet.s8 s8Var;
        int i10 = this.a;
        vg.l1 l1Var = null;
        Object obj = this.b;
        switch (i10) {
            case 1:
                qi qiVar = (qi) obj;
                ci.j1 j1Var = qiVar.n;
                bi biVar = qiVar.b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var = biVar.V2;
                    int L2 = L + (q0Var != null ? org.telegram.messenger.g0.L(q0Var.getAlpha() * 26.0f) : 0);
                    int i11 = biVar.t0;
                    if (((biVar.W3[0] - i11) - L2) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var = (bj0) j1Var.K(0)) != null) {
                        View view = bj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            j1Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                uj ujVar = (uj) obj;
                bi biVar2 = ujVar.b;
                jj jjVar = ujVar.r;
                if (i3 == 0) {
                    int L3 = org.telegram.messenger.g0.L(13.0f);
                    int i12 = biVar2.t0;
                    if (((biVar2.W3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var2 = (bj0) jjVar.K(0)) != null && (top = (bj0Var2.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        jjVar.w0(0, top, null);
                    }
                }
                if (i3 == 1 && ujVar.c0 && jjVar.getAdapter() == ujVar.E) {
                    org.telegram.messenger.g0.v1(biVar2.getCurrentFocus());
                }
                ujVar.V = i3 != 0;
                break;
            case 4:
                vj vjVar = (vj) obj;
                tj0 tj0Var = vjVar.r;
                bi biVar3 = vjVar.b;
                if (i3 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.q0 q0Var2 = biVar3.V2;
                    int L5 = L4 + (q0Var2 != null ? org.telegram.messenger.g0.L(q0Var2.getAlpha() * 26.0f) : 0);
                    int i13 = biVar3.t0;
                    if (((biVar3.W3[0] - i13) - L5) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var3 = (bj0) tj0Var.K(0)) != null) {
                        View view2 = bj0Var3.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            tj0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 5:
                an anVar = (an) obj;
                org.telegram.ui.u51 u51Var = anVar.s;
                if (i3 == 0) {
                    int L6 = org.telegram.messenger.g0.L(13.0f);
                    bi biVar4 = anVar.b;
                    int i14 = biVar4.t0;
                    if (((biVar4.W3[0] - i14) - L6) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (bj0Var4 = (bj0) u51Var.K(1)) != null && (top2 = (bj0Var4.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        u51Var.w0(0, top2, null);
                    }
                    int i15 = anVar.X0;
                    if (i15 >= 0) {
                        an.O(anVar, i15);
                        anVar.X0 = -1;
                        break;
                    }
                }
                break;
            case 11:
                b90 b90Var = (b90) obj;
                b90Var.f3 = i3 != 0;
                b90Var.g3 = i3 == 1;
                break;
            case 13:
                se0 se0Var = (se0) obj;
                me0 me0Var = se0Var.j1;
                if (i3 == 0) {
                    int L7 = org.telegram.messenger.g0.L(13.0f);
                    int i16 = se0Var.w1;
                    int i17 = se0Var.t0;
                    if (((i16 - i17) - L7) + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && me0Var.canScrollVertically(1) && (bj0Var5 = (bj0) me0Var.K(0)) != null) {
                        View view3 = bj0Var5.a;
                        if (view3.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            me0Var.w0(0, view3.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                tj0 tj0Var2 = (tj0) obj;
                if (i3 == 0) {
                    if (tj0Var2.u2) {
                        tj0Var2.u2 = false;
                        org.telegram.messenger.hs.e().k(99, 512);
                    }
                } else if (!tj0Var2.u2 && tj0Var2.w1) {
                    tj0Var2.u2 = true;
                    org.telegram.messenger.hs.e().k(98, 512);
                }
                if (i3 != 0 && tj0Var2.M1 != null) {
                    jj0 jj0Var = tj0Var2.d1;
                    if (jj0Var != null) {
                        org.telegram.messenger.g0.r(jj0Var);
                        tj0Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tj0Var2.L1.y(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    tj0Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view4 = tj0Var2.M1;
                    tj0Var2.j1(view4, 0.0f, 0.0f, false);
                    tj0Var2.M1 = null;
                    tj0Var2.m1(view4, null);
                    tj0Var2.O1 = false;
                }
                u4.t0 t0Var = tj0Var2.Z0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i3);
                }
                boolean z10 = i3 == 1 || i3 == 2;
                tj0Var2.J1 = z10;
                if (z10) {
                    tj0Var2.K1 = true;
                    break;
                }
                break;
            case 16:
                hl0 hl0Var = (hl0) obj;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(hl0Var.G.getCurrentFocus());
                }
                hl0Var.a();
                break;
            case 21:
                v41 v41Var = (v41) obj;
                ci.j1 j1Var2 = v41Var.l1;
                if (i3 == 0 && v41Var.y1 && org.telegram.messenger.g0.L(13.0f) + v41Var.v1 + v41Var.t0 < org.telegram.messenger.g0.m * 2 && j1Var2.canScrollVertically(1) && (bj0Var6 = (bj0) j1Var2.K(0)) != null) {
                    View view5 = bj0Var6.a;
                    if (view5.getTop() > 0) {
                        j1Var2.w0(0, view5.getTop(), null);
                        break;
                    }
                }
                break;
            case 23:
                if (i3 == 1 && (s8Var = ((org.telegram.ui.Wallet.w5) obj).j0) != null) {
                    s8Var.a();
                    break;
                }
                break;
            case 28:
                ((pi.q) obj).g++;
                break;
            case 29:
                vg.r0 r0Var = (vg.r0) obj;
                if (i3 == 1) {
                    r0Var.l3 = true;
                }
                if (i3 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        vg.l1 l1Var2 = (vg.l1) r0Var.getChildAt(i18);
                        if (l1Var == null || l1Var2.a > l1Var.a) {
                            l1Var = l1Var2;
                        }
                    }
                    if (l1Var != null) {
                        r0Var.z1(l1Var, true);
                        r0Var.l3 = false;
                        r0Var.w0(0, l1Var.getTop() - ((r0Var.getMeasuredHeight() - l1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    r0Var.A1();
                    break;
                } else {
                    org.telegram.messenger.g0.r(r0Var.m3);
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        kg.l0 l0Var;
        u20 u20Var;
        String str;
        TLRPC.User user;
        String str2;
        yi0 yi0Var;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.a) {
            case 0:
                ni niVar = (ni) this.b;
                niVar.b.M1(niVar, i10);
                break;
            case 1:
                qi qiVar = (qi) this.b;
                if (qiVar.n.getChildCount() > 0) {
                    qiVar.b.M1(qiVar, i10);
                    break;
                }
                break;
            case 2:
                ej ejVar = (ej) this.b;
                ejVar.b.M1(ejVar, i10);
                ejVar.S();
                break;
            case 3:
                uj ujVar = (uj) this.b;
                lg.d0 d0Var = ujVar.F;
                ujVar.b.M1(ujVar, i10);
                ujVar.Z();
                u4.h0 adapter = ujVar.r.getAdapter();
                tj tjVar = ujVar.E;
                if (adapter == tjVar) {
                    int L0 = d0Var.L0();
                    int N0 = d0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        tj tjVar2 = tjVar.Y.E;
                        if (!tjVar2.T && !tjVar2.W && (l0Var = tjVar.E) != null) {
                            tjVar.Z(tjVar.y, tjVar.F, tjVar.G, l0Var, tjVar.K, false);
                            break;
                        }
                    }
                }
                break;
            case 4:
                vj vjVar = (vj) this.b;
                vjVar.b.M1(vjVar, i10);
                vjVar.w.setTranslationY(Math.max(0, vjVar.getCurrentItemTop()));
                break;
            case 5:
                an anVar = (an) this.b;
                lg.d0 d0Var2 = anVar.x;
                anVar.b.M1(anVar, i10);
                rm rmVar = anVar.y;
                if (rmVar != null && rmVar.s) {
                    mw0 delegate = rmVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        org.telegram.ui.u51 u51Var = anVar.s;
                        View F = u51Var.F((org.telegram.ui.Cells.z5) delegate);
                        u4.d1 T = F == null ? null : u51Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (rmVar.getDirection() == 0) {
                                rmVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rmVar.setTranslationY(view.getY());
                            }
                            if (b11 < d0Var2.L0() || b11 > d0Var2.N0()) {
                                rmVar.f();
                            }
                        } else {
                            rmVar.f();
                        }
                    } else {
                        rmVar.f();
                    }
                }
                if (i10 != 0 && (u20Var = anVar.E) != null) {
                    u20Var.a();
                    break;
                }
                break;
            case 6:
                bn bnVar = (bn) this.b;
                bnVar.b.M1(bnVar, i10);
                break;
            case 7:
                vo voVar = (vo) this.b;
                if (voVar.u1.M0() + 10 >= voVar.o1.b()) {
                    voVar.Q0();
                    break;
                }
                break;
            case 8:
                pu puVar = (pu) this.b;
                hu huVar = puVar.n1;
                if (huVar != null && puVar.o1.J1 && huVar.x) {
                    huVar.x = false;
                    huVar.invalidate();
                    break;
                }
                break;
            case 9:
                bz bzVar = (bz) this.b;
                bzVar.G.invalidate();
                bzVar.invalidate();
                break;
            case 10:
                cz.I0((cz) this.b);
                break;
            case 11:
                b90 b90Var = (b90) this.b;
                u4.o0 layoutManager = b90Var.getLayoutManager();
                c90 c90Var = b90Var.j3;
                v80 v80Var = c90Var.d;
                int N02 = layoutManager == v80Var ? v80Var.N0() : c90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    kg.e1 e1Var = c90Var.f;
                    if (N02 > e1Var.N0 - 5 && e1Var.v0 == 0 && (str = e1Var.t0) != null && str.length() != 0 && (user = e1Var.x0) != null && (str2 = e1Var.s0) != null) {
                        e1Var.T(true, user, str2, e1Var.t0);
                    }
                }
                boolean z10 = !b90Var.canScrollVertically(-1);
                b90Var.canScrollVertically(1);
                c90Var.n(z10);
                c90Var.b();
                break;
            case 12:
                x90 x90Var = (x90) this.b;
                ai.h5 h5Var = x90Var.b;
                ci.j1 j1Var = x90Var.f;
                for (int i11 = 0; i11 < j1Var.getChildCount(); i11++) {
                    View childAt = j1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).w3(h5Var.getMeasuredWidth(), h5Var.getBackgroundSizeY());
                    }
                }
                r90 r90Var = x90Var.e;
                if (r90Var != null) {
                    r90Var.w();
                    break;
                }
                break;
            case 13:
                se0 se0Var = (se0) this.b;
                if (se0Var.j1.getChildCount() > 0) {
                    se0.I0(se0Var);
                    break;
                }
                break;
            case 14:
                li0 li0Var = (li0) this.b;
                ci.j1 j1Var2 = li0Var.b;
                int[] iArr = li0Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    li0.b(li0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    li0.b(li0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < j1Var2.getChildCount() - 1; i13++) {
                    li0.b(li0Var, j1Var2.getChildAt(i13), 1.0f);
                }
                li0Var.invalidate();
                break;
            case 15:
                tj0 tj0Var = (tj0) this.b;
                Rect rect = tj0Var.F1;
                u4.t0 t0Var = tj0Var.Z0;
                if (t0Var != null) {
                    t0Var.b(recyclerView, i3, i10);
                }
                if (tj0Var.D1 != -1) {
                    rect.offset(-i3, -i10);
                    org.telegram.ui.Cells.y yVar = tj0Var.C1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    tj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tj0Var.L0(false);
                if (i10 != 0 && (yi0Var = tj0Var.e1) != null) {
                    yi0Var.c();
                }
                cj0 cj0Var = tj0Var.T1;
                if (cj0Var != null) {
                    tj0Var.e1(cj0Var, 700, false);
                    break;
                }
                break;
            case 17:
                zs0.I0((zs0) this.b);
                break;
            case 18:
                gt0 gt0Var = (gt0) this.b;
                if (recyclerView == gt0Var.H) {
                    gt0Var.S += i10;
                }
                if (gt0Var.Q == null && gt0Var.R == 0) {
                    gt0Var.B();
                    break;
                }
                break;
            case 19:
                ((gu0) this.b).Q1.W();
                break;
            case 20:
                xv0.I0((xv0) this.b);
                break;
            case 21:
                ((v41) this.b).Q0();
                break;
            case 22:
                ((m61) this.b).invalidate();
                break;
            case 23:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (s5Var = w5Var.r0) != null && s5Var.f) {
                    s5Var.d = true;
                }
                w5Var.T0();
                break;
            case 24:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 25:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) this.b;
                if (w9Var.a.J1) {
                    org.telegram.messenger.g0.v1(w9Var.O);
                    break;
                }
                break;
            case 26:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) this.b;
                if (!nVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(nVar.w)) {
                        nVar.e.d();
                    } else {
                        org.telegram.ui.web.j jVar = nVar.f;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (nVar.a.J1) {
                    org.telegram.messenger.g0.v1(nVar.fragmentView);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
                if (y0Var.a.J1) {
                    org.telegram.messenger.g0.v1(y0Var.fragmentView);
                    break;
                }
                break;
            case 28:
                ((pi.q) this.b).h(i3, i10);
                break;
            case 29:
                vg.r0 r0Var = (vg.r0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    r0Var.z1(null, true);
                }
                r0Var.invalidate();
                break;
        }
    }
}
