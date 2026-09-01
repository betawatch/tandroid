package bf;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.datastore.preferences.protobuf.i;
import androidx.recyclerview.widget.RecyclerView;
import f2.b1;
import f2.c1;
import f2.j1;
import f2.m1;
import f2.p0;
import f2.u0;
import f2.w0;
import f2.x0;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import r0.j0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public void a(m1 m1Var, boolean z4) {
        RecyclerView.m(m1Var);
        if (m1Var.e(16384)) {
            m1Var.p(0, 16384);
            j0.k(m1Var.a, null);
        }
        if (z4) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            p0 p0Var = recyclerView.w;
            if (p0Var != null) {
                p0Var.A(m1Var);
            }
            if (recyclerView.q0 != null) {
                recyclerView.f.b0(m1Var);
            }
        }
        m1Var.t = null;
        c1 c3 = c();
        c3.getClass();
        int i10 = m1Var.f;
        ArrayList arrayList = c3.b(i10).a;
        if (((b1) c3.a.get(i10)).b <= arrayList.size()) {
            return;
        }
        m1Var.o();
        arrayList.add(m1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.q0.b()) {
            return !recyclerView.q0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder m9 = l.d.m(i10, "invalid position ", ". State item count is ");
        m9.append(recyclerView.q0.b());
        m9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m9.toString());
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
        a((m1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        m1 U = RecyclerView.U(view);
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
    public void h(m1 m1Var) {
        boolean z4;
        boolean z10;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        i iVar = recyclerView.p0;
        boolean k10 = m1Var.k();
        View view = m1Var.a;
        boolean z11 = true;
        if (k10 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(m1Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (m1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + m1Var + recyclerView.C());
        }
        if (m1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((m1Var.l & 16) == 0) {
            WeakHashMap weakHashMap = j0.a;
            if (view.hasTransientState()) {
                z4 = true;
                if (m1Var.i()) {
                    if (this.b <= 0 || m1Var.e(526)) {
                        z10 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        if (RecyclerView.P0 && size > 0) {
                            int i10 = m1Var.c;
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
                                int i14 = ((m1) arrayList.get(i13)).c;
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
                        arrayList.add(size, m1Var);
                        z10 = true;
                    }
                    if (!z10) {
                        a(m1Var, true);
                        r5 = z10;
                        recyclerView.f.b0(m1Var);
                        if (r5 || z11 || !z4) {
                            return;
                        }
                        m1Var.t = null;
                        return;
                    }
                    r5 = z10;
                }
                z11 = false;
                recyclerView.f.b0(m1Var);
                if (r5) {
                    return;
                } else {
                    return;
                }
            }
        }
        z4 = false;
        if (m1Var.i()) {
        }
        z11 = false;
        recyclerView.f.b0(m1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        u0 u0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        m1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (u0Var = recyclerView.W) != null && !u0Var.c(U, U.d())) {
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
    public m1 j(int i10, long j10) {
        boolean z4;
        m1 m1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        ViewGroup.LayoutParams layoutParams;
        x0 x0Var;
        RecyclerView J;
        m1 m1Var2;
        View view;
        m1 m1Var3;
        boolean z11;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        j1 j1Var = recyclerView.q0;
        if (i10 < 0 || i10 >= j1Var.b()) {
            StringBuilder m9 = e2.c.m("Invalid item position ", i10, "(", i10, "). Item count:");
            m9.append(j1Var.b());
            m9.append(recyclerView.C());
            throw new IndexOutOfBoundsException(m9.toString());
        }
        if (j1Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        m1Var = (m1) ((ArrayList) this.d).get(i11);
                        if (!m1Var.s() && m1Var.c() == i10) {
                            m1Var.a(32);
                            break;
                        }
                        i11++;
                    } else if (recyclerView.w.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.w.h()) {
                        long i12 = recyclerView.w.i(g10);
                        for (int i13 = 0; i13 < size; i13++) {
                            m1 m1Var4 = (m1) ((ArrayList) this.d).get(i13);
                            if (!m1Var4.s() && m1Var4.e == i12) {
                                m1Var4.a(32);
                                m1Var = m1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            m1Var = null;
            z4 = m1Var != null;
        } else {
            z4 = false;
            m1Var = null;
        }
        if (m1Var == null) {
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                m1Var3 = (m1) arrayList.get(i14);
                if (!m1Var3.s() && m1Var3.c() == i10 && !m1Var3.h() && (j1Var.g || !m1Var3.j())) {
                    m1Var3.a(32);
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
                m1 U = RecyclerView.U(view);
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
                        m1Var3 = null;
                        break;
                    }
                    m1Var3 = (m1) arrayList2.get(i16);
                    if (!m1Var3.h() && m1Var3.c() == i10 && !m1Var3.f()) {
                        arrayList2.remove(i16);
                        break;
                    }
                    i16++;
                }
            } else {
                m1 U2 = RecyclerView.U(view);
                androidx.biometric.e eVar = recyclerView.e;
                f2.c cVar = (f2.c) eVar.c;
                int indexOfChild = ((RecyclerView) ((ja.c) eVar.b).a).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.D(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.w(indexOfChild);
                eVar.C(view);
                androidx.biometric.e eVar2 = recyclerView.e;
                f2.c cVar2 = (f2.c) eVar2.c;
                int indexOfChild2 = ((RecyclerView) ((ja.c) eVar2.b).a).indexOfChild(view);
                int y10 = (indexOfChild2 == -1 || cVar2.D(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.y(indexOfChild2);
                if (y10 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.k(y10);
                i(view);
                U2.a(8224);
                m1Var3 = U2;
            }
            if (m1Var3 != null) {
                if (m1Var3.j()) {
                    z11 = j1Var.g;
                } else {
                    int i17 = m1Var3.c;
                    if (i17 < 0 || i17 >= recyclerView.w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + m1Var3 + recyclerView.C());
                    }
                    if (j1Var.g || recyclerView.w.j(m1Var3.c) == m1Var3.f) {
                        p0 p0Var = recyclerView.w;
                        if (!p0Var.b || m1Var3.e == p0Var.i(m1Var3.c)) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    m1Var = m1Var3;
                    z4 = true;
                } else {
                    m1Var3.a(4);
                    if (m1Var3.k()) {
                        recyclerView.removeDetachedView(m1Var3.a, false);
                        m1Var3.p.k(m1Var3);
                    } else if (m1Var3.s()) {
                        m1Var3.l &= -33;
                    }
                    h(m1Var3);
                    m1Var = null;
                }
            } else {
                m1Var = m1Var3;
            }
        }
        if (m1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.w.h()) {
                StringBuilder m10 = e2.c.m("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                m10.append(j1Var.b());
                m10.append(recyclerView.C());
                throw new IndexOutOfBoundsException(m10.toString());
            }
            int j13 = recyclerView.w.j(g11);
            j12 = 4;
            p0 p0Var2 = recyclerView.w;
            if (p0Var2.b) {
                long i18 = p0Var2.i(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        m1 m1Var5 = (m1) arrayList.get(size5);
                        long j14 = m1Var5.e;
                        View view2 = m1Var5.a;
                        if (j14 == i18 && !m1Var5.s()) {
                            if (j13 == m1Var5.f) {
                                m1Var5.a(32);
                                if (m1Var5.j() && !j1Var.g) {
                                    m1Var5.p(2, 14);
                                }
                                m1Var = m1Var5;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                m1 U3 = RecyclerView.U(view2);
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
                            m1 m1Var6 = (m1) arrayList2.get(size6);
                            if (m1Var6.e != i18 || m1Var6.f()) {
                                size6--;
                            } else if (j13 == m1Var6.f) {
                                arrayList2.remove(size6);
                                m1Var = m1Var6;
                            } else {
                                f(size6);
                            }
                        }
                        m1Var = null;
                    }
                }
                if (m1Var != null) {
                    m1Var.c = g11;
                    z4 = true;
                }
            }
            if (m1Var == null) {
                b1 b1Var = (b1) c().a.get(j13);
                if (b1Var != null) {
                    ArrayList arrayList5 = b1Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((m1) arrayList5.get(size7)).f()) {
                                m1Var2 = (m1) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                m1Var2 = null;
                if (m1Var2 != null) {
                    m1Var2.o();
                    int[] iArr = RecyclerView.M0;
                }
                m1Var = m1Var2;
            }
            if (m1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j15 = ((c1) this.g).b(j13).c;
                    if (!(j15 == 0 || j15 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                m1Var = recyclerView.w.g(recyclerView, j13);
                if (RecyclerView.P0 && (J = RecyclerView.J(m1Var.a)) != null) {
                    m1Var.b = new WeakReference(J);
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
        View view3 = m1Var.a;
        if (z4 && !j1Var.g && m1Var.e(8192)) {
            m1Var.p(0, 8192);
            if (j1Var.j) {
                recyclerView.n0(m1Var, recyclerView.W.l(j1Var, m1Var, u0.b(m1Var) | 4096, m1Var.d()));
            }
        }
        if (!j1Var.g || !m1Var.g()) {
            if (m1Var.g()) {
                if (!((m1Var.l & 2) != 0)) {
                }
            }
            int g12 = recyclerView.d.g(i10, 0);
            m1Var.t = recyclerView;
            int i19 = m1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j17 = ((c1) this.g).b(i19).d;
                if (j17 != 0 && j17 + nanoTime3 >= j10) {
                    z10 = false;
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
                    x0Var.a = m1Var;
                    x0Var.d = !z4 && z10;
                    return m1Var;
                }
            }
            p0 p0Var3 = recyclerView.w;
            p0Var3.getClass();
            m1Var.c = g12;
            if (p0Var3.b) {
                m1Var.e = p0Var3.i(g12);
            }
            m1Var.p(1, 519);
            int i20 = n0.g.a;
            Trace.beginSection("RV OnBindView");
            p0Var3.w(m1Var, g12, m1Var.d());
            ArrayList arrayList6 = m1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            m1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof x0) {
                ((x0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            b1 b11 = ((c1) this.g).b(m1Var.f);
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
                    m1Var.a(16384);
                    j0.k(view3, recyclerView.x0.e);
                }
            }
            if (j1Var.g) {
                m1Var.g = i10;
            }
            z10 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            x0Var.a = m1Var;
            x0Var.d = !z4 && z10;
            return m1Var;
        }
        m1Var.g = i10;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        x0Var.a = m1Var;
        x0Var.d = !z4 && z10;
        return m1Var;
    }

    public void k(m1 m1Var) {
        if (m1Var.q) {
            ((ArrayList) this.d).remove(m1Var);
        } else {
            ((ArrayList) this.c).remove(m1Var);
        }
        m1Var.p = null;
        m1Var.q = false;
        m1Var.l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        w0 w0Var = ((RecyclerView) this.h).x;
        this.b = this.a + (w0Var != null ? w0Var.i : 0);
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
