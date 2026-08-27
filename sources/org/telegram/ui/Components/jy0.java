package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jy0 {
    public final boolean a;
    public j9.a d;
    public j9.a f;
    public j9.a h;
    public int[] j;
    public int[] l;
    public hy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ ty0 x;
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
    public final py0 v = new py0(0);
    public final py0 w = new py0(-100000);

    public jy0(ty0 ty0Var, boolean z10) {
        this.x = ty0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, ny0 ny0Var, py0 py0Var, boolean z10) {
        if (ny0Var.b - ny0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((hy0) obj).a.equals(ny0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new hy0(ny0Var, py0Var));
    }

    public static boolean m(int[] iArr, hy0 hy0Var) {
        if (!hy0Var.c) {
            return false;
        }
        ny0 ny0Var = hy0Var.a;
        int i10 = ny0Var.a;
        int i11 = ny0Var.b;
        int i12 = iArr[i10] + hy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(j9.a aVar, boolean z10) {
        for (py0 py0Var : (py0[]) ((Object[]) aVar.d)) {
            py0Var.a = TLObject.FLAG_31;
        }
        ky0[] ky0VarArr = (ky0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < ky0VarArr.length; i10++) {
            int d = ky0VarArr[i10].d(z10);
            py0 py0Var2 = (py0) ((Object[]) aVar.d)[((int[]) aVar.b)[i10]];
            int i11 = py0Var2.a;
            if (!z10) {
                d = -d;
            }
            py0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        ty0 ty0Var = this.x;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 d = ty0Var.d(i10);
            oy0 oy0Var = d.a;
            boolean z11 = this.a;
            ny0 ny0Var = (z11 ? oy0Var.b : oy0Var.a).b;
            int i11 = z10 ? ny0Var.a : ny0Var.b;
            iArr[i11] = Math.max(iArr[i11], ty0Var.f(d, z11, z10));
        }
    }

    public final j9.a c(boolean z10) {
        ny0 ny0Var;
        iy0 iy0Var = new iy0(ny0.class, py0.class);
        qy0[] qy0VarArr = (qy0[]) ((Object[]) f().c);
        int length = qy0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ny0Var = qy0VarArr[i10].b;
            } else {
                ny0 ny0Var2 = qy0VarArr[i10].b;
                ny0Var = new ny0(ny0Var2.b, ny0Var2.a);
            }
            py0 py0Var = new py0();
            py0Var.a = TLObject.FLAG_31;
            iy0Var.add(Pair.create(ny0Var, py0Var));
        }
        return iy0Var.i();
    }

    public final hy0[] d() {
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
            j9.a aVar = this.f;
            int i10 = 0;
            while (true) {
                ny0[] ny0VarArr = (ny0[]) ((Object[]) aVar.c);
                if (i10 >= ny0VarArr.length) {
                    break;
                }
                j(arrayList, ny0VarArr[i10], ((py0[]) ((Object[]) aVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            j9.a aVar2 = this.h;
            int i11 = 0;
            while (true) {
                ny0[] ny0VarArr2 = (ny0[]) ((Object[]) aVar2.c);
                if (i11 >= ny0VarArr2.length) {
                    break;
                }
                j(arrayList2, ny0VarArr2[i11], ((py0[]) ((Object[]) aVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ny0(i12, i13), new py0(0), true);
                    i12 = i13;
                }
            }
            int e9 = e();
            j(arrayList, new ny0(0, e9), this.v, false);
            j(arrayList2, new ny0(e9, 0), this.w, false);
            hy0[] q6 = q(arrayList);
            hy0[] q9 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(hy0[].class.getComponentType(), q6.length + q9.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q9, 0, objArr, q6.length, q9.length);
            this.n = (hy0[]) objArr;
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

    public final j9.a f() {
        Object gy0Var;
        j9.a aVar = this.d;
        boolean z10 = this.a;
        ty0 ty0Var = this.x;
        if (aVar == null) {
            iy0 iy0Var = new iy0(qy0.class, ky0.class);
            int childCount = ty0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                oy0 oy0Var = ty0Var.d(i10).a;
                qy0 qy0Var = z10 ? oy0Var.b : oy0Var.a;
                switch (qy0.a(qy0Var, z10).a) {
                    case 3:
                        gy0Var = new gy0();
                        break;
                    default:
                        gy0Var = new ky0();
                        break;
                }
                iy0Var.add(Pair.create(qy0Var, gy0Var));
            }
            this.d = iy0Var.i();
        }
        if (!this.e) {
            for (ky0 ky0Var : (ky0[]) ((Object[]) this.d.d)) {
                ky0Var.c();
            }
            int childCount2 = ty0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                my0 d = ty0Var.d(i11);
                oy0 oy0Var2 = d.a;
                qy0 qy0Var2 = z10 ? oy0Var2.b : oy0Var2.a;
                int e9 = ty0Var.e(d, z10, false) + ty0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = qy0Var2.d;
                int i12 = e9 + (f10 == 0.0f ? 0 : this.t[i11]);
                j9.a aVar2 = this.d;
                ky0 ky0Var2 = (ky0) ((Object[]) aVar2.d)[((int[]) aVar2.b)[i11]];
                ky0Var2.c = ((qy0Var2.c == ty0.N && f10 == 0.0f) ? 0 : 2) & ky0Var2.c;
                int a2 = qy0.a(qy0Var2, z10).a(d, i12);
                ky0Var2.b(a2, i12 - a2);
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
            ty0 ty0Var = this.x;
            if (!z11) {
                int childCount = ty0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    oy0 oy0Var = ty0Var.d(i10).a;
                    if ((z12 ? oy0Var.b : oy0Var.a).d != 0.0f) {
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
                    this.t = new int[ty0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (ty0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = ty0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        oy0 oy0Var2 = ty0Var.d(i11).a;
                        f10 += (z12 ? oy0Var2.b : oy0Var2.a).d;
                    }
                    int i12 = -1;
                    int i13 = 0;
                    boolean z13 = true;
                    while (i13 < childCount2) {
                        int i14 = (int) ((i13 + childCount2) / 2);
                        l();
                        o(f10, i14);
                        boolean p6 = p(d(), iArr, false);
                        if (p6) {
                            i13 = i14 + 1;
                            i12 = i14;
                        } else {
                            childCount2 = i14;
                        }
                        z13 = p6;
                    }
                    if (i12 > 0 && !z13) {
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
            ty0 ty0Var = this.x;
            int childCount = ty0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                oy0 oy0Var = ty0Var.d(i13).a;
                ny0 ny0Var = (this.a ? oy0Var.b : oy0Var.a).b;
                int i14 = ny0Var.a;
                int i15 = ny0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - ny0Var.a);
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
        py0 py0Var = this.w;
        py0 py0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            py0Var2.a = 0;
            py0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            py0Var2.a = 0;
            py0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        py0Var2.a = size;
        py0Var.a = -size;
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
            throw new IllegalArgumentException(s3.c.l((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f10, int i10) {
        Arrays.fill(this.t, 0);
        ty0 ty0Var = this.x;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            oy0 oy0Var = ty0Var.d(i11).a;
            float f11 = (this.a ? oy0Var.b : oy0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i10 * f11) / f10);
                this.t[i11] = round;
                i10 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(hy0[] hy0VarArr, int[] iArr, boolean z10) {
        int e9 = e() + 1;
        loop0: for (int i10 = 0; i10 < hy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e9; i11++) {
                boolean z11 = false;
                for (hy0 hy0Var : hy0VarArr) {
                    z11 |= m(iArr, hy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[hy0VarArr.length];
            for (int i12 = 0; i12 < e9; i12++) {
                int length = hy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, hy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= hy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    hy0 hy0Var2 = hy0VarArr[i14];
                    ny0 ny0Var = hy0Var2.a;
                    if (ny0Var.a >= ny0Var.b) {
                        hy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final hy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (hy0[]) arrayList.toArray(new hy0[0]));
        int length = ((hy0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (hy0[]) i0Var.b;
    }
}
