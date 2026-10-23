package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class yz0 {
    public final boolean a;
    public m.g3 d;
    public m.g3 f;
    public m.g3 h;
    public int[] j;
    public int[] l;
    public wz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ i01 x;
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
    public final e01 v = new e01(0);
    public final e01 w = new e01(-100000);

    public yz0(i01 i01Var, boolean z10) {
        this.x = i01Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, c01 c01Var, e01 e01Var, boolean z10) {
        if (c01Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((wz0) obj).a.equals(c01Var)) {
                    return;
                }
            }
        }
        arrayList.add(new wz0(c01Var, e01Var));
    }

    public static boolean m(int[] iArr, wz0 wz0Var) {
        if (!wz0Var.c) {
            return false;
        }
        c01 c01Var = wz0Var.a;
        int i10 = c01Var.a;
        int i11 = c01Var.b;
        int i12 = iArr[i10] + wz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(m.g3 g3Var, boolean z10) {
        for (e01 e01Var : (e01[]) ((Object[]) g3Var.d)) {
            e01Var.a = TLObject.FLAG_31;
        }
        zz0[] zz0VarArr = (zz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < zz0VarArr.length; i10++) {
            int d = zz0VarArr[i10].d(z10);
            e01 e01Var2 = (e01) ((Object[]) g3Var.d)[((int[]) g3Var.b)[i10]];
            int i11 = e01Var2.a;
            if (!z10) {
                d = -d;
            }
            e01Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        i01 i01Var = this.x;
        int childCount = i01Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            b01 d = i01Var.d(i10);
            d01 d01Var = d.a;
            boolean z11 = this.a;
            c01 c01Var = (z11 ? d01Var.b : d01Var.a).b;
            int i11 = z10 ? c01Var.a : c01Var.b;
            iArr[i11] = Math.max(iArr[i11], i01Var.f(d, z11, z10));
        }
    }

    public final m.g3 c(boolean z10) {
        c01 c01Var;
        xz0 xz0Var = new xz0(c01.class, e01.class);
        f01[] f01VarArr = (f01[]) ((Object[]) f().c);
        int length = f01VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                c01Var = f01VarArr[i10].b;
            } else {
                c01 c01Var2 = f01VarArr[i10].b;
                c01Var = new c01(c01Var2.b, c01Var2.a);
            }
            e01 e01Var = new e01();
            e01Var.a = TLObject.FLAG_31;
            xz0Var.add(Pair.create(c01Var, e01Var));
        }
        return xz0Var.h();
    }

    public final wz0[] d() {
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
                c01[] c01VarArr = (c01[]) ((Object[]) g3Var.c);
                if (i10 >= c01VarArr.length) {
                    break;
                }
                j(arrayList, c01VarArr[i10], ((e01[]) ((Object[]) g3Var.d))[i10], false);
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
                c01[] c01VarArr2 = (c01[]) ((Object[]) g3Var2.c);
                if (i11 >= c01VarArr2.length) {
                    break;
                }
                j(arrayList2, c01VarArr2[i11], ((e01[]) ((Object[]) g3Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new c01(i12, i13), new e01(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new c01(0, e), this.v, false);
            j(arrayList2, new c01(e, 0), this.w, false);
            wz0[] q6 = q(arrayList);
            wz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(wz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (wz0[]) objArr;
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
        i01.g("Table grid count out of bounds");
        throw null;
    }

    public final m.g3 f() {
        Object vz0Var;
        m.g3 g3Var = this.d;
        boolean z10 = this.a;
        i01 i01Var = this.x;
        if (g3Var == null) {
            xz0 xz0Var = new xz0(f01.class, zz0.class);
            int childCount = i01Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                d01 d01Var = i01Var.d(i10).a;
                f01 f01Var = z10 ? d01Var.b : d01Var.a;
                switch (f01.a(f01Var, z10).a) {
                    case 3:
                        vz0Var = new vz0();
                        break;
                    default:
                        vz0Var = new zz0();
                        break;
                }
                xz0Var.add(Pair.create(f01Var, vz0Var));
            }
            this.d = xz0Var.h();
        }
        if (!this.e) {
            for (zz0 zz0Var : (zz0[]) ((Object[]) this.d.d)) {
                zz0Var.c();
            }
            int childCount2 = i01Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                b01 d = i01Var.d(i11);
                d01 d01Var2 = d.a;
                f01 f01Var2 = z10 ? d01Var2.b : d01Var2.a;
                int e = i01Var.e(d, z10, false) + i01Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = f01Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                m.g3 g3Var2 = this.d;
                zz0 zz0Var2 = (zz0) ((Object[]) g3Var2.d)[((int[]) g3Var2.b)[i11]];
                zz0Var2.c = ((f01Var2.c == i01.R && f7 == 0.0f) ? 0 : 2) & zz0Var2.c;
                int a2 = f01.a(f01Var2, z10).a(d, i12);
                zz0Var2.b(a2, i12 - a2);
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
            i01 i01Var = this.x;
            if (!z11) {
                int childCount = i01Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    d01 d01Var = i01Var.d(i10).a;
                    if ((z12 ? d01Var.b : d01Var.a).d != 0.0f) {
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
                    this.t = new int[i01Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (i01Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = i01Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        d01 d01Var2 = i01Var.d(i11).a;
                        f7 += (z12 ? d01Var2.b : d01Var2.a).d;
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
            i01 i01Var = this.x;
            int childCount = i01Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                d01 d01Var = i01Var.d(i13).a;
                c01 c01Var = (this.a ? d01Var.b : d01Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, c01Var.a), c01Var.b), c01Var.a());
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
        e01 e01Var = this.w;
        e01 e01Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            e01Var2.a = 0;
            e01Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            e01Var2.a = 0;
            e01Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        e01Var2.a = size;
        e01Var.a = -size;
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
            i01.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        i01 i01Var = this.x;
        int childCount = i01Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            d01 d01Var = i01Var.d(i11).a;
            float f10 = (this.a ? d01Var.b : d01Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(wz0[] wz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < wz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (wz0 wz0Var : wz0VarArr) {
                    z11 |= m(iArr, wz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[wz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = wz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, wz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= wz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    wz0 wz0Var2 = wz0VarArr[i14];
                    c01 c01Var = wz0Var2.a;
                    if (c01Var.a >= c01Var.b) {
                        wz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final wz0[] q(ArrayList arrayList) {
        e0.f0 f0Var = new e0.f0(this, (wz0[]) arrayList.toArray(new wz0[0]));
        int length = ((wz0[][]) f0Var.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            f0Var.f(i10);
        }
        return (wz0[]) f0Var.c;
    }
}
