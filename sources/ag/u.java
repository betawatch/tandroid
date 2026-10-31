package ag;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.j7;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wj;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.w71;
import org.telegram.ui.w8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        ck0 ck0Var2;
        ck0 ck0Var3;
        int top;
        ck0 ck0Var4;
        ck0 ck0Var5;
        int top2;
        ck0 ck0Var6;
        int i11 = this.a;
        kg.y1 y1Var = null;
        Object obj = this.b;
        switch (i11) {
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((m3) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                ((ei.r) obj).g++;
                break;
            case 4:
                kg.b1 b1Var = (kg.b1) obj;
                if (i10 == 1) {
                    b1Var.k3 = true;
                }
                if (i10 == 0) {
                    for (int i12 = 0; i12 < recyclerView.getChildCount(); i12++) {
                        kg.y1 y1Var2 = (kg.y1) b1Var.getChildAt(i12);
                        if (y1Var == null || y1Var2.a > y1Var.a) {
                            y1Var = y1Var2;
                        }
                    }
                    if (y1Var != null) {
                        b1Var.z1(y1Var, true);
                        b1Var.k3 = false;
                        b1Var.w0(0, y1Var.getTop() - ((b1Var.getMeasuredHeight() - y1Var.getMeasuredHeight()) / 2), org.telegram.messenger.i0.H);
                    }
                    b1Var.A1();
                    break;
                } else {
                    org.telegram.messenger.i0.r(b1Var.l3);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((mg.v1) obj).Q1.getEditText());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((mg.i2) obj).R1.getEditText());
                    break;
                }
                break;
            case 11:
                w7 w7Var = (w7) obj;
                j7 j7Var = w7Var.o1;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    int i13 = w7Var.q2;
                    int i14 = w7Var.s0;
                    if (((i13 - i14) - L) + i14 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && j7Var.canScrollVertically(1) && (ck0Var = (ck0) j7Var.K(w7Var.l2 ? 1 : 0)) != null) {
                        View view = ck0Var.a;
                        if (view.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            j7Var.w0(0, view.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            break;
                        }
                    }
                } else if (i10 == 1) {
                    org.telegram.messenger.i0.v1(w7Var.getCurrentFocus());
                    break;
                }
                break;
            case 14:
                qi qiVar = (qi) obj;
                b1 b1Var2 = qiVar.n;
                bi biVar = qiVar.b;
                if (i10 == 0) {
                    int L2 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
                    int L3 = L2 + (t0Var != null ? org.telegram.messenger.i0.L(t0Var.getAlpha() * 26.0f) : 0);
                    int i15 = biVar.s0;
                    if (((biVar.V3[0] - i15) - L3) + i15 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var2 = (ck0) b1Var2.K(0)) != null) {
                        View view2 = ck0Var2.a;
                        if (view2.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            b1Var2.w0(0, view2.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xj xjVar = (xj) obj;
                bi biVar2 = xjVar.b;
                lj ljVar = xjVar.r;
                if (i10 == 0) {
                    int L4 = org.telegram.messenger.i0.L(13.0f);
                    int i16 = biVar2.s0;
                    if (((biVar2.V3[0] - i16) - L4) + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var3 = (ck0) ljVar.K(0)) != null && (top = (ck0Var3.a.getTop() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(56.0f)) > 0) {
                        ljVar.w0(0, top, null);
                    }
                }
                if (i10 == 1 && xjVar.b0 && ljVar.getAdapter() == xjVar.D) {
                    org.telegram.messenger.i0.v1(biVar2.getCurrentFocus());
                }
                xjVar.U = i10 != 0;
                break;
            case 17:
                yj yjVar = (yj) obj;
                tk0 tk0Var = yjVar.r;
                bi biVar3 = yjVar.b;
                if (i10 == 0) {
                    int L5 = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var2 = biVar3.U2;
                    int L6 = L5 + (t0Var2 != null ? org.telegram.messenger.i0.L(t0Var2.getAlpha() * 26.0f) : 0);
                    int i17 = biVar3.s0;
                    if (((biVar3.V3[0] - i17) - L6) + i17 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var4 = (ck0) tk0Var.K(0)) != null) {
                        View view3 = ck0Var4.a;
                        if (view3.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            tk0Var.w0(0, view3.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 18:
                jn jnVar = (jn) obj;
                w71 w71Var = jnVar.s;
                if (i10 == 0) {
                    int L7 = org.telegram.messenger.i0.L(13.0f);
                    bi biVar4 = jnVar.b;
                    int i18 = biVar4.s0;
                    if (((biVar4.V3[0] - i18) - L7) + i18 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (ck0Var5 = (ck0) w71Var.K(1)) != null && (top2 = (ck0Var5.a.getTop() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.L(65.0f)) > 0) {
                        w71Var.w0(0, top2, null);
                    }
                    int i19 = jnVar.W0;
                    if (i19 >= 0) {
                        jn.N(jnVar, i19);
                        jnVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 24:
                x90 x90Var = (x90) obj;
                x90Var.e3 = i10 != 0;
                x90Var.f3 = i10 == 1;
                break;
            case 26:
                tf0 tf0Var = (tf0) obj;
                nf0 nf0Var = tf0Var.i1;
                if (i10 == 0) {
                    int L8 = org.telegram.messenger.i0.L(13.0f);
                    int i20 = tf0Var.v1;
                    int i21 = tf0Var.s0;
                    if (((i20 - i21) - L8) + i21 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && nf0Var.canScrollVertically(1) && (ck0Var6 = (ck0) nf0Var.K(0)) != null) {
                        View view4 = ck0Var6.a;
                        if (view4.getTop() > org.telegram.messenger.i0.L(7.0f)) {
                            nf0Var.w0(0, view4.getTop() - org.telegram.messenger.i0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 28:
                tk0 tk0Var2 = (tk0) obj;
                if (i10 == 0) {
                    if (tk0Var2.t2) {
                        tk0Var2.t2 = false;
                        zs.e().k(99, 512);
                    }
                } else if (!tk0Var2.t2 && tk0Var2.v1) {
                    tk0Var2.t2 = true;
                    zs.e().k(98, 512);
                }
                if (i10 != 0 && tk0Var2.L1 != null) {
                    lg.k kVar = tk0Var2.c1;
                    if (kVar != null) {
                        org.telegram.messenger.i0.r(kVar);
                        tk0Var2.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tk0Var2.K1.I(obtain);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    tk0Var2.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view5 = tk0Var2.L1;
                    tk0Var2.j1(view5, 0.0f, 0.0f, false);
                    tk0Var2.L1 = null;
                    tk0Var2.m1(view5, null);
                    tk0Var2.N1 = false;
                }
                s4.s0 s0Var = tk0Var2.Y0;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                tk0Var2.I1 = z10;
                if (z10) {
                    tk0Var2.J1 = true;
                    break;
                }
                break;
            case 29:
                gm0 gm0Var = (gm0) obj;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(gm0Var.F.getCurrentFocus());
                }
                gm0Var.a();
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        zf.e0 e0Var;
        q30 q30Var;
        String str;
        TLRPC.User user;
        String str2;
        zj0 zj0Var;
        switch (this.a) {
            case 0:
                w.f0((w) this.b);
                break;
            case 1:
                h1 h1Var = (h1) this.b;
                h1Var.b.L1(h1Var, i11);
                h1Var.P();
                break;
            case 3:
                ((ei.r) this.b).h(i10, i11);
                break;
            case 4:
                kg.b1 b1Var = (kg.b1) this.b;
                if (recyclerView.getScrollState() == 1) {
                    b1Var.z1(null, true);
                }
                b1Var.invalidate();
                break;
            case 5:
                ((lh.g) this.b).f1();
                break;
            case 8:
                s4.a0 a0Var = (s4.a0) recyclerView.getLayoutManager();
                oh.q qVar = (oh.q) this.b;
                oh.f fVar = qVar.C;
                if (qVar.x && !qVar.w && a0Var != null) {
                    if (qVar.f.b() - a0Var.N0() < 10) {
                        org.telegram.messenger.i0.r(fVar);
                        org.telegram.messenger.i0.g3(fVar);
                        break;
                    }
                }
                break;
            case 9:
                ((mh.k) this.b).run();
                break;
            case 10:
                ((org.telegram.ui.Components.g0) this.b).w1();
                break;
            case 11:
                w7 w7Var = (w7) this.b;
                s4.a0 a0Var2 = w7Var.p1;
                w7.I0(w7Var);
                w7Var.Z0();
                if (!w7Var.m1) {
                    int L0 = a0Var2.L0();
                    if (w7Var.l2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(a0Var2.N0() - L0) + 1 : 0;
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (tz.O0) {
                        if (L0 < 10) {
                            MediaController.B().P();
                            break;
                        }
                    } else if (L0 + abs > b10 - 10) {
                        MediaController.B().P();
                        break;
                    }
                }
                break;
            case 12:
                ((uu0) this.b).invalidate();
                break;
            case 13:
                mi miVar = (mi) this.b;
                miVar.b.L1(miVar, i11);
                break;
            case 14:
                qi qiVar = (qi) this.b;
                if (qiVar.n.getChildCount() > 0) {
                    qiVar.b.L1(qiVar, i11);
                    break;
                }
                break;
            case 15:
                ej ejVar = (ej) this.b;
                ejVar.b.L1(ejVar, i11);
                ejVar.R();
                break;
            case 16:
                xj xjVar = (xj) this.b;
                d1 d1Var = xjVar.E;
                xjVar.b.L1(xjVar, i11);
                xjVar.X();
                s4.g0 adapter = xjVar.r.getAdapter();
                wj wjVar = xjVar.D;
                if (adapter == wjVar) {
                    int L02 = d1Var.L0();
                    int N0 = d1Var.N0();
                    int abs2 = Math.abs(N0 - L02) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && N0 >= b11 - 10) {
                        wj wjVar2 = wjVar.X.D;
                        if (!wjVar2.S && !wjVar2.V && (e0Var = wjVar.D) != null) {
                            wjVar.Z(wjVar.y, wjVar.E, wjVar.F, e0Var, wjVar.J, false);
                            break;
                        }
                    }
                }
                break;
            case 17:
                yj yjVar = (yj) this.b;
                yjVar.b.L1(yjVar, i11);
                yjVar.w.setTranslationY(Math.max(0, yjVar.getCurrentItemTop()));
                break;
            case 18:
                jn jnVar = (jn) this.b;
                d1 d1Var2 = jnVar.x;
                jnVar.b.L1(jnVar, i11);
                an anVar = jnVar.y;
                if (anVar != null && anVar.s) {
                    qx0 delegate = anVar.getDelegate();
                    if (delegate instanceof e6) {
                        w71 w71Var = jnVar.s;
                        View F = w71Var.F((e6) delegate);
                        s4.c1 T = F == null ? null : w71Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b12 = T.b();
                            if (anVar.getDirection() == 0) {
                                anVar.setTranslationY((view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                anVar.setTranslationY(view.getY());
                            }
                            if (b12 < d1Var2.L0() || b12 > d1Var2.N0()) {
                                anVar.f();
                            }
                        } else {
                            anVar.f();
                        }
                    } else {
                        anVar.f();
                    }
                }
                if (i11 != 0 && (q30Var = jnVar.D) != null) {
                    q30Var.b(true);
                    break;
                }
                break;
            case 19:
                kn knVar = (kn) this.b;
                knVar.b.L1(knVar, i11);
                break;
            case 20:
                dp dpVar = (dp) this.b;
                if (dpVar.t1.M0() + 10 >= dpVar.n1.b()) {
                    dpVar.Q0();
                    break;
                }
                break;
            case 21:
                cv cvVar = (cv) this.b;
                uu uuVar = cvVar.m1;
                if (uuVar != null && cvVar.n1.I1 && uuVar.x) {
                    uuVar.x = false;
                    uuVar.invalidate();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.tz tzVar = (org.telegram.ui.Components.tz) this.b;
                tzVar.F.invalidate();
                tzVar.invalidate();
                break;
            case 23:
                uz.I0((uz) this.b);
                break;
            case 24:
                x90 x90Var = (x90) this.b;
                s4.n0 layoutManager = x90Var.getLayoutManager();
                y90 y90Var = x90Var.i3;
                r90 r90Var = y90Var.d;
                int N02 = layoutManager == r90Var ? r90Var.N0() : y90Var.c.N0();
                if ((N02 == -1 ? 0 : N02) > 0) {
                    zf.x0 x0Var = y90Var.f;
                    if (N02 > x0Var.M0 - 5 && x0Var.u0 == 0 && (str = x0Var.s0) != null && str.length() != 0 && (user = x0Var.w0) != null && (str2 = x0Var.r0) != null) {
                        x0Var.T(true, user, str2, x0Var.s0);
                    }
                }
                boolean z10 = !x90Var.canScrollVertically(-1);
                x90Var.canScrollVertically(1);
                y90Var.n(z10);
                y90Var.b();
                break;
            case 25:
                ua0 ua0Var = (ua0) this.b;
                w8 w8Var = ua0Var.b;
                b1 b1Var2 = ua0Var.f;
                for (int i12 = 0; i12 < b1Var2.getChildCount(); i12++) {
                    View childAt = b1Var2.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) childAt).u3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                oa0 oa0Var = ua0Var.e;
                if (oa0Var != null) {
                    oa0Var.w();
                    break;
                }
                break;
            case 26:
                tf0 tf0Var = (tf0) this.b;
                if (tf0Var.i1.getChildCount() > 0) {
                    tf0.I0(tf0Var);
                    break;
                }
                break;
            case 27:
                mj0 mj0Var = (mj0) this.b;
                b1 b1Var3 = mj0Var.b;
                int[] iArr = mj0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    mj0.b(mj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    mj0.b(mj0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < b1Var3.getChildCount() - 1; i14++) {
                    mj0.b(mj0Var, b1Var3.getChildAt(i14), 1.0f);
                }
                mj0Var.invalidate();
                break;
            case 28:
                tk0 tk0Var = (tk0) this.b;
                Rect rect = tk0Var.E1;
                s4.s0 s0Var = tk0Var.Y0;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (tk0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = tk0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    tk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tk0Var.L0(false);
                if (i11 != 0 && (zj0Var = tk0Var.d1) != null) {
                    zj0Var.b();
                }
                dk0 dk0Var = tk0Var.S1;
                if (dk0Var != null) {
                    tk0Var.e1(dk0Var, 700, false);
                    break;
                }
                break;
        }
    }
}
