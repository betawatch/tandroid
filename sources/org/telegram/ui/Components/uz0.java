package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uz0 {
    public final boolean a;
    public m.g3 d;
    public m.g3 f;
    public m.g3 h;
    public int[] j;
    public int[] l;
    public sz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ e01 x;
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
    public final a01 v = new a01(0);
    public final a01 w = new a01(-100000);

    public uz0(e01 e01Var, boolean z10) {
        this.x = e01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, yz0 yz0Var, a01 a01Var, boolean z10) {
        if (yz0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((sz0) obj).a.equals(yz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new sz0(yz0Var, a01Var));
    }

    public static boolean m(int[] iArr, sz0 sz0Var) {
        if (!sz0Var.c) {
            return false;
        }
        yz0 yz0Var = sz0Var.a;
        int i10 = yz0Var.a;
        int i11 = yz0Var.b;
        int i12 = iArr[i10] + sz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (a01 a01Var : (a01[]) ((Object[]) g3Var.d)) {
            a01Var.a = TLObject.FLAG_31;
        }
        vz0[] vz0VarArr = (vz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            int d = vz0VarArr[i10].d(z10);
            a01 a01Var2 = (a01) ((Object[]) g3Var.d)[((int[]) g3Var.b)[i10]];
            int i11 = a01Var2.a;
            if (!z10) {
                d = -d;
            }
            a01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        e01 e01Var = this.x;
        int childCount = e01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            xz0 d = e01Var.d(i10);
            zz0 zz0Var = d.a;
            boolean z11 = this.a;
            yz0 yz0Var = (z11 ? zz0Var.b : zz0Var.a).b;
            int i11 = z10 ? yz0Var.a : yz0Var.b;
            iArr[i11] = Math.max(iArr[i11], e01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        yz0 yz0Var;
        tz0 tz0Var = new tz0(yz0.class, a01.class);
        b01[] b01VarArr = (b01[]) ((Object[]) f().c);
        int length = b01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                yz0Var = b01VarArr[i10].b;
            } else {
                yz0 yz0Var2 = b01VarArr[i10].b;
                yz0Var = new yz0(yz0Var2.b, yz0Var2.a);
            }
            a01 a01Var = new a01();
            a01Var.a = TLObject.FLAG_31;
            tz0Var.add(Pair.create(yz0Var, a01Var));
        }
        return tz0Var.h();
    }

    public final sz0[] d() {
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
            m.g3 g3Var = this.f;
            int i10 = 0;
            while (true) {
                yz0[] yz0VarArr = (yz0[]) ((Object[]) g3Var.c);
                if (i10 >= yz0VarArr.length) {
                    break;
                }
                j(arrayList, yz0VarArr[i10], ((a01[]) ((Object[]) g3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            m.g3 g3Var2 = this.h;
            int i11 = 0;
            while (true) {
                yz0[] yz0VarArr2 = (yz0[]) ((Object[]) g3Var2.c);
                if (i11 >= yz0VarArr2.length) {
                    break;
                }
                j(arrayList2, yz0VarArr2[i11], ((a01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new yz0(i12, i13), new a01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new yz0(0, e), this.v, false);
            j(arrayList2, new yz0(e, 0), this.w, false);
            sz0[] q6 = q(arrayList);
            sz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(sz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (sz0[]) objArr;
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
        e01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        Object rz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.a;
        e01 e01Var = this.x;
        if (g3Var == null) {
            tz0 tz0Var = new tz0(b01.class, vz0.class);
            int childCount = e01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                zz0 zz0Var = e01Var.d(i10).a;
                b01 b01Var = z10 ? zz0Var.b : zz0Var.a;
                switch (b01.a(b01Var, z10).a) {
                    case 3:
                        rz0Var = new rz0();
                        break;
                    default:
                        rz0Var = new vz0();
                        break;
                }
                tz0Var.add(Pair.create(b01Var, rz0Var));
            }
            this.d = tz0Var.h();
        }
        if (!this.e) {
            for (vz0 vz0Var : (vz0[]) ((Object[]) this.d.d)) {
                vz0Var.c();
            }
            int childCount2 = e01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                xz0 d = e01Var.d(i11);
                zz0 zz0Var2 = d.a;
                b01 b01Var2 = z10 ? zz0Var2.b : zz0Var2.a;
                int e = e01Var.e(d, z10, false) + e01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = b01Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                m.g3 g3Var2 = this.d;
                vz0 vz0Var2 = (vz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.b)[i11]];
                vz0Var2.c = ((b01Var2.c == e01.R && f7 == 0.0f) ? 0 : 2) & vz0Var2.c;
                int a2 = b01.a(b01Var2, z10).a(d, i12);
                vz0Var2.b(a2, i12 - a2);
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
            e01 e01Var = this.x;
            if (!z11) {
                int childCount = e01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    zz0 zz0Var = e01Var.d(i10).a;
                    if ((z12 ? zz0Var.b : zz0Var.a).d != 0.0f) {
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
                    this.t = new int[e01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (e01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = e01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        zz0 zz0Var2 = e01Var.d(i11).a;
                        f7 += (z12 ? zz0Var2.b : zz0Var2.a).d;
                    }
                    int i12 = -1;
                    boolean z13 = true;
                    int i13 = 0;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f7, i14);
                        boolean p5 = p(d(), iArr, false);
                        if (p5) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p5;
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
            e01 e01Var = this.x;
            int childCount = e01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                zz0 zz0Var = e01Var.d(i13).a;
                yz0 yz0Var = (this.a ? zz0Var.b : zz0Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, yz0Var.a), yz0Var.b), yz0Var.a());
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
        a01 a01Var = this.w;
        a01 a01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            a01Var2.a = 0;
            a01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            a01Var2.a = 0;
            a01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        a01Var2.a = size;
        a01Var.a = -size;
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
            e01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        e01 e01Var = this.x;
        int childCount = e01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 zz0Var = e01Var.d(i11).a;
            float f10 = (this.a ? zz0Var.b : zz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(sz0[] sz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < sz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (sz0 sz0Var : sz0VarArr) {
                    z11 |= m(iArr, sz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[sz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = sz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, sz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= sz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    sz0 sz0Var2 = sz0VarArr[i14];
                    yz0 yz0Var = sz0Var2.a;
                    if (yz0Var.a >= yz0Var.b) {
                        sz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final sz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (sz0[]) arrayList.toArray(new sz0[0]));
        int length = ((sz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (sz0[]) f0Var.c;
    }
}
