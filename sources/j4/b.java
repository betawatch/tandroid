package j4;

import b2.v0;
import c3.k0;
import j$.util.Objects;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final a4.g b;
    public final e2.x c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public k0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public b2.x m;
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
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(e2.x xVar) {
        int i10;
        int i11;
        int i12;
        String str;
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
        int i26;
        switch (this.a) {
            case 0:
                this.h.getClass();
                while (xVar.a() > 0) {
                    int i27 = this.i;
                    e2.x xVar2 = this.c;
                    if (i27 == 0) {
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
                    } else if (i27 == 1) {
                        byte[] bArr2 = xVar2.a;
                        int min = Math.min(xVar.a(), 128 - this.j);
                        xVar.k(this.j, min, bArr2);
                        int i28 = this.j + min;
                        this.j = i28;
                        if (i28 == 128) {
                            a4.g gVar = this.b;
                            gVar.d0(0);
                            int[] iArr = c3.b.f;
                            int[] iArr2 = c3.b.d;
                            int f7 = gVar.f();
                            gVar.f0(40);
                            Object[] objArr = gVar.i(5) > 10;
                            gVar.d0(f7);
                            if (objArr == true) {
                                gVar.f0(16);
                                int i29 = gVar.i(2);
                                char c10 = i29 != 0 ? i29 != 1 ? i29 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                gVar.f0(3);
                                i14 = (gVar.i(11) + 1) * 2;
                                int i30 = gVar.i(2);
                                if (i30 == 3) {
                                    i15 = c3.b.e[gVar.i(2)];
                                    i16 = 3;
                                    i17 = 6;
                                } else {
                                    int i31 = gVar.i(2);
                                    int i32 = c3.b.c[i31];
                                    i15 = iArr2[i30];
                                    i16 = i31;
                                    i17 = i32;
                                }
                                i12 = i17 * 256;
                                int i33 = (i14 * i15) / (i17 * 32);
                                int i34 = gVar.i(3);
                                boolean h = gVar.h();
                                i11 = iArr[i34] + (h ? 1 : 0);
                                gVar.f0(10);
                                if (gVar.h()) {
                                    gVar.f0(8);
                                }
                                if (i34 == 0) {
                                    gVar.f0(5);
                                    if (gVar.h()) {
                                        gVar.f0(8);
                                    }
                                }
                                if (c10 == 1 && gVar.h()) {
                                    gVar.f0(16);
                                }
                                if (gVar.h()) {
                                    if (i34 > 2) {
                                        gVar.f0(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        gVar.f0(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        gVar.f0(i22);
                                    }
                                    if (h && gVar.h()) {
                                        gVar.f0(5);
                                    }
                                    if (c10 == 0) {
                                        if (gVar.h()) {
                                            i23 = 6;
                                            gVar.f0(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i34 == 0 && gVar.h()) {
                                            gVar.f0(i23);
                                        }
                                        if (gVar.h()) {
                                            gVar.f0(i23);
                                        }
                                        int i35 = gVar.i(2);
                                        if (i35 == 1) {
                                            gVar.f0(5);
                                            i25 = 2;
                                        } else {
                                            if (i35 == 2) {
                                                gVar.f0(12);
                                            } else if (i35 == 3) {
                                                int i36 = gVar.i(5);
                                                if (gVar.h()) {
                                                    gVar.f0(5);
                                                    if (gVar.h()) {
                                                        i26 = 4;
                                                        gVar.f0(4);
                                                    } else {
                                                        i26 = 4;
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.f0(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        if (gVar.h()) {
                                                            gVar.f0(i26);
                                                        }
                                                        if (gVar.h()) {
                                                            gVar.f0(i26);
                                                        }
                                                    }
                                                }
                                                if (gVar.h()) {
                                                    gVar.f0(5);
                                                    if (gVar.h()) {
                                                        gVar.f0(7);
                                                        if (gVar.h()) {
                                                            i24 = 8;
                                                            gVar.f0(8);
                                                            i25 = 2;
                                                            gVar.f0((i36 + 2) * i24);
                                                            gVar.c();
                                                        }
                                                    }
                                                }
                                                i24 = 8;
                                                i25 = 2;
                                                gVar.f0((i36 + 2) * i24);
                                                gVar.c();
                                            }
                                            i25 = 2;
                                        }
                                        if (i34 < i25) {
                                            if (gVar.h()) {
                                                gVar.f0(14);
                                            }
                                            if (i34 == 0 && gVar.h()) {
                                                gVar.f0(14);
                                            }
                                        }
                                        if (gVar.h()) {
                                            i18 = i16;
                                            if (i18 == 0) {
                                                gVar.f0(5);
                                            } else {
                                                for (int i37 = 0; i37 < i17; i37++) {
                                                    if (gVar.h()) {
                                                        gVar.f0(5);
                                                    }
                                                }
                                            }
                                            if (gVar.h()) {
                                                i19 = 3;
                                            } else {
                                                gVar.f0(5);
                                                if (i34 == 2) {
                                                    gVar.f0(4);
                                                }
                                                if (i34 >= 6) {
                                                    gVar.f0(2);
                                                }
                                                if (gVar.h()) {
                                                    i21 = 8;
                                                    gVar.f0(8);
                                                } else {
                                                    i21 = 8;
                                                }
                                                if (i34 == 0 && gVar.h()) {
                                                    gVar.f0(i21);
                                                }
                                                i19 = 3;
                                                if (i30 < 3) {
                                                    gVar.e0();
                                                }
                                            }
                                            if (c10 == 0 && i18 != i19) {
                                                gVar.e0();
                                            }
                                            if (c10 == 2 || !(i18 == i19 || gVar.h())) {
                                                i20 = 6;
                                            } else {
                                                i20 = 6;
                                                gVar.f0(6);
                                            }
                                            str = (!gVar.h() && gVar.i(i20) == 1 && gVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                            i13 = i33;
                                        }
                                    }
                                }
                                i18 = i16;
                                if (gVar.h()) {
                                }
                                if (c10 == 0) {
                                    gVar.e0();
                                }
                                if (c10 == 2) {
                                }
                                i20 = 6;
                                if (!gVar.h()) {
                                }
                                i13 = i33;
                            } else {
                                gVar.f0(32);
                                int i38 = gVar.i(2);
                                String str2 = i38 == 3 ? null : "audio/ac3";
                                int i39 = gVar.i(6);
                                int i40 = c3.b.g[i39 / 2] * 1000;
                                int e = c3.b.e(i38, i39);
                                gVar.f0(8);
                                int i41 = gVar.i(3);
                                if ((i41 & 1) == 0 || i41 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    gVar.f0(2);
                                }
                                if ((i41 & 4) != 0) {
                                    gVar.f0(i10);
                                }
                                if (i41 == i10) {
                                    gVar.f0(i10);
                                }
                                int i42 = i38 < 3 ? iArr2[i38] : -1;
                                i11 = iArr[i41] + (gVar.h() ? 1 : 0);
                                i12 = 1536;
                                str = str2;
                                i13 = i40;
                                i14 = e;
                                i15 = i42;
                            }
                            b2.x xVar3 = this.m;
                            if (xVar3 == null || i11 != xVar3.K || i15 != xVar3.L || !Objects.equals(str, xVar3.s)) {
                                b2.w wVar = new b2.w();
                                wVar.a = this.g;
                                wVar.q = v0.n(this.f);
                                wVar.r = v0.n(str);
                                wVar.J = i11;
                                wVar.K = i15;
                                wVar.d = this.d;
                                wVar.f = this.e;
                                wVar.i = i13;
                                if ("audio/ac3".equals(str)) {
                                    wVar.h = i13;
                                }
                                b2.x xVar4 = new b2.x(wVar);
                                this.m = xVar4;
                                this.h.b(xVar4);
                            }
                            this.n = i14;
                            this.l = (i12 * 1000000) / this.m.L;
                            xVar2.N(0);
                            this.h.d(128, xVar2);
                            this.i = 2;
                        }
                    } else if (i27 == 2) {
                        int min2 = Math.min(xVar.a(), this.n - this.j);
                        this.h.d(min2, xVar);
                        int i43 = this.j + min2;
                        this.j = i43;
                        if (i43 == this.n) {
                            t6.p(this.o != -9223372036854775807L);
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
                    int i44 = this.i;
                    e2.x xVar5 = this.c;
                    if (i44 == 0) {
                        while (xVar.a() > 0) {
                            if (this.k) {
                                int A2 = xVar.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr2 = A2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = xVar5.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = xVar.A() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = xVar5.a;
                        int min3 = Math.min(xVar.a(), 16 - this.j);
                        xVar.k(this.j, min3, bArr4);
                        int i45 = this.j + min3;
                        this.j = i45;
                        if (i45 == 16) {
                            a4.g gVar2 = this.b;
                            gVar2.d0(0);
                            a3.l m10 = c3.b.m(gVar2);
                            int i46 = m10.a;
                            b2.x xVar6 = this.m;
                            if (xVar6 == null || 2 != xVar6.K || i46 != xVar6.L || !"audio/ac4".equals(xVar6.s)) {
                                b2.w wVar2 = new b2.w();
                                wVar2.a = this.g;
                                wVar2.q = v0.n(this.f);
                                wVar2.r = v0.n("audio/ac4");
                                wVar2.J = 2;
                                wVar2.K = i46;
                                wVar2.d = this.d;
                                wVar2.f = this.e;
                                b2.x xVar7 = new b2.x(wVar2);
                                this.m = xVar7;
                                this.h.b(xVar7);
                            }
                            this.n = m10.b;
                            this.l = (m10.c * 1000000) / this.m.L;
                            xVar5.N(0);
                            this.h.d(16, xVar5);
                            this.i = 2;
                        }
                    } else if (i44 == 2) {
                        int min4 = Math.min(xVar.a(), this.n - this.j);
                        this.h.d(min4, xVar);
                        int i47 = this.j + min4;
                        this.j = i47;
                        if (i47 == this.n) {
                            t6.p(this.o != -9223372036854775807L);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // j4.i
    public final void e() {
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

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                g0Var.b();
                g0Var.c();
                this.g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.I1(g0Var.c, 1);
                break;
            default:
                g0Var.b();
                g0Var.c();
                this.g = (String) g0Var.e;
                g0Var.c();
                this.h = qVar.I1(g0Var.c, 1);
                break;
        }
    }

    @Override // j4.i
    public final void g(boolean z10) {
        int i10 = this.a;
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        switch (this.a) {
            case 0:
                this.o = j10;
                break;
            default:
                this.o = j10;
                break;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.b = gVar;
                this.c = new e2.x((byte[]) gVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f = str2;
                break;
            default:
                a4.g gVar2 = new a4.g(new byte[128], 128);
                this.b = gVar2;
                this.c = new e2.x((byte[]) gVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f = str2;
                break;
        }
    }

    private final void a(boolean z10) {
    }

    private final void b(boolean z10) {
    }
}
