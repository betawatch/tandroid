// default package

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ki2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ki2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(u69 u69Var, boolean z) {
        RecyclerView.m(u69Var);
        if (u69Var.e(TLObject.FLAG_14)) {
            u69Var.p(0, TLObject.FLAG_14);
            kfc.k(u69Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            y59 y59Var = recyclerView.x;
            if (y59Var != null) {
                y59Var.A(u69Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.o(u69Var);
            }
        }
        u69Var.t = null;
        m69 m69Var = (m69) this.g;
        if (m69Var == null) {
            m69Var = new m69();
            this.g = m69Var;
        }
        int i = u69Var.f;
        ArrayList arrayList = m69Var.b(i).a;
        ((l69) m69Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        u69Var.o();
        arrayList.add(u69Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        r69 r69Var = recyclerView.v0;
        if (i >= 0 && i < r69Var.b()) {
            return !r69Var.g ? i : recyclerView.d.f(i, 0);
        }
        StringBuilder l = hg9.l(i, "invalid position ", ". State item count is ");
        l.append(r69Var.b());
        l.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l.toString());
    }

    public final ki2 c(r10 r10Var) {
        return new ki2((go4) this.c, (go4) this.d, this.a, this.b, r10Var, (k30) this.f, (bqb) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((go4) this.c).t, "audio/raw");
    }

    public final void e(y59 y59Var, y59 y59Var2) {
        ((ArrayList) this.c).clear();
        f();
        m69 m69Var = (m69) this.g;
        if (m69Var == null) {
            m69Var = new m69();
            this.g = m69Var;
        }
        if (y59Var != null) {
            m69Var.b--;
        }
        if (m69Var.b == 0) {
            m69Var.a();
        }
        if (y59Var2 != null) {
            m69Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        po poVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = poVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        poVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((u69) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        u69 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.l(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        i(U);
        if (recyclerView.d0 == null || U.i()) {
            return;
        }
        recyclerView.d0.f(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(u69 u69Var) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        po poVar = recyclerView.u0;
        boolean k = u69Var.k();
        View view = u69Var.a;
        boolean z3 = true;
        if (k || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(u69Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (u69Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + u69Var + recyclerView.C());
        }
        if (u69Var.r()) {
            u36.j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
            return;
        }
        if ((u69Var.l & 16) == 0) {
            WeakHashMap weakHashMap = kfc.a;
            if (view.hasTransientState()) {
                z = true;
                if (u69Var.i()) {
                    z3 = false;
                } else {
                    if (this.b <= 0 || u69Var.e(526)) {
                        z2 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            g(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i = u69Var.c;
                            if (poVar.a != null) {
                                int i2 = poVar.d << 1;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (poVar.a[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((u69) arrayList.get(i4)).c;
                                if (poVar.a == null) {
                                    break;
                                }
                                int i6 = poVar.d << 1;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (poVar.a[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, u69Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(u69Var, true);
                    }
                    r5 = z2;
                }
                recyclerView.f.o(u69Var);
                if (r5 && !z3 && z) {
                    u69Var.t = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (u69Var.i()) {
        }
        recyclerView.f.o(u69Var);
        if (r5) {
        }
    }

    public final void j(View view) {
        d69 d69Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        u69 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (d69Var = recyclerView.d0) != null && !d69Var.c(U, U.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            U.p = this;
            U.q = true;
            arrayList.add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.x.b) {
            u36.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u69 k(int i, long j) {
        u69 u69Var;
        int i2;
        int i3;
        u69 u69Var2;
        long j2;
        boolean z;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams;
        g69 g69Var;
        u69 u69Var3;
        View view;
        u69 u69Var4;
        int i6;
        int size;
        int f;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        r69 r69Var = recyclerView.v0;
        if (i < 0 || i >= r69Var.b()) {
            StringBuilder o = ts2.o("Invalid item position ", i, "(", i, "). Item count:");
            o.append(r69Var.b());
            o.append(recyclerView.C());
            throw new IndexOutOfBoundsException(o.toString());
        }
        if (r69Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        u69Var2 = (u69) ((ArrayList) this.d).get(i7);
                        if (!u69Var2.s() && u69Var2.c() == i) {
                            u69Var2.a(32);
                            u69Var = null;
                            i2 = 1;
                            break;
                        }
                        i7++;
                    } else if (recyclerView.x.b && (f = recyclerView.d.f(i, 0)) > 0 && f < recyclerView.x.b()) {
                        long c = recyclerView.x.c(f);
                        for (int i8 = 0; i8 < size; i8++) {
                            u69 u69Var5 = (u69) ((ArrayList) this.d).get(i8);
                            if (!u69Var5.s()) {
                                u69Var = null;
                                i2 = 1;
                                if (u69Var5.e == c) {
                                    u69Var5.a(32);
                                    u69Var2 = u69Var5;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            u69Var = null;
            i2 = 1;
            u69Var2 = null;
            i3 = u69Var2 != null ? i2 : 0;
        } else {
            u69Var = null;
            i2 = 1;
            i3 = 0;
            u69Var2 = null;
        }
        if (u69Var2 == null) {
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                u69Var4 = (u69) arrayList.get(i9);
                if (!u69Var4.s() && u69Var4.c() == i && !u69Var4.h() && (r69Var.g || !u69Var4.j())) {
                    u69Var4.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size3) {
                    view = u69Var;
                    break;
                }
                view = (View) arrayList4.get(i10);
                u69 U = RecyclerView.U(view);
                if (U.c() == i && !U.h() && !U.j()) {
                    break;
                }
                i10++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        u69Var4 = u69Var;
                        break;
                    }
                    u69Var4 = (u69) arrayList2.get(i11);
                    if (!u69Var4.h() && u69Var4.c() == i && !u69Var4.f()) {
                        arrayList2.remove(i11);
                        break;
                    }
                    i11++;
                }
            } else {
                u69 U2 = RecyclerView.U(view);
                mx6 mx6Var = recyclerView.e;
                vh2 vh2Var = (vh2) mx6Var.c;
                int indexOfChild = ((RecyclerView) ((ai4) mx6Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    u36.i(view, "view is not a child, cannot hide ");
                    return u69Var;
                }
                if (!vh2Var.x(indexOfChild)) {
                    rjb.i(view, "trying to unhide a view that was not hidden");
                    return u69Var;
                }
                vh2Var.a(indexOfChild);
                mx6Var.y0(view);
                mx6 mx6Var2 = recyclerView.e;
                vh2 vh2Var2 = (vh2) mx6Var2.c;
                int indexOfChild2 = ((RecyclerView) ((ai4) mx6Var2.b).b).indexOfChild(view);
                int n = (indexOfChild2 == -1 || vh2Var2.x(indexOfChild2)) ? -1 : indexOfChild2 - vh2Var2.n(indexOfChild2);
                if (n == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(U2);
                    rjb.l(sb, recyclerView.C());
                    return u69Var;
                }
                recyclerView.e.z(n);
                j(view);
                U2.a(8224);
                u69Var4 = U2;
            }
            if (u69Var4 != null) {
                if (u69Var4.j()) {
                    i6 = r69Var.g;
                } else {
                    int i12 = u69Var4.c;
                    if (i12 < 0 || i12 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + u69Var4 + recyclerView.C());
                    }
                    if (r69Var.g || recyclerView.x.d(u69Var4.c) == u69Var4.f) {
                        y59 y59Var = recyclerView.x;
                        if (!y59Var.b || u69Var4.e == y59Var.c(u69Var4.c)) {
                            i6 = i2;
                        }
                    }
                    i6 = 0;
                }
                if (i6 == 0) {
                    u69Var4.a(4);
                    if (u69Var4.k()) {
                        recyclerView.removeDetachedView(u69Var4.a, false);
                        u69Var4.p.l(u69Var4);
                    } else if (u69Var4.s()) {
                        u69Var4.l &= -33;
                    }
                    i(u69Var4);
                    u69Var2 = u69Var;
                } else {
                    u69Var2 = u69Var4;
                    i3 = i2;
                }
            } else {
                u69Var2 = u69Var4;
            }
        }
        if (u69Var2 == null) {
            int f2 = recyclerView.d.f(i, 0);
            if (f2 < 0 || f2 >= recyclerView.x.b()) {
                StringBuilder o2 = ts2.o("Inconsistency detected. Invalid item position ", i, "(offset:", f2, ").state:");
                o2.append(r69Var.b());
                o2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(o2.toString());
            }
            int d = recyclerView.x.d(f2);
            j2 = 4;
            y59 y59Var2 = recyclerView.x;
            if (y59Var2.b) {
                long c2 = y59Var2.c(f2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        u69 u69Var6 = (u69) arrayList.get(size5);
                        long j3 = u69Var6.e;
                        View view2 = u69Var6.a;
                        if (j3 == c2 && !u69Var6.s()) {
                            if (d == u69Var6.f) {
                                u69Var6.a(32);
                                if (u69Var6.j() && !r69Var.g) {
                                    u69Var6.p(2, 14);
                                }
                                u69Var2 = u69Var6;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                u69 U3 = RecyclerView.U(view2);
                                U3.p = null;
                                U3.q = false;
                                U3.l &= -33;
                                i(U3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            u69 u69Var7 = (u69) arrayList2.get(size6);
                            if (u69Var7.e != c2 || u69Var7.f()) {
                                size6--;
                            } else if (d == u69Var7.f) {
                                arrayList2.remove(size6);
                                u69Var2 = u69Var7;
                            } else {
                                g(size6);
                            }
                        }
                        u69Var2 = null;
                    }
                }
                if (u69Var2 != null) {
                    u69Var2.c = f2;
                    i3 = i2;
                }
            }
            if (u69Var2 == null) {
                m69 m69Var = (m69) this.g;
                if (m69Var == null) {
                    m69Var = new m69();
                    this.g = m69Var;
                }
                l69 l69Var = (l69) m69Var.a.get(d);
                if (l69Var != null) {
                    ArrayList arrayList5 = l69Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((u69) arrayList5.get(size7)).f()) {
                                u69Var3 = (u69) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                u69Var3 = null;
                if (u69Var3 != null) {
                    u69Var3.o();
                    int[] iArr = RecyclerView.R0;
                }
                u69Var2 = u69Var3;
            }
            if (u69Var2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = ((m69) this.g).b(d).b;
                    if (j4 != 0 && j4 + nanoTime >= j) {
                        return null;
                    }
                }
                u69Var = null;
                u69Var2 = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView J = RecyclerView.J(u69Var2.a);
                if (J != null) {
                    u69Var2.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                l69 b = ((m69) this.g).b(d);
                long j5 = b.b;
                if (j5 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                }
                b.b = nanoTime2;
            } else {
                u69Var = null;
            }
        } else {
            j2 = 4;
        }
        View view3 = u69Var2.a;
        if (i3 != 0 && !r69Var.g && u69Var2.e(TLObject.FLAG_13)) {
            u69Var2.p(0, TLObject.FLAG_13);
            if (r69Var.j) {
                recyclerView.p0(u69Var2, recyclerView.d0.l(r69Var, u69Var2, d69.b(u69Var2) | TLObject.FLAG_12, u69Var2.d()));
            }
        }
        if (r69Var.g && u69Var2.g()) {
            u69Var2.g = i;
        } else if (!u69Var2.g() || (u69Var2.l & 2) != 0 || u69Var2.h()) {
            z = false;
            int f3 = recyclerView.d.f(i, 0);
            u69Var2.t = recyclerView;
            int i13 = u69Var2.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j6 = ((m69) this.g).b(i13).c;
                if (j6 != 0 && j6 + nanoTime3 >= j) {
                    i5 = 0;
                    i4 = i2;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        g69Var = (g69) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(g69Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        g69Var = (g69) layoutParams;
                    } else {
                        g69Var = (g69) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(g69Var);
                    }
                    g69Var.a = u69Var2;
                    g69Var.d = (i3 != 0 || i5 == 0) ? z : i4;
                    return u69Var2;
                }
            }
            y59 y59Var3 = recyclerView.x;
            y59Var3.getClass();
            u69Var2.c = f3;
            if (y59Var3.b) {
                u69Var2.e = y59Var3.c(f3);
            }
            u69Var2.p(i2, 519);
            int i14 = ozb.a;
            Trace.beginSection("RV OnBindView");
            y59Var3.w(u69Var2, f3, u69Var2.d());
            ArrayList arrayList6 = u69Var2.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            u69Var2.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof g69) {
                ((g69) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            l69 b2 = ((m69) this.g).b(u69Var2.f);
            long j7 = b2.c;
            if (j7 != 0) {
                nanoTime4 = (nanoTime4 / j2) + ((j7 / j2) * 3);
            }
            b2.c = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.P;
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                i4 = 1;
            } else {
                WeakHashMap weakHashMap = kfc.a;
                i4 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate e = kfc.e(view3);
                Object q4Var = e == null ? u69Var : e instanceof p4 ? ((p4) e).a : new q4(e);
                if (q4Var == null || q4Var.getClass().equals(q4.class)) {
                    u69Var2.a(TLObject.FLAG_14);
                    kfc.k(view3, recyclerView.C0.e);
                }
            }
            if (r69Var.g) {
                u69Var2.g = i;
            }
            i5 = i4;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            g69Var.a = u69Var2;
            g69Var.d = (i3 != 0 || i5 == 0) ? z : i4;
            return u69Var2;
        }
        i4 = i2;
        i5 = 0;
        z = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        g69Var.a = u69Var2;
        g69Var.d = (i3 != 0 || i5 == 0) ? z : i4;
        return u69Var2;
    }

    public final void l(u69 u69Var) {
        if (u69Var.q) {
            ((ArrayList) this.d).remove(u69Var);
        } else {
            ((ArrayList) this.c).remove(u69Var);
        }
        u69Var.p = null;
        u69Var.q = false;
        u69Var.l &= -33;
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.e;
        f69 f69Var = ((RecyclerView) this.h).y;
        this.b = this.a + (f69Var != null ? f69Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public ki2(go4 go4Var, go4 go4Var2, int i, int i2, r10 r10Var, k30 k30Var, bqb bqbVar, Object obj) {
        this.c = go4Var;
        this.d = go4Var2;
        this.a = i;
        this.b = i2;
        this.e = r10Var;
        this.f = k30Var;
        this.g = bqbVar;
        this.h = obj;
    }

    public ki2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
