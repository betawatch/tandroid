package org.telegram.ui.Components;

import android.util.Pair;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class lz0 {
    public final boolean a;
    public lf.h d;
    public lf.h f;
    public lf.h h;
    public int[] j;
    public int[] l;
    public jz0[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ vz0 x;
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
    public final rz0 v = new rz0(0);
    public final rz0 w = new rz0(-100000);

    public lz0(vz0 vz0Var, boolean z10) {
        this.x = vz0Var;
        this.a = z10;
    }

    public static void j(ArrayList arrayList, pz0 pz0Var, rz0 rz0Var, boolean z10) {
        if (pz0Var.b - pz0Var.a == 0) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((jz0) obj).a.equals(pz0Var)) {
                    return;
                }
            }
        }
        arrayList.add(new jz0(pz0Var, rz0Var));
    }

    public static boolean m(int[] iArr, jz0 jz0Var) {
        if (!jz0Var.c) {
            return false;
        }
        pz0 pz0Var = jz0Var.a;
        int i10 = pz0Var.a;
        int i11 = pz0Var.b;
        int i12 = iArr[i10] + jz0Var.b.a;
        if (i12 <= iArr[i11]) {
            return false;
        }
        iArr[i11] = i12;
        return true;
    }

    public final void a(lf.h hVar, boolean z10) {
        for (rz0 rz0Var : (rz0[]) ((Object[]) hVar.d)) {
            rz0Var.a = TLObject.FLAG_31;
        }
        mz0[] mz0VarArr = (mz0[]) ((Object[]) f().d);
        for (int i10 = 0; i10 < mz0VarArr.length; i10++) {
            int d = mz0VarArr[i10].d(z10);
            rz0 rz0Var2 = (rz0) ((Object[]) hVar.d)[((int[]) hVar.b)[i10]];
            int i11 = rz0Var2.a;
            if (!z10) {
                d = -d;
            }
            rz0Var2.a = Math.max(i11, d);
        }
    }

    public final void b(boolean z10) {
        int[] iArr = z10 ? this.j : this.l;
        vz0 vz0Var = this.x;
        int childCount = vz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            oz0 d = vz0Var.d(i10);
            qz0 qz0Var = d.a;
            boolean z11 = this.a;
            pz0 pz0Var = (z11 ? qz0Var.b : qz0Var.a).b;
            int i11 = z10 ? pz0Var.a : pz0Var.b;
            iArr[i11] = Math.max(iArr[i11], vz0Var.f(d, z11, z10));
        }
    }

    public final lf.h c(boolean z10) {
        pz0 pz0Var;
        kz0 kz0Var = new kz0(pz0.class, rz0.class);
        sz0[] sz0VarArr = (sz0[]) ((Object[]) f().c);
        int length = sz0VarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10) {
                pz0Var = sz0VarArr[i10].b;
            } else {
                pz0 pz0Var2 = sz0VarArr[i10].b;
                pz0Var = new pz0(pz0Var2.b, pz0Var2.a);
            }
            rz0 rz0Var = new rz0();
            rz0Var.a = TLObject.FLAG_31;
            kz0Var.add(Pair.create(pz0Var, rz0Var));
        }
        return kz0Var.i();
    }

    public final jz0[] d() {
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
            lf.h hVar = this.f;
            int i10 = 0;
            while (true) {
                pz0[] pz0VarArr = (pz0[]) ((Object[]) hVar.c);
                if (i10 >= pz0VarArr.length) {
                    break;
                }
                j(arrayList, pz0VarArr[i10], ((rz0[]) ((Object[]) hVar.d))[i10], false);
                i10++;
            }
            if (this.h == null) {
                this.h = c(false);
            }
            if (!this.i) {
                a(this.h, false);
                this.i = true;
            }
            lf.h hVar2 = this.h;
            int i11 = 0;
            while (true) {
                pz0[] pz0VarArr2 = (pz0[]) ((Object[]) hVar2.c);
                if (i11 >= pz0VarArr2.length) {
                    break;
                }
                j(arrayList2, pz0VarArr2[i11], ((rz0[]) ((Object[]) hVar2.d))[i11], false);
                i11++;
            }
            if (this.u) {
                int i12 = 0;
                while (i12 < e()) {
                    int i13 = i12 + 1;
                    j(arrayList, new pz0(i12, i13), new rz0(0), true);
                    i12 = i13;
                }
            }
            int e = e();
            j(arrayList, new pz0(0, e), this.v, false);
            j(arrayList2, new pz0(e, 0), this.w, false);
            jz0[] q6 = q(arrayList);
            jz0[] q10 = q(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(jz0[].class.getComponentType(), q6.length + q10.length);
            System.arraycopy(q6, 0, objArr, 0, q6.length);
            System.arraycopy(q10, 0, objArr, q6.length, q10.length);
            this.n = (jz0[]) objArr;
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

    public final lf.h f() {
        Object iz0Var;
        lf.h hVar = this.d;
        boolean z10 = this.a;
        vz0 vz0Var = this.x;
        if (hVar == null) {
            kz0 kz0Var = new kz0(sz0.class, mz0.class);
            int childCount = vz0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                qz0 qz0Var = vz0Var.d(i10).a;
                sz0 sz0Var = z10 ? qz0Var.b : qz0Var.a;
                switch (sz0.a(sz0Var, z10).a) {
                    case 3:
                        iz0Var = new iz0();
                        break;
                    default:
                        iz0Var = new mz0();
                        break;
                }
                kz0Var.add(Pair.create(sz0Var, iz0Var));
            }
            this.d = kz0Var.i();
        }
        if (!this.e) {
            for (mz0 mz0Var : (mz0[]) ((Object[]) this.d.d)) {
                mz0Var.c();
            }
            int childCount2 = vz0Var.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                oz0 d = vz0Var.d(i11);
                qz0 qz0Var2 = d.a;
                sz0 sz0Var2 = z10 ? qz0Var2.b : qz0Var2.a;
                int e = vz0Var.e(d, z10, false) + vz0Var.e(d, z10, true) + (z10 ? d.k : d.l);
                float f7 = sz0Var2.d;
                int i12 = e + (f7 == 0.0f ? 0 : this.t[i11]);
                lf.h hVar2 = this.d;
                mz0 mz0Var2 = (mz0) ((Object[]) hVar2.d)[((int[]) hVar2.b)[i11]];
                mz0Var2.c = ((sz0Var2.c == vz0.R && f7 == 0.0f) ? 0 : 2) & mz0Var2.c;
                int a2 = sz0.a(sz0Var2, z10).a(d, i12);
                mz0Var2.b(a2, i12 - a2);
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
            vz0 vz0Var = this.x;
            if (!z11) {
                int childCount = vz0Var.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        z10 = false;
                        break;
                    }
                    qz0 qz0Var = vz0Var.d(i10).a;
                    if ((z12 ? qz0Var.b : qz0Var.a).d != 0.0f) {
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
                    this.t = new int[vz0Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                p(d(), iArr, true);
                int childCount2 = (vz0Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = vz0Var.getChildCount();
                    for (int i11 = 0; i11 < childCount3; i11++) {
                        qz0 qz0Var2 = vz0Var.d(i11).a;
                        f7 += (z12 ? qz0Var2.b : qz0Var2.a).d;
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
            vz0 vz0Var = this.x;
            int childCount = vz0Var.getChildCount();
            int i12 = -1;
            for (int i13 = 0; i13 < childCount; i13++) {
                qz0 qz0Var = vz0Var.d(i13).a;
                pz0 pz0Var = (this.a ? qz0Var.b : qz0Var.a).b;
                int i14 = pz0Var.a;
                int i15 = pz0Var.b;
                i12 = Math.max(Math.max(Math.max(i12, i14), i15), i15 - pz0Var.a);
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
        rz0 rz0Var = this.w;
        rz0 rz0Var2 = this.v;
        if (mode == Integer.MIN_VALUE) {
            rz0Var2.a = 0;
            rz0Var.a = -size;
            this.q = false;
            return g()[e()];
        }
        if (mode == 0) {
            rz0Var2.a = 0;
            rz0Var.a = -100000;
            this.q = false;
            return g()[e()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        rz0Var2.a = size;
        rz0Var.a = -size;
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
            throw new IllegalArgumentException(v7.j0.s((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        this.b = i10;
    }

    public final void o(float f7, int i10) {
        Arrays.fill(this.t, 0);
        vz0 vz0Var = this.x;
        int childCount = vz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            qz0 qz0Var = vz0Var.d(i11).a;
            float f10 = (this.a ? qz0Var.b : qz0Var.a).d;
            if (f10 != 0.0f) {
                int round = Math.round((i10 * f10) / f7);
                this.t[i11] = round;
                i10 -= round;
                f7 -= f10;
            }
        }
    }

    public final boolean p(jz0[] jz0VarArr, int[] iArr, boolean z10) {
        int e = e() + 1;
        loop0: for (int i10 = 0; i10 < jz0VarArr.length; i10++) {
            Arrays.fill(iArr, 0);
            for (int i11 = 0; i11 < e; i11++) {
                boolean z11 = false;
                for (jz0 jz0Var : jz0VarArr) {
                    z11 |= m(iArr, jz0Var);
                }
                if (!z11) {
                    break loop0;
                }
            }
            if (!z10) {
                return false;
            }
            boolean[] zArr = new boolean[jz0VarArr.length];
            for (int i12 = 0; i12 < e; i12++) {
                int length = jz0VarArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    zArr[i13] = zArr[i13] | m(iArr, jz0VarArr[i13]);
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 >= jz0VarArr.length) {
                    break;
                }
                if (zArr[i14]) {
                    jz0 jz0Var2 = jz0VarArr[i14];
                    pz0 pz0Var = jz0Var2.a;
                    if (pz0Var.a >= pz0Var.b) {
                        jz0Var2.c = false;
                        break;
                    }
                }
                i14++;
            }
        }
        return true;
    }

    public final jz0[] q(ArrayList arrayList) {
        e0.i0 i0Var = new e0.i0(this, (jz0[]) arrayList.toArray(new jz0[0]));
        int length = ((jz0[][]) i0Var.c).length;
        for (int i10 = 0; i10 < length; i10++) {
            i0Var.f(i10);
        }
        return (jz0[]) i0Var.b;
    }
}
