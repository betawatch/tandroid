package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import di.jb;
import di.mb;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gz;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.y7;
import org.telegram.ui.qv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class z4 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        cj0 cj0Var;
        switch (this.a) {
            case 4:
                ci.c cVar = (ci.c) this.b;
                cVar.d0 = i7 == 1;
                if (i7 != 0) {
                    cVar.b0 = ci.c.b();
                }
                cVar.invalidate();
                break;
            case 5:
                if (i7 == 0) {
                    ((ci.g0) this.b).w = false;
                    break;
                }
                break;
            case 12:
                fi.c5 c5Var = (fi.c5) this.b;
                if (i7 == 0) {
                    c5Var.W = true;
                    c5Var.invalidate();
                }
                if (i7 == 1) {
                    c5Var.W = false;
                    xa xaVar = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) xaVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) xaVar.c).cancel();
                        xaVar.c = null;
                    }
                    org.telegram.messenger.g0.v1(c5Var);
                    break;
                }
                break;
            case 14:
                hi.y1 y1Var = (hi.y1) this.b;
                if (i7 == 0 && y1Var.n >= 0.0f && !y1Var.b.canScrollVertically(-1)) {
                    y1Var.n = -1.0f;
                    break;
                }
                break;
            case 15:
                if (i7 == 0) {
                    hi.v6 v6Var = (hi.v6) this.b;
                    if (v6Var.e2) {
                        v6Var.e2 = false;
                        break;
                    }
                }
                break;
            case 19:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 24:
                li.b0 b0Var = (li.b0) this.b;
                if (i7 == 0) {
                    b0Var.e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 28:
                y7 y7Var = (y7) this.b;
                k7 k7Var = y7Var.s1;
                if (i7 != 0) {
                    if (i7 == 1) {
                        org.telegram.messenger.g0.v1(y7Var.getCurrentFocus());
                        break;
                    }
                } else {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = y7Var.u2;
                    int i11 = y7Var.t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && k7Var.canScrollVertically(1) && (cj0Var = (cj0) k7Var.K(y7Var.p2 ? 1 : 0)) != null) {
                        View view = cj0Var.a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            k7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0247, code lost:
    
        if (r10.v() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x027b, code lost:
    
        r11 = r11 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
    
        if (r10.v() != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        float f10;
        Object[] objArr;
        float y10;
        int measuredHeight;
        org.telegram.ui.ActionBar.w4 w4Var;
        hi.d2 d2Var;
        int i12;
        hi.d2 d2Var2;
        org.telegram.ui.ActionBar.w4 w4Var2;
        int i13;
        int i14;
        int i15 = this.a;
        int i16 = -1;
        int i17 = 0;
        boolean z10 = false;
        int i18 = 0;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.b;
        switch (i15) {
            case 0:
                a6 a6Var = (a6) obj;
                for (int i19 = 0; i19 < a6Var.f.getChildCount(); i19++) {
                    if (a6Var.f.getChildAt(i19) instanceof pz) {
                        a6Var.d.g(false);
                        break;
                    }
                }
                break;
            case 1:
                ((z5) obj).d1();
                break;
            case 2:
                e6 e6Var = (e6) obj;
                if (e6Var.e1()) {
                    e6Var.U1.a();
                    break;
                }
                break;
            case 3:
                ((ch.r) obj).c(true);
                break;
            case 4:
                ci.c cVar = (ci.c) obj;
                if (i10 != 0) {
                    cVar.b0 = ci.c.b();
                    cVar.invalidate();
                    break;
                }
                break;
            case 5:
                ci.g0 g0Var = (ci.g0) obj;
                if (!g0Var.w) {
                    g0Var.h.a(g0Var.f(g0Var.c()), true);
                    break;
                }
                break;
            case 6:
                di.s sVar = (di.s) obj;
                ch.w wVar = sVar.n;
                if (!recyclerView.canScrollVertically(1)) {
                    sVar.removeCallbacks(wVar);
                    sVar.post(wVar);
                    break;
                }
                break;
            case 7:
                di.i1 i1Var = (di.i1) obj;
                View view = i1Var.m2;
                FrameLayout frameLayout = i1Var.h2;
                uj0 uj0Var = i1Var.o1;
                int childCount = uj0Var.getChildCount() - 1;
                while (true) {
                    i11 = 2;
                    if (childCount >= 0) {
                        View childAt = uj0Var.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (R == 1) {
                                f10 = childAt.getY();
                            } else if (R == 0) {
                                y10 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            }
                        }
                        childCount--;
                    } else {
                        f10 = 0.0f;
                        objArr = false;
                    }
                }
                objArr = true;
                float height = frameLayout.getHeight() + f10;
                if (objArr != false && height >= 0.0f) {
                    z12 = false;
                }
                if (i1Var.r2 != z12) {
                    i1Var.r2 = z12;
                    if (z12) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new ai.q(i11, i1Var, z12)).start();
                }
                i1Var.F1 = f10 <= 0.0f ? 0 : org.telegram.messenger.g0.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f10);
                break;
            case 8:
                ((di.c6) obj).U1.g();
                break;
            case 9:
                mb mbVar = (mb) obj;
                te.a aVar = mbVar.Y;
                if (!mbVar.c.canScrollVertically(-1)) {
                    w4Var = ((org.telegram.ui.ActionBar.e2) mbVar).simpleActionBar;
                    break;
                }
                z11 = true;
                aVar.a(z11, true);
                break;
            case 10:
                jb jbVar = (jb) obj;
                u41 u41Var = jbVar.a;
                if (u41Var.canScrollVertically(1)) {
                    for (int i20 = 0; i20 < u41Var.getChildCount(); i20++) {
                        if (!(u41Var.getChildAt(i20) instanceof pz)) {
                        }
                    }
                    break;
                }
                jbVar.h.run();
                break;
            case 11:
                qv qvVar = (qv) obj;
                qvVar.invalidate();
                qvVar.c();
                hi.l3 l3Var = qvVar.K;
                if (l3Var != null) {
                    l3Var.f(true);
                    break;
                }
                break;
            case 12:
                fi.c5 c5Var = (fi.c5) obj;
                c5Var.c();
                c5Var.invalidate();
                break;
            case 13:
                hi.t1 t1Var = (hi.t1) obj;
                hi.r1 r1Var = t1Var.c;
                hi.i2 i2Var = t1Var.r;
                int i21 = hi.i2.C1;
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
                hi.y1 y1Var = (hi.y1) obj;
                hi.x1 x1Var = y1Var.c;
                hi.o1 o1Var = y1Var.b;
                hi.i2 i2Var2 = y1Var.s;
                int i22 = hi.i2.C1;
                i2Var2.b.invalidate();
                if (y1Var.n < 0.0f) {
                    i12 = y1Var.d.I0();
                } else {
                    while (true) {
                        if (i18 < o1Var.getChildCount()) {
                            View childAt2 = o1Var.getChildAt(i18);
                            if (childAt2.getY() + childAt2.getHeight() > y1Var.n + o1Var.getPaddingTop()) {
                                o1Var.getClass();
                                i12 = RecyclerView.R(childAt2);
                            } else {
                                i18++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = x1Var.E.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = x1Var.E.keyAt(size);
                        int valueAt = x1Var.E.valueAt(size);
                        if (i12 >= keyAt) {
                            i16 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i16 >= 0) {
                    y1Var.e.j(i16, true);
                }
                if (i2Var2.d && o1Var.J1 && (d2Var2 = y1Var.f) != null && d2Var2.e != null) {
                    i2Var2.L0();
                    break;
                }
                break;
            case 15:
                hi.v6 v6Var = (hi.v6) obj;
                v6Var.j1();
                if (v6Var.o1.J1 && !v6Var.e2) {
                    org.telegram.messenger.g0.v1(v6Var.b);
                    break;
                }
                break;
            case 16:
                ii.f fVar = (ii.f) obj;
                te.a aVar2 = fVar.Y;
                if (!fVar.c.canScrollVertically(-1)) {
                    w4Var2 = ((org.telegram.ui.ActionBar.e2) fVar).simpleActionBar;
                    break;
                }
                z10 = true;
                aVar2.a(z10, true);
                break;
            case 17:
                kg.n.g0((kg.n) obj);
                break;
            case 18:
                kg.g0 g0Var2 = (kg.g0) obj;
                g0Var2.b.M1(g0Var2, i10);
                g0Var2.R();
                break;
            case 20:
                ve veVar = (ve) obj;
                View m10 = veVar.c.getLayoutManager().m(0);
                float y11 = m10 != null ? m10.getY() : 0.0f;
                veVar.h = y11 >= 0.0f ? y11 : 0.0f;
                veVar.b();
                break;
            case 21:
                ki.n3 n3Var = (ki.n3) obj;
                long j3 = n3Var.S;
                while (true) {
                    if (i17 < n3Var.c.getChildCount()) {
                        if (!(n3Var.c.getChildAt(i17) instanceof pz)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.e2) n3Var).currentAccount;
                di.e0.g(i13).d(j3).a();
                i14 = ((org.telegram.ui.ActionBar.e2) n3Var).currentAccount;
                di.e0.g(i14).e(j3).a();
                break;
            case 22:
                li.r rVar = (li.r) obj;
                rVar.w.b(rVar.d);
                break;
            case 23:
                li.d0 d0Var = (li.d0) obj;
                if (d0Var.B1.J1) {
                    org.telegram.messenger.g0.v1(d0Var.z1.r);
                    break;
                }
                break;
            case 24:
                li.d0 d0Var2 = ((li.b0) obj).f;
                int i23 = li.d0.Q1;
                d0Var2.b.invalidate();
                break;
            case 25:
                li.y yVar = (li.y) obj;
                yVar.n.H1.b(yVar.d);
                break;
            case 26:
                ((oi.u4) obj).run();
                break;
            case 27:
                ((org.telegram.ui.Components.d0) obj).w1();
                break;
            case 28:
                y7 y7Var = (y7) obj;
                v4.b0 b0Var = y7Var.t1;
                y7.I0(y7Var);
                y7Var.Z0();
                if (!y7Var.q1) {
                    int L0 = b0Var.L0();
                    if (y7Var.p2) {
                        L0 = Math.max(0, L0 - 1);
                    }
                    int abs = L0 != -1 ? Math.abs(b0Var.N0() - L0) + 1 : 0;
                    int b10 = recyclerView.getAdapter().b();
                    MediaController.B();
                    if (gz.O0) {
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
                ((st0) obj).invalidate();
                break;
        }
    }
}
