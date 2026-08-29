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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d1 {
    public int a;
    public int b;
    public final Serializable c;
    public Object d;
    public final Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public d1(Uri uri, String str, String str2) {
        this.c = str;
        this.d = uri;
        this.e = str2;
    }

    public void a(n1 n1Var, boolean z10) {
        RecyclerView.m(n1Var);
        if (n1Var.e(16384)) {
            n1Var.p(0, 16384);
            r0.j0.k(n1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            p0 p0Var = recyclerView.w;
            if (p0Var != null) {
                p0Var.A(n1Var);
            }
            if (recyclerView.p0 != null) {
                recyclerView.f.U(n1Var);
            }
        }
        n1Var.t = null;
        c1 c3 = c();
        c3.getClass();
        int i10 = n1Var.f;
        ArrayList arrayList = c3.b(i10).a;
        if (((b1) c3.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        n1Var.o();
        arrayList.add(n1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.p0.b()) {
            return !recyclerView.p0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder o10 = j7.l1.o(i10, "invalid position ", ". State item count is ");
        o10.append(recyclerView.p0.b());
        o10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public c1 c() {
        if (((c1) this.g) == null) {
            this.g = new c1();
        }
        return (c1) this.g;
    }

    public void d(p0 p0Var, p0 p0Var2) {
        ((ArrayList) this.c).clear();
        e();
        c1 c3 = c();
        if (p0Var != null) {
            c3.b--;
        }
        if (c3.b == 0) {
            c3.a();
        }
        if (p0Var2 != null) {
            c3.b++;
        } else {
            c3.getClass();
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
        a((n1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        n1 U = RecyclerView.U(view);
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
    public void h(n1 n1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
        boolean k9 = n1Var.k();
        View view = n1Var.a;
        boolean z12 = true;
        if (k9 || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(n1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (n1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + n1Var + recyclerView.C());
        }
        if (n1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((n1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (n1Var.i()) {
                    if (this.b <= 0 || n1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.O0 && size > 0) {
                            int i10 = n1Var.c;
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
                                int i14 = ((n1) arrayList.get(i13)).c;
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
                        arrayList.add(size, n1Var);
                        z11 = true;
                    }
                    if (!z11) {
                        a(n1Var, true);
                        r5 = z11;
                        recyclerView.f.U(n1Var);
                        if (r5 || z12 || !z10) {
                            return;
                        }
                        n1Var.t = null;
                        return;
                    }
                    r5 = z11;
                }
                z12 = false;
                recyclerView.f.U(n1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z10 = false;
        if (n1Var.i()) {
        }
        z12 = false;
        recyclerView.f.U(n1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        u0 u0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        n1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (u0Var = recyclerView.V) != null && !u0Var.c(U, U.d())) {
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
    public n1 j(int i10, long j10) {
        boolean z10;
        n1 n1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        x0 x0Var;
        RecyclerView J;
        n1 n1Var2;
        View view;
        n1 n1Var3;
        boolean z12;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        k1 k1Var = recyclerView.p0;
        if (i10 < 0 || i10 >= k1Var.b()) {
            StringBuilder o10 = com.google.android.recaptcha.internal.a.o("Invalid item position ", i10, "(", i10, "). Item count:");
            o10.append(k1Var.b());
            o10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(o10.toString());
        }
        if (k1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        n1Var = (n1) ((ArrayList) this.d).get(i11);
                        if (!n1Var.s() && n1Var.c() == i10) {
                            n1Var.a(32);
                            break;
                        }
                        i11++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i12 = recyclerView.w.i(g10);
                        for (int i13 = 0; i13 < size; i13++) {
                            n1 n1Var4 = (n1) ((ArrayList) this.d).get(i13);
                            if (!n1Var4.s() && n1Var4.e == i12) {
                                n1Var4.a(32);
                                n1Var = n1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            n1Var = null;
            z10 = n1Var != null;
        } else {
            z10 = false;
            n1Var = null;
        }
        if (n1Var == null) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                n1Var3 = (n1) arrayList.get(i14);
                if (!n1Var3.s() && n1Var3.c() == i10 && !n1Var3.h() && (k1Var.g || !n1Var3.j())) {
                    n1Var3.a(32);
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
                n1 U = RecyclerView.U(view);
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
                        n1Var3 = null;
                        break;
                    }
                    n1Var3 = (n1) arrayList2.get(i16);
                    if (!n1Var3.h() && n1Var3.c() == i10 && !n1Var3.f()) {
                        arrayList2.remove(i16);
                        break;
                    }
                    i16++;
                }
            } else {
                n1 U2 = RecyclerView.U(view);
                androidx.biometric.e eVar = recyclerView.e;
                c cVar = (c) eVar.c;
                int indexOfChild = ((RecyclerView) ((ag.o1) eVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.D(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.x(indexOfChild);
                eVar.B(view);
                androidx.biometric.e eVar2 = recyclerView.e;
                c cVar2 = (c) eVar2.c;
                int indexOfChild2 = ((RecyclerView) ((ag.o1) eVar2.b).b).indexOfChild(view);
                int A = (indexOfChild2 == -1 || cVar2.D(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.A(indexOfChild2);
                if (A == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.j(A);
                i(view);
                U2.a(8224);
                n1Var3 = U2;
            }
            if (n1Var3 != null) {
                if (n1Var3.j()) {
                    z12 = k1Var.g;
                } else {
                    int i17 = n1Var3.c;
                    if (i17 < 0 || i17 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + n1Var3 + recyclerView.C());
                    }
                    if (k1Var.g || recyclerView.w.j(n1Var3.c) == n1Var3.f) {
                        p0 p0Var = recyclerView.w;
                        if (!p0Var.b || n1Var3.e == p0Var.i(n1Var3.c)) {
                            z12 = true;
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    n1Var = n1Var3;
                    z10 = true;
                } else {
                    n1Var3.a(4);
                    if (n1Var3.k()) {
                        recyclerView.removeDetachedView(n1Var3.a, false);
                        n1Var3.p.k(n1Var3);
                    } else if (n1Var3.s()) {
                        n1Var3.l &= -33;
                    }
                    h(n1Var3);
                    n1Var = null;
                }
            } else {
                n1Var = n1Var3;
            }
        }
        if (n1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder o11 = com.google.android.recaptcha.internal.a.o("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                o11.append(k1Var.b());
                o11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(o11.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            p0 p0Var2 = recyclerView.w;
            if (p0Var2.b) {
                long i18 = p0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        n1 n1Var5 = (n1) arrayList.get(size5);
                        long j14 = n1Var5.e;
                        View view2 = n1Var5.a;
                        if (j14 == i18 && !n1Var5.s()) {
                            if (j13 == n1Var5.f) {
                                n1Var5.a(32);
                                if (n1Var5.j() && !k1Var.g) {
                                    n1Var5.p(2, 14);
                                }
                                n1Var = n1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                n1 U3 = RecyclerView.U(view2);
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
                            n1 n1Var6 = (n1) arrayList2.get(size6);
                            if (n1Var6.e != i18 || n1Var6.f()) {
                                size6--;
                            } else if (j13 == n1Var6.f) {
                                arrayList2.remove(size6);
                                n1Var = n1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        n1Var = null;
                    }
                }
                if (n1Var != null) {
                    n1Var.c = g11;
                    z10 = true;
                }
            }
            if (n1Var == null) {
                b1 b1Var = (b1) c().a.get(j13);
                if (b1Var != null) {
                    ArrayList arrayList5 = b1Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((n1) arrayList5.get(size7)).f()) {
                                n1Var2 = (n1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                n1Var2 = null;
                if (n1Var2 != null) {
                    n1Var2.o();
                    int[] iArr = RecyclerView.L0;
                }
                n1Var = n1Var2;
            }
            if (n1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((c1) this.g).b(j13).c;
                    if (!(j15 == 0 || j15 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                n1Var = recyclerView.w.g(recyclerView, j13);
                if (RecyclerView.O0 && (J = RecyclerView.J(n1Var.a)) != null) {
                    n1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                b1 b10 = ((c1) this.g).b(j13);
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
        View view3 = n1Var.a;
        if (z10 && !k1Var.g && n1Var.e(8192)) {
            n1Var.p(0, 8192);
            if (k1Var.j) {
                recyclerView.n0(n1Var, recyclerView.V.l(k1Var, n1Var, u0.b(n1Var) | 4096, n1Var.d()));
            }
        }
        if (!k1Var.g || !n1Var.g()) {
            if (n1Var.g()) {
                if (!((n1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i10, 0);
            n1Var.t = recyclerView;
            int i19 = n1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((c1) this.g).b(i19).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    z11 = false;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        x0Var = (x0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(x0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        x0Var = (x0) layoutParams;
                    } else {
                        x0Var = (x0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(x0Var);
                    }
                    x0Var.a = n1Var;
                    x0Var.d = !z10 && z11;
                    return n1Var;
                }
            }
            p0 p0Var3 = recyclerView.w;
            p0Var3.getClass();
            n1Var.c = g12;
            if (p0Var3.b) {
                n1Var.e = p0Var3.i(g12);
            }
            n1Var.p(1, 519);
            int i20 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            p0Var3.w(n1Var, g12, n1Var.d());
            ArrayList arrayList6 = n1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            n1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof x0) {
                ((x0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            b1 b11 = ((c1) this.g).b(n1Var.f);
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
                    n1Var.a(16384);
                    r0.j0.k(view3, recyclerView.w0.e);
                }
            }
            if (k1Var.g) {
                n1Var.g = i10;
            }
            z11 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            x0Var.a = n1Var;
            x0Var.d = !z10 && z11;
            return n1Var;
        }
        n1Var.g = i10;
        z11 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        x0Var.a = n1Var;
        x0Var.d = !z10 && z11;
        return n1Var;
    }

    public void k(n1 n1Var) {
        if (n1Var.q) {
            ((ArrayList) this.d).remove(n1Var);
        } else {
            ((ArrayList) this.c).remove(n1Var);
        }
        n1Var.p = null;
        n1Var.q = false;
        n1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        w0 w0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (w0Var != null ? w0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public d1(RecyclerView recyclerView) {
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
