package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g01 {
    public final boolean a;
    public k6.c d;
    public k6.c f;
    public k6.c h;
    public int[] j;
    public int[] l;
    public e01[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ q01 x;
    public int b = TLObject.FLAG_31;
    public int c = TLObject.FLAG_31;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final m01 v = new m01(0);
    public final m01 w = new m01(-100000);

    public g01(q01 q01Var, boolean z10) {
        this.x = q01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, k01 k01Var, m01 m01Var, boolean z10) {
        if (k01Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((e01) obj).a.equals(k01Var)) {
                    return;
                }
            }
        }
        arrayList.add(new e01(k01Var, m01Var));
    }

    public static boolean m(int[] iArr, e01 e01Var) {
        if (!e01Var.c) {
            return false;
        }
        k01 k01Var = e01Var.a;
        int i10 = k01Var.a;
        int i11 = k01Var.b;
        int i12 = iArr[i10] + e01Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(k6.c cVar, boolean z10) {
        for (m01 m01Var : (m01[]) ((Object[]) cVar.d)) {
            m01Var.a = TLObject.FLAG_31;
        }
        h01[] h01VarArr = (h01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < h01VarArr.length; i10++) {
            int d = h01VarArr[i10].d(z10);
            m01 m01Var2 = (m01) ((Object[]) cVar.d)[((int[]) cVar.b)[i10]];
            int i11 = m01Var2.a;
            if (!z10) {
                d = -d;
            }
            m01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        q01 q01Var = this.x;
        int childCount = q01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            j01 d = q01Var.d(i10);
            l01 l01Var = d.a;
            boolean z11 = this.a;
            k01 k01Var = (z11 ? l01Var.b : l01Var.a).b;
            int i11 = z10 ? k01Var.a : k01Var.b;
            iArr[i11] = Math.max(iArr[i11], q01Var.f(d, z11, z10));
        }
    }

    public final k6.c c(boolean z10) {
        k01 k01Var;
        f01 f01Var = new f01(k01.class, m01.class);
        n01[] n01VarArr = (n01[]) ((Object[]) f().c);
        int length = n01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                k01Var = n01VarArr[i10].b;
            } else {
                k01 k01Var2 = n01VarArr[i10].b;
                k01Var = new k01(k01Var2.b, k01Var2.a);
            }
            m01 m01Var = new m01();
            m01Var.a = TLObject.FLAG_31;
            f01Var.add(Pair.create(k01Var, m01Var));
        }
        return f01Var.h();
    }

    public final e01[] d() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = c(true);
            }
            if (!this.g) {
                a(this.f, true);
                this.g = true;
            }
            k6.c cVar = this.f;
            int i10 = 0;
            while (true) {
                k01[] k01VarArr = (k01[]) ((Object[]) cVar.c);
                if (i10 >= k01VarArr.length) {
                    break;
                }
                j(arrayList, k01VarArr[i10], ((m01[]) ((Object[]) cVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            k6.c cVar2 = this.h;
            int i11 = 0;
            while (true) {
                k01[] k01VarArr2 = (k01[]) ((Object[]) cVar2.c);
                if (i11 >= k01VarArr2.length) {
                    break;
                }
                j(arrayList2, k01VarArr2[i11], ((m01[]) ((Object[]) cVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new k01(i12, i13), new m01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new k01(0, e), this.v, false);
            j(arrayList2, new k01(e, 0), this.w, false);
            e01[] q5 = q(arrayList);
            e01[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(e01[].class.getComponentType(), q5.length + q9.length);
            System.arraycopy(q5, 0, objArr, 0, q5.length);
            System.arraycopy(q9, 0, objArr, q5.length, q9.length);
            this.n = (e01[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = c(true);
            }
            if (!this.g) {
                a(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int e() {
        int max = Math.max(this.b, h());
        if (max <= 1024) {
            return max;
        }
        q01.g("Table grid count out of bounds");
        throw null;
    }

    public final k6.c f() {
        k6.c cVar = this.d;
        boolean z10 = this.a;
        q01 q01Var = this.x;
        if (cVar == null) {
            f01 f01Var = new f01(n01.class, h01.class);
            int childCount = q01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                l01 l01Var = q01Var.d(i10).a;
                n01 n01Var = z10 ? l01Var.b : l01Var.a;
                f01Var.add(Pair.create(n01Var, n01.a(n01Var, z10).G()));
            }
            this.d = f01Var.h();
        }
        if (!this.e) {
            for (h01 h01Var : (h01[]) ((Object[]) this.d.d)) {
                h01Var.c();
            }
            int childCount2 = q01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                j01 d = q01Var.d(i11);
                l01 l01Var2 = d.a;
                n01 n01Var2 = z10 ? l01Var2.b : l01Var2.a;
                int e = q01Var.e(d, z10, false) + q01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = n01Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                k6.c cVar2 = this.d;
                h01 h01Var2 = (h01) ((Object[]) cVar2.d)[((int[]) cVar2.b)[i11]];
                h01Var2.c = ((n01Var2.c == q01.R && f7 == 0.0f) ? 0 : 2) & h01Var2.c;
                int F = n01.a(n01Var2, z10).F(d, i12);
                h01Var2.b(F, i12 - F);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        boolean z10;
        if (this.p == null) {
            this.p = new int[e() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z11 = this.s;
            float f7 = 0.0f;
            boolean z12 = this.a;
            q01 q01Var = this.x;
            if (!z11) {
                int childCount = q01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    l01 l01Var = q01Var.d(i10).a;
                    if ((z12 ? l01Var.b : l01Var.a).d != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                this.r = z10;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[q01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (q01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = q01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        l01 l01Var2 = q01Var.d(i11).a;
                        f7 += (z12 ? l01Var2.b : l01Var2.a).d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p10;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f7, i12);
                        p(d(), iArr, true);
                    }
                }
            } else {
                p(d(), iArr, true);
            }
            if (!this.u) {
                int i15 = iArr[0];
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    iArr[i16] = iArr[i16] - i15;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int h() {
        int i10 = this.c;
        int i11 = TLObject.FLAG_31;
        if (i10 == Integer.MIN_VALUE) {
            q01 q01Var = this.x;
            int childCount = q01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                l01 l01Var = q01Var.d(i13).a;
                k01 k01Var = (this.a ? l01Var.b : l01Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, k01Var.a), k01Var.b), k01Var.a());
            }
            if (i12 != -1) {
                i11 = i12;
            }
            this.c = Math.max(0, i11);
        }
        return this.c;
    }

    public final int i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        m01 m01Var = this.w;
        m01 m01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            m01Var2.a = 0;
            m01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            m01Var2.a = 0;
            m01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        m01Var2.a = size;
        m01Var.a = -size;
        this.q = false;
        return g()[e()];
    }

    public final void k() {
        this.c = TLObject.FLAG_31;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        l();
    }

    public final void l() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void n(int i10) {
        if (i10 == Integer.MIN_VALUE || i10 >= h()) {
            this.b = i10;
        } else {
            q01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        q01 q01Var = this.x;
        int childCount = q01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            l01 l01Var = q01Var.d(i11).a;
            float f10 = (this.a ? l01Var.b : l01Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(e01[] e01VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < e01VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (e01 e01Var : e01VarArr) {
                    z11 |= m(iArr, e01Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[e01VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = e01VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, e01VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= e01VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    e01 e01Var2 = e01VarArr[i14];
                    k01 k01Var = e01Var2.a;
                    if (k01Var.a >= k01Var.b) {
                        e01Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final e01[] q(ArrayList arrayList) {
        e0.e0 e0Var = new e0.e0(this, (e01[]) arrayList.toArray(new e01[0]));
        int length = ((e01[][]) e0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            e0Var.g(i10);
        }
        return (e01[]) e0Var.c;
    }
}
