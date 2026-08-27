package f2;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e1 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public e1(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(o1 o1Var, boolean z10) {
        RecyclerView.m(o1Var);
        if (o1Var.e(16384)) {
            o1Var.p(0, 16384);
            r0.j0.k(o1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            q0 q0Var = recyclerView.w;
            if (q0Var != null) {
                q0Var.A(o1Var);
            }
            if (recyclerView.p0 != null) {
                recyclerView.f.O(o1Var);
            }
        }
        o1Var.t = null;
        d1 c10 = c();
        c10.getClass();
        int i10 = o1Var.f;
        ArrayList arrayList = c10.b(i10).a;
        if (((c1) c10.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        o1Var.o();
        arrayList.add(o1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.p0.b()) {
            return !recyclerView.p0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder o10 = i0.a.o(i10, "invalid position ", ". State item count is ");
        o10.append(recyclerView.p0.b());
        o10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public d1 c() {
        if (((d1) this.g) == null) {
            this.g = new d1();
        }
        return (d1) this.g;
    }

    public void d(q0 q0Var, q0 q0Var2) {
        ((ArrayList) this.c).clear();
        e();
        d1 c10 = c();
        if (q0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (q0Var2 != null) {
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
        if (RecyclerView.O0) {
            androidx.datastore.preferences.protobuf.i iVar = ((RecyclerView) this.h).o0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((o1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        o1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.k(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        h(U);
        if (recyclerView.V == null || U.i()) {
            return;
        }
        recyclerView.V.f(U);
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
    public void h(o1 o1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
        boolean k10 = o1Var.k();
        View view = o1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(o1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (o1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + o1Var + recyclerView.C());
        }
        if (o1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((o1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (o1Var.i()) {
                    if (this.b <= 0 || o1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.O0 && size > 0) {
                            int i10 = o1Var.c;
                            if (((int[]) iVar.d) != null) {
                                int i11 = iVar.c * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (((int[]) iVar.d)[i12] == i10) {
                                        break;
                                    }
                                }
                            }
                            int i13 = size - 1;
                            loop1: while (i13 >= 0) {
                                int i14 = ((o1) arrayList.get(i13)).c;
                                if (((int[]) iVar.d) == null) {
                                    break;
                                }
                                int i15 = iVar.c * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (((int[]) iVar.d)[i16] == i14) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i13 + 1;
                        }
                        arrayList.add(size, o1Var);
                        z11 = true;
                    }
                    if (!z11) {
                        a(o1Var, true);
                        r5 = z11;
                        recyclerView.f.O(o1Var);
                        if (r5 || z12 || !z10) {
                            return;
                        }
                        o1Var.t = null;
                        return;
                    }
                    r5 = z11;
                }
                z12 = false;
                recyclerView.f.O(o1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z10 = false;
        if (o1Var.i()) {
        }
        z12 = false;
        recyclerView.f.O(o1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        v0 v0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        o1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (v0Var = recyclerView.V) != null && !v0Var.c(U, U.d())) {
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

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0418, code lost:
    
        if (r12.h() == false) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0524 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1 j(int i10, long j10) {
        boolean z10;
        o1 o1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        y0 y0Var;
        RecyclerView J;
        o1 o1Var2;
        View view;
        o1 o1Var3;
        boolean z12;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 l1Var = recyclerView.p0;
        if (i10 < 0 || i10 >= l1Var.b()) {
            StringBuilder p6 = com.google.android.recaptcha.internal.a.p("Invalid item position ", i10, "(", i10, "). Item count:");
            p6.append(l1Var.b());
            p6.append(recyclerView.C());
            throw new IndexOutOfBoundsException(p6.toString());
        }
        if (l1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        o1Var = (o1) ((ArrayList) this.d).get(i11);
                        if (!o1Var.s() && o1Var.c() == i10) {
                            o1Var.a(32);
                            break;
                        }
                        i11++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i12 = recyclerView.w.i(g10);
                        for (int i13 = 0; i13 < size; i13++) {
                            o1 o1Var4 = (o1) ((ArrayList) this.d).get(i13);
                            if (!o1Var4.s() && o1Var4.e == i12) {
                                o1Var4.a(32);
                                o1Var = o1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            o1Var = null;
            z10 = o1Var != null;
        } else {
            z10 = false;
            o1Var = null;
        }
        if (o1Var == null) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                o1Var3 = (o1) arrayList.get(i14);
                if (!o1Var3.s() && o1Var3.c() == i10 && !o1Var3.h() && (l1Var.g || !o1Var3.j())) {
                    o1Var3.a(32);
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
                o1 U = RecyclerView.U(view);
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
                        o1Var3 = null;
                        break;
                    }
                    o1Var3 = (o1) arrayList2.get(i16);
                    if (!o1Var3.h() && o1Var3.c() == i10 && !o1Var3.f()) {
                        arrayList2.remove(i16);
                        break;
                    }
                    i16++;
                }
            } else {
                o1 U2 = RecyclerView.U(view);
                a5.n nVar = recyclerView.e;
                c cVar = (c) nVar.c;
                int indexOfChild = ((RecyclerView) ((a9.i) nVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.I(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.x(indexOfChild);
                nVar.z(view);
                a5.n nVar2 = recyclerView.e;
                c cVar2 = (c) nVar2.c;
                int indexOfChild2 = ((RecyclerView) ((a9.i) nVar2.b).b).indexOfChild(view);
                int z13 = (indexOfChild2 == -1 || cVar2.I(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.z(indexOfChild2);
                if (z13 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.k(z13);
                i(view);
                U2.a(8224);
                o1Var3 = U2;
            }
            if (o1Var3 != null) {
                if (o1Var3.j()) {
                    z12 = l1Var.g;
                } else {
                    int i17 = o1Var3.c;
                    if (i17 < 0 || i17 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + o1Var3 + recyclerView.C());
                    }
                    if (l1Var.g || recyclerView.w.j(o1Var3.c) == o1Var3.f) {
                        q0 q0Var = recyclerView.w;
                        if (!q0Var.b || o1Var3.e == q0Var.i(o1Var3.c)) {
                            z12 = true;
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    o1Var = o1Var3;
                    z10 = true;
                } else {
                    o1Var3.a(4);
                    if (o1Var3.k()) {
                        recyclerView.removeDetachedView(o1Var3.a, false);
                        o1Var3.p.k(o1Var3);
                    } else if (o1Var3.s()) {
                        o1Var3.l &= -33;
                    }
                    h(o1Var3);
                    o1Var = null;
                }
            } else {
                o1Var = o1Var3;
            }
        }
        if (o1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder p9 = com.google.android.recaptcha.internal.a.p("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                p9.append(l1Var.b());
                p9.append(recyclerView.C());
                throw new IndexOutOfBoundsException(p9.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            q0 q0Var2 = recyclerView.w;
            if (q0Var2.b) {
                long i18 = q0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        o1 o1Var5 = (o1) arrayList.get(size5);
                        long j14 = o1Var5.e;
                        View view2 = o1Var5.a;
                        if (j14 == i18 && !o1Var5.s()) {
                            if (j13 == o1Var5.f) {
                                o1Var5.a(32);
                                if (o1Var5.j() && !l1Var.g) {
                                    o1Var5.p(2, 14);
                                }
                                o1Var = o1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                o1 U3 = RecyclerView.U(view2);
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
                            o1 o1Var6 = (o1) arrayList2.get(size6);
                            if (o1Var6.e != i18 || o1Var6.f()) {
                                size6--;
                            } else if (j13 == o1Var6.f) {
                                arrayList2.remove(size6);
                                o1Var = o1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        o1Var = null;
                    }
                }
                if (o1Var != null) {
                    o1Var.c = g11;
                    z10 = true;
                }
            }
            if (o1Var == null) {
                c1 c1Var = (c1) c().a.get(j13);
                if (c1Var != null) {
                    ArrayList arrayList5 = c1Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((o1) arrayList5.get(size7)).f()) {
                                o1Var2 = (o1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                o1Var2 = null;
                if (o1Var2 != null) {
                    o1Var2.o();
                    int[] iArr = RecyclerView.L0;
                }
                o1Var = o1Var2;
            }
            if (o1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((d1) this.g).b(j13).c;
                    if (!(j15 == 0 || j15 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                o1Var = recyclerView.w.g(recyclerView, j13);
                if (RecyclerView.O0 && (J = RecyclerView.J(o1Var.a)) != null) {
                    o1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                c1 b10 = ((d1) this.g).b(j13);
                long j16 = b10.c;
                if (j16 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j16 / 4) * 3);
                }
                b10.c = nanoTime2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
            j11 = 3;
            j12 = 4;
        }
        View view3 = o1Var.a;
        if (z10 && !l1Var.g && o1Var.e(8192)) {
            o1Var.p(0, 8192);
            if (l1Var.j) {
                recyclerView.n0(o1Var, recyclerView.V.l(l1Var, o1Var, v0.b(o1Var) | 4096, o1Var.d()));
            }
        }
        if (!l1Var.g || !o1Var.g()) {
            if (o1Var.g()) {
                if (!((o1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i10, 0);
            o1Var.t = recyclerView;
            int i19 = o1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((d1) this.g).b(i19).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    z11 = false;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        y0Var = (y0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(y0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        y0Var = (y0) layoutParams;
                    } else {
                        y0Var = (y0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(y0Var);
                    }
                    y0Var.a = o1Var;
                    y0Var.d = !z10 && z11;
                    return o1Var;
                }
            }
            q0 q0Var3 = recyclerView.w;
            q0Var3.getClass();
            o1Var.c = g12;
            if (q0Var3.b) {
                o1Var.e = q0Var3.i(g12);
            }
            o1Var.p(1, 519);
            int i20 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            q0Var3.w(o1Var, g12, o1Var.d());
            ArrayList arrayList6 = o1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            o1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof y0) {
                ((y0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            c1 b11 = ((d1) this.g).b(o1Var.f);
            long j18 = b11.d;
            if (j18 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j18 / j12) * j11);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.K;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = r0.j0.a;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d = r0.j0.d(view3);
                r0.b bVar2 = d == null ? bVar : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    o1Var.a(16384);
                    r0.j0.k(view3, recyclerView.w0.e);
                }
            }
            if (l1Var.g) {
                o1Var.g = i10;
            }
            z11 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            y0Var.a = o1Var;
            y0Var.d = !z10 && z11;
            return o1Var;
        }
        o1Var.g = i10;
        z11 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        y0Var.a = o1Var;
        y0Var.d = !z10 && z11;
        return o1Var;
    }

    public void k(o1 o1Var) {
        if (o1Var.q) {
            ((ArrayList) this.d).remove(o1Var);
        } else {
            ((ArrayList) this.c).remove(o1Var);
        }
        o1Var.p = null;
        o1Var.q = false;
        o1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        x0 x0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (x0Var != null ? x0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public e1(RecyclerView recyclerView) {
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
