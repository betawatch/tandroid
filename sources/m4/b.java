package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final d4.f b;
    public final h2.x c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public j0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public e2.u m;
    public int n;
    public long o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ba  */
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.a) {
            case 0:
                this.h.getClass();
                while (xVar.a() > 0) {
                    int i26 = this.i;
                    h2.x xVar2 = this.c;
                    if (i26 == 0) {
                        while (true) {
                            if (xVar.a() <= 0) {
                                break;
                            }
                            if (this.k) {
                                int A = xVar.A();
                                if (A == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = xVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    this.k = A == 11;
                                }
                            } else {
                                this.k = xVar.A() == 11;
                            }
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = xVar2.a;
                        int min = Math.min(xVar.a(), 128 - this.j);
                        xVar.k(this.j, min, bArr2);
                        int i27 = this.j + min;
                        this.j = i27;
                        if (i27 == 128) {
                            d4.f fVar = this.b;
                            fVar.J(0);
                            int[] iArr = f3.b.f;
                            int[] iArr2 = f3.b.d;
                            int f10 = fVar.f();
                            fVar.L(40);
                            Object[] objArr = fVar.j(5) > 10;
                            fVar.J(f10);
                            if (objArr == true) {
                                fVar.L(16);
                                int j3 = fVar.j(2);
                                char c10 = j3 != 0 ? j3 != 1 ? j3 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                fVar.L(3);
                                i13 = (fVar.j(11) + 1) * 2;
                                int j10 = fVar.j(2);
                                if (j10 == 3) {
                                    i14 = f3.b.e[fVar.j(2)];
                                    i15 = 3;
                                    i16 = 6;
                                } else {
                                    int j11 = fVar.j(2);
                                    int i28 = f3.b.c[j11];
                                    i14 = iArr2[j10];
                                    i15 = j11;
                                    i16 = i28;
                                }
                                i11 = i16 * 256;
                                int i29 = (i13 * i14) / (i16 * 32);
                                int j12 = fVar.j(3);
                                boolean i30 = fVar.i();
                                i10 = iArr[j12] + (i30 ? 1 : 0);
                                fVar.L(10);
                                if (fVar.i()) {
                                    fVar.L(8);
                                }
                                if (j12 == 0) {
                                    fVar.L(5);
                                    if (fVar.i()) {
                                        fVar.L(8);
                                    }
                                }
                                if (c10 == 1 && fVar.i()) {
                                    fVar.L(16);
                                }
                                if (fVar.i()) {
                                    if (j12 > 2) {
                                        fVar.L(2);
                                    }
                                    if ((j12 & 1) == 0 || j12 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        fVar.L(6);
                                    }
                                    if ((j12 & 4) != 0) {
                                        fVar.L(i21);
                                    }
                                    if (i30 && fVar.i()) {
                                        fVar.L(5);
                                    }
                                    if (c10 == 0) {
                                        if (fVar.i()) {
                                            i22 = 6;
                                            fVar.L(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (j12 == 0 && fVar.i()) {
                                            fVar.L(i22);
                                        }
                                        if (fVar.i()) {
                                            fVar.L(i22);
                                        }
                                        int j13 = fVar.j(2);
                                        if (j13 == 1) {
                                            fVar.L(5);
                                            i24 = 2;
                                        } else {
                                            if (j13 == 2) {
                                                fVar.L(12);
                                            } else if (j13 == 3) {
                                                int j14 = fVar.j(5);
                                                if (fVar.i()) {
                                                    fVar.L(5);
                                                    if (fVar.i()) {
                                                        i25 = 4;
                                                        fVar.L(4);
                                                    } else {
                                                        i25 = 4;
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        fVar.L(i25);
                                                    }
                                                    if (fVar.i()) {
                                                        if (fVar.i()) {
                                                            fVar.L(i25);
                                                        }
                                                        if (fVar.i()) {
                                                            fVar.L(i25);
                                                        }
                                                    }
                                                }
                                                if (fVar.i()) {
                                                    fVar.L(5);
                                                    if (fVar.i()) {
                                                        fVar.L(7);
                                                        if (fVar.i()) {
                                                            i23 = 8;
                                                            fVar.L(8);
                                                            i24 = 2;
                                                            fVar.L((j14 + 2) * i23);
                                                            fVar.c();
                                                        }
                                                    }
                                                }
                                                i23 = 8;
                                                i24 = 2;
                                                fVar.L((j14 + 2) * i23);
                                                fVar.c();
                                            }
                                            i24 = 2;
                                        }
                                        if (j12 < i24) {
                                            if (fVar.i()) {
                                                fVar.L(14);
                                            }
                                            if (j12 == 0 && fVar.i()) {
                                                fVar.L(14);
                                            }
                                        }
                                        if (fVar.i()) {
                                            i17 = i15;
                                            if (i17 == 0) {
                                                fVar.L(5);
                                            } else {
                                                for (int i31 = 0; i31 < i16; i31++) {
                                                    if (fVar.i()) {
                                                        fVar.L(5);
                                                    }
                                                }
                                            }
                                            if (fVar.i()) {
                                                i18 = 3;
                                            } else {
                                                fVar.L(5);
                                                if (j12 == 2) {
                                                    fVar.L(4);
                                                }
                                                if (j12 >= 6) {
                                                    fVar.L(2);
                                                }
                                                if (fVar.i()) {
                                                    i20 = 8;
                                                    fVar.L(8);
                                                } else {
                                                    i20 = 8;
                                                }
                                                if (j12 == 0 && fVar.i()) {
                                                    fVar.L(i20);
                                                }
                                                i18 = 3;
                                                if (j10 < 3) {
                                                    fVar.K();
                                                }
                                            }
                                            if (c10 == 0 && i17 != i18) {
                                                fVar.K();
                                            }
                                            if (c10 == 2 || !(i17 == i18 || fVar.i())) {
                                                i19 = 6;
                                            } else {
                                                i19 = 6;
                                                fVar.L(6);
                                            }
                                            str = (!fVar.i() && fVar.j(i19) == 1 && fVar.j(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                            i12 = i29;
                                        }
                                    }
                                }
                                i17 = i15;
                                if (fVar.i()) {
                                }
                                if (c10 == 0) {
                                    fVar.K();
                                }
                                if (c10 == 2) {
                                }
                                i19 = 6;
                                if (!fVar.i()) {
                                }
                                i12 = i29;
                            } else {
                                fVar.L(32);
                                int j15 = fVar.j(2);
                                String str2 = j15 == 3 ? null : "audio/ac3";
                                int j16 = fVar.j(6);
                                int i32 = f3.b.g[j16 / 2] * 1000;
                                int e10 = f3.b.e(j15, j16);
                                fVar.L(8);
                                int j17 = fVar.j(3);
                                if ((j17 & 1) == 0 || j17 == 1) {
                                    i7 = 2;
                                } else {
                                    i7 = 2;
                                    fVar.L(2);
                                }
                                if ((j17 & 4) != 0) {
                                    fVar.L(i7);
                                }
                                if (j17 == i7) {
                                    fVar.L(i7);
                                }
                                int i33 = j15 < 3 ? iArr2[j15] : -1;
                                i10 = iArr[j17] + (fVar.i() ? 1 : 0);
                                i11 = 1536;
                                str = str2;
                                i12 = i32;
                                i13 = e10;
                                i14 = i33;
                            }
                            e2.u uVar = this.m;
                            if (uVar == null || i10 != uVar.K || i14 != uVar.L || !Objects.equals(str, uVar.s)) {
                                e2.t tVar = new e2.t();
                                tVar.a = this.g;
                                tVar.q = s0.n(this.f);
                                tVar.r = s0.n(str);
                                tVar.J = i10;
                                tVar.K = i14;
                                tVar.d = this.d;
                                tVar.f = this.e;
                                tVar.i = i12;
                                if ("audio/ac3".equals(str)) {
                                    tVar.h = i12;
                                }
                                e2.u uVar2 = new e2.u(tVar);
                                this.m = uVar2;
                                this.h.g(uVar2);
                            }
                            this.n = i13;
                            this.l = (i11 * 1000000) / this.m.L;
                            xVar2.N(0);
                            this.h.b(128, xVar2);
                            this.i = 2;
                        }
                    } else if (i26 == 2) {
                        int min2 = Math.min(xVar.a(), this.n - this.j);
                        this.h.b(min2, xVar);
                        int i34 = this.j + min2;
                        this.j = i34;
                        if (i34 == this.n) {
                            ia.p(this.o != -9223372036854775807L);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                this.h.getClass();
                while (xVar.a() > 0) {
                    int i35 = this.i;
                    h2.x xVar3 = this.c;
                    if (i35 == 0) {
                        while (xVar.a() > 0) {
                            if (this.k) {
                                int A2 = xVar.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr2 = A2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = xVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = xVar.A() == 172;
                            }
                        }
                    } else if (i35 == 1) {
                        byte[] bArr4 = xVar3.a;
                        int min3 = Math.min(xVar.a(), 16 - this.j);
                        xVar.k(this.j, min3, bArr4);
                        int i36 = this.j + min3;
                        this.j = i36;
                        if (i36 == 16) {
                            d4.f fVar2 = this.b;
                            fVar2.J(0);
                            b7.d m10 = f3.b.m(fVar2);
                            int i37 = m10.a;
                            e2.u uVar3 = this.m;
                            if (uVar3 == null || 2 != uVar3.K || i37 != uVar3.L || !"audio/ac4".equals(uVar3.s)) {
                                e2.t tVar2 = new e2.t();
                                tVar2.a = this.g;
                                tVar2.q = s0.n(this.f);
                                tVar2.r = s0.n("audio/ac4");
                                tVar2.J = 2;
                                tVar2.K = i37;
                                tVar2.d = this.d;
                                tVar2.f = this.e;
                                e2.u uVar4 = new e2.u(tVar2);
                                this.m = uVar4;
                                this.h.g(uVar4);
                            }
                            this.n = m10.b;
                            this.l = (m10.c * 1000000) / this.m.L;
                            xVar3.N(0);
                            this.h.b(16, xVar3);
                            this.i = 2;
                        }
                    } else if (i35 == 2) {
                        int min4 = Math.min(xVar.a(), this.n - this.j);
                        this.h.b(min4, xVar);
                        int i38 = this.j + min4;
                        this.j = i38;
                        if (i38 == this.n) {
                            ia.p(this.o != -9223372036854775807L);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // m4.i
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // m4.i
    public final void e(boolean z9) {
        int i7 = this.a;
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        switch (this.a) {
            case 0:
                this.o = j3;
                break;
            default:
                this.o = j3;
                break;
        }
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                g0Var.b();
                g0Var.c();
                this.g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.O1(g0Var.c, 1);
                break;
            default:
                g0Var.b();
                g0Var.c();
                this.g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.O1(g0Var.c, 1);
                break;
        }
    }

    public b(int i7, int i10, String str, String str2) {
        this.a = i10;
        switch (i10) {
            case 1:
                d4.f fVar = new d4.f(new byte[16], 16);
                this.b = fVar;
                this.c = new h2.x((byte[]) fVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i7;
                this.f = str2;
                break;
            default:
                d4.f fVar2 = new d4.f(new byte[128], 128);
                this.b = fVar2;
                this.c = new h2.x((byte[]) fVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i7;
                this.f = str2;
                break;
        }
    }

    private final void a(boolean z9) {
    }

    private final void b(boolean z9) {
    }
}
