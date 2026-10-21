package j4;

import b2.v0;
import c3.j0;
import e2.m0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public j0 h;
    public j0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public j0 v;
    public long w;
    public final a4.g b = new a4.g(new byte[7], 7);
    public final e2.x c = new e2.x(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public e(int i10, String str, String str2, boolean z10) {
        this.a = z10;
        this.d = str;
        this.e = i10;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // j4.i
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        byte b10;
        char c10;
        ?? r42;
        int i12;
        char c11;
        int i13;
        char c12;
        int i14;
        this.h.getClass();
        String str = m0.a;
        while (xVar.a() > 0) {
            int i15 = this.j;
            char c13 = 65535;
            e2.x xVar2 = this.c;
            int i16 = 3;
            a4.g gVar = this.b;
            int i17 = 0;
            int i18 = 4;
            int i19 = 1;
            if (i15 == 0) {
                byte[] bArr = xVar.a;
                int i20 = xVar.b;
                int i21 = xVar.c;
                while (true) {
                    if (i20 >= i21) {
                        xVar.N(i20);
                        break;
                    }
                    i10 = i20 + 1;
                    i11 = i16;
                    b10 = bArr[i20];
                    int i22 = b10 & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i22) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c10 = c13;
                        r42 = i19;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i23 = i20 - 1;
                        xVar.N(i20);
                        byte[] bArr2 = gVar.b;
                        if (xVar.a() >= i19) {
                            xVar.k(i17, i19, bArr2);
                            gVar.m(i18);
                            int g10 = gVar.g(i19);
                            int i24 = this.o;
                            if (i24 == -1 || g10 == i24) {
                                if (this.p != -1) {
                                    byte[] bArr3 = gVar.b;
                                    if (xVar.a() < i19) {
                                        break;
                                    }
                                    xVar.k(i17, i19, bArr3);
                                    gVar.m(2);
                                    i14 = 4;
                                    if (gVar.g(4) == this.p) {
                                        xVar.N(i10);
                                    }
                                } else {
                                    i14 = 4;
                                }
                                byte[] bArr4 = gVar.b;
                                if (xVar.a() >= i14) {
                                    xVar.k(i17, i14, bArr4);
                                    gVar.m(14);
                                    int g11 = gVar.g(13);
                                    if (g11 >= 7) {
                                        byte[] bArr5 = xVar.a;
                                        int i25 = xVar.c;
                                        int i26 = i23 + g11;
                                        if (i26 < i25) {
                                            byte b11 = bArr5[i26];
                                            c10 = 65535;
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i27 = i26 + 1;
                                                    if (i27 != i25) {
                                                        if (bArr5[i27] == 68) {
                                                            int i28 = i26 + 2;
                                                            if (i28 != i25) {
                                                                if (bArr5[i28] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i29 = i26 + 1;
                                                if (i29 != i25) {
                                                    byte b12 = bArr5[i29];
                                                    if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == g10) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c10 = 65535;
                            }
                            r42 = true;
                        }
                        c10 = 65535;
                        r42 = true;
                    }
                    int i30 = this.l;
                    int i31 = i22 | i30;
                    if (i31 == 329) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 768;
                    } else if (i31 == 511) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 512;
                    } else if (i31 == 836) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 1024;
                    } else {
                        if (i31 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            xVar2.N(0);
                            xVar.N(i10);
                            break;
                        }
                        c11 = 256;
                        if (i30 != 256) {
                            this.l = 256;
                            i12 = 3;
                            i13 = 0;
                            c12 = 2;
                            i19 = r42;
                            c13 = c10;
                            i18 = 4;
                            i17 = i13;
                            i16 = i12;
                        } else {
                            i12 = 3;
                            i13 = 0;
                            c12 = 2;
                        }
                    }
                    i20 = i10;
                    i19 = r42;
                    c13 = c10;
                    i18 = 4;
                    i17 = i13;
                    i16 = i12;
                }
                this.q = (b10 & 8) >> 3;
                this.m = (b10 & 1) == 0;
                if (this.n) {
                    this.j = i11;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                xVar.N(i10);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    byte[] bArr6 = xVar2.a;
                    int min = Math.min(xVar.a(), 10 - this.k);
                    xVar.k(this.k, min, bArr6);
                    int i32 = this.k + min;
                    this.k = i32;
                    if (i32 == 10) {
                        this.i.d(10, xVar2);
                        xVar2.N(6);
                        j0 j0Var = this.i;
                        int z10 = xVar2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = j0Var;
                        this.w = 0L;
                        this.t = z10;
                    }
                } else if (i15 == 3) {
                    int i33 = this.m ? 7 : 5;
                    byte[] bArr7 = gVar.b;
                    int min2 = Math.min(xVar.a(), i33 - this.k);
                    xVar.k(this.k, min2, bArr7);
                    int i34 = this.k + min2;
                    this.k = i34;
                    if (i34 == i33) {
                        gVar.m(0);
                        if (this.r) {
                            gVar.o(10);
                        } else {
                            int g12 = gVar.g(2) + 1;
                            if (g12 != 2) {
                                e2.a.l("AdtsReader", "Detected audio object type: " + g12 + ", but assuming AAC LC.");
                                g12 = 2;
                            }
                            gVar.o(5);
                            int g13 = gVar.g(3);
                            int i35 = this.p;
                            byte[] bArr8 = {(byte) (((g12 << 3) & 248) | ((i35 >> 1) & 7)), (byte) (((g13 << 3) & 120) | ((i35 << 7) & 128))};
                            c3.a n10 = c3.b.n(new a4.g(bArr8, 2), false);
                            b2.v vVar = new b2.v();
                            vVar.a = this.g;
                            vVar.q = v0.n(this.f);
                            vVar.r = v0.n(MediaController.AUDIO_MIME_TYPE);
                            vVar.j = n10.a;
                            vVar.J = n10.c;
                            vVar.K = n10.b;
                            vVar.u = Collections.singletonList(bArr8);
                            vVar.d = this.d;
                            vVar.f = this.e;
                            b2.w wVar = new b2.w(vVar);
                            this.s = 1024000000 / wVar.L;
                            this.h.b(wVar);
                            this.r = true;
                        }
                        gVar.o(4);
                        int g14 = gVar.g(13);
                        int i36 = g14 - 7;
                        if (this.m) {
                            i36 = g14 - 9;
                        }
                        j0 j0Var2 = this.h;
                        long j10 = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = j0Var2;
                        this.w = j10;
                        this.t = i36;
                    }
                } else {
                    if (i15 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(xVar.a(), this.t - this.k);
                    this.v.d(min3, xVar);
                    int i37 = this.k + min3;
                    this.k = i37;
                    if (i37 == this.t) {
                        u6.p(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (xVar.a() != 0) {
                gVar.b[0] = xVar.a[xVar.b];
                gVar.m(2);
                int g15 = gVar.g(4);
                int i38 = this.p;
                if (i38 == -1 || g15 == i38) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = g15;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // j4.i
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // j4.i
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.g = (String) f0Var.e;
        f0Var.c();
        j0 j02 = qVar.j0(f0Var.c, 1);
        this.h = j02;
        this.v = j02;
        if (!this.a) {
            this.i = new c3.n();
            return;
        }
        f0Var.b();
        f0Var.c();
        j0 j03 = qVar.j0(f0Var.c, 5);
        this.i = j03;
        b2.v vVar = new b2.v();
        f0Var.c();
        vVar.a = (String) f0Var.e;
        vVar.q = v0.n(this.f);
        vVar.r = v0.n("application/id3");
        i2.e.u(vVar, j03);
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
        this.u = j10;
    }

    @Override // j4.i
    public final void e(boolean z10) {
    }
}
