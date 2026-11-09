package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ui extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        yi0 yi0Var;
        int top;
        yi0 yi0Var2;
        yi0 yi0Var3;
        int top2;
        yi0 yi0Var4;
        yi0 yi0Var5;
        org.telegram.ui.Wallet.r8 r8Var;
        int i10 = this.a;
        ug.i1 i1Var = null;
        Object obj = this.b;
        switch (i10) {
            case 1:
                vj vjVar = (vj) obj;
                di diVar = vjVar.b;
                kj kjVar = vjVar.r;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i11 = diVar.s0;
                    if (((diVar.V3[0] - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var = (yi0) kjVar.K(0)) != null && (top = (yi0Var.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(56.0f)) > 0) {
                        kjVar.w0(0, top, null);
                    }
                }
                if (i7 == 1 && vjVar.b0 && kjVar.getAdapter() == vjVar.D) {
                    org.telegram.messenger.g0.v1(diVar.getCurrentFocus());
                }
                vjVar.U = i7 != 0;
                break;
            case 2:
                wj wjVar = (wj) obj;
                qj0 qj0Var = wjVar.r;
                di diVar2 = wjVar.b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar2.U2;
                    int L3 = L2 + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i12 = diVar2.s0;
                    if (((diVar2.V3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var2 = (yi0) qj0Var.K(0)) != null) {
                        View view = yi0Var2.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            qj0Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                bn bnVar = (bn) obj;
                org.telegram.ui.f61 f61Var = bnVar.s;
                if (i7 == 0) {
                    int L4 = org.telegram.messenger.g0.L(13.0f);
                    di diVar3 = bnVar.b;
                    int i13 = diVar3.s0;
                    if (((diVar3.V3[0] - i13) - L4) + i13 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (yi0Var3 = (yi0) f61Var.K(1)) != null && (top2 = (yi0Var3.a.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(65.0f)) > 0) {
                        f61Var.w0(0, top2, null);
                    }
                    int i14 = bnVar.W0;
                    if (i14 >= 0) {
                        bn.O(bnVar, i14);
                        bnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 9:
                g90 g90Var = (g90) obj;
                g90Var.e3 = i7 != 0;
                g90Var.f3 = i7 == 1;
                break;
            case 11:
                re0 re0Var = (re0) obj;
                le0 le0Var = re0Var.i1;
                if (i7 == 0) {
                    int L5 = org.telegram.messenger.g0.L(13.0f);
                    int i15 = re0Var.v1;
                    int i16 = re0Var.s0;
                    if (((i15 - i16) - L5) + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && le0Var.canScrollVertically(1) && (yi0Var4 = (yi0) le0Var.K(0)) != null) {
                        View view2 = yi0Var4.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            le0Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                qj0 qj0Var2 = (qj0) obj;
                if (i7 == 0) {
                    if (qj0Var2.t2) {
                        qj0Var2.t2 = false;
                        org.telegram.messenger.qs.e().k(99, 512);
                    }
                } else if (!qj0Var2.t2 && qj0Var2.v1) {
                    qj0Var2.t2 = true;
                    org.telegram.messenger.qs.e().k(98, 512);
                }
                if (i7 != 0 && qj0Var2.L1 != null) {
                    gj0 gj0Var = qj0Var2.c1;
                    if (gj0Var != null) {
                        org.telegram.messenger.g0.r(gj0Var);
                        qj0Var2.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        qj0Var2.K1.n0(obtain);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    qj0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = qj0Var2.L1;
                    qj0Var2.j1(view3, 0.0f, 0.0f, false);
                    qj0Var2.L1 = null;
                    qj0Var2.m1(view3, null);
                    qj0Var2.N1 = false;
                }
                v4.s0 s0Var = qj0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i7);
                }
                boolean z9 = i7 == 1 || i7 == 2;
                qj0Var2.I1 = z9;
                if (z9) {
                    qj0Var2.J1 = true;
                    break;
                }
                break;
            case 14:
                el0 el0Var = (el0) obj;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(el0Var.F.getCurrentFocus());
                }
                el0Var.a();
                break;
            case 19:
                c51 c51Var = (c51) obj;
                bi.q1 q1Var = c51Var.k1;
                if (i7 == 0 && c51Var.x1 && org.telegram.messenger.g0.L(13.0f) + c51Var.u1 + c51Var.s0 < org.telegram.messenger.g0.m * 2 && q1Var.canScrollVertically(1) && (yi0Var5 = (yi0) q1Var.K(0)) != null) {
                    View view4 = yi0Var5.a;
                    if (view4.getTop() > 0) {
                        q1Var.w0(0, view4.getTop(), null);
                        break;
                    }
                }
                break;
            case 21:
                if (i7 == 1 && (r8Var = ((org.telegram.ui.Wallet.w5) obj).i0) != null) {
                    r8Var.a();
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
                    org.telegram.messenger.g0.v1(((wg.w0) obj).Q1.getEditText());
                    break;
                }
                break;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.f1) obj).R1.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        jg.o0 o0Var;
        z20 z20Var;
        String str;
        TLRPC.User user;
        String str2;
        vi0 vi0Var;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.a) {
            case 0:
                fj fjVar = (fj) this.b;
                fjVar.b.M1(fjVar, i10);
                fjVar.S();
                break;
            case 1:
                vj vjVar = (vj) this.b;
                kg.c0 c0Var = vjVar.E;
                vjVar.b.M1(vjVar, i10);
                vjVar.Z();
                v4.g0 adapter = vjVar.r.getAdapter();
                uj ujVar = vjVar.D;
                if (adapter == ujVar) {
                    int L0 = c0Var.L0();
                    int N0 = c0Var.N0();
                    int abs = Math.abs(N0 - L0) + 1;
                    int b10 = recyclerView.getAdapter().b();
                    if (abs > 0 && N0 >= b10 - 10) {
                        uj ujVar2 = ujVar.X.D;
                        if (!ujVar2.S && !ujVar2.V && (o0Var = ujVar.D) != null) {
                            ujVar.Z(ujVar.y, ujVar.E, ujVar.F, o0Var, ujVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 2:
                wj wjVar = (wj) this.b;
                wjVar.b.M1(wjVar, i10);
                wjVar.w.setTranslationY(Math.max(0, wjVar.getCurrentItemTop()));
                break;
            case 3:
                bn bnVar = (bn) this.b;
                kg.c0 c0Var2 = bnVar.x;
                bnVar.b.M1(bnVar, i10);
                sm smVar = bnVar.y;
                if (smVar != null && smVar.s) {
                    nw0 delegate = smVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.f61 f61Var = bnVar.s;
                        View F = f61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.d1 T = F == null ? null : f61Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b11 = T.b();
                            if (smVar.getDirection() == 0) {
                                smVar.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                smVar.setTranslationY(view.getY());
                            }
                            if (b11 < c0Var2.L0() || b11 > c0Var2.N0()) {
                                smVar.f();
                            }
                        } else {
                            smVar.f();
                        }
                    } else {
                        smVar.f();
                    }
                }
                if (i10 != 0 && (z20Var = bnVar.D) != null) {
                    z20Var.a();
                    break;
                }
                break;
            case 4:
                cn cnVar = (cn) this.b;
                cnVar.b.M1(cnVar, i10);
                break;
            case 5:
                vo voVar = (vo) this.b;
                if (voVar.t1.M0() + 10 >= voVar.n1.b()) {
                    voVar.Q0();
                    break;
                }
                break;
            case 6:
                ru ruVar = (ru) this.b;
                ju juVar = ruVar.m1;
                if (juVar != null && ruVar.n1.I1 && juVar.x) {
                    juVar.x = false;
                    juVar.invalidate();
                    break;
                }
                break;
            case 7:
                fz fzVar = (fz) this.b;
                fzVar.F.invalidate();
                fzVar.invalidate();
                break;
            case 8:
                gz.I0((gz) this.b);
                break;
            case 9:
                g90 g90Var = (g90) this.b;
                v4.n0 layoutManager = g90Var.getLayoutManager();
                h90 h90Var = g90Var.i3;
                a90 a90Var = h90Var.d;
                int N02 = layoutManager == a90Var ? a90Var.N0() : h90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    jg.i1 i1Var = h90Var.f;
                    if (N02 > i1Var.M0 - 5 && i1Var.u0 == 0 && (str = i1Var.s0) != null && str.length() != 0 && (user = i1Var.w0) != null && (str2 = i1Var.r0) != null) {
                        i1Var.T(true, user, str2, i1Var.s0);
                    }
                }
                boolean z9 = !g90Var.canScrollVertically(-1);
                g90Var.canScrollVertically(1);
                h90Var.n(z9);
                h90Var.b();
                break;
            case 10:
                da0 da0Var = (da0) this.b;
                org.telegram.ui.v8 v8Var = da0Var.b;
                bi.q1 q1Var = da0Var.f;
                for (int i11 = 0; i11 < q1Var.getChildCount(); i11++) {
                    View childAt = q1Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).y3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
                    }
                }
                x90 x90Var = da0Var.e;
                if (x90Var != null) {
                    x90Var.w();
                    break;
                }
                break;
            case 11:
                re0 re0Var = (re0) this.b;
                if (re0Var.i1.getChildCount() > 0) {
                    re0.I0(re0Var);
                    break;
                }
                break;
            case 12:
                ji0 ji0Var = (ji0) this.b;
                bi.q1 q1Var2 = ji0Var.b;
                int[] iArr = ji0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ji0.b(ji0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ji0.b(ji0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < q1Var2.getChildCount() - 1; i13++) {
                    ji0.b(ji0Var, q1Var2.getChildAt(i13), 1.0f);
                }
                ji0Var.invalidate();
                break;
            case 13:
                qj0 qj0Var = (qj0) this.b;
                Rect rect = qj0Var.E1;
                v4.s0 s0Var = qj0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i7, i10);
                }
                if (qj0Var.C1 != -1) {
                    rect.offset(-i7, -i10);
                    org.telegram.ui.Cells.y yVar = qj0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    qj0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                qj0Var.L0(false);
                if (i10 != 0 && (vi0Var = qj0Var.d1) != null) {
                    vi0Var.c();
                }
                zi0 zi0Var = qj0Var.S1;
                if (zi0Var != null) {
                    qj0Var.e1(zi0Var, 700, false);
                    break;
                }
                break;
            case 15:
                ct0.I0((ct0) this.b);
                break;
            case 16:
                jt0 jt0Var = (jt0) this.b;
                if (recyclerView == jt0Var.G) {
                    jt0Var.R += i10;
                }
                if (jt0Var.P == null && jt0Var.Q == 0) {
                    jt0Var.B();
                    break;
                }
                break;
            case 17:
                ((ju0) this.b).P1.W();
                break;
            case 18:
                zv0.I0((zv0) this.b);
                break;
            case 19:
                ((c51) this.b).Q0();
                break;
            case 20:
                ((v61) this.b).invalidate();
                break;
            case 21:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.b;
                if (i10 != 0 && recyclerView.getScrollState() == 1 && (s5Var = w5Var.q0) != null && s5Var.f) {
                    s5Var.d = true;
                }
                w5Var.T0();
                break;
            case 22:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i10;
                break;
            case 23:
                org.telegram.ui.Wallet.v9 v9Var = (org.telegram.ui.Wallet.v9) this.b;
                if (v9Var.a.I1) {
                    org.telegram.messenger.g0.v1(v9Var.N);
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
