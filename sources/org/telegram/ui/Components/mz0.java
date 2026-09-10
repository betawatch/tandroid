package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mz0 {
    public final boolean a;
    public m.e3 d;
    public m.e3 f;
    public m.e3 h;
    public int[] j;
    public int[] l;
    public kz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ wz0 x;
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
    public final sz0 v = new sz0(0);
    public final sz0 w = new sz0(-100000);

    public mz0(wz0 wz0Var, boolean z10) {
        this.x = wz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, qz0 qz0Var, sz0 sz0Var, boolean z10) {
        if (qz0Var.b - qz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((kz0) obj).a.equals(qz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new kz0(qz0Var, sz0Var));
    }

    public static boolean m(int[] iArr, kz0 kz0Var) {
        if (!kz0Var.c) {
            return false;
        }
        qz0 qz0Var = kz0Var.a;
        int i10 = qz0Var.a;
        int i11 = qz0Var.b;
        int i12 = iArr[i10] + kz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(m.e3 e3Var, boolean z10) {
        for (sz0 sz0Var : (sz0[]) ((Object[]) e3Var.d)) {
            sz0Var.a = TLObject.FLAG_31;
        }
        nz0[] nz0VarArr = (nz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < nz0VarArr.length; i10++) {
            int d = nz0VarArr[i10].d(z10);
            sz0 sz0Var2 = (sz0) ((Object[]) e3Var.d)[((int[]) e3Var.b)[i10]];
            int i11 = sz0Var2.a;
            if (!z10) {
                d = -d;
            }
            sz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        wz0 wz0Var = this.x;
        int childCount = wz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            pz0 d = wz0Var.d(i10);
            rz0 rz0Var = d.a;
            boolean z11 = this.a;
            qz0 qz0Var = (z11 ? rz0Var.b : rz0Var.a).b;
            int i11 = z10 ? qz0Var.a : qz0Var.b;
            iArr[i11] = Math.max(iArr[i11], wz0Var.f(d, z11, z10));
        }
    }

    public final m.e3 c(boolean z10) {
        qz0 qz0Var;
        lz0 lz0Var = new lz0(qz0.class, sz0.class);
        tz0[] tz0VarArr = (tz0[]) ((Object[]) f().c);
        int length = tz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                qz0Var = tz0VarArr[i10].b;
            } else {
                qz0 qz0Var2 = tz0VarArr[i10].b;
                qz0Var = new qz0(qz0Var2.b, qz0Var2.a);
            }
            sz0 sz0Var = new sz0();
            sz0Var.a = TLObject.FLAG_31;
            lz0Var.add(Pair.create(qz0Var, sz0Var));
        }
        return lz0Var.i();
    }

    public final kz0[] d() {
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
            m.e3 e3Var = this.f;
            int i10 = 0;
            while (true) {
                qz0[] qz0VarArr = (qz0[]) ((Object[]) e3Var.c);
                if (i10 >= qz0VarArr.length) {
                    break;
                }
                j(arrayList, qz0VarArr[i10], ((sz0[]) ((Object[]) e3Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            m.e3 e3Var2 = this.h;
            int i11 = 0;
            while (true) {
                qz0[] qz0VarArr2 = (qz0[]) ((Object[]) e3Var2.c);
                if (i11 >= qz0VarArr2.length) {
                    break;
                }
                j(arrayList2, qz0VarArr2[i11], ((sz0[]) ((Object[]) e3Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new qz0(i12, i13), new sz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new qz0(0, e), this.v, false);
            j(arrayList2, new qz0(e, 0), this.w, false);
            kz0[] q6 = q(arrayList);
            kz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(kz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (kz0[]) objArr;
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

    public final m.e3 f() {
        Object jz0Var;
        m.e3 e3Var = this.d;
        boolean z10 = this.a;
        wz0 wz0Var = this.x;
        if (e3Var == null) {
            lz0 lz0Var = new lz0(tz0.class, nz0.class);
            int childCount = wz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                rz0 rz0Var = wz0Var.d(i10).a;
                tz0 tz0Var = z10 ? rz0Var.b : rz0Var.a;
                switch (tz0.a(tz0Var, z10).a) {
                    case 3:
                        jz0Var = new jz0();
                        break;
                    default:
                        jz0Var = new nz0();
                        break;
                }
                lz0Var.add(Pair.create(tz0Var, jz0Var));
            }
            this.d = lz0Var.i();
        }
        if (!this.e) {
            for (nz0 nz0Var : (nz0[]) ((Object[]) this.d.d)) {
                nz0Var.c();
            }
            int childCount2 = wz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                pz0 d = wz0Var.d(i11);
                rz0 rz0Var2 = d.a;
                tz0 tz0Var2 = z10 ? rz0Var2.b : rz0Var2.a;
                int e = wz0Var.e(d, z10, false) + wz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = tz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                m.e3 e3Var2 = this.d;
                nz0 nz0Var2 = (nz0) ((Object[]) e3Var2.d)[((int[]) e3Var2.b)[i11]];
                nz0Var2.c = ((tz0Var2.c == wz0.R && f7 == 0.0f) ? 0 : 2) & nz0Var2.c;
                int a2 = tz0.a(tz0Var2, z10).a(d, i12);
                nz0Var2.b(a2, i12 - a2);
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
            wz0 wz0Var = this.x;
            if (!z11) {
                int childCount = wz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    rz0 rz0Var = wz0Var.d(i10).a;
                    if ((z12 ? rz0Var.b : rz0Var.a).d != 0.0f) {
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
                    this.t = new int[wz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (wz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = wz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        rz0 rz0Var2 = wz0Var.d(i11).a;
                        f7 += (z12 ? rz0Var2.b : rz0Var2.a).d;
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
            wz0 wz0Var = this.x;
            int childCount = wz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                rz0 rz0Var = wz0Var.d(i13).a;
                qz0 qz0Var = (this.a ? rz0Var.b : rz0Var.a).b;
                int i14 = qz0Var.a;
                int i15 = qz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - qz0Var.a);
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
        sz0 sz0Var = this.w;
        sz0 sz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            sz0Var2.a = 0;
            sz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            sz0Var2.a = 0;
            sz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        sz0Var2.a = size;
        sz0Var.a = -size;
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
            throw new IllegalArgumentException(org.telegram.ui.Cells.r6.t((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        wz0 wz0Var = this.x;
        int childCount = wz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            rz0 rz0Var = wz0Var.d(i11).a;
            float f10 = (this.a ? rz0Var.b : rz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(kz0[] kz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < kz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (kz0 kz0Var : kz0VarArr) {
                    z11 |= m(iArr, kz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[kz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = kz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, kz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= kz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    kz0 kz0Var2 = kz0VarArr[i14];
                    qz0 qz0Var = kz0Var2.a;
                    if (qz0Var.a >= qz0Var.b) {
                        kz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final kz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (kz0[]) arrayList.toArray(new kz0[0]));
        int length = ((kz0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (kz0[]) i0Var.b;
    }
}
