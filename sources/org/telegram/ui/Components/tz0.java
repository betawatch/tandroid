package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class tz0 {
    public final boolean a;
    public m.g3 d;
    public m.g3 f;
    public m.g3 h;
    public int[] j;
    public int[] l;
    public rz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ d01 x;
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
    public final zz0 v = new zz0(0);
    public final zz0 w = new zz0(-100000);

    public tz0(d01 d01Var, boolean z10) {
        this.x = d01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, xz0 xz0Var, zz0 zz0Var, boolean z10) {
        if (xz0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((rz0) obj).a.equals(xz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new rz0(xz0Var, zz0Var));
    }

    public static boolean m(int[] iArr, rz0 rz0Var) {
        if (!rz0Var.c) {
            return false;
        }
        xz0 xz0Var = rz0Var.a;
        int i10 = xz0Var.a;
        int i11 = xz0Var.b;
        int i12 = iArr[i10] + rz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (zz0 zz0Var : (zz0[]) ((Object[]) g3Var.d)) {
            zz0Var.a = TLObject.FLAG_31;
        }
        uz0[] uz0VarArr = (uz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < uz0VarArr.length; i10++) {
            int d = uz0VarArr[i10].d(z10);
            zz0 zz0Var2 = (zz0) ((Object[]) g3Var.d)[((int[]) g3Var.b)[i10]];
            int i11 = zz0Var2.a;
            if (!z10) {
                d = -d;
            }
            zz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        d01 d01Var = this.x;
        int childCount = d01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            wz0 d = d01Var.d(i10);
            yz0 yz0Var = d.a;
            boolean z11 = this.a;
            xz0 xz0Var = (z11 ? yz0Var.b : yz0Var.a).b;
            int i11 = z10 ? xz0Var.a : xz0Var.b;
            iArr[i11] = Math.max(iArr[i11], d01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        xz0 xz0Var;
        sz0 sz0Var = new sz0(xz0.class, zz0.class);
        a01[] a01VarArr = (a01[]) ((Object[]) f().c);
        int length = a01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                xz0Var = a01VarArr[i10].b;
            } else {
                xz0 xz0Var2 = a01VarArr[i10].b;
                xz0Var = new xz0(xz0Var2.b, xz0Var2.a);
            }
            zz0 zz0Var = new zz0();
            zz0Var.a = TLObject.FLAG_31;
            sz0Var.add(Pair.create(xz0Var, zz0Var));
        }
        return sz0Var.h();
    }

    public final rz0[] d() {
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
                xz0[] xz0VarArr = (xz0[]) ((Object[]) g3Var.c);
                if (i10 >= xz0VarArr.length) {
                    break;
                }
                j(arrayList, xz0VarArr[i10], ((zz0[]) ((Object[]) g3Var.d))[i10], false);
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
                xz0[] xz0VarArr2 = (xz0[]) ((Object[]) g3Var2.c);
                if (i11 >= xz0VarArr2.length) {
                    break;
                }
                j(arrayList2, xz0VarArr2[i11], ((zz0[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new xz0(i12, i13), new zz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new xz0(0, e), this.v, false);
            j(arrayList2, new xz0(e, 0), this.w, false);
            rz0[] q6 = q(arrayList);
            rz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(rz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (rz0[]) objArr;
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
        d01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        Object qz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.a;
        d01 d01Var = this.x;
        if (g3Var == null) {
            sz0 sz0Var = new sz0(a01.class, uz0.class);
            int childCount = d01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                yz0 yz0Var = d01Var.d(i10).a;
                a01 a01Var = z10 ? yz0Var.b : yz0Var.a;
                switch (a01.a(a01Var, z10).a) {
                    case 3:
                        qz0Var = new qz0();
                        break;
                    default:
                        qz0Var = new uz0();
                        break;
                }
                sz0Var.add(Pair.create(a01Var, qz0Var));
            }
            this.d = sz0Var.h();
        }
        if (!this.e) {
            for (uz0 uz0Var : (uz0[]) ((Object[]) this.d.d)) {
                uz0Var.c();
            }
            int childCount2 = d01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                wz0 d = d01Var.d(i11);
                yz0 yz0Var2 = d.a;
                a01 a01Var2 = z10 ? yz0Var2.b : yz0Var2.a;
                int e = d01Var.e(d, z10, false) + d01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = a01Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                m.g3 g3Var2 = this.d;
                uz0 uz0Var2 = (uz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.b)[i11]];
                uz0Var2.c = ((a01Var2.c == d01.R && f7 == 0.0f) ? 0 : 2) & uz0Var2.c;
                int a2 = a01.a(a01Var2, z10).a(d, i12);
                uz0Var2.b(a2, i12 - a2);
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
            d01 d01Var = this.x;
            if (!z11) {
                int childCount = d01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    yz0 yz0Var = d01Var.d(i10).a;
                    if ((z12 ? yz0Var.b : yz0Var.a).d != 0.0f) {
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
                    this.t = new int[d01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (d01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = d01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        yz0 yz0Var2 = d01Var.d(i11).a;
                        f7 += (z12 ? yz0Var2.b : yz0Var2.a).d;
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
            d01 d01Var = this.x;
            int childCount = d01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                yz0 yz0Var = d01Var.d(i13).a;
                xz0 xz0Var = (this.a ? yz0Var.b : yz0Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, xz0Var.a), xz0Var.b), xz0Var.a());
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
        zz0 zz0Var = this.w;
        zz0 zz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            zz0Var2.a = 0;
            zz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            zz0Var2.a = 0;
            zz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        zz0Var2.a = size;
        zz0Var.a = -size;
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
            d01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        d01 d01Var = this.x;
        int childCount = d01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            yz0 yz0Var = d01Var.d(i11).a;
            float f10 = (this.a ? yz0Var.b : yz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(rz0[] rz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < rz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (rz0 rz0Var : rz0VarArr) {
                    z11 |= m(iArr, rz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[rz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = rz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, rz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= rz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    rz0 rz0Var2 = rz0VarArr[i14];
                    xz0 xz0Var = rz0Var2.a;
                    if (xz0Var.a >= xz0Var.b) {
                        rz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final rz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (rz0[]) arrayList.toArray(new rz0[0]));
        int length = ((rz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (rz0[]) f0Var.c;
    }
}
