package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xz0 {
    public final boolean a;
    public li.k d;
    public li.k f;
    public li.k h;
    public int[] j;
    public int[] l;
    public vz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ h01 x;
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
    public final d01 v = new d01(0);
    public final d01 w = new d01(-100000);

    public xz0(h01 h01Var, boolean z10) {
        this.x = h01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, b01 b01Var, d01 d01Var, boolean z10) {
        if (b01Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((vz0) obj).a.equals(b01Var)) {
                    return;
                }
            }
        }
        arrayList.add(new vz0(b01Var, d01Var));
    }

    public static boolean m(int[] iArr, vz0 vz0Var) {
        if (!vz0Var.c) {
            return false;
        }
        b01 b01Var = vz0Var.a;
        int i10 = b01Var.a;
        int i11 = b01Var.b;
        int i12 = iArr[i10] + vz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(li.k kVar, boolean z10) {
        for (d01 d01Var : (d01[]) ((Object[]) kVar.d)) {
            d01Var.a = TLObject.FLAG_31;
        }
        yz0[] yz0VarArr = (yz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < yz0VarArr.length; i10++) {
            int d = yz0VarArr[i10].d(z10);
            d01 d01Var2 = (d01) ((Object[]) kVar.d)[((int[]) kVar.b)[i10]];
            int i11 = d01Var2.a;
            if (!z10) {
                d = -d;
            }
            d01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        h01 h01Var = this.x;
        int childCount = h01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            a01 d = h01Var.d(i10);
            c01 c01Var = d.a;
            boolean z11 = this.a;
            b01 b01Var = (z11 ? c01Var.b : c01Var.a).b;
            int i11 = z10 ? b01Var.a : b01Var.b;
            iArr[i11] = Math.max(iArr[i11], h01Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        b01 b01Var;
        wz0 wz0Var = new wz0(b01.class, d01.class);
        e01[] e01VarArr = (e01[]) ((Object[]) f().c);
        int length = e01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                b01Var = e01VarArr[i10].b;
            } else {
                b01 b01Var2 = e01VarArr[i10].b;
                b01Var = new b01(b01Var2.b, b01Var2.a);
            }
            d01 d01Var = new d01();
            d01Var.a = TLObject.FLAG_31;
            wz0Var.add(Pair.create(b01Var, d01Var));
        }
        return wz0Var.h();
    }

    public final vz0[] d() {
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
            li.k kVar = this.f;
            int i10 = 0;
            while (true) {
                b01[] b01VarArr = (b01[]) ((Object[]) kVar.c);
                if (i10 >= b01VarArr.length) {
                    break;
                }
                j(arrayList, b01VarArr[i10], ((d01[]) ((Object[]) kVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            li.k kVar2 = this.h;
            int i11 = 0;
            while (true) {
                b01[] b01VarArr2 = (b01[]) ((Object[]) kVar2.c);
                if (i11 >= b01VarArr2.length) {
                    break;
                }
                j(arrayList2, b01VarArr2[i11], ((d01[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new b01(i12, i13), new d01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new b01(0, e), this.v, false);
            j(arrayList2, new b01(e, 0), this.w, false);
            vz0[] q6 = q(arrayList);
            vz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(vz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (vz0[]) objArr;
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
        h01.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        Object uz0Var;
        li.k kVar = this.d;
        boolean z10 = this.a;
        h01 h01Var = this.x;
        if (kVar == null) {
            wz0 wz0Var = new wz0(e01.class, yz0.class);
            int childCount = h01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                c01 c01Var = h01Var.d(i10).a;
                e01 e01Var = z10 ? c01Var.b : c01Var.a;
                switch (e01.a(e01Var, z10).a) {
                    case 3:
                        uz0Var = new uz0();
                        break;
                    default:
                        uz0Var = new yz0();
                        break;
                }
                wz0Var.add(Pair.create(e01Var, uz0Var));
            }
            this.d = wz0Var.h();
        }
        if (!this.e) {
            for (yz0 yz0Var : (yz0[]) ((Object[]) this.d.d)) {
                yz0Var.c();
            }
            int childCount2 = h01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                a01 d = h01Var.d(i11);
                c01 c01Var2 = d.a;
                e01 e01Var2 = z10 ? c01Var2.b : c01Var2.a;
                int e = h01Var.e(d, z10, false) + h01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = e01Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                li.k kVar2 = this.d;
                yz0 yz0Var2 = (yz0) ((Object[]) kVar2.d)[((int[]) kVar2.b)[i11]];
                yz0Var2.c = ((e01Var2.c == h01.R && f7 == 0.0f) ? 0 : 2) & yz0Var2.c;
                int a2 = e01.a(e01Var2, z10).a(d, i12);
                yz0Var2.b(a2, i12 - a2);
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
            h01 h01Var = this.x;
            if (!z11) {
                int childCount = h01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    c01 c01Var = h01Var.d(i10).a;
                    if ((z12 ? c01Var.b : c01Var.a).d != 0.0f) {
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
                    this.t = new int[h01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (h01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = h01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        c01 c01Var2 = h01Var.d(i11).a;
                        f7 += (z12 ? c01Var2.b : c01Var2.a).d;
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
            h01 h01Var = this.x;
            int childCount = h01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                c01 c01Var = h01Var.d(i13).a;
                b01 b01Var = (this.a ? c01Var.b : c01Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, b01Var.a), b01Var.b), b01Var.a());
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
        d01 d01Var = this.w;
        d01 d01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            d01Var2.a = 0;
            d01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            d01Var2.a = 0;
            d01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        d01Var2.a = size;
        d01Var.a = -size;
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
            h01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        h01 h01Var = this.x;
        int childCount = h01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            c01 c01Var = h01Var.d(i11).a;
            float f10 = (this.a ? c01Var.b : c01Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(vz0[] vz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < vz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (vz0 vz0Var : vz0VarArr) {
                    z11 |= m(iArr, vz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[vz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = vz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, vz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= vz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    vz0 vz0Var2 = vz0VarArr[i14];
                    b01 b01Var = vz0Var2.a;
                    if (b01Var.a >= b01Var.b) {
                        vz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final vz0[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (vz0[]) arrayList.toArray(new vz0[0]));
        int length = ((vz0[][]) g0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (vz0[]) g0Var.b;
    }
}
