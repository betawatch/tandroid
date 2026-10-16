package j4;

import b2.w0;
import c3.i0;
import j$.util.Objects;
import org.telegram.messenger.MediaDataController;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final a4.g b;
    public final e2.x c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public i0 h;
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
    public final void a(e2.x xVar) {
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
                            gVar.m(0);
                            int[] iArr = c3.b.f;
                            int[] iArr2 = c3.b.d;
                            int e = gVar.e();
                            gVar.o(40);
                            Object[] objArr = gVar.g(5) > 10;
                            gVar.m(e);
                            if (objArr == true) {
                                gVar.o(16);
                                int g10 = gVar.g(2);
                                char c10 = g10 != 0 ? g10 != 1 ? g10 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                gVar.o(3);
                                i14 = (gVar.g(11) + 1) * 2;
                                int g11 = gVar.g(2);
                                if (g11 == 3) {
                                    i15 = c3.b.e[gVar.g(2)];
                                    i16 = 3;
                                    i17 = 6;
                                } else {
                                    int g12 = gVar.g(2);
                                    int i29 = c3.b.c[g12];
                                    i15 = iArr2[g11];
                                    i16 = g12;
                                    i17 = i29;
                                }
                                i12 = i17 * 256;
                                int i30 = (i14 * i15) / (i17 * 32);
                                int g13 = gVar.g(3);
                                boolean f7 = gVar.f();
                                i11 = iArr[g13] + (f7 ? 1 : 0);
                                gVar.o(10);
                                if (gVar.f()) {
                                    gVar.o(8);
                                }
                                if (g13 == 0) {
                                    gVar.o(5);
                                    if (gVar.f()) {
                                        gVar.o(8);
                                    }
                                }
                                if (c10 == 1 && gVar.f()) {
                                    gVar.o(16);
                                }
                                if (gVar.f()) {
                                    if (g13 > 2) {
                                        gVar.o(2);
                                    }
                                    if ((g13 & 1) == 0 || g13 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        gVar.o(6);
                                    }
                                    if ((g13 & 4) != 0) {
                                        gVar.o(i22);
                                    }
                                    if (f7 && gVar.f()) {
                                        gVar.o(5);
                                    }
                                    if (c10 == 0) {
                                        if (gVar.f()) {
                                            i23 = 6;
                                            gVar.o(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (g13 == 0 && gVar.f()) {
                                            gVar.o(i23);
                                        }
                                        if (gVar.f()) {
                                            gVar.o(i23);
                                        }
                                        int g14 = gVar.g(2);
                                        if (g14 == 1) {
                                            gVar.o(5);
                                            i25 = 2;
                                        } else {
                                            if (g14 == 2) {
                                                gVar.o(12);
                                            } else if (g14 == 3) {
                                                int g15 = gVar.g(5);
                                                if (gVar.f()) {
                                                    gVar.o(5);
                                                    if (gVar.f()) {
                                                        i26 = 4;
                                                        gVar.o(4);
                                                    } else {
                                                        i26 = 4;
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        gVar.o(i26);
                                                    }
                                                    if (gVar.f()) {
                                                        if (gVar.f()) {
                                                            gVar.o(i26);
                                                        }
                                                        if (gVar.f()) {
                                                            gVar.o(i26);
                                                        }
                                                    }
                                                }
                                                if (gVar.f()) {
                                                    gVar.o(5);
                                                    if (gVar.f()) {
                                                        gVar.o(7);
                                                        if (gVar.f()) {
                                                            i24 = 8;
                                                            gVar.o(8);
                                                            i25 = 2;
                                                            gVar.o((g15 + 2) * i24);
                                                            gVar.c();
                                                        }
                                                    }
                                                }
                                                i24 = 8;
                                                i25 = 2;
                                                gVar.o((g15 + 2) * i24);
                                                gVar.c();
                                            }
                                            i25 = 2;
                                        }
                                        if (g13 < i25) {
                                            if (gVar.f()) {
                                                gVar.o(14);
                                            }
                                            if (g13 == 0 && gVar.f()) {
                                                gVar.o(14);
                                            }
                                        }
                                        if (gVar.f()) {
                                            i18 = i16;
                                            if (i18 == 0) {
                                                gVar.o(5);
                                            } else {
                                                for (int i31 = 0; i31 < i17; i31++) {
                                                    if (gVar.f()) {
                                                        gVar.o(5);
                                                    }
                                                }
                                            }
                                            if (gVar.f()) {
                                                i19 = 3;
                                            } else {
                                                gVar.o(5);
                                                if (g13 == 2) {
                                                    gVar.o(4);
                                                }
                                                if (g13 >= 6) {
                                                    gVar.o(2);
                                                }
                                                if (gVar.f()) {
                                                    i21 = 8;
                                                    gVar.o(8);
                                                } else {
                                                    i21 = 8;
                                                }
                                                if (g13 == 0 && gVar.f()) {
                                                    gVar.o(i21);
                                                }
                                                i19 = 3;
                                                if (g11 < 3) {
                                                    gVar.n();
                                                }
                                            }
                                            if (c10 == 0 && i18 != i19) {
                                                gVar.n();
                                            }
                                            if (c10 == 2 || !(i18 == i19 || gVar.f())) {
                                                i20 = 6;
                                            } else {
                                                i20 = 6;
                                                gVar.o(6);
                                            }
                                            str = (!gVar.f() && gVar.g(i20) == 1 && gVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                            i13 = i30;
                                        }
                                    }
                                }
                                i18 = i16;
                                if (gVar.f()) {
                                }
                                if (c10 == 0) {
                                    gVar.n();
                                }
                                if (c10 == 2) {
                                }
                                i20 = 6;
                                if (!gVar.f()) {
                                }
                                i13 = i30;
                            } else {
                                gVar.o(32);
                                int g16 = gVar.g(2);
                                String str2 = g16 == 3 ? null : "audio/ac3";
                                int g17 = gVar.g(6);
                                int i32 = c3.b.g[g17 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int e7 = c3.b.e(g16, g17);
                                gVar.o(8);
                                int g18 = gVar.g(3);
                                if ((g18 & 1) == 0 || g18 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    gVar.o(2);
                                }
                                if ((g18 & 4) != 0) {
                                    gVar.o(i10);
                                }
                                if (g18 == i10) {
                                    gVar.o(i10);
                                }
                                int i33 = g16 < 3 ? iArr2[g16] : -1;
                                i11 = iArr[g18] + (gVar.f() ? 1 : 0);
                                i12 = 1536;
                                str = str2;
                                i13 = i32;
                                i14 = e7;
                                i15 = i33;
                            }
                            b2.x xVar3 = this.m;
                            if (xVar3 == null || i11 != xVar3.K || i15 != xVar3.L || !Objects.equals(str, xVar3.s)) {
                                b2.w wVar = new b2.w();
                                wVar.a = this.g;
                                wVar.q = w0.n(this.f);
                                wVar.r = w0.n(str);
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
                        int i34 = this.j + min2;
                        this.j = i34;
                        if (i34 == this.n) {
                            u6.p(this.o != -9223372036854775807L);
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
                    e2.x xVar5 = this.c;
                    if (i35 == 0) {
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
                    } else if (i35 == 1) {
                        byte[] bArr4 = xVar5.a;
                        int min3 = Math.min(xVar.a(), 16 - this.j);
                        xVar.k(this.j, min3, bArr4);
                        int i36 = this.j + min3;
                        this.j = i36;
                        if (i36 == 16) {
                            a4.g gVar2 = this.b;
                            gVar2.m(0);
                            a3.l m10 = c3.b.m(gVar2);
                            int i37 = m10.a;
                            b2.x xVar6 = this.m;
                            if (xVar6 == null || 2 != xVar6.K || i37 != xVar6.L || !"audio/ac4".equals(xVar6.s)) {
                                b2.w wVar2 = new b2.w();
                                wVar2.a = this.g;
                                wVar2.q = w0.n(this.f);
                                wVar2.r = w0.n("audio/ac4");
                                wVar2.J = 2;
                                wVar2.K = i37;
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
                    } else if (i35 == 2) {
                        int min4 = Math.min(xVar.a(), this.n - this.j);
                        this.h.d(min4, xVar);
                        int i38 = this.j + min4;
                        this.j = i38;
                        if (i38 == this.n) {
                            u6.p(this.o != -9223372036854775807L);
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
    public final void c() {
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
    public final void d(c3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.W(f0Var.c, 1);
                break;
            default:
                f0Var.b();
                f0Var.c();
                this.g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.W(f0Var.c, 1);
                break;
        }
    }

    @Override // j4.i
    public final void e(boolean z10) {
        int i10 = this.a;
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
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
                this.c = new e2.x(gVar.b);
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
                this.c = new e2.x(gVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f = str2;
                break;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
