package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bx0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public zw0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ lx0 x;
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
    public final hx0 v = new hx0(0);
    public final hx0 w = new hx0(-100000);

    public bx0(lx0 lx0Var, boolean z9) {
        this.x = lx0Var;
        this.a = z9;
    }

    public static void j(ArrayList arrayList, fx0 fx0Var, hx0 hx0Var, boolean z9) {
        if (fx0Var.a() == 0) {
            return;
        }
        if (z9) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((zw0) obj).a.equals(fx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new zw0(fx0Var, hx0Var));
    }

    public static boolean m(int[] iArr, zw0 zw0Var) {
        if (!zw0Var.c) {
            return false;
        }
        fx0 fx0Var = zw0Var.a;
        int i7 = fx0Var.a;
        int i10 = fx0Var.b;
        int i11 = iArr[i7] + zw0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z9) {
        for (hx0 hx0Var : (hx0[]) ((Object[]) mVar.d)) {
            hx0Var.a = TLObject.FLAG_31;
        }
        cx0[] cx0VarArr = (cx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < cx0VarArr.length; i7++) {
            int d = cx0VarArr[i7].d(z9);
            hx0 hx0Var2 = (hx0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = hx0Var2.a;
            if (!z9) {
                d = -d;
            }
            hx0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z9) {
        int[] iArr = z9 ? this.j : this.l;
        lx0 lx0Var = this.x;
        int childCount = lx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ex0 d = lx0Var.d(i7);
            gx0 gx0Var = d.a;
            boolean z10 = this.a;
            fx0 fx0Var = (z10 ? gx0Var.b : gx0Var.a).b;
            int i10 = z9 ? fx0Var.a : fx0Var.b;
            iArr[i10] = Math.max(iArr[i10], lx0Var.f(d, z10, z9));
        }
    }

    public final h6.m c(boolean z9) {
        fx0 fx0Var;
        ax0 ax0Var = new ax0(fx0.class, hx0.class);
        ix0[] ix0VarArr = (ix0[]) ((Object[]) f().c);
        int length = ix0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z9) {
                fx0Var = ix0VarArr[i7].b;
            } else {
                fx0 fx0Var2 = ix0VarArr[i7].b;
                fx0Var = new fx0(fx0Var2.b, fx0Var2.a);
            }
            hx0 hx0Var = new hx0();
            hx0Var.a = TLObject.FLAG_31;
            ax0Var.add(Pair.create(fx0Var, hx0Var));
        }
        return ax0Var.f();
    }

    public final zw0[] d() {
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
                fx0[] fx0VarArr = (fx0[]) ((Object[]) mVar.c);
                if (i7 >= fx0VarArr.length) {
                    break;
                }
                j(arrayList, fx0VarArr[i7], ((hx0[]) ((Object[]) mVar.d))[i7], false);
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
                fx0[] fx0VarArr2 = (fx0[]) ((Object[]) mVar2.c);
                if (i10 >= fx0VarArr2.length) {
                    break;
                }
                j(arrayList2, fx0VarArr2[i10], ((hx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new fx0(i11, i12), new hx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new fx0(0, e10), this.v, false);
            j(arrayList2, new fx0(e10, 0), this.w, false);
            zw0[] q10 = q(arrayList);
            zw0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zw0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (zw0[]) objArr;
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
        lx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object yw0Var;
        h6.m mVar = this.d;
        boolean z9 = this.a;
        lx0 lx0Var = this.x;
        if (mVar == null) {
            ax0 ax0Var = new ax0(ix0.class, cx0.class);
            int childCount = lx0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                gx0 gx0Var = lx0Var.d(i7).a;
                ix0 ix0Var = z9 ? gx0Var.b : gx0Var.a;
                switch (ix0.a(ix0Var, z9).a) {
                    case 3:
                        yw0Var = new yw0();
                        break;
                    default:
                        yw0Var = new cx0();
                        break;
                }
                ax0Var.add(Pair.create(ix0Var, yw0Var));
            }
            this.d = ax0Var.f();
        }
        if (!this.e) {
            for (cx0 cx0Var : (cx0[]) ((Object[]) this.d.d)) {
                cx0Var.c();
            }
            int childCount2 = lx0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                ex0 d = lx0Var.d(i10);
                gx0 gx0Var2 = d.a;
                ix0 ix0Var2 = z9 ? gx0Var2.b : gx0Var2.a;
                int e10 = lx0Var.e(d, z9, false) + lx0Var.e(d, z9, true) + (z9 ? d.k : d.l);
                float f10 = ix0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                cx0 cx0Var2 = (cx0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                cx0Var2.c = ((ix0Var2.c == lx0.R && f10 == 0.0f) ? 0 : 2) & cx0Var2.c;
                int a10 = ix0.a(ix0Var2, z9).a(d, i11);
                cx0Var2.b(a10, i11 - a10);
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
            lx0 lx0Var = this.x;
            if (!z10) {
                int childCount = lx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z9 = false;
                        break;
                    }
                    gx0 gx0Var = lx0Var.d(i7).a;
                    if ((z11 ? gx0Var.b : gx0Var.a).d != 0.0f) {
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
                    this.t = new int[lx0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (lx0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = lx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        gx0 gx0Var2 = lx0Var.d(i10).a;
                        f10 += (z11 ? gx0Var2.b : gx0Var2.a).d;
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
            lx0 lx0Var = this.x;
            int childCount = lx0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                gx0 gx0Var = lx0Var.d(i12).a;
                fx0 fx0Var = (this.a ? gx0Var.b : gx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, fx0Var.a), fx0Var.b), fx0Var.a());
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
        hx0 hx0Var = this.w;
        hx0 hx0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            hx0Var2.a = 0;
            hx0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            hx0Var2.a = 0;
            hx0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        hx0Var2.a = size;
        hx0Var.a = -size;
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
            lx0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        lx0 lx0Var = this.x;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 gx0Var = lx0Var.d(i10).a;
            float f11 = (this.a ? gx0Var.b : gx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(zw0[] zw0VarArr, int[] iArr, boolean z9) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < zw0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z10 = false;
                for (zw0 zw0Var : zw0VarArr) {
                    z10 |= m(iArr, zw0Var);
                }
                if (!z10) {
                    break loop0;
                }
            }
            if (!z9) {
                return false;
            }
            boolean[] zArr = new boolean[zw0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = zw0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, zw0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= zw0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    zw0 zw0Var2 = zw0VarArr[i13];
                    fx0 fx0Var = zw0Var2.a;
                    if (fx0Var.a >= fx0Var.b) {
                        zw0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final zw0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (zw0[]) arrayList.toArray(new zw0[0]));
        int length = ((zw0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.x(i7);
        }
        return (zw0[]) kVar.c;
    }
}
