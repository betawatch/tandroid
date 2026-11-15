package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fx0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public dx0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ px0 x;
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
    public final lx0 v = new lx0(0);
    public final lx0 w = new lx0(-100000);

    public fx0(px0 px0Var, boolean z10) {
        this.x = px0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, jx0 jx0Var, lx0 lx0Var, boolean z10) {
        if (jx0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((dx0) obj).a.equals(jx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new dx0(jx0Var, lx0Var));
    }

    public static boolean m(int[] iArr, dx0 dx0Var) {
        if (!dx0Var.c) {
            return false;
        }
        jx0 jx0Var = dx0Var.a;
        int i7 = jx0Var.a;
        int i10 = jx0Var.b;
        int i11 = iArr[i7] + dx0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (lx0 lx0Var : (lx0[]) ((Object[]) mVar.d)) {
            lx0Var.a = TLObject.FLAG_31;
        }
        gx0[] gx0VarArr = (gx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < gx0VarArr.length; i7++) {
            int d = gx0VarArr[i7].d(z10);
            lx0 lx0Var2 = (lx0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = lx0Var2.a;
            if (!z10) {
                d = -d;
            }
            lx0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        px0 px0Var = this.x;
        int childCount = px0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ix0 d = px0Var.d(i7);
            kx0 kx0Var = d.a;
            boolean z11 = this.a;
            jx0 jx0Var = (z11 ? kx0Var.b : kx0Var.a).b;
            int i10 = z10 ? jx0Var.a : jx0Var.b;
            iArr[i10] = Math.max(iArr[i10], px0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        jx0 jx0Var;
        ex0 ex0Var = new ex0(jx0.class, lx0.class);
        mx0[] mx0VarArr = (mx0[]) ((Object[]) f().c);
        int length = mx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                jx0Var = mx0VarArr[i7].b;
            } else {
                jx0 jx0Var2 = mx0VarArr[i7].b;
                jx0Var = new jx0(jx0Var2.b, jx0Var2.a);
            }
            lx0 lx0Var = new lx0();
            lx0Var.a = TLObject.FLAG_31;
            ex0Var.add(Pair.create(jx0Var, lx0Var));
        }
        return ex0Var.f();
    }

    public final dx0[] d() {
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
            h6.m mVar = this.f;
            int i7 = 0;
            while (true) {
                jx0[] jx0VarArr = (jx0[]) ((Object[]) mVar.c);
                if (i7 >= jx0VarArr.length) {
                    break;
                }
                j(arrayList, jx0VarArr[i7], ((lx0[]) ((Object[]) mVar.d))[i7], false);
                i7++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            h6.m mVar2 = this.h;
            int i10 = 0;
            while (true) {
                jx0[] jx0VarArr2 = (jx0[]) ((Object[]) mVar2.c);
                if (i10 >= jx0VarArr2.length) {
                    break;
                }
                j(arrayList2, jx0VarArr2[i10], ((lx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new jx0(i11, i12), new lx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new jx0(0, e10), this.v, false);
            j(arrayList2, new jx0(e10, 0), this.w, false);
            dx0[] q10 = q(arrayList);
            dx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(dx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (dx0[]) objArr;
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
        px0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object cx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.a;
        px0 px0Var = this.x;
        if (mVar == null) {
            ex0 ex0Var = new ex0(mx0.class, gx0.class);
            int childCount = px0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                kx0 kx0Var = px0Var.d(i7).a;
                mx0 mx0Var = z10 ? kx0Var.b : kx0Var.a;
                switch (mx0.a(mx0Var, z10).a) {
                    case 3:
                        cx0Var = new cx0();
                        break;
                    default:
                        cx0Var = new gx0();
                        break;
                }
                ex0Var.add(Pair.create(mx0Var, cx0Var));
            }
            this.d = ex0Var.f();
        }
        if (!this.e) {
            for (gx0 gx0Var : (gx0[]) ((Object[]) this.d.d)) {
                gx0Var.c();
            }
            int childCount2 = px0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                ix0 d = px0Var.d(i10);
                kx0 kx0Var2 = d.a;
                mx0 mx0Var2 = z10 ? kx0Var2.b : kx0Var2.a;
                int e10 = px0Var.e(d, z10, false) + px0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = mx0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                gx0 gx0Var2 = (gx0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                gx0Var2.c = ((mx0Var2.c == px0.T && f10 == 0.0f) ? 0 : 2) & gx0Var2.c;
                int a10 = mx0.a(mx0Var2, z10).a(d, i11);
                gx0Var2.b(a10, i11 - a10);
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
            px0 px0Var = this.x;
            if (!z11) {
                int childCount = px0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z10 = false;
                        break;
                    }
                    kx0 kx0Var = px0Var.d(i7).a;
                    if ((z12 ? kx0Var.b : kx0Var.a).d != 0.0f) {
                        z10 = true;
                        break;
                    }
                    i7++;
                }
                this.r = z10;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[px0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (px0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = px0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        kx0 kx0Var2 = px0Var.d(i10).a;
                        f10 += (z12 ? kx0Var2.b : kx0Var2.a).d;
                    }
                    int i11 = -1;
                    boolean z13 = true;
                    int i12 = 0;
                    while (i12 < childCount2) {
                        int i13 = (int) ((i12 + childCount2) / 2);
                        l();
                        o(f10, i13);
                        boolean p10 = p(d(), iArr, false);
                        if (p10) {
                            i12 = i13 + 1;
                            i11 = i13;
                        } else {
                            childCount2 = i13;
                        }
                        z13 = p10;
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
        int i7 = this.c;
        int i10 = TLObject.FLAG_31;
        if (i7 == Integer.MIN_VALUE) {
            px0 px0Var = this.x;
            int childCount = px0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                kx0 kx0Var = px0Var.d(i12).a;
                jx0 jx0Var = (this.a ? kx0Var.b : kx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, jx0Var.a), jx0Var.b), jx0Var.a());
            }
            if (i11 != -1) {
                i10 = i11;
            }
            this.c = Math.max(0, i10);
        }
        return this.c;
    }

    public final int i(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        lx0 lx0Var = this.w;
        lx0 lx0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            lx0Var2.a = 0;
            lx0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            lx0Var2.a = 0;
            lx0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        lx0Var2.a = size;
        lx0Var.a = -size;
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

    public final void n(int i7) {
        if (i7 == Integer.MIN_VALUE || i7 >= h()) {
            this.b = i7;
        } else {
            px0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        px0 px0Var = this.x;
        int childCount = px0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            kx0 kx0Var = px0Var.d(i10).a;
            float f11 = (this.a ? kx0Var.b : kx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(dx0[] dx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < dx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (dx0 dx0Var : dx0VarArr) {
                    z11 |= m(iArr, dx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[dx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = dx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, dx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= dx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    dx0 dx0Var2 = dx0VarArr[i13];
                    jx0 jx0Var = dx0Var2.a;
                    if (jx0Var.a >= jx0Var.b) {
                        dx0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final dx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (dx0[]) arrayList.toArray(new dx0[0]));
        int length = ((dx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (dx0[]) kVar.c;
    }
}
