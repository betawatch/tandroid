package hf;

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
import m2.t;
import n0.g;
import org.telegram.tgnet.TLObject;
import r0.h0;
import s4.c1;
import s4.g0;
import s4.l0;
import s4.n0;
import s4.o0;
import s4.t0;
import s4.u0;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        if (c1Var.e(TLObject.FLAG_14)) {
            c1Var.p(0, TLObject.FLAG_14);
            h0.j(c1Var.a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.x;
            if (g0Var != null) {
                g0Var.A(c1Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.f.E0(c1Var);
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
        if (i10 >= 0 && i10 < recyclerView.u0.b()) {
            return !recyclerView.u0.g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = i0.a.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.u0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public u0 c() {
        if (((u0) this.g) == null) {
            this.g = new u0();
        }
        return (u0) this.g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.c).clear();
        e();
        u0 c10 = c();
        if (g0Var != null) {
            c10.b--;
        }
        if (c10.b == 0) {
            c10.a();
        }
        if (g0Var2 != null) {
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
        int[] iArr = RecyclerView.Q0;
        e2.f fVar = ((RecyclerView) this.h).t0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.c = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(c1 c1Var) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e2.f fVar = recyclerView.t0;
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
            WeakHashMap weakHashMap = h0.a;
            if (view.hasTransientState()) {
                z10 = true;
                if (c1Var.i()) {
                    z12 = false;
                } else {
                    if (this.b <= 0 || c1Var.e(526)) {
                        z11 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.Q0;
                        if (size > 0) {
                            int i10 = c1Var.c;
                            if (fVar.d != null) {
                                int i11 = fVar.c * 2;
                                for (int i12 = 0; i12 < i11; i12 += 2) {
                                    if (fVar.d[i12] == i10) {
                                        break;
                                    }
                                }
                            }
                            int i13 = size - 1;
                            loop1: while (i13 >= 0) {
                                int i14 = ((c1) arrayList.get(i13)).c;
                                if (fVar.d == null) {
                                    break;
                                }
                                int i15 = fVar.c * 2;
                                for (int i16 = 0; i16 < i15; i16 += 2) {
                                    if (fVar.d[i16] == i14) {
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
                    if (z11) {
                        z12 = false;
                    } else {
                        a(c1Var, true);
                    }
                    r5 = z11;
                }
                recyclerView.f.E0(c1Var);
                if (r5 && !z12 && z10) {
                    c1Var.t = null;
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (c1Var.i()) {
        }
        recyclerView.f.E0(c1Var);
        if (r5) {
        }
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.p = this;
            U.q = true;
            ((ArrayList) this.d).add(U);
            return;
        }
        if (U.h() && !U.j() && !recyclerView.x.b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        }
        U.p = this;
        U.q = false;
        ((ArrayList) this.c).add(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0419, code lost:
    
        if (r12.h() == false) goto L230;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0514  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c1 j(int i10, long j10) {
        int i11;
        int i12;
        c1 c1Var;
        r0.b bVar;
        long j11;
        long j12;
        boolean z10;
        int i13;
        int i14;
        ViewGroup.LayoutParams layoutParams;
        o0 o0Var;
        c1 c1Var2;
        char c10;
        View view;
        c1 c1Var3;
        int i15;
        int size;
        int g10;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        z0 z0Var = recyclerView.u0;
        if (i10 < 0 || i10 >= z0Var.b()) {
            StringBuilder m10 = i0.a.m("Invalid item position ", i10, "(", i10, "). Item count:");
            m10.append(z0Var.b());
            m10.append(recyclerView.C());
            throw new IndexOutOfBoundsException(m10.toString());
        }
        if (z0Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        c1Var = (c1) ((ArrayList) this.d).get(i16);
                        if (!c1Var.s() && c1Var.c() == i10) {
                            c1Var.a(32);
                            i11 = 1;
                            break;
                        }
                        i16++;
                    } else if (recyclerView.x.b && (g10 = recyclerView.d.g(i10, 0)) > 0 && g10 < recyclerView.x.b()) {
                        long c11 = recyclerView.x.c(g10);
                        for (int i17 = 0; i17 < size; i17++) {
                            c1 c1Var4 = (c1) ((ArrayList) this.d).get(i17);
                            i11 = 1;
                            if (!c1Var4.s() && c1Var4.e == c11) {
                                c1Var4.a(32);
                                c1Var = c1Var4;
                                break;
                            }
                        }
                    }
                }
            }
            i11 = 1;
            c1Var = null;
            i12 = c1Var != null ? i11 : 0;
        } else {
            i11 = 1;
            i12 = 0;
            c1Var = null;
        }
        if (c1Var == null) {
            int size2 = arrayList.size();
            for (int i18 = 0; i18 < size2; i18++) {
                c1Var3 = (c1) arrayList.get(i18);
                if (!c1Var3.s() && c1Var3.c() == i10 && !c1Var3.h() && (z0Var.g || !c1Var3.j())) {
                    c1Var3.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i19);
                c1 U = RecyclerView.U(view);
                if (U.c() == i10 && !U.h() && !U.j()) {
                    break;
                }
                i19++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size4) {
                        c1Var3 = null;
                        break;
                    }
                    c1Var3 = (c1) arrayList2.get(i20);
                    if (!c1Var3.h() && c1Var3.c() == i10 && !c1Var3.f()) {
                        arrayList2.remove(i20);
                        break;
                    }
                    i20++;
                }
            } else {
                c1 U2 = RecyclerView.U(view);
                q5.d dVar = recyclerView.e;
                c3.g0 g0Var = (c3.g0) dVar.c;
                int indexOfChild = ((RecyclerView) ((t) dVar.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!g0Var.F(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                g0Var.w(indexOfChild);
                dVar.y(view);
                q5.d dVar2 = recyclerView.e;
                c3.g0 g0Var2 = (c3.g0) dVar2.c;
                int indexOfChild2 = ((RecyclerView) ((t) dVar2.b).b).indexOfChild(view);
                int B = (indexOfChild2 == -1 || g0Var2.F(indexOfChild2)) ? -1 : indexOfChild2 - g0Var2.B(indexOfChild2);
                if (B == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + U2 + recyclerView.C());
                }
                recyclerView.e.j(B);
                i(view);
                U2.a(8224);
                c1Var3 = U2;
            }
            if (c1Var3 != null) {
                if (c1Var3.j()) {
                    i15 = z0Var.g;
                } else {
                    int i21 = c1Var3.c;
                    if (i21 < 0 || i21 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c1Var3 + recyclerView.C());
                    }
                    if (z0Var.g || recyclerView.x.d(c1Var3.c) == c1Var3.f) {
                        g0 g0Var3 = recyclerView.x;
                        if (!g0Var3.b || c1Var3.e == g0Var3.c(c1Var3.c)) {
                            i15 = i11;
                        }
                    }
                    i15 = 0;
                }
                if (i15 == 0) {
                    c1Var3.a(4);
                    if (c1Var3.k()) {
                        recyclerView.removeDetachedView(c1Var3.a, false);
                        c1Var3.p.k(c1Var3);
                    } else if (c1Var3.s()) {
                        c1Var3.l &= -33;
                    }
                    h(c1Var3);
                    c1Var = null;
                } else {
                    c1Var = c1Var3;
                    i12 = i11;
                }
            } else {
                c1Var = c1Var3;
            }
        }
        if (c1Var == null) {
            j11 = 3;
            int g11 = recyclerView.d.g(i10, 0);
            if (g11 < 0 || g11 >= recyclerView.x.b()) {
                StringBuilder m11 = i0.a.m("Inconsistency detected. Invalid item position ", i10, "(offset:", g11, ").state:");
                m11.append(z0Var.b());
                m11.append(recyclerView.C());
                throw new IndexOutOfBoundsException(m11.toString());
            }
            int d = recyclerView.x.d(g11);
            j12 = 4;
            g0 g0Var4 = recyclerView.x;
            if (g0Var4.b) {
                long c12 = g0Var4.c(g11);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        c1 c1Var5 = (c1) arrayList.get(size5);
                        long j13 = c1Var5.e;
                        View view2 = c1Var5.a;
                        if (j13 != c12 || c1Var5.s()) {
                            c10 = ' ';
                        } else if (d == c1Var5.f) {
                            c1Var5.a(32);
                            if (c1Var5.j() && !z0Var.g) {
                                c1Var5.p(2, 14);
                            }
                            c1Var = c1Var5;
                        } else {
                            c10 = ' ';
                            arrayList.remove(size5);
                            recyclerView.removeDetachedView(view2, false);
                            c1 U3 = RecyclerView.U(view2);
                            U3.p = null;
                            U3.q = false;
                            U3.l &= -33;
                            h(U3);
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            c1 c1Var6 = (c1) arrayList2.get(size6);
                            if (c1Var6.e != c12 || c1Var6.f()) {
                                size6--;
                            } else if (d == c1Var6.f) {
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
                    i12 = i11;
                }
            }
            if (c1Var == null) {
                t0 t0Var = (t0) c().a.get(d);
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
                    int[] iArr = RecyclerView.Q0;
                }
                c1Var = c1Var2;
            }
            if (c1Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j14 = ((u0) this.g).b(d).c;
                    if (((j14 == 0 || j14 + nanoTime < j10) ? i11 : 0) == 0) {
                        return null;
                    }
                }
                bVar = null;
                c1Var = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.Q0;
                RecyclerView J = RecyclerView.J(c1Var.a);
                if (J != null) {
                    c1Var.b = new WeakReference(J);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                t0 b10 = ((u0) this.g).b(d);
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
            j11 = 3;
            j12 = 4;
        }
        View view3 = c1Var.a;
        if (i12 != 0 && !z0Var.g && c1Var.e(TLObject.FLAG_13)) {
            c1Var.p(0, TLObject.FLAG_13);
            if (z0Var.j) {
                recyclerView.o0(c1Var, recyclerView.c0.l(z0Var, c1Var, l0.b(c1Var) | TLObject.FLAG_12, c1Var.d()));
            }
        }
        if (!z0Var.g || !c1Var.g()) {
            if (c1Var.g()) {
                if (((c1Var.l & 2) != 0 ? i11 : 0) == 0) {
                }
            }
            z10 = false;
            int g12 = recyclerView.d.g(i10, 0);
            c1Var.t = recyclerView;
            int i22 = c1Var.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j16 = ((u0) this.g).b(i22).d;
                if (j16 != 0 && j16 + nanoTime3 >= j10) {
                    i14 = 0;
                    i13 = i11;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        o0Var = (o0) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(o0Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        o0Var = (o0) layoutParams;
                    } else {
                        o0Var = (o0) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(o0Var);
                    }
                    o0Var.a = c1Var;
                    o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
                    return c1Var;
                }
            }
            g0 g0Var5 = recyclerView.x;
            g0Var5.getClass();
            c1Var.c = g12;
            if (g0Var5.b) {
                c1Var.e = g0Var5.c(g12);
            }
            c1Var.p(i11, 519);
            int i23 = g.a;
            Trace.beginSection("RV OnBindView");
            g0Var5.v(c1Var, g12, c1Var.d());
            ArrayList arrayList6 = c1Var.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            c1Var.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof o0) {
                ((o0) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            t0 b11 = ((u0) this.g).b(c1Var.f);
            long j17 = b11.d;
            if (j17 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j17 / j12) * j11);
            }
            b11.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.O;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = h0.a;
                i13 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate d10 = h0.d(view3);
                r0.b bVar2 = d10 == null ? bVar : d10 instanceof r0.a ? ((r0.a) d10).a : new r0.b(d10);
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    c1Var.a(TLObject.FLAG_14);
                    h0.j(view3, recyclerView.B0.e);
                }
            } else {
                i13 = 1;
            }
            if (z0Var.g) {
                c1Var.g = i10;
            }
            i14 = i13;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            o0Var.a = c1Var;
            o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
            return c1Var;
        }
        c1Var.g = i10;
        i13 = i11;
        i14 = 0;
        z10 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        o0Var.a = c1Var;
        o0Var.d = (i12 != 0 || i14 == 0) ? z10 : i13;
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
        n0 n0Var = ((RecyclerView) this.h).y;
        this.b = this.a + (n0Var != null ? n0Var.i : 0);
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
