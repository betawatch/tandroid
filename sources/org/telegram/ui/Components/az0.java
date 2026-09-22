package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class az0 {
    public final boolean a;
    public lf.i d;
    public lf.i f;
    public lf.i h;
    public int[] j;
    public int[] l;
    public yy0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ kz0 x;
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
    public final gz0 v = new gz0(0);
    public final gz0 w = new gz0(-100000);

    public az0(kz0 kz0Var, boolean z10) {
        this.x = kz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, ez0 ez0Var, gz0 gz0Var, boolean z10) {
        if (ez0Var.b - ez0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((yy0) obj).a.equals(ez0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new yy0(ez0Var, gz0Var));
    }

    public static boolean m(int[] iArr, yy0 yy0Var) {
        if (!yy0Var.c) {
            return false;
        }
        ez0 ez0Var = yy0Var.a;
        int i10 = ez0Var.a;
        int i11 = ez0Var.b;
        int i12 = iArr[i10] + yy0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(lf.i iVar, boolean z10) {
        for (gz0 gz0Var : (gz0[]) ((Object[]) iVar.d)) {
            gz0Var.a = TLObject.FLAG_31;
        }
        bz0[] bz0VarArr = (bz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < bz0VarArr.length; i10++) {
            int d = bz0VarArr[i10].d(z10);
            gz0 gz0Var2 = (gz0) ((Object[]) iVar.d)[((int[]) iVar.b)[i10]];
            int i11 = gz0Var2.a;
            if (!z10) {
                d = -d;
            }
            gz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        kz0 kz0Var = this.x;
        int childCount = kz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            dz0 d = kz0Var.d(i10);
            fz0 fz0Var = d.a;
            boolean z11 = this.a;
            ez0 ez0Var = (z11 ? fz0Var.b : fz0Var.a).b;
            int i11 = z10 ? ez0Var.a : ez0Var.b;
            iArr[i11] = Math.max(iArr[i11], kz0Var.f(d, z11, z10));
        }
    }

    public final lf.i c(boolean z10) {
        ez0 ez0Var;
        zy0 zy0Var = new zy0(ez0.class, gz0.class);
        hz0[] hz0VarArr = (hz0[]) ((Object[]) f().c);
        int length = hz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                ez0Var = hz0VarArr[i10].b;
            } else {
                ez0 ez0Var2 = hz0VarArr[i10].b;
                ez0Var = new ez0(ez0Var2.b, ez0Var2.a);
            }
            gz0 gz0Var = new gz0();
            gz0Var.a = TLObject.FLAG_31;
            zy0Var.add(Pair.create(ez0Var, gz0Var));
        }
        return zy0Var.i();
    }

    public final yy0[] d() {
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
                ez0[] ez0VarArr = (ez0[]) ((Object[]) iVar.c);
                if (i10 >= ez0VarArr.length) {
                    break;
                }
                j(arrayList, ez0VarArr[i10], ((gz0[]) ((Object[]) iVar.d))[i10], false);
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
                ez0[] ez0VarArr2 = (ez0[]) ((Object[]) iVar2.c);
                if (i11 >= ez0VarArr2.length) {
                    break;
                }
                j(arrayList2, ez0VarArr2[i11], ((gz0[]) ((Object[]) iVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new ez0(i12, i13), new gz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new ez0(0, e), this.v, false);
            j(arrayList2, new ez0(e, 0), this.w, false);
            yy0[] q6 = q(arrayList);
            yy0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(yy0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (yy0[]) objArr;
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
        Object xy0Var;
        lf.i iVar = this.d;
        boolean z10 = this.a;
        kz0 kz0Var = this.x;
        if (iVar == null) {
            zy0 zy0Var = new zy0(hz0.class, bz0.class);
            int childCount = kz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                fz0 fz0Var = kz0Var.d(i10).a;
                hz0 hz0Var = z10 ? fz0Var.b : fz0Var.a;
                switch (hz0.a(hz0Var, z10).a) {
                    case 3:
                        xy0Var = new xy0();
                        break;
                    default:
                        xy0Var = new bz0();
                        break;
                }
                zy0Var.add(Pair.create(hz0Var, xy0Var));
            }
            this.d = zy0Var.i();
        }
        if (!this.e) {
            for (bz0 bz0Var : (bz0[]) ((Object[]) this.d.d)) {
                bz0Var.c();
            }
            int childCount2 = kz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                dz0 d = kz0Var.d(i11);
                fz0 fz0Var2 = d.a;
                hz0 hz0Var2 = z10 ? fz0Var2.b : fz0Var2.a;
                int e = kz0Var.e(d, z10, false) + kz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = hz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                lf.i iVar2 = this.d;
                bz0 bz0Var2 = (bz0) ((Object[]) iVar2.d)[((int[]) iVar2.b)[i11]];
                bz0Var2.c = ((hz0Var2.c == kz0.R && f7 == 0.0f) ? 0 : 2) & bz0Var2.c;
                int a2 = hz0.a(hz0Var2, z10).a(d, i12);
                bz0Var2.b(a2, i12 - a2);
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
            kz0 kz0Var = this.x;
            if (!z11) {
                int childCount = kz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    fz0 fz0Var = kz0Var.d(i10).a;
                    if ((z12 ? fz0Var.b : fz0Var.a).d != 0.0f) {
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
                    this.t = new int[kz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (kz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = kz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        fz0 fz0Var2 = kz0Var.d(i11).a;
                        f7 += (z12 ? fz0Var2.b : fz0Var2.a).d;
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
            kz0 kz0Var = this.x;
            int childCount = kz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                fz0 fz0Var = kz0Var.d(i13).a;
                ez0 ez0Var = (this.a ? fz0Var.b : fz0Var.a).b;
                int i14 = ez0Var.a;
                int i15 = ez0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - ez0Var.a);
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
        gz0 gz0Var = this.w;
        gz0 gz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            gz0Var2.a = 0;
            gz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            gz0Var2.a = 0;
            gz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        gz0Var2.a = size;
        gz0Var.a = -size;
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
            throw new IllegalArgumentException(w.c.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        kz0 kz0Var = this.x;
        int childCount = kz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            fz0 fz0Var = kz0Var.d(i11).a;
            float f10 = (this.a ? fz0Var.b : fz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(yy0[] yy0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < yy0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (yy0 yy0Var : yy0VarArr) {
                    z11 |= m(iArr, yy0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[yy0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = yy0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, yy0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= yy0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    yy0 yy0Var2 = yy0VarArr[i14];
                    ez0 ez0Var = yy0Var2.a;
                    if (ez0Var.a >= ez0Var.b) {
                        yy0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final yy0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (yy0[]) arrayList.toArray(new yy0[0]));
        int length = ((yy0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (yy0[]) i0Var.b;
    }
}
