package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mx0 {
    public final boolean a;
    public h6.m d;
    public h6.m f;
    public h6.m h;
    public int[] j;
    public int[] l;
    public kx0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ wx0 x;
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
    public final sx0 v = new sx0(0);
    public final sx0 w = new sx0(-100000);

    public mx0(wx0 wx0Var, boolean z10) {
        this.x = wx0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, qx0 qx0Var, sx0 sx0Var, boolean z10) {
        if (qx0Var.a() == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((kx0) obj).a.equals(qx0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new kx0(qx0Var, sx0Var));
    }

    public static boolean m(int[] iArr, kx0 kx0Var) {
        if (!kx0Var.c) {
            return false;
        }
        qx0 qx0Var = kx0Var.a;
        int i7 = qx0Var.a;
        int i10 = qx0Var.b;
        int i11 = iArr[i7] + kx0Var.b.a;
        if (i11 <= iArr[i10]) {
            return false;
        }
        iArr[i10] = i11;
        return true;
    }

    public final void a(h6.m mVar, boolean z10) {
        for (sx0 sx0Var : (sx0[]) ((Object[]) mVar.d)) {
            sx0Var.a = TLObject.FLAG_31;
        }
        nx0[] nx0VarArr = (nx0[]) ((Object[]) f().d);
        for (int i7 = 0; i7 < nx0VarArr.length; i7++) {
            int d = nx0VarArr[i7].d(z10);
            sx0 sx0Var2 = (sx0) ((Object[]) mVar.d)[((int[]) mVar.b)[i7]];
            int i10 = sx0Var2.a;
            if (!z10) {
                d = -d;
            }
            sx0Var2.a = Math.max(i10, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        wx0 wx0Var = this.x;
        int childCount = wx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            px0 d = wx0Var.d(i7);
            rx0 rx0Var = d.a;
            boolean z11 = this.a;
            qx0 qx0Var = (z11 ? rx0Var.b : rx0Var.a).b;
            int i10 = z10 ? qx0Var.a : qx0Var.b;
            iArr[i10] = Math.max(iArr[i10], wx0Var.f(d, z11, z10));
        }
    }

    public final h6.m c(boolean z10) {
        qx0 qx0Var;
        lx0 lx0Var = new lx0(qx0.class, sx0.class);
        tx0[] tx0VarArr = (tx0[]) ((Object[]) f().c);
        int length = tx0VarArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z10) {
                qx0Var = tx0VarArr[i7].b;
            } else {
                qx0 qx0Var2 = tx0VarArr[i7].b;
                qx0Var = new qx0(qx0Var2.b, qx0Var2.a);
            }
            sx0 sx0Var = new sx0();
            sx0Var.a = TLObject.FLAG_31;
            lx0Var.add(Pair.create(qx0Var, sx0Var));
        }
        return lx0Var.f();
    }

    public final kx0[] d() {
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
                qx0[] qx0VarArr = (qx0[]) ((Object[]) mVar.c);
                if (i7 >= qx0VarArr.length) {
                    break;
                }
                j(arrayList, qx0VarArr[i7], ((sx0[]) ((Object[]) mVar.d))[i7], false);
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
                qx0[] qx0VarArr2 = (qx0[]) ((Object[]) mVar2.c);
                if (i10 >= qx0VarArr2.length) {
                    break;
                }
                j(arrayList2, qx0VarArr2[i10], ((sx0[]) ((Object[]) mVar2.d))[i10], false);
                i10++;
            }
            if (this.u) {
                int i11 = 0;
                while (i11 < e()) {
                    int i12 = i11 + 1;
                    j(arrayList, new qx0(i11, i12), new sx0(0), true);
                    i11 = i12;
                }
            }
            int e10 = e();
            j(arrayList, new qx0(0, e10), this.v, false);
            j(arrayList2, new qx0(e10, 0), this.w, false);
            kx0[] q10 = q(arrayList);
            kx0[] q11 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(kx0[].class.getComponentType(), q10.length + q11.length);
            System.arraycopy(q10, 0, objArr, 0, q10.length);
            System.arraycopy(q11, 0, objArr, q10.length, q11.length);
            this.n = (kx0[]) objArr;
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
        wx0.g("Table grid count out of bounds");
        throw null;
    }

    public final h6.m f() {
        Object jx0Var;
        h6.m mVar = this.d;
        boolean z10 = this.a;
        wx0 wx0Var = this.x;
        if (mVar == null) {
            lx0 lx0Var = new lx0(tx0.class, nx0.class);
            int childCount = wx0Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                rx0 rx0Var = wx0Var.d(i7).a;
                tx0 tx0Var = z10 ? rx0Var.b : rx0Var.a;
                switch (tx0.a(tx0Var, z10).a) {
                    case 3:
                        jx0Var = new jx0();
                        break;
                    default:
                        jx0Var = new nx0();
                        break;
                }
                lx0Var.add(Pair.create(tx0Var, jx0Var));
            }
            this.d = lx0Var.f();
        }
        if (!this.e) {
            for (nx0 nx0Var : (nx0[]) ((Object[]) this.d.d)) {
                nx0Var.c();
            }
            int childCount2 = wx0Var.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                px0 d = wx0Var.d(i10);
                rx0 rx0Var2 = d.a;
                tx0 tx0Var2 = z10 ? rx0Var2.b : rx0Var2.a;
                int e10 = wx0Var.e(d, z10, false) + wx0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f10 = tx0Var2.d;
                int i11 = e10 + (f10 == 0.0f ? 0 : this.t[i10]);
                h6.m mVar2 = this.d;
                nx0 nx0Var2 = (nx0) ((Object[]) mVar2.d)[((int[]) mVar2.b)[i10]];
                nx0Var2.c = ((tx0Var2.c == wx0.T && f10 == 0.0f) ? 0 : 2) & nx0Var2.c;
                int a10 = tx0.a(tx0Var2, z10).a(d, i11);
                nx0Var2.b(a10, i11 - a10);
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
            wx0 wx0Var = this.x;
            if (!z11) {
                int childCount = wx0Var.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        z10 = false;
                        break;
                    }
                    rx0 rx0Var = wx0Var.d(i7).a;
                    if ((z12 ? rx0Var.b : rx0Var.a).d != 0.0f) {
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
                    this.t = new int[wx0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (wx0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = wx0Var.getChildCount();
                    for (int i10 = 0; i10 < childCount3; i10++) {
                        rx0 rx0Var2 = wx0Var.d(i10).a;
                        f10 += (z12 ? rx0Var2.b : rx0Var2.a).d;
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
            wx0 wx0Var = this.x;
            int childCount = wx0Var.getChildCount();
            int i11 = -1;
            for (int i12 = 0; i12 < childCount; i12++) {
                rx0 rx0Var = wx0Var.d(i12).a;
                qx0 qx0Var = (this.a ? rx0Var.b : rx0Var.a).b;
                i11 = Math.max(Math.max(Math.max(i11, qx0Var.a), qx0Var.b), qx0Var.a());
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
        sx0 sx0Var = this.w;
        sx0 sx0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            sx0Var2.a = 0;
            sx0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            sx0Var2.a = 0;
            sx0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        sx0Var2.a = size;
        sx0Var.a = -size;
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
            wx0.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(float f10, int i7) {
        Arrays.fill(this.t, 0);
        wx0 wx0Var = this.x;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            rx0 rx0Var = wx0Var.d(i10).a;
            float f11 = (this.a ? rx0Var.b : rx0Var.a).d;
            if (f11 != 0.0f) {
                int round = Math.round((i7 * f11) / f10);
                this.t[i10] = round;
                i7 -= round;
                f10 -= f11;
            }
        }
    }

    public final boolean p(kx0[] kx0VarArr, int[] iArr, boolean z10) {
        int e10 = e() + 1;
        loop0: for (int i7 = 0; i7 < kx0VarArr.length; i7++) {
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < e10; i10++) {
                boolean z11 = false;
                for (kx0 kx0Var : kx0VarArr) {
                    z11 |= m(iArr, kx0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[kx0VarArr.length];
            for (int i11 = 0; i11 < e10; i11++) {
                int length = kx0VarArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    zArr[i12] = zArr[i12] | m(iArr, kx0VarArr[i12]);
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= kx0VarArr.length) {
                    break;
                }
                if (zArr[i13]) {
                    kx0 kx0Var2 = kx0VarArr[i13];
                    qx0 qx0Var = kx0Var2.a;
                    if (qx0Var.a >= qx0Var.b) {
                        kx0Var2.c = false;
                        break;
                    }
                }
                i13++;
            }
        }
        return true;
    }

    public final kx0[] q(ArrayList arrayList) {
        a4.k kVar = new a4.k(this, (kx0[]) arrayList.toArray(new kx0[0]));
        int length = ((kx0[][]) kVar.d).length;
        for (int i7 = 0; i7 < length; i7++) {
            kVar.w(i7);
        }
        return (kx0[]) kVar.c;
    }
}
