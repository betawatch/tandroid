package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.mb;
import di.pb;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v1 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    f2 f2Var = (f2) this.b;
                    if (f2Var.n2) {
                        f2Var.n2 = false;
                        break;
                    }
                }
                break;
            case 5:
                ci.c cVar = (ci.c) this.b;
                cVar.d0 = i7 == 1;
                if (i7 != 0) {
                    cVar.b0 = ci.c.b();
                }
                cVar.invalidate();
                break;
            case 6:
                if (i7 == 0) {
                    ((ci.h0) this.b).w = false;
                    break;
                }
                break;
            case 13:
                fi.b5 b5Var = (fi.b5) this.b;
                if (i7 == 0) {
                    b5Var.W = true;
                    b5Var.invalidate();
                }
                if (i7 == 1) {
                    b5Var.W = false;
                    xa xaVar = b5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) xaVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) xaVar.c).cancel();
                        xaVar.c = null;
                    }
                    org.telegram.messenger.g0.v1(b5Var);
                    break;
                }
                break;
            case 15:
                hi.g2 g2Var = (hi.g2) this.b;
                if (i7 == 0 && g2Var.n >= 0.0f && !g2Var.b.canScrollVertically(-1)) {
                    g2Var.n = -1.0f;
                    break;
                }
                break;
            case 16:
                if (i7 == 0) {
                    hi.e7 e7Var = (hi.e7) this.b;
                    if (e7Var.e2) {
                        e7Var.e2 = false;
                        break;
                    }
                }
                break;
            case 20:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                li.a0 a0Var = (li.a0) this.b;
                if (i7 == 0) {
                    a0Var.e = !a0Var.d.canScrollVertically(-1);
                    a0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) this.b;
                org.telegram.ui.Components.q7 q7Var = e8Var.s1;
                if (i7 != 0) {
                    if (i7 == 1) {
                        org.telegram.messenger.g0.v1(e8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = e8Var.u2;
                    int i11 = e8Var.t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && q7Var.canScrollVertically(1) && (mj0Var = (mj0) q7Var.K(e8Var.p2 ? 1 : 0)) != null) {
                        View view = mj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            q7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0241, code lost:
    
        if (r10.x() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011f, code lost:
    
        if (r10.x() != false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d1  */
    @Override // v4.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        Object[] objArr;
        boolean z10;
        float y10;
        int measuredHeight;
        org.telegram.ui.ActionBar.z4 z4Var;
        hi.l2 l2Var;
        int i11;
        hi.l2 l2Var2;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = -1;
        int i16 = 0;
        boolean z11 = false;
        int i17 = 0;
        boolean z12 = false;
        int i18 = 1;
        Object obj = this.b;
        switch (i14) {
            case 0:
                f2 f2Var = (f2) obj;
                f2Var.p1();
                if (f2Var.o1.J1 && !f2Var.n2) {
                    org.telegram.messenger.g0.v1(f2Var.b);
                    break;
                }
                break;
            case 1:
                m8 m8Var = (m8) obj;
                for (int i19 = 0; i19 < m8Var.f.getChildCount(); i19++) {
                    if (m8Var.f.getChildAt(i19) instanceof vz) {
                        m8Var.d.l(false);
                        break;
                    }
                }
                break;
            case 2:
                ((l8) obj).e1();
                break;
            case 3:
                q8 q8Var = (q8) obj;
                if (q8Var.f1()) {
                    q8Var.U1.a();
                    break;
                }
                break;
            case 4:
                ((ch.s) obj).c(true);
                break;
            case 5:
                ci.c cVar = (ci.c) obj;
                if (i10 != 0) {
                    cVar.b0 = ci.c.b();
                    cVar.invalidate();
                    break;
                }
                break;
            case 6:
                ci.h0 h0Var = (ci.h0) obj;
                if (!h0Var.w) {
                    h0Var.h.a(h0Var.f(h0Var.c()), true);
                    break;
                }
                break;
            case 7:
                di.s sVar = (di.s) obj;
                ca.r rVar = sVar.n;
                if (!recyclerView.canScrollVertically(1)) {
                    sVar.removeCallbacks(rVar);
                    sVar.post(rVar);
                    break;
                }
                break;
            case 8:
                di.h1 h1Var = (di.h1) obj;
                View view = h1Var.m2;
                FrameLayout frameLayout = h1Var.h2;
                ek0 ek0Var = h1Var.o1;
                for (int childCount = ek0Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = ek0Var.getChildAt(childCount);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        if (R == 2) {
                            y10 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (R == 1) {
                            f10 = childAt.getY();
                            objArr = true;
                            z10 = objArr == true || ((float) frameLayout.getHeight()) + f10 < 0.0f;
                            if (h1Var.r2 != z10) {
                                h1Var.r2 = z10;
                                if (z10) {
                                    view.setVisibility(0);
                                }
                                view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new ch.k(i18, h1Var, z10)).start();
                            }
                            h1Var.F1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f10);
                            break;
                        } else if (R == 0) {
                            y10 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f10 = y10 - measuredHeight;
                        objArr = true;
                        if (objArr == true) {
                        }
                        if (h1Var.r2 != z10) {
                        }
                        h1Var.F1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f10);
                    }
                }
                f10 = 0.0f;
                objArr = false;
                if (objArr == true) {
                }
                if (h1Var.r2 != z10) {
                }
                h1Var.F1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f10);
            case 9:
                ((di.f6) obj).U1.h();
                break;
            case 10:
                pb pbVar = (pb) obj;
                te.a aVar = pbVar.Y;
                if (!pbVar.c.canScrollVertically(-1)) {
                    z4Var = ((org.telegram.ui.ActionBar.g2) pbVar).simpleActionBar;
                    break;
                }
                z12 = true;
                aVar.a(z12, true);
                break;
            case 11:
                mb mbVar = (mb) obj;
                g51 g51Var = mbVar.a;
                if (g51Var.canScrollVertically(1)) {
                    for (int i20 = 0; i20 < g51Var.getChildCount(); i20++) {
                        if (!(g51Var.getChildAt(i20) instanceof vz)) {
                        }
                    }
                    break;
                }
                mbVar.h.run();
                break;
            case 12:
                sv svVar = (sv) obj;
                svVar.invalidate();
                svVar.c();
                hi.u3 u3Var = svVar.K;
                if (u3Var != null) {
                    u3Var.f(true);
                    break;
                }
                break;
            case 13:
                fi.b5 b5Var = (fi.b5) obj;
                b5Var.c();
                b5Var.invalidate();
                break;
            case 14:
                hi.b2 b2Var = (hi.b2) obj;
                hi.z1 z1Var = b2Var.c;
                hi.r2 r2Var = b2Var.r;
                int i21 = hi.r2.D1;
                r2Var.b.invalidate();
                if (r2Var.d && b2Var.b.J1 && (l2Var = b2Var.d) != null && l2Var.e != null) {
                    r2Var.M0();
                }
                if (b2Var.e.M0() + 7 >= z1Var.b() - 1) {
                    z1Var.G();
                    break;
                }
                break;
            case 15:
                hi.g2 g2Var = (hi.g2) obj;
                hi.f2 f2Var2 = g2Var.c;
                hi.w1 w1Var = g2Var.b;
                hi.r2 r2Var2 = g2Var.s;
                int i22 = hi.r2.D1;
                r2Var2.b.invalidate();
                if (g2Var.n < 0.0f) {
                    i11 = g2Var.d.I0();
                } else {
                    while (true) {
                        if (i17 < w1Var.getChildCount()) {
                            View childAt2 = w1Var.getChildAt(i17);
                            if (childAt2.getY() + childAt2.getHeight() > g2Var.n + w1Var.getPaddingTop()) {
                                w1Var.getClass();
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
                int size = f2Var2.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = f2Var2.E.keyAt(size);
                        int valueAt = f2Var2.E.valueAt(size);
                        if (i11 >= keyAt) {
                            i15 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i15 >= 0) {
                    g2Var.e.j(i15, true);
                }
                if (r2Var2.d && w1Var.J1 && (l2Var2 = g2Var.f) != null && l2Var2.e != null) {
                    r2Var2.M0();
                    break;
                }
                break;
            case 16:
                hi.e7 e7Var = (hi.e7) obj;
                e7Var.k1();
                if (e7Var.o1.J1 && !e7Var.e2) {
                    org.telegram.messenger.g0.v1(e7Var.b);
                    break;
                }
                break;
            case 17:
                ii.t tVar = (ii.t) obj;
                te.a aVar2 = tVar.Y;
                if (!tVar.c.canScrollVertically(-1)) {
                    z4Var2 = ((org.telegram.ui.ActionBar.g2) tVar).simpleActionBar;
                    break;
                }
                z11 = true;
                aVar2.a(z11, true);
                break;
            case 18:
                kg.n.g0((kg.n) obj);
                break;
            case 19:
                kg.h0 h0Var2 = (kg.h0) obj;
                h0Var2.b.N1(h0Var2, i10);
                h0Var2.R();
                break;
            case 21:
                ff ffVar = (ff) obj;
                View m10 = ffVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                ffVar.h = y11 >= 0.0f ? y11 : 0.0f;
                ffVar.b();
                break;
            case 22:
                ki.i3 i3Var = (ki.i3) obj;
                long j3 = i3Var.S;
                while (true) {
                    if (i16 < i3Var.c.getChildCount()) {
                        if (!(i3Var.c.getChildAt(i16) instanceof vz)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.g2) i3Var).currentAccount;
                di.e0.g(i12).d(j3).a();
                i13 = ((org.telegram.ui.ActionBar.g2) i3Var).currentAccount;
                di.e0.g(i13).e(j3).a();
                break;
            case 23:
                li.r rVar2 = (li.r) obj;
                rVar2.w.b(rVar2.d);
                break;
            case 24:
                li.c0 c0Var = (li.c0) obj;
                if (c0Var.B1.J1) {
                    org.telegram.messenger.g0.v1(c0Var.z1.r);
                    break;
                }
                break;
            case 25:
                li.c0 c0Var2 = ((li.a0) obj).f;
                int i23 = li.c0.Q1;
                c0Var2.b.invalidate();
                break;
            case 26:
                li.x xVar = (li.x) obj;
                xVar.n.H1.b(xVar.d);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.z1) obj).run();
                break;
            case 28:
                ((org.telegram.ui.Components.m0) obj).D1();
                break;
            case 29:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj;
                v4.c0 c0Var3 = e8Var.t1;
                org.telegram.ui.Components.e8.J0(e8Var);
                e8Var.a1();
                if (!e8Var.q1) {
                    int L0 = c0Var3.L0();
                    if (e8Var.p2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(c0Var3.N0() - L0) + 1 : 0;
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (bz.O0) {
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
        }
    }
}
