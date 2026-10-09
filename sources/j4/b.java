package j4;

import b2.r0;
import c3.h0;
import j$.util.Objects;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final a4.g b;
    public final e2.v c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public h0 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public b2.s m;
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
    public final void a(e2.v vVar) {
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
                e2.d.h(this.h);
                while (vVar.a() > 0) {
                    int i27 = this.i;
                    e2.v vVar2 = this.c;
                    if (i27 == 0) {
                        while (true) {
                            if (vVar.a() <= 0) {
                                break;
                            }
                            if (this.k) {
                                int x10 = vVar.x();
                                if (x10 == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = vVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    this.k = x10 == 11;
                                }
                            } else {
                                this.k = vVar.x() == 11;
                            }
                        }
                    } else if (i27 == 1) {
                        byte[] bArr2 = vVar2.a;
                        int min = Math.min(vVar.a(), 128 - this.j);
                        vVar.h(this.j, min, bArr2);
                        int i28 = this.j + min;
                        this.j = i28;
                        if (i28 == 128) {
                            a4.g gVar = this.b;
                            gVar.q(0);
                            int[] iArr = c3.b.f;
                            int[] iArr2 = c3.b.d;
                            int g10 = gVar.g();
                            gVar.t(40);
                            Object[] objArr = gVar.i(5) > 10;
                            gVar.q(g10);
                            if (objArr == true) {
                                gVar.t(16);
                                int i29 = gVar.i(2);
                                char c10 = i29 != 0 ? i29 != 1 ? i29 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                gVar.t(3);
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
                                gVar.t(10);
                                if (gVar.h()) {
                                    gVar.t(8);
                                }
                                if (i34 == 0) {
                                    gVar.t(5);
                                    if (gVar.h()) {
                                        gVar.t(8);
                                    }
                                }
                                if (c10 == 1 && gVar.h()) {
                                    gVar.t(16);
                                }
                                if (gVar.h()) {
                                    if (i34 > 2) {
                                        gVar.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        gVar.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        gVar.t(i22);
                                    }
                                    if (h && gVar.h()) {
                                        gVar.t(5);
                                    }
                                    if (c10 == 0) {
                                        if (gVar.h()) {
                                            i23 = 6;
                                            gVar.t(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i34 == 0 && gVar.h()) {
                                            gVar.t(i23);
                                        }
                                        if (gVar.h()) {
                                            gVar.t(i23);
                                        }
                                        int i35 = gVar.i(2);
                                        if (i35 == 1) {
                                            gVar.t(5);
                                            i25 = 2;
                                        } else {
                                            if (i35 == 2) {
                                                gVar.t(12);
                                            } else if (i35 == 3) {
                                                int i36 = gVar.i(5);
                                                if (gVar.h()) {
                                                    gVar.t(5);
                                                    if (gVar.h()) {
                                                        i26 = 4;
                                                        gVar.t(4);
                                                    } else {
                                                        i26 = 4;
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        gVar.t(i26);
                                                    }
                                                    if (gVar.h()) {
                                                        if (gVar.h()) {
                                                            gVar.t(i26);
                                                        }
                                                        if (gVar.h()) {
                                                            gVar.t(i26);
                                                        }
                                                    }
                                                }
                                                if (gVar.h()) {
                                                    gVar.t(5);
                                                    if (gVar.h()) {
                                                        gVar.t(7);
                                                        if (gVar.h()) {
                                                            i24 = 8;
                                                            gVar.t(8);
                                                            i25 = 2;
                                                            gVar.t((i36 + 2) * i24);
                                                            gVar.c();
                                                        }
                                                    }
                                                }
                                                i24 = 8;
                                                i25 = 2;
                                                gVar.t((i36 + 2) * i24);
                                                gVar.c();
                                            }
                                            i25 = 2;
                                        }
                                        if (i34 < i25) {
                                            if (gVar.h()) {
                                                gVar.t(14);
                                            }
                                            if (i34 == 0 && gVar.h()) {
                                                gVar.t(14);
                                            }
                                        }
                                        if (gVar.h()) {
                                            i18 = i16;
                                            if (i18 == 0) {
                                                gVar.t(5);
                                            } else {
                                                for (int i37 = 0; i37 < i17; i37++) {
                                                    if (gVar.h()) {
                                                        gVar.t(5);
                                                    }
                                                }
                                            }
                                            if (gVar.h()) {
                                                i19 = 3;
                                            } else {
                                                gVar.t(5);
                                                if (i34 == 2) {
                                                    gVar.t(4);
                                                }
                                                if (i34 >= 6) {
                                                    gVar.t(2);
                                                }
                                                if (gVar.h()) {
                                                    i21 = 8;
                                                    gVar.t(8);
                                                } else {
                                                    i21 = 8;
                                                }
                                                if (i34 == 0 && gVar.h()) {
                                                    gVar.t(i21);
                                                }
                                                i19 = 3;
                                                if (i30 < 3) {
                                                    gVar.s();
                                                }
                                            }
                                            if (c10 == 0 && i18 != i19) {
                                                gVar.s();
                                            }
                                            if (c10 == 2 || !(i18 == i19 || gVar.h())) {
                                                i20 = 6;
                                            } else {
                                                i20 = 6;
                                                gVar.t(6);
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
                                    gVar.s();
                                }
                                if (c10 == 2) {
                                }
                                i20 = 6;
                                if (!gVar.h()) {
                                }
                                i13 = i33;
                            } else {
                                gVar.t(32);
                                int i38 = gVar.i(2);
                                String str2 = i38 == 3 ? null : "audio/ac3";
                                int i39 = gVar.i(6);
                                int i40 = c3.b.g[i39 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int f7 = c3.b.f(i38, i39);
                                gVar.t(8);
                                int i41 = gVar.i(3);
                                if ((i41 & 1) == 0 || i41 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    gVar.t(2);
                                }
                                if ((i41 & 4) != 0) {
                                    gVar.t(i10);
                                }
                                if (i41 == i10) {
                                    gVar.t(i10);
                                }
                                int i42 = i38 < 3 ? iArr2[i38] : -1;
                                i11 = iArr[i41] + (gVar.h() ? 1 : 0);
                                i12 = 1536;
                                str = str2;
                                i13 = i40;
                                i14 = f7;
                                i15 = i42;
                            }
                            b2.s sVar = this.m;
                            if (sVar == null || i11 != sVar.J || i15 != sVar.K || !Objects.equals(str, sVar.r)) {
                                b2.r rVar = new b2.r();
                                rVar.a = this.g;
                                rVar.p = r0.n(this.f);
                                rVar.q = r0.n(str);
                                rVar.I = i11;
                                rVar.J = i15;
                                rVar.d = this.d;
                                rVar.f = this.e;
                                rVar.i = i13;
                                if ("audio/ac3".equals(str)) {
                                    rVar.h = i13;
                                }
                                b2.s sVar2 = new b2.s(rVar);
                                this.m = sVar2;
                                this.h.b(sVar2);
                            }
                            this.n = i14;
                            this.l = (i12 * 1000000) / this.m.K;
                            vVar2.J(0);
                            this.h.d(128, vVar2);
                            this.i = 2;
                        }
                    } else if (i27 == 2) {
                        int min2 = Math.min(vVar.a(), this.n - this.j);
                        this.h.d(min2, vVar);
                        int i43 = this.j + min2;
                        this.j = i43;
                        if (i43 == this.n) {
                            e2.d.g(this.o != -9223372036854775807L);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                e2.d.h(this.h);
                while (vVar.a() > 0) {
                    int i44 = this.i;
                    e2.v vVar3 = this.c;
                    if (i44 == 0) {
                        while (vVar.a() > 0) {
                            if (this.k) {
                                int x11 = vVar.x();
                                this.k = x11 == 172;
                                if (x11 == 64 || x11 == 65) {
                                    Object[] objArr2 = x11 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = vVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = vVar.x() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = vVar3.a;
                        int min3 = Math.min(vVar.a(), 16 - this.j);
                        vVar.h(this.j, min3, bArr4);
                        int i45 = this.j + min3;
                        this.j = i45;
                        if (i45 == 16) {
                            a4.g gVar2 = this.b;
                            gVar2.q(0);
                            a3.l m10 = c3.b.m(gVar2);
                            int i46 = m10.a;
                            b2.s sVar3 = this.m;
                            if (sVar3 == null || 2 != sVar3.J || i46 != sVar3.K || !"audio/ac4".equals(sVar3.r)) {
                                b2.r rVar2 = new b2.r();
                                rVar2.a = this.g;
                                rVar2.p = r0.n(this.f);
                                rVar2.q = r0.n("audio/ac4");
                                rVar2.I = 2;
                                rVar2.J = i46;
                                rVar2.d = this.d;
                                rVar2.f = this.e;
                                b2.s sVar4 = new b2.s(rVar2);
                                this.m = sVar4;
                                this.h.b(sVar4);
                            }
                            this.n = m10.b;
                            this.l = (m10.c * 1000000) / this.m.K;
                            vVar3.J(0);
                            this.h.d(16, vVar3);
                            this.i = 2;
                        }
                    } else if (i44 == 2) {
                        int min4 = Math.min(vVar.a(), this.n - this.j);
                        this.h.d(min4, vVar);
                        int i47 = this.j + min4;
                        this.j = i47;
                        if (i47 == this.n) {
                            e2.d.g(this.o != -9223372036854775807L);
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
                this.h = qVar.f2(f0Var.c, 1);
                break;
            default:
                f0Var.b();
                f0Var.c();
                this.g = (String) f0Var.e;
                f0Var.c();
                this.h = qVar.f2(f0Var.c, 1);
                break;
        }
    }

    @Override // j4.i
    public final void e(boolean z10) {
        int i10 = this.a;
    }

    @Override // j4.i
    public final void f(int i10, long j3) {
        switch (this.a) {
            case 0:
                this.o = j3;
                break;
            default:
                this.o = j3;
                break;
        }
    }

    public b(int i10, int i11, String str, String str2) {
        this.a = i11;
        switch (i11) {
            case 1:
                a4.g gVar = new a4.g(new byte[16], 16);
                this.b = gVar;
                this.c = new e2.v(gVar.b);
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
                this.c = new e2.v(gVar2.b);
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
