package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cx0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public ax0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ mx0 x;
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
    public final ix0 v = new ix0(0);
    public final ix0 w = new ix0(-100000);

    public cx0(mx0 mx0Var, boolean z9) {
        this.x = mx0Var;
        this.a = z9;
    }

    public static void j(ArrayList arrayList, gx0 gx0Var, ix0 ix0Var, boolean z9) {
        if (gx0Var.a() == 0) {
            return;
        }
        if (z9) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((ax0) obj).a.equals(gx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new ax0(gx0Var, ix0Var));
    }

    public static boolean m(int[] iArr, ax0 ax0Var) {
        if (!ax0Var.c) {
            return false;
        }
        gx0 gx0Var = ax0Var.a;
        int i7 = gx0Var.a;
        int i10 = gx0Var.b;
        int i11 = iArr[i7] + ax0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z9) {
        for (ix0 ix0Var : (ix0[]) ((Object[]) mVar.d)) {
            ix0Var.a = TLObject.FLAG_31;
        }
        dx0[] dx0VarArr = (dx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < dx0VarArr.length; i7++) {
            int d = dx0VarArr[i7].d(z9);
            ix0 ix0Var2 = (ix0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = ix0Var2.a;
            if (!z9) {
                d = -d;
            }
            ix0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr = z9 ? this.j : this.l;
        mx0 mx0Var = this.x;
        int childCount = mx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            fx0 d = mx0Var.d(i7);
            hx0 hx0Var = d.a;
            boolean z10 = this.a;
            gx0 gx0Var = (z10 ? hx0Var.b : hx0Var.a).b;
            int i10 = z9 ? gx0Var.a : gx0Var.b;
            iArr[i10] = Math.max(iArr[i10], mx0Var.f(d, z10, z9));
        }
    }

    public final h6.m c(boolean z9) {
        gx0 gx0Var;
        bx0 bx0Var = new bx0(gx0.class, ix0.class);
        jx0[] jx0VarArr = (jx0[]) ((Object[]) f().c);
        int length = jx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z9) {
                gx0Var = jx0VarArr[i7].b;
            } else {
                gx0 gx0Var2 = jx0VarArr[i7].b;
                gx0Var = new gx0(gx0Var2.b, gx0Var2.a);
            }
            ix0 ix0Var = new ix0();
            ix0Var.a = TLObject.FLAG_31;
            bx0Var.add(Pair.create(gx0Var, ix0Var));
        }
        return bx0Var.f();
    }

    public final ax0[] d() {
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
                gx0[] gx0VarArr = (gx0[]) ((Object[]) mVar.c);
                if (i7 >= gx0VarArr.length) {
                    break;
                }
                j(arrayList, gx0VarArr[i7], ((ix0[]) ((Object[]) mVar.d))[i7], false);
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
                gx0[] gx0VarArr2 = (gx0[]) ((Object[]) mVar2.c);
                if (i10 >= gx0VarArr2.length) {
                    break;
                }
                j(arrayList2, gx0VarArr2[i10], ((ix0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new gx0(i11, i12), new ix0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new gx0(0, e10), this.v, false);
            j(arrayList2, new gx0(e10, 0), this.w, false);
            ax0[] q10 = q(arrayList);
            ax0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(ax0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (ax0[]) objArr;
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
        mx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object zw0Var;
        h6.m mVar = this.d;
        boolean z9 = this.a;
        mx0 mx0Var = this.x;
        if (mVar == null) {
            bx0 bx0Var = new bx0(jx0.class, dx0.class);
            int childCount = mx0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                hx0 hx0Var = mx0Var.d(i7).a;
                jx0 jx0Var = z9 ? hx0Var.b : hx0Var.a;
                switch (jx0.a(jx0Var, z9).a) {
                    case 3:
                        zw0Var = new zw0();
                        break;
                    default:
                        zw0Var = new dx0();
                        break;
                }
                bx0Var.add(Pair.create(jx0Var, zw0Var));
            }
            this.d = bx0Var.f();
        }
        if (!this.e) {
            for (dx0 dx0Var : (dx0[]) ((Object[]) this.d.d)) {
                dx0Var.c();
            }
            int childCount2 = mx0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                fx0 d = mx0Var.d(i10);
                hx0 hx0Var2 = d.a;
                jx0 jx0Var2 = z9 ? hx0Var2.b : hx0Var2.a;
                int e10 = mx0Var.e(d, z9, false) + mx0Var.e(d, z9, true) + (z9 ? d.k : d.l);
                float f10 = jx0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                dx0 dx0Var2 = (dx0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                dx0Var2.c = ((jx0Var2.c == mx0.S && f10 == 0.0f) ? 0 : 2) & dx0Var2.c;
                int a10 = jx0.a(jx0Var2, z9).a(d, i11);
                dx0Var2.b(a10, i11 - a10);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] g() {
        boolean z9;
        if (this.p == null) {
            this.p = new int[e() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z10 = this.s;
            float f10 = 0.0f;
            boolean z11 = this.a;
            mx0 mx0Var = this.x;
            if (!z10) {
                int childCount = mx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z9 = false;
                        break;
                    }
                    hx0 hx0Var = mx0Var.d(i7).a;
                    if ((z11 ? hx0Var.b : hx0Var.a).d != 0.0f) {
                        z9 = true;
                        break;
                    }
                    i7++;
                }
                this.r = z9;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[mx0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (mx0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = mx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        hx0 hx0Var2 = mx0Var.d(i10).a;
                        f10 += (z11 ? hx0Var2.b : hx0Var2.a).d;
                    }
                    int i11 = -1;
                    boolean z12 = true;
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
                        z12 = p10;
                    }
                    if (i11 > 0 && !z12) {
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
            mx0 mx0Var = this.x;
            int childCount = mx0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                hx0 hx0Var = mx0Var.d(i12).a;
                gx0 gx0Var = (this.a ? hx0Var.b : hx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, gx0Var.a), gx0Var.b), gx0Var.a());
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
        ix0 ix0Var = this.w;
        ix0 ix0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            ix0Var2.a = 0;
            ix0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            ix0Var2.a = 0;
            ix0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        ix0Var2.a = size;
        ix0Var.a = -size;
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
            mx0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        mx0 mx0Var = this.x;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hx0 hx0Var = mx0Var.d(i10).a;
            float f11 = (this.a ? hx0Var.b : hx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(ax0[] ax0VarArr, int[] iArr, boolean z9) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < ax0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z10 = false;
                for (ax0 ax0Var : ax0VarArr) {
                    z10 |= m(iArr, ax0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z9) {
                return false;
            }
            boolean[] zArr = new boolean[ax0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = ax0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, ax0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= ax0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    ax0 ax0Var2 = ax0VarArr[i13];
                    gx0 gx0Var = ax0Var2.a;
                    if (gx0Var.a >= gx0Var.b) {
                        ax0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final ax0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (ax0[]) arrayList.toArray(new ax0[0]));
        int length = ((ax0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.x(i7);
        }
        return (ax0[]) kVar.c;
    }
}
