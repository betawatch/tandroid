package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kz0 {
    public final boolean a;
    public la.h d;
    public la.h f;
    public la.h h;
    public int[] j;
    public int[] l;
    public iz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ uz0 x;
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
    public final qz0 v = new qz0(0);
    public final qz0 w = new qz0(-100000);

    public kz0(uz0 uz0Var, boolean z10) {
        this.x = uz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, oz0 oz0Var, qz0 qz0Var, boolean z10) {
        if (oz0Var.b - oz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((iz0) obj).a.equals(oz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new iz0(oz0Var, qz0Var));
    }

    public static boolean m(int[] iArr, iz0 iz0Var) {
        if (!iz0Var.c) {
            return false;
        }
        oz0 oz0Var = iz0Var.a;
        int i10 = oz0Var.a;
        int i11 = oz0Var.b;
        int i12 = iArr[i10] + iz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(la.h hVar, boolean z10) {
        for (qz0 qz0Var : (qz0[]) ((Object[]) hVar.d)) {
            qz0Var.a = TLObject.FLAG_31;
        }
        lz0[] lz0VarArr = (lz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < lz0VarArr.length; i10++) {
            int d = lz0VarArr[i10].d(z10);
            qz0 qz0Var2 = (qz0) ((Object[]) hVar.d)[((int[]) hVar.b)[i10]];
            int i11 = qz0Var2.a;
            if (!z10) {
                d = -d;
            }
            qz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        uz0 uz0Var = this.x;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            nz0 d = uz0Var.d(i10);
            pz0 pz0Var = d.a;
            boolean z11 = this.a;
            oz0 oz0Var = (z11 ? pz0Var.b : pz0Var.a).b;
            int i11 = z10 ? oz0Var.a : oz0Var.b;
            iArr[i11] = Math.max(iArr[i11], uz0Var.f(d, z11, z10));
        }
    }

    public final la.h c(boolean z10) {
        oz0 oz0Var;
        jz0 jz0Var = new jz0(oz0.class, qz0.class);
        rz0[] rz0VarArr = (rz0[]) ((Object[]) f().c);
        int length = rz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                oz0Var = rz0VarArr[i10].b;
            } else {
                oz0 oz0Var2 = rz0VarArr[i10].b;
                oz0Var = new oz0(oz0Var2.b, oz0Var2.a);
            }
            qz0 qz0Var = new qz0();
            qz0Var.a = TLObject.FLAG_31;
            jz0Var.add(Pair.create(oz0Var, qz0Var));
        }
        return jz0Var.i();
    }

    public final iz0[] d() {
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
                oz0[] oz0VarArr = (oz0[]) ((Object[]) hVar.c);
                if (i10 >= oz0VarArr.length) {
                    break;
                }
                j(arrayList, oz0VarArr[i10], ((qz0[]) ((Object[]) hVar.d))[i10], false);
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
                oz0[] oz0VarArr2 = (oz0[]) ((Object[]) hVar2.c);
                if (i11 >= oz0VarArr2.length) {
                    break;
                }
                j(arrayList2, oz0VarArr2[i11], ((qz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new oz0(i12, i13), new qz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new oz0(0, e), this.v, false);
            j(arrayList2, new oz0(e, 0), this.w, false);
            iz0[] q6 = q(arrayList);
            iz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(iz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (iz0[]) objArr;
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

    public final la.h f() {
        Object hz0Var;
        la.h hVar = this.d;
        boolean z10 = this.a;
        uz0 uz0Var = this.x;
        if (hVar == null) {
            jz0 jz0Var = new jz0(rz0.class, lz0.class);
            int childCount = uz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                pz0 pz0Var = uz0Var.d(i10).a;
                rz0 rz0Var = z10 ? pz0Var.b : pz0Var.a;
                switch (rz0.a(rz0Var, z10).a) {
                    case 3:
                        hz0Var = new hz0();
                        break;
                    default:
                        hz0Var = new lz0();
                        break;
                }
                jz0Var.add(Pair.create(rz0Var, hz0Var));
            }
            this.d = jz0Var.i();
        }
        if (!this.e) {
            for (lz0 lz0Var : (lz0[]) ((Object[]) this.d.d)) {
                lz0Var.c();
            }
            int childCount2 = uz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                nz0 d = uz0Var.d(i11);
                pz0 pz0Var2 = d.a;
                rz0 rz0Var2 = z10 ? pz0Var2.b : pz0Var2.a;
                int e = uz0Var.e(d, z10, false) + uz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = rz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                la.h hVar2 = this.d;
                lz0 lz0Var2 = (lz0) ((Object[]) hVar2.d)[((int[]) hVar2.b)[i11]];
                lz0Var2.c = ((rz0Var2.c == uz0.R && f7 == 0.0f) ? 0 : 2) & lz0Var2.c;
                int a2 = rz0.a(rz0Var2, z10).a(d, i12);
                lz0Var2.b(a2, i12 - a2);
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
            uz0 uz0Var = this.x;
            if (!z11) {
                int childCount = uz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    pz0 pz0Var = uz0Var.d(i10).a;
                    if ((z12 ? pz0Var.b : pz0Var.a).d != 0.0f) {
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
                    this.t = new int[uz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (uz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = uz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        pz0 pz0Var2 = uz0Var.d(i11).a;
                        f7 += (z12 ? pz0Var2.b : pz0Var2.a).d;
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
            uz0 uz0Var = this.x;
            int childCount = uz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                pz0 pz0Var = uz0Var.d(i13).a;
                oz0 oz0Var = (this.a ? pz0Var.b : pz0Var.a).b;
                int i14 = oz0Var.a;
                int i15 = oz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - oz0Var.a);
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
        qz0 qz0Var = this.w;
        qz0 qz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            qz0Var2.a = 0;
            qz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            qz0Var2.a = 0;
            qz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        qz0Var2.a = size;
        qz0Var.a = -size;
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
            throw new IllegalArgumentException(v7.j.t((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        uz0 uz0Var = this.x;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            pz0 pz0Var = uz0Var.d(i11).a;
            float f10 = (this.a ? pz0Var.b : pz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(iz0[] iz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < iz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (iz0 iz0Var : iz0VarArr) {
                    z11 |= m(iArr, iz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[iz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = iz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, iz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= iz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    iz0 iz0Var2 = iz0VarArr[i14];
                    oz0 oz0Var = iz0Var2.a;
                    if (oz0Var.a >= oz0Var.b) {
                        iz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final iz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (iz0[]) arrayList.toArray(new iz0[0]));
        int length = ((iz0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (iz0[]) i0Var.b;
    }
}
