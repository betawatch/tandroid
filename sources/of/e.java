package of;

import a0.h;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import e6.n;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import m.e3;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.m0;
import s4.o0;
import s4.p0;
import s4.t0;
import s4.u0;
import s4.z0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e {
    public int a;
    public int b;
    public final Serializable c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.t0 != null) {
                recyclerView.f.r0(c1Var);
            }
        }
        c1Var.t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f;
        ArrayList arrayList = c10.b(i10).a;
        if (((t0) c10.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.t0.b()) {
            return !recyclerView.t0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder m10 = hc.b.m(i10, "invalid position ", ". State item count is ");
        m10.append(recyclerView.t0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public u0 c() {
        if (((u0) this.g) == null) {
            this.g = new u0();
        }
        return (u0) this.g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.S0) {
            h hVar = ((RecyclerView) this.h).s0;
            int[] iArr = (int[]) hVar.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.d = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((c1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.k(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        h(U);
        if (recyclerView.c0 == null || U.i()) {
            return;
        }
        recyclerView.c0.f(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(c1 c1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        h hVar = recyclerView.s0;
        boolean k10 = c1Var.k();
        View view = c1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(c1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (c1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c1Var + recyclerView.C());
        }
        if (c1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((c1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = i0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (c1Var.i()) {
                    if (this.b <= 0 || c1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.S0 && size > 0) {
                            int i10 = c1Var.c;
                            if (((int[]) hVar.c) != null) {
                                int i11 = hVar.d * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (((int[]) hVar.c)[i12] == i10) {
                                        break;
                                    }
                                }
                            }
                            int i13 = size - 1;
                            loop1: while (i13 >= 0) {
                                int i14 = ((c1) arrayList.get(i13)).c;
                                if (((int[]) hVar.c) == null) {
                                    break;
                                }
                                int i15 = hVar.d * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (((int[]) hVar.c)[i16] == i14) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i13 + 1;
                        }
                        arrayList.add(size, c1Var);
                        z11 = true;
                    }
                    if (!z11) {
                        a(c1Var, true);
                        r5 = z11;
                        recyclerView.f.r0(c1Var);
                        if (r5 || z12 || !z10) {
                            return;
                        }
                        c1Var.t = null;
                        return;
                    }
                    r5 = z11;
                }
                z12 = false;
                recyclerView.f.r0(c1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z10 = false;
        if (c1Var.i()) {
        }
        z12 = false;
        recyclerView.f.r0(c1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.c0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.p = this;
            U.q = true;
            ((ArrayList) this.d).add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.w.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0414, code lost:
    
        if (r12.h() == false) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0520 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c1 j(int i10, long j3) {
        boolean z10;
        c1 c1Var;
        r0.b bVar;
        long j10;
        long j11;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        p0 p0Var;
        RecyclerView J;
        c1 c1Var2;
        View view;
        c1 c1Var3;
        boolean z12;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        z0 z0Var = recyclerView.t0;
        if (i10 < 0 || i10 >= z0Var.b()) {
            StringBuilder n10 = hc.b.n("Invalid item position ", i10, "(", i10, "). Item count:");
            n10.append(z0Var.b());
            n10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(n10.toString());
        }
        if (z0Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        c1Var = (c1) ((ArrayList) this.d).get(i11);
                        if (!c1Var.s() && c1Var.c() == i10) {
                            c1Var.a(32);
                            break;
                        }
                        i11++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i12 = recyclerView.w.i(g10);
                        for (int i13 = 0; i13 < size; i13++) {
                            c1 c1Var4 = (c1) ((ArrayList) this.d).get(i13);
                            if (!c1Var4.s() && c1Var4.e == i12) {
                                c1Var4.a(32);
                                c1Var = c1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            c1Var = null;
            z10 = c1Var != null;
        } else {
            z10 = false;
            c1Var = null;
        }
        if (c1Var == null) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                c1Var3 = (c1) arrayList.get(i14);
                if (!c1Var3.s() && c1Var3.c() == i10 && !c1Var3.h() && (z0Var.g || !c1Var3.j())) {
                    c1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i15);
                c1 U = RecyclerView.U(view);
                if (U.c() == i10 && !U.h() && !U.j()) {
                    break;
                }
                i15++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size4) {
                        c1Var3 = null;
                        break;
                    }
                    c1Var3 = (c1) arrayList2.get(i16);
                    if (!c1Var3.h() && c1Var3.c() == i10 && !c1Var3.f()) {
                        arrayList2.remove(i16);
                        break;
                    }
                    i16++;
                }
            } else {
                c1 U2 = RecyclerView.U(view);
                e3 e3Var = recyclerView.e;
                n nVar = (n) e3Var.c;
                int indexOfChild = ((gh.h) e3Var.b).a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!nVar.z(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                nVar.u(indexOfChild);
                e3Var.X(view);
                e3 e3Var2 = recyclerView.e;
                n nVar2 = (n) e3Var2.c;
                int indexOfChild2 = ((gh.h) e3Var2.b).a.indexOfChild(view);
                int v = (indexOfChild2 == -1 || nVar2.z(indexOfChild2)) ? -1 : indexOfChild2 - nVar2.v(indexOfChild2);
                if (v == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.y(v);
                i(view);
                U2.a(8224);
                c1Var3 = U2;
            }
            if (c1Var3 != null) {
                if (c1Var3.j()) {
                    z12 = z0Var.g;
                } else {
                    int i17 = c1Var3.c;
                    if (i17 < 0 || i17 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c1Var3 + recyclerView.C());
                    }
                    if (z0Var.g || recyclerView.w.j(c1Var3.c) == c1Var3.f) {
                        h0 h0Var = recyclerView.w;
                        if (!h0Var.b || c1Var3.e == h0Var.i(c1Var3.c)) {
                            z12 = true;
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    c1Var = c1Var3;
                    z10 = true;
                } else {
                    c1Var3.a(4);
                    if (c1Var3.k()) {
                        recyclerView.removeDetachedView(c1Var3.a, false);
                        c1Var3.p.k(c1Var3);
                    } else if (c1Var3.s()) {
                        c1Var3.l &= -33;
                    }
                    h(c1Var3);
                    c1Var = null;
                }
            } else {
                c1Var = c1Var3;
            }
        }
        if (c1Var == null) {
            j10 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder n11 = hc.b.n("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                n11.append(z0Var.b());
                n11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(n11.toString());
            }
            int j12 = recyclerView.w.j(g11);
            j11 = 4;
            h0 h0Var2 = recyclerView.w;
            if (h0Var2.b) {
                long i18 = h0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        c1 c1Var5 = (c1) arrayList.get(size5);
                        long j13 = c1Var5.e;
                        View view2 = c1Var5.a;
                        if (j13 == i18 && !c1Var5.s()) {
                            if (j12 == c1Var5.f) {
                                c1Var5.a(32);
                                if (c1Var5.j() && !z0Var.g) {
                                    c1Var5.p(2, 14);
                                }
                                c1Var = c1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                c1 U3 = RecyclerView.U(view2);
                                U3.p = null;
                                U3.q = false;
                                U3.l &= -33;
                                h(U3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            c1 c1Var6 = (c1) arrayList2.get(size6);
                            if (c1Var6.e != i18 || c1Var6.f()) {
                                size6--;
                            } else if (j12 == c1Var6.f) {
                                arrayList2.remove(size6);
                                c1Var = c1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        c1Var = null;
                    }
                }
                if (c1Var != null) {
                    c1Var.c = g11;
                    z10 = true;
                }
            }
            if (c1Var == null) {
                t0 t0Var = (t0) c().a.get(j12);
                if (t0Var != null) {
                    ArrayList arrayList5 = t0Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((c1) arrayList5.get(size7)).f()) {
                                c1Var2 = (c1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                c1Var2 = null;
                if (c1Var2 != null) {
                    c1Var2.o();
                    int[] iArr = RecyclerView.P0;
                }
                c1Var = c1Var2;
            }
            if (c1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j3 != Long.MAX_VALUE) {
                    long j14 = ((u0) this.g).b(j12).c;
                    if (!(j14 == 0 || j14 + nanoTime < j3)) {
                        return null;
                    }
                }
                bVar = null;
                c1Var = recyclerView.w.g(recyclerView, j12);
                if (RecyclerView.S0 && (J = RecyclerView.J(c1Var.a)) != null) {
                    c1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                t0 b10 = ((u0) this.g).b(j12);
                long j15 = b10.c;
                if (j15 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j15 / 4) * 3);
                }
                b10.c = nanoTime2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
            j10 = 3;
            j11 = 4;
        }
        View view3 = c1Var.a;
        if (z10 && !z0Var.g && c1Var.e(8192)) {
            c1Var.p(0, 8192);
            if (z0Var.j) {
                recyclerView.n0(c1Var, recyclerView.c0.l(z0Var, c1Var, m0.b(c1Var) | 4096, c1Var.d()));
            }
        }
        if (!z0Var.g || !c1Var.g()) {
            if (c1Var.g()) {
                if (!((c1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i10, 0);
            c1Var.t = recyclerView;
            int i19 = c1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j3 != Long.MAX_VALUE) {
                long j16 = ((u0) this.g).b(i19).d;
                if (j16 != 0 && j16 + nanoTime3 >= j3) {
                    z11 = false;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        p0Var = (p0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(p0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        p0Var = (p0) layoutParams;
                    } else {
                        p0Var = (p0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(p0Var);
                    }
                    p0Var.a = c1Var;
                    p0Var.d = !z10 && z11;
                    return c1Var;
                }
            }
            h0 h0Var3 = recyclerView.w;
            h0Var3.getClass();
            c1Var.c = g12;
            if (h0Var3.b) {
                c1Var.e = h0Var3.i(g12);
            }
            c1Var.p(1, 519);
            int i20 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            h0Var3.w(c1Var, g12, c1Var.d());
            ArrayList arrayList6 = c1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            c1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof p0) {
                ((p0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            t0 b11 = ((u0) this.g).b(c1Var.f);
            long j17 = b11.d;
            if (j17 != 0) {
                nanoTime4 = (nanoTime4 / j11) + ((j17 / j11) * j10);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.O;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = i0.a;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d = i0.d(view3);
                r0.b bVar2 = d == null ? bVar : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    c1Var.a(16384);
                    i0.k(view3, recyclerView.A0.e);
                }
            }
            if (z0Var.g) {
                c1Var.g = i10;
            }
            z11 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            p0Var.a = c1Var;
            p0Var.d = !z10 && z11;
            return c1Var;
        }
        c1Var.g = i10;
        z11 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        p0Var.a = c1Var;
        p0Var.d = !z10 && z11;
        return c1Var;
    }

    public void k(c1 c1Var) {
        if (c1Var.q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.c).remove(c1Var);
        }
        c1Var.p = null;
        c1Var.q = false;
        c1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        o0 o0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (o0Var != null ? o0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }
}
