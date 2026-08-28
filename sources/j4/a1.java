package j4;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a1 implements m3.w {
    public h3.t0 A;
    public h3.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final w0 a;
    public final l3.i d;
    public final a6.a e;
    public Object f;
    public h3.t0 g;
    public l3.e h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final x0 b = new x0();
    public int i = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public int[] j = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] k = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public long[] n = new long[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] m = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public int[] l = new int[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public m3.v[] o = new m3.v[MediaDataController.MAX_STYLE_RUNS_COUNT];
    public final a6.a c = new a6.a(new ih.e(3));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public a1(com.google.android.exoplayer2.upstream.r rVar, l3.i iVar, a6.a aVar) {
        this.d = iVar;
        this.e = aVar;
        this.a = new w0(rVar);
    }

    public final void A(boolean z10) {
        w0 w0Var = this.a;
        w0Var.a((v0) w0Var.e);
        v0 v0Var = (v0) w0Var.e;
        int i9 = w0Var.a;
        d5.a.i(((com.google.android.exoplayer2.upstream.a) v0Var.c) == null);
        v0Var.a = 0L;
        v0Var.b = i9;
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
        a6.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.b;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((ih.e) aVar.d).accept(sparseArray.valueAt(i10));
        }
        aVar.c = -1;
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

    public final int C(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        w0 w0Var = this.a;
        int c10 = w0Var.c(i9);
        v0 v0Var = (v0) w0Var.g;
        com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
        int read = jVar.read(aVar.a, ((int) (w0Var.b - v0Var.a)) + aVar.b, c10);
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
                int r10 = r(this.s);
                int i9 = this.s;
                int i10 = this.p;
                if ((i9 != i10) && j10 >= this.n[r10]) {
                    if (j10 <= this.v || z10) {
                        int l10 = l(j10, r10, i10 - i9, true);
                        if (l10 == -1) {
                            return false;
                        }
                        this.t = j10;
                        this.s += l10;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void E(int i9) {
        boolean z10;
        if (i9 >= 0) {
            try {
                if (this.s + i9 <= this.p) {
                    z10 = true;
                    d5.a.f(z10);
                    this.s += i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        d5.a.f(z10);
        this.s += i9;
    }

    @Override // m3.w
    public final void a(int i9, d5.y yVar) {
        d(i9, yVar);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        return C(jVar, i9, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010e, code lost:
    
        if (r6 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Type inference failed for: r6v31, types: [j4.z0, java.lang.Object] */
    @Override // m3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h3.t0 t0Var) {
        String str;
        boolean z10;
        h3.t0 m10 = m(t0Var);
        boolean z11 = false;
        this.z = false;
        this.A = t0Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!d5.f0.a(m10, this.B)) {
                    if (!(((SparseArray) this.c.b).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.c.b;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m10)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.b;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            h3.t0 t0Var2 = this.B;
                            str = t0Var2.B;
                            String str2 = t0Var2.r;
                            ArrayList arrayList = d5.q.a;
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
                                            d5.p e10 = d5.q.e(str2);
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
                    h3.t0 t0Var22 = this.B;
                    str = t0Var22.B;
                    String str22 = t0Var22.r;
                    ArrayList arrayList2 = d5.q.a;
                    if (str != null) {
                    }
                    z10 = false;
                    this.D = z10;
                    this.E = false;
                    z11 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ?? r62 = this.f;
        if (r62 == 0 || !z11) {
            return;
        }
        r62.a();
    }

    @Override // m3.w
    public final void d(int i9, d5.y yVar) {
        while (true) {
            w0 w0Var = this.a;
            if (i9 <= 0) {
                w0Var.getClass();
                return;
            }
            int c10 = w0Var.c(i9);
            v0 v0Var = (v0) w0Var.g;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
            yVar.c(((int) (w0Var.b - v0Var.a)) + aVar.b, c10, aVar.a);
            i9 -= c10;
            long j10 = w0Var.b + c10;
            w0Var.b = j10;
            v0 v0Var2 = (v0) w0Var.g;
            if (j10 == v0Var2.b) {
                w0Var.g = (v0) v0Var2.d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // m3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(long j10, int i9, int i10, int i11, m3.v vVar) {
        int i12;
        if (this.z) {
            h3.t0 t0Var = this.A;
            d5.a.j(t0Var);
            c(t0Var);
        }
        int i13 = i9 & 1;
        boolean z10 = i13 != 0;
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
            if (i13 == 0) {
                if (!this.E) {
                    d5.a.K("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i12 = i9 | 1;
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
                            int i14 = this.p;
                            int r10 = r(i14 - 1);
                            while (i14 > this.s && this.n[r10] >= j11) {
                                i14--;
                                r10--;
                                if (r10 == -1) {
                                    r10 = this.i - 1;
                                }
                            }
                            j(this.q + i14);
                        }
                    }
                    if (!r3) {
                        return;
                    } else {
                        this.G = false;
                    }
                }
                f(j11, i12, (this.a.b - i10) - i11, i10, vVar);
            }
        }
        i12 = i9;
        if (this.G) {
        }
        f(j11, i12, (this.a.b - i10) - i11, i10, vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (((j4.y0) r9.valueAt(r9.size() - 1)).a.equals(r8.B) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(long j10, int i9, long j11, int i10, m3.v vVar) {
        try {
            int i11 = this.p;
            if (i11 > 0) {
                int r10 = r(i11 - 1);
                d5.a.f(this.k[r10] + ((long) this.l[r10]) <= j11);
            }
            this.w = (536870912 & i9) != 0;
            this.v = Math.max(this.v, j10);
            int r11 = r(this.p);
            this.n[r11] = j10;
            this.k[r11] = j11;
            this.l[r11] = i10;
            this.m[r11] = i9;
            this.o[r11] = vVar;
            this.j[r11] = this.C;
            if (!(((SparseArray) this.c.b).size() == 0)) {
                SparseArray sparseArray = (SparseArray) this.c.b;
            }
            l3.i iVar = this.d;
            l3.h D = iVar != null ? iVar.D(this.e, this.B) : l3.h.a;
            a6.a aVar = this.c;
            int i12 = this.q + this.p;
            h3.t0 t0Var = this.B;
            t0Var.getClass();
            y0 y0Var = new y0(t0Var, D);
            SparseArray sparseArray2 = (SparseArray) aVar.b;
            if (aVar.c == -1) {
                d5.a.i(sparseArray2.size() == 0);
                aVar.c = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                d5.a.f(i12 >= keyAt);
                if (keyAt == i12) {
                    ((ih.e) aVar.d).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i12, y0Var);
            int i13 = this.p + 1;
            this.p = i13;
            int i14 = this.i;
            if (i13 == i14) {
                int i15 = i14 + MediaDataController.MAX_STYLE_RUNS_COUNT;
                int[] iArr = new int[i15];
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                m3.v[] vVarArr = new m3.v[i15];
                int i16 = this.r;
                int i17 = i14 - i16;
                System.arraycopy(this.k, i16, jArr, 0, i17);
                System.arraycopy(this.n, this.r, jArr2, 0, i17);
                System.arraycopy(this.m, this.r, iArr2, 0, i17);
                System.arraycopy(this.l, this.r, iArr3, 0, i17);
                System.arraycopy(this.o, this.r, vVarArr, 0, i17);
                System.arraycopy(this.j, this.r, iArr, 0, i17);
                int i18 = this.r;
                System.arraycopy(this.k, 0, jArr, i17, i18);
                System.arraycopy(this.n, 0, jArr2, i17, i18);
                System.arraycopy(this.m, 0, iArr2, i17, i18);
                System.arraycopy(this.l, 0, iArr3, i17, i18);
                System.arraycopy(this.o, 0, vVarArr, i17, i18);
                System.arraycopy(this.j, 0, iArr, i17, i18);
                this.k = jArr;
                this.n = jArr2;
                this.m = iArr2;
                this.l = iArr3;
                this.o = vVarArr;
                this.j = iArr;
                this.r = 0;
                this.i = i15;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long g(int i9) {
        this.u = Math.max(this.u, p(i9));
        this.p -= i9;
        int i10 = this.q + i9;
        this.q = i10;
        int i11 = this.r + i9;
        this.r = i11;
        int i12 = this.i;
        if (i11 >= i12) {
            this.r = i11 - i12;
        }
        int i13 = this.s - i9;
        this.s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.s = 0;
        }
        a6.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.b;
        while (i14 < sparseArray.size() - 1) {
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((ih.e) aVar.d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = aVar.c;
            if (i16 > 0) {
                aVar.c = i16 - 1;
            }
            i14 = i15;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i17 = this.r;
        if (i17 == 0) {
            i17 = this.i;
        }
        return this.k[i17 - 1] + this.l[r7];
    }

    public final void h(long j10, boolean z10) {
        Throwable th;
        w0 w0Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i9 = this.p;
                    long j11 = -1;
                    if (i9 != 0) {
                        long[] jArr = this.n;
                        int i10 = this.r;
                        if (j10 >= jArr[i10]) {
                            if (z10) {
                                try {
                                    int i11 = this.s;
                                    if (i11 != i9) {
                                        i9 = i11 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int l10 = l(j10, i10, i9, false);
                            if (l10 != -1) {
                                j11 = g(l10);
                            }
                            w0Var.b(j11);
                        }
                    }
                    w0Var.b(j11);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void i() {
        long g10;
        w0 w0Var = this.a;
        synchronized (this) {
            int i9 = this.p;
            g10 = i9 == 0 ? -1L : g(i9);
        }
        w0Var.b(g10);
    }

    public final long j(int i9) {
        int i10 = this.q;
        int i11 = this.p;
        int i12 = (i10 + i11) - i9;
        boolean z10 = false;
        d5.a.f(i12 >= 0 && i12 <= i11 - this.s);
        int i13 = this.p - i12;
        this.p = i13;
        this.v = Math.max(this.u, p(i13));
        if (i12 == 0 && this.w) {
            z10 = true;
        }
        this.w = z10;
        a6.a aVar = this.c;
        SparseArray sparseArray = (SparseArray) aVar.b;
        for (int size = sparseArray.size() - 1; size >= 0 && i9 < sparseArray.keyAt(size); size--) {
            ((ih.e) aVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.c = sparseArray.size() > 0 ? Math.min(aVar.c, sparseArray.size() - 1) : -1;
        int i14 = this.p;
        if (i14 == 0) {
            return 0L;
        }
        return this.k[r(i14 - 1)] + this.l[r9];
    }

    public final void k(int i9) {
        long j10 = j(i9);
        w0 w0Var = this.a;
        int i10 = w0Var.a;
        d5.a.f(j10 <= w0Var.b);
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
                v0 v0Var3 = new v0(v0Var.b, i10);
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
        v0 v0Var4 = new v0(w0Var.b, i10);
        w0Var.e = v0Var4;
        w0Var.f = v0Var4;
        w0Var.g = v0Var4;
    }

    public final int l(long j10, int i9, int i10, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.n[i9];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.m[i9] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i9++;
            if (i9 == this.i) {
                i9 = 0;
            }
        }
        return i11;
    }

    public h3.t0 m(h3.t0 t0Var) {
        if (this.F == 0 || t0Var.F == Long.MAX_VALUE) {
            return t0Var;
        }
        h3.s0 a2 = t0Var.a();
        a2.s = t0Var.F + this.F;
        return new h3.t0(a2);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i9) {
        long j10 = Long.MIN_VALUE;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int r10 = r(i9 - 1);
        for (int i10 = 0; i10 < i9; i10++) {
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

    public final int r(int i9) {
        int i10 = this.r + i9;
        int i11 = this.i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int s(long j10, boolean z10) {
        try {
            try {
                int r10 = r(this.s);
                int i9 = this.s;
                int i10 = this.p;
                if (!(i9 != i10) || j10 < this.n[r10]) {
                    return 0;
                }
                if (j10 > this.v && z10) {
                    return i10 - i9;
                }
                int l10 = l(j10, r10, i10 - i9, true);
                if (l10 == -1) {
                    return 0;
                }
                return l10;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized h3.t0 t() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean u(boolean z10) {
        h3.t0 t0Var;
        boolean z11 = false;
        if (this.s != this.p) {
            if (((y0) this.c.g(q())).a != this.g) {
                return true;
            }
            return v(r(this.s));
        }
        if (z10 || this.w || ((t0Var = this.B) != null && t0Var != this.g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean v(int i9) {
        l3.e eVar = this.h;
        if (eVar == null || eVar.j() == 4) {
            return true;
        }
        return (this.m[i9] & TLObject.FLAG_30) == 0 && this.h.d();
    }

    public final void w() {
        l3.e eVar = this.h;
        if (eVar == null || eVar.j() != 1) {
            return;
        }
        l3.d x10 = this.h.x();
        x10.getClass();
        throw x10;
    }

    public final void x(h3.t0 t0Var, h3.u0 u0Var) {
        h3.t0 t0Var2;
        h3.t0 t0Var3 = this.g;
        boolean z10 = t0Var3 == null;
        l3.c cVar = z10 ? null : t0Var3.E;
        this.g = t0Var;
        l3.c cVar2 = t0Var.E;
        l3.i iVar = this.d;
        if (iVar != null) {
            int G = iVar.G(t0Var);
            h3.s0 a2 = t0Var.a();
            a2.J = G;
            t0Var2 = new h3.t0(a2);
        } else {
            t0Var2 = t0Var;
        }
        u0Var.b = t0Var2;
        u0Var.a = this.h;
        if (iVar == null) {
            return;
        }
        if (z10 || !d5.f0.a(cVar, cVar2)) {
            l3.e eVar = this.h;
            a6.a aVar = this.e;
            l3.e n10 = iVar.n(aVar, t0Var);
            this.h = n10;
            u0Var.a = n10;
            if (eVar != null) {
                eVar.k(aVar);
            }
        }
    }

    public final synchronized int y() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[r(this.s)] : this.C;
    }

    public final int z(h3.u0 u0Var, k3.i iVar, int i9, boolean z10) {
        int i10;
        boolean z11 = (i9 & 2) != 0;
        x0 x0Var = this.b;
        synchronized (this) {
            try {
                iVar.c = false;
                i10 = -3;
                if (this.s != this.p) {
                    h3.t0 t0Var = ((y0) this.c.g(q())).a;
                    if (!z11 && t0Var == this.g) {
                        int r10 = r(this.s);
                        if (v(r10)) {
                            iVar.setFlags(this.m[r10]);
                            long j10 = this.n[r10];
                            iVar.d = j10;
                            if (j10 < this.t) {
                                iVar.addFlag(TLObject.FLAG_31);
                            }
                            x0Var.b = this.l[r10];
                            x0Var.a = this.k[r10];
                            x0Var.c = this.o[r10];
                            i10 = -4;
                        } else {
                            iVar.c = true;
                        }
                    }
                    x(t0Var, u0Var);
                    i10 = -5;
                } else {
                    if (!z10 && !this.w) {
                        h3.t0 t0Var2 = this.B;
                        if (t0Var2 == null || (!z11 && t0Var2 == this.g)) {
                        }
                        x(t0Var2, u0Var);
                        i10 = -5;
                    }
                    iVar.setFlags(4);
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !iVar.isEndOfStream()) {
            boolean z12 = (i9 & 1) != 0;
            if ((i9 & 4) == 0) {
                if (z12) {
                    w0 w0Var = this.a;
                    w0.f((v0) w0Var.f, iVar, this.b, (d5.y) w0Var.d);
                } else {
                    w0 w0Var2 = this.a;
                    w0Var2.f = w0.f((v0) w0Var2.f, iVar, this.b, (d5.y) w0Var2.d);
                }
            }
            if (!z12) {
                this.s++;
            }
        }
        return i10;
    }
}
