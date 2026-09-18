package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bz0 {
    public final boolean a;
    public lf.i d;
    public lf.i f;
    public lf.i h;
    public int[] j;
    public int[] l;
    public zy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ lz0 x;
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
    public final hz0 v = new hz0(0);
    public final hz0 w = new hz0(-100000);

    public bz0(lz0 lz0Var, boolean z10) {
        this.x = lz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, fz0 fz0Var, hz0 hz0Var, boolean z10) {
        if (fz0Var.b - fz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((zy0) obj).a.equals(fz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new zy0(fz0Var, hz0Var));
    }

    public static boolean m(int[] iArr, zy0 zy0Var) {
        if (!zy0Var.c) {
            return false;
        }
        fz0 fz0Var = zy0Var.a;
        int i10 = fz0Var.a;
        int i11 = fz0Var.b;
        int i12 = iArr[i10] + zy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (hz0 hz0Var : (hz0[]) ((Object[]) iVar.d)) {
            hz0Var.a = TLObject.FLAG_31;
        }
        cz0[] cz0VarArr = (cz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < cz0VarArr.length; i10++) {
            int d = cz0VarArr[i10].d(z10);
            hz0 hz0Var2 = (hz0) ((Object[]) iVar.d)[((int[]) iVar.b)[i10]];
            int i11 = hz0Var2.a;
            if (!z10) {
                d = -d;
            }
            hz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        lz0 lz0Var = this.x;
        int childCount = lz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ez0 d = lz0Var.d(i10);
            gz0 gz0Var = d.a;
            boolean z11 = this.a;
            fz0 fz0Var = (z11 ? gz0Var.b : gz0Var.a).b;
            int i11 = z10 ? fz0Var.a : fz0Var.b;
            iArr[i11] = Math.max(iArr[i11], lz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        fz0 fz0Var;
        az0 az0Var = new az0(fz0.class, hz0.class);
        iz0[] iz0VarArr = (iz0[]) ((Object[]) f().c);
        int length = iz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                fz0Var = iz0VarArr[i10].b;
            } else {
                fz0 fz0Var2 = iz0VarArr[i10].b;
                fz0Var = new fz0(fz0Var2.b, fz0Var2.a);
            }
            hz0 hz0Var = new hz0();
            hz0Var.a = TLObject.FLAG_31;
            az0Var.add(Pair.create(fz0Var, hz0Var));
        }
        return az0Var.i();
    }

    public final zy0[] d() {
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
            lf.i iVar = this.f;
            int i10 = 0;
            while (true) {
                fz0[] fz0VarArr = (fz0[]) ((Object[]) iVar.c);
                if (i10 >= fz0VarArr.length) {
                    break;
                }
                j(arrayList, fz0VarArr[i10], ((hz0[]) ((Object[]) iVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            lf.i iVar2 = this.h;
            int i11 = 0;
            while (true) {
                fz0[] fz0VarArr2 = (fz0[]) ((Object[]) iVar2.c);
                if (i11 >= fz0VarArr2.length) {
                    break;
                }
                j(arrayList2, fz0VarArr2[i11], ((hz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new fz0(i12, i13), new hz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new fz0(0, e), this.v, false);
            j(arrayList2, new fz0(e, 0), this.w, false);
            zy0[] q6 = q(arrayList);
            zy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (zy0[]) objArr;
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

    public final lf.i f() {
        Object yy0Var;
        lf.i iVar = this.d;
        boolean z10 = this.a;
        lz0 lz0Var = this.x;
        if (iVar == null) {
            az0 az0Var = new az0(iz0.class, cz0.class);
            int childCount = lz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                gz0 gz0Var = lz0Var.d(i10).a;
                iz0 iz0Var = z10 ? gz0Var.b : gz0Var.a;
                switch (iz0.a(iz0Var, z10).a) {
                    case 3:
                        yy0Var = new yy0();
                        break;
                    default:
                        yy0Var = new cz0();
                        break;
                }
                az0Var.add(Pair.create(iz0Var, yy0Var));
            }
            this.d = az0Var.i();
        }
        if (!this.e) {
            for (cz0 cz0Var : (cz0[]) ((Object[]) this.d.d)) {
                cz0Var.c();
            }
            int childCount2 = lz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                ez0 d = lz0Var.d(i11);
                gz0 gz0Var2 = d.a;
                iz0 iz0Var2 = z10 ? gz0Var2.b : gz0Var2.a;
                int e = lz0Var.e(d, z10, false) + lz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = iz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                lf.i iVar2 = this.d;
                cz0 cz0Var2 = (cz0) ((Object[]) iVar2.d)[((int[]) iVar2.b)[i11]];
                cz0Var2.c = ((iz0Var2.c == lz0.R && f7 == 0.0f) ? 0 : 2) & cz0Var2.c;
                int a2 = iz0.a(iz0Var2, z10).a(d, i12);
                cz0Var2.b(a2, i12 - a2);
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
            lz0 lz0Var = this.x;
            if (!z11) {
                int childCount = lz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    gz0 gz0Var = lz0Var.d(i10).a;
                    if ((z12 ? gz0Var.b : gz0Var.a).d != 0.0f) {
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
                    this.t = new int[lz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (lz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        gz0 gz0Var2 = lz0Var.d(i11).a;
                        f7 += (z12 ? gz0Var2.b : gz0Var2.a).d;
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
            lz0 lz0Var = this.x;
            int childCount = lz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                gz0 gz0Var = lz0Var.d(i13).a;
                fz0 fz0Var = (this.a ? gz0Var.b : gz0Var.a).b;
                int i14 = fz0Var.a;
                int i15 = fz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - fz0Var.a);
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
        hz0 hz0Var = this.w;
        hz0 hz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            hz0Var2.a = 0;
            hz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            hz0Var2.a = 0;
            hz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        hz0Var2.a = size;
        hz0Var.a = -size;
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
        lz0 lz0Var = this.x;
        int childCount = lz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 gz0Var = lz0Var.d(i11).a;
            float f10 = (this.a ? gz0Var.b : gz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(zy0[] zy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < zy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (zy0 zy0Var : zy0VarArr) {
                    z11 |= m(iArr, zy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[zy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = zy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, zy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= zy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    zy0 zy0Var2 = zy0VarArr[i14];
                    fz0 fz0Var = zy0Var2.a;
                    if (fz0Var.a >= fz0Var.b) {
                        zy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final zy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (zy0[]) arrayList.toArray(new zy0[0]));
        int length = ((zy0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (zy0[]) i0Var.b;
    }
}
