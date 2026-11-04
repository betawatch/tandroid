package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final c4.f b;
    public final g2.y c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public i0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public d2.v m;
    public int n;
    public long o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }

    @Override // l4.i
    public final void a() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ba  */
    @Override // l4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g2.y yVar) {
        int i3;
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
                while (yVar.a() > 0) {
                    int i26 = this.i;
                    g2.y yVar2 = this.c;
                    if (i26 == 0) {
                        while (true) {
                            if (yVar.a() <= 0) {
                                break;
                            }
                            if (this.k) {
                                int A = yVar.A();
                                if (A == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = yVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    this.k = A == 11;
                                }
                            } else {
                                this.k = yVar.A() == 11;
                            }
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = yVar2.a;
                        int min = Math.min(yVar.a(), 128 - this.j);
                        yVar.k(this.j, min, bArr2);
                        int i27 = this.j + min;
                        this.j = i27;
                        if (i27 == 128) {
                            c4.f fVar = this.b;
                            fVar.J(0);
                            int[] iArr = e3.b.f;
                            int[] iArr2 = e3.b.d;
                            int f10 = fVar.f();
                            fVar.L(40);
                            Object[] objArr = fVar.j(5) > 10;
                            fVar.J(f10);
                            if (objArr == true) {
                                fVar.L(16);
                                int j10 = fVar.j(2);
                                char c2 = j10 != 0 ? j10 != 1 ? j10 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                fVar.L(3);
                                i13 = (fVar.j(11) + 1) * 2;
                                int j11 = fVar.j(2);
                                if (j11 == 3) {
                                    i14 = e3.b.e[fVar.j(2)];
                                    i15 = 3;
                                    i16 = 6;
                                } else {
                                    int j12 = fVar.j(2);
                                    int i28 = e3.b.c[j12];
                                    i14 = iArr2[j11];
                                    i15 = j12;
                                    i16 = i28;
                                }
                                i11 = i16 * 256;
                                int i29 = (i13 * i14) / (i16 * 32);
                                int j13 = fVar.j(3);
                                boolean i30 = fVar.i();
                                i10 = iArr[j13] + (i30 ? 1 : 0);
                                fVar.L(10);
                                if (fVar.i()) {
                                    fVar.L(8);
                                }
                                if (j13 == 0) {
                                    fVar.L(5);
                                    if (fVar.i()) {
                                        fVar.L(8);
                                    }
                                }
                                if (c2 == 1 && fVar.i()) {
                                    fVar.L(16);
                                }
                                if (fVar.i()) {
                                    if (j13 > 2) {
                                        fVar.L(2);
                                    }
                                    if ((j13 & 1) == 0 || j13 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        fVar.L(6);
                                    }
                                    if ((j13 & 4) != 0) {
                                        fVar.L(i21);
                                    }
                                    if (i30 && fVar.i()) {
                                        fVar.L(5);
                                    }
                                    if (c2 == 0) {
                                        if (fVar.i()) {
                                            i22 = 6;
                                            fVar.L(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (j13 == 0 && fVar.i()) {
                                            fVar.L(i22);
                                        }
                                        if (fVar.i()) {
                                            fVar.L(i22);
                                        }
                                        int j14 = fVar.j(2);
                                        if (j14 == 1) {
                                            fVar.L(5);
                                            i24 = 2;
                                        } else {
                                            if (j14 == 2) {
                                                fVar.L(12);
                                            } else if (j14 == 3) {
                                                int j15 = fVar.j(5);
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
                                                            fVar.L((j15 + 2) * i23);
                                                            fVar.c();
                                                        }
                                                    }
                                                }
                                                i23 = 8;
                                                i24 = 2;
                                                fVar.L((j15 + 2) * i23);
                                                fVar.c();
                                            }
                                            i24 = 2;
                                        }
                                        if (j13 < i24) {
                                            if (fVar.i()) {
                                                fVar.L(14);
                                            }
                                            if (j13 == 0 && fVar.i()) {
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
                                                if (j13 == 2) {
                                                    fVar.L(4);
                                                }
                                                if (j13 >= 6) {
                                                    fVar.L(2);
                                                }
                                                if (fVar.i()) {
                                                    i20 = 8;
                                                    fVar.L(8);
                                                } else {
                                                    i20 = 8;
                                                }
                                                if (j13 == 0 && fVar.i()) {
                                                    fVar.L(i20);
                                                }
                                                i18 = 3;
                                                if (j11 < 3) {
                                                    fVar.K();
                                                }
                                            }
                                            if (c2 == 0 && i17 != i18) {
                                                fVar.K();
                                            }
                                            if (c2 == 2 || !(i17 == i18 || fVar.i())) {
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
                                if (c2 == 0) {
                                    fVar.K();
                                }
                                if (c2 == 2) {
                                }
                                i19 = 6;
                                if (!fVar.i()) {
                                }
                                i12 = i29;
                            } else {
                                fVar.L(32);
                                int j16 = fVar.j(2);
                                String str2 = j16 == 3 ? null : "audio/ac3";
                                int j17 = fVar.j(6);
                                int i32 = e3.b.g[j17 / 2] * 1000;
                                int e10 = e3.b.e(j16, j17);
                                fVar.L(8);
                                int j18 = fVar.j(3);
                                if ((j18 & 1) == 0 || j18 == 1) {
                                    i3 = 2;
                                } else {
                                    i3 = 2;
                                    fVar.L(2);
                                }
                                if ((j18 & 4) != 0) {
                                    fVar.L(i3);
                                }
                                if (j18 == i3) {
                                    fVar.L(i3);
                                }
                                int i33 = j16 < 3 ? iArr2[j16] : -1;
                                i10 = iArr[j18] + (fVar.i() ? 1 : 0);
                                i11 = 1536;
                                str = str2;
                                i12 = i32;
                                i13 = e10;
                                i14 = i33;
                            }
                            d2.v vVar = this.m;
                            if (vVar == null || i10 != vVar.K || i14 != vVar.L || !Objects.equals(str, vVar.s)) {
                                d2.u uVar = new d2.u();
                                uVar.a = this.g;
                                uVar.q = u0.n(this.f);
                                uVar.r = u0.n(str);
                                uVar.J = i10;
                                uVar.K = i14;
                                uVar.d = this.d;
                                uVar.f = this.e;
                                uVar.i = i12;
                                if ("audio/ac3".equals(str)) {
                                    uVar.h = i12;
                                }
                                d2.v vVar2 = new d2.v(uVar);
                                this.m = vVar2;
                                this.h.g(vVar2);
                            }
                            this.n = i13;
                            this.l = (i11 * 1000000) / this.m.L;
                            yVar2.N(0);
                            this.h.e(128, yVar2);
                            this.i = 2;
                        }
                    } else if (i26 == 2) {
                        int min2 = Math.min(yVar.a(), this.n - this.j);
                        this.h.e(min2, yVar);
                        int i34 = this.j + min2;
                        this.j = i34;
                        if (i34 == this.n) {
                            zb.p(this.o != -9223372036854775807L);
                            this.h.d(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                this.h.getClass();
                while (yVar.a() > 0) {
                    int i35 = this.i;
                    g2.y yVar3 = this.c;
                    if (i35 == 0) {
                        while (yVar.a() > 0) {
                            if (this.k) {
                                int A2 = yVar.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr2 = A2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = yVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = yVar.A() == 172;
                            }
                        }
                    } else if (i35 == 1) {
                        byte[] bArr4 = yVar3.a;
                        int min3 = Math.min(yVar.a(), 16 - this.j);
                        yVar.k(this.j, min3, bArr4);
                        int i36 = this.j + min3;
                        this.j = i36;
                        if (i36 == 16) {
                            c4.f fVar2 = this.b;
                            fVar2.J(0);
                            a7.d m10 = e3.b.m(fVar2);
                            int i37 = m10.a;
                            d2.v vVar3 = this.m;
                            if (vVar3 == null || 2 != vVar3.K || i37 != vVar3.L || !"audio/ac4".equals(vVar3.s)) {
                                d2.u uVar2 = new d2.u();
                                uVar2.a = this.g;
                                uVar2.q = u0.n(this.f);
                                uVar2.r = u0.n("audio/ac4");
                                uVar2.J = 2;
                                uVar2.K = i37;
                                uVar2.d = this.d;
                                uVar2.f = this.e;
                                d2.v vVar4 = new d2.v(uVar2);
                                this.m = vVar4;
                                this.h.g(vVar4);
                            }
                            this.n = m10.b;
                            this.l = (m10.c * 1000000) / this.m.L;
                            yVar3.N(0);
                            this.h.e(16, yVar3);
                            this.i = 2;
                        }
                    } else if (i35 == 2) {
                        int min4 = Math.min(yVar.a(), this.n - this.j);
                        this.h.e(min4, yVar);
                        int i38 = this.j + min4;
                        this.j = i38;
                        if (i38 == this.n) {
                            zb.p(this.o != -9223372036854775807L);
                            this.h.d(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
        int i3 = this.a;
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        switch (this.a) {
            case 0:
                this.o = j10;
                break;
            default:
                this.o = j10;
                break;
        }
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                f0Var.b();
                f0Var.c();
                this.g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.i0(f0Var.c, 1);
                break;
            default:
                f0Var.b();
                f0Var.c();
                this.g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.i0(f0Var.c, 1);
                break;
        }
    }

    public b(int i3, int i10, String str, String str2) {
        this.a = i10;
        switch (i10) {
            case 1:
                c4.f fVar = new c4.f(new byte[16], 16);
                this.b = fVar;
                this.c = new g2.y((byte[]) fVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i3;
                this.f = str2;
                break;
            default:
                c4.f fVar2 = new c4.f(new byte[128], 128);
                this.b = fVar2;
                this.c = new g2.y((byte[]) fVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i3;
                this.f = str2;
                break;
        }
    }

    private final void b(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
