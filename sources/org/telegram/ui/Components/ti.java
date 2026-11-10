package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ti extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        int top;
        xi0 xi0Var2;
        xi0 xi0Var3;
        int top2;
        xi0 xi0Var4;
        xi0 xi0Var5;
        org.telegram.ui.Wallet.u8 u8Var;
        int i10 = this.a;
        ug.i1 i1Var = null;
        Object obj = this.b;
        switch (i10) {
            case 1:
                uj ujVar = (uj) obj;
                ci ciVar = ujVar.b;
                jj jjVar = ujVar.r;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i11 = ciVar.s0;
                    if (((ciVar.Y3[0] - i11) - L) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var = (xi0) jjVar.K(0)) != null && (top = (xi0Var.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        jjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && ujVar.b0 && jjVar.getAdapter() == ujVar.D) {
                    org.telegram.messenger.g0.v1(ciVar.getCurrentFocus());
                }
                ujVar.U = i7 != 0;
                break;
            case 2:
                vj vjVar = (vj) obj;
                pj0 pj0Var = vjVar.r;
                ci ciVar2 = vjVar.b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar2.X2;
                    int L3 = L2 + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i12 = ciVar2.s0;
                    if (((ciVar2.Y3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var2 = (xi0) pj0Var.K(0)) != null) {
                        View view = xi0Var2.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            pj0Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                an anVar = (an) obj;
                org.telegram.ui.g61 g61Var = anVar.s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    ci ciVar3 = anVar.b;
                    int i13 = ciVar3.s0;
                    if (((ciVar3.Y3[0] - i13) - L4) + i13 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var3 = (xi0) g61Var.K(1)) != null && (top2 = (xi0Var3.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        g61Var.w0(0, top2, null);
                    }
                    int i14 = anVar.W0;
                    if (i14 >= 0) {
                        an.O(anVar, i14);
                        anVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 9:
                f90 f90Var = (f90) obj;
                f90Var.e3 = i7 != 0;
                f90Var.f3 = i7 == 1;
                break;
            case 11:
                qe0 qe0Var = (qe0) obj;
                ke0 ke0Var = qe0Var.l1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = qe0Var.y1;
                    int i16 = qe0Var.s0;
                    if (((i15 - i16) - L5) + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && ke0Var.canScrollVertically(1) && (xi0Var4 = (xi0) ke0Var.K(0)) != null) {
                        View view2 = xi0Var4.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            ke0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                pj0 pj0Var2 = (pj0) obj;
                if (i7 == 0) {
                    if (pj0Var2.t2) {
                        pj0Var2.t2 = false;
                        org.telegram.messenger.qs.e().k(99, 512);
                    }
                } else if (!pj0Var2.t2 && pj0Var2.v1) {
                    pj0Var2.t2 = true;
                    org.telegram.messenger.qs.e().k(98, 512);
                }
                if (i7 != 0 && pj0Var2.L1 != null) {
                    fj0 fj0Var = pj0Var2.c1;
                    if (fj0Var != null) {
                        org.telegram.messenger.g0.r(fj0Var);
                        pj0Var2.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        pj0Var2.K1.n0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    pj0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = pj0Var2.L1;
                    pj0Var2.j1(view3, 0.0f, 0.0f, false);
                    pj0Var2.L1 = null;
                    pj0Var2.m1(view3, null);
                    pj0Var2.N1 = false;
                }
                v4.s0 s0Var = pj0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i7);
                }
                boolean z9 = i7 == 1 || i7 == 2;
                pj0Var2.I1 = z9;
                if (z9) {
                    pj0Var2.J1 = true;
                    break;
                }
                break;
            case 14:
                dl0 dl0Var = (dl0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(dl0Var.F.getCurrentFocus());
                }
                dl0Var.a();
                break;
            case 19:
                c51 c51Var = (c51) obj;
                bi.q1 q1Var = c51Var.n1;
                if (i7 == 0 && c51Var.A1 && org.telegram.messenger.g0.L(13.0f) + c51Var.x1 + c51Var.s0 < org.telegram.messenger.g0.m * 2 && q1Var.canScrollVertically(1) && (xi0Var5 = (xi0) q1Var.K(0)) != null) {
                    View view4 = xi0Var5.a;
                    if (view4.getTop() > 0) {
                        q1Var.w0(0, view4.getTop(), null);
                        break;
                    }
                }
                break;
            case 21:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.z5) obj).i0) != null) {
                    u8Var.a();
                    break;
                }
                break;
            case 26:
                ug.s0 s0Var2 = (ug.s0) obj;
                if (i7 == 1) {
                    s0Var2.k3 = true;
                }
                if (i7 == 0) {
                    for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
                        ug.i1 i1Var2 = (ug.i1) s0Var2.getChildAt(i17);
                        if (i1Var == null || i1Var2.a > i1Var.a) {
                            i1Var = i1Var2;
                        }
                    }
                    if (i1Var != null) {
                        s0Var2.z1(i1Var, true);
                        s0Var2.k3 = false;
                        s0Var2.w0(0, i1Var.getTop() - ((s0Var2.getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    s0Var2.A1();
                    break;
                } else {
                    org.telegram.messenger.g0.r(s0Var2.l3);
                    break;
                }
                break;
            case 28:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) obj).T1.getEditText());
                    break;
                }
                break;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.f1) obj).U1.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        y20 y20Var;
        String str;
        TLRPC.User user;
        String str2;
        ui0 ui0Var;
        org.telegram.ui.Wallet.v5 v5Var;
        switch (this.a) {
            case 0:
                ej ejVar = (ej) this.b;
                ejVar.b.M1(ejVar, i10);
                ejVar.S();
                break;
            case 1:
                uj ujVar = (uj) this.b;
                kg.c0 c0Var = ujVar.E;
                ujVar.b.M1(ujVar, i10);
                ujVar.Z();
                v4.g0 adapter = ujVar.r.getAdapter();
                tj tjVar = ujVar.D;
                if (adapter == tjVar) {
                    int L0 = c0Var.L0();
                    int N0 = c0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        tj tjVar2 = tjVar.X.D;
                        if (!tjVar2.S && !tjVar2.V && (o0Var = tjVar.D) != null) {
                            tjVar.Z(tjVar.y, tjVar.E, tjVar.F, o0Var, tjVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 2:
                vj vjVar = (vj) this.b;
                vjVar.b.M1(vjVar, i10);
                vjVar.w.setTranslationY(Math.max(0, vjVar.getCurrentItemTop()));
                break;
            case 3:
                an anVar = (an) this.b;
                kg.c0 c0Var2 = anVar.x;
                anVar.b.M1(anVar, i10);
                rm rmVar = anVar.y;
                if (rmVar != null && rmVar.s) {
                    mw0 delegate = rmVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.g61 g61Var = anVar.s;
                        View F = g61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.d1 T = F == null ? null : g61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (rmVar.getDirection() == 0) {
                                rmVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rmVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                rmVar.f();
                            }
                        } else {
                            rmVar.f();
                        }
                    } else {
                        rmVar.f();
                    }
                }
                if (i10 != 0 && (y20Var = anVar.D) != null) {
                    y20Var.a();
                    break;
                }
                break;
            case 4:
                bn bnVar = (bn) this.b;
                bnVar.b.M1(bnVar, i10);
                break;
            case 5:
                vo voVar = (vo) this.b;
                if (voVar.w1.M0() + 10 >= voVar.q1.b()) {
                    voVar.Q0();
                    break;
                }
                break;
            case 6:
                qu quVar = (qu) this.b;
                iu iuVar = quVar.p1;
                if (iuVar != null && quVar.q1.I1 && iuVar.x) {
                    iuVar.x = false;
                    iuVar.invalidate();
                    break;
                }
                break;
            case 7:
                ez ezVar = (ez) this.b;
                ezVar.F.invalidate();
                ezVar.invalidate();
                break;
            case 8:
                fz.I0((fz) this.b);
                break;
            case 9:
                f90 f90Var = (f90) this.b;
                v4.n0 layoutManager = f90Var.getLayoutManager();
                g90 g90Var = f90Var.i3;
                z80 z80Var = g90Var.d;
                int N02 = layoutManager == z80Var ? z80Var.N0() : g90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.i1 i1Var = g90Var.f;
                    if (N02 > i1Var.M0 - 5 && i1Var.u0 == 0 && (str = i1Var.s0) != null && str.length() != 0 && (user = i1Var.w0) != null && (str2 = i1Var.r0) != null) {
                        i1Var.T(true, user, str2, i1Var.s0);
                    }
                }
                boolean z9 = !f90Var.canScrollVertically(-1);
                f90Var.canScrollVertically(1);
                g90Var.n(z9);
                g90Var.b();
                break;
            case 10:
                ca0 ca0Var = (ca0) this.b;
                org.telegram.ui.v8 v8Var = ca0Var.b;
                bi.q1 q1Var = ca0Var.f;
                for (int i11 = 0; i11 < q1Var.getChildCount(); i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                w90 w90Var = ca0Var.e;
                if (w90Var != null) {
                    w90Var.w();
                    break;
                }
                break;
            case 11:
                qe0 qe0Var = (qe0) this.b;
                if (qe0Var.l1.getChildCount() > 0) {
                    qe0.I0(qe0Var);
                    break;
                }
                break;
            case 12:
                ii0 ii0Var = (ii0) this.b;
                bi.q1 q1Var2 = ii0Var.b;
                int[] iArr = ii0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ii0.b(ii0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ii0.b(ii0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < q1Var2.getChildCount() - 1; i13++) {
                    ii0.b(ii0Var, q1Var2.getChildAt(i13), 1.0f);
                }
                ii0Var.invalidate();
                break;
            case 13:
                pj0 pj0Var = (pj0) this.b;
                Rect rect = pj0Var.E1;
                v4.s0 s0Var = pj0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i7, i10);
                }
                if (pj0Var.C1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = pj0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    pj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                pj0Var.L0(false);
                if (i10 != 0 && (ui0Var = pj0Var.d1) != null) {
                    ui0Var.c();
                }
                yi0 yi0Var = pj0Var.S1;
                if (yi0Var != null) {
                    pj0Var.e1(yi0Var, 700, false);
                    break;
                }
                break;
            case 15:
                bt0.I0((bt0) this.b);
                break;
            case 16:
                it0 it0Var = (it0) this.b;
                if (recyclerView == it0Var.G) {
                    it0Var.R += i10;
                }
                if (it0Var.P == null && it0Var.Q == 0) {
                    it0Var.B();
                    break;
                }
                break;
            case 17:
                ((iu0) this.b).S1.W();
                break;
            case 18:
                yv0.I0((yv0) this.b);
                break;
            case 19:
                ((c51) this.b).Q0();
                break;
            case 20:
                ((u61) this.b).invalidate();
                break;
            case 21:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (v5Var = z5Var.q0) != null && v5Var.f) {
                    v5Var.d = true;
                }
                z5Var.U0();
                break;
            case 22:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 23:
                org.telegram.ui.Wallet.y9 y9Var = (org.telegram.ui.Wallet.y9) this.b;
                if (y9Var.a.I1) {
                    org.telegram.messenger.g0.v1(y9Var.N);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                if (!lVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(lVar.w)) {
                        lVar.e.d();
                    } else {
                        org.telegram.ui.web.h hVar = lVar.f;
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                }
                if (lVar.a.I1) {
                    org.telegram.messenger.g0.v1(lVar.fragmentView);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                if (z0Var.a.I1) {
                    org.telegram.messenger.g0.v1(z0Var.fragmentView);
                    break;
                }
                break;
            case 26:
                ug.s0 s0Var2 = (ug.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.z1(null, true);
                }
                s0Var2.invalidate();
                break;
            case 27:
                ((vh.g) this.b).f1();
                break;
        }
    }
}
