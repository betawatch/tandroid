package ai;

import a8.wa;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.dd;
import bi.k7;
import bi.q1;
import di.k5;
import fi.e2;
import fi.k2;
import fi.m3;
import fi.r1;
import fi.t1;
import fi.w6;
import fi.y1;
import fi.z1;
import hi.q3;
import kg.w1;
import li.j3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.pv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        xi0 xi0Var2;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                dVar.c0 = i7 == 1;
                if (i7 != 0) {
                    dVar.a0 = d.b();
                }
                dVar.invalidate();
                break;
            case 1:
                if (i7 == 0) {
                    ((q0) this.b).w = false;
                    break;
                }
                break;
            case 9:
                k5 k5Var = (k5) this.b;
                if (i7 == 0) {
                    k5Var.V = true;
                    k5Var.invalidate();
                }
                if (i7 == 1) {
                    k5Var.V = false;
                    wa waVar = k5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) waVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) waVar.c).cancel();
                        waVar.c = null;
                    }
                    org.telegram.messenger.g0.v1(k5Var);
                    break;
                }
                break;
            case 11:
                z1 z1Var = (z1) this.b;
                if (i7 == 0 && z1Var.n >= 0.0f && !z1Var.b.canScrollVertically(-1)) {
                    z1Var.n = -1.0f;
                    break;
                }
                break;
            case 12:
                if (i7 == 0) {
                    w6 w6Var = (w6) this.b;
                    if (w6Var.a2) {
                        w6Var.a2 = false;
                        break;
                    }
                }
                break;
            case 18:
                ii.b0 b0Var = (ii.b0) this.b;
                if (i7 == 0) {
                    b0Var.e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((w1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 23:
                ((oi.q) this.b).g++;
                break;
            case 26:
                b8 b8Var = (b8) this.b;
                n7 n7Var = b8Var.o1;
                if (i7 != 0) {
                    if (i7 == 1) {
                        org.telegram.messenger.g0.v1(b8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = b8Var.q2;
                    int i11 = b8Var.s0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (xi0Var = (xi0) n7Var.K(b8Var.l2 ? 1 : 0)) != null) {
                        View view = xi0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            n7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 29:
                qi qiVar = (qi) this.b;
                q1 q1Var = qiVar.n;
                di diVar = qiVar.b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
                    int L3 = L2 + (r0Var != null ? org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f) : 0);
                    int i12 = diVar.s0;
                    if (((diVar.V3[0] - i12) - L3) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var2 = (xi0) q1Var.K(0)) != null) {
                        View view2 = xi0Var2.a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            q1Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x026c, code lost:
    
        if (r10.s() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0144, code lost:
    
        if (r10.s() != false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02fa  */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        Object[] objArr;
        float y10;
        int measuredHeight;
        y4 y4Var;
        e2 e2Var;
        int i11;
        e2 e2Var2;
        y4 y4Var2;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 0;
        boolean z9 = false;
        int i17 = 0;
        boolean z10 = false;
        boolean z11 = true;
        Object obj = this.b;
        switch (i14) {
            case 0:
                d dVar = (d) obj;
                if (i10 != 0) {
                    dVar.a0 = d.b();
                    dVar.invalidate();
                    break;
                }
                break;
            case 1:
                q0 q0Var = (q0) obj;
                if (!q0Var.w) {
                    q0Var.h.a(q0Var.f(q0Var.c()), true);
                    break;
                }
                break;
            case 2:
                bi.y yVar = (bi.y) obj;
                a3.f fVar = yVar.n;
                if (!recyclerView.canScrollVertically(1)) {
                    yVar.removeCallbacks(fVar);
                    yVar.post(fVar);
                    break;
                }
                break;
            case 3:
                bi.w1 w1Var = (bi.w1) obj;
                View view = w1Var.i2;
                FrameLayout frameLayout = w1Var.d2;
                pj0 pj0Var = w1Var.k1;
                for (int childCount = pj0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = pj0Var.getChildAt(childCount);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        if (R == 2) {
                            y10 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f10 = childAt.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f10;
                            if (objArr != false && height >= 0.0f) {
                                z11 = false;
                            }
                            if (w1Var.n2 != z11) {
                                w1Var.n2 = z11;
                                if (z11) {
                                    view.setVisibility(0);
                                }
                                view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new bi.k1(r3, w1Var, z11)).start();
                            }
                            w1Var.B1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f10);
                            break;
                        } else if (R == 0) {
                            y10 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f10 = y10 - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f10;
                        if (objArr != false) {
                            z11 = false;
                        }
                        if (w1Var.n2 != z11) {
                        }
                        w1Var.B1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f10);
                    }
                }
                f10 = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f10;
                if (objArr != false) {
                }
                if (w1Var.n2 != z11) {
                }
                w1Var.B1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f10);
            case 4:
                ((k7) obj).Q1.g();
                break;
            case 5:
                dd ddVar = (dd) obj;
                te.a aVar = ddVar.X;
                if (!ddVar.c.canScrollVertically(-1)) {
                    y4Var = ((f2) ddVar).simpleActionBar;
                    break;
                }
                z10 = true;
                aVar.a(z10, true);
                break;
            case 6:
                ad adVar = (ad) obj;
                q41 q41Var = adVar.a;
                if (q41Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < q41Var.getChildCount(); i18++) {
                        if (!(q41Var.getChildAt(i18) instanceof lz)) {
                        }
                    }
                    break;
                }
                adVar.h.run();
                break;
            case 7:
                ((ch.r) obj).c(true);
                break;
            case 8:
                pv pvVar = (pv) obj;
                pvVar.invalidate();
                pvVar.c();
                m3 m3Var = pvVar.J;
                if (m3Var != null) {
                    m3Var.f(true);
                    break;
                }
                break;
            case 9:
                k5 k5Var = (k5) obj;
                k5Var.c();
                k5Var.invalidate();
                break;
            case 10:
                t1 t1Var = (t1) obj;
                r1 r1Var = t1Var.c;
                k2 k2Var = t1Var.r;
                int i19 = k2.y1;
                k2Var.b.invalidate();
                if (k2Var.d && t1Var.b.I1 && (e2Var = t1Var.d) != null && e2Var.e != null) {
                    k2Var.L0();
                }
                if (t1Var.e.M0() + 7 >= r1Var.b() - 1) {
                    r1Var.G();
                    break;
                }
                break;
            case 11:
                z1 z1Var = (z1) obj;
                y1 y1Var = z1Var.c;
                fi.m1 m1Var = z1Var.b;
                k2 k2Var2 = z1Var.s;
                int i20 = k2.y1;
                k2Var2.b.invalidate();
                if (z1Var.n < 0.0f) {
                    i11 = z1Var.d.I0();
                } else {
                    while (true) {
                        if (i17 < m1Var.getChildCount()) {
                            View childAt2 = m1Var.getChildAt(i17);
                            if (childAt2.getY() + childAt2.getHeight() > z1Var.n + m1Var.getPaddingTop()) {
                                m1Var.getClass();
                                i11 = RecyclerView.R(childAt2);
                            } else {
                                i17++;
                            }
                        } else {
                            i11 = -1;
                        }
                    }
                    if (i11 == -1) {
                    }
                }
                int size = y1Var.D.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = y1Var.D.keyAt(size);
                        int valueAt = y1Var.D.valueAt(size);
                        if (i11 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    z1Var.e.j(i15, true);
                }
                if (k2Var2.d && m1Var.I1 && (e2Var2 = z1Var.f) != null && e2Var2.e != null) {
                    k2Var2.L0();
                    break;
                }
                break;
            case 12:
                w6 w6Var = (w6) obj;
                w6Var.j1();
                if (w6Var.k1.I1 && !w6Var.a2) {
                    org.telegram.messenger.g0.v1(w6Var.b);
                    break;
                }
                break;
            case 13:
                gi.f fVar2 = (gi.f) obj;
                te.a aVar2 = fVar2.X;
                if (!fVar2.c.canScrollVertically(-1)) {
                    y4Var2 = ((f2) fVar2).simpleActionBar;
                    break;
                }
                z9 = true;
                aVar2.a(z9, true);
                break;
            case 14:
                ve veVar = (ve) obj;
                View m10 = veVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                veVar.h = y11 >= 0.0f ? y11 : 0.0f;
                veVar.b();
                break;
            case 15:
                q3 q3Var = (q3) obj;
                long j3 = q3Var.R;
                while (true) {
                    if (i16 < q3Var.c.getChildCount()) {
                        if (!(q3Var.c.getChildAt(i16) instanceof lz)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((f2) q3Var).currentAccount;
                bi.n0.g(i12).d(j3).a();
                i13 = ((f2) q3Var).currentAccount;
                bi.n0.g(i13).e(j3).a();
                break;
            case 16:
                ii.s sVar = (ii.s) obj;
                sVar.w.b(sVar.d);
                break;
            case 17:
                ii.d0 d0Var = (ii.d0) obj;
                if (d0Var.x1.I1) {
                    org.telegram.messenger.g0.v1(d0Var.v1.r);
                    break;
                }
                break;
            case 18:
                ii.d0 d0Var2 = ((ii.b0) obj).f;
                int i21 = ii.d0.M1;
                d0Var2.b.invalidate();
                break;
            case 19:
                ii.y yVar2 = (ii.y) obj;
                yVar2.n.D1.b(yVar2.d);
                break;
            case 20:
                kg.m.g0((kg.m) obj);
                break;
            case 21:
                kg.g0 g0Var = (kg.g0) obj;
                g0Var.b.M1(g0Var, i10);
                g0Var.Q();
                break;
            case 23:
                ((oi.q) obj).h(i7, i10);
                break;
            case 24:
                ((j3) obj).run();
                break;
            case 25:
                ((org.telegram.ui.Components.g0) obj).w1();
                break;
            case 26:
                b8 b8Var = (b8) obj;
                v4.b0 b0Var = b8Var.p1;
                b8.I0(b8Var);
                b8Var.Z0();
                if (!b8Var.m1) {
                    int L0 = b0Var.L0();
                    if (b8Var.l2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(b0Var.N0() - L0) + 1 : 0;
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (iz.O0) {
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
            case 27:
                ((rt0) obj).invalidate();
                break;
            case 28:
                ni niVar = (ni) obj;
                niVar.b.M1(niVar, i10);
                break;
            case 29:
                qi qiVar = (qi) obj;
                if (qiVar.n.getChildCount() > 0) {
                    qiVar.b.M1(qiVar, i10);
                    break;
                }
                break;
        }
    }
}
