// default package

import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mz5 implements rv3 {
    public final String a;
    public final int b;
    public final yw7 c;
    public final ye1 d;
    public yzb e;
    public String f;
    public go4 g;
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

    public mz5(String str, int i) {
        this.a = str;
        this.b = i;
        yw7 yw7Var = new yw7(1024);
        this.c = yw7Var;
        byte[] bArr = yw7Var.a;
        this.d = new ye1(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r23.m != false) goto L67;
     */
    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // rv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yw7 yw7Var) {
        int f;
        boolean e;
        this.e.getClass();
        while (yw7Var.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    yw7 yw7Var2 = this.c;
                    ye1 ye1Var = this.d;
                    if (b == 2) {
                        int A = ((this.k & (-225)) << 8) | yw7Var.A();
                        this.j = A;
                        if (A > yw7Var2.a.length) {
                            yw7Var2.K(A);
                            byte[] bArr = yw7Var2.a;
                            ye1Var.j(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            rjb.h();
                            return;
                        }
                        int min = Math.min(yw7Var.a(), this.j - this.i);
                        yw7Var.k(this.i, min, ye1Var.b);
                        int i = this.i + min;
                        this.i = i;
                        if (i == this.j) {
                            ye1Var.l(0);
                            if (!ye1Var.e()) {
                                this.m = true;
                                int f2 = ye1Var.f(1);
                                int f3 = f2 == 1 ? ye1Var.f(1) : 0;
                                this.n = f3;
                                if (f3 != 0) {
                                    throw bx7.a(null, null);
                                }
                                if (f2 == 1) {
                                    ye1Var.f((ye1Var.f(2) + 1) << 3);
                                }
                                if (!ye1Var.e()) {
                                    throw bx7.a(null, null);
                                }
                                this.o = ye1Var.f(6);
                                int f4 = ye1Var.f(4);
                                int f5 = ye1Var.f(3);
                                if (f4 != 0 || f5 != 0) {
                                    throw bx7.a(null, null);
                                }
                                if (f2 == 0) {
                                    int i2 = (ye1Var.c << 3) + ye1Var.d;
                                    int b2 = ye1Var.b();
                                    g1 j = bo2.j(ye1Var, true);
                                    this.v = j.c;
                                    this.s = j.a;
                                    this.u = j.b;
                                    int b3 = b2 - ye1Var.b();
                                    ye1Var.l(i2);
                                    byte[] bArr2 = new byte[(b3 + 7) / 8];
                                    ye1Var.g(b3, bArr2);
                                    fo4 fo4Var = new fo4();
                                    fo4Var.a = this.f;
                                    fo4Var.r = wf7.n("video/mp2t");
                                    fo4Var.s = wf7.n("audio/mp4a-latm");
                                    fo4Var.k = this.v;
                                    fo4Var.M = this.u;
                                    fo4Var.O = this.s;
                                    fo4Var.v = Collections.singletonList(bArr2);
                                    fo4Var.d = this.a;
                                    fo4Var.f = this.b;
                                    go4 go4Var = new go4(fo4Var);
                                    if (!go4Var.equals(this.g)) {
                                        this.g = go4Var;
                                        this.t = 1024000000 / go4Var.P;
                                        this.e.g(go4Var);
                                    }
                                } else {
                                    int b4 = ye1Var.b();
                                    g1 j2 = bo2.j(ye1Var, true);
                                    this.v = j2.c;
                                    this.s = j2.a;
                                    this.u = j2.b;
                                    ye1Var.n(ye1Var.f((ye1Var.f(2) + 1) << 3) - (b4 - ye1Var.b()));
                                }
                                int f6 = ye1Var.f(3);
                                this.p = f6;
                                if (f6 == 0) {
                                    ye1Var.n(8);
                                } else if (f6 == 1) {
                                    ye1Var.n(9);
                                } else if (f6 == 3 || f6 == 4 || f6 == 5) {
                                    ye1Var.n(6);
                                } else {
                                    if (f6 != 6 && f6 != 7) {
                                        rjb.h();
                                        return;
                                    }
                                    ye1Var.n(1);
                                }
                                boolean e2 = ye1Var.e();
                                this.q = e2;
                                this.r = 0L;
                                if (e2) {
                                    if (f2 == 1) {
                                        this.r = ye1Var.f((ye1Var.f(2) + 1) << 3);
                                    } else {
                                        do {
                                            e = ye1Var.e();
                                            this.r = (this.r << 8) + ye1Var.f(8);
                                        } while (e);
                                    }
                                }
                                if (ye1Var.e()) {
                                    ye1Var.n(8);
                                }
                            }
                            if (this.n != 0) {
                                throw bx7.a(null, null);
                            }
                            if (this.o != 0) {
                                throw bx7.a(null, null);
                            }
                            if (this.p != 0) {
                                throw bx7.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                f = ye1Var.f(8);
                                i3 += f;
                            } while (f == 255);
                            int i4 = (ye1Var.c << 3) + ye1Var.d;
                            if ((i4 & 7) == 0) {
                                yw7Var2.N(i4 >> 3);
                            } else {
                                ye1Var.g(i3 << 3, yw7Var2.a);
                                yw7Var2.N(0);
                            }
                            this.e.e(i3, yw7Var2);
                            jte.p(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                ye1Var.n((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? A2 = yw7Var.A();
                    if ((A2 & nm7.A3) == 224) {
                        this.k = A2;
                        this.h = (byte) 2;
                    } else if (A2 != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (yw7Var.A() == 86) {
                this.h = (byte) 1;
            }
        }
    }

    @Override // rv3
    public final void d() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.e = u84Var.c0(l4cVar.d, 1);
        l4cVar.b();
        this.f = l4cVar.e;
    }

    @Override // rv3
    public final void e() {
    }

    @Override // rv3
    public final void f() {
    }
}
