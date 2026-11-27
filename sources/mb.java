// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class mb implements av3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public x1c h;
    public x1c i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public x1c v;
    public long w;
    public final zd1 b = new zd1(7, new byte[7]);
    public final ey7 c = new ey7(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public mb(int i, String str, String str2, boolean z) {
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
    @Override // av3
    public final void b(ey7 ey7Var) {
        int i;
        byte b;
        byte b2;
        ?? r4;
        byte b3;
        int i2;
        int i3;
        this.h.getClass();
        String str = gcc.a;
        while (ey7Var.a() > 0) {
            byte b4 = this.j;
            ey7 ey7Var2 = this.c;
            byte b5 = 3;
            zd1 zd1Var = this.b;
            int i4 = 0;
            int i5 = 4;
            int i6 = 1;
            if (b4 == 0) {
                byte[] bArr = ey7Var.a;
                int i7 = ey7Var.b;
                int i8 = ey7Var.c;
                while (true) {
                    if (i7 >= i8) {
                        ey7Var.N(i7);
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
                        ey7Var.N(i7);
                        byte[] bArr2 = zd1Var.b;
                        if (ey7Var.a() >= i6) {
                            ey7Var.k(i4, i6, bArr2);
                            zd1Var.l(i5);
                            int f = zd1Var.f(i6);
                            int i11 = this.o;
                            if (i11 == -1 || f == i11) {
                                if (this.p != -1) {
                                    byte[] bArr3 = zd1Var.b;
                                    if (ey7Var.a() < i6) {
                                        break;
                                    }
                                    ey7Var.k(i4, i6, bArr3);
                                    zd1Var.l(2);
                                    i3 = 4;
                                    if (zd1Var.f(4) == this.p) {
                                        ey7Var.N(i);
                                    }
                                } else {
                                    i3 = 4;
                                }
                                byte[] bArr4 = zd1Var.b;
                                if (ey7Var.a() < i3) {
                                    break;
                                }
                                ey7Var.k(i4, i3, bArr4);
                                zd1Var.l(14);
                                int f2 = zd1Var.f(13);
                                if (f2 >= 7) {
                                    byte[] bArr5 = ey7Var.a;
                                    int i12 = ey7Var.c;
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
                            ey7Var2.N(0);
                            ey7Var.N(i);
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
                ey7Var.N(i);
            } else if (b4 != 1) {
                if (b4 == 2) {
                    byte[] bArr6 = ey7Var2.a;
                    int min = Math.min(ey7Var.a(), 10 - this.k);
                    ey7Var.k(this.k, min, bArr6);
                    int i18 = this.k + min;
                    this.k = i18;
                    if (i18 == 10) {
                        this.i.e(10, ey7Var2);
                        ey7Var2.N(6);
                        x1c x1cVar = this.i;
                        int z = ey7Var2.z() + 10;
                        this.j = (byte) 4;
                        this.k = 10;
                        this.v = x1cVar;
                        this.w = 0L;
                        this.t = z;
                    }
                } else if (b4 == 3) {
                    int i19 = this.m ? 7 : 5;
                    byte[] bArr7 = zd1Var.b;
                    int min2 = Math.min(ey7Var.a(), i19 - this.k);
                    ey7Var.k(this.k, min2, bArr7);
                    int i20 = this.k + min2;
                    this.k = i20;
                    if (i20 == i19) {
                        zd1Var.l(0);
                        if (this.r) {
                            zd1Var.n(10);
                        } else {
                            int f3 = zd1Var.f(2) + 1;
                            if (f3 != 2) {
                                efd.f("AdtsReader", "Detected audio object type: " + f3 + ", but assuming AAC LC.");
                                f3 = 2;
                            }
                            zd1Var.n(5);
                            int f4 = zd1Var.f(3);
                            int i21 = this.p;
                            byte[] bArr8 = {(byte) (((f3 << 3) & jn7.W3) | ((i21 >> 1) & 7)), (byte) (((i21 << 7) & 128) | ((f4 << 3) & jn7.E1))};
                            h1 j = jn2.j(new zd1(2, bArr8), false);
                            jo4 jo4Var = new jo4();
                            jo4Var.a = this.g;
                            jo4Var.r = dg7.n(this.f);
                            jo4Var.s = dg7.n("audio/mp4a-latm");
                            jo4Var.k = j.c;
                            jo4Var.M = j.b;
                            jo4Var.O = j.a;
                            jo4Var.v = Collections.singletonList(bArr8);
                            jo4Var.d = this.d;
                            jo4Var.f = this.e;
                            ko4 ko4Var = new ko4(jo4Var);
                            this.s = 1024000000 / ko4Var.P;
                            this.h.g(ko4Var);
                            this.r = true;
                        }
                        zd1Var.n(4);
                        int f5 = zd1Var.f(13);
                        int i22 = f5 - 7;
                        if (this.m) {
                            i22 = f5 - 9;
                        }
                        x1c x1cVar2 = this.h;
                        long j2 = this.s;
                        this.j = (byte) 4;
                        this.k = 0;
                        this.v = x1cVar2;
                        this.w = j2;
                        this.t = i22;
                    }
                } else {
                    if (b4 != 4) {
                        grb.g();
                        return;
                    }
                    int min3 = Math.min(ey7Var.a(), this.t - this.k);
                    this.v.e(min3, ey7Var);
                    int i23 = this.k + min3;
                    this.k = i23;
                    if (i23 == this.t) {
                        yve.p(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    }
                }
            } else if (ey7Var.a() != 0) {
                zd1Var.b[0] = ey7Var.a[ey7Var.b];
                zd1Var.l(2);
                int f6 = zd1Var.f(4);
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

    @Override // av3
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // av3
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.g = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 1);
        this.h = e0;
        this.v = e0;
        if (!this.a) {
            this.i = new po3();
            return;
        }
        l6cVar.a();
        l6cVar.b();
        x1c e02 = g84Var.e0(l6cVar.d, 5);
        this.i = e02;
        jo4 jo4Var = new jo4();
        l6cVar.b();
        jo4Var.a = l6cVar.e;
        jo4Var.r = dg7.n(this.f);
        jo4Var.s = dg7.n("application/id3");
        xnb.v(jo4Var, e02);
    }

    @Override // av3
    public final void e() {
    }

    @Override // av3
    public final void f() {
    }
}
