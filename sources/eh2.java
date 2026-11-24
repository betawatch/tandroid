// default package

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eh2 implements ip9, q4a, h86, l86 {
    public final gp9[] E;
    public final tg2 F;
    public zg2 G;
    public fm4 H;
    public l53 I;
    public long J;
    public long K;
    public int L;
    public og0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final fm4[] c;
    public final boolean[] d;
    public final w93 e;
    public final l53 f;
    public final kp h;
    public final i2f n;
    public final mv6 r;
    public final e31 s;
    public final ArrayList w;
    public final List x;
    public final gp9 y;

    public eh2(int i, int[] iArr, fm4[] fm4VarArr, w93 w93Var, l53 l53Var, mv6 mv6Var, long j, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, boolean z, long j2, e69 e69Var) {
        this.a = i;
        this.b = iArr;
        this.c = fm4VarArr;
        this.e = w93Var;
        this.f = l53Var;
        this.h = kpVar;
        this.n = i2fVar;
        this.r = e69Var != null ? new mv6((Object) e69Var, (byte) 5) : new mv6("ChunkSampleStream");
        this.s = new e31((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new gp9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        gp9[] gp9VarArr = new gp9[i2];
        yq3Var.getClass();
        gp9 gp9Var = new gp9(mv6Var, yq3Var, vq3Var);
        this.y = gp9Var;
        iArr2[0] = i;
        gp9VarArr[0] = gp9Var;
        int i3 = 0;
        while (i3 < length) {
            gp9 gp9Var2 = new gp9(mv6Var, null, null);
            this.E[i3] = gp9Var2;
            int i4 = i3 + 1;
            gp9VarArr[i4] = gp9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new tg2(iArr2, gp9VarArr, (byte) 8);
        this.J = j;
        this.K = j;
        this.R = Long.MIN_VALUE;
        this.N = z;
        if (!z || j2 == -9223372036854775807L) {
            return;
        }
        this.N = false;
        this.O = j2 < j;
    }

    public final void A() {
        int B = B(this.y.v(), this.L - 1);
        while (true) {
            int i = this.L;
            if (i > B) {
                return;
            }
            this.L = i + 1;
            og0 og0Var = (og0) this.w.get(i);
            fm4 fm4Var = og0Var.d;
            if (!fm4Var.equals(this.H)) {
                this.h.i(this.a, fm4Var, og0Var.e, og0Var.f, og0Var.h);
            }
            this.H = fm4Var;
        }
    }

    public final int B(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.w;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((og0) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    public final void C(l53 l53Var) {
        this.I = l53Var;
        gp9 gp9Var = this.y;
        gp9Var.l();
        sq3 sq3Var = gp9Var.h;
        if (sq3Var != null) {
            sq3Var.c(gp9Var.e);
            gp9Var.h = null;
            gp9Var.g = null;
        }
        for (gp9 gp9Var2 : this.E) {
            gp9Var2.l();
            sq3 sq3Var2 = gp9Var2.h;
            if (sq3Var2 != null) {
                sq3Var2.c(gp9Var2.e);
                gp9Var2.h = null;
                gp9Var2.g = null;
            }
        }
        this.r.b0(this);
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        zg2 zg2Var = (zg2) k86Var;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        if (i != 0) {
            zxa zxaVar = zg2Var.r;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.h.u(new f86(e86Var), zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, i);
    }

    @Override // h86
    public final void U(k86 k86Var, long j, long j2) {
        zg2 zg2Var = (zg2) k86Var;
        this.G = null;
        w93 w93Var = this.e;
        u93[] u93VarArr = w93Var.h;
        if (zg2Var instanceof on5) {
            int e = w93Var.i.e(((on5) zg2Var).d);
            u93 u93Var = u93VarArr[e];
            if (u93Var.d == null) {
                f31 f31Var = u93Var.a;
                f31Var.getClass();
                ah2 a = f31Var.a();
                if (a != null) {
                    i89 i89Var = u93Var.b;
                    u93VarArr[e] = new u93(u93Var.e, i89Var, u93Var.c, u93Var.a, u93Var.f, new hg2(a, i89Var.c, (byte) 1));
                }
            }
        }
        qc8 qc8Var = w93Var.g;
        if (qc8Var != null) {
            long j3 = qc8Var.d;
            if (j3 == -9223372036854775807L || zg2Var.n > j3) {
                qc8Var.d = zg2Var.n;
            }
            qc8Var.e.h = true;
        }
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.h.q(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        this.f.b(this);
    }

    @Override // ip9
    public final int a() {
        if (this.N) {
            return 2;
        }
        return this.O ? 4 : 0;
    }

    @Override // ip9
    public final void b() {
        mv6 mv6Var = this.r;
        mv6Var.b();
        this.y.C();
        if (mv6Var.W()) {
            return;
        }
        w93 w93Var = this.e;
        jh0 jh0Var = w93Var.l;
        if (jh0Var != null) {
            throw jh0Var;
        }
        w93Var.a.b();
    }

    @Override // l86
    public final void c() {
        gp9 gp9Var = this.y;
        gp9Var.G(true);
        sq3 sq3Var = gp9Var.h;
        if (sq3Var != null) {
            sq3Var.c(gp9Var.e);
            gp9Var.h = null;
            gp9Var.g = null;
        }
        for (gp9 gp9Var2 : this.E) {
            gp9Var2.G(true);
            sq3 sq3Var2 = gp9Var2.h;
            if (sq3Var2 != null) {
                sq3Var2.c(gp9Var2.e);
                gp9Var2.h = null;
                gp9Var2.g = null;
            }
        }
        for (u93 u93Var : this.e.h) {
            f31 f31Var = u93Var.a;
            if (f31Var != null) {
                f31Var.a.release();
            }
        }
        l53 l53Var = this.I;
        if (l53Var != null) {
            synchronized (l53Var) {
                qc8 qc8Var = (qc8) l53Var.E.remove(this);
                if (qc8Var != null) {
                    gp9 gp9Var3 = qc8Var.a;
                    gp9Var3.G(true);
                    sq3 sq3Var3 = gp9Var3.h;
                    if (sq3Var3 != null) {
                        sq3Var3.c(null);
                        gp9Var3.h = null;
                        gp9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override // q4a
    public final boolean d() {
        return this.r.W();
    }

    @Override // q4a
    public final long g() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override // ip9
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return -3;
        }
        og0 og0Var = this.M;
        gp9 gp9Var = this.y;
        if (og0Var != null && og0Var.e(0) <= gp9Var.v()) {
            return -3;
        }
        A();
        return gp9Var.F(sk4Var, z83Var, i, this.S);
    }

    @Override // ip9
    public final boolean j() {
        return !y() && this.y.A(this.S);
    }

    @Override // ip9
    public final int n(long j) {
        boolean z = !this.P && z();
        if (y() || z || this.Q) {
            return 0;
        }
        boolean z2 = this.S;
        gp9 gp9Var = this.y;
        int x = gp9Var.x(j, z2);
        og0 og0Var = this.M;
        if (og0Var != null) {
            x = Math.min(x, og0Var.e(0) - gp9Var.v());
        }
        gp9Var.L(x);
        A();
        return x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0468  */
    @Override // q4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(t86 t86Var) {
        long j;
        List list;
        e31 e31Var;
        long j2;
        boolean z;
        u93[] u93VarArr;
        long j3;
        mv6 mv6Var;
        e31 e31Var2;
        List list2;
        boolean z2;
        long j4;
        long j5;
        long j6;
        Object xu2Var;
        az8 az8Var;
        long j7;
        boolean z3;
        boolean z4;
        zg2 zg2Var;
        boolean z5;
        long j8;
        if (this.S) {
            return false;
        }
        mv6 mv6Var2 = this.r;
        if (mv6Var2.W() || mv6Var2.S()) {
            return false;
        }
        boolean y = y();
        if (y) {
            list = Collections.EMPTY_LIST;
            j = this.J;
        } else {
            j = w().n;
            list = this.x;
        }
        List list3 = list;
        w93 w93Var = this.e;
        jh0 jh0Var = w93Var.l;
        e31 e31Var3 = this.s;
        if (jh0Var == null) {
            e31Var = e31Var3;
            long j9 = t86Var.a;
            long j10 = j - j9;
            j2 = -9223372036854775807L;
            z = y;
            long T = g8c.T(w93Var.j.b(w93Var.k).b) + g8c.T(w93Var.j.a) + j;
            qc8 qc8Var = w93Var.g;
            if (qc8Var != null) {
                rc8 rc8Var = qc8Var.e;
                h53 h53Var = rc8Var.f;
                lj9 lj9Var = rc8Var.b;
                if (!h53Var.d) {
                    z3 = false;
                } else if (rc8Var.n) {
                    z3 = true;
                } else {
                    Map.Entry ceilingEntry = rc8Var.e.ceilingEntry(Long.valueOf(h53Var.h));
                    if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= T) {
                        z3 = false;
                    } else {
                        long longValue = ((Long) ceilingEntry.getKey()).longValue();
                        q53 q53Var = (q53) lj9Var.b;
                        long j11 = q53Var.P;
                        if (j11 == -9223372036854775807L || j11 < longValue) {
                            q53Var.P = longValue;
                        }
                        z3 = true;
                    }
                    if (z3 && rc8Var.h) {
                        rc8Var.n = true;
                        rc8Var.h = false;
                        q53 q53Var2 = (q53) lj9Var.b;
                        q53Var2.I.removeCallbacks(q53Var2.x);
                        q53Var2.D();
                    }
                }
            }
            long T2 = g8c.T(g8c.E(w93Var.f));
            h53 h53Var2 = w93Var.j;
            long j12 = h53Var2.a;
            long T3 = j12 == -9223372036854775807L ? -9223372036854775807L : T2 - g8c.T(j12 + h53Var2.b(w93Var.k).b);
            ak6 ak6Var = list3.isEmpty() ? null : (ak6) oo1.m(1, list3);
            int length = w93Var.i.length();
            bk6[] bk6VarArr = new bk6[length];
            int i = 0;
            while (true) {
                u93VarArr = w93Var.h;
                if (i >= length) {
                    break;
                }
                u93 u93Var = u93VarArr[i];
                r53 r53Var = u93Var.d;
                long j13 = T3;
                long j14 = u93Var.f;
                long j15 = u93Var.e;
                i2f i2fVar = bk6.z;
                if (r53Var == null) {
                    bk6VarArr[i] = i2fVar;
                } else {
                    r53Var.getClass();
                    long r = r53Var.r(j15, T2) + j14;
                    long b = u93Var.b(T2);
                    if (ak6Var != null) {
                        j7 = ak6Var.b();
                    } else {
                        r53 r53Var2 = u93Var.d;
                        r53Var2.getClass();
                        j7 = g8c.j(r53Var2.C(j, j15) + j14, r, b);
                    }
                    long j16 = j7;
                    if (j16 < r) {
                        bk6VarArr[i] = i2fVar;
                    } else {
                        bk6VarArr[i] = new v93(w93Var.b(i), j16, b);
                    }
                }
                i++;
                T3 = j13;
            }
            long j17 = T3;
            long j18 = 0;
            if (!w93Var.j.d || u93VarArr[0].c() == 0) {
                j3 = -9223372036854775807L;
            } else {
                long d = u93VarArr[0].d(u93VarArr[0].b(T2));
                h53 h53Var3 = w93Var.j;
                long j19 = h53Var3.a;
                long min = Math.min(j19 == -9223372036854775807L ? -9223372036854775807L : T2 - g8c.T(j19 + h53Var3.b(w93Var.k).b), d) - j9;
                j18 = 0;
                j3 = Math.max(0L, min);
            }
            mv6Var = mv6Var2;
            e31Var2 = e31Var;
            long j20 = j18;
            w93Var.i.b(j9, j10, j3, list3, bk6VarArr);
            int d2 = w93Var.i.d();
            SystemClock.elapsedRealtime();
            u93 b2 = w93Var.b(d2);
            long j21 = b2.e;
            long j22 = b2.f;
            r53 r53Var3 = b2.d;
            wg0 wg0Var = b2.c;
            f31 f31Var = b2.a;
            i89 i89Var = b2.b;
            if (f31Var != null) {
                az8 az8Var2 = f31Var.r == null ? i89Var.e : null;
                if (r53Var3 == null) {
                    list2 = list3;
                    az8Var = i89Var.c();
                } else {
                    list2 = list3;
                    az8Var = null;
                }
                if (az8Var2 != null || az8Var != null) {
                    o63 o63Var = w93Var.e;
                    fm4 o = w93Var.i.o();
                    int p = w93Var.i.p();
                    Object s = w93Var.i.s();
                    if (az8Var2 != null) {
                        az8 a = az8Var2.a(az8Var, wg0Var.a);
                        if (a != null) {
                            az8Var2 = a;
                        }
                    } else {
                        az8Var.getClass();
                        az8Var2 = az8Var;
                    }
                    e31Var2.c = new on5(o63Var, lbe.a(i89Var, wg0Var.a, az8Var2, 0), o, p, s, b2.a);
                    z4 = e31Var2.b;
                    zg2Var = (zg2) e31Var2.c;
                    e31Var2.c = null;
                    e31Var2.b = false;
                    if (zg2Var != null) {
                        long j23 = this.R;
                        if (j23 != Long.MIN_VALUE && zg2Var.h >= j23) {
                            z5 = true;
                            if (!z4) {
                                j8 = -9223372036854775807L;
                            } else {
                                if (!z5) {
                                    if (zg2Var == null) {
                                        return false;
                                    }
                                    this.G = zg2Var;
                                    boolean z6 = zg2Var instanceof og0;
                                    tg2 tg2Var = this.F;
                                    if (z6) {
                                        og0 og0Var = (og0) zg2Var;
                                        if (z) {
                                            long j24 = og0Var.h;
                                            long j25 = this.J;
                                            if (j24 < j25) {
                                                this.y.t = j25;
                                                for (gp9 gp9Var : this.E) {
                                                    gp9Var.t = this.J;
                                                }
                                                this.O = this.N;
                                            }
                                            this.N = false;
                                            this.J = j2;
                                        }
                                        og0Var.y = tg2Var;
                                        gp9[] gp9VarArr = (gp9[]) tg2Var.c;
                                        int[] iArr = new int[gp9VarArr.length];
                                        for (int i2 = 0; i2 < gp9VarArr.length; i2++) {
                                            iArr[i2] = gp9VarArr[i2].z();
                                        }
                                        og0Var.E = iArr;
                                        this.w.add(og0Var);
                                    } else if (zg2Var instanceof on5) {
                                        ((on5) zg2Var).w = tg2Var;
                                    }
                                    mv6Var.r0(zg2Var, this, this.n.v3(zg2Var.c));
                                    return true;
                                }
                                j8 = j2;
                            }
                            this.J = j8;
                            this.S = true;
                            return true;
                        }
                    }
                    z5 = false;
                    if (!z4) {
                    }
                    this.J = j8;
                    this.S = true;
                    return true;
                }
            } else {
                list2 = list3;
            }
            h53 h53Var4 = w93Var.j;
            boolean z7 = h53Var4.d && w93Var.k == h53Var4.l.size() + (-1);
            boolean z8 = (z7 && j21 == -9223372036854775807L) ? false : true;
            if (b2.c() == j20) {
                e31Var2.b = z8;
            } else {
                r53Var3.getClass();
                boolean z9 = z8;
                long r2 = r53Var3.r(j21, T2) + j22;
                long b3 = b2.b(T2);
                if (z7) {
                    long d3 = b2.d(b3);
                    z2 = z9 & ((d3 - b2.e(b3)) + d3 >= j21);
                } else {
                    z2 = z9;
                }
                if (ak6Var != null) {
                    j5 = ak6Var.b();
                    j4 = b3;
                } else {
                    r53Var3.getClass();
                    j4 = b3;
                    j5 = g8c.j(r53Var3.C(j, j21) + j22, r2, j4);
                }
                long j26 = j5;
                if (j26 < r2) {
                    w93Var.l = new jh0();
                } else {
                    if (j26 <= j4) {
                        long j27 = j;
                        if (!w93Var.m || j26 < j4) {
                            if (!z2 || b2.e(j26) < j21) {
                                long j28 = 1;
                                int min2 = (int) Math.min(1L, (j4 - j26) + 1);
                                if (j21 != -9223372036854775807L) {
                                    while (min2 > 1) {
                                        j6 = j28;
                                        if (b2.e((min2 + j26) - j6) < j21) {
                                            break;
                                        }
                                        min2--;
                                        j28 = j6;
                                    }
                                }
                                j6 = j28;
                                long j29 = list2.isEmpty() ? j27 : -9223372036854775807L;
                                o63 o63Var2 = w93Var.e;
                                int i3 = w93Var.d;
                                fm4 o2 = w93Var.i.o();
                                int p2 = w93Var.i.p();
                                Object s2 = w93Var.i.s();
                                long e = b2.e(j26);
                                r53Var3.getClass();
                                az8 w = r53Var3.w(j26 - j22);
                                if (f31Var == null) {
                                    xu2Var = new ria(o63Var2, lbe.a(i89Var, wg0Var.a, w, b2.f(j26, j17) ? 0 : 8), o2, p2, s2, e, b2.d(j26), j26, i3, o2);
                                } else {
                                    int i4 = 1;
                                    int i5 = 1;
                                    while (true) {
                                        o2 = o2;
                                        if (i4 >= min2) {
                                            break;
                                        }
                                        r53Var3.getClass();
                                        az8 a2 = w.a(r53Var3.w((j26 + i4) - j22), wg0Var.a);
                                        if (a2 == null) {
                                            break;
                                        }
                                        i5++;
                                        i4++;
                                        w = a2;
                                    }
                                    long j30 = (j26 + i5) - j6;
                                    long d4 = b2.d(j30);
                                    xu2Var = new xu2(o63Var2, lbe.a(i89Var, wg0Var.a, w, b2.f(j30, j17) ? 0 : 8), o2, p2, s2, e, d4, j29, (j21 == -9223372036854775807L || j21 > d4) ? -9223372036854775807L : j21, j26, i5, ud7.k(o2.t) ? e : -i89Var.c, b2.a);
                                }
                                e31Var2.c = xu2Var;
                            } else {
                                e31Var2.b = true;
                            }
                        }
                    }
                    e31Var2.b = z2;
                }
            }
            z4 = e31Var2.b;
            zg2Var = (zg2) e31Var2.c;
            e31Var2.c = null;
            e31Var2.b = false;
            if (zg2Var != null) {
            }
            z5 = false;
            if (!z4) {
            }
            this.J = j8;
            this.S = true;
            return true;
        }
        z = y;
        e31Var = e31Var3;
        j2 = -9223372036854775807L;
        mv6Var = mv6Var2;
        e31Var2 = e31Var;
        z4 = e31Var2.b;
        zg2Var = (zg2) e31Var2.c;
        e31Var2.c = null;
        e31Var2.b = false;
        if (zg2Var != null) {
        }
        z5 = false;
        if (!z4) {
        }
        this.J = j8;
        this.S = true;
        return true;
    }

    @Override // q4a
    public final long s() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j = this.K;
        og0 w = w();
        if (!w.c()) {
            ArrayList arrayList = this.w;
            w = arrayList.size() > 1 ? (og0) b00.f(2, arrayList) : null;
        }
        if (w != null) {
            j = Math.max(j, w.n);
        }
        return Math.max(j, this.y.s());
    }

    @Override // q4a
    public final void t(long j) {
        boolean z;
        mv6 mv6Var = this.r;
        if (mv6Var.S() || y()) {
            return;
        }
        boolean W = mv6Var.W();
        List list = this.x;
        w93 w93Var = this.e;
        ArrayList arrayList = this.w;
        if (W) {
            zg2 zg2Var = this.G;
            zg2Var.getClass();
            boolean z2 = zg2Var instanceof og0;
            if (z2 && x(arrayList.size() - 1)) {
                return;
            }
            long j2 = this.R;
            if (j2 == Long.MIN_VALUE || zg2Var.h < j2) {
                if (!(w93Var.l == null ? w93Var.i.g(j, zg2Var, list) : false)) {
                    return;
                }
            }
            mv6Var.p();
            if (z2) {
                this.M = (og0) zg2Var;
                return;
            }
            return;
        }
        int min = Math.min(arrayList.size(), (w93Var.l != null || w93Var.i.length() < 2) ? list.size() : w93Var.i.l(j, list));
        if (this.R != Long.MIN_VALUE) {
            z = false;
            while (min > 0 && ((og0) arrayList.get(min - 1)).h >= this.R) {
                min--;
                z = true;
            }
        } else {
            z = false;
        }
        if (min < arrayList.size()) {
            gre.p(!mv6Var.W());
            int size = arrayList.size();
            while (true) {
                if (min >= size) {
                    min = -1;
                    break;
                } else if (!x(min)) {
                    break;
                } else {
                    min++;
                }
            }
            if (min != -1) {
                long j3 = w().n;
                og0 u = u(min);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
                this.S = false;
                this.h.A(u.h, this.a, j3);
            }
        }
        if (z) {
            this.J = -9223372036854775807L;
            this.S = true;
        }
    }

    public final og0 u(int i) {
        ArrayList arrayList = this.w;
        og0 og0Var = (og0) arrayList.get(i);
        g8c.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(og0Var.e(0));
        while (true) {
            gp9[] gp9VarArr = this.E;
            if (i2 >= gp9VarArr.length) {
                return og0Var;
            }
            gp9 gp9Var = gp9VarArr[i2];
            i2++;
            gp9Var.o(og0Var.e(i2));
        }
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        zg2 zg2Var = (zg2) k86Var;
        this.G = null;
        this.M = null;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.h.o(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (z) {
            return;
        }
        if (y()) {
            this.y.G(false);
            for (gp9 gp9Var : this.E) {
                gp9Var.G(false);
            }
        } else if (zg2Var instanceof og0) {
            ArrayList arrayList = this.w;
            u(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.J = this.K;
            }
        }
        this.f.b(this);
    }

    public final og0 w() {
        return (og0) b00.f(1, this.w);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0299  */
    @Override // h86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        i2f i2fVar;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        long j3;
        boolean z4;
        i86 i86Var;
        boolean a;
        zg2 zg2Var = (zg2) k86Var;
        zxa zxaVar = zg2Var.r;
        fm4 fm4Var = zg2Var.d;
        long j4 = zg2Var.h;
        long j5 = zxaVar.b;
        boolean z5 = zg2Var instanceof og0;
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size() - 1;
        boolean z6 = (j5 != 0 && z5 && x(size)) ? false : true;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar2 = zg2Var.r;
        e86Var.d = zxaVar2.c;
        e86Var.e = zxaVar2.d;
        e86Var.f = j2;
        e86Var.g = j5;
        f86 f86Var = new f86(e86Var);
        g8c.i0(j4);
        g8c.i0(zg2Var.n);
        dd ddVar = new dd(iOException, i, (byte) 8);
        w93 w93Var = this.e;
        u93[] u93VarArr = w93Var.h;
        c5a c5aVar = w93Var.b;
        i2f i2fVar2 = this.n;
        if (z6) {
            qc8 qc8Var = w93Var.g;
            if (qc8Var != null) {
                long j6 = qc8Var.d;
                boolean z7 = j6 != -9223372036854775807L && j6 < j4;
                rc8 rc8Var = qc8Var.e;
                if (rc8Var.f.d) {
                    if (!rc8Var.n) {
                        if (z7) {
                            if (rc8Var.h) {
                                rc8Var.n = true;
                                rc8Var.h = false;
                                q53 q53Var = (q53) rc8Var.b.b;
                                q53Var.I.removeCallbacks(q53Var.x);
                                q53Var.D();
                            }
                        }
                    }
                    z2 = z5;
                    arrayList = arrayList2;
                    i2fVar = i2fVar2;
                    z = z6;
                    z3 = true;
                    z4 = true;
                    if (z4) {
                        if (z) {
                            i86Var = mv6.y;
                            if (z2) {
                                gre.p(u(size) == zg2Var ? z3 : false);
                                if (arrayList.isEmpty()) {
                                    this.J = this.K;
                                }
                            }
                            if (i86Var == null) {
                                i2fVar.getClass();
                                long w3 = i2f.w3(ddVar);
                                i86Var = w3 != -9223372036854775807L ? new i86(0, w3) : mv6.E;
                            }
                            i86 i86Var2 = i86Var;
                            a = i86Var2.a();
                            this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
                            if (!a) {
                                this.G = null;
                                i2fVar.getClass();
                                this.f.b(this);
                            }
                            return i86Var2;
                        }
                        lad.f("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    i86Var = null;
                    if (i86Var == null) {
                    }
                    i86 i86Var22 = i86Var;
                    a = i86Var22.a();
                    this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
                    if (!a) {
                    }
                    return i86Var22;
                }
            }
            if (!w93Var.j.d && (zg2Var instanceof ak6) && (iOException instanceof lg5) && ((lg5) iOException).c == 404) {
                u93 u93Var = u93VarArr[w93Var.i.e(zg2Var.d)];
                long c = u93Var.c();
                if (c != -1 && c != 0) {
                    r53 r53Var = u93Var.d;
                    r53Var.getClass();
                    if (((ak6) zg2Var).b() > ((r53Var.b0() + u93Var.f) + c) - 1) {
                        w93Var.m = true;
                        z2 = z5;
                        arrayList = arrayList2;
                        i2fVar = i2fVar2;
                        z = z6;
                        z3 = true;
                        z4 = true;
                        if (z4) {
                        }
                        i86Var = null;
                        if (i86Var == null) {
                        }
                        i86 i86Var222 = i86Var;
                        a = i86Var222.a();
                        this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
                        if (!a) {
                        }
                        return i86Var222;
                    }
                }
            }
            u93 u93Var2 = u93VarArr[w93Var.i.e(fm4Var)];
            i89 i89Var = u93Var2.b;
            wg0 wg0Var = u93Var2.c;
            wg0 N = c5aVar.N(i89Var.b);
            if (N == null || wg0Var.equals(N)) {
                k64 k64Var = w93Var.i;
                mm5 mm5Var = u93Var2.b.b;
                i2fVar = i2fVar2;
                z = z6;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z2 = z5;
                int length = k64Var.length();
                arrayList = arrayList2;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (k64Var.a(i3, elapsedRealtime)) {
                        i2++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i4 = 0; i4 < mm5Var.size(); i4++) {
                    hashSet.add(Integer.valueOf(((wg0) mm5Var.get(i4)).c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList c2 = c5aVar.c(mm5Var);
                for (int i5 = 0; i5 < c2.size(); i5++) {
                    hashSet2.add(Integer.valueOf(((wg0) c2.get(i5)).c));
                }
                c86 c86Var = new c86(false, size2, size2 - hashSet2.size(), length, i2);
                if (c86Var.a(2) || c86Var.a(1)) {
                    i2fVar.getClass();
                    d86 u3 = i2f.u3(c86Var, ddVar);
                    if (u3 != null) {
                        long j7 = u3.b;
                        byte b = u3.a;
                        if (c86Var.a(b)) {
                            if (b == 2) {
                                k64 k64Var2 = w93Var.i;
                                z4 = k64Var2.q(k64Var2.e(fm4Var), j7);
                                z3 = true;
                            } else {
                                z3 = true;
                                if (b == 1) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j7;
                                    String str = wg0Var.b;
                                    HashMap hashMap = (HashMap) c5aVar.b;
                                    if (hashMap.containsKey(str)) {
                                        Long l = (Long) hashMap.get(str);
                                        String str2 = g8c.a;
                                        j3 = Math.max(elapsedRealtime2, l.longValue());
                                    } else {
                                        j3 = elapsedRealtime2;
                                    }
                                    hashMap.put(str, Long.valueOf(j3));
                                    int i6 = wg0Var.c;
                                    if (i6 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i6);
                                        HashMap hashMap2 = (HashMap) c5aVar.c;
                                        if (hashMap2.containsKey(valueOf)) {
                                            Long l2 = (Long) hashMap2.get(valueOf);
                                            String str3 = g8c.a;
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                        }
                                        hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                            }
                            if (z4) {
                            }
                            i86Var = null;
                            if (i86Var == null) {
                            }
                            i86 i86Var2222 = i86Var;
                            a = i86Var2222.a();
                            this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
                            if (!a) {
                            }
                            return i86Var2222;
                        }
                    }
                }
            }
            z2 = z5;
            arrayList = arrayList2;
            i2fVar = i2fVar2;
            z = z6;
            z3 = true;
            z4 = true;
            if (z4) {
            }
            i86Var = null;
            if (i86Var == null) {
            }
            i86 i86Var22222 = i86Var;
            a = i86Var22222.a();
            this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
            if (!a) {
            }
            return i86Var22222;
        }
        z2 = z5;
        arrayList = arrayList2;
        i2fVar = i2fVar2;
        z = z6;
        z3 = true;
        z4 = false;
        if (z4) {
        }
        i86Var = null;
        if (i86Var == null) {
        }
        i86 i86Var222222 = i86Var;
        a = i86Var222222.a();
        this.h.r(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, iOException, !a);
        if (!a) {
        }
        return i86Var222222;
    }

    public final boolean x(int i) {
        int v;
        og0 og0Var = (og0) this.w.get(i);
        if (this.y.v() > og0Var.e(0)) {
            return true;
        }
        int i2 = 0;
        do {
            gp9[] gp9VarArr = this.E;
            if (i2 >= gp9VarArr.length) {
                return false;
            }
            v = gp9VarArr[i2].v();
            i2++;
        } while (v <= og0Var.e(i2));
        return true;
    }

    public final boolean y() {
        return this.J != -9223372036854775807L;
    }

    public final boolean z() {
        return ((!this.N && !this.O) || this.S || this.r.S()) ? false : true;
    }
}
