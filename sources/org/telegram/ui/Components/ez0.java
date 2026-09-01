package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ez0 {
    public final boolean a;
    public l7.w0 d;
    public l7.w0 f;
    public l7.w0 h;
    public int[] j;
    public int[] l;
    public cz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ oz0 x;
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
    public final kz0 v = new kz0(0);
    public final kz0 w = new kz0(-100000);

    public ez0(oz0 oz0Var, boolean z4) {
        this.x = oz0Var;
        this.a = z4;
    }

    public static void j(ArrayList arrayList, iz0 iz0Var, kz0 kz0Var, boolean z4) {
        if (iz0Var.b - iz0Var.a == 0) {
            return;
        }
        if (z4) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((cz0) obj).a.equals(iz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new cz0(iz0Var, kz0Var));
    }

    public static boolean m(int[] iArr, cz0 cz0Var) {
        if (!cz0Var.c) {
            return false;
        }
        iz0 iz0Var = cz0Var.a;
        int i10 = iz0Var.a;
        int i11 = iz0Var.b;
        int i12 = iArr[i10] + cz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(l7.w0 w0Var, boolean z4) {
        for (kz0 kz0Var : (kz0[]) ((Object[]) w0Var.d)) {
            kz0Var.a = TLObject.FLAG_31;
        }
        fz0[] fz0VarArr = (fz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < fz0VarArr.length; i10++) {
            int d = fz0VarArr[i10].d(z4);
            kz0 kz0Var2 = (kz0) ((Object[]) w0Var.d)[((int[]) w0Var.b)[i10]];
            int i11 = kz0Var2.a;
            if (!z4) {
                d = -d;
            }
            kz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z4) {
        int[] iArr = z4 ? this.j : this.l;
        oz0 oz0Var = this.x;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hz0 d = oz0Var.d(i10);
            jz0 jz0Var = d.a;
            boolean z10 = this.a;
            iz0 iz0Var = (z10 ? jz0Var.b : jz0Var.a).b;
            int i11 = z4 ? iz0Var.a : iz0Var.b;
            iArr[i11] = Math.max(iArr[i11], oz0Var.f(d, z10, z4));
        }
    }

    public final l7.w0 c(boolean z4) {
        iz0 iz0Var;
        dz0 dz0Var = new dz0(iz0.class, kz0.class);
        lz0[] lz0VarArr = (lz0[]) ((Object[]) f().c);
        int length = lz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z4) {
                iz0Var = lz0VarArr[i10].b;
            } else {
                iz0 iz0Var2 = lz0VarArr[i10].b;
                iz0Var = new iz0(iz0Var2.b, iz0Var2.a);
            }
            kz0 kz0Var = new kz0();
            kz0Var.a = TLObject.FLAG_31;
            dz0Var.add(Pair.create(iz0Var, kz0Var));
        }
        return dz0Var.i();
    }

    public final cz0[] d() {
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
                iz0[] iz0VarArr = (iz0[]) ((Object[]) w0Var.c);
                if (i10 >= iz0VarArr.length) {
                    break;
                }
                j(arrayList, iz0VarArr[i10], ((kz0[]) ((Object[]) w0Var.d))[i10], false);
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
                iz0[] iz0VarArr2 = (iz0[]) ((Object[]) w0Var2.c);
                if (i11 >= iz0VarArr2.length) {
                    break;
                }
                j(arrayList2, iz0VarArr2[i11], ((kz0[]) ((Object[]) w0Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new iz0(i12, i13), new kz0(0), true);
                    i12 = i13;
                }
            }
            int e6 = e();
            j(arrayList, new iz0(0, e6), this.v, false);
            j(arrayList2, new iz0(e6, 0), this.w, false);
            cz0[] q10 = q(arrayList);
            cz0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(cz0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (cz0[]) objArr;
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
        Object bz0Var;
        l7.w0 w0Var = this.d;
        boolean z4 = this.a;
        oz0 oz0Var = this.x;
        if (w0Var == null) {
            dz0 dz0Var = new dz0(lz0.class, fz0.class);
            int childCount = oz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                jz0 jz0Var = oz0Var.d(i10).a;
                lz0 lz0Var = z4 ? jz0Var.b : jz0Var.a;
                switch (lz0.a(lz0Var, z4).a) {
                    case 3:
                        bz0Var = new bz0();
                        break;
                    default:
                        bz0Var = new fz0();
                        break;
                }
                dz0Var.add(Pair.create(lz0Var, bz0Var));
            }
            this.d = dz0Var.i();
        }
        if (!this.e) {
            for (fz0 fz0Var : (fz0[]) ((Object[]) this.d.d)) {
                fz0Var.c();
            }
            int childCount2 = oz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                hz0 d = oz0Var.d(i11);
                jz0 jz0Var2 = d.a;
                lz0 lz0Var2 = z4 ? jz0Var2.b : jz0Var2.a;
                int e6 = oz0Var.e(d, z4, false) + oz0Var.e(d, z4, true) + (z4 ? d.k : d.l);
                float f10 = lz0Var2.d;
                int i12 = e6 + (f10 == 0.0f ? 0 : this.t[i11]);
                l7.w0 w0Var2 = this.d;
                fz0 fz0Var2 = (fz0) ((Object[]) w0Var2.d)[((int[]) w0Var2.b)[i11]];
                fz0Var2.c = ((lz0Var2.c == oz0.O && f10 == 0.0f) ? 0 : 2) & fz0Var2.c;
                int a2 = lz0.a(lz0Var2, z4).a(d, i12);
                fz0Var2.b(a2, i12 - a2);
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
            oz0 oz0Var = this.x;
            if (!z10) {
                int childCount = oz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z4 = false;
                        break;
                    }
                    jz0 jz0Var = oz0Var.d(i10).a;
                    if ((z11 ? jz0Var.b : jz0Var.a).d != 0.0f) {
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
                    this.t = new int[oz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (oz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = oz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        jz0 jz0Var2 = oz0Var.d(i11).a;
                        f10 += (z11 ? jz0Var2.b : jz0Var2.a).d;
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
            oz0 oz0Var = this.x;
            int childCount = oz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                jz0 jz0Var = oz0Var.d(i13).a;
                iz0 iz0Var = (this.a ? jz0Var.b : jz0Var.a).b;
                int i14 = iz0Var.a;
                int i15 = iz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - iz0Var.a);
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
        kz0 kz0Var = this.w;
        kz0 kz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            kz0Var2.a = 0;
            kz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            kz0Var2.a = 0;
            kz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        kz0Var2.a = size;
        kz0Var.a = -size;
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
        oz0 oz0Var = this.x;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jz0 jz0Var = oz0Var.d(i11).a;
            float f11 = (this.a ? jz0Var.b : jz0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i10 * f11) / f10);
                this.t[i11] = round;
                i10 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(cz0[] cz0VarArr, int[] iArr, boolean z4) {
        int e6 = e() + 1;
        loop0: for (int i10 = 0; i10 < cz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e6; i11++) {
                boolean z10 = false;
                for (cz0 cz0Var : cz0VarArr) {
                    z10 |= m(iArr, cz0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z4) {
                return false;
            }
            boolean[] zArr = new boolean[cz0VarArr.length];
            for (int i12 = 0; i12 < e6; i12++) {
                int length = cz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, cz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= cz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    cz0 cz0Var2 = cz0VarArr[i14];
                    iz0 iz0Var = cz0Var2.a;
                    if (iz0Var.a >= iz0Var.b) {
                        cz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final cz0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (cz0[]) arrayList.toArray(new cz0[0]));
        int length = ((cz0[][]) kVar.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            kVar.f(i10);
        }
        return (cz0[]) kVar.b;
    }
}
