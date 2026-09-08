package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zy0 {
    public final boolean a;
    public m2.t d;
    public m2.t f;
    public m2.t h;
    public int[] j;
    public int[] l;
    public xy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ jz0 x;
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
    public final fz0 v = new fz0(0);
    public final fz0 w = new fz0(-100000);

    public zy0(jz0 jz0Var, boolean z10) {
        this.x = jz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, dz0 dz0Var, fz0 fz0Var, boolean z10) {
        if (dz0Var.b - dz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((xy0) obj).a.equals(dz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new xy0(dz0Var, fz0Var));
    }

    public static boolean m(int[] iArr, xy0 xy0Var) {
        if (!xy0Var.c) {
            return false;
        }
        dz0 dz0Var = xy0Var.a;
        int i10 = dz0Var.a;
        int i11 = dz0Var.b;
        int i12 = iArr[i10] + xy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(m2.t tVar, boolean z10) {
        for (fz0 fz0Var : (fz0[]) ((Object[]) tVar.d)) {
            fz0Var.a = TLObject.FLAG_31;
        }
        az0[] az0VarArr = (az0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < az0VarArr.length; i10++) {
            int d = az0VarArr[i10].d(z10);
            fz0 fz0Var2 = (fz0) ((Object[]) tVar.d)[((int[]) tVar.b)[i10]];
            int i11 = fz0Var2.a;
            if (!z10) {
                d = -d;
            }
            fz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        jz0 jz0Var = this.x;
        int childCount = jz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            cz0 d = jz0Var.d(i10);
            ez0 ez0Var = d.a;
            boolean z11 = this.a;
            dz0 dz0Var = (z11 ? ez0Var.b : ez0Var.a).b;
            int i11 = z10 ? dz0Var.a : dz0Var.b;
            iArr[i11] = Math.max(iArr[i11], jz0Var.f(d, z11, z10));
        }
    }

    public final m2.t c(boolean z10) {
        dz0 dz0Var;
        yy0 yy0Var = new yy0(dz0.class, fz0.class);
        gz0[] gz0VarArr = (gz0[]) ((Object[]) f().c);
        int length = gz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                dz0Var = gz0VarArr[i10].b;
            } else {
                dz0 dz0Var2 = gz0VarArr[i10].b;
                dz0Var = new dz0(dz0Var2.b, dz0Var2.a);
            }
            fz0 fz0Var = new fz0();
            fz0Var.a = TLObject.FLAG_31;
            yy0Var.add(Pair.create(dz0Var, fz0Var));
        }
        return yy0Var.i();
    }

    public final xy0[] d() {
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
            m2.t tVar = this.f;
            int i10 = 0;
            while (true) {
                dz0[] dz0VarArr = (dz0[]) ((Object[]) tVar.c);
                if (i10 >= dz0VarArr.length) {
                    break;
                }
                j(arrayList, dz0VarArr[i10], ((fz0[]) ((Object[]) tVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            m2.t tVar2 = this.h;
            int i11 = 0;
            while (true) {
                dz0[] dz0VarArr2 = (dz0[]) ((Object[]) tVar2.c);
                if (i11 >= dz0VarArr2.length) {
                    break;
                }
                j(arrayList2, dz0VarArr2[i11], ((fz0[]) ((Object[]) tVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new dz0(i12, i13), new fz0(0), true);
                    i12 = i13;
                }
            }
            int e7 = e();
            j(arrayList, new dz0(0, e7), this.v, false);
            j(arrayList2, new dz0(e7, 0), this.w, false);
            xy0[] q6 = q(arrayList);
            xy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(xy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (xy0[]) objArr;
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

    public final m2.t f() {
        Object wy0Var;
        m2.t tVar = this.d;
        boolean z10 = this.a;
        jz0 jz0Var = this.x;
        if (tVar == null) {
            yy0 yy0Var = new yy0(gz0.class, az0.class);
            int childCount = jz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ez0 ez0Var = jz0Var.d(i10).a;
                gz0 gz0Var = z10 ? ez0Var.b : ez0Var.a;
                switch (gz0.a(gz0Var, z10).a) {
                    case 3:
                        wy0Var = new wy0();
                        break;
                    default:
                        wy0Var = new az0();
                        break;
                }
                yy0Var.add(Pair.create(gz0Var, wy0Var));
            }
            this.d = yy0Var.i();
        }
        if (!this.e) {
            for (az0 az0Var : (az0[]) ((Object[]) this.d.d)) {
                az0Var.c();
            }
            int childCount2 = jz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                cz0 d = jz0Var.d(i11);
                ez0 ez0Var2 = d.a;
                gz0 gz0Var2 = z10 ? ez0Var2.b : ez0Var2.a;
                int e7 = jz0Var.e(d, z10, false) + jz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = gz0Var2.d;
                int i12 = e7 + (f7 == 0.0f ? 0 : this.t[i11]);
                m2.t tVar2 = this.d;
                az0 az0Var2 = (az0) ((Object[]) tVar2.d)[((int[]) tVar2.b)[i11]];
                az0Var2.c = ((gz0Var2.c == jz0.R && f7 == 0.0f) ? 0 : 2) & az0Var2.c;
                int a2 = gz0.a(gz0Var2, z10).a(d, i12);
                az0Var2.b(a2, i12 - a2);
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
            jz0 jz0Var = this.x;
            if (!z11) {
                int childCount = jz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    ez0 ez0Var = jz0Var.d(i10).a;
                    if ((z12 ? ez0Var.b : ez0Var.a).d != 0.0f) {
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
                    this.t = new int[jz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (jz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = jz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ez0 ez0Var2 = jz0Var.d(i11).a;
                        f7 += (z12 ? ez0Var2.b : ez0Var2.a).d;
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
            jz0 jz0Var = this.x;
            int childCount = jz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                ez0 ez0Var = jz0Var.d(i13).a;
                dz0 dz0Var = (this.a ? ez0Var.b : ez0Var.a).b;
                int i14 = dz0Var.a;
                int i15 = dz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - dz0Var.a);
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
        fz0 fz0Var = this.w;
        fz0 fz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            fz0Var2.a = 0;
            fz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            fz0Var2.a = 0;
            fz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        fz0Var2.a = size;
        fz0Var.a = -size;
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
            throw new IllegalArgumentException(org.telegram.ui.Cells.p6.t((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        jz0 jz0Var = this.x;
        int childCount = jz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ez0 ez0Var = jz0Var.d(i11).a;
            float f10 = (this.a ? ez0Var.b : ez0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(xy0[] xy0VarArr, int[] iArr, boolean z10) {
        int e7 = e() + 1;
        loop0: for (int i10 = 0; i10 < xy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e7; i11++) {
                boolean z11 = false;
                for (xy0 xy0Var : xy0VarArr) {
                    z11 |= m(iArr, xy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[xy0VarArr.length];
            for (int i12 = 0; i12 < e7; i12++) {
                int length = xy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, xy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= xy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    xy0 xy0Var2 = xy0VarArr[i14];
                    dz0 dz0Var = xy0Var2.a;
                    if (dz0Var.a >= dz0Var.b) {
                        xy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final xy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (xy0[]) arrayList.toArray(new xy0[0]));
        int length = ((xy0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (xy0[]) i0Var.b;
    }
}
