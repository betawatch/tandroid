package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nx0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public lx0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ xx0 x;
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
    public final tx0 v = new tx0(0);
    public final tx0 w = new tx0(-100000);

    public nx0(xx0 xx0Var, boolean z10) {
        this.x = xx0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, rx0 rx0Var, tx0 tx0Var, boolean z10) {
        if (rx0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((lx0) obj).a.equals(rx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new lx0(rx0Var, tx0Var));
    }

    public static boolean m(int[] iArr, lx0 lx0Var) {
        if (!lx0Var.c) {
            return false;
        }
        rx0 rx0Var = lx0Var.a;
        int i7 = rx0Var.a;
        int i10 = rx0Var.b;
        int i11 = iArr[i7] + lx0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (tx0 tx0Var : (tx0[]) ((Object[]) mVar.d)) {
            tx0Var.a = TLObject.FLAG_31;
        }
        ox0[] ox0VarArr = (ox0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < ox0VarArr.length; i7++) {
            int d = ox0VarArr[i7].d(z10);
            tx0 tx0Var2 = (tx0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = tx0Var2.a;
            if (!z10) {
                d = -d;
            }
            tx0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        xx0 xx0Var = this.x;
        int childCount = xx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            qx0 d = xx0Var.d(i7);
            sx0 sx0Var = d.a;
            boolean z11 = this.a;
            rx0 rx0Var = (z11 ? sx0Var.b : sx0Var.a).b;
            int i10 = z10 ? rx0Var.a : rx0Var.b;
            iArr[i10] = Math.max(iArr[i10], xx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        rx0 rx0Var;
        mx0 mx0Var = new mx0(rx0.class, tx0.class);
        ux0[] ux0VarArr = (ux0[]) ((Object[]) f().c);
        int length = ux0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                rx0Var = ux0VarArr[i7].b;
            } else {
                rx0 rx0Var2 = ux0VarArr[i7].b;
                rx0Var = new rx0(rx0Var2.b, rx0Var2.a);
            }
            tx0 tx0Var = new tx0();
            tx0Var.a = TLObject.FLAG_31;
            mx0Var.add(Pair.create(rx0Var, tx0Var));
        }
        return mx0Var.f();
    }

    public final lx0[] d() {
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
                rx0[] rx0VarArr = (rx0[]) ((Object[]) mVar.c);
                if (i7 >= rx0VarArr.length) {
                    break;
                }
                j(arrayList, rx0VarArr[i7], ((tx0[]) ((Object[]) mVar.d))[i7], false);
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
                rx0[] rx0VarArr2 = (rx0[]) ((Object[]) mVar2.c);
                if (i10 >= rx0VarArr2.length) {
                    break;
                }
                j(arrayList2, rx0VarArr2[i10], ((tx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new rx0(i11, i12), new tx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new rx0(0, e10), this.v, false);
            j(arrayList2, new rx0(e10, 0), this.w, false);
            lx0[] q10 = q(arrayList);
            lx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(lx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (lx0[]) objArr;
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
        xx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object kx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.a;
        xx0 xx0Var = this.x;
        if (mVar == null) {
            mx0 mx0Var = new mx0(ux0.class, ox0.class);
            int childCount = xx0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                sx0 sx0Var = xx0Var.d(i7).a;
                ux0 ux0Var = z10 ? sx0Var.b : sx0Var.a;
                switch (ux0.a(ux0Var, z10).a) {
                    case 3:
                        kx0Var = new kx0();
                        break;
                    default:
                        kx0Var = new ox0();
                        break;
                }
                mx0Var.add(Pair.create(ux0Var, kx0Var));
            }
            this.d = mx0Var.f();
        }
        if (!this.e) {
            for (ox0 ox0Var : (ox0[]) ((Object[]) this.d.d)) {
                ox0Var.c();
            }
            int childCount2 = xx0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                qx0 d = xx0Var.d(i10);
                sx0 sx0Var2 = d.a;
                ux0 ux0Var2 = z10 ? sx0Var2.b : sx0Var2.a;
                int e10 = xx0Var.e(d, z10, false) + xx0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = ux0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                ox0 ox0Var2 = (ox0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                ox0Var2.c = ((ux0Var2.c == xx0.T && f10 == 0.0f) ? 0 : 2) & ox0Var2.c;
                int a10 = ux0.a(ux0Var2, z10).a(d, i11);
                ox0Var2.b(a10, i11 - a10);
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
            xx0 xx0Var = this.x;
            if (!z11) {
                int childCount = xx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z10 = false;
                        break;
                    }
                    sx0 sx0Var = xx0Var.d(i7).a;
                    if ((z12 ? sx0Var.b : sx0Var.a).d != 0.0f) {
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
                    this.t = new int[xx0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (xx0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = xx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        sx0 sx0Var2 = xx0Var.d(i10).a;
                        f10 += (z12 ? sx0Var2.b : sx0Var2.a).d;
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
            xx0 xx0Var = this.x;
            int childCount = xx0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                sx0 sx0Var = xx0Var.d(i12).a;
                rx0 rx0Var = (this.a ? sx0Var.b : sx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, rx0Var.a), rx0Var.b), rx0Var.a());
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
        tx0 tx0Var = this.w;
        tx0 tx0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            tx0Var2.a = 0;
            tx0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            tx0Var2.a = 0;
            tx0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        tx0Var2.a = size;
        tx0Var.a = -size;
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
            xx0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        xx0 xx0Var = this.x;
        int childCount = xx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            sx0 sx0Var = xx0Var.d(i10).a;
            float f11 = (this.a ? sx0Var.b : sx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(lx0[] lx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < lx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (lx0 lx0Var : lx0VarArr) {
                    z11 |= m(iArr, lx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[lx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = lx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, lx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= lx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    lx0 lx0Var2 = lx0VarArr[i13];
                    rx0 rx0Var = lx0Var2.a;
                    if (rx0Var.a >= rx0Var.b) {
                        lx0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final lx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (lx0[]) arrayList.toArray(new lx0[0]));
        int length = ((lx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (lx0[]) kVar.c;
    }
}
