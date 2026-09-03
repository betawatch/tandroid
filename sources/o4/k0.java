package o4;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class k0 implements r3.v {
    public j3.n0 A;
    public j3.n0 B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final g0 a;
    public final o3.o d;
    public final o3.l e;
    public Object f;
    public j3.n0 g;
    public o3.i h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final h0 b = new h0();
    public int i = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public long[] j = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] k = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] n = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] m = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] l = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public r3.u[] o = new r3.u[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public final b4.e0 c = new b4.e0(new ag.d(2));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public k0(g5.q qVar, o3.o oVar, o3.l lVar) {
        this.d = oVar;
        this.e = lVar;
        this.a = new g0(qVar);
    }

    public final void A(boolean z4) {
        g0 g0Var = this.a;
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar = (a4.c) g0Var.e;
        int i10 = g0Var.a;
        h5.a.i(((g5.a) cVar.c) == null);
        cVar.a = 0L;
        cVar.b = i10;
        a4.c cVar2 = (a4.c) g0Var.e;
        g0Var.f = cVar2;
        g0Var.g = cVar2;
        g0Var.b = 0L;
        ((g5.q) g0Var.c).b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        b4.e0 e0Var = this.c;
        SparseArray sparseArray = (SparseArray) e0Var.c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((ag.d) e0Var.d).accept(sparseArray.valueAt(i11));
        }
        e0Var.b = -1;
        sparseArray.clear();
        if (z4) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized void B() {
        this.s = 0;
        g0 g0Var = this.a;
        g0Var.f = (a4.c) g0Var.e;
    }

    public final int C(g5.j jVar, int i10, boolean z4) {
        g0 g0Var = this.a;
        int c3 = g0Var.c(i10);
        a4.c cVar = (a4.c) g0Var.g;
        g5.a aVar = (g5.a) cVar.c;
        int read = jVar.read(aVar.a, ((int) (g0Var.b - cVar.a)) + aVar.b, c3);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = g0Var.b + read;
        g0Var.b = j10;
        a4.c cVar2 = (a4.c) g0Var.g;
        if (j10 == cVar2.b) {
            g0Var.g = (a4.c) cVar2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z4) {
        try {
            try {
                B();
                int r10 = r(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if ((i10 != i11) && j10 >= this.n[r10]) {
                    if (j10 <= this.v || z4) {
                        int l10 = l(j10, r10, i11 - i10, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.t = j10;
                        this.s += l10;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void E(int i10) {
        boolean z4;
        if (i10 >= 0) {
            try {
                if (this.s + i10 <= this.p) {
                    z4 = true;
                    h5.a.f(z4);
                    this.s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z4 = false;
        h5.a.f(z4);
        this.s += i10;
    }

    @Override // r3.v
    public final void a(int i10, h5.w wVar) {
        while (true) {
            g0 g0Var = this.a;
            if (i10 <= 0) {
                g0Var.getClass();
                return;
            }
            int c3 = g0Var.c(i10);
            a4.c cVar = (a4.c) g0Var.g;
            g5.a aVar = (g5.a) cVar.c;
            wVar.e(((int) (g0Var.b - cVar.a)) + aVar.b, c3, aVar.a);
            i10 -= c3;
            long j10 = g0Var.b + c3;
            g0Var.b = j10;
            a4.c cVar2 = (a4.c) g0Var.g;
            if (j10 == cVar2.b) {
                g0Var.g = (a4.c) cVar2.d;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010e, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, o4.j0] */
    @Override // r3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j3.n0 n0Var) {
        String str;
        boolean z4;
        j3.n0 m9 = m(n0Var);
        boolean z10 = false;
        this.z = false;
        this.A = n0Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!h5.d0.a(m9, this.B)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((i0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m9)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.B = ((i0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            j3.n0 n0Var2 = this.B;
                            str = n0Var2.C;
                            String str2 = n0Var2.r;
                            ArrayList arrayList = h5.o.a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        z4 = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null) {
                                            c5.e e6 = h5.o.e(str2);
                                            if (e6 == null) {
                                                break;
                                            } else {
                                                int a2 = e6.a();
                                                if (a2 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                this.D = z4;
                                this.E = false;
                                z10 = true;
                            }
                            z4 = false;
                            this.D = z4;
                            this.E = false;
                            z10 = true;
                        }
                    }
                    this.B = m9;
                    j3.n0 n0Var22 = this.B;
                    str = n0Var22.C;
                    String str22 = n0Var22.r;
                    ArrayList arrayList2 = h5.o.a;
                    if (str != null) {
                    }
                    z4 = false;
                    this.D = z4;
                    this.E = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r62 = this.f;
        if (r62 == 0 || !z10) {
            return;
        }
        r62.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // r3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j10, int i10, int i11, int i12, r3.u uVar) {
        int i13;
        if (this.z) {
            j3.n0 n0Var = this.A;
            h5.a.j(n0Var);
            b(n0Var);
        }
        int i14 = i10 & 1;
        boolean z4 = i14 != 0;
        if (this.x) {
            if (!z4) {
                return;
            } else {
                this.x = false;
            }
        }
        long j11 = this.F + j10;
        if (this.D) {
            if (j11 < this.t) {
                return;
            }
            if (i14 == 0) {
                if (!this.E) {
                    h5.a.K("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
                if (this.G) {
                    if (!z4) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j11 > this.u;
                        } else if (o() >= j11) {
                            r3 = false;
                        } else {
                            int i15 = this.p;
                            int r10 = r(i15 - 1);
                            while (i15 > this.s && this.n[r10] >= j11) {
                                i15--;
                                r10--;
                                if (r10 == -1) {
                                    r10 = this.i - 1;
                                }
                            }
                            j(this.q + i15);
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.G = false;
                    }
                }
                f(j11, i13, (this.a.b - i11) - i12, i11, uVar);
            }
        }
        i13 = i10;
        if (this.G) {
        }
        f(j11, i13, (this.a.b - i11) - i12, i11, uVar);
    }

    @Override // r3.v
    public final void d(int i10, h5.w wVar) {
        a(i10, wVar);
    }

    @Override // r3.v
    public final int e(g5.j jVar, int i10, boolean z4) {
        return C(jVar, i10, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((o4.i0) r9.valueAt(r9.size() - 1)).a.equals(r8.B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(long j10, int i10, long j11, int i11, r3.u uVar) {
        try {
            int i12 = this.p;
            if (i12 > 0) {
                int r10 = r(i12 - 1);
                h5.a.f(this.k[r10] + ((long) this.l[r10]) <= j11);
            }
            this.w = (536870912 & i10) != 0;
            this.v = Math.max(this.v, j10);
            int r11 = r(this.p);
            this.n[r11] = j10;
            this.k[r11] = j11;
            this.l[r11] = i11;
            this.m[r11] = i10;
            this.o[r11] = uVar;
            this.j[r11] = this.C;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            o3.o oVar = this.d;
            o3.n c3 = oVar != null ? oVar.c(this.e, this.B) : o3.n.j;
            b4.e0 e0Var = this.c;
            int i13 = this.q + this.p;
            j3.n0 n0Var = this.B;
            n0Var.getClass();
            i0 i0Var = new i0(n0Var, c3);
            SparseArray sparseArray2 = (SparseArray) e0Var.c;
            if (e0Var.b == -1) {
                h5.a.i(sparseArray2.size() == 0);
                e0Var.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                h5.a.f(i13 >= keyAt);
                if (keyAt == i13) {
                    ((ag.d) e0Var.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i13, i0Var);
            int i14 = this.p + 1;
            this.p = i14;
            int i15 = this.i;
            if (i14 == i15) {
                int i16 = i15 + MediaDataController.MAX_STYLE_RUNS_COUNT;
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                long[] jArr3 = new long[i16];
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                r3.u[] uVarArr = new r3.u[i16];
                int i17 = this.r;
                int i18 = i15 - i17;
                System.arraycopy(this.k, i17, jArr2, 0, i18);
                System.arraycopy(this.n, this.r, jArr3, 0, i18);
                System.arraycopy(this.m, this.r, iArr, 0, i18);
                System.arraycopy(this.l, this.r, iArr2, 0, i18);
                System.arraycopy(this.o, this.r, uVarArr, 0, i18);
                System.arraycopy(this.j, this.r, jArr, 0, i18);
                int i19 = this.r;
                System.arraycopy(this.k, 0, jArr2, i18, i19);
                System.arraycopy(this.n, 0, jArr3, i18, i19);
                System.arraycopy(this.m, 0, iArr, i18, i19);
                System.arraycopy(this.l, 0, iArr2, i18, i19);
                System.arraycopy(this.o, 0, uVarArr, i18, i19);
                System.arraycopy(this.j, 0, jArr, i18, i19);
                this.k = jArr2;
                this.n = jArr3;
                this.m = iArr;
                this.l = iArr2;
                this.o = uVarArr;
                this.j = jArr;
                this.r = 0;
                this.i = i16;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final long g(int i10) {
        this.u = Math.max(this.u, p(i10));
        this.p -= i10;
        int i11 = this.q + i10;
        this.q = i11;
        int i12 = this.r + i10;
        this.r = i12;
        int i13 = this.i;
        if (i12 >= i13) {
            this.r = i12 - i13;
        }
        int i14 = this.s - i10;
        this.s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.s = 0;
        }
        b4.e0 e0Var = this.c;
        SparseArray sparseArray = (SparseArray) e0Var.c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((ag.d) e0Var.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = e0Var.b;
            if (i17 > 0) {
                e0Var.b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i18 = this.r;
        if (i18 == 0) {
            i18 = this.i;
        }
        return this.k[i18 - 1] + this.l[r7];
    }

    public final void h(long j10, boolean z4) {
        Throwable th2;
        g0 g0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.n;
                        int i11 = this.r;
                        if (j10 >= jArr[i11]) {
                            if (z4) {
                                try {
                                    int i12 = this.s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int l10 = l(j10, i11, i10, false);
                            if (l10 != -1) {
                                j11 = g(l10);
                            }
                            g0Var.b(j11);
                        }
                    }
                    g0Var.b(j11);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void i() {
        long g10;
        g0 g0Var = this.a;
        synchronized (this) {
            int i10 = this.p;
            g10 = i10 == 0 ? -1L : g(i10);
        }
        g0Var.b(g10);
    }

    public final long j(int i10) {
        int i11 = this.q;
        int i12 = this.p;
        int i13 = (i11 + i12) - i10;
        boolean z4 = false;
        h5.a.f(i13 >= 0 && i13 <= i12 - this.s);
        int i14 = this.p - i13;
        this.p = i14;
        this.v = Math.max(this.u, p(i14));
        if (i13 == 0 && this.w) {
            z4 = true;
        }
        this.w = z4;
        b4.e0 e0Var = this.c;
        SparseArray sparseArray = (SparseArray) e0Var.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((ag.d) e0Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        e0Var.b = sparseArray.size() > 0 ? Math.min(e0Var.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[r(i15 - 1)] + this.l[r9];
    }

    public final void k(int i10) {
        long j10 = j(i10);
        g0 g0Var = this.a;
        int i11 = g0Var.a;
        h5.a.f(j10 <= g0Var.b);
        g0Var.b = j10;
        if (j10 != 0) {
            a4.c cVar = (a4.c) g0Var.e;
            if (j10 != cVar.a) {
                while (g0Var.b > cVar.b) {
                    cVar = (a4.c) cVar.d;
                }
                a4.c cVar2 = (a4.c) cVar.d;
                cVar2.getClass();
                g0Var.a(cVar2);
                a4.c cVar3 = new a4.c(cVar.b, i11);
                cVar.d = cVar3;
                if (g0Var.b == cVar.b) {
                    cVar = cVar3;
                }
                g0Var.g = cVar;
                if (((a4.c) g0Var.f) == cVar2) {
                    g0Var.f = cVar3;
                    return;
                }
                return;
            }
        }
        g0Var.a((a4.c) g0Var.e);
        a4.c cVar4 = new a4.c(g0Var.b, i11);
        g0Var.e = cVar4;
        g0Var.f = cVar4;
        g0Var.g = cVar4;
    }

    public final int l(long j10, int i10, int i11, boolean z4) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z4 || (this.m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public j3.n0 m(j3.n0 n0Var) {
        if (this.F == 0 || n0Var.G == Long.MAX_VALUE) {
            return n0Var;
        }
        j3.m0 a2 = n0Var.a();
        a2.s = n0Var.G + this.F;
        return new j3.n0(a2);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int r10 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.n[r10]);
            if ((this.m[r10] & 1) != 0) {
                return j10;
            }
            r10--;
            if (r10 == -1) {
                r10 = this.i - 1;
            }
        }
        return j10;
    }

    public final int q() {
        return this.q + this.s;
    }

    public final int r(int i10) {
        int i11 = this.r + i10;
        int i12 = this.i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int s(long j10, boolean z4) {
        try {
            try {
                int r10 = r(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j10 < this.n[r10]) {
                    return 0;
                }
                if (j10 > this.v && z4) {
                    return i11 - i10;
                }
                int l10 = l(j10, r10, i11 - i10, true);
                if (l10 == -1) {
                    return 0;
                }
                return l10;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized j3.n0 t() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean u(boolean z4) {
        j3.n0 n0Var;
        boolean z10 = false;
        if (this.s != this.p) {
            if (((i0) this.c.k(q())).a != this.g) {
                return true;
            }
            return v(r(this.s));
        }
        if (z4 || this.w || ((n0Var = this.B) != null && n0Var != this.g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean v(int i10) {
        o3.i iVar = this.h;
        if (iVar == null || iVar.e() == 4) {
            return true;
        }
        return (this.m[i10] & TLObject.FLAG_30) == 0 && this.h.b();
    }

    public final void w() {
        o3.i iVar = this.h;
        if (iVar == null || iVar.e() != 1) {
            return;
        }
        o3.h g10 = this.h.g();
        g10.getClass();
        throw g10;
    }

    public final void x(j3.n0 n0Var, f7.b bVar) {
        j3.n0 n0Var2;
        j3.n0 n0Var3 = this.g;
        boolean z4 = n0Var3 == null;
        o3.g gVar = z4 ? null : n0Var3.F;
        this.g = n0Var;
        o3.g gVar2 = n0Var.F;
        o3.o oVar = this.d;
        if (oVar != null) {
            int b10 = oVar.b(n0Var);
            j3.m0 a2 = n0Var.a();
            a2.J = b10;
            n0Var2 = new j3.n0(a2);
        } else {
            n0Var2 = n0Var;
        }
        bVar.c = n0Var2;
        bVar.b = this.h;
        if (oVar == null) {
            return;
        }
        if (z4 || !h5.d0.a(gVar, gVar2)) {
            o3.i iVar = this.h;
            o3.l lVar = this.e;
            o3.i x10 = oVar.x(lVar, n0Var);
            this.h = x10;
            bVar.b = x10;
            if (iVar != null) {
                iVar.c(lVar);
            }
        }
    }

    public final synchronized long y() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.s != this.p ? this.j[r(this.s)] : this.C;
    }

    public final int z(f7.b bVar, n3.i iVar, int i10, boolean z4) {
        int i11;
        boolean z10 = (i10 & 2) != 0;
        h0 h0Var = this.b;
        synchronized (this) {
            try {
                iVar.e = false;
                i11 = -3;
                if (this.s != this.p) {
                    j3.n0 n0Var = ((i0) this.c.k(q())).a;
                    if (!z10 && n0Var == this.g) {
                        int r10 = r(this.s);
                        if (v(r10)) {
                            iVar.b = this.m[r10];
                            if (this.s == this.p - 1 && (z4 || this.w)) {
                                iVar.a(TLObject.FLAG_29);
                            }
                            long j10 = this.n[r10];
                            iVar.f = j10;
                            if (j10 < this.t) {
                                iVar.a(TLObject.FLAG_31);
                            }
                            h0Var.a = this.l[r10];
                            h0Var.b = this.k[r10];
                            h0Var.c = this.o[r10];
                            i11 = -4;
                        } else {
                            iVar.e = true;
                        }
                    }
                    x(n0Var, bVar);
                    i11 = -5;
                } else {
                    if (!z4 && !this.w) {
                        j3.n0 n0Var2 = this.B;
                        if (n0Var2 == null || (!z10 && n0Var2 == this.g)) {
                        }
                        x(n0Var2, bVar);
                        i11 = -5;
                    }
                    iVar.b = 4;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !iVar.e(4)) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    g0 g0Var = this.a;
                    g0.f((a4.c) g0Var.f, iVar, this.b, (h5.w) g0Var.d);
                } else {
                    g0 g0Var2 = this.a;
                    g0Var2.f = g0.f((a4.c) g0Var2.f, iVar, this.b, (h5.w) g0Var2.d);
                }
            }
            if (!z11) {
                this.s++;
            }
        }
        return i11;
    }
}
