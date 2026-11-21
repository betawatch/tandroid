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
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class u1 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    e2 e2Var = (e2) this.b;
                    if (e2Var.n2) {
                        e2Var.n2 = false;
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
                hi.y1 y1Var = (hi.y1) this.b;
                if (i7 == 0 && y1Var.n >= 0.0f && !y1Var.b.canScrollVertically(-1)) {
                    y1Var.n = -1.0f;
                    break;
                }
                break;
            case 16:
                if (i7 == 0) {
                    hi.u6 u6Var = (hi.u6) this.b;
                    if (u6Var.e2) {
                        u6Var.e2 = false;
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
                li.b0 b0Var = (li.b0) this.b;
                if (i7 == 0) {
                    b0Var.e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 29:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.b;
                org.telegram.ui.Components.r7 r7Var = f8Var.s1;
                if (i7 != 0) {
                    if (i7 == 1) {
                        org.telegram.messenger.g0.v1(f8Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = f8Var.u2;
                    int i11 = f8Var.t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && r7Var.canScrollVertically(1) && (mj0Var = (mj0) r7Var.K(f8Var.p2 ? 1 : 0)) != null) {
                        View view = mj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            r7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
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
        hi.d2 d2Var;
        int i11;
        hi.d2 d2Var2;
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
                e2 e2Var = (e2) obj;
                e2Var.p1();
                if (e2Var.o1.J1 && !e2Var.n2) {
                    org.telegram.messenger.g0.v1(e2Var.b);
                    break;
                }
                break;
            case 1:
                k8 k8Var = (k8) obj;
                for (int i19 = 0; i19 < k8Var.f.getChildCount(); i19++) {
                    if (k8Var.f.getChildAt(i19) instanceof yz) {
                        k8Var.d.l(false);
                        break;
                    }
                }
                break;
            case 2:
                ((j8) obj).e1();
                break;
            case 3:
                o8 o8Var = (o8) obj;
                if (o8Var.f1()) {
                    o8Var.U1.a();
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
                h51 h51Var = mbVar.a;
                if (h51Var.canScrollVertically(1)) {
                    for (int i20 = 0; i20 < h51Var.getChildCount(); i20++) {
                        if (!(h51Var.getChildAt(i20) instanceof yz)) {
                        }
                    }
                    break;
                }
                mbVar.h.run();
                break;
            case 12:
                tv tvVar = (tv) obj;
                tvVar.invalidate();
                tvVar.c();
                hi.l3 l3Var = tvVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                    break;
                }
                break;
            case 13:
                fi.b5 b5Var = (fi.b5) obj;
                b5Var.c();
                b5Var.invalidate();
                break;
            case 14:
                hi.t1 t1Var = (hi.t1) obj;
                hi.r1 r1Var = t1Var.c;
                hi.i2 i2Var = t1Var.r;
                int i21 = hi.i2.C1;
                i2Var.b.invalidate();
                if (i2Var.d && t1Var.b.J1 && (d2Var = t1Var.d) != null && d2Var.e != null) {
                    i2Var.M0();
                }
                if (t1Var.e.M0() + 7 >= r1Var.b() - 1) {
                    r1Var.G();
                    break;
                }
                break;
            case 15:
                hi.y1 y1Var = (hi.y1) obj;
                hi.x1 x1Var = y1Var.c;
                hi.o1 o1Var = y1Var.b;
                hi.i2 i2Var2 = y1Var.s;
                int i22 = hi.i2.C1;
                i2Var2.b.invalidate();
                if (y1Var.n < 0.0f) {
                    i11 = y1Var.d.I0();
                } else {
                    while (true) {
                        if (i17 < o1Var.getChildCount()) {
                            View childAt2 = o1Var.getChildAt(i17);
                            if (childAt2.getY() + childAt2.getHeight() > y1Var.n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
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
                if (i2Var2.d && o1Var.J1 && (d2Var2 = y1Var.f) != null && d2Var2.e != null) {
                    i2Var2.M0();
                    break;
                }
                break;
            case 16:
                hi.u6 u6Var = (hi.u6) obj;
                u6Var.k1();
                if (u6Var.o1.J1 && !u6Var.e2) {
                    org.telegram.messenger.g0.v1(u6Var.b);
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
                ef efVar = (ef) obj;
                View m10 = efVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                efVar.h = y11 >= 0.0f ? y11 : 0.0f;
                efVar.b();
                break;
            case 22:
                ki.h3 h3Var = (ki.h3) obj;
                long j3 = h3Var.S;
                while (true) {
                    if (i16 < h3Var.c.getChildCount()) {
                        if (!(h3Var.c.getChildAt(i16) instanceof yz)) {
                            i16++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.g2) h3Var).currentAccount;
                di.e0.g(i12).d(j3).a();
                i13 = ((org.telegram.ui.ActionBar.g2) h3Var).currentAccount;
                di.e0.g(i13).e(j3).a();
                break;
            case 23:
                li.s sVar2 = (li.s) obj;
                sVar2.w.b(sVar2.d);
                break;
            case 24:
                li.d0 d0Var = (li.d0) obj;
                if (d0Var.B1.J1) {
                    org.telegram.messenger.g0.v1(d0Var.z1.r);
                    break;
                }
                break;
            case 25:
                li.d0 d0Var2 = ((li.b0) obj).f;
                int i23 = li.d0.Q1;
                d0Var2.b.invalidate();
                break;
            case 26:
                li.y yVar = (li.y) obj;
                yVar.n.H1.b(yVar.d);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.z1) obj).run();
                break;
            case 28:
                ((org.telegram.ui.Components.n0) obj).D1();
                break;
            case 29:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) obj;
                v4.c0 c0Var = f8Var.t1;
                org.telegram.ui.Components.f8.J0(f8Var);
                f8Var.a1();
                if (!f8Var.q1) {
                    int L0 = c0Var.L0();
                    if (f8Var.p2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(c0Var.N0() - L0) + 1 : 0;
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
