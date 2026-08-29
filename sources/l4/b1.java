package l4;

import ag.j2;
import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class b1 implements o3.w {
    public j3.t0 A;
    public j3.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final w0 a;
    public final n3.i d;
    public final j2 e;
    public Object f;
    public j3.t0 g;
    public n3.e h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final y0 b = new y0();
    public int i = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public int[] j = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] k = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] n = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] m = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] l = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public o3.v[] o = new o3.v[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public final j2 c = new j2(new x0(0));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public b1(com.google.android.exoplayer2.upstream.r rVar, n3.i iVar, j2 j2Var) {
        this.d = iVar;
        this.e = j2Var;
        this.a = new w0(rVar);
    }

    public final void A(boolean z10) {
        w0 w0Var = this.a;
        w0Var.a((v0) w0Var.e);
        v0 v0Var = (v0) w0Var.e;
        int i10 = w0Var.a;
        f5.a.i(((com.google.android.exoplayer2.upstream.a) v0Var.c) == null);
        v0Var.a = 0L;
        v0Var.b = i10;
        v0 v0Var2 = (v0) w0Var.e;
        w0Var.f = v0Var2;
        w0Var.g = v0Var2;
        w0Var.b = 0L;
        ((com.google.android.exoplayer2.upstream.r) w0Var.c).b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        j2 j2Var = this.c;
        SparseArray sparseArray = (SparseArray) j2Var.c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((x0) j2Var.d).accept(sparseArray.valueAt(i11));
        }
        j2Var.b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized void B() {
        this.s = 0;
        w0 w0Var = this.a;
        w0Var.f = (v0) w0Var.e;
    }

    public final int C(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        w0 w0Var = this.a;
        int c3 = w0Var.c(i10);
        v0 v0Var = (v0) w0Var.g;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
        int read = jVar.read(aVar.a, ((int) (w0Var.b - v0Var.a)) + aVar.b, c3);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = w0Var.b + read;
        w0Var.b = j10;
        v0 v0Var2 = (v0) w0Var.g;
        if (j10 == v0Var2.b) {
            w0Var.g = (v0) v0Var2.d;
        }
        return read;
    }

    public final synchronized boolean D(long j10, boolean z10) {
        try {
            try {
                B();
                int r6 = r(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if ((i10 != i11) && j10 >= this.n[r6]) {
                    if (j10 <= this.v || z10) {
                        int l10 = l(j10, r6, i11 - i10, true);
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
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.s + i10 <= this.p) {
                    z10 = true;
                    f5.a.f(z10);
                    this.s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        f5.a.f(z10);
        this.s += i10;
    }

    @Override // o3.w
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        return C(jVar, i10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010e, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, l4.a1] */
    @Override // o3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j3.t0 t0Var) {
        String str;
        boolean z10;
        j3.t0 m10 = m(t0Var);
        boolean z11 = false;
        this.z = false;
        this.A = t0Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!f5.d0.a(m10, this.B)) {
                    if (!(((SparseArray) this.c.c).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((z0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m10)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.B = ((z0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            j3.t0 t0Var2 = this.B;
                            str = t0Var2.B;
                            String str2 = t0Var2.r;
                            ArrayList arrayList = f5.o.a;
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
                                        z10 = true;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null) {
                                            a5.e e10 = f5.o.e(str2);
                                            if (e10 == null) {
                                                break;
                                            } else {
                                                int a2 = e10.a();
                                                if (a2 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                                this.D = z10;
                                this.E = false;
                                z11 = true;
                            }
                            z10 = false;
                            this.D = z10;
                            this.E = false;
                            z11 = true;
                        }
                    }
                    this.B = m10;
                    j3.t0 t0Var22 = this.B;
                    str = t0Var22.B;
                    String str22 = t0Var22.r;
                    ArrayList arrayList2 = f5.o.a;
                    if (str != null) {
                    }
                    z10 = false;
                    this.D = z10;
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r6 = this.f;
        if (r6 == 0 || !z11) {
            return;
        }
        r6.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // o3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(long j10, int i10, int i11, int i12, o3.v vVar) {
        int i13;
        if (this.z) {
            j3.t0 t0Var = this.A;
            f5.a.j(t0Var);
            b(t0Var);
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.x) {
            if (!z10) {
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
                    f5.a.K("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i13 = i10 | 1;
                if (this.G) {
                    if (!z10) {
                        return;
                    }
                    synchronized (this) {
                        if (this.p == 0) {
                            r3 = j11 > this.u;
                        } else if (o() >= j11) {
                            r3 = false;
                        } else {
                            int i15 = this.p;
                            int r6 = r(i15 - 1);
                            while (i15 > this.s && this.n[r6] >= j11) {
                                i15--;
                                r6--;
                                if (r6 == -1) {
                                    r6 = this.i - 1;
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
                f(j11, i13, (this.a.b - i11) - i12, i11, vVar);
            }
        }
        i13 = i10;
        if (this.G) {
        }
        f(j11, i13, (this.a.b - i11) - i12, i11, vVar);
    }

    @Override // o3.w
    public final void d(int i10, f5.w wVar) {
        while (true) {
            w0 w0Var = this.a;
            if (i10 <= 0) {
                w0Var.getClass();
                return;
            }
            int c3 = w0Var.c(i10);
            v0 v0Var = (v0) w0Var.g;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
            wVar.c(((int) (w0Var.b - v0Var.a)) + aVar.b, c3, aVar.a);
            i10 -= c3;
            long j10 = w0Var.b + c3;
            w0Var.b = j10;
            v0 v0Var2 = (v0) w0Var.g;
            if (j10 == v0Var2.b) {
                w0Var.g = (v0) v0Var2.d;
            }
        }
    }

    @Override // o3.w
    public final void e(int i10, f5.w wVar) {
        d(i10, wVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((l4.z0) r9.valueAt(r9.size() - 1)).a.equals(r8.B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(long j10, int i10, long j11, int i11, o3.v vVar) {
        try {
            int i12 = this.p;
            if (i12 > 0) {
                int r6 = r(i12 - 1);
                f5.a.f(this.k[r6] + ((long) this.l[r6]) <= j11);
            }
            this.w = (536870912 & i10) != 0;
            this.v = Math.max(this.v, j10);
            int r9 = r(this.p);
            this.n[r9] = j10;
            this.k[r9] = j11;
            this.l[r9] = i11;
            this.m[r9] = i10;
            this.o[r9] = vVar;
            this.j[r9] = this.C;
            if (!(((SparseArray) this.c.c).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.c;
            }
            n3.i iVar = this.d;
            n3.h m10 = iVar != null ? iVar.m(this.e, this.B) : n3.h.a;
            j2 j2Var = this.c;
            int i13 = this.q + this.p;
            j3.t0 t0Var = this.B;
            t0Var.getClass();
            z0 z0Var = new z0(t0Var, m10);
            SparseArray sparseArray2 = (SparseArray) j2Var.c;
            if (j2Var.b == -1) {
                f5.a.i(sparseArray2.size() == 0);
                j2Var.b = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                f5.a.f(i13 >= keyAt);
                if (keyAt == i13) {
                    ((x0) j2Var.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i13, z0Var);
            int i14 = this.p + 1;
            this.p = i14;
            int i15 = this.i;
            if (i14 == i15) {
                int i16 = i15 + MediaDataController.MAX_STYLE_RUNS_COUNT;
                int[] iArr = new int[i16];
                long[] jArr = new long[i16];
                long[] jArr2 = new long[i16];
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                o3.v[] vVarArr = new o3.v[i16];
                int i17 = this.r;
                int i18 = i15 - i17;
                System.arraycopy(this.k, i17, jArr, 0, i18);
                System.arraycopy(this.n, this.r, jArr2, 0, i18);
                System.arraycopy(this.m, this.r, iArr2, 0, i18);
                System.arraycopy(this.l, this.r, iArr3, 0, i18);
                System.arraycopy(this.o, this.r, vVarArr, 0, i18);
                System.arraycopy(this.j, this.r, iArr, 0, i18);
                int i19 = this.r;
                System.arraycopy(this.k, 0, jArr, i18, i19);
                System.arraycopy(this.n, 0, jArr2, i18, i19);
                System.arraycopy(this.m, 0, iArr2, i18, i19);
                System.arraycopy(this.l, 0, iArr3, i18, i19);
                System.arraycopy(this.o, 0, vVarArr, i18, i19);
                System.arraycopy(this.j, 0, iArr, i18, i19);
                this.k = jArr;
                this.n = jArr2;
                this.m = iArr2;
                this.l = iArr3;
                this.o = vVarArr;
                this.j = iArr;
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
        j2 j2Var = this.c;
        SparseArray sparseArray = (SparseArray) j2Var.c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((x0) j2Var.d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = j2Var.b;
            if (i17 > 0) {
                j2Var.b = i17 - 1;
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

    public final void h(long j10, boolean z10) {
        Throwable th2;
        w0 w0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.p;
                    long j11 = -1;
                    if (i10 != 0) {
                        long[] jArr = this.n;
                        int i11 = this.r;
                        if (j10 >= jArr[i11]) {
                            if (z10) {
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
                            w0Var.b(j11);
                        }
                    }
                    w0Var.b(j11);
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
        w0 w0Var = this.a;
        synchronized (this) {
            int i10 = this.p;
            g10 = i10 == 0 ? -1L : g(i10);
        }
        w0Var.b(g10);
    }

    public final long j(int i10) {
        int i11 = this.q;
        int i12 = this.p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        f5.a.f(i13 >= 0 && i13 <= i12 - this.s);
        int i14 = this.p - i13;
        this.p = i14;
        this.v = Math.max(this.u, p(i14));
        if (i13 == 0 && this.w) {
            z10 = true;
        }
        this.w = z10;
        j2 j2Var = this.c;
        SparseArray sparseArray = (SparseArray) j2Var.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((x0) j2Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        j2Var.b = sparseArray.size() > 0 ? Math.min(j2Var.b, sparseArray.size() - 1) : -1;
        int i15 = this.p;
        if (i15 == 0) {
            return 0L;
        }
        return this.k[r(i15 - 1)] + this.l[r9];
    }

    public final void k(int i10) {
        long j10 = j(i10);
        w0 w0Var = this.a;
        int i11 = w0Var.a;
        f5.a.f(j10 <= w0Var.b);
        w0Var.b = j10;
        if (j10 != 0) {
            v0 v0Var = (v0) w0Var.e;
            if (j10 != v0Var.a) {
                while (w0Var.b > v0Var.b) {
                    v0Var = (v0) v0Var.d;
                }
                v0 v0Var2 = (v0) v0Var.d;
                v0Var2.getClass();
                w0Var.a(v0Var2);
                v0 v0Var3 = new v0(v0Var.b, i11);
                v0Var.d = v0Var3;
                if (w0Var.b == v0Var.b) {
                    v0Var = v0Var3;
                }
                w0Var.g = v0Var;
                if (((v0) w0Var.f) == v0Var2) {
                    w0Var.f = v0Var3;
                    return;
                }
                return;
            }
        }
        w0Var.a((v0) w0Var.e);
        v0 v0Var4 = new v0(w0Var.b, i11);
        w0Var.e = v0Var4;
        w0Var.f = v0Var4;
        w0Var.g = v0Var4;
    }

    public final int l(long j10, int i10, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.m[i10] & 1) != 0) {
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

    public j3.t0 m(j3.t0 t0Var) {
        if (this.F == 0 || t0Var.F == Long.MAX_VALUE) {
            return t0Var;
        }
        j3.s0 a2 = t0Var.a();
        a2.s = t0Var.F + this.F;
        return new j3.t0(a2);
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
        int r6 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.n[r6]);
            if ((this.m[r6] & 1) != 0) {
                return j10;
            }
            r6--;
            if (r6 == -1) {
                r6 = this.i - 1;
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

    public final synchronized int s(long j10, boolean z10) {
        try {
            try {
                int r6 = r(this.s);
                int i10 = this.s;
                int i11 = this.p;
                if (!(i10 != i11) || j10 < this.n[r6]) {
                    return 0;
                }
                if (j10 > this.v && z10) {
                    return i11 - i10;
                }
                int l10 = l(j10, r6, i11 - i10, true);
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

    public final synchronized j3.t0 t() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean u(boolean z10) {
        j3.t0 t0Var;
        boolean z11 = false;
        if (this.s != this.p) {
            if (((z0) this.c.i(q())).a != this.g) {
                return true;
            }
            return v(r(this.s));
        }
        if (z10 || this.w || ((t0Var = this.B) != null && t0Var != this.g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean v(int i10) {
        n3.e eVar = this.h;
        if (eVar == null || eVar.t() == 4) {
            return true;
        }
        return (this.m[i10] & TLObject.FLAG_30) == 0 && this.h.r();
    }

    public final void w() {
        n3.e eVar = this.h;
        if (eVar == null || eVar.t() != 1) {
            return;
        }
        n3.d D = this.h.D();
        D.getClass();
        throw D;
    }

    public final void x(j3.t0 t0Var, j3.u0 u0Var) {
        j3.t0 t0Var2;
        j3.t0 t0Var3 = this.g;
        boolean z10 = t0Var3 == null;
        n3.c cVar = z10 ? null : t0Var3.E;
        this.g = t0Var;
        n3.c cVar2 = t0Var.E;
        n3.i iVar = this.d;
        if (iVar != null) {
            int b10 = iVar.b(t0Var);
            j3.s0 a2 = t0Var.a();
            a2.J = b10;
            t0Var2 = new j3.t0(a2);
        } else {
            t0Var2 = t0Var;
        }
        u0Var.b = t0Var2;
        u0Var.a = this.h;
        if (iVar == null) {
            return;
        }
        if (z10 || !f5.d0.a(cVar, cVar2)) {
            n3.e eVar = this.h;
            j2 j2Var = this.e;
            n3.e h = iVar.h(j2Var, t0Var);
            this.h = h;
            u0Var.a = h;
            if (eVar != null) {
                eVar.p(j2Var);
            }
        }
    }

    public final synchronized int y() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.s != this.p ? this.j[r(this.s)] : this.C;
    }

    public final int z(j3.u0 u0Var, m3.i iVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        y0 y0Var = this.b;
        synchronized (this) {
            try {
                iVar.c = false;
                i11 = -3;
                if (this.s != this.p) {
                    j3.t0 t0Var = ((z0) this.c.i(q())).a;
                    if (!z11 && t0Var == this.g) {
                        int r6 = r(this.s);
                        if (v(r6)) {
                            iVar.setFlags(this.m[r6]);
                            long j10 = this.n[r6];
                            iVar.d = j10;
                            if (j10 < this.t) {
                                iVar.addFlag(TLObject.FLAG_31);
                            }
                            y0Var.b = this.l[r6];
                            y0Var.a = this.k[r6];
                            y0Var.c = this.o[r6];
                            i11 = -4;
                        } else {
                            iVar.c = true;
                        }
                    }
                    x(t0Var, u0Var);
                    i11 = -5;
                } else {
                    if (!z10 && !this.w) {
                        j3.t0 t0Var2 = this.B;
                        if (t0Var2 == null || (!z11 && t0Var2 == this.g)) {
                        }
                        x(t0Var2, u0Var);
                        i11 = -5;
                    }
                    iVar.setFlags(4);
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !iVar.isEndOfStream()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    w0 w0Var = this.a;
                    w0.f((v0) w0Var.f, iVar, this.b, (f5.w) w0Var.d);
                } else {
                    w0 w0Var2 = this.a;
                    w0Var2.f = w0.f((v0) w0Var2.f, iVar, this.b, (f5.w) w0Var2.d);
                }
            }
            if (!z12) {
                this.s++;
            }
        }
        return i11;
    }
}
