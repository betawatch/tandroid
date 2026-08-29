package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sy0 {
    public final boolean a;
    public l3.g0 d;
    public l3.g0 f;
    public l3.g0 h;
    public int[] j;
    public int[] l;
    public qy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ cz0 x;
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
    public final yy0 v = new yy0(0);
    public final yy0 w = new yy0(-100000);

    public sy0(cz0 cz0Var, boolean z10) {
        this.x = cz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, wy0 wy0Var, yy0 yy0Var, boolean z10) {
        if (wy0Var.b - wy0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((qy0) obj).a.equals(wy0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new qy0(wy0Var, yy0Var));
    }

    public static boolean m(int[] iArr, qy0 qy0Var) {
        if (!qy0Var.c) {
            return false;
        }
        wy0 wy0Var = qy0Var.a;
        int i10 = wy0Var.a;
        int i11 = wy0Var.b;
        int i12 = iArr[i10] + qy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(l3.g0 g0Var, boolean z10) {
        for (yy0 yy0Var : (yy0[]) ((Object[]) g0Var.d)) {
            yy0Var.a = TLObject.FLAG_31;
        }
        ty0[] ty0VarArr = (ty0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ty0VarArr.length; i10++) {
            int d = ty0VarArr[i10].d(z10);
            yy0 yy0Var2 = (yy0) ((Object[]) g0Var.d)[((int[]) g0Var.b)[i10]];
            int i11 = yy0Var2.a;
            if (!z10) {
                d = -d;
            }
            yy0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        cz0 cz0Var = this.x;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            vy0 d = cz0Var.d(i10);
            xy0 xy0Var = d.a;
            boolean z11 = this.a;
            wy0 wy0Var = (z11 ? xy0Var.b : xy0Var.a).b;
            int i11 = z10 ? wy0Var.a : wy0Var.b;
            iArr[i11] = Math.max(iArr[i11], cz0Var.f(d, z11, z10));
        }
    }

    public final l3.g0 c(boolean z10) {
        wy0 wy0Var;
        ry0 ry0Var = new ry0(wy0.class, yy0.class);
        zy0[] zy0VarArr = (zy0[]) ((Object[]) f().c);
        int length = zy0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                wy0Var = zy0VarArr[i10].b;
            } else {
                wy0 wy0Var2 = zy0VarArr[i10].b;
                wy0Var = new wy0(wy0Var2.b, wy0Var2.a);
            }
            yy0 yy0Var = new yy0();
            yy0Var.a = TLObject.FLAG_31;
            ry0Var.add(Pair.create(wy0Var, yy0Var));
        }
        return ry0Var.i();
    }

    public final qy0[] d() {
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
            l3.g0 g0Var = this.f;
            int i10 = 0;
            while (true) {
                wy0[] wy0VarArr = (wy0[]) ((Object[]) g0Var.c);
                if (i10 >= wy0VarArr.length) {
                    break;
                }
                j(arrayList, wy0VarArr[i10], ((yy0[]) ((Object[]) g0Var.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            l3.g0 g0Var2 = this.h;
            int i11 = 0;
            while (true) {
                wy0[] wy0VarArr2 = (wy0[]) ((Object[]) g0Var2.c);
                if (i11 >= wy0VarArr2.length) {
                    break;
                }
                j(arrayList2, wy0VarArr2[i11], ((yy0[]) ((Object[]) g0Var2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new wy0(i12, i13), new yy0(0), true);
                    i12 = i13;
                }
            }
            int e10 = e();
            j(arrayList, new wy0(0, e10), this.v, false);
            j(arrayList2, new wy0(e10, 0), this.w, false);
            qy0[] q6 = q(arrayList);
            qy0[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(qy0[].class.getComponentType(), q6.length + q9.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q9, 0, objArr, q6.length, q9.length);
            this.n = (qy0[]) objArr;
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

    public final l3.g0 f() {
        Object py0Var;
        l3.g0 g0Var = this.d;
        boolean z10 = this.a;
        cz0 cz0Var = this.x;
        if (g0Var == null) {
            ry0 ry0Var = new ry0(zy0.class, ty0.class);
            int childCount = cz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                xy0 xy0Var = cz0Var.d(i10).a;
                zy0 zy0Var = z10 ? xy0Var.b : xy0Var.a;
                switch (zy0.a(zy0Var, z10).a) {
                    case 3:
                        py0Var = new py0();
                        break;
                    default:
                        py0Var = new ty0();
                        break;
                }
                ry0Var.add(Pair.create(zy0Var, py0Var));
            }
            this.d = ry0Var.i();
        }
        if (!this.e) {
            for (ty0 ty0Var : (ty0[]) ((Object[]) this.d.d)) {
                ty0Var.c();
            }
            int childCount2 = cz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                vy0 d = cz0Var.d(i11);
                xy0 xy0Var2 = d.a;
                zy0 zy0Var2 = z10 ? xy0Var2.b : xy0Var2.a;
                int e10 = cz0Var.e(d, z10, false) + cz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f9 = zy0Var2.d;
                int i12 = e10 + (f9 == 0.0f ? 0 : this.t[i11]);
                l3.g0 g0Var2 = this.d;
                ty0 ty0Var2 = (ty0) ((Object[]) g0Var2.d)[((int[]) g0Var2.b)[i11]];
                ty0Var2.c = ((zy0Var2.c == cz0.N && f9 == 0.0f) ? 0 : 2) & ty0Var2.c;
                int a2 = zy0.a(zy0Var2, z10).a(d, i12);
                ty0Var2.b(a2, i12 - a2);
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
            float f9 = 0.0f;
            boolean z12 = this.a;
            cz0 cz0Var = this.x;
            if (!z11) {
                int childCount = cz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    xy0 xy0Var = cz0Var.d(i10).a;
                    if ((z12 ? xy0Var.b : xy0Var.a).d != 0.0f) {
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
                    this.t = new int[cz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (cz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = cz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        xy0 xy0Var2 = cz0Var.d(i11).a;
                        f9 += (z12 ? xy0Var2.b : xy0Var2.a).d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f9, i14);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p10;
                    }
                    if (i12 > 0 && !z13) {
                        l();
                        o(f9, i12);
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
            cz0 cz0Var = this.x;
            int childCount = cz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                xy0 xy0Var = cz0Var.d(i13).a;
                wy0 wy0Var = (this.a ? xy0Var.b : xy0Var.a).b;
                int i14 = wy0Var.a;
                int i15 = wy0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - wy0Var.a);
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
        yy0 yy0Var = this.w;
        yy0 yy0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            yy0Var2.a = 0;
            yy0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            yy0Var2.a = 0;
            yy0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        yy0Var2.a = size;
        yy0Var.a = -size;
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
            throw new IllegalArgumentException(u3.c.k((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f9, int i10) {
        Arrays.fill(this.t, 0);
        cz0 cz0Var = this.x;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xy0 xy0Var = cz0Var.d(i11).a;
            float f10 = (this.a ? xy0Var.b : xy0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f9);
                this.t[i11] = round;
                i10 -= round;
                f9 -= f10;
            }
        }
    }

    public final boolean p(qy0[] qy0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i10 = 0; i10 < qy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e10; i11++) {
                boolean z11 = false;
                for (qy0 qy0Var : qy0VarArr) {
                    z11 |= m(iArr, qy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[qy0VarArr.length];
            for (int i12 = 0; i12 < e10; i12++) {
                int length = qy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, qy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= qy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    qy0 qy0Var2 = qy0VarArr[i14];
                    wy0 wy0Var = qy0Var2.a;
                    if (wy0Var.a >= wy0Var.b) {
                        qy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final qy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (qy0[]) arrayList.toArray(new qy0[0]));
        int length = ((qy0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (qy0[]) i0Var.b;
    }
}
