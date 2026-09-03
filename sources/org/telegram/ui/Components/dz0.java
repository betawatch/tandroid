package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dz0 {
    public final boolean a;
    public l7.w0 d;
    public l7.w0 f;
    public l7.w0 h;
    public int[] j;
    public int[] l;
    public bz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ nz0 x;
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
    public final jz0 v = new jz0(0);
    public final jz0 w = new jz0(-100000);

    public dz0(nz0 nz0Var, boolean z4) {
        this.x = nz0Var;
        this.a = z4;
    }

    public static void j(ArrayList arrayList, hz0 hz0Var, jz0 jz0Var, boolean z4) {
        if (hz0Var.b - hz0Var.a == 0) {
            return;
        }
        if (z4) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((bz0) obj).a.equals(hz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new bz0(hz0Var, jz0Var));
    }

    public static boolean m(int[] iArr, bz0 bz0Var) {
        if (!bz0Var.c) {
            return false;
        }
        hz0 hz0Var = bz0Var.a;
        int i10 = hz0Var.a;
        int i11 = hz0Var.b;
        int i12 = iArr[i10] + bz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(l7.w0 w0Var, boolean z4) {
        for (jz0 jz0Var : (jz0[]) ((Object[]) w0Var.d)) {
            jz0Var.a = TLObject.FLAG_31;
        }
        ez0[] ez0VarArr = (ez0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ez0VarArr.length; i10++) {
            int d = ez0VarArr[i10].d(z4);
            jz0 jz0Var2 = (jz0) ((Object[]) w0Var.d)[((int[]) w0Var.b)[i10]];
            int i11 = jz0Var2.a;
            if (!z4) {
                d = -d;
            }
            jz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z4) {
        int[] iArr = z4 ? this.j : this.l;
        nz0 nz0Var = this.x;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gz0 d = nz0Var.d(i10);
            iz0 iz0Var = d.a;
            boolean z10 = this.a;
            hz0 hz0Var = (z10 ? iz0Var.b : iz0Var.a).b;
            int i11 = z4 ? hz0Var.a : hz0Var.b;
            iArr[i11] = Math.max(iArr[i11], nz0Var.f(d, z10, z4));
        }
    }

    public final l7.w0 c(boolean z4) {
        hz0 hz0Var;
        cz0 cz0Var = new cz0(hz0.class, jz0.class);
        kz0[] kz0VarArr = (kz0[]) ((Object[]) f().c);
        int length = kz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z4) {
                hz0Var = kz0VarArr[i10].b;
            } else {
                hz0 hz0Var2 = kz0VarArr[i10].b;
                hz0Var = new hz0(hz0Var2.b, hz0Var2.a);
            }
            jz0 jz0Var = new jz0();
            jz0Var.a = TLObject.FLAG_31;
            cz0Var.add(Pair.create(hz0Var, jz0Var));
        }
        return cz0Var.i();
    }

    public final bz0[] d() {
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
            l7.w0 w0Var = this.f;
            int i10 = 0;
            while (true) {
                hz0[] hz0VarArr = (hz0[]) ((Object[]) w0Var.c);
                if (i10 >= hz0VarArr.length) {
                    break;
                }
                j(arrayList, hz0VarArr[i10], ((jz0[]) ((Object[]) w0Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            l7.w0 w0Var2 = this.h;
            int i11 = 0;
            while (true) {
                hz0[] hz0VarArr2 = (hz0[]) ((Object[]) w0Var2.c);
                if (i11 >= hz0VarArr2.length) {
                    break;
                }
                j(arrayList2, hz0VarArr2[i11], ((jz0[]) ((Object[]) w0Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new hz0(i12, i13), new jz0(0), true);
                    i12 = i13;
                }
            }
            int e6 = e();
            j(arrayList, new hz0(0, e6), this.v, false);
            j(arrayList2, new hz0(e6, 0), this.w, false);
            bz0[] q10 = q(arrayList);
            bz0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(bz0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (bz0[]) objArr;
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
        return Math.max(this.b, h());
    }

    public final l7.w0 f() {
        Object az0Var;
        l7.w0 w0Var = this.d;
        boolean z4 = this.a;
        nz0 nz0Var = this.x;
        if (w0Var == null) {
            cz0 cz0Var = new cz0(kz0.class, ez0.class);
            int childCount = nz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                iz0 iz0Var = nz0Var.d(i10).a;
                kz0 kz0Var = z4 ? iz0Var.b : iz0Var.a;
                switch (kz0.a(kz0Var, z4).a) {
                    case 3:
                        az0Var = new az0();
                        break;
                    default:
                        az0Var = new ez0();
                        break;
                }
                cz0Var.add(Pair.create(kz0Var, az0Var));
            }
            this.d = cz0Var.i();
        }
        if (!this.e) {
            for (ez0 ez0Var : (ez0[]) ((Object[]) this.d.d)) {
                ez0Var.c();
            }
            int childCount2 = nz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                gz0 d = nz0Var.d(i11);
                iz0 iz0Var2 = d.a;
                kz0 kz0Var2 = z4 ? iz0Var2.b : iz0Var2.a;
                int e6 = nz0Var.e(d, z4, false) + nz0Var.e(d, z4, true) + (z4 ? d.k : d.l);
                float f10 = kz0Var2.d;
                int i12 = e6 + (f10 == 0.0f ? 0 : this.t[i11]);
                l7.w0 w0Var2 = this.d;
                ez0 ez0Var2 = (ez0) ((Object[]) w0Var2.d)[((int[]) w0Var2.b)[i11]];
                ez0Var2.c = ((kz0Var2.c == nz0.O && f10 == 0.0f) ? 0 : 2) & ez0Var2.c;
                int a2 = kz0.a(kz0Var2, z4).a(d, i12);
                ez0Var2.b(a2, i12 - a2);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        boolean z4;
        if (this.p == null) {
            this.p = new int[e() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z10 = this.s;
            float f10 = 0.0f;
            boolean z11 = this.a;
            nz0 nz0Var = this.x;
            if (!z10) {
                int childCount = nz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z4 = false;
                        break;
                    }
                    iz0 iz0Var = nz0Var.d(i10).a;
                    if ((z11 ? iz0Var.b : iz0Var.a).d != 0.0f) {
                        z4 = true;
                        break;
                    }
                    i10++;
                }
                this.r = z4;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[nz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (nz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = nz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        iz0 iz0Var2 = nz0Var.d(i11).a;
                        f10 += (z11 ? iz0Var2.b : iz0Var2.a).d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z12 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f10, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z12 = p10;
                    }
                    if (i12 > 0 && !z12) {
                        l();
                        o(f10, i12);
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
            nz0 nz0Var = this.x;
            int childCount = nz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                iz0 iz0Var = nz0Var.d(i13).a;
                hz0 hz0Var = (this.a ? iz0Var.b : iz0Var.a).b;
                int i14 = hz0Var.a;
                int i15 = hz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - hz0Var.a);
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
        jz0 jz0Var = this.w;
        jz0 jz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            jz0Var2.a = 0;
            jz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            jz0Var2.a = 0;
            jz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        jz0Var2.a = size;
        jz0Var.a = -size;
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
        if (i10 != Integer.MIN_VALUE && i10 < h()) {
            throw new IllegalArgumentException(w.c.e((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f10, int i10) {
        Arrays.fill(this.t, 0);
        nz0 nz0Var = this.x;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iz0 iz0Var = nz0Var.d(i11).a;
            float f11 = (this.a ? iz0Var.b : iz0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i10 * f11) / f10);
                this.t[i11] = round;
                i10 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(bz0[] bz0VarArr, int[] iArr, boolean z4) {
        int e6 = e() + 1;
        loop0: for (int i10 = 0; i10 < bz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e6; i11++) {
                boolean z10 = false;
                for (bz0 bz0Var : bz0VarArr) {
                    z10 |= m(iArr, bz0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z4) {
                return false;
            }
            boolean[] zArr = new boolean[bz0VarArr.length];
            for (int i12 = 0; i12 < e6; i12++) {
                int length = bz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, bz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= bz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    bz0 bz0Var2 = bz0VarArr[i14];
                    hz0 hz0Var = bz0Var2.a;
                    if (hz0Var.a >= hz0Var.b) {
                        bz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final bz0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (bz0[]) arrayList.toArray(new bz0[0]));
        int length = ((bz0[][]) kVar.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            kVar.f(i10);
        }
        return (bz0[]) kVar.b;
    }
}
