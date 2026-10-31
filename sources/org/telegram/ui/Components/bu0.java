package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bu0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bu0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ck0 ck0Var;
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.a) {
            case 4:
                e61 e61Var = (e61) this.b;
                ag.b1 b1Var = e61Var.k1;
                if (i10 == 0 && e61Var.x1) {
                    if (org.telegram.messenger.i0.L(13.0f) + e61Var.u1 + e61Var.s0 < org.telegram.messenger.i0.m * 2 && b1Var.canScrollVertically(1) && (ck0Var = (ck0) b1Var.K(0)) != null) {
                        View view = ck0Var.a;
                        if (view.getTop() > 0) {
                            b1Var.w0(0, view.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) this.b).i0) != null) {
                    y8Var.a();
                    break;
                }
                break;
            case 14:
                qh.c cVar = (qh.c) this.b;
                cVar.c0 = i10 == 1;
                if (i10 != 0) {
                    cVar.a0 = qh.c.b();
                }
                cVar.invalidate();
                break;
            case 15:
                if (i10 == 0) {
                    ((qh.g0) this.b).w = false;
                    break;
                }
                break;
            case 23:
                th.y3 y3Var = (th.y3) this.b;
                if (i10 == 0) {
                    y3Var.V = true;
                    y3Var.invalidate();
                }
                if (i10 == 1) {
                    y3Var.V = false;
                    a5.a aVar = y3Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.c).cancel();
                        aVar.c = null;
                    }
                    org.telegram.messenger.i0.v1(y3Var);
                    break;
                }
                break;
            case 25:
                vh.l1 l1Var = (vh.l1) this.b;
                if (i10 == 0 && l1Var.n >= 0.0f && !l1Var.b.canScrollVertically(-1)) {
                    l1Var.n = -1.0f;
                    break;
                }
                break;
            case 26:
                if (i10 == 0) {
                    vh.f5 f5Var = (vh.f5) this.b;
                    if (f5Var.a2) {
                        f5Var.a2 = false;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r10 = ((org.telegram.ui.ActionBar.k2) r5).currentAccount;
        rh.r.g(r10).d(r11).a();
        r10 = ((org.telegram.ui.ActionBar.k2) r5).currentAccount;
        rh.r.g(r10).e(r11).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a8, code lost:
    
        if (r11.s() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r11.s() != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0235  */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.Wallet.x5 x5Var;
        float f7;
        Object[] objArr;
        float y3;
        int measuredHeight;
        org.telegram.ui.ActionBar.i5 i5Var;
        vh.p1 p1Var;
        int i12;
        vh.p1 p1Var2;
        org.telegram.ui.ActionBar.i5 i5Var2;
        int i13 = this.a;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        int i16 = 0;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.b;
        switch (i13) {
            case 0:
                du0.I0((du0) obj);
                break;
            case 1:
                ku0 ku0Var = (ku0) obj;
                if (recyclerView == ku0Var.G) {
                    ku0Var.R += i11;
                }
                if (ku0Var.P == null && ku0Var.Q == 0) {
                    ku0Var.B();
                    break;
                }
                break;
            case 2:
                ((jv0) obj).P1.W();
                break;
            case 3:
                cx0.I0((cx0) obj);
                break;
            case 4:
                ((e61) obj).Q0();
                break;
            case 5:
                ((v71) obj).invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (x5Var = b6Var.q0) != null && x5Var.f) {
                    x5Var.d = true;
                }
                b6Var.S0();
                break;
            case 7:
                int[] iArr = (int[]) obj;
                iArr[0] = iArr[0] + i11;
                break;
            case 8:
                org.telegram.ui.Wallet.ba baVar = (org.telegram.ui.Wallet.ba) obj;
                if (baVar.a.I1) {
                    org.telegram.messenger.i0.v1(baVar.N);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                if (!mVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(mVar.w)) {
                        mVar.e.d();
                    } else {
                        org.telegram.ui.web.h hVar = mVar.f;
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                }
                if (mVar.a.I1) {
                    org.telegram.messenger.i0.v1(mVar.fragmentView);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (b1Var.a.I1) {
                    org.telegram.messenger.i0.v1(b1Var.fragmentView);
                    break;
                }
                break;
            case 11:
                ph.r3 r3Var = (ph.r3) obj;
                int i17 = 0;
                while (true) {
                    if (i17 < r3Var.n.getChildCount()) {
                        if (r3Var.n.getChildAt(i17) instanceof zz) {
                            r3Var.d.g(false);
                        } else {
                            i17++;
                        }
                    }
                }
                org.telegram.messenger.z20.m(r3Var.h.animate().alpha((r3Var.K && r3Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), gr.h, 320L);
                break;
            case 12:
                ((ph.q3) obj).d1();
                break;
            case 13:
                ph.t3 t3Var = (ph.t3) obj;
                if (t3Var.e1()) {
                    t3Var.Q1.b();
                    break;
                }
                break;
            case 14:
                qh.c cVar = (qh.c) obj;
                if (i11 != 0) {
                    cVar.a0 = qh.c.b();
                    cVar.invalidate();
                    break;
                }
                break;
            case 15:
                qh.g0 g0Var = (qh.g0) obj;
                if (!g0Var.w) {
                    g0Var.h.a(g0Var.f(g0Var.c()), true);
                    break;
                }
                break;
            case 16:
                rh.h hVar2 = (rh.h) obj;
                ph.x1 x1Var = hVar2.n;
                if (!recyclerView.canScrollVertically(1)) {
                    hVar2.removeCallbacks(x1Var);
                    hVar2.post(x1Var);
                    break;
                }
                break;
            case 17:
                rh.t0 t0Var = (rh.t0) obj;
                View view = t0Var.i2;
                FrameLayout frameLayout = t0Var.d2;
                tk0 tk0Var = t0Var.k1;
                for (int childCount = tk0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = tk0Var.getChildAt(childCount);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        if (R == 2) {
                            y3 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f7 = childAt.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f7;
                            if (objArr != false && height >= 0.0f) {
                                z12 = false;
                            }
                            if (t0Var.n2 != z12) {
                                t0Var.n2 = z12;
                                if (z12) {
                                    view.setVisibility(0);
                                }
                                view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new org.telegram.ui.yv0(5, t0Var, z12)).start();
                            }
                            t0Var.B1 = f7 <= 0.0f ? 0 : org.telegram.messenger.i0.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f7);
                            break;
                        } else if (R == 0) {
                            y3 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f7 = y3 - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f7;
                        if (objArr != false) {
                            z12 = false;
                        }
                        if (t0Var.n2 != z12) {
                        }
                        t0Var.B1 = f7 <= 0.0f ? 0 : org.telegram.messenger.i0.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f7);
                    }
                }
                f7 = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f7;
                if (objArr != false) {
                }
                if (t0Var.n2 != z12) {
                }
                t0Var.B1 = f7 <= 0.0f ? 0 : org.telegram.messenger.i0.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f7);
            case 18:
                ((rh.e4) obj).Q1.g();
                break;
            case 19:
                rh.h8 h8Var = (rh.h8) obj;
                fe.b bVar = h8Var.X;
                if (!h8Var.c.canScrollVertically(-1)) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) h8Var).simpleActionBar;
                    break;
                }
                z11 = true;
                bVar.a(z11, true);
                break;
            case 20:
                rh.e8 e8Var = (rh.e8) obj;
                u51 u51Var = e8Var.a;
                if (u51Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < u51Var.getChildCount(); i18++) {
                        if (!(u51Var.getChildAt(i18) instanceof zz)) {
                        }
                    }
                    break;
                }
                e8Var.h.run();
                break;
            case 21:
                ((sg.s) obj).c(true);
                break;
            case 22:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj;
                uwVar.invalidate();
                uwVar.c();
                vh.p2 p2Var = uwVar.J;
                if (p2Var != null) {
                    p2Var.e(true);
                    break;
                }
                break;
            case 23:
                th.y3 y3Var = (th.y3) obj;
                y3Var.c();
                y3Var.invalidate();
                break;
            case 24:
                vh.g1 g1Var = (vh.g1) obj;
                vh.e1 e1Var = g1Var.c;
                vh.u1 u1Var = g1Var.r;
                int i19 = vh.u1.y1;
                u1Var.b.invalidate();
                if (u1Var.d && g1Var.b.I1 && (p1Var = g1Var.d) != null && p1Var.e != null) {
                    u1Var.L0();
                }
                if (g1Var.e.M0() + 7 >= e1Var.b() - 1) {
                    e1Var.G();
                    break;
                }
                break;
            case 25:
                vh.l1 l1Var = (vh.l1) obj;
                vh.k1 k1Var = l1Var.c;
                vh.b1 b1Var2 = l1Var.b;
                vh.u1 u1Var2 = l1Var.s;
                int i20 = vh.u1.y1;
                u1Var2.b.invalidate();
                if (l1Var.n < 0.0f) {
                    i12 = l1Var.d.I0();
                } else {
                    while (true) {
                        if (i16 < b1Var2.getChildCount()) {
                            View childAt2 = b1Var2.getChildAt(i16);
                            if (childAt2.getY() + childAt2.getHeight() > l1Var.n + b1Var2.getPaddingTop()) {
                                b1Var2.getClass();
                                i12 = RecyclerView.R(childAt2);
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
                int size = k1Var.D.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = k1Var.D.keyAt(size);
                        int valueAt = k1Var.D.valueAt(size);
                        if (i12 >= keyAt) {
                            i14 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i14 >= 0) {
                    l1Var.e.j(i14, true);
                }
                if (u1Var2.d && b1Var2.I1 && (p1Var2 = l1Var.f) != null && p1Var2.e != null) {
                    u1Var2.L0();
                    break;
                }
                break;
            case 26:
                vh.f5 f5Var = (vh.f5) obj;
                f5Var.j1();
                if (f5Var.k1.I1 && !f5Var.a2) {
                    org.telegram.messenger.i0.v1(f5Var.b);
                    break;
                }
                break;
            case 27:
                wh.g gVar = (wh.g) obj;
                fe.b bVar2 = gVar.X;
                if (!gVar.c.canScrollVertically(-1)) {
                    i5Var2 = ((org.telegram.ui.ActionBar.k2) gVar).simpleActionBar;
                    break;
                }
                z10 = true;
                bVar2.a(z10, true);
                break;
            case 28:
                qe qeVar = (qe) obj;
                View m10 = qeVar.c.getLayoutManager().m(0);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                qeVar.h = y10 >= 0.0f ? y10 : 0.0f;
                qeVar.b();
                break;
            default:
                xh.z2 z2Var = (xh.z2) obj;
                long j10 = z2Var.R;
                while (true) {
                    if (i15 < z2Var.c.getChildCount()) {
                        if (z2Var.c.getChildAt(i15) instanceof zz) {
                            break;
                        } else {
                            i15++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                break;
        }
    }
}
