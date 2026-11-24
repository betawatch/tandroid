// default package

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class hr9 implements yzb {
    public boolean C;
    public go4 D;
    public go4 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final dr9 a;
    public final is3 d;
    public final fs3 e;
    public gr9 f;
    public go4 g;
    public cs3 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final re1 b = new re1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public xzb[] o = new xzb[1000];
    public final kq c = new kq(new dq9((byte) 2));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public hr9(mx6 mx6Var, is3 is3Var, fs3 fs3Var) {
        this.d = is3Var;
        this.e = fs3Var;
        this.a = new dr9(mx6Var);
    }

    public final synchronized boolean A(boolean z) {
        go4 go4Var;
        int v = v();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && v >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (!(i == -1 && this.y != -1 && v() >= this.y)) {
                if (((fr9) this.c.l(v)).a != this.g) {
                    return true;
                }
                return B(w(this.s));
            }
        }
        if (!z && !this.z && ((go4Var = this.E) == null || go4Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean B(int i) {
        cs3 cs3Var = this.h;
        if (cs3Var == null || cs3Var.e() == 4) {
            return true;
        }
        return (this.m[i] & TLObject.FLAG_30) == 0 && this.h.b();
    }

    public final void C() {
        cs3 cs3Var = this.h;
        if (cs3Var == null || cs3Var.e() != 1) {
            return;
        }
        bs3 g = this.h.g();
        g.getClass();
        throw g;
    }

    public final void D(go4 go4Var, mj4 mj4Var) {
        as3 as3Var;
        boolean z;
        go4 go4Var2;
        go4 go4Var3 = this.g;
        if (go4Var3 == null) {
            z = true;
            as3Var = null;
        } else {
            as3Var = go4Var3.x;
            z = false;
        }
        this.g = go4Var;
        as3 as3Var2 = go4Var.x;
        is3 is3Var = this.d;
        if (is3Var != null) {
            int x = is3Var.x(go4Var);
            fo4 a = go4Var.a();
            a.W = x;
            go4Var2 = new go4(a);
        } else {
            go4Var2 = go4Var;
        }
        mj4Var.c = go4Var2;
        mj4Var.b = this.h;
        if (is3Var != null) {
            if (z || !Objects.equals(as3Var, as3Var2)) {
                cs3 cs3Var = this.h;
                fs3 fs3Var = this.e;
                cs3 d = is3Var.d(fs3Var, go4Var);
                this.h = d;
                mj4Var.b = d;
                if (cs3Var != null) {
                    cs3Var.c(fs3Var);
                }
            }
        }
    }

    public final synchronized long E() {
        return this.s != this.p ? this.j[w(this.s)] : this.F;
    }

    public final int F(mj4 mj4Var, la3 la3Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        re1 re1Var = this.b;
        synchronized (this) {
            la3Var.d = false;
            int v = v();
            int i3 = this.x;
            boolean z3 = i3 != -1 && v >= i3;
            i2 = -5;
            if (this.s != this.p) {
                if (!(i3 == -1 && this.y != -1 && v() >= this.y) && !z3) {
                    go4 go4Var = ((fr9) this.c.l(v)).a;
                    if (z2 || go4Var != this.g) {
                        D(go4Var, mj4Var);
                    } else {
                        int w = w(this.s);
                        if (B(w)) {
                            la3Var.setFlags(this.m[w]);
                            if (this.s == this.p - 1 && (z || this.z)) {
                                la3Var.addFlag(TLObject.FLAG_29);
                            }
                            la3Var.e = this.n[w];
                            re1Var.a = this.l[w];
                            re1Var.b = this.k[w];
                            re1Var.c = this.o[w];
                            i2 = -4;
                        } else {
                            la3Var.d = true;
                            i2 = -3;
                        }
                    }
                }
            }
            if (z || this.z || z3) {
                la3Var.setFlags(4);
                la3Var.e = Long.MIN_VALUE;
                i2 = -4;
            } else {
                go4 go4Var2 = this.E;
                if (go4Var2 == null || (!z2 && go4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    D(go4Var2, mj4Var);
                }
            }
        }
        if (i2 == -4 && !la3Var.isEndOfStream()) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                dr9 dr9Var = this.a;
                re1 re1Var2 = this.b;
                if (z4) {
                    dr9.f(dr9Var.e, la3Var, re1Var2, dr9Var.c);
                } else {
                    dr9Var.e = dr9.f(dr9Var.e, la3Var, re1Var2, dr9Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void G(boolean z) {
        dr9 dr9Var = this.a;
        sz0 sz0Var = dr9Var.d;
        if (((mk) sz0Var.c) != null) {
            mx6 mx6Var = dr9Var.a;
            synchronized (mx6Var) {
                ((xc3) mx6Var.d).c.z(sz0Var);
                sz0 sz0Var2 = sz0Var;
                while (sz0Var2 != null) {
                    mk mkVar = (mk) sz0Var2.c;
                    mkVar.getClass();
                    mx6Var.g0(mkVar);
                    sz0Var2 = (sz0) sz0Var2.d;
                    if (sz0Var2 == null || ((mk) sz0Var2.c) == null) {
                        sz0Var2 = null;
                    }
                }
            }
            sz0Var.c = null;
            sz0Var.d = null;
        }
        sz0 sz0Var3 = dr9Var.d;
        int i = dr9Var.b;
        jte.p(((mk) sz0Var3.c) == null);
        sz0Var3.a = 0L;
        sz0Var3.b = i;
        sz0 sz0Var4 = dr9Var.d;
        dr9Var.e = sz0Var4;
        dr9Var.f = sz0Var4;
        dr9Var.g = 0L;
        dr9Var.a.x0();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((dq9) kqVar.d).accept(sparseArray.valueAt(i2));
        }
        kqVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized void H() {
        this.s = 0;
        dr9 dr9Var = this.a;
        dr9Var.e = dr9Var.d;
    }

    public final synchronized boolean I(int i) {
        H();
        int i2 = this.q;
        if (i < i2 || i > this.p + i2) {
            return false;
        }
        int i3 = this.x;
        if (i3 != -1 && i >= i3) {
            return false;
        }
        int i4 = this.y;
        if (i4 != -1 && i >= i4) {
            return false;
        }
        this.t = Long.MIN_VALUE;
        this.s = i - i2;
        return true;
    }

    public final synchronized boolean J(long j, boolean z) {
        hr9 hr9Var;
        Throwable th;
        int w;
        long j2;
        hr9 hr9Var2;
        long j3;
        int p;
        try {
            try {
                H();
                w = w(this.s);
                long j4 = this.u;
                j2 = this.w;
                if (j4 != Long.MIN_VALUE) {
                    try {
                        j2 = Math.min(j2, j4);
                    } catch (Throwable th2) {
                        th = th2;
                        hr9Var = this;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
            try {
                int i = this.s;
                int i2 = this.p;
                if ((i != i2) && j >= this.n[w] && (j <= j2 || z)) {
                    if (this.G) {
                        int i3 = i2 - i;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (this.n[w] >= j) {
                                    i3 = i4;
                                    break;
                                }
                                w++;
                                if (w == this.i) {
                                    w = 0;
                                }
                                i4++;
                            } else if (!z) {
                                i3 = -1;
                            }
                        }
                        int i5 = i3;
                        hr9Var2 = this;
                        p = i5;
                        j3 = j;
                    } else {
                        int i6 = i2 - i;
                        hr9Var2 = this;
                        j3 = j;
                        p = hr9Var2.p(w, i6, j3, true);
                    }
                    if (p == -1) {
                        return false;
                    }
                    hr9Var2.t = j3;
                    hr9Var2.s += p;
                    return true;
                }
            } catch (Throwable th4) {
                hr9Var = this;
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            hr9Var = this;
            th = th;
            throw th;
        }
        return false;
    }

    public final synchronized void K(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.p; i++) {
                int w = w(i);
                M(this.q + i, this.m[w], this.n[w]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    public final synchronized void L(int i) {
        boolean z;
        if (i >= 0) {
            if (this.s + i <= this.p) {
                z = true;
                jte.f(z);
                this.s += i;
            }
        }
        z = false;
        jte.f(z);
        this.s += i;
    }

    public final void M(int i, int i2, long j) {
        int i3;
        long j2 = this.u;
        if (j2 == Long.MIN_VALUE || this.x != -1) {
            return;
        }
        if (j < j2) {
            this.y = -1;
            return;
        }
        int i4 = this.y;
        if (i4 == -1) {
            this.y = i;
            i4 = i;
        }
        int i5 = (i - i4) + 1;
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & TLObject.FLAG_29) != 0;
        go4 go4Var = this.E;
        if (go4Var == null || (i3 = go4Var.v) == -1) {
            i3 = 16;
        }
        if (i5 >= i3 + 1 || z || z2) {
            this.x = i4;
            this.y = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        int i4;
        if (this.C) {
            go4 go4Var = this.D;
            go4Var.getClass();
            g(go4Var);
        }
        int i5 = i & 1;
        boolean z = i5 != 0;
        if (this.A) {
            if (!z) {
                return;
            } else {
                this.A = false;
            }
        }
        long j2 = this.I + j;
        if (this.G) {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.H) {
                    ncd.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.E);
                    this.H = true;
                }
                i4 = i | 1;
                if (this.J) {
                    if (!z) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j2 > this.v;
                        } else if (t() >= j2) {
                            r3 = false;
                        } else {
                            n(this.q + i(j2));
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.J = false;
                    }
                }
                h(j2, i4, (this.a.g - i2) - i3, i2, xzbVar);
            }
        }
        i4 = i;
        if (this.J) {
        }
        h(j2, i4, (this.a.g - i2) - i3, i2, xzbVar);
    }

    @Override // yzb
    public final void b(yw7 yw7Var, int i, int i2) {
        while (i > 0) {
            dr9 dr9Var = this.a;
            int c = dr9Var.c(i);
            sz0 sz0Var = dr9Var.f;
            mk mkVar = (mk) sz0Var.c;
            yw7Var.k(((int) (dr9Var.g - sz0Var.a)) + mkVar.b, c, mkVar.a);
            i -= c;
            long j = dr9Var.g + c;
            dr9Var.g = j;
            sz0 sz0Var2 = dr9Var.f;
            if (j == sz0Var2.b) {
                dr9Var.f = (sz0) sz0Var2.d;
            }
        }
    }

    @Override // yzb
    public final int c(s73 s73Var, int i, boolean z) {
        dr9 dr9Var = this.a;
        int c = dr9Var.c(i);
        sz0 sz0Var = dr9Var.f;
        mk mkVar = (mk) sz0Var.c;
        int read = s73Var.read(mkVar.a, ((int) (dr9Var.g - sz0Var.a)) + mkVar.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = dr9Var.g + read;
        dr9Var.g = j;
        sz0 sz0Var2 = dr9Var.f;
        if (j == sz0Var2.b) {
            dr9Var.f = (sz0) sz0Var2.d;
        }
        return read;
    }

    @Override // yzb
    public final /* synthetic */ void e(int i, yw7 yw7Var) {
        mlb.b(this, yw7Var, i);
    }

    @Override // yzb
    public final int f(s73 s73Var, int i, boolean z) {
        return c(s73Var, i, z);
    }

    @Override // yzb
    public final void g(go4 go4Var) {
        go4 q = q(go4Var);
        boolean z = false;
        this.C = false;
        this.D = go4Var;
        synchronized (this) {
            this.B = false;
            if (!Objects.equals(q, this.E)) {
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                    if (((fr9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.c;
                        q = ((fr9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.E = q;
                        boolean z2 = this.G;
                        String str = q.t;
                        this.G = z2 & (wf7.h(str) != 1 && wf7.a(str, q.l));
                        this.H = false;
                        z = true;
                    }
                }
                this.E = q;
                boolean z22 = this.G;
                String str2 = q.t;
                this.G = z22 & (wf7.h(str2) != 1 && wf7.a(str2, q.l));
                this.H = false;
                z = true;
            }
        }
        gr9 gr9Var = this.f;
        if (gr9Var == null || !z) {
            return;
        }
        gr9Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (((fr9) r9.valueAt(r9.size() - 1)).a.equals(r8.E) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j, int i, long j2, int i2, xzb xzbVar) {
        int i3 = this.p;
        if (i3 > 0) {
            int w = w(i3 - 1);
            jte.f(this.k[w] + ((long) this.l[w]) <= j2);
        }
        this.z = (536870912 & i) != 0;
        this.w = Math.max(this.w, j);
        M(z(), i, j);
        int w2 = w(this.p);
        this.n[w2] = j;
        this.k[w2] = j2;
        this.l[w2] = i2;
        this.m[w2] = i;
        this.o[w2] = xzbVar;
        this.j[w2] = this.F;
        if (!(((SparseArray) this.c.c).size() == 0)) {
            SparseArray sparseArray = (SparseArray) this.c.c;
        }
        go4 go4Var = this.E;
        go4Var.getClass();
        is3 is3Var = this.d;
        hs3 g = is3Var != null ? is3Var.g(this.e, go4Var) : hs3.t;
        kq kqVar = this.c;
        int z = z();
        fr9 fr9Var = new fr9(go4Var, g);
        SparseArray sparseArray2 = (SparseArray) kqVar.c;
        if (kqVar.b == -1) {
            jte.p(sparseArray2.size() == 0);
            kqVar.b = 0;
        }
        if (sparseArray2.size() > 0) {
            int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
            jte.f(z >= keyAt);
            if (keyAt == z) {
                ((dq9) kqVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        sparseArray2.append(z, fr9Var);
        int i4 = this.p + 1;
        this.p = i4;
        int i5 = this.i;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            xzb[] xzbVarArr = new xzb[i6];
            int i7 = this.r;
            int i8 = i5 - i7;
            System.arraycopy(this.k, i7, jArr2, 0, i8);
            System.arraycopy(this.n, this.r, jArr3, 0, i8);
            System.arraycopy(this.m, this.r, iArr, 0, i8);
            System.arraycopy(this.l, this.r, iArr2, 0, i8);
            System.arraycopy(this.o, this.r, xzbVarArr, 0, i8);
            System.arraycopy(this.j, this.r, jArr, 0, i8);
            int i9 = this.r;
            System.arraycopy(this.k, 0, jArr2, i8, i9);
            System.arraycopy(this.n, 0, jArr3, i8, i9);
            System.arraycopy(this.m, 0, iArr, i8, i9);
            System.arraycopy(this.l, 0, iArr2, i8, i9);
            System.arraycopy(this.o, 0, xzbVarArr, i8, i9);
            System.arraycopy(this.j, 0, jArr, i8, i9);
            this.k = jArr2;
            this.n = jArr3;
            this.m = iArr;
            this.l = iArr2;
            this.o = xzbVarArr;
            this.j = jArr;
            this.r = 0;
            this.i = i6;
        }
    }

    public final int i(long j) {
        int i = this.p;
        int w = w(i - 1);
        while (i > this.s && this.n[w] >= j) {
            i--;
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return i;
    }

    public final long j(int i) {
        this.v = Math.max(this.v, u(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((dq9) kqVar.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = kqVar.b;
            if (i8 > 0) {
                kqVar.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void k(long j, boolean z) {
        Throwable th;
        hr9 hr9Var;
        long j2;
        dr9 dr9Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    hr9Var = this;
                                    throw th;
                                }
                            }
                            int p = p(i2, i, j, false);
                            if (p != -1) {
                                j2 = j(p);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    hr9Var = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        dr9Var.b(j2);
    }

    public final void l() {
        long j;
        dr9 dr9Var = this.a;
        synchronized (this) {
            int i = this.p;
            j = i == 0 ? -1L : j(i);
        }
        dr9Var.b(j);
    }

    public final void m(long j) {
        if (this.p == 0) {
            return;
        }
        jte.f(j > t());
        o(this.q + i(j));
    }

    public final long n(int i) {
        int z = z() - i;
        boolean z2 = false;
        jte.f(z >= 0 && z <= this.p - this.s);
        int i2 = this.p - z;
        this.p = i2;
        this.w = Math.max(this.v, u(i2));
        if (z == 0 && this.z) {
            z2 = true;
        }
        this.z = z2;
        int i3 = this.x;
        if (i3 != -1 && i < i3) {
            this.x = -1;
        }
        int i4 = this.y;
        if (i4 != -1 && i < i4) {
            this.y = -1;
        }
        kq kqVar = this.c;
        SparseArray sparseArray = (SparseArray) kqVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((dq9) kqVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        kqVar.b = sparseArray.size() > 0 ? Math.min(kqVar.b, sparseArray.size() - 1) : -1;
        int i5 = this.p;
        if (i5 == 0) {
            return 0L;
        }
        return this.k[w(i5 - 1)] + this.l[r9];
    }

    public final void o(int i) {
        sz0 sz0Var;
        dr9 dr9Var = this.a;
        long n = n(i);
        int i2 = dr9Var.b;
        jte.f(n <= dr9Var.g);
        dr9Var.g = n;
        if (n != 0) {
            sz0 sz0Var2 = dr9Var.d;
            if (n != sz0Var2.a) {
                while (true) {
                    long j = dr9Var.g;
                    long j2 = sz0Var2.b;
                    sz0Var = (sz0) sz0Var2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        sz0Var2 = sz0Var;
                    }
                }
                sz0Var.getClass();
                if (((mk) sz0Var.c) != null) {
                    mx6 mx6Var = dr9Var.a;
                    synchronized (mx6Var) {
                        ((xc3) mx6Var.d).c.z(sz0Var);
                        sz0 sz0Var3 = sz0Var;
                        while (sz0Var3 != null) {
                            mk mkVar = (mk) sz0Var3.c;
                            mkVar.getClass();
                            mx6Var.g0(mkVar);
                            sz0Var3 = (sz0) sz0Var3.d;
                            if (sz0Var3 == null || ((mk) sz0Var3.c) == null) {
                                sz0Var3 = null;
                            }
                        }
                    }
                    sz0Var.c = null;
                    sz0Var.d = null;
                }
                sz0 sz0Var4 = new sz0(sz0Var2.b, i2);
                sz0Var2.d = sz0Var4;
                if (dr9Var.g == sz0Var2.b) {
                    sz0Var2 = sz0Var4;
                }
                dr9Var.f = sz0Var2;
                if (dr9Var.e == sz0Var) {
                    dr9Var.e = sz0Var4;
                    return;
                }
                return;
            }
        }
        dr9Var.a(dr9Var.d);
        sz0 sz0Var5 = new sz0(dr9Var.g, i2);
        dr9Var.d = sz0Var5;
        dr9Var.e = sz0Var5;
        dr9Var.f = sz0Var5;
    }

    public final int p(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public go4 q(go4 go4Var) {
        if (this.I == 0 || go4Var.y == Long.MAX_VALUE) {
            return go4Var;
        }
        fo4 a = go4Var.a();
        a.x = go4Var.y + this.I;
        return new go4(a);
    }

    public final synchronized long r() {
        return this.p == 0 ? Long.MIN_VALUE : this.n[this.r];
    }

    public final synchronized long s() {
        return this.w;
    }

    public final synchronized long t() {
        return Math.max(this.v, u(this.s));
    }

    public final long u(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int w = w(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[w]);
            if ((this.m[w] & 1) != 0) {
                return j;
            }
            w--;
            if (w == -1) {
                w = this.i - 1;
            }
        }
        return j;
    }

    public final int v() {
        return this.q + this.s;
    }

    public final int w(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int x(long j, boolean z) {
        try {
            try {
                int w = w(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[w]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int p = p(w, i2 - i, j, true);
                if (p == -1) {
                    return 0;
                }
                return p;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized go4 y() {
        return this.B ? null : this.E;
    }

    public final int z() {
        return this.q + this.p;
    }

    @Override // yzb
    public final void d(long j) {
    }
}
