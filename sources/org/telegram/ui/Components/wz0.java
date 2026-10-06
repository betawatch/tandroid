package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class wz0 {
    public final boolean a;
    public la.h d;
    public la.h f;
    public la.h h;
    public int[] j;
    public int[] l;
    public uz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ g01 x;
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
    public final c01 v = new c01(0);
    public final c01 w = new c01(-100000);

    public wz0(g01 g01Var, boolean z10) {
        this.x = g01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, a01 a01Var, c01 c01Var, boolean z10) {
        if (a01Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((uz0) obj).a.equals(a01Var)) {
                    return;
                }
            }
        }
        arrayList.add(new uz0(a01Var, c01Var));
    }

    public static boolean m(int[] iArr, uz0 uz0Var) {
        if (!uz0Var.c) {
            return false;
        }
        a01 a01Var = uz0Var.a;
        int i10 = a01Var.a;
        int i11 = a01Var.b;
        int i12 = iArr[i10] + uz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(la.h hVar, boolean z10) {
        for (c01 c01Var : (c01[]) ((Object[]) hVar.d)) {
            c01Var.a = TLObject.FLAG_31;
        }
        xz0[] xz0VarArr = (xz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < xz0VarArr.length; i10++) {
            int d = xz0VarArr[i10].d(z10);
            c01 c01Var2 = (c01) ((Object[]) hVar.d)[((int[]) hVar.b)[i10]];
            int i11 = c01Var2.a;
            if (!z10) {
                d = -d;
            }
            c01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        g01 g01Var = this.x;
        int childCount = g01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            zz0 d = g01Var.d(i10);
            b01 b01Var = d.a;
            boolean z11 = this.a;
            a01 a01Var = (z11 ? b01Var.b : b01Var.a).b;
            int i11 = z10 ? a01Var.a : a01Var.b;
            iArr[i11] = Math.max(iArr[i11], g01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        a01 a01Var;
        vz0 vz0Var = new vz0(a01.class, c01.class);
        d01[] d01VarArr = (d01[]) ((Object[]) f().c);
        int length = d01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                a01Var = d01VarArr[i10].b;
            } else {
                a01 a01Var2 = d01VarArr[i10].b;
                a01Var = new a01(a01Var2.b, a01Var2.a);
            }
            c01 c01Var = new c01();
            c01Var.a = TLObject.FLAG_31;
            vz0Var.add(Pair.create(a01Var, c01Var));
        }
        return vz0Var.i();
    }

    public final uz0[] d() {
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
            la.h hVar = this.f;
            int i10 = 0;
            while (true) {
                a01[] a01VarArr = (a01[]) ((Object[]) hVar.c);
                if (i10 >= a01VarArr.length) {
                    break;
                }
                j(arrayList, a01VarArr[i10], ((c01[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            la.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                a01[] a01VarArr2 = (a01[]) ((Object[]) hVar2.c);
                if (i11 >= a01VarArr2.length) {
                    break;
                }
                j(arrayList2, a01VarArr2[i11], ((c01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new a01(i12, i13), new c01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new a01(0, e7), this.v, false);
            j(arrayList2, new a01(e7, 0), this.w, false);
            uz0[] q6 = q(arrayList);
            uz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(uz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (uz0[]) objArr;
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
        g01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        Object tz0Var;
        la.h hVar = this.d;
        boolean z10 = this.a;
        g01 g01Var = this.x;
        if (hVar == null) {
            vz0 vz0Var = new vz0(d01.class, xz0.class);
            int childCount = g01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b01 b01Var = g01Var.d(i10).a;
                d01 d01Var = z10 ? b01Var.b : b01Var.a;
                switch (d01.a(d01Var, z10).a) {
                    case 3:
                        tz0Var = new tz0();
                        break;
                    default:
                        tz0Var = new xz0();
                        break;
                }
                vz0Var.add(Pair.create(d01Var, tz0Var));
            }
            this.d = vz0Var.i();
        }
        if (!this.e) {
            for (xz0 xz0Var : (xz0[]) ((Object[]) this.d.d)) {
                xz0Var.c();
            }
            int childCount2 = g01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                zz0 d = g01Var.d(i11);
                b01 b01Var2 = d.a;
                d01 d01Var2 = z10 ? b01Var2.b : b01Var2.a;
                int e7 = g01Var.e(d, z10, false) + g01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = d01Var2.d;
                int i12 = e7 + (f7 == 0.0f ? 0 : this.t[i11]);
                la.h hVar2 = this.d;
                xz0 xz0Var2 = (xz0) ((Object[]) hVar2.d)[((int[]) hVar2.b)[i11]];
                xz0Var2.c = ((d01Var2.c == g01.R && f7 == 0.0f) ? 0 : 2) & xz0Var2.c;
                int a2 = d01.a(d01Var2, z10).a(d, i12);
                xz0Var2.b(a2, i12 - a2);
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
            g01 g01Var = this.x;
            if (!z11) {
                int childCount = g01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    b01 b01Var = g01Var.d(i10).a;
                    if ((z12 ? b01Var.b : b01Var.a).d != 0.0f) {
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
                    this.t = new int[g01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (g01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = g01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        b01 b01Var2 = g01Var.d(i11).a;
                        f7 += (z12 ? b01Var2.b : b01Var2.a).d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
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
            g01 g01Var = this.x;
            int childCount = g01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                b01 b01Var = g01Var.d(i13).a;
                a01 a01Var = (this.a ? b01Var.b : b01Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, a01Var.a), a01Var.b), a01Var.a());
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
        c01 c01Var = this.w;
        c01 c01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            c01Var2.a = 0;
            c01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            c01Var2.a = 0;
            c01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        c01Var2.a = size;
        c01Var.a = -size;
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
            g01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        g01 g01Var = this.x;
        int childCount = g01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b01 b01Var = g01Var.d(i11).a;
            float f10 = (this.a ? b01Var.b : b01Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(uz0[] uz0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < uz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (uz0 uz0Var : uz0VarArr) {
                    z11 |= m(iArr, uz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[uz0VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = uz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, uz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= uz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    uz0 uz0Var2 = uz0VarArr[i14];
                    a01 a01Var = uz0Var2.a;
                    if (a01Var.a >= a01Var.b) {
                        uz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final uz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (uz0[]) arrayList.toArray(new uz0[0]));
        int length = ((uz0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (uz0[]) i0Var.b;
    }
}
