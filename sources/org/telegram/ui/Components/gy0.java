package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gy0 {
    public final boolean a;
    public li.k d;
    public li.k f;
    public li.k h;
    public int[] j;
    public int[] l;
    public ey0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ qy0 x;
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
    public final my0 v = new my0(0);
    public final my0 w = new my0(-100000);

    public gy0(qy0 qy0Var, boolean z10) {
        this.x = qy0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, ky0 ky0Var, my0 my0Var, boolean z10) {
        if (ky0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((ey0) obj).a.equals(ky0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new ey0(ky0Var, my0Var));
    }

    public static boolean m(int[] iArr, ey0 ey0Var) {
        if (!ey0Var.c) {
            return false;
        }
        ky0 ky0Var = ey0Var.a;
        int i10 = ky0Var.a;
        int i11 = ky0Var.b;
        int i12 = iArr[i10] + ey0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(li.k kVar, boolean z10) {
        for (my0 my0Var : (my0[]) ((Object[]) kVar.d)) {
            my0Var.a = TLObject.FLAG_31;
        }
        hy0[] hy0VarArr = (hy0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < hy0VarArr.length; i10++) {
            int d = hy0VarArr[i10].d(z10);
            my0 my0Var2 = (my0) ((Object[]) kVar.d)[((int[]) kVar.b)[i10]];
            int i11 = my0Var2.a;
            if (!z10) {
                d = -d;
            }
            my0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        qy0 qy0Var = this.x;
        int childCount = qy0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jy0 d = qy0Var.d(i10);
            ly0 ly0Var = d.a;
            boolean z11 = this.a;
            ky0 ky0Var = (z11 ? ly0Var.b : ly0Var.a).b;
            int i11 = z10 ? ky0Var.a : ky0Var.b;
            iArr[i11] = Math.max(iArr[i11], qy0Var.f(d, z11, z10));
        }
    }

    public final li.k c(boolean z10) {
        ky0 ky0Var;
        fy0 fy0Var = new fy0(ky0.class, my0.class);
        ny0[] ny0VarArr = (ny0[]) ((Object[]) f().c);
        int length = ny0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ky0Var = ny0VarArr[i10].b;
            } else {
                ky0 ky0Var2 = ny0VarArr[i10].b;
                ky0Var = new ky0(ky0Var2.b, ky0Var2.a);
            }
            my0 my0Var = new my0();
            my0Var.a = TLObject.FLAG_31;
            fy0Var.add(Pair.create(ky0Var, my0Var));
        }
        return fy0Var.l();
    }

    public final ey0[] d() {
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
                ky0[] ky0VarArr = (ky0[]) ((Object[]) kVar.c);
                if (i10 >= ky0VarArr.length) {
                    break;
                }
                j(arrayList, ky0VarArr[i10], ((my0[]) ((Object[]) kVar.d))[i10], false);
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
                ky0[] ky0VarArr2 = (ky0[]) ((Object[]) kVar2.c);
                if (i11 >= ky0VarArr2.length) {
                    break;
                }
                j(arrayList2, ky0VarArr2[i11], ((my0[]) ((Object[]) kVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ky0(i12, i13), new my0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new ky0(0, e), this.v, false);
            j(arrayList2, new ky0(e, 0), this.w, false);
            ey0[] q6 = q(arrayList);
            ey0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(ey0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (ey0[]) objArr;
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
        qy0.g("Table grid count out of bounds");
        throw null;
    }

    public final li.k f() {
        Object dy0Var;
        li.k kVar = this.d;
        boolean z10 = this.a;
        qy0 qy0Var = this.x;
        if (kVar == null) {
            fy0 fy0Var = new fy0(ny0.class, hy0.class);
            int childCount = qy0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ly0 ly0Var = qy0Var.d(i10).a;
                ny0 ny0Var = z10 ? ly0Var.b : ly0Var.a;
                switch (ny0.a(ny0Var, z10).a) {
                    case 3:
                        dy0Var = new dy0();
                        break;
                    default:
                        dy0Var = new hy0();
                        break;
                }
                fy0Var.add(Pair.create(ny0Var, dy0Var));
            }
            this.d = fy0Var.l();
        }
        if (!this.e) {
            for (hy0 hy0Var : (hy0[]) ((Object[]) this.d.d)) {
                hy0Var.c();
            }
            int childCount2 = qy0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                jy0 d = qy0Var.d(i11);
                ly0 ly0Var2 = d.a;
                ny0 ny0Var2 = z10 ? ly0Var2.b : ly0Var2.a;
                int e = qy0Var.e(d, z10, false) + qy0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = ny0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                li.k kVar2 = this.d;
                hy0 hy0Var2 = (hy0) ((Object[]) kVar2.d)[((int[]) kVar2.b)[i11]];
                hy0Var2.c = ((ny0Var2.c == qy0.R && f7 == 0.0f) ? 0 : 2) & hy0Var2.c;
                int a2 = ny0.a(ny0Var2, z10).a(d, i12);
                hy0Var2.b(a2, i12 - a2);
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
            qy0 qy0Var = this.x;
            if (!z11) {
                int childCount = qy0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    ly0 ly0Var = qy0Var.d(i10).a;
                    if ((z12 ? ly0Var.b : ly0Var.a).d != 0.0f) {
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
                    this.t = new int[qy0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (qy0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = qy0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        ly0 ly0Var2 = qy0Var.d(i11).a;
                        f7 += (z12 ? ly0Var2.b : ly0Var2.a).d;
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
            qy0 qy0Var = this.x;
            int childCount = qy0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                ly0 ly0Var = qy0Var.d(i13).a;
                ky0 ky0Var = (this.a ? ly0Var.b : ly0Var.a).b;
                i12 = Math.max(Math.max(Math.max(i12, ky0Var.a), ky0Var.b), ky0Var.a());
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
        my0 my0Var = this.w;
        my0 my0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            my0Var2.a = 0;
            my0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            my0Var2.a = 0;
            my0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        my0Var2.a = size;
        my0Var.a = -size;
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
            qy0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        qy0 qy0Var = this.x;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ly0 ly0Var = qy0Var.d(i11).a;
            float f10 = (this.a ? ly0Var.b : ly0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(ey0[] ey0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < ey0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (ey0 ey0Var : ey0VarArr) {
                    z11 |= m(iArr, ey0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[ey0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = ey0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, ey0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= ey0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    ey0 ey0Var2 = ey0VarArr[i14];
                    ky0 ky0Var = ey0Var2.a;
                    if (ky0Var.a >= ky0Var.b) {
                        ey0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final ey0[] q(ArrayList arrayList) {
        cc.f fVar = new cc.f(this, (ey0[]) arrayList.toArray(new ey0[0]));
        int length = ((ey0[][]) fVar.d).length;
        for (int i10 = 0; i10 < length; i10++) {
            fVar.g(i10);
        }
        return (ey0[]) fVar.c;
    }
}
