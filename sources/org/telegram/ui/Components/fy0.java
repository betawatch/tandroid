package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fy0 {
    public final boolean a;
    public li.k d;
    public li.k f;
    public li.k h;
    public int[] j;
    public int[] l;
    public dy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ py0 x;
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
    public final ly0 v = new ly0(0);
    public final ly0 w = new ly0(-100000);

    public fy0(py0 py0Var, boolean z10) {
        this.x = py0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, jy0 jy0Var, ly0 ly0Var, boolean z10) {
        if (jy0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((dy0) obj).a.equals(jy0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new dy0(jy0Var, ly0Var));
    }

    public static boolean m(int[] iArr, dy0 dy0Var) {
        if (!dy0Var.c) {
            return false;
        }
        jy0 jy0Var = dy0Var.a;
        int i10 = jy0Var.a;
        int i11 = jy0Var.b;
        int i12 = iArr[i10] + dy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(li.k kVar, boolean z10) {
        for (ly0 ly0Var : (ly0[]) ((Object[]) kVar.d)) {
            ly0Var.a = TLObject.FLAG_31;
        }
        gy0[] gy0VarArr = (gy0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < gy0VarArr.length; i10++) {
            int d = gy0VarArr[i10].d(z10);
            ly0 ly0Var2 = (ly0) ((Object[]) kVar.d)[((int[]) kVar.b)[i10]];
            int i11 = ly0Var2.a;
            if (!z10) {
                d = -d;
            }
            ly0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        py0 py0Var = this.x;
        int childCount = py0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            iy0 d = py0Var.d(i10);
            ky0 ky0Var = d.a;
            boolean z11 = this.a;
            jy0 jy0Var = (z11 ? ky0Var.b : ky0Var.a).b;
            int i11 = z10 ? jy0Var.a : jy0Var.b;
            iArr[i11] = Math.max(iArr[i11], py0Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        jy0 jy0Var;
        ey0 ey0Var = new ey0(jy0.class, ly0.class);
        my0[] my0VarArr = (my0[]) ((Object[]) f().c);
        int length = my0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                jy0Var = my0VarArr[i10].b;
            } else {
                jy0 jy0Var2 = my0VarArr[i10].b;
                jy0Var = new jy0(jy0Var2.b, jy0Var2.a);
            }
            ly0 ly0Var = new ly0();
            ly0Var.a = TLObject.FLAG_31;
            ey0Var.add(Pair.create(jy0Var, ly0Var));
        }
        return ey0Var.l();
    }

    public final dy0[] d() {
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
                jy0[] jy0VarArr = (jy0[]) ((Object[]) kVar.c);
                if (i10 >= jy0VarArr.length) {
                    break;
                }
                j(arrayList, jy0VarArr[i10], ((ly0[]) ((Object[]) kVar.d))[i10], false);
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
                jy0[] jy0VarArr2 = (jy0[]) ((Object[]) kVar2.c);
                if (i11 >= jy0VarArr2.length) {
                    break;
                }
                j(arrayList2, jy0VarArr2[i11], ((ly0[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new jy0(i12, i13), new ly0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new jy0(0, e), this.v, false);
            j(arrayList2, new jy0(e, 0), this.w, false);
            dy0[] q6 = q(arrayList);
            dy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(dy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (dy0[]) objArr;
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
        py0.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        Object cy0Var;
        li.k kVar = this.d;
        boolean z10 = this.a;
        py0 py0Var = this.x;
        if (kVar == null) {
            ey0 ey0Var = new ey0(my0.class, gy0.class);
            int childCount = py0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ky0 ky0Var = py0Var.d(i10).a;
                my0 my0Var = z10 ? ky0Var.b : ky0Var.a;
                switch (my0.a(my0Var, z10).a) {
                    case 3:
                        cy0Var = new cy0();
                        break;
                    default:
                        cy0Var = new gy0();
                        break;
                }
                ey0Var.add(Pair.create(my0Var, cy0Var));
            }
            this.d = ey0Var.l();
        }
        if (!this.e) {
            for (gy0 gy0Var : (gy0[]) ((Object[]) this.d.d)) {
                gy0Var.c();
            }
            int childCount2 = py0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                iy0 d = py0Var.d(i11);
                ky0 ky0Var2 = d.a;
                my0 my0Var2 = z10 ? ky0Var2.b : ky0Var2.a;
                int e = py0Var.e(d, z10, false) + py0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = my0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                li.k kVar2 = this.d;
                gy0 gy0Var2 = (gy0) ((Object[]) kVar2.d)[((int[]) kVar2.b)[i11]];
                gy0Var2.c = ((my0Var2.c == py0.R && f7 == 0.0f) ? 0 : 2) & gy0Var2.c;
                int a2 = my0.a(my0Var2, z10).a(d, i12);
                gy0Var2.b(a2, i12 - a2);
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
            py0 py0Var = this.x;
            if (!z11) {
                int childCount = py0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    ky0 ky0Var = py0Var.d(i10).a;
                    if ((z12 ? ky0Var.b : ky0Var.a).d != 0.0f) {
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
                    this.t = new int[py0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (py0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = py0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ky0 ky0Var2 = py0Var.d(i11).a;
                        f7 += (z12 ? ky0Var2.b : ky0Var2.a).d;
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
            py0 py0Var = this.x;
            int childCount = py0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                ky0 ky0Var = py0Var.d(i13).a;
                jy0 jy0Var = (this.a ? ky0Var.b : ky0Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, jy0Var.a), jy0Var.b), jy0Var.a());
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
        ly0 ly0Var = this.w;
        ly0 ly0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            ly0Var2.a = 0;
            ly0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            ly0Var2.a = 0;
            ly0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        ly0Var2.a = size;
        ly0Var.a = -size;
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
            py0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        py0 py0Var = this.x;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ky0 ky0Var = py0Var.d(i11).a;
            float f10 = (this.a ? ky0Var.b : ky0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(dy0[] dy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < dy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (dy0 dy0Var : dy0VarArr) {
                    z11 |= m(iArr, dy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[dy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = dy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, dy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= dy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    dy0 dy0Var2 = dy0VarArr[i14];
                    jy0 jy0Var = dy0Var2.a;
                    if (jy0Var.a >= jy0Var.b) {
                        dy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final dy0[] q(ArrayList arrayList) {
        cc.f fVar = new cc.f(this, (dy0[]) arrayList.toArray(new dy0[0]));
        int length = ((dy0[][]) fVar.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            fVar.g(i10);
        }
        return (dy0[]) fVar.c;
    }
}
