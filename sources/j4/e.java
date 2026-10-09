package j4;

import b2.r0;
import c3.h0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public h0 h;
    public h0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public h0 v;
    public long w;
    public final a4.g b = new a4.g(new byte[7], 7);
    public final e2.v c = new e2.v(Arrays.copyOf(x, 10));
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
    public final void a(e2.v vVar) {
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
        String str = e2.d0.a;
        while (vVar.a() > 0) {
            int i15 = this.j;
            char c13 = 65535;
            e2.v vVar2 = this.c;
            int i16 = 3;
            a4.g gVar = this.b;
            int i17 = 0;
            int i18 = 4;
            int i19 = 1;
            if (i15 == 0) {
                byte[] bArr = vVar.a;
                int i20 = vVar.b;
                int i21 = vVar.c;
                while (true) {
                    if (i20 >= i21) {
                        vVar.J(i20);
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
                        vVar.J(i20);
                        byte[] bArr2 = gVar.b;
                        if (vVar.a() >= i19) {
                            vVar.h(i17, i19, bArr2);
                            gVar.q(i18);
                            int i24 = gVar.i(i19);
                            int i25 = this.o;
                            if (i25 == -1 || i24 == i25) {
                                if (this.p != -1) {
                                    byte[] bArr3 = gVar.b;
                                    if (vVar.a() < i19) {
                                        break;
                                    }
                                    vVar.h(i17, i19, bArr3);
                                    gVar.q(2);
                                    i14 = 4;
                                    if (gVar.i(4) == this.p) {
                                        vVar.J(i10);
                                    }
                                } else {
                                    i14 = 4;
                                }
                                byte[] bArr4 = gVar.b;
                                if (vVar.a() >= i14) {
                                    vVar.h(i17, i14, bArr4);
                                    gVar.q(14);
                                    int i26 = gVar.i(13);
                                    if (i26 >= 7) {
                                        byte[] bArr5 = vVar.a;
                                        int i27 = vVar.c;
                                        int i28 = i23 + i26;
                                        if (i28 < i27) {
                                            byte b11 = bArr5[i28];
                                            c10 = 65535;
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i29 = i28 + 1;
                                                    if (i29 != i27) {
                                                        if (bArr5[i29] == 68) {
                                                            int i30 = i28 + 2;
                                                            if (i30 != i27) {
                                                                if (bArr5[i30] == 51) {
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
                                                int i31 = i28 + 1;
                                                if (i31 != i27) {
                                                    byte b12 = bArr5[i31];
                                                    if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == i24) {
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
                    int i32 = this.l;
                    int i33 = i22 | i32;
                    if (i33 == 329) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 768;
                    } else if (i33 == 511) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 512;
                    } else if (i33 == 836) {
                        i12 = 3;
                        c11 = 256;
                        i13 = 0;
                        c12 = 2;
                        this.l = 1024;
                    } else {
                        if (i33 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            vVar2.J(0);
                            vVar.J(i10);
                            break;
                        }
                        c11 = 256;
                        if (i32 != 256) {
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
                vVar.J(i10);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    byte[] bArr6 = vVar2.a;
                    int min = Math.min(vVar.a(), 10 - this.k);
                    vVar.h(this.k, min, bArr6);
                    int i34 = this.k + min;
                    this.k = i34;
                    if (i34 == 10) {
                        this.i.d(10, vVar2);
                        vVar2.J(6);
                        h0 h0Var = this.i;
                        int w10 = vVar2.w() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = h0Var;
                        this.w = 0L;
                        this.t = w10;
                    }
                } else if (i15 == 3) {
                    int i35 = this.m ? 7 : 5;
                    byte[] bArr7 = gVar.b;
                    int min2 = Math.min(vVar.a(), i35 - this.k);
                    vVar.h(this.k, min2, bArr7);
                    int i36 = this.k + min2;
                    this.k = i36;
                    if (i36 == i35) {
                        gVar.q(0);
                        if (this.r) {
                            gVar.t(10);
                        } else {
                            int i37 = gVar.i(2) + 1;
                            if (i37 != 2) {
                                e2.a.n("AdtsReader", "Detected audio object type: " + i37 + ", but assuming AAC LC.");
                                i37 = 2;
                            }
                            gVar.t(5);
                            int i38 = gVar.i(3);
                            int i39 = this.p;
                            byte[] bArr8 = {(byte) (((i37 << 3) & 248) | ((i39 >> 1) & 7)), (byte) (((i38 << 3) & 120) | ((i39 << 7) & 128))};
                            c3.a n10 = c3.b.n(new a4.g(bArr8, 2), false);
                            b2.r rVar = new b2.r();
                            rVar.a = this.g;
                            rVar.p = r0.n(this.f);
                            rVar.q = r0.n(MediaController.AUDIO_MIME_TYPE);
                            rVar.j = n10.a;
                            rVar.I = n10.c;
                            rVar.J = n10.b;
                            rVar.t = Collections.singletonList(bArr8);
                            rVar.d = this.d;
                            rVar.f = this.e;
                            b2.s sVar = new b2.s(rVar);
                            this.s = 1024000000 / sVar.K;
                            this.h.b(sVar);
                            this.r = true;
                        }
                        gVar.t(4);
                        int i40 = gVar.i(13);
                        int i41 = i40 - 7;
                        if (this.m) {
                            i41 = i40 - 9;
                        }
                        h0 h0Var2 = this.h;
                        long j3 = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = h0Var2;
                        this.w = j3;
                        this.t = i41;
                    }
                } else {
                    if (i15 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(vVar.a(), this.t - this.k);
                    this.v.d(min3, vVar);
                    int i42 = this.k + min3;
                    this.k = i42;
                    if (i42 == this.t) {
                        e2.d.g(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (vVar.a() != 0) {
                gVar.b[0] = vVar.a[vVar.b];
                gVar.q(2);
                int i43 = gVar.i(4);
                int i44 = this.p;
                if (i44 == -1 || i43 == i44) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i43;
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
        h0 f22 = qVar.f2(f0Var.c, 1);
        this.h = f22;
        this.v = f22;
        if (!this.a) {
            this.i = new c3.n();
            return;
        }
        f0Var.b();
        f0Var.c();
        h0 f23 = qVar.f2(f0Var.c, 5);
        this.i = f23;
        b2.r rVar = new b2.r();
        f0Var.c();
        rVar.a = (String) f0Var.e;
        rVar.p = r0.n(this.f);
        rVar.q = r0.n("application/id3");
        hg.c.s(rVar, f23);
    }

    @Override // j4.i
    public final void f(int i10, long j3) {
        this.u = j3;
    }

    @Override // j4.i
    public final void e(boolean z10) {
    }
}
