// default package

import java.util.Collections;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mx5 implements gu3 {
    public final String a;
    public final int b;
    public final xu7 c;
    public final qd1 d;
    public wxb e;
    public String f;
    public fm4 g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public mx5(String str, int i) {
        this.a = str;
        this.b = i;
        xu7 xu7Var = new xu7(1024);
        this.c = xu7Var;
        byte[] bArr = xu7Var.a;
        this.d = new qd1(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r23.m != false) goto L67;
     */
    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xu7 xu7Var) {
        int f;
        boolean e;
        this.e.getClass();
        while (xu7Var.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    xu7 xu7Var2 = this.c;
                    qd1 qd1Var = this.d;
                    if (b == 2) {
                        int A = ((this.k & (-225)) << 8) | xu7Var.A();
                        this.j = A;
                        if (A > xu7Var2.a.length) {
                            xu7Var2.K(A);
                            byte[] bArr = xu7Var2.a;
                            qd1Var.j(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            sdb.a();
                            return;
                        }
                        int min = Math.min(xu7Var.a(), this.j - this.i);
                        xu7Var.k(this.i, min, qd1Var.b);
                        int i = this.i + min;
                        this.i = i;
                        if (i == this.j) {
                            qd1Var.l(0);
                            if (!qd1Var.e()) {
                                this.m = true;
                                int f2 = qd1Var.f(1);
                                int f3 = f2 == 1 ? qd1Var.f(1) : 0;
                                this.n = f3;
                                if (f3 != 0) {
                                    throw av7.a(null, null);
                                }
                                if (f2 == 1) {
                                    qd1Var.f((qd1Var.f(2) + 1) << 3);
                                }
                                if (!qd1Var.e()) {
                                    throw av7.a(null, null);
                                }
                                this.o = qd1Var.f(6);
                                int f4 = qd1Var.f(4);
                                int f5 = qd1Var.f(3);
                                if (f4 != 0 || f5 != 0) {
                                    throw av7.a(null, null);
                                }
                                if (f2 == 0) {
                                    int i2 = (qd1Var.c << 3) + qd1Var.d;
                                    int b2 = qd1Var.b();
                                    g1 j = pm2.j(qd1Var, true);
                                    this.v = j.c;
                                    this.s = j.a;
                                    this.u = j.b;
                                    int b3 = b2 - qd1Var.b();
                                    qd1Var.l(i2);
                                    byte[] bArr2 = new byte[(b3 + 7) / 8];
                                    qd1Var.g(b3, bArr2);
                                    em4 em4Var = new em4();
                                    em4Var.a = this.f;
                                    em4Var.r = ud7.n("video/mp2t");
                                    em4Var.s = ud7.n("audio/mp4a-latm");
                                    em4Var.k = this.v;
                                    em4Var.M = this.u;
                                    em4Var.O = this.s;
                                    em4Var.v = Collections.singletonList(bArr2);
                                    em4Var.d = this.a;
                                    em4Var.f = this.b;
                                    fm4 fm4Var = new fm4(em4Var);
                                    if (!fm4Var.equals(this.g)) {
                                        this.g = fm4Var;
                                        this.t = 1024000000 / fm4Var.P;
                                        this.e.g(fm4Var);
                                    }
                                } else {
                                    int b4 = qd1Var.b();
                                    g1 j2 = pm2.j(qd1Var, true);
                                    this.v = j2.c;
                                    this.s = j2.a;
                                    this.u = j2.b;
                                    qd1Var.n(qd1Var.f((qd1Var.f(2) + 1) << 3) - (b4 - qd1Var.b()));
                                }
                                int f6 = qd1Var.f(3);
                                this.p = f6;
                                if (f6 == 0) {
                                    qd1Var.n(8);
                                } else if (f6 == 1) {
                                    qd1Var.n(9);
                                } else if (f6 == 3 || f6 == 4 || f6 == 5) {
                                    qd1Var.n(6);
                                } else {
                                    if (f6 != 6 && f6 != 7) {
                                        sdb.a();
                                        return;
                                    }
                                    qd1Var.n(1);
                                }
                                boolean e2 = qd1Var.e();
                                this.q = e2;
                                this.r = 0L;
                                if (e2) {
                                    if (f2 == 1) {
                                        this.r = qd1Var.f((qd1Var.f(2) + 1) << 3);
                                    } else {
                                        do {
                                            e = qd1Var.e();
                                            this.r = (this.r << 8) + qd1Var.f(8);
                                        } while (e);
                                    }
                                }
                                if (qd1Var.e()) {
                                    qd1Var.n(8);
                                }
                            }
                            if (this.n != 0) {
                                throw av7.a(null, null);
                            }
                            if (this.o != 0) {
                                throw av7.a(null, null);
                            }
                            if (this.p != 0) {
                                throw av7.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                f = qd1Var.f(8);
                                i3 += f;
                            } while (f == 255);
                            int i4 = (qd1Var.c << 3) + qd1Var.d;
                            if ((i4 & 7) == 0) {
                                xu7Var2.N(i4 >> 3);
                            } else {
                                qd1Var.g(i3 << 3, xu7Var2.a);
                                xu7Var2.N(0);
                            }
                            this.e.e(i3, xu7Var2);
                            gre.p(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                qd1Var.n((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? A2 = xu7Var.A();
                    if ((A2 & kk7.A3) == 224) {
                        this.k = A2;
                        this.h = (byte) 2;
                    } else if (A2 != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (xu7Var.A() == 86) {
                this.h = (byte) 1;
            }
        }
    }

    @Override // gu3
    public final void d() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.e = l74Var.T(l2cVar.d, 1);
        l2cVar.b();
        this.f = l2cVar.e;
    }

    @Override // gu3
    public final void e() {
    }

    @Override // gu3
    public final void f() {
    }
}
