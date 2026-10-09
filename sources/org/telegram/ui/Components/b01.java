package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b01 {
    public final boolean a;
    public la.h d;
    public la.h f;
    public la.h h;
    public int[] j;
    public int[] l;
    public zz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ l01 x;
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
    public final h01 v = new h01(0);
    public final h01 w = new h01(-100000);

    public b01(l01 l01Var, boolean z10) {
        this.x = l01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, f01 f01Var, h01 h01Var, boolean z10) {
        if (f01Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((zz0) obj).a.equals(f01Var)) {
                    return;
                }
            }
        }
        arrayList.add(new zz0(f01Var, h01Var));
    }

    public static boolean m(int[] iArr, zz0 zz0Var) {
        if (!zz0Var.c) {
            return false;
        }
        f01 f01Var = zz0Var.a;
        int i10 = f01Var.a;
        int i11 = f01Var.b;
        int i12 = iArr[i10] + zz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(la.h hVar, boolean z10) {
        for (h01 h01Var : (h01[]) ((Object[]) hVar.d)) {
            h01Var.a = TLObject.FLAG_31;
        }
        c01[] c01VarArr = (c01[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < c01VarArr.length; i10++) {
            int d = c01VarArr[i10].d(z10);
            h01 h01Var2 = (h01) ((Object[]) hVar.d)[((int[]) hVar.b)[i10]];
            int i11 = h01Var2.a;
            if (!z10) {
                d = -d;
            }
            h01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        l01 l01Var = this.x;
        int childCount = l01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e01 d = l01Var.d(i10);
            g01 g01Var = d.a;
            boolean z11 = this.a;
            f01 f01Var = (z11 ? g01Var.b : g01Var.a).b;
            int i11 = z10 ? f01Var.a : f01Var.b;
            iArr[i11] = Math.max(iArr[i11], l01Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        f01 f01Var;
        a01 a01Var = new a01(f01.class, h01.class);
        i01[] i01VarArr = (i01[]) ((Object[]) f().c);
        int length = i01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                f01Var = i01VarArr[i10].b;
            } else {
                f01 f01Var2 = i01VarArr[i10].b;
                f01Var = new f01(f01Var2.b, f01Var2.a);
            }
            h01 h01Var = new h01();
            h01Var.a = TLObject.FLAG_31;
            a01Var.add(Pair.create(f01Var, h01Var));
        }
        return a01Var.i();
    }

    public final zz0[] d() {
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
                f01[] f01VarArr = (f01[]) ((Object[]) hVar.c);
                if (i10 >= f01VarArr.length) {
                    break;
                }
                j(arrayList, f01VarArr[i10], ((h01[]) ((Object[]) hVar.d))[i10], false);
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
                f01[] f01VarArr2 = (f01[]) ((Object[]) hVar2.c);
                if (i11 >= f01VarArr2.length) {
                    break;
                }
                j(arrayList2, f01VarArr2[i11], ((h01[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new f01(i12, i13), new h01(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new f01(0, e7), this.v, false);
            j(arrayList2, new f01(e7, 0), this.w, false);
            zz0[] q6 = q(arrayList);
            zz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (zz0[]) objArr;
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
        l01.g("Table grid count out of bounds");
        throw null;
    }

    public final la.h f() {
        Object yz0Var;
        la.h hVar = this.d;
        boolean z10 = this.a;
        l01 l01Var = this.x;
        if (hVar == null) {
            a01 a01Var = new a01(i01.class, c01.class);
            int childCount = l01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                g01 g01Var = l01Var.d(i10).a;
                i01 i01Var = z10 ? g01Var.b : g01Var.a;
                switch (i01.a(i01Var, z10).a) {
                    case 3:
                        yz0Var = new yz0();
                        break;
                    default:
                        yz0Var = new c01();
                        break;
                }
                a01Var.add(Pair.create(i01Var, yz0Var));
            }
            this.d = a01Var.i();
        }
        if (!this.e) {
            for (c01 c01Var : (c01[]) ((Object[]) this.d.d)) {
                c01Var.c();
            }
            int childCount2 = l01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                e01 d = l01Var.d(i11);
                g01 g01Var2 = d.a;
                i01 i01Var2 = z10 ? g01Var2.b : g01Var2.a;
                int e7 = l01Var.e(d, z10, false) + l01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = i01Var2.d;
                int i12 = e7 + (f7 == 0.0f ? 0 : this.t[i11]);
                la.h hVar2 = this.d;
                c01 c01Var2 = (c01) ((Object[]) hVar2.d)[((int[]) hVar2.b)[i11]];
                c01Var2.c = ((i01Var2.c == l01.R && f7 == 0.0f) ? 0 : 2) & c01Var2.c;
                int a2 = i01.a(i01Var2, z10).a(d, i12);
                c01Var2.b(a2, i12 - a2);
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
            l01 l01Var = this.x;
            if (!z11) {
                int childCount = l01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    g01 g01Var = l01Var.d(i10).a;
                    if ((z12 ? g01Var.b : g01Var.a).d != 0.0f) {
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
                    this.t = new int[l01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (l01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = l01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        g01 g01Var2 = l01Var.d(i11).a;
                        f7 += (z12 ? g01Var2.b : g01Var2.a).d;
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
            l01 l01Var = this.x;
            int childCount = l01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                g01 g01Var = l01Var.d(i13).a;
                f01 f01Var = (this.a ? g01Var.b : g01Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, f01Var.a), f01Var.b), f01Var.a());
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
        h01 h01Var = this.w;
        h01 h01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            h01Var2.a = 0;
            h01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            h01Var2.a = 0;
            h01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        h01Var2.a = size;
        h01Var.a = -size;
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
            l01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        l01 l01Var = this.x;
        int childCount = l01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            g01 g01Var = l01Var.d(i11).a;
            float f10 = (this.a ? g01Var.b : g01Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(zz0[] zz0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < zz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (zz0 zz0Var : zz0VarArr) {
                    z11 |= m(iArr, zz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[zz0VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = zz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, zz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= zz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    zz0 zz0Var2 = zz0VarArr[i14];
                    f01 f01Var = zz0Var2.a;
                    if (f01Var.a >= f01Var.b) {
                        zz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final zz0[] q(ArrayList arrayList) {
        e0.g0 g0Var = new e0.g0(this, (zz0[]) arrayList.toArray(new zz0[0]));
        int length = ((zz0[][]) g0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            g0Var.f(i10);
        }
        return (zz0[]) g0Var.b;
    }
}
