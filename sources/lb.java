// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lb implements gu3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wxb h;
    public wxb i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public wxb v;
    public long w;
    public final qd1 b = new qd1(7, new byte[7]);
    public final xu7 c = new xu7(Arrays.copyOf(x, 10));
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
    @Override // gu3
    public final void b(xu7 xu7Var) {
        int i;
        byte b;
        byte b2;
        ?? r4;
        byte b3;
        int i2;
        int i3;
        this.h.getClass();
        String str = g8c.a;
        while (xu7Var.a() > 0) {
            byte b4 = this.j;
            xu7 xu7Var2 = this.c;
            byte b5 = 3;
            qd1 qd1Var = this.b;
            int i4 = 0;
            int i5 = 4;
            int i6 = 1;
            if (b4 == 0) {
                byte[] bArr = xu7Var.a;
                int i7 = xu7Var.b;
                int i8 = xu7Var.c;
                while (true) {
                    if (i7 >= i8) {
                        xu7Var.N(i7);
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
                        xu7Var.N(i7);
                        byte[] bArr2 = qd1Var.b;
                        if (xu7Var.a() >= i6) {
                            xu7Var.k(i4, i6, bArr2);
                            qd1Var.l(i5);
                            int f = qd1Var.f(i6);
                            int i11 = this.o;
                            if (i11 == -1 || f == i11) {
                                if (this.p != -1) {
                                    byte[] bArr3 = qd1Var.b;
                                    if (xu7Var.a() < i6) {
                                        break;
                                    }
                                    xu7Var.k(i4, i6, bArr3);
                                    qd1Var.l(2);
                                    i3 = 4;
                                    if (qd1Var.f(4) == this.p) {
                                        xu7Var.N(i);
                                    }
                                } else {
                                    i3 = 4;
                                }
                                byte[] bArr4 = qd1Var.b;
                                if (xu7Var.a() < i3) {
                                    break;
                                }
                                xu7Var.k(i4, i3, bArr4);
                                qd1Var.l(14);
                                int f2 = qd1Var.f(13);
                                if (f2 >= 7) {
                                    byte[] bArr5 = xu7Var.a;
                                    int i12 = xu7Var.c;
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
                            xu7Var2.N(0);
                            xu7Var.N(i);
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
                xu7Var.N(i);
            } else if (b4 != 1) {
                if (b4 == 2) {
                    byte[] bArr6 = xu7Var2.a;
                    int min = Math.min(xu7Var.a(), 10 - this.k);
                    xu7Var.k(this.k, min, bArr6);
                    int i18 = this.k + min;
                    this.k = i18;
                    if (i18 == 10) {
                        this.i.e(10, xu7Var2);
                        xu7Var2.N(6);
                        wxb wxbVar = this.i;
                        int z = xu7Var2.z() + 10;
                        this.j = (byte) 4;
                        this.k = 10;
                        this.v = wxbVar;
                        this.w = 0L;
                        this.t = z;
                    }
                } else if (b4 == 3) {
                    int i19 = this.m ? 7 : 5;
                    byte[] bArr7 = qd1Var.b;
                    int min2 = Math.min(xu7Var.a(), i19 - this.k);
                    xu7Var.k(this.k, min2, bArr7);
                    int i20 = this.k + min2;
                    this.k = i20;
                    if (i20 == i19) {
                        qd1Var.l(0);
                        if (this.r) {
                            qd1Var.n(10);
                        } else {
                            int f3 = qd1Var.f(2) + 1;
                            if (f3 != 2) {
                                lad.f("AdtsReader", "Detected audio object type: " + f3 + ", but assuming AAC LC.");
                                f3 = 2;
                            }
                            qd1Var.n(5);
                            int f4 = qd1Var.f(3);
                            int i21 = this.p;
                            byte[] bArr8 = {(byte) (((f3 << 3) & kk7.W3) | ((i21 >> 1) & 7)), (byte) (((i21 << 7) & 128) | ((f4 << 3) & 120))};
                            g1 j = pm2.j(new qd1(2, bArr8), false);
                            em4 em4Var = new em4();
                            em4Var.a = this.g;
                            em4Var.r = ud7.n(this.f);
                            em4Var.s = ud7.n("audio/mp4a-latm");
                            em4Var.k = j.c;
                            em4Var.M = j.b;
                            em4Var.O = j.a;
                            em4Var.v = Collections.singletonList(bArr8);
                            em4Var.d = this.d;
                            em4Var.f = this.e;
                            fm4 fm4Var = new fm4(em4Var);
                            this.s = 1024000000 / fm4Var.P;
                            this.h.g(fm4Var);
                            this.r = true;
                        }
                        qd1Var.n(4);
                        int f5 = qd1Var.f(13);
                        int i22 = f5 - 7;
                        if (this.m) {
                            i22 = f5 - 9;
                        }
                        wxb wxbVar2 = this.h;
                        long j2 = this.s;
                        this.j = (byte) 4;
                        this.k = 0;
                        this.v = wxbVar2;
                        this.w = j2;
                        this.t = i22;
                    }
                } else {
                    if (b4 != 4) {
                        sdb.a();
                        return;
                    }
                    int min3 = Math.min(xu7Var.a(), this.t - this.k);
                    this.v.e(min3, xu7Var);
                    int i23 = this.k + min3;
                    this.k = i23;
                    if (i23 == this.t) {
                        gre.p(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    }
                }
            } else if (xu7Var.a() != 0) {
                qd1Var.b[0] = xu7Var.a[xu7Var.b];
                qd1Var.l(2);
                int f6 = qd1Var.f(4);
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

    @Override // gu3
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.g = l2cVar.e;
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 1);
        this.h = S;
        this.v = S;
        if (!this.a) {
            this.i = new yn3();
            return;
        }
        l2cVar.a();
        l2cVar.b();
        wxb S2 = l74Var.S(l2cVar.d, 5);
        this.i = S2;
        em4 em4Var = new em4();
        l2cVar.b();
        em4Var.a = l2cVar.e;
        em4Var.r = ud7.n(this.f);
        em4Var.s = ud7.n("application/id3");
        yjb.v(em4Var, S2);
    }

    @Override // gu3
    public final void e() {
    }

    @Override // gu3
    public final void f() {
    }
}
