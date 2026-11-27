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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oh2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public oh2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(f89 f89Var, boolean z) {
        RecyclerView.n(f89Var);
        if (f89Var.e(TLObject.FLAG_14)) {
            f89Var.p(0, TLObject.FLAG_14);
            ihc.l(f89Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            j79 j79Var = recyclerView.x;
            if (j79Var != null) {
                j79Var.A(f89Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.r(f89Var);
            }
        }
        f89Var.t = null;
        x79 x79Var = (x79) this.g;
        if (x79Var == null) {
            x79Var = new x79();
            this.g = x79Var;
        }
        int i = f89Var.f;
        ArrayList arrayList = x79Var.b(i).a;
        ((w79) x79Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        f89Var.o();
        arrayList.add(f89Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c89 c89Var = recyclerView.v0;
        if (i >= 0 && i < c89Var.b()) {
            return !c89Var.g ? i : recyclerView.d.f(i, 0);
        }
        StringBuilder m = uh9.m(i, "invalid position ", ". State item count is ");
        m.append(c89Var.b());
        m.append(recyclerView.D());
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final oh2 c(s00 s00Var) {
        return new oh2((ko4) this.c, (ko4) this.d, this.a, this.b, s00Var, (l20) this.f, (asb) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((ko4) this.c).t, "audio/raw");
    }

    public final void e(j79 j79Var, j79 j79Var2) {
        ((ArrayList) this.c).clear();
        f();
        x79 x79Var = (x79) this.g;
        if (x79Var == null) {
            x79Var = new x79();
            this.g = x79Var;
        }
        if (j79Var != null) {
            x79Var.b--;
        }
        if (x79Var.b == 0) {
            x79Var.a();
        }
        if (j79Var2 != null) {
            x79Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        pn pnVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = pnVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        pnVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((f89) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        f89 V = RecyclerView.V(view);
        if (V.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (V.k()) {
            V.p.l(V);
        } else if (V.s()) {
            V.l &= -33;
        }
        i(V);
        if (recyclerView.d0 == null || V.i()) {
            return;
        }
        recyclerView.d0.f(V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(f89 f89Var) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        pn pnVar = recyclerView.u0;
        boolean k = f89Var.k();
        View view = f89Var.a;
        boolean z3 = true;
        if (k || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(f89Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.D());
            throw new IllegalArgumentException(sb.toString());
        }
        if (f89Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f89Var + recyclerView.D());
        }
        if (f89Var.r()) {
            lq5.j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.D()));
            return;
        }
        if ((f89Var.l & 16) == 0) {
            WeakHashMap weakHashMap = ihc.a;
            if (view.hasTransientState()) {
                z = true;
                if (f89Var.i()) {
                    z3 = false;
                } else {
                    if (this.b <= 0 || f89Var.e(526)) {
                        z2 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.b && size > 0) {
                            g(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.R0;
                        if (size > 0) {
                            int i = f89Var.c;
                            if (pnVar.a != null) {
                                int i2 = pnVar.d << 1;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (pnVar.a[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((f89) arrayList.get(i4)).c;
                                if (pnVar.a == null) {
                                    break;
                                }
                                int i6 = pnVar.d << 1;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (pnVar.a[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, f89Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(f89Var, true);
                    }
                    r5 = z2;
                }
                recyclerView.f.r(f89Var);
                if (r5 && !z3 && z) {
                    f89Var.t = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (f89Var.i()) {
        }
        recyclerView.f.r(f89Var);
        if (r5) {
        }
    }

    public final void j(View view) {
        o79 o79Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f89 V = RecyclerView.V(view);
        if (!V.e(12) && V.m() && (o79Var = recyclerView.d0) != null && !o79Var.c(V, V.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            V.p = this;
            V.q = true;
            arrayList.add(V);
            return;
        }
        if (V.h() && !V.j() && !recyclerView.x.b) {
            lq5.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.D()));
            return;
        }
        V.p = this;
        V.q = false;
        ((ArrayList) this.c).add(V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f89 k(int i, long j) {
        f89 f89Var;
        int i2;
        int i3;
        f89 f89Var2;
        long j2;
        boolean z;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams;
        r79 r79Var;
        f89 f89Var3;
        View view;
        f89 f89Var4;
        int i6;
        int size;
        int f;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c89 c89Var = recyclerView.v0;
        if (i < 0 || i >= c89Var.b()) {
            StringBuilder p = bs2.p("Invalid item position ", i, "(", i, "). Item count:");
            p.append(c89Var.b());
            p.append(recyclerView.D());
            throw new IndexOutOfBoundsException(p.toString());
        }
        if (c89Var.g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        f89Var2 = (f89) ((ArrayList) this.d).get(i7);
                        if (!f89Var2.s() && f89Var2.c() == i) {
                            f89Var2.a(32);
                            f89Var = null;
                            i2 = 1;
                            break;
                        }
                        i7++;
                    } else if (recyclerView.x.b && (f = recyclerView.d.f(i, 0)) > 0 && f < recyclerView.x.b()) {
                        long c = recyclerView.x.c(f);
                        for (int i8 = 0; i8 < size; i8++) {
                            f89 f89Var5 = (f89) ((ArrayList) this.d).get(i8);
                            if (!f89Var5.s()) {
                                f89Var = null;
                                i2 = 1;
                                if (f89Var5.e == c) {
                                    f89Var5.a(32);
                                    f89Var2 = f89Var5;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            f89Var = null;
            i2 = 1;
            f89Var2 = null;
            i3 = f89Var2 != null ? i2 : 0;
        } else {
            f89Var = null;
            i2 = 1;
            i3 = 0;
            f89Var2 = null;
        }
        if (f89Var2 == null) {
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                f89Var4 = (f89) arrayList.get(i9);
                if (!f89Var4.s() && f89Var4.c() == i && !f89Var4.h() && (c89Var.g || !f89Var4.j())) {
                    f89Var4.a(32);
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.e.d;
            int size3 = arrayList4.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size3) {
                    view = f89Var;
                    break;
                }
                view = (View) arrayList4.get(i10);
                f89 V = RecyclerView.V(view);
                if (V.c() == i && !V.h() && !V.j()) {
                    break;
                }
                i10++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        f89Var4 = f89Var;
                        break;
                    }
                    f89Var4 = (f89) arrayList2.get(i11);
                    if (!f89Var4.h() && f89Var4.c() == i && !f89Var4.f()) {
                        arrayList2.remove(i11);
                        break;
                    }
                    i11++;
                }
            } else {
                f89 V2 = RecyclerView.V(view);
                rx6 rx6Var = recyclerView.e;
                zg2 zg2Var = (zg2) rx6Var.c;
                int indexOfChild = ((RecyclerView) ((j09) rx6Var.b).b).indexOfChild(view);
                if (indexOfChild < 0) {
                    lq5.q(view, "view is not a child, cannot hide ");
                    return f89Var;
                }
                if (!zg2Var.w(indexOfChild)) {
                    grb.h(view, "trying to unhide a view that was not hidden");
                    return f89Var;
                }
                zg2Var.a(indexOfChild);
                rx6Var.A0(view);
                rx6 rx6Var2 = recyclerView.e;
                zg2 zg2Var2 = (zg2) rx6Var2.c;
                int indexOfChild2 = ((RecyclerView) ((j09) rx6Var2.b).b).indexOfChild(view);
                int s = (indexOfChild2 == -1 || zg2Var2.w(indexOfChild2)) ? -1 : indexOfChild2 - zg2Var2.s(indexOfChild2);
                if (s == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(V2);
                    grb.k(sb, recyclerView.D());
                    return f89Var;
                }
                recyclerView.e.z(s);
                j(view);
                V2.a(8224);
                f89Var4 = V2;
            }
            if (f89Var4 != null) {
                if (f89Var4.j()) {
                    i6 = c89Var.g;
                } else {
                    int i12 = f89Var4.c;
                    if (i12 < 0 || i12 >= recyclerView.x.b()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f89Var4 + recyclerView.D());
                    }
                    if (c89Var.g || recyclerView.x.d(f89Var4.c) == f89Var4.f) {
                        j79 j79Var = recyclerView.x;
                        if (!j79Var.b || f89Var4.e == j79Var.c(f89Var4.c)) {
                            i6 = i2;
                        }
                    }
                    i6 = 0;
                }
                if (i6 == 0) {
                    f89Var4.a(4);
                    if (f89Var4.k()) {
                        recyclerView.removeDetachedView(f89Var4.a, false);
                        f89Var4.p.l(f89Var4);
                    } else if (f89Var4.s()) {
                        f89Var4.l &= -33;
                    }
                    i(f89Var4);
                    f89Var2 = f89Var;
                } else {
                    f89Var2 = f89Var4;
                    i3 = i2;
                }
            } else {
                f89Var2 = f89Var4;
            }
        }
        if (f89Var2 == null) {
            int f2 = recyclerView.d.f(i, 0);
            if (f2 < 0 || f2 >= recyclerView.x.b()) {
                StringBuilder p2 = bs2.p("Inconsistency detected. Invalid item position ", i, "(offset:", f2, ").state:");
                p2.append(c89Var.b());
                p2.append(recyclerView.D());
                throw new IndexOutOfBoundsException(p2.toString());
            }
            int d = recyclerView.x.d(f2);
            j2 = 4;
            j79 j79Var2 = recyclerView.x;
            if (j79Var2.b) {
                long c2 = j79Var2.c(f2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        f89 f89Var6 = (f89) arrayList.get(size5);
                        long j3 = f89Var6.e;
                        View view2 = f89Var6.a;
                        if (j3 == c2 && !f89Var6.s()) {
                            if (d == f89Var6.f) {
                                f89Var6.a(32);
                                if (f89Var6.j() && !c89Var.g) {
                                    f89Var6.p(2, 14);
                                }
                                f89Var2 = f89Var6;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                f89 V3 = RecyclerView.V(view2);
                                V3.p = null;
                                V3.q = false;
                                V3.l &= -33;
                                i(V3);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            f89 f89Var7 = (f89) arrayList2.get(size6);
                            if (f89Var7.e != c2 || f89Var7.f()) {
                                size6--;
                            } else if (d == f89Var7.f) {
                                arrayList2.remove(size6);
                                f89Var2 = f89Var7;
                            } else {
                                g(size6);
                            }
                        }
                        f89Var2 = null;
                    }
                }
                if (f89Var2 != null) {
                    f89Var2.c = f2;
                    i3 = i2;
                }
            }
            if (f89Var2 == null) {
                x79 x79Var = (x79) this.g;
                if (x79Var == null) {
                    x79Var = new x79();
                    this.g = x79Var;
                }
                w79 w79Var = (w79) x79Var.a.get(d);
                if (w79Var != null) {
                    ArrayList arrayList5 = w79Var.a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((f89) arrayList5.get(size7)).f()) {
                                f89Var3 = (f89) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                f89Var3 = null;
                if (f89Var3 != null) {
                    f89Var3.o();
                    int[] iArr = RecyclerView.R0;
                }
                f89Var2 = f89Var3;
            }
            if (f89Var2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j4 = ((x79) this.g).b(d).b;
                    if (j4 != 0 && j4 + nanoTime >= j) {
                        return null;
                    }
                }
                f89Var = null;
                f89Var2 = recyclerView.x.a(recyclerView, d);
                int[] iArr2 = RecyclerView.R0;
                RecyclerView K = RecyclerView.K(f89Var2.a);
                if (K != null) {
                    f89Var2.b = new WeakReference(K);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                w79 b = ((x79) this.g).b(d);
                long j5 = b.b;
                if (j5 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                }
                b.b = nanoTime2;
            } else {
                f89Var = null;
            }
        } else {
            j2 = 4;
        }
        View view3 = f89Var2.a;
        if (i3 != 0 && !c89Var.g && f89Var2.e(TLObject.FLAG_13)) {
            f89Var2.p(0, TLObject.FLAG_13);
            if (c89Var.j) {
                recyclerView.q0(f89Var2, recyclerView.d0.l(c89Var, f89Var2, o79.b(f89Var2) | TLObject.FLAG_12, f89Var2.d()));
            }
        }
        if (c89Var.g && f89Var2.g()) {
            f89Var2.g = i;
        } else if (!f89Var2.g() || (f89Var2.l & 2) != 0 || f89Var2.h()) {
            z = false;
            int f3 = recyclerView.d.f(i, 0);
            f89Var2.t = recyclerView;
            int i13 = f89Var2.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j6 = ((x79) this.g).b(i13).c;
                if (j6 != 0 && j6 + nanoTime3 >= j) {
                    i5 = 0;
                    i4 = i2;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        r79Var = (r79) recyclerView.generateDefaultLayoutParams();
                        view3.setLayoutParams(r79Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        r79Var = (r79) layoutParams;
                    } else {
                        r79Var = (r79) recyclerView.generateLayoutParams(layoutParams);
                        view3.setLayoutParams(r79Var);
                    }
                    r79Var.a = f89Var2;
                    r79Var.d = (i3 != 0 || i5 == 0) ? z : i4;
                    return f89Var2;
                }
            }
            j79 j79Var3 = recyclerView.x;
            j79Var3.getClass();
            f89Var2.c = f3;
            if (j79Var3.b) {
                f89Var2.e = j79Var3.c(f3);
            }
            f89Var2.p(i2, 519);
            int i14 = n1c.a;
            Trace.beginSection("RV OnBindView");
            j79Var3.u(f89Var2, f3, f89Var2.d());
            ArrayList arrayList6 = f89Var2.m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            f89Var2.l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof r79) {
                ((r79) layoutParams2).c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            w79 b2 = ((x79) this.g).b(f89Var2.f);
            long j7 = b2.c;
            if (j7 != 0) {
                nanoTime4 = (nanoTime4 / j2) + ((j7 / j2) * 3);
            }
            b2.c = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.P;
            if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                i4 = 1;
            } else {
                WeakHashMap weakHashMap = ihc.a;
                i4 = 1;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate e = ihc.e(view3);
                Object r4Var = e == null ? f89Var : e instanceof q4 ? ((q4) e).a : new r4(e);
                if (r4Var == null || r4Var.getClass().equals(r4.class)) {
                    f89Var2.a(TLObject.FLAG_14);
                    ihc.l(view3, recyclerView.C0.e);
                }
            }
            if (c89Var.g) {
                f89Var2.g = i;
            }
            i5 = i4;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            r79Var.a = f89Var2;
            r79Var.d = (i3 != 0 || i5 == 0) ? z : i4;
            return f89Var2;
        }
        i4 = i2;
        i5 = 0;
        z = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
        }
        r79Var.a = f89Var2;
        r79Var.d = (i3 != 0 || i5 == 0) ? z : i4;
        return f89Var2;
    }

    public final void l(f89 f89Var) {
        if (f89Var.q) {
            ((ArrayList) this.d).remove(f89Var);
        } else {
            ((ArrayList) this.c).remove(f89Var);
        }
        f89Var.p = null;
        f89Var.q = false;
        f89Var.l &= -33;
    }

    public final void m() {
        ArrayList arrayList = (ArrayList) this.e;
        q79 q79Var = ((RecyclerView) this.h).y;
        this.b = this.a + (q79Var != null ? q79Var.i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public oh2(ko4 ko4Var, ko4 ko4Var2, int i, int i2, s00 s00Var, l20 l20Var, asb asbVar, Object obj) {
        this.c = ko4Var;
        this.d = ko4Var2;
        this.a = i;
        this.b = i2;
        this.e = s00Var;
        this.f = l20Var;
        this.g = asbVar;
        this.h = obj;
    }

    public oh2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
