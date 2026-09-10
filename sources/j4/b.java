package j4;

import b2.r0;
import j$.util.Objects;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final a4.h b;
    public final e2.v c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public c3.h0 h;
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

    /* JADX WARN: Removed duplicated region for block: B:171:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03bc  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e2.v vVar) {
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
                e2.d.h(this.h);
                while (vVar.a() > 0) {
                    int i26 = this.i;
                    e2.v vVar2 = this.c;
                    if (i26 == 0) {
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
                    } else if (i26 == 1) {
                        byte[] bArr2 = vVar2.a;
                        int min = Math.min(vVar.a(), 128 - this.j);
                        vVar.h(this.j, min, bArr2);
                        int i27 = this.j + min;
                        this.j = i27;
                        if (i27 == 128) {
                            a4.h hVar = this.b;
                            hVar.q(0);
                            int[] iArr = c3.b.f;
                            int[] iArr2 = c3.b.d;
                            int g10 = hVar.g();
                            hVar.t(40);
                            boolean z10 = hVar.i(5) > 10;
                            hVar.q(g10);
                            if (z10) {
                                hVar.t(16);
                                int i28 = hVar.i(2);
                                char c10 = i28 != 0 ? i28 != 1 ? i28 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                hVar.t(3);
                                i12 = (hVar.i(11) + 1) * 2;
                                int i29 = hVar.i(2);
                                if (i29 == 3) {
                                    i14 = c3.b.e[hVar.i(2)];
                                    i17 = 6;
                                    i16 = 3;
                                } else {
                                    int i30 = hVar.i(2);
                                    int i31 = c3.b.c[i30];
                                    i14 = iArr2[i29];
                                    i16 = i30;
                                    i17 = i31;
                                }
                                i15 = i17 * 256;
                                int i32 = (i12 * i14) / (i17 * 32);
                                int i33 = hVar.i(3);
                                boolean h = hVar.h();
                                i11 = iArr[i33] + (h ? 1 : 0);
                                hVar.t(10);
                                if (hVar.h()) {
                                    hVar.t(8);
                                }
                                if (i33 == 0) {
                                    hVar.t(5);
                                    if (hVar.h()) {
                                        hVar.t(8);
                                    }
                                }
                                if (c10 == 1 && hVar.h()) {
                                    hVar.t(16);
                                }
                                if (hVar.h()) {
                                    if (i33 > 2) {
                                        hVar.t(2);
                                    }
                                    if ((i33 & 1) == 0 || i33 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        hVar.t(6);
                                    }
                                    if ((i33 & 4) != 0) {
                                        hVar.t(i22);
                                    }
                                    if (h && hVar.h()) {
                                        hVar.t(5);
                                    }
                                    if (c10 == 0) {
                                        if (hVar.h()) {
                                            i23 = 6;
                                            hVar.t(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i33 == 0 && hVar.h()) {
                                            hVar.t(i23);
                                        }
                                        if (hVar.h()) {
                                            hVar.t(i23);
                                        }
                                        int i34 = hVar.i(2);
                                        if (i34 == 1) {
                                            hVar.t(5);
                                        } else if (i34 == 2) {
                                            hVar.t(12);
                                        } else if (i34 == 3) {
                                            int i35 = hVar.i(5);
                                            if (hVar.h()) {
                                                hVar.t(5);
                                                if (hVar.h()) {
                                                    i25 = 4;
                                                    hVar.t(4);
                                                } else {
                                                    i25 = 4;
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    hVar.t(i25);
                                                }
                                                if (hVar.h()) {
                                                    if (hVar.h()) {
                                                        hVar.t(i25);
                                                    }
                                                    if (hVar.h()) {
                                                        hVar.t(i25);
                                                    }
                                                }
                                            }
                                            if (hVar.h()) {
                                                hVar.t(5);
                                                if (hVar.h()) {
                                                    hVar.t(7);
                                                    if (hVar.h()) {
                                                        hVar.t(8);
                                                        i24 = 2;
                                                        hVar.t((i35 + 2) * 8);
                                                        hVar.c();
                                                        if (i33 < i24) {
                                                            if (hVar.h()) {
                                                                hVar.t(14);
                                                            }
                                                            if (i33 == 0 && hVar.h()) {
                                                                hVar.t(14);
                                                            }
                                                        }
                                                        if (hVar.h()) {
                                                            i18 = i16;
                                                            if (i18 == 0) {
                                                                hVar.t(5);
                                                            } else {
                                                                for (int i36 = 0; i36 < i17; i36++) {
                                                                    if (hVar.h()) {
                                                                        hVar.t(5);
                                                                    }
                                                                }
                                                            }
                                                            if (hVar.h()) {
                                                                i19 = 3;
                                                            } else {
                                                                hVar.t(5);
                                                                if (i33 == 2) {
                                                                    hVar.t(4);
                                                                }
                                                                if (i33 >= 6) {
                                                                    hVar.t(2);
                                                                }
                                                                if (hVar.h()) {
                                                                    i21 = 8;
                                                                    hVar.t(8);
                                                                } else {
                                                                    i21 = 8;
                                                                }
                                                                if (i33 == 0 && hVar.h()) {
                                                                    hVar.t(i21);
                                                                }
                                                                i19 = 3;
                                                                if (i29 < 3) {
                                                                    hVar.s();
                                                                }
                                                            }
                                                            if (c10 == 0 && i18 != i19) {
                                                                hVar.s();
                                                            }
                                                            if (c10 == 2 || !(i18 == i19 || hVar.h())) {
                                                                i20 = 6;
                                                            } else {
                                                                i20 = 6;
                                                                hVar.t(6);
                                                            }
                                                            str = (!hVar.h() && hVar.i(i20) == 1 && hVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                            i13 = i32;
                                                        }
                                                    }
                                                }
                                            }
                                            i24 = 2;
                                            hVar.t((i35 + 2) * 8);
                                            hVar.c();
                                            if (i33 < i24) {
                                            }
                                            if (hVar.h()) {
                                            }
                                        }
                                        i24 = 2;
                                        if (i33 < i24) {
                                        }
                                        if (hVar.h()) {
                                        }
                                    }
                                }
                                i18 = i16;
                                if (hVar.h()) {
                                }
                                if (c10 == 0) {
                                    hVar.s();
                                }
                                if (c10 == 2) {
                                }
                                i20 = 6;
                                if (!hVar.h()) {
                                }
                                i13 = i32;
                            } else {
                                hVar.t(32);
                                int i37 = hVar.i(2);
                                String str2 = i37 == 3 ? null : "audio/ac3";
                                int i38 = hVar.i(6);
                                int i39 = c3.b.g[i38 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int f7 = c3.b.f(i37, i38);
                                hVar.t(8);
                                int i40 = hVar.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    hVar.t(2);
                                }
                                if ((i40 & 4) != 0) {
                                    hVar.t(i10);
                                }
                                if (i40 == i10) {
                                    hVar.t(i10);
                                }
                                int i41 = i37 < 3 ? iArr2[i37] : -1;
                                i11 = iArr[i40] + (hVar.h() ? 1 : 0);
                                str = str2;
                                i12 = f7;
                                i13 = i39;
                                i14 = i41;
                                i15 = 1536;
                            }
                            b2.s sVar = this.m;
                            if (sVar == null || i11 != sVar.J || i14 != sVar.K || !Objects.equals(str, sVar.r)) {
                                b2.r rVar = new b2.r();
                                rVar.a = this.g;
                                rVar.p = r0.n(this.f);
                                rVar.q = r0.n(str);
                                rVar.I = i11;
                                rVar.J = i14;
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
                            this.n = i12;
                            this.l = (i15 * 1000000) / this.m.K;
                            vVar2.J(0);
                            this.h.d(128, vVar2);
                            this.i = 2;
                        }
                    } else if (i26 == 2) {
                        int min2 = Math.min(vVar.a(), this.n - this.j);
                        this.h.d(min2, vVar);
                        int i42 = this.j + min2;
                        this.j = i42;
                        if (i42 == this.n) {
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
                    int i43 = this.i;
                    e2.v vVar3 = this.c;
                    if (i43 == 0) {
                        while (vVar.a() > 0) {
                            if (this.k) {
                                int x11 = vVar.x();
                                this.k = x11 == 172;
                                if (x11 == 64 || x11 == 65) {
                                    boolean z11 = x11 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = vVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z11 ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = vVar.x() == 172;
                            }
                        }
                    } else if (i43 == 1) {
                        byte[] bArr4 = vVar3.a;
                        int min3 = Math.min(vVar.a(), 16 - this.j);
                        vVar.h(this.j, min3, bArr4);
                        int i44 = this.j + min3;
                        this.j = i44;
                        if (i44 == 16) {
                            a4.h hVar2 = this.b;
                            hVar2.q(0);
                            a3.l m10 = c3.b.m(hVar2);
                            int i45 = m10.a;
                            b2.s sVar3 = this.m;
                            if (sVar3 == null || 2 != sVar3.J || i45 != sVar3.K || !"audio/ac4".equals(sVar3.r)) {
                                b2.r rVar2 = new b2.r();
                                rVar2.a = this.g;
                                rVar2.p = r0.n(this.f);
                                rVar2.q = r0.n("audio/ac4");
                                rVar2.I = 2;
                                rVar2.J = i45;
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
                    } else if (i43 == 2) {
                        int min4 = Math.min(vVar.a(), this.n - this.j);
                        this.h.d(min4, vVar);
                        int i46 = this.j + min4;
                        this.j = i46;
                        if (i46 == this.n) {
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
    public final void b() {
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
    public final void c(c3.q qVar, g0 g0Var) {
        switch (this.a) {
            case 0:
                g0Var.a();
                g0Var.b();
                this.g = g0Var.e;
                g0Var.b();
                this.h = qVar.I(g0Var.d, 1);
                break;
            default:
                g0Var.a();
                g0Var.b();
                this.g = g0Var.e;
                g0Var.b();
                this.h = qVar.I(g0Var.d, 1);
                break;
        }
    }

    @Override // j4.i
    public final void d(boolean z10) {
        int i10 = this.a;
    }

    @Override // j4.i
    public final void e(int i10, long j3) {
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
                a4.h hVar = new a4.h(new byte[16], 16);
                this.b = hVar;
                this.c = new e2.v(hVar.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f = str2;
                break;
            default:
                a4.h hVar2 = new a4.h(new byte[128], 128);
                this.b = hVar2;
                this.c = new e2.v(hVar2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i10;
                this.f = str2;
                break;
        }
    }

    private final void f(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
