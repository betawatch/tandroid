// default package

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class gp9 implements wxb {
    public boolean C;
    public fm4 D;
    public fm4 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final cp9 a;
    public final yq3 d;
    public final vq3 e;
    public fp9 f;
    public fm4 g;
    public sq3 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final jd1 b = new jd1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public vxb[] o = new vxb[1000];
    public final kp c = new kp(new ho9((byte) 1));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    public gp9(mv6 mv6Var, yq3 yq3Var, vq3 vq3Var) {
        this.d = yq3Var;
        this.e = vq3Var;
        this.a = new cp9(mv6Var);
    }

    public final synchronized boolean A(boolean z) {
        fm4 fm4Var;
        int v = v();
        int i = this.x;
        boolean z2 = true;
        if (i != -1 && v >= i) {
            return true;
        }
        if (this.s != this.p) {
            if (!(i == -1 && this.y != -1 && v() >= this.y)) {
                if (((ep9) this.c.l(v)).a != this.g) {
                    return true;
                }
                return B(w(this.s));
            }
        }
        if (!z && !this.z && ((fm4Var = this.E) == null || fm4Var == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean B(int i) {
        sq3 sq3Var = this.h;
        if (sq3Var == null || sq3Var.e() == 4) {
            return true;
        }
        return (this.m[i] & TLObject.FLAG_30) == 0 && this.h.b();
    }

    public final void C() {
        sq3 sq3Var = this.h;
        if (sq3Var == null || sq3Var.e() != 1) {
            return;
        }
        rq3 g = this.h.g();
        g.getClass();
        throw g;
    }

    public final void D(fm4 fm4Var, sk4 sk4Var) {
        qq3 qq3Var;
        boolean z;
        fm4 fm4Var2;
        fm4 fm4Var3 = this.g;
        if (fm4Var3 == null) {
            z = true;
            qq3Var = null;
        } else {
            qq3Var = fm4Var3.x;
            z = false;
        }
        this.g = fm4Var;
        qq3 qq3Var2 = fm4Var.x;
        yq3 yq3Var = this.d;
        if (yq3Var != null) {
            int w = yq3Var.w(fm4Var);
            em4 a = fm4Var.a();
            a.W = w;
            fm4Var2 = new fm4(a);
        } else {
            fm4Var2 = fm4Var;
        }
        sk4Var.c = fm4Var2;
        sk4Var.b = this.h;
        if (yq3Var != null) {
            if (z || !Objects.equals(qq3Var, qq3Var2)) {
                sq3 sq3Var = this.h;
                vq3 vq3Var = this.e;
                sq3 d = yq3Var.d(vq3Var, fm4Var);
                this.h = d;
                sk4Var.b = d;
                if (sq3Var != null) {
                    sq3Var.c(vq3Var);
                }
            }
        }
    }

    public final synchronized long E() {
        return this.s != this.p ? this.j[w(this.s)] : this.F;
    }

    public final int F(sk4 sk4Var, z83 z83Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        jd1 jd1Var = this.b;
        synchronized (this) {
            z83Var.d = false;
            int v = v();
            int i3 = this.x;
            boolean z3 = i3 != -1 && v >= i3;
            i2 = -5;
            if (this.s != this.p) {
                if (!(i3 == -1 && this.y != -1 && v() >= this.y) && !z3) {
                    fm4 fm4Var = ((ep9) this.c.l(v)).a;
                    if (z2 || fm4Var != this.g) {
                        D(fm4Var, sk4Var);
                    } else {
                        int w = w(this.s);
                        if (B(w)) {
                            z83Var.setFlags(this.m[w]);
                            if (this.s == this.p - 1 && (z || this.z)) {
                                z83Var.addFlag(TLObject.FLAG_29);
                            }
                            z83Var.e = this.n[w];
                            jd1Var.a = this.l[w];
                            jd1Var.b = this.k[w];
                            jd1Var.c = this.o[w];
                            i2 = -4;
                        } else {
                            z83Var.d = true;
                            i2 = -3;
                        }
                    }
                }
            }
            if (z || this.z || z3) {
                z83Var.setFlags(4);
                z83Var.e = Long.MIN_VALUE;
                i2 = -4;
            } else {
                fm4 fm4Var2 = this.E;
                if (fm4Var2 == null || (!z2 && fm4Var2 == this.g)) {
                    i2 = -3;
                } else {
                    D(fm4Var2, sk4Var);
                }
            }
        }
        if (i2 == -4 && !z83Var.isEndOfStream()) {
            boolean z4 = (i & 1) != 0;
            if ((i & 4) == 0) {
                cp9 cp9Var = this.a;
                jd1 jd1Var2 = this.b;
                if (z4) {
                    cp9.f(cp9Var.e, z83Var, jd1Var2, cp9Var.c);
                } else {
                    cp9Var.e = cp9.f(cp9Var.e, z83Var, jd1Var2, cp9Var.c);
                }
            }
            if (!z4) {
                this.s++;
            }
        }
        return i2;
    }

    public final void G(boolean z) {
        cp9 cp9Var = this.a;
        ly0 ly0Var = cp9Var.d;
        if (((mj) ly0Var.c) != null) {
            mv6 mv6Var = cp9Var.a;
            synchronized (mv6Var) {
                ((lb3) mv6Var.d).c.z(ly0Var);
                ly0 ly0Var2 = ly0Var;
                while (ly0Var2 != null) {
                    mj mjVar = (mj) ly0Var2.c;
                    mjVar.getClass();
                    mv6Var.c0(mjVar);
                    ly0Var2 = (ly0) ly0Var2.d;
                    if (ly0Var2 == null || ((mj) ly0Var2.c) == null) {
                        ly0Var2 = null;
                    }
                }
            }
            ly0Var.c = null;
            ly0Var.d = null;
        }
        ly0 ly0Var3 = cp9Var.d;
        int i = cp9Var.b;
        gre.p(((mj) ly0Var3.c) == null);
        ly0Var3.a = 0L;
        ly0Var3.b = i;
        ly0 ly0Var4 = cp9Var.d;
        cp9Var.e = ly0Var4;
        cp9Var.f = ly0Var4;
        cp9Var.g = 0L;
        cp9Var.a.t0();
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
        kp kpVar = this.c;
        SparseArray sparseArray = (SparseArray) kpVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ho9) kpVar.d).accept(sparseArray.valueAt(i2));
        }
        kpVar.b = -1;
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
        cp9 cp9Var = this.a;
        cp9Var.e = cp9Var.d;
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
        gp9 gp9Var;
        Throwable th;
        int w;
        long j2;
        gp9 gp9Var2;
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
                        gp9Var = this;
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
                        gp9Var2 = this;
                        p = i5;
                        j3 = j;
                    } else {
                        int i6 = i2 - i;
                        gp9Var2 = this;
                        j3 = j;
                        p = gp9Var2.p(w, i6, j3, true);
                    }
                    if (p == -1) {
                        return false;
                    }
                    gp9Var2.t = j3;
                    gp9Var2.s += p;
                    return true;
                }
            } catch (Throwable th4) {
                gp9Var = this;
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            gp9Var = this;
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
                gre.f(z);
                this.s += i;
            }
        }
        z = false;
        gre.f(z);
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
        fm4 fm4Var = this.E;
        if (fm4Var == null || (i3 = fm4Var.v) == -1) {
            i3 = 16;
        }
        if (i5 >= i3 + 1 || z || z2) {
            this.x = i4;
            this.y = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    @Override // wxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        int i4;
        if (this.C) {
            fm4 fm4Var = this.D;
            fm4Var.getClass();
            g(fm4Var);
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
                    lad.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.E);
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
                h(j2, i4, (this.a.g - i2) - i3, i2, vxbVar);
            }
        }
        i4 = i;
        if (this.J) {
        }
        h(j2, i4, (this.a.g - i2) - i3, i2, vxbVar);
    }

    @Override // wxb
    public final void b(xu7 xu7Var, int i, int i2) {
        while (i > 0) {
            cp9 cp9Var = this.a;
            int c = cp9Var.c(i);
            ly0 ly0Var = cp9Var.f;
            mj mjVar = (mj) ly0Var.c;
            xu7Var.k(((int) (cp9Var.g - ly0Var.a)) + mjVar.b, c, mjVar.a);
            i -= c;
            long j = cp9Var.g + c;
            cp9Var.g = j;
            ly0 ly0Var2 = cp9Var.f;
            if (j == ly0Var2.b) {
                cp9Var.f = (ly0) ly0Var2.d;
            }
        }
    }

    @Override // wxb
    public final int c(g63 g63Var, int i, boolean z) {
        cp9 cp9Var = this.a;
        int c = cp9Var.c(i);
        ly0 ly0Var = cp9Var.f;
        mj mjVar = (mj) ly0Var.c;
        int read = g63Var.read(mjVar.a, ((int) (cp9Var.g - ly0Var.a)) + mjVar.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = cp9Var.g + read;
        cp9Var.g = j;
        ly0 ly0Var2 = cp9Var.f;
        if (j == ly0Var2.b) {
            cp9Var.f = (ly0) ly0Var2.d;
        }
        return read;
    }

    @Override // wxb
    public final /* synthetic */ void e(int i, xu7 xu7Var) {
        yjb.b(this, xu7Var, i);
    }

    @Override // wxb
    public final int f(g63 g63Var, int i, boolean z) {
        return c(g63Var, i, z);
    }

    @Override // wxb
    public final void g(fm4 fm4Var) {
        fm4 q = q(fm4Var);
        boolean z = false;
        this.C = false;
        this.D = fm4Var;
        synchronized (this) {
            this.B = false;
            if (!Objects.equals(q, this.E)) {
                if (!(((SparseArray) this.c.c).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.c.c;
                    if (((ep9) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(q)) {
                        SparseArray sparseArray2 = (SparseArray) this.c.c;
                        q = ((ep9) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        this.E = q;
                        boolean z2 = this.G;
                        String str = q.t;
                        this.G = z2 & (ud7.h(str) != 1 && ud7.a(str, q.l));
                        this.H = false;
                        z = true;
                    }
                }
                this.E = q;
                boolean z22 = this.G;
                String str2 = q.t;
                this.G = z22 & (ud7.h(str2) != 1 && ud7.a(str2, q.l));
                this.H = false;
                z = true;
            }
        }
        fp9 fp9Var = this.f;
        if (fp9Var == null || !z) {
            return;
        }
        fp9Var.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (((ep9) r9.valueAt(r9.size() - 1)).a.equals(r8.E) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(long j, int i, long j2, int i2, vxb vxbVar) {
        int i3 = this.p;
        if (i3 > 0) {
            int w = w(i3 - 1);
            gre.f(this.k[w] + ((long) this.l[w]) <= j2);
        }
        this.z = (536870912 & i) != 0;
        this.w = Math.max(this.w, j);
        M(z(), i, j);
        int w2 = w(this.p);
        this.n[w2] = j;
        this.k[w2] = j2;
        this.l[w2] = i2;
        this.m[w2] = i;
        this.o[w2] = vxbVar;
        this.j[w2] = this.F;
        if (!(((SparseArray) this.c.c).size() == 0)) {
            SparseArray sparseArray = (SparseArray) this.c.c;
        }
        fm4 fm4Var = this.E;
        fm4Var.getClass();
        yq3 yq3Var = this.d;
        xq3 f = yq3Var != null ? yq3Var.f(this.e, fm4Var) : xq3.t;
        kp kpVar = this.c;
        int z = z();
        ep9 ep9Var = new ep9(fm4Var, f);
        SparseArray sparseArray2 = (SparseArray) kpVar.c;
        if (kpVar.b == -1) {
            gre.p(sparseArray2.size() == 0);
            kpVar.b = 0;
        }
        if (sparseArray2.size() > 0) {
            int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
            gre.f(z >= keyAt);
            if (keyAt == z) {
                ((ho9) kpVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        sparseArray2.append(z, ep9Var);
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
            vxb[] vxbVarArr = new vxb[i6];
            int i7 = this.r;
            int i8 = i5 - i7;
            System.arraycopy(this.k, i7, jArr2, 0, i8);
            System.arraycopy(this.n, this.r, jArr3, 0, i8);
            System.arraycopy(this.m, this.r, iArr, 0, i8);
            System.arraycopy(this.l, this.r, iArr2, 0, i8);
            System.arraycopy(this.o, this.r, vxbVarArr, 0, i8);
            System.arraycopy(this.j, this.r, jArr, 0, i8);
            int i9 = this.r;
            System.arraycopy(this.k, 0, jArr2, i8, i9);
            System.arraycopy(this.n, 0, jArr3, i8, i9);
            System.arraycopy(this.m, 0, iArr, i8, i9);
            System.arraycopy(this.l, 0, iArr2, i8, i9);
            System.arraycopy(this.o, 0, vxbVarArr, i8, i9);
            System.arraycopy(this.j, 0, jArr, i8, i9);
            this.k = jArr2;
            this.n = jArr3;
            this.m = iArr;
            this.l = iArr2;
            this.o = vxbVarArr;
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
        kp kpVar = this.c;
        SparseArray sparseArray = (SparseArray) kpVar.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((ho9) kpVar.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = kpVar.b;
            if (i8 > 0) {
                kpVar.b = i8 - 1;
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
        gp9 gp9Var;
        long j2;
        cp9 cp9Var = this.a;
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
                                    gp9Var = this;
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
                    gp9Var = this;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        cp9Var.b(j2);
    }

    public final void l() {
        long j;
        cp9 cp9Var = this.a;
        synchronized (this) {
            int i = this.p;
            j = i == 0 ? -1L : j(i);
        }
        cp9Var.b(j);
    }

    public final void m(long j) {
        if (this.p == 0) {
            return;
        }
        gre.f(j > t());
        o(this.q + i(j));
    }

    public final long n(int i) {
        int z = z() - i;
        boolean z2 = false;
        gre.f(z >= 0 && z <= this.p - this.s);
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
        kp kpVar = this.c;
        SparseArray sparseArray = (SparseArray) kpVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((ho9) kpVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        kpVar.b = sparseArray.size() > 0 ? Math.min(kpVar.b, sparseArray.size() - 1) : -1;
        int i5 = this.p;
        if (i5 == 0) {
            return 0L;
        }
        return this.k[w(i5 - 1)] + this.l[r9];
    }

    public final void o(int i) {
        ly0 ly0Var;
        cp9 cp9Var = this.a;
        long n = n(i);
        int i2 = cp9Var.b;
        gre.f(n <= cp9Var.g);
        cp9Var.g = n;
        if (n != 0) {
            ly0 ly0Var2 = cp9Var.d;
            if (n != ly0Var2.a) {
                while (true) {
                    long j = cp9Var.g;
                    long j2 = ly0Var2.b;
                    ly0Var = (ly0) ly0Var2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        ly0Var2 = ly0Var;
                    }
                }
                ly0Var.getClass();
                if (((mj) ly0Var.c) != null) {
                    mv6 mv6Var = cp9Var.a;
                    synchronized (mv6Var) {
                        ((lb3) mv6Var.d).c.z(ly0Var);
                        ly0 ly0Var3 = ly0Var;
                        while (ly0Var3 != null) {
                            mj mjVar = (mj) ly0Var3.c;
                            mjVar.getClass();
                            mv6Var.c0(mjVar);
                            ly0Var3 = (ly0) ly0Var3.d;
                            if (ly0Var3 == null || ((mj) ly0Var3.c) == null) {
                                ly0Var3 = null;
                            }
                        }
                    }
                    ly0Var.c = null;
                    ly0Var.d = null;
                }
                ly0 ly0Var4 = new ly0(ly0Var2.b, i2);
                ly0Var2.d = ly0Var4;
                if (cp9Var.g == ly0Var2.b) {
                    ly0Var2 = ly0Var4;
                }
                cp9Var.f = ly0Var2;
                if (cp9Var.e == ly0Var) {
                    cp9Var.e = ly0Var4;
                    return;
                }
                return;
            }
        }
        cp9Var.a(cp9Var.d);
        ly0 ly0Var5 = new ly0(cp9Var.g, i2);
        cp9Var.d = ly0Var5;
        cp9Var.e = ly0Var5;
        cp9Var.f = ly0Var5;
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

    public fm4 q(fm4 fm4Var) {
        if (this.I == 0 || fm4Var.y == Long.MAX_VALUE) {
            return fm4Var;
        }
        em4 a = fm4Var.a();
        a.x = fm4Var.y + this.I;
        return new fm4(a);
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

    public final synchronized fm4 y() {
        return this.B ? null : this.E;
    }

    public final int z() {
        return this.q + this.p;
    }

    @Override // wxb
    public final void d(long j) {
    }
}
