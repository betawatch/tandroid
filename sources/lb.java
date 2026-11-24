// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lb implements rv3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public yzb h;
    public yzb i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public yzb v;
    public long w;
    public final ye1 b = new ye1(7, new byte[7]);
    public final yw7 c = new yw7(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public lb(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // rv3
    public final void b(yw7 yw7Var) {
        int i;
        byte b;
        byte b2;
        ?? r4;
        byte b3;
        int i2;
        int i3;
        this.h.getClass();
        String str = hac.a;
        while (yw7Var.a() > 0) {
            byte b4 = this.j;
            yw7 yw7Var2 = this.c;
            byte b5 = 3;
            ye1 ye1Var = this.b;
            int i4 = 0;
            int i5 = 4;
            int i6 = 1;
            if (b4 == 0) {
                byte[] bArr = yw7Var.a;
                int i7 = yw7Var.b;
                int i8 = yw7Var.c;
                while (true) {
                    if (i7 >= i8) {
                        yw7Var.N(i7);
                        break;
                    }
                    i = i7 + 1;
                    b = b5;
                    b2 = bArr[i7];
                    int i9 = b2 & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i9) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        r4 = i6;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i10 = i7 - 1;
                        yw7Var.N(i7);
                        byte[] bArr2 = ye1Var.b;
                        if (yw7Var.a() >= i6) {
                            yw7Var.k(i4, i6, bArr2);
                            ye1Var.l(i5);
                            int f = ye1Var.f(i6);
                            int i11 = this.o;
                            if (i11 == -1 || f == i11) {
                                if (this.p != -1) {
                                    byte[] bArr3 = ye1Var.b;
                                    if (yw7Var.a() < i6) {
                                        break;
                                    }
                                    yw7Var.k(i4, i6, bArr3);
                                    ye1Var.l(2);
                                    i3 = 4;
                                    if (ye1Var.f(4) == this.p) {
                                        yw7Var.N(i);
                                    }
                                } else {
                                    i3 = 4;
                                }
                                byte[] bArr4 = ye1Var.b;
                                if (yw7Var.a() < i3) {
                                    break;
                                }
                                yw7Var.k(i4, i3, bArr4);
                                ye1Var.l(14);
                                int f2 = ye1Var.f(13);
                                if (f2 >= 7) {
                                    byte[] bArr5 = yw7Var.a;
                                    int i12 = yw7Var.c;
                                    int i13 = i10 + f2;
                                    if (i13 < i12) {
                                        byte b6 = bArr5[i13];
                                        if (b6 != -1) {
                                            if (b6 == 73) {
                                                int i14 = i13 + 1;
                                                if (i14 == i12) {
                                                    break;
                                                }
                                                if (bArr5[i14] == 68) {
                                                    int i15 = i13 + 2;
                                                    if (i15 == i12) {
                                                        break;
                                                    } else if (bArr5[i15] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i16 = i13 + 1;
                                            if (i16 == i12) {
                                                break;
                                            }
                                            byte b7 = bArr5[i16];
                                            if ((((65280 | ((b7 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b7 & 8) >> 3) == f) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        r4 = true;
                    }
                    short s = this.l;
                    int i17 = i9 | s;
                    if (i17 == 329) {
                        b3 = 3;
                        i2 = 0;
                        this.l = (short) 768;
                    } else if (i17 == 511) {
                        b3 = 3;
                        i2 = 0;
                        this.l = (short) 512;
                    } else if (i17 == 836) {
                        b3 = 3;
                        i2 = 0;
                        this.l = (short) 1024;
                    } else {
                        if (i17 == 1075) {
                            this.j = (byte) 2;
                            this.k = 3;
                            this.t = 0;
                            yw7Var2.N(0);
                            yw7Var.N(i);
                            break;
                        }
                        if (s != 256) {
                            this.l = (short) 256;
                            b3 = 3;
                            i2 = 0;
                            i6 = r4;
                            i5 = 4;
                            i4 = i2;
                            b5 = b3;
                        } else {
                            b3 = 3;
                            i2 = 0;
                        }
                    }
                    i7 = i;
                    i6 = r4;
                    i5 = 4;
                    i4 = i2;
                    b5 = b3;
                }
                this.q = (b2 & 8) >> 3;
                this.m = (b2 & 1) == 0;
                if (this.n) {
                    this.j = b;
                    this.k = 0;
                } else {
                    this.j = (byte) 1;
                    this.k = 0;
                }
                yw7Var.N(i);
            } else if (b4 != 1) {
                if (b4 == 2) {
                    byte[] bArr6 = yw7Var2.a;
                    int min = Math.min(yw7Var.a(), 10 - this.k);
                    yw7Var.k(this.k, min, bArr6);
                    int i18 = this.k + min;
                    this.k = i18;
                    if (i18 == 10) {
                        this.i.e(10, yw7Var2);
                        yw7Var2.N(6);
                        yzb yzbVar = this.i;
                        int z = yw7Var2.z() + 10;
                        this.j = (byte) 4;
                        this.k = 10;
                        this.v = yzbVar;
                        this.w = 0L;
                        this.t = z;
                    }
                } else if (b4 == 3) {
                    int i19 = this.m ? 7 : 5;
                    byte[] bArr7 = ye1Var.b;
                    int min2 = Math.min(yw7Var.a(), i19 - this.k);
                    yw7Var.k(this.k, min2, bArr7);
                    int i20 = this.k + min2;
                    this.k = i20;
                    if (i20 == i19) {
                        ye1Var.l(0);
                        if (this.r) {
                            ye1Var.n(10);
                        } else {
                            int f3 = ye1Var.f(2) + 1;
                            if (f3 != 2) {
                                ncd.f("AdtsReader", "Detected audio object type: " + f3 + ", but assuming AAC LC.");
                                f3 = 2;
                            }
                            ye1Var.n(5);
                            int f4 = ye1Var.f(3);
                            int i21 = this.p;
                            byte[] bArr8 = {(byte) (((f3 << 3) & nm7.W3) | ((i21 >> 1) & 7)), (byte) (((i21 << 7) & 128) | ((f4 << 3) & nm7.E1))};
                            g1 j = bo2.j(new ye1(2, bArr8), false);
                            fo4 fo4Var = new fo4();
                            fo4Var.a = this.g;
                            fo4Var.r = wf7.n(this.f);
                            fo4Var.s = wf7.n("audio/mp4a-latm");
                            fo4Var.k = j.c;
                            fo4Var.M = j.b;
                            fo4Var.O = j.a;
                            fo4Var.v = Collections.singletonList(bArr8);
                            fo4Var.d = this.d;
                            fo4Var.f = this.e;
                            go4 go4Var = new go4(fo4Var);
                            this.s = 1024000000 / go4Var.P;
                            this.h.g(go4Var);
                            this.r = true;
                        }
                        ye1Var.n(4);
                        int f5 = ye1Var.f(13);
                        int i22 = f5 - 7;
                        if (this.m) {
                            i22 = f5 - 9;
                        }
                        yzb yzbVar2 = this.h;
                        long j2 = this.s;
                        this.j = (byte) 4;
                        this.k = 0;
                        this.v = yzbVar2;
                        this.w = j2;
                        this.t = i22;
                    }
                } else {
                    if (b4 != 4) {
                        rjb.h();
                        return;
                    }
                    int min3 = Math.min(yw7Var.a(), this.t - this.k);
                    this.v.e(min3, yw7Var);
                    int i23 = this.k + min3;
                    this.k = i23;
                    if (i23 == this.t) {
                        jte.p(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    }
                }
            } else if (yw7Var.a() != 0) {
                ye1Var.b[0] = yw7Var.a[yw7Var.b];
                ye1Var.l(2);
                int f6 = ye1Var.f(4);
                int i24 = this.p;
                if (i24 == -1 || f6 == i24) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = f6;
                    }
                    this.j = (byte) 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = (byte) 0;
                    this.k = 0;
                    this.l = (short) 256;
                }
            }
        }
    }

    @Override // rv3
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.g = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 1);
        this.h = c0;
        this.v = c0;
        if (!this.a) {
            this.i = new ip3();
            return;
        }
        l4cVar.a();
        l4cVar.b();
        yzb c02 = u84Var.c0(l4cVar.d, 5);
        this.i = c02;
        fo4 fo4Var = new fo4();
        l4cVar.b();
        fo4Var.a = l4cVar.e;
        fo4Var.r = wf7.n(this.f);
        fo4Var.s = wf7.n("application/id3");
        mlb.w(fo4Var, c02);
    }

    @Override // rv3
    public final void e() {
    }

    @Override // rv3
    public final void f() {
    }
}
