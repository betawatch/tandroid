package b4;

import j3.m0;
import j3.n0;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final h5.v b;
    public final h5.w c;
    public final String d;
    public String e;
    public r3.v f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public n0 k;
    public int l;
    public long m;

    public b(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                h5.v vVar = new h5.v(new byte[16], 16);
                this.b = vVar;
                this.c = new h5.w(vVar.b);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                h5.v vVar2 = new h5.v(new byte[128], 128);
                this.b = vVar2;
                this.c = new h5.w(vVar2.b);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039a  */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
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
                h5.a.j(this.f);
                while (wVar.a() > 0) {
                    int i26 = this.g;
                    h5.w wVar2 = this.c;
                    if (i26 == 0) {
                        while (true) {
                            if (wVar.a() <= 0) {
                                break;
                            }
                            if (this.i) {
                                int u10 = wVar.u();
                                if (u10 == 119) {
                                    this.i = false;
                                    this.g = 1;
                                    byte[] bArr = wVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.h = 2;
                                } else {
                                    this.i = u10 == 11;
                                }
                            } else {
                                this.i = wVar.u() == 11;
                            }
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = wVar2.a;
                        int min = Math.min(wVar.a(), 128 - this.h);
                        wVar.e(this.h, min, bArr2);
                        int i27 = this.h + min;
                        this.h = i27;
                        if (i27 == 128) {
                            h5.v vVar = this.b;
                            vVar.p(0);
                            int[] iArr = l3.a.f;
                            int[] iArr2 = l3.a.d;
                            int g10 = vVar.g();
                            vVar.s(40);
                            boolean z4 = vVar.i(5) > 10;
                            vVar.p(g10);
                            if (z4) {
                                vVar.s(16);
                                int i28 = vVar.i(2);
                                char c3 = i28 != 0 ? i28 != 1 ? i28 != 2 ? (char) 65535 : (char) 2 : (char) 1 : (char) 0;
                                vVar.s(3);
                                i12 = (vVar.i(11) + 1) * 2;
                                int i29 = vVar.i(2);
                                if (i29 == 3) {
                                    i14 = l3.a.e[vVar.i(2)];
                                    i17 = 6;
                                    i16 = 3;
                                } else {
                                    int i30 = vVar.i(2);
                                    int i31 = l3.a.c[i30];
                                    i14 = iArr2[i29];
                                    i16 = i30;
                                    i17 = i31;
                                }
                                i15 = i17 * 256;
                                int i32 = (i12 * i14) / (i17 * 32);
                                int i33 = vVar.i(3);
                                boolean h = vVar.h();
                                i11 = iArr[i33] + (h ? 1 : 0);
                                vVar.s(10);
                                if (vVar.h()) {
                                    vVar.s(8);
                                }
                                if (i33 == 0) {
                                    vVar.s(5);
                                    if (vVar.h()) {
                                        vVar.s(8);
                                    }
                                }
                                if (c3 == 1 && vVar.h()) {
                                    vVar.s(16);
                                }
                                if (vVar.h()) {
                                    if (i33 > 2) {
                                        vVar.s(2);
                                    }
                                    if ((i33 & 1) == 0 || i33 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        vVar.s(6);
                                    }
                                    if ((i33 & 4) != 0) {
                                        vVar.s(i22);
                                    }
                                    if (h && vVar.h()) {
                                        vVar.s(5);
                                    }
                                    if (c3 == 0) {
                                        if (vVar.h()) {
                                            i23 = 6;
                                            vVar.s(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i33 == 0 && vVar.h()) {
                                            vVar.s(i23);
                                        }
                                        if (vVar.h()) {
                                            vVar.s(i23);
                                        }
                                        int i34 = vVar.i(2);
                                        if (i34 == 1) {
                                            vVar.s(5);
                                        } else if (i34 == 2) {
                                            vVar.s(12);
                                        } else if (i34 == 3) {
                                            int i35 = vVar.i(5);
                                            if (vVar.h()) {
                                                vVar.s(5);
                                                if (vVar.h()) {
                                                    i25 = 4;
                                                    vVar.s(4);
                                                } else {
                                                    i25 = 4;
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(i25);
                                                }
                                                if (vVar.h()) {
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                }
                                            }
                                            if (vVar.h()) {
                                                vVar.s(5);
                                                if (vVar.h()) {
                                                    vVar.s(7);
                                                    if (vVar.h()) {
                                                        vVar.s(8);
                                                        i24 = 2;
                                                        vVar.s((i35 + 2) * 8);
                                                        vVar.c();
                                                        if (i33 < i24) {
                                                            if (vVar.h()) {
                                                                vVar.s(14);
                                                            }
                                                            if (i33 == 0 && vVar.h()) {
                                                                vVar.s(14);
                                                            }
                                                        }
                                                        if (vVar.h()) {
                                                            i18 = i16;
                                                            if (i18 == 0) {
                                                                vVar.s(5);
                                                            } else {
                                                                for (int i36 = 0; i36 < i17; i36++) {
                                                                    if (vVar.h()) {
                                                                        vVar.s(5);
                                                                    }
                                                                }
                                                            }
                                                            if (vVar.h()) {
                                                                i19 = 3;
                                                            } else {
                                                                vVar.s(5);
                                                                if (i33 == 2) {
                                                                    vVar.s(4);
                                                                }
                                                                if (i33 >= 6) {
                                                                    vVar.s(2);
                                                                }
                                                                if (vVar.h()) {
                                                                    i21 = 8;
                                                                    vVar.s(8);
                                                                } else {
                                                                    i21 = 8;
                                                                }
                                                                if (i33 == 0 && vVar.h()) {
                                                                    vVar.s(i21);
                                                                }
                                                                i19 = 3;
                                                                if (i29 < 3) {
                                                                    vVar.r();
                                                                }
                                                            }
                                                            if (c3 == 0 && i18 != i19) {
                                                                vVar.r();
                                                            }
                                                            if (c3 == 2 || !(i18 == i19 || vVar.h())) {
                                                                i20 = 6;
                                                            } else {
                                                                i20 = 6;
                                                                vVar.s(6);
                                                            }
                                                            str = (!vVar.h() && vVar.i(i20) == 1 && vVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                            i13 = i32;
                                                        }
                                                    }
                                                }
                                            }
                                            i24 = 2;
                                            vVar.s((i35 + 2) * 8);
                                            vVar.c();
                                            if (i33 < i24) {
                                            }
                                            if (vVar.h()) {
                                            }
                                        }
                                        i24 = 2;
                                        if (i33 < i24) {
                                        }
                                        if (vVar.h()) {
                                        }
                                    }
                                }
                                i18 = i16;
                                if (vVar.h()) {
                                }
                                if (c3 == 0) {
                                    vVar.r();
                                }
                                if (c3 == 2) {
                                }
                                i20 = 6;
                                if (!vVar.h()) {
                                }
                                i13 = i32;
                            } else {
                                vVar.s(32);
                                int i37 = vVar.i(2);
                                String str2 = i37 == 3 ? null : "audio/ac3";
                                int i38 = vVar.i(6);
                                int i39 = l3.a.g[i38 / 2] * MediaDataController.MAX_STYLE_RUNS_COUNT;
                                int b10 = l3.a.b(i37, i38);
                                vVar.s(8);
                                int i40 = vVar.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    vVar.s(2);
                                }
                                if ((i40 & 4) != 0) {
                                    vVar.s(i10);
                                }
                                if (i40 == i10) {
                                    vVar.s(i10);
                                }
                                int i41 = i37 < 3 ? iArr2[i37] : -1;
                                i11 = iArr[i40] + (vVar.h() ? 1 : 0);
                                str = str2;
                                i12 = b10;
                                i13 = i39;
                                i14 = i41;
                                i15 = 1536;
                            }
                            n0 n0Var = this.k;
                            if (n0Var == null || i11 != n0Var.P || i14 != n0Var.Q || !h5.d0.a(str, n0Var.C)) {
                                m0 m0Var = new m0();
                                m0Var.a = this.e;
                                m0Var.o = str;
                                m0Var.B = i11;
                                m0Var.C = i14;
                                m0Var.c = this.d;
                                m0Var.g = i13;
                                if ("audio/ac3".equals(str)) {
                                    m0Var.f = i13;
                                }
                                n0 n0Var2 = new n0(m0Var);
                                this.k = n0Var2;
                                this.f.b(n0Var2);
                            }
                            this.l = i12;
                            this.j = (i15 * 1000000) / this.k.Q;
                            wVar2.F(0);
                            this.f.d(128, wVar2);
                            this.g = 2;
                        }
                    } else if (i26 == 2) {
                        int min2 = Math.min(wVar.a(), this.l - this.h);
                        this.f.d(min2, wVar);
                        int i42 = this.h + min2;
                        this.h = i42;
                        int i43 = this.l;
                        if (i42 == i43) {
                            long j10 = this.m;
                            if (j10 != -9223372036854775807L) {
                                this.f.c(j10, 1, i43, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
            default:
                h5.a.j(this.f);
                while (wVar.a() > 0) {
                    int i44 = this.g;
                    h5.w wVar3 = this.c;
                    if (i44 == 0) {
                        while (wVar.a() > 0) {
                            if (this.i) {
                                int u11 = wVar.u();
                                this.i = u11 == 172;
                                if (u11 == 64 || u11 == 65) {
                                    boolean z10 = u11 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = wVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z10 ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.i = wVar.u() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = wVar3.a;
                        int min3 = Math.min(wVar.a(), 16 - this.h);
                        wVar.e(this.h, min3, bArr4);
                        int i45 = this.h + min3;
                        this.h = i45;
                        if (i45 == 16) {
                            h5.v vVar2 = this.b;
                            vVar2.p(0);
                            e8.a g11 = l3.a.g(vVar2);
                            int i46 = g11.a;
                            n0 n0Var3 = this.k;
                            if (n0Var3 == null || 2 != n0Var3.P || i46 != n0Var3.Q || !"audio/ac4".equals(n0Var3.C)) {
                                m0 m0Var2 = new m0();
                                m0Var2.a = this.e;
                                m0Var2.o = "audio/ac4";
                                m0Var2.B = 2;
                                m0Var2.C = i46;
                                m0Var2.c = this.d;
                                n0 n0Var4 = new n0(m0Var2);
                                this.k = n0Var4;
                                this.f.b(n0Var4);
                            }
                            this.l = g11.b;
                            this.j = (g11.c * 1000000) / this.k.Q;
                            wVar3.F(0);
                            this.f.d(16, wVar3);
                            this.g = 2;
                        }
                    } else if (i44 == 2) {
                        int min4 = Math.min(wVar.a(), this.l - this.h);
                        this.f.d(min4, wVar);
                        int i47 = this.h + min4;
                        this.h = i47;
                        int i48 = this.l;
                        if (i47 == i48) {
                            long j11 = this.m;
                            if (j11 != -9223372036854775807L) {
                                this.f.c(j11, 1, i48, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // b4.i
    public final void b() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.a) {
            case 0:
                h0Var.a();
                h0Var.b();
                this.e = h0Var.e;
                h0Var.b();
                this.f = mVar.i2(h0Var.d, 1);
                break;
            default:
                h0Var.a();
                h0Var.b();
                this.e = h0Var.e;
                h0Var.b();
                this.f = mVar.i2(h0Var.d, 1);
                break;
        }
    }

    @Override // b4.i
    public final void d() {
        int i10 = this.a;
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        switch (this.a) {
            case 0:
                if (j10 != -9223372036854775807L) {
                    this.m = j10;
                    break;
                }
                break;
            default:
                if (j10 != -9223372036854775807L) {
                    this.m = j10;
                    break;
                }
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
