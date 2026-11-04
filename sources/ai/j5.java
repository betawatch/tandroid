package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.kg;
import ci.tb;
import ci.wb;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z7;
import org.telegram.ui.mv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j5 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        bj0 bj0Var;
        switch (this.a) {
            case 3:
                bi.c cVar = (bi.c) this.b;
                cVar.d0 = i3 == 1;
                if (i3 != 0) {
                    cVar.b0 = bi.c.b();
                }
                cVar.invalidate();
                break;
            case 4:
                if (i3 == 0) {
                    ((bi.h0) this.b).w = false;
                    break;
                }
                break;
            case 12:
                ei.k5 k5Var = (ei.k5) this.b;
                if (i3 == 0) {
                    k5Var.W = true;
                    k5Var.invalidate();
                }
                if (i3 == 1) {
                    k5Var.W = false;
                    kg kgVar = k5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kgVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kgVar.c).cancel();
                        kgVar.c = null;
                    }
                    org.telegram.messenger.g0.v1(k5Var);
                    break;
                }
                break;
            case 14:
                gi.y1 y1Var = (gi.y1) this.b;
                if (i3 == 0 && y1Var.n >= 0.0f && !y1Var.b.canScrollVertically(-1)) {
                    y1Var.n = -1.0f;
                    break;
                }
                break;
            case 15:
                if (i3 == 0) {
                    gi.x6 x6Var = (gi.x6) this.b;
                    if (x6Var.b2) {
                        x6Var.b2 = false;
                        break;
                    }
                }
                break;
            case 21:
                ji.z zVar = (ji.z) this.b;
                if (i3 == 0) {
                    zVar.e = !zVar.d.canScrollVertically(-1);
                    zVar.d.canScrollVertically(1);
                    break;
                }
                break;
            case 25:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((lg.x1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 28:
                z7 z7Var = (z7) this.b;
                l7 l7Var = z7Var.p1;
                if (i3 != 0) {
                    if (i3 == 1) {
                        org.telegram.messenger.g0.v1(z7Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = z7Var.r2;
                    int i11 = z7Var.t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && l7Var.canScrollVertically(1) && (bj0Var = (bj0) l7Var.K(z7Var.m2 ? 1 : 0)) != null) {
                        View view = bj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            l7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x024f, code lost:
    
        if (r11.s() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        if (r11.s() != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02db  */
    @Override // u4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i3, int i10) {
        float f10;
        Object[] objArr;
        float y9;
        int measuredHeight;
        org.telegram.ui.ActionBar.y4 y4Var;
        gi.d2 d2Var;
        int i11;
        gi.d2 d2Var2;
        org.telegram.ui.ActionBar.y4 y4Var2;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.b;
        switch (i14) {
            case 0:
                i6 i6Var = (i6) obj;
                int i18 = 0;
                while (true) {
                    if (i18 < i6Var.n.getChildCount()) {
                        if (i6Var.n.getChildAt(i18) instanceof iz) {
                            i6Var.d.g(false);
                        } else {
                            i18++;
                        }
                    }
                }
                org.telegram.messenger.camera.q.l(i6Var.h.animate().alpha((i6Var.L && i6Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), xq.h, 320L);
                break;
            case 1:
                ((h6) obj).d1();
                break;
            case 2:
                m6 m6Var = (m6) obj;
                if (m6Var.e1()) {
                    m6Var.R1.a();
                    break;
                }
                break;
            case 3:
                bi.c cVar = (bi.c) obj;
                if (i10 != 0) {
                    cVar.b0 = bi.c.b();
                    cVar.invalidate();
                    break;
                }
                break;
            case 4:
                bi.h0 h0Var = (bi.h0) obj;
                if (!h0Var.w) {
                    h0Var.h.a(h0Var.f(h0Var.c()), true);
                    break;
                }
                break;
            case 5:
                ci.u uVar = (ci.u) obj;
                s sVar = uVar.n;
                if (!recyclerView.canScrollVertically(1)) {
                    uVar.removeCallbacks(sVar);
                    uVar.post(sVar);
                    break;
                }
                break;
            case 6:
                ci.p1 p1Var = (ci.p1) obj;
                View view = p1Var.j2;
                FrameLayout frameLayout = p1Var.e2;
                tj0 tj0Var = p1Var.l1;
                for (int childCount = tj0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = tj0Var.getChildAt(childCount);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        if (R == 2) {
                            y9 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f10 = childAt.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f10;
                            if (objArr != false && height >= 0.0f) {
                                z12 = false;
                            }
                            if (p1Var.o2 != z12) {
                                p1Var.o2 = z12;
                                if (z12) {
                                    view.setVisibility(0);
                                }
                                view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new ci.e1(r3, p1Var, z12)).start();
                            }
                            p1Var.C1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f10);
                            break;
                        } else if (R == 0) {
                            y9 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f10 = y9 - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f10;
                        if (objArr != false) {
                            z12 = false;
                        }
                        if (p1Var.o2 != z12) {
                        }
                        p1Var.C1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f10);
                    }
                }
                f10 = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f10;
                if (objArr != false) {
                }
                if (p1Var.o2 != z12) {
                }
                p1Var.C1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f10);
            case 7:
                ((ci.l6) obj).R1.g();
                break;
            case 8:
                wb wbVar = (wb) obj;
                qe.a aVar = wbVar.Y;
                if (!wbVar.c.canScrollVertically(-1)) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) wbVar).simpleActionBar;
                    break;
                }
                z11 = true;
                aVar.a(z11, true);
                break;
            case 9:
                tb tbVar = (tb) obj;
                l41 l41Var = tbVar.a;
                if (l41Var.canScrollVertically(1)) {
                    for (int i19 = 0; i19 < l41Var.getChildCount(); i19++) {
                        if (!(l41Var.getChildAt(i19) instanceof iz)) {
                        }
                    }
                    break;
                }
                tbVar.h.run();
                break;
            case 10:
                ((dh.r) obj).c(true);
                break;
            case 11:
                mv mvVar = (mv) obj;
                mvVar.invalidate();
                mvVar.c();
                gi.l3 l3Var = mvVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                    break;
                }
                break;
            case 12:
                ei.k5 k5Var = (ei.k5) obj;
                k5Var.c();
                k5Var.invalidate();
                break;
            case 13:
                gi.t1 t1Var = (gi.t1) obj;
                gi.r1 r1Var = t1Var.c;
                gi.i2 i2Var = t1Var.r;
                int i20 = gi.i2.z1;
                i2Var.b.invalidate();
                if (i2Var.d && t1Var.b.J1 && (d2Var = t1Var.d) != null && d2Var.e != null) {
                    i2Var.L0();
                }
                if (t1Var.e.M0() + 7 >= r1Var.b() - 1) {
                    r1Var.G();
                    break;
                }
                break;
            case 14:
                gi.y1 y1Var = (gi.y1) obj;
                gi.x1 x1Var = y1Var.c;
                gi.m1 m1Var = y1Var.b;
                gi.i2 i2Var2 = y1Var.s;
                int i21 = gi.i2.z1;
                i2Var2.b.invalidate();
                if (y1Var.n < 0.0f) {
                    i11 = y1Var.d.I0();
                } else {
                    while (true) {
                        if (i17 < m1Var.getChildCount()) {
                            View childAt2 = m1Var.getChildAt(i17);
                            if (childAt2.getY() + childAt2.getHeight() > y1Var.n + m1Var.getPaddingTop()) {
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
                int size = x1Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = x1Var.E.keyAt(size);
                        int valueAt = x1Var.E.valueAt(size);
                        if (i11 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    y1Var.e.j(i15, true);
                }
                if (i2Var2.d && m1Var.J1 && (d2Var2 = y1Var.f) != null && d2Var2.e != null) {
                    i2Var2.L0();
                    break;
                }
                break;
            case 15:
                gi.x6 x6Var = (gi.x6) obj;
                x6Var.j1();
                if (x6Var.l1.J1 && !x6Var.b2) {
                    org.telegram.messenger.g0.v1(x6Var.b);
                    break;
                }
                break;
            case 16:
                hi.g gVar = (hi.g) obj;
                qe.a aVar2 = gVar.Y;
                if (!gVar.c.canScrollVertically(-1)) {
                    y4Var2 = ((org.telegram.ui.ActionBar.d2) gVar).simpleActionBar;
                    break;
                }
                z10 = true;
                aVar2.a(z10, true);
                break;
            case 17:
                te teVar = (te) obj;
                View m10 = teVar.c.getLayoutManager().m(0);
                float y10 = m10 != null ? m10.getY() : 0.0f;
                teVar.h = y10 >= 0.0f ? y10 : 0.0f;
                teVar.b();
                break;
            case 18:
                ii.q3 q3Var = (ii.q3) obj;
                long j10 = q3Var.S;
                while (true) {
                    if (i16 < q3Var.c.getChildCount()) {
                        if (!(q3Var.c.getChildAt(i16) instanceof iz)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.d2) q3Var).currentAccount;
                ci.i0.g(i12).d(j10).a();
                i13 = ((org.telegram.ui.ActionBar.d2) q3Var).currentAccount;
                ci.i0.g(i13).e(j10).a();
                break;
            case 19:
                ji.q qVar = (ji.q) obj;
                qVar.w.b(qVar.d);
                break;
            case 20:
                ji.b0 b0Var = (ji.b0) obj;
                if (b0Var.y1.J1) {
                    org.telegram.messenger.g0.v1(b0Var.w1.r);
                    break;
                }
                break;
            case 21:
                ji.b0 b0Var2 = ((ji.z) obj).f;
                int i22 = ji.b0.N1;
                b0Var2.b.invalidate();
                break;
            case 22:
                ji.w wVar = (ji.w) obj;
                wVar.n.E1.b(wVar.d);
                break;
            case 23:
                lg.m.g0((lg.m) obj);
                break;
            case 24:
                lg.h0 h0Var2 = (lg.h0) obj;
                h0Var2.b.M1(h0Var2, i10);
                h0Var2.Q();
                break;
            case 26:
                ((org.telegram.messenger.voip.l0) obj).run();
                break;
            case 27:
                ((org.telegram.ui.Components.e0) obj).w1();
                break;
            case 28:
                z7 z7Var = (z7) obj;
                u4.b0 b0Var3 = z7Var.q1;
                z7.I0(z7Var);
                z7Var.Z0();
                if (!z7Var.n1) {
                    int L0 = b0Var3.L0();
                    if (z7Var.m2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(b0Var3.N0() - L0) + 1 : 0;
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (az.O0) {
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
            case 29:
                ((qt0) obj).invalidate();
                break;
        }
    }
}
