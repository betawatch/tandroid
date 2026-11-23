package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ox0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public mx0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ yx0 x;
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
    public final ux0 v = new ux0(0);
    public final ux0 w = new ux0(-100000);

    public ox0(yx0 yx0Var, boolean z10) {
        this.x = yx0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, sx0 sx0Var, ux0 ux0Var, boolean z10) {
        if (sx0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((mx0) obj).a.equals(sx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new mx0(sx0Var, ux0Var));
    }

    public static boolean m(int[] iArr, mx0 mx0Var) {
        if (!mx0Var.c) {
            return false;
        }
        sx0 sx0Var = mx0Var.a;
        int i7 = sx0Var.a;
        int i10 = sx0Var.b;
        int i11 = iArr[i7] + mx0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (ux0 ux0Var : (ux0[]) ((Object[]) mVar.d)) {
            ux0Var.a = TLObject.FLAG_31;
        }
        px0[] px0VarArr = (px0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < px0VarArr.length; i7++) {
            int d = px0VarArr[i7].d(z10);
            ux0 ux0Var2 = (ux0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = ux0Var2.a;
            if (!z10) {
                d = -d;
            }
            ux0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        yx0 yx0Var = this.x;
        int childCount = yx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            rx0 d = yx0Var.d(i7);
            tx0 tx0Var = d.a;
            boolean z11 = this.a;
            sx0 sx0Var = (z11 ? tx0Var.b : tx0Var.a).b;
            int i10 = z10 ? sx0Var.a : sx0Var.b;
            iArr[i10] = Math.max(iArr[i10], yx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        sx0 sx0Var;
        nx0 nx0Var = new nx0(sx0.class, ux0.class);
        vx0[] vx0VarArr = (vx0[]) ((Object[]) f().c);
        int length = vx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                sx0Var = vx0VarArr[i7].b;
            } else {
                sx0 sx0Var2 = vx0VarArr[i7].b;
                sx0Var = new sx0(sx0Var2.b, sx0Var2.a);
            }
            ux0 ux0Var = new ux0();
            ux0Var.a = TLObject.FLAG_31;
            nx0Var.add(Pair.create(sx0Var, ux0Var));
        }
        return nx0Var.f();
    }

    public final mx0[] d() {
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
                sx0[] sx0VarArr = (sx0[]) ((Object[]) mVar.c);
                if (i7 >= sx0VarArr.length) {
                    break;
                }
                j(arrayList, sx0VarArr[i7], ((ux0[]) ((Object[]) mVar.d))[i7], false);
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
                sx0[] sx0VarArr2 = (sx0[]) ((Object[]) mVar2.c);
                if (i10 >= sx0VarArr2.length) {
                    break;
                }
                j(arrayList2, sx0VarArr2[i10], ((ux0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new sx0(i11, i12), new ux0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new sx0(0, e10), this.v, false);
            j(arrayList2, new sx0(e10, 0), this.w, false);
            mx0[] q10 = q(arrayList);
            mx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(mx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (mx0[]) objArr;
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
        yx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object lx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.a;
        yx0 yx0Var = this.x;
        if (mVar == null) {
            nx0 nx0Var = new nx0(vx0.class, px0.class);
            int childCount = yx0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                tx0 tx0Var = yx0Var.d(i7).a;
                vx0 vx0Var = z10 ? tx0Var.b : tx0Var.a;
                switch (vx0.a(vx0Var, z10).a) {
                    case 3:
                        lx0Var = new lx0();
                        break;
                    default:
                        lx0Var = new px0();
                        break;
                }
                nx0Var.add(Pair.create(vx0Var, lx0Var));
            }
            this.d = nx0Var.f();
        }
        if (!this.e) {
            for (px0 px0Var : (px0[]) ((Object[]) this.d.d)) {
                px0Var.c();
            }
            int childCount2 = yx0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                rx0 d = yx0Var.d(i10);
                tx0 tx0Var2 = d.a;
                vx0 vx0Var2 = z10 ? tx0Var2.b : tx0Var2.a;
                int e10 = yx0Var.e(d, z10, false) + yx0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = vx0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                px0 px0Var2 = (px0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                px0Var2.c = ((vx0Var2.c == yx0.T && f10 == 0.0f) ? 0 : 2) & px0Var2.c;
                int a10 = vx0.a(vx0Var2, z10).a(d, i11);
                px0Var2.b(a10, i11 - a10);
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
            yx0 yx0Var = this.x;
            if (!z11) {
                int childCount = yx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z10 = false;
                        break;
                    }
                    tx0 tx0Var = yx0Var.d(i7).a;
                    if ((z12 ? tx0Var.b : tx0Var.a).d != 0.0f) {
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
                    this.t = new int[yx0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (yx0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = yx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        tx0 tx0Var2 = yx0Var.d(i10).a;
                        f10 += (z12 ? tx0Var2.b : tx0Var2.a).d;
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
            yx0 yx0Var = this.x;
            int childCount = yx0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                tx0 tx0Var = yx0Var.d(i12).a;
                sx0 sx0Var = (this.a ? tx0Var.b : tx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, sx0Var.a), sx0Var.b), sx0Var.a());
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
        ux0 ux0Var = this.w;
        ux0 ux0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            ux0Var2.a = 0;
            ux0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            ux0Var2.a = 0;
            ux0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        ux0Var2.a = size;
        ux0Var.a = -size;
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
            yx0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        yx0 yx0Var = this.x;
        int childCount = yx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            tx0 tx0Var = yx0Var.d(i10).a;
            float f11 = (this.a ? tx0Var.b : tx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(mx0[] mx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < mx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (mx0 mx0Var : mx0VarArr) {
                    z11 |= m(iArr, mx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[mx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = mx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, mx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= mx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    mx0 mx0Var2 = mx0VarArr[i13];
                    sx0 sx0Var = mx0Var2.a;
                    if (sx0Var.a >= sx0Var.b) {
                        mx0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final mx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (mx0[]) arrayList.toArray(new mx0[0]));
        int length = ((mx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (mx0[]) kVar.c;
    }
}
