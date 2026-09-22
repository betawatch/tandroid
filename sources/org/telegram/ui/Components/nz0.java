package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class nz0 {
    public final boolean a;
    public lf.h d;
    public lf.h f;
    public lf.h h;
    public int[] j;
    public int[] l;
    public lz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ xz0 x;
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
    public final tz0 v = new tz0(0);
    public final tz0 w = new tz0(-100000);

    public nz0(xz0 xz0Var, boolean z10) {
        this.x = xz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, rz0 rz0Var, tz0 tz0Var, boolean z10) {
        if (rz0Var.b - rz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((lz0) obj).a.equals(rz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new lz0(rz0Var, tz0Var));
    }

    public static boolean m(int[] iArr, lz0 lz0Var) {
        if (!lz0Var.c) {
            return false;
        }
        rz0 rz0Var = lz0Var.a;
        int i10 = rz0Var.a;
        int i11 = rz0Var.b;
        int i12 = iArr[i10] + lz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(lf.h hVar, boolean z10) {
        for (tz0 tz0Var : (tz0[]) ((Object[]) hVar.d)) {
            tz0Var.a = TLObject.FLAG_31;
        }
        oz0[] oz0VarArr = (oz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < oz0VarArr.length; i10++) {
            int d = oz0VarArr[i10].d(z10);
            tz0 tz0Var2 = (tz0) ((Object[]) hVar.d)[((int[]) hVar.b)[i10]];
            int i11 = tz0Var2.a;
            if (!z10) {
                d = -d;
            }
            tz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        xz0 xz0Var = this.x;
        int childCount = xz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qz0 d = xz0Var.d(i10);
            sz0 sz0Var = d.a;
            boolean z11 = this.a;
            rz0 rz0Var = (z11 ? sz0Var.b : sz0Var.a).b;
            int i11 = z10 ? rz0Var.a : rz0Var.b;
            iArr[i11] = Math.max(iArr[i11], xz0Var.f(d, z11, z10));
        }
    }

    public final lf.h c(boolean z10) {
        rz0 rz0Var;
        mz0 mz0Var = new mz0(rz0.class, tz0.class);
        uz0[] uz0VarArr = (uz0[]) ((Object[]) f().c);
        int length = uz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                rz0Var = uz0VarArr[i10].b;
            } else {
                rz0 rz0Var2 = uz0VarArr[i10].b;
                rz0Var = new rz0(rz0Var2.b, rz0Var2.a);
            }
            tz0 tz0Var = new tz0();
            tz0Var.a = TLObject.FLAG_31;
            mz0Var.add(Pair.create(rz0Var, tz0Var));
        }
        return mz0Var.i();
    }

    public final lz0[] d() {
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
            lf.h hVar = this.f;
            int i10 = 0;
            while (true) {
                rz0[] rz0VarArr = (rz0[]) ((Object[]) hVar.c);
                if (i10 >= rz0VarArr.length) {
                    break;
                }
                j(arrayList, rz0VarArr[i10], ((tz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            lf.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                rz0[] rz0VarArr2 = (rz0[]) ((Object[]) hVar2.c);
                if (i11 >= rz0VarArr2.length) {
                    break;
                }
                j(arrayList2, rz0VarArr2[i11], ((tz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new rz0(i12, i13), new tz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new rz0(0, e), this.v, false);
            j(arrayList2, new rz0(e, 0), this.w, false);
            lz0[] q6 = q(arrayList);
            lz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(lz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (lz0[]) objArr;
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

    public final lf.h f() {
        Object kz0Var;
        lf.h hVar = this.d;
        boolean z10 = this.a;
        xz0 xz0Var = this.x;
        if (hVar == null) {
            mz0 mz0Var = new mz0(uz0.class, oz0.class);
            int childCount = xz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                sz0 sz0Var = xz0Var.d(i10).a;
                uz0 uz0Var = z10 ? sz0Var.b : sz0Var.a;
                switch (uz0.a(uz0Var, z10).a) {
                    case 3:
                        kz0Var = new kz0();
                        break;
                    default:
                        kz0Var = new oz0();
                        break;
                }
                mz0Var.add(Pair.create(uz0Var, kz0Var));
            }
            this.d = mz0Var.i();
        }
        if (!this.e) {
            for (oz0 oz0Var : (oz0[]) ((Object[]) this.d.d)) {
                oz0Var.c();
            }
            int childCount2 = xz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                qz0 d = xz0Var.d(i11);
                sz0 sz0Var2 = d.a;
                uz0 uz0Var2 = z10 ? sz0Var2.b : sz0Var2.a;
                int e = xz0Var.e(d, z10, false) + xz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = uz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                lf.h hVar2 = this.d;
                oz0 oz0Var2 = (oz0) ((Object[]) hVar2.d)[((int[]) hVar2.b)[i11]];
                oz0Var2.c = ((uz0Var2.c == xz0.R && f7 == 0.0f) ? 0 : 2) & oz0Var2.c;
                int a2 = uz0.a(uz0Var2, z10).a(d, i12);
                oz0Var2.b(a2, i12 - a2);
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
            xz0 xz0Var = this.x;
            if (!z11) {
                int childCount = xz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    sz0 sz0Var = xz0Var.d(i10).a;
                    if ((z12 ? sz0Var.b : sz0Var.a).d != 0.0f) {
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
                    this.t = new int[xz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (xz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = xz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        sz0 sz0Var2 = xz0Var.d(i11).a;
                        f7 += (z12 ? sz0Var2.b : sz0Var2.a).d;
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
            xz0 xz0Var = this.x;
            int childCount = xz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                sz0 sz0Var = xz0Var.d(i13).a;
                rz0 rz0Var = (this.a ? sz0Var.b : sz0Var.a).b;
                int i14 = rz0Var.a;
                int i15 = rz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - rz0Var.a);
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
        tz0 tz0Var = this.w;
        tz0 tz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            tz0Var2.a = 0;
            tz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            tz0Var2.a = 0;
            tz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        tz0Var2.a = size;
        tz0Var.a = -size;
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
            throw new IllegalArgumentException(v7.j0.s((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        xz0 xz0Var = this.x;
        int childCount = xz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            sz0 sz0Var = xz0Var.d(i11).a;
            float f10 = (this.a ? sz0Var.b : sz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(lz0[] lz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < lz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (lz0 lz0Var : lz0VarArr) {
                    z11 |= m(iArr, lz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[lz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = lz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, lz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= lz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    lz0 lz0Var2 = lz0VarArr[i14];
                    rz0 rz0Var = lz0Var2.a;
                    if (rz0Var.a >= rz0Var.b) {
                        lz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final lz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (lz0[]) arrayList.toArray(new lz0[0]));
        int length = ((lz0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (lz0[]) i0Var.b;
    }
}
