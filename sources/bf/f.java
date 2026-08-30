package bf;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.datastore.preferences.protobuf.i;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.b1;
import f2.i1;
import f2.l1;
import f2.o0;
import f2.t0;
import f2.v0;
import f2.w0;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kh.a2;
import r0.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f {
    public int a;
    public int b;
    public final Serializable c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;

    public f(Uri uri, String str, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }

    public void a(l1 l1Var, boolean z4) {
        RecyclerView.m(l1Var);
        if (l1Var.e(16384)) {
            l1Var.p(0, 16384);
            j0.k(l1Var.a, null);
        }
        if (z4) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            o0 o0Var = recyclerView.w;
            if (o0Var != null) {
                o0Var.A(l1Var);
            }
            if (recyclerView.q0 != null) {
                recyclerView.f.b0(l1Var);
            }
        }
        l1Var.t = null;
        b1 c3 = c();
        c3.getClass();
        int i10 = l1Var.f;
        ArrayList arrayList = c3.b(i10).a;
        if (((a1) c3.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        l1Var.o();
        arrayList.add(l1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.q0.b()) {
            return !recyclerView.q0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder m9 = a2.m(i10, "invalid position ", ". State item count is ");
        m9.append(recyclerView.q0.b());
        m9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public b1 c() {
        if (((b1) this.g) == null) {
            this.g = new b1();
        }
        return (b1) this.g;
    }

    public void d(o0 o0Var, o0 o0Var2) {
        ((ArrayList) this.c).clear();
        e();
        b1 c3 = c();
        if (o0Var != null) {
            c3.b--;
        }
        if (c3.b == 0) {
            c3.a();
        }
        if (o0Var2 != null) {
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
        if (RecyclerView.P0) {
            i iVar = ((RecyclerView) this.h).p0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((l1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.k(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        h(U);
        if (recyclerView.W == null || U.i()) {
            return;
        }
        recyclerView.W.f(U);
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
    public void h(l1 l1Var) {
        boolean z4;
        boolean z10;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        i iVar = recyclerView.p0;
        boolean k10 = l1Var.k();
        View view = l1Var.a;
        boolean z11 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(l1Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (l1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + l1Var + recyclerView.C());
        }
        if (l1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((l1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = j0.a;
            if (view.hasTransientState()) {
                z4 = true;
                if (l1Var.i()) {
                    if (this.b <= 0 || l1Var.e(526)) {
                        z10 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.P0 && size > 0) {
                            int i10 = l1Var.c;
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
                                int i14 = ((l1) arrayList.get(i13)).c;
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
                        arrayList.add(size, l1Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(l1Var, true);
                        r5 = z10;
                        recyclerView.f.b0(l1Var);
                        if (r5 || z11 || !z4) {
                            return;
                        }
                        l1Var.t = null;
                        return;
                    }
                    r5 = z10;
                }
                z11 = false;
                recyclerView.f.b0(l1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z4 = false;
        if (l1Var.i()) {
        }
        z11 = false;
        recyclerView.f.b0(l1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        t0 t0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (t0Var = recyclerView.W) != null && !t0Var.c(U, U.d())) {
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
    public l1 j(int i10, long j10) {
        boolean z4;
        l1 l1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        ViewGroup.LayoutParams layoutParams;
        w0 w0Var;
        RecyclerView J;
        l1 l1Var2;
        View view;
        l1 l1Var3;
        boolean z11;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        i1 i1Var = recyclerView.q0;
        if (i10 < 0 || i10 >= i1Var.b()) {
            StringBuilder m9 = e2.c.m("Invalid item position ", i10, "(", i10, "). Item count:");
            m9.append(i1Var.b());
            m9.append(recyclerView.C());
            throw new IndexOutOfBoundsException(m9.toString());
        }
        if (i1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        l1Var = (l1) ((ArrayList) this.d).get(i11);
                        if (!l1Var.s() && l1Var.c() == i10) {
                            l1Var.a(32);
                            break;
                        }
                        i11++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i12 = recyclerView.w.i(g10);
                        for (int i13 = 0; i13 < size; i13++) {
                            l1 l1Var4 = (l1) ((ArrayList) this.d).get(i13);
                            if (!l1Var4.s() && l1Var4.e == i12) {
                                l1Var4.a(32);
                                l1Var = l1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            l1Var = null;
            z4 = l1Var != null;
        } else {
            z4 = false;
            l1Var = null;
        }
        if (l1Var == null) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                l1Var3 = (l1) arrayList.get(i14);
                if (!l1Var3.s() && l1Var3.c() == i10 && !l1Var3.h() && (i1Var.g || !l1Var3.j())) {
                    l1Var3.a(32);
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
                l1 U = RecyclerView.U(view);
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
                        l1Var3 = null;
                        break;
                    }
                    l1Var3 = (l1) arrayList2.get(i16);
                    if (!l1Var3.h() && l1Var3.c() == i10 && !l1Var3.f()) {
                        arrayList2.remove(i16);
                        break;
                    }
                    i16++;
                }
            } else {
                l1 U2 = RecyclerView.U(view);
                androidx.biometric.e eVar = recyclerView.e;
                f2.c cVar = (f2.c) eVar.c;
                int indexOfChild = ((RecyclerView) ((a3.c) eVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.C(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.y(indexOfChild);
                eVar.C(view);
                androidx.biometric.e eVar2 = recyclerView.e;
                f2.c cVar2 = (f2.c) eVar2.c;
                int indexOfChild2 = ((RecyclerView) ((a3.c) eVar2.b).b).indexOfChild(view);
                int z12 = (indexOfChild2 == -1 || cVar2.C(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.z(indexOfChild2);
                if (z12 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.l(z12);
                i(view);
                U2.a(8224);
                l1Var3 = U2;
            }
            if (l1Var3 != null) {
                if (l1Var3.j()) {
                    z11 = i1Var.g;
                } else {
                    int i17 = l1Var3.c;
                    if (i17 < 0 || i17 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + l1Var3 + recyclerView.C());
                    }
                    if (i1Var.g || recyclerView.w.j(l1Var3.c) == l1Var3.f) {
                        o0 o0Var = recyclerView.w;
                        if (!o0Var.b || l1Var3.e == o0Var.i(l1Var3.c)) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    l1Var = l1Var3;
                    z4 = true;
                } else {
                    l1Var3.a(4);
                    if (l1Var3.k()) {
                        recyclerView.removeDetachedView(l1Var3.a, false);
                        l1Var3.p.k(l1Var3);
                    } else if (l1Var3.s()) {
                        l1Var3.l &= -33;
                    }
                    h(l1Var3);
                    l1Var = null;
                }
            } else {
                l1Var = l1Var3;
            }
        }
        if (l1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder m10 = e2.c.m("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                m10.append(i1Var.b());
                m10.append(recyclerView.C());
                throw new IndexOutOfBoundsException(m10.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            o0 o0Var2 = recyclerView.w;
            if (o0Var2.b) {
                long i18 = o0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        l1 l1Var5 = (l1) arrayList.get(size5);
                        long j14 = l1Var5.e;
                        View view2 = l1Var5.a;
                        if (j14 == i18 && !l1Var5.s()) {
                            if (j13 == l1Var5.f) {
                                l1Var5.a(32);
                                if (l1Var5.j() && !i1Var.g) {
                                    l1Var5.p(2, 14);
                                }
                                l1Var = l1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                l1 U3 = RecyclerView.U(view2);
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
                            l1 l1Var6 = (l1) arrayList2.get(size6);
                            if (l1Var6.e != i18 || l1Var6.f()) {
                                size6--;
                            } else if (j13 == l1Var6.f) {
                                arrayList2.remove(size6);
                                l1Var = l1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        l1Var = null;
                    }
                }
                if (l1Var != null) {
                    l1Var.c = g11;
                    z4 = true;
                }
            }
            if (l1Var == null) {
                a1 a1Var = (a1) c().a.get(j13);
                if (a1Var != null) {
                    ArrayList arrayList5 = a1Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((l1) arrayList5.get(size7)).f()) {
                                l1Var2 = (l1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                l1Var2 = null;
                if (l1Var2 != null) {
                    l1Var2.o();
                    int[] iArr = RecyclerView.M0;
                }
                l1Var = l1Var2;
            }
            if (l1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((b1) this.g).b(j13).c;
                    if (!(j15 == 0 || j15 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                l1Var = recyclerView.w.g(recyclerView, j13);
                if (RecyclerView.P0 && (J = RecyclerView.J(l1Var.a)) != null) {
                    l1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                a1 b10 = ((b1) this.g).b(j13);
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
        View view3 = l1Var.a;
        if (z4 && !i1Var.g && l1Var.e(8192)) {
            l1Var.p(0, 8192);
            if (i1Var.j) {
                recyclerView.n0(l1Var, recyclerView.W.l(i1Var, l1Var, t0.b(l1Var) | 4096, l1Var.d()));
            }
        }
        if (!i1Var.g || !l1Var.g()) {
            if (l1Var.g()) {
                if (!((l1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i10, 0);
            l1Var.t = recyclerView;
            int i19 = l1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((b1) this.g).b(i19).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    z10 = false;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        w0Var = (w0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(w0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        w0Var = (w0) layoutParams;
                    } else {
                        w0Var = (w0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(w0Var);
                    }
                    w0Var.a = l1Var;
                    w0Var.d = !z4 && z10;
                    return l1Var;
                }
            }
            o0 o0Var3 = recyclerView.w;
            o0Var3.getClass();
            l1Var.c = g12;
            if (o0Var3.b) {
                l1Var.e = o0Var3.i(g12);
            }
            l1Var.p(1, 519);
            int i20 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            o0Var3.w(l1Var, g12, l1Var.d());
            ArrayList arrayList6 = l1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            l1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof w0) {
                ((w0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            a1 b11 = ((b1) this.g).b(l1Var.f);
            long j18 = b11.d;
            if (j18 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j18 / j12) * j11);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.L;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = j0.a;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d = j0.d(view3);
                r0.b bVar2 = d == null ? bVar : d instanceof r0.a ? ((r0.a) d).a : new r0.b(d);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    l1Var.a(16384);
                    j0.k(view3, recyclerView.x0.e);
                }
            }
            if (i1Var.g) {
                l1Var.g = i10;
            }
            z10 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            w0Var.a = l1Var;
            w0Var.d = !z4 && z10;
            return l1Var;
        }
        l1Var.g = i10;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        w0Var.a = l1Var;
        w0Var.d = !z4 && z10;
        return l1Var;
    }

    public void k(l1 l1Var) {
        if (l1Var.q) {
            ((ArrayList) this.d).remove(l1Var);
        } else {
            ((ArrayList) this.c).remove(l1Var);
        }
        l1Var.p = null;
        l1Var.q = false;
        l1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        v0 v0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (v0Var != null ? v0Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            f(size);
        }
    }

    public f(RecyclerView recyclerView) {
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
