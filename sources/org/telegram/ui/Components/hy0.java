package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hy0 {
    public final boolean a;
    public j4.c d;
    public j4.c f;
    public j4.c h;
    public int[] j;
    public int[] l;
    public fy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ ry0 x;
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
    public final ny0 v = new ny0(0);
    public final ny0 w = new ny0(-100000);

    public hy0(ry0 ry0Var, boolean z10) {
        this.x = ry0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, ly0 ly0Var, ny0 ny0Var, boolean z10) {
        if (ly0Var.b - ly0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                if (((fy0) obj).a.equals(ly0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new fy0(ly0Var, ny0Var));
    }

    public static boolean m(int[] iArr, fy0 fy0Var) {
        if (!fy0Var.c) {
            return false;
        }
        ly0 ly0Var = fy0Var.a;
        int i9 = ly0Var.a;
        int i10 = ly0Var.b;
        int i11 = iArr[i9] + fy0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(j4.c cVar, boolean z10) {
        for (ny0 ny0Var : (ny0[]) ((Object[]) cVar.d)) {
            ny0Var.a = TLObject.FLAG_31;
        }
        iy0[] iy0VarArr = (iy0[]) ((Object[]) f().d);
        for (int i9 = 0; i9 < iy0VarArr.length; i9++) {
            int d = iy0VarArr[i9].d(z10);
            ny0 ny0Var2 = (ny0) ((Object[]) cVar.d)[((int[]) cVar.b)[i9]];
            int i10 = ny0Var2.a;
            if (!z10) {
                d = -d;
            }
            ny0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        ry0 ry0Var = this.x;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ky0 d = ry0Var.d(i9);
            my0 my0Var = d.a;
            boolean z11 = this.a;
            ly0 ly0Var = (z11 ? my0Var.b : my0Var.a).b;
            int i10 = z10 ? ly0Var.a : ly0Var.b;
            iArr[i10] = Math.max(iArr[i10], ry0Var.f(d, z11, z10));
        }
    }

    public final j4.c c(boolean z10) {
        ly0 ly0Var;
        gy0 gy0Var = new gy0(ly0.class, ny0.class);
        oy0[] oy0VarArr = (oy0[]) ((Object[]) f().c);
        int length = oy0VarArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (z10) {
                ly0Var = oy0VarArr[i9].b;
            } else {
                ly0 ly0Var2 = oy0VarArr[i9].b;
                ly0Var = new ly0(ly0Var2.b, ly0Var2.a);
            }
            ny0 ny0Var = new ny0();
            ny0Var.a = TLObject.FLAG_31;
            gy0Var.add(Pair.create(ly0Var, ny0Var));
        }
        return gy0Var.i();
    }

    public final fy0[] d() {
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
            j4.c cVar = this.f;
            int i9 = 0;
            while (true) {
                ly0[] ly0VarArr = (ly0[]) ((Object[]) cVar.c);
                if (i9 >= ly0VarArr.length) {
                    break;
                }
                j(arrayList, ly0VarArr[i9], ((ny0[]) ((Object[]) cVar.d))[i9], false);
                i9++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            j4.c cVar2 = this.h;
            int i10 = 0;
            while (true) {
                ly0[] ly0VarArr2 = (ly0[]) ((Object[]) cVar2.c);
                if (i10 >= ly0VarArr2.length) {
                    break;
                }
                j(arrayList2, ly0VarArr2[i10], ((ny0[]) ((Object[]) cVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new ly0(i11, i12), new ny0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new ly0(0, e10), this.v, false);
            j(arrayList2, new ly0(e10, 0), this.w, false);
            fy0[] q10 = q(arrayList);
            fy0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(fy0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (fy0[]) objArr;
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

    public final j4.c f() {
        Object ey0Var;
        j4.c cVar = this.d;
        boolean z10 = this.a;
        ry0 ry0Var = this.x;
        if (cVar == null) {
            gy0 gy0Var = new gy0(oy0.class, iy0.class);
            int childCount = ry0Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                my0 my0Var = ry0Var.d(i9).a;
                oy0 oy0Var = z10 ? my0Var.b : my0Var.a;
                switch (oy0.a(oy0Var, z10).a) {
                    case 3:
                        ey0Var = new ey0();
                        break;
                    default:
                        ey0Var = new iy0();
                        break;
                }
                gy0Var.add(Pair.create(oy0Var, ey0Var));
            }
            this.d = gy0Var.i();
        }
        if (!this.e) {
            for (iy0 iy0Var : (iy0[]) ((Object[]) this.d.d)) {
                iy0Var.c();
            }
            int childCount2 = ry0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                ky0 d = ry0Var.d(i10);
                my0 my0Var2 = d.a;
                oy0 oy0Var2 = z10 ? my0Var2.b : my0Var2.a;
                int e10 = ry0Var.e(d, z10, false) + ry0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = oy0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                j4.c cVar2 = this.d;
                iy0 iy0Var2 = (iy0) ((Object[]) cVar2.d)[((int[]) cVar2.b)[i10]];
                iy0Var2.c = ((oy0Var2.c == ry0.N && f10 == 0.0f) ? 0 : 2) & iy0Var2.c;
                int a2 = oy0.a(oy0Var2, z10).a(d, i11);
                iy0Var2.b(a2, i11 - a2);
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
            float f10 = 0.0f;
            boolean z12 = this.a;
            ry0 ry0Var = this.x;
            if (!z11) {
                int childCount = ry0Var.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        z10 = false;
                        break;
                    }
                    my0 my0Var = ry0Var.d(i9).a;
                    if ((z12 ? my0Var.b : my0Var.a).d != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i9++;
                }
                this.r = z10;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[ry0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (ry0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = ry0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        my0 my0Var2 = ry0Var.d(i10).a;
                        f10 += (z12 ? my0Var2.b : my0Var2.a).d;
                    }
                    int i11 = -1;
                    int i12 = 0;
                    boolean z13 = true;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p6 = p(d(), iArr, false);
                        if (p6) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z13 = p6;
                    }
                    if (i11 > 0 && !z13) {
                        l();
                        o(f10, i11);
                        p(d(), iArr, true);
                    }
                }
            } else {
                p(d(), iArr, true);
            }
            if (!this.u) {
                int i14 = iArr[0];
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    iArr[i15] = iArr[i15] - i14;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int h() {
        int i9 = this.c;
        int i10 = TLObject.FLAG_31;
        if (i9 == Integer.MIN_VALUE) {
            ry0 ry0Var = this.x;
            int childCount = ry0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                my0 my0Var = ry0Var.d(i12).a;
                ly0 ly0Var = (this.a ? my0Var.b : my0Var.a).b;
                int i13 = ly0Var.a;
                int i14 = ly0Var.b;
                i11 = Math.max(Math.max(Math.max(i11, i13), i14), i14 - ly0Var.a);
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.c = Math.max(0, i10);
        }
        return this.c;
    }

    public final int i(int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        ny0 ny0Var = this.w;
        ny0 ny0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            ny0Var2.a = 0;
            ny0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            ny0Var2.a = 0;
            ny0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        ny0Var2.a = size;
        ny0Var.a = -size;
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

    public final void n(int i9) {
        if (i9 != Integer.MIN_VALUE && i9 < h()) {
            throw new IllegalArgumentException(ta.b.j((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i9;
    }

    public final void o(float f10, int i9) {
        Arrays.fill(this.t, 0);
        ry0 ry0Var = this.x;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 my0Var = ry0Var.d(i10).a;
            float f11 = (this.a ? my0Var.b : my0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i9 * f11) / f10);
                this.t[i10] = round;
                i9 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(fy0[] fy0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i9 = 0; i9 < fy0VarArr.length; i9++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (fy0 fy0Var : fy0VarArr) {
                    z11 |= m(iArr, fy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[fy0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = fy0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, fy0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= fy0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    fy0 fy0Var2 = fy0VarArr[i13];
                    ly0 ly0Var = fy0Var2.a;
                    if (ly0Var.a >= ly0Var.b) {
                        fy0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final fy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (fy0[]) arrayList.toArray(new fy0[0]));
        int length = ((fy0[][]) i0Var.c).length;
        for (int i9 = 0; i9 < length; i9++) {
            i0Var.d(i9);
        }
        return (fy0[]) i0Var.b;
    }
}
