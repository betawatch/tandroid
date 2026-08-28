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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g1 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public g1(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(q1 q1Var, boolean z10) {
        RecyclerView.m(q1Var);
        if (q1Var.e(16384)) {
            q1Var.p(0, 16384);
            r0.j0.k(q1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            r0 r0Var = recyclerView.w;
            if (r0Var != null) {
                r0Var.A(q1Var);
            }
            if (recyclerView.p0 != null) {
                recyclerView.f.L(q1Var);
            }
        }
        q1Var.t = null;
        f1 c10 = c();
        c10.getClass();
        int i9 = q1Var.f;
        ArrayList arrayList = c10.b(i9).a;
        if (((e1) c10.a.get(i9)).b <= arrayList.size()) {
            return;
        }
        q1Var.o();
        arrayList.add(q1Var);
    }

    public int b(int i9) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i9 >= 0 && i9 < recyclerView.p0.b()) {
            return !recyclerView.p0.g ? i9 : recyclerView.d.g(i9, 0);
        }
        StringBuilder p6 = j3.r0.p(i9, "invalid position ", ". State item count is ");
        p6.append(recyclerView.p0.b());
        p6.append(recyclerView.C());
        throw new IndexOutOfBoundsException(p6.toString());
    }

    public f1 c() {
        if (((f1) this.g) == null) {
            this.g = new f1();
        }
        return (f1) this.g;
    }

    public void d(r0 r0Var, r0 r0Var2) {
        ((ArrayList) this.c).clear();
        e();
        f1 c10 = c();
        if (r0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (r0Var2 != null) {
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

    public void f(int i9) {
        ArrayList arrayList = (ArrayList) this.e;
        a((q1) arrayList.get(i9), true);
        arrayList.remove(i9);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        q1 U = RecyclerView.U(view);
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
    public void h(q1 q1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
        boolean k10 = q1Var.k();
        View view = q1Var.a;
        boolean z12 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(q1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (q1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + q1Var + recyclerView.C());
        }
        if (q1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((q1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (q1Var.i()) {
                    if (this.b <= 0 || q1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.O0 && size > 0) {
                            int i9 = q1Var.c;
                            if (((int[]) iVar.d) != null) {
                                int i10 = iVar.c * 2;
                                for (int i11 = 0; i11 < i10; i11 += 2) {
                                    if (((int[]) iVar.d)[i11] == i9) {
                                        break;
                                    }
                                }
                            }
                            int i12 = size - 1;
                            loop1: while (i12 >= 0) {
                                int i13 = ((q1) arrayList.get(i12)).c;
                                if (((int[]) iVar.d) == null) {
                                    break;
                                }
                                int i14 = iVar.c * 2;
                                for (int i15 = 0; i15 < i14; i15 += 2) {
                                    if (((int[]) iVar.d)[i15] == i13) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i12 + 1;
                        }
                        arrayList.add(size, q1Var);
                        z11 = true;
                    }
                    if (!z11) {
                        a(q1Var, true);
                        r5 = z11;
                        recyclerView.f.L(q1Var);
                        if (r5 || z12 || !z10) {
                            return;
                        }
                        q1Var.t = null;
                        return;
                    }
                    r5 = z11;
                }
                z12 = false;
                recyclerView.f.L(q1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z10 = false;
        if (q1Var.i()) {
        }
        z12 = false;
        recyclerView.f.L(q1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        w0 w0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        q1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (w0Var = recyclerView.V) != null && !w0Var.c(U, U.d())) {
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
    public q1 j(int i9, long j10) {
        boolean z10;
        q1 q1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        a1 a1Var;
        RecyclerView J;
        q1 q1Var2;
        View view;
        q1 q1Var3;
        boolean z12;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        n1 n1Var = recyclerView.p0;
        if (i9 < 0 || i9 >= n1Var.b()) {
            StringBuilder o6 = e2.c.o("Invalid item position ", i9, "(", i9, "). Item count:");
            o6.append(n1Var.b());
            o6.append(recyclerView.C());
            throw new IndexOutOfBoundsException(o6.toString());
        }
        if (n1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        q1Var = (q1) ((ArrayList) this.d).get(i10);
                        if (!q1Var.s() && q1Var.c() == i9) {
                            q1Var.a(32);
                            break;
                        }
                        i10++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i9, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i11 = recyclerView.w.i(g10);
                        for (int i12 = 0; i12 < size; i12++) {
                            q1 q1Var4 = (q1) ((ArrayList) this.d).get(i12);
                            if (!q1Var4.s() && q1Var4.e == i11) {
                                q1Var4.a(32);
                                q1Var = q1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            q1Var = null;
            z10 = q1Var != null;
        } else {
            z10 = false;
            q1Var = null;
        }
        if (q1Var == null) {
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                q1Var3 = (q1) arrayList.get(i13);
                if (!q1Var3.s() && q1Var3.c() == i9 && !q1Var3.h() && (n1Var.g || !q1Var3.j())) {
                    q1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i14);
                q1 U = RecyclerView.U(view);
                if (U.c() == i9 && !U.h() && !U.j()) {
                    break;
                }
                i14++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        q1Var3 = null;
                        break;
                    }
                    q1Var3 = (q1) arrayList2.get(i15);
                    if (!q1Var3.h() && q1Var3.c() == i9 && !q1Var3.f()) {
                        arrayList2.remove(i15);
                        break;
                    }
                    i15++;
                }
            } else {
                q1 U2 = RecyclerView.U(view);
                a5.m mVar = recyclerView.e;
                d dVar = (d) mVar.c;
                int indexOfChild = ((RecyclerView) ((k5.i) mVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!dVar.H(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                dVar.D(indexOfChild);
                mVar.B(view);
                a5.m mVar2 = recyclerView.e;
                d dVar2 = (d) mVar2.c;
                int indexOfChild2 = ((RecyclerView) ((k5.i) mVar2.b).b).indexOfChild(view);
                int E = (indexOfChild2 == -1 || dVar2.H(indexOfChild2)) ? -1 : indexOfChild2 - dVar2.E(indexOfChild2);
                if (E == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.j(E);
                i(view);
                U2.a(8224);
                q1Var3 = U2;
            }
            if (q1Var3 != null) {
                if (q1Var3.j()) {
                    z12 = n1Var.g;
                } else {
                    int i16 = q1Var3.c;
                    if (i16 < 0 || i16 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + q1Var3 + recyclerView.C());
                    }
                    if (n1Var.g || recyclerView.w.j(q1Var3.c) == q1Var3.f) {
                        r0 r0Var = recyclerView.w;
                        if (!r0Var.b || q1Var3.e == r0Var.i(q1Var3.c)) {
                            z12 = true;
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    q1Var = q1Var3;
                    z10 = true;
                } else {
                    q1Var3.a(4);
                    if (q1Var3.k()) {
                        recyclerView.removeDetachedView(q1Var3.a, false);
                        q1Var3.p.k(q1Var3);
                    } else if (q1Var3.s()) {
                        q1Var3.l &= -33;
                    }
                    h(q1Var3);
                    q1Var = null;
                }
            } else {
                q1Var = q1Var3;
            }
        }
        if (q1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i9, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder o9 = e2.c.o("Inconsistency detected. Invalid item position ", i9, "(offset:", g11, ").state:");
                o9.append(n1Var.b());
                o9.append(recyclerView.C());
                throw new IndexOutOfBoundsException(o9.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            r0 r0Var2 = recyclerView.w;
            if (r0Var2.b) {
                long i17 = r0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        q1 q1Var5 = (q1) arrayList.get(size5);
                        long j14 = q1Var5.e;
                        View view2 = q1Var5.a;
                        if (j14 == i17 && !q1Var5.s()) {
                            if (j13 == q1Var5.f) {
                                q1Var5.a(32);
                                if (q1Var5.j() && !n1Var.g) {
                                    q1Var5.p(2, 14);
                                }
                                q1Var = q1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                q1 U3 = RecyclerView.U(view2);
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
                            q1 q1Var6 = (q1) arrayList2.get(size6);
                            if (q1Var6.e != i17 || q1Var6.f()) {
                                size6--;
                            } else if (j13 == q1Var6.f) {
                                arrayList2.remove(size6);
                                q1Var = q1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        q1Var = null;
                    }
                }
                if (q1Var != null) {
                    q1Var.c = g11;
                    z10 = true;
                }
            }
            if (q1Var == null) {
                e1 e1Var = (e1) c().a.get(j13);
                if (e1Var != null) {
                    ArrayList arrayList5 = e1Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((q1) arrayList5.get(size7)).f()) {
                                q1Var2 = (q1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                q1Var2 = null;
                if (q1Var2 != null) {
                    q1Var2.o();
                    int[] iArr = RecyclerView.L0;
                }
                q1Var = q1Var2;
            }
            if (q1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((f1) this.g).b(j13).c;
                    if (!(j15 == 0 || j15 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                q1Var = recyclerView.w.g(recyclerView, j13);
                if (RecyclerView.O0 && (J = RecyclerView.J(q1Var.a)) != null) {
                    q1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                e1 b10 = ((f1) this.g).b(j13);
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
        View view3 = q1Var.a;
        if (z10 && !n1Var.g && q1Var.e(8192)) {
            q1Var.p(0, 8192);
            if (n1Var.j) {
                recyclerView.n0(q1Var, recyclerView.V.l(n1Var, q1Var, w0.b(q1Var) | 4096, q1Var.d()));
            }
        }
        if (!n1Var.g || !q1Var.g()) {
            if (q1Var.g()) {
                if (!((q1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i9, 0);
            q1Var.t = recyclerView;
            int i18 = q1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((f1) this.g).b(i18).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    z11 = false;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        a1Var = (a1) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(a1Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        a1Var = (a1) layoutParams;
                    } else {
                        a1Var = (a1) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(a1Var);
                    }
                    a1Var.a = q1Var;
                    a1Var.d = !z10 && z11;
                    return q1Var;
                }
            }
            r0 r0Var3 = recyclerView.w;
            r0Var3.getClass();
            q1Var.c = g12;
            if (r0Var3.b) {
                q1Var.e = r0Var3.i(g12);
            }
            q1Var.p(1, 519);
            int i19 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            r0Var3.w(q1Var, g12, q1Var.d());
            ArrayList arrayList6 = q1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            q1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof a1) {
                ((a1) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            e1 b11 = ((f1) this.g).b(q1Var.f);
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
                    q1Var.a(16384);
                    r0.j0.k(view3, recyclerView.w0.e);
                }
            }
            if (n1Var.g) {
                q1Var.g = i9;
            }
            z11 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            a1Var.a = q1Var;
            a1Var.d = !z10 && z11;
            return q1Var;
        }
        q1Var.g = i9;
        z11 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        a1Var.a = q1Var;
        a1Var.d = !z10 && z11;
        return q1Var;
    }

    public void k(q1 q1Var) {
        if (q1Var.q) {
            ((ArrayList) this.d).remove(q1Var);
        } else {
            ((ArrayList) this.c).remove(q1Var);
        }
        q1Var.p = null;
        q1Var.q = false;
        q1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        z0 z0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (z0Var != null ? z0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public g1(RecyclerView recyclerView) {
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
