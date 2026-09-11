package j4;

import b2.r0;
import c3.h0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final a4.h b = new a4.h(new byte[7], 7);
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
    @Override // j4.i
    public final void b(e2.v vVar) {
        int i10;
        byte b10;
        int i11;
        this.h.getClass();
        String str = e2.d0.a;
        while (vVar.a() > 0) {
            int i12 = this.j;
            e2.v vVar2 = this.c;
            a4.h hVar = this.b;
            int i13 = 0;
            int i14 = 4;
            int i15 = 1;
            if (i12 == 0) {
                byte[] bArr = vVar.a;
                int i16 = vVar.b;
                int i17 = vVar.c;
                while (true) {
                    if (i16 >= i17) {
                        vVar.J(i16);
                        break;
                    }
                    i10 = i16 + 1;
                    b10 = bArr[i16];
                    int i18 = b10 & 255;
                    if (this.l == 512 && ((65280 | (((byte) i18) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                        if (!this.n) {
                            int i19 = i16 - 1;
                            vVar.J(i16);
                            byte[] bArr2 = hVar.b;
                            if (vVar.a() >= i15) {
                                vVar.h(i13, i15, bArr2);
                                hVar.q(i14);
                                int i20 = hVar.i(i15);
                                int i21 = this.o;
                                if (i21 == -1 || i20 == i21) {
                                    if (this.p != -1) {
                                        byte[] bArr3 = hVar.b;
                                        if (vVar.a() < i15) {
                                            break;
                                        }
                                        vVar.h(i13, i15, bArr3);
                                        hVar.q(2);
                                        i11 = 4;
                                        if (hVar.i(4) == this.p) {
                                            vVar.J(i10);
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    byte[] bArr4 = hVar.b;
                                    if (vVar.a() >= i11) {
                                        vVar.h(i13, i11, bArr4);
                                        hVar.q(14);
                                        int i22 = hVar.i(13);
                                        if (i22 >= 7) {
                                            byte[] bArr5 = vVar.a;
                                            int i23 = vVar.c;
                                            int i24 = i19 + i22;
                                            if (i24 >= i23) {
                                                break;
                                            }
                                            byte b11 = bArr5[i24];
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i25 = i24 + 1;
                                                    if (i25 != i23) {
                                                        if (bArr5[i25] == 68) {
                                                            int i26 = i24 + 2;
                                                            if (i26 != i23) {
                                                                if (bArr5[i26] == 51) {
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
                                                int i27 = i24 + 1;
                                                if (i27 != i23) {
                                                    byte b12 = bArr5[i27];
                                                    if (((65280 | (b12 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == i20) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i28 = this.l;
                    int i29 = i18 | i28;
                    if (i29 == 329) {
                        this.l = 768;
                    } else if (i29 == 511) {
                        this.l = 512;
                    } else if (i29 == 836) {
                        this.l = 1024;
                    } else {
                        if (i29 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            vVar2.J(0);
                            vVar.J(i10);
                            break;
                        }
                        if (i28 != 256) {
                            this.l = 256;
                            i13 = 0;
                            i14 = 4;
                            i15 = 1;
                        }
                    }
                    i16 = i10;
                    i13 = 0;
                    i14 = 4;
                    i15 = 1;
                }
                this.q = (b10 & 8) >> 3;
                this.m = (b10 & 1) == 0;
                if (this.n) {
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                vVar.J(i10);
            } else if (i12 != 1) {
                if (i12 == 2) {
                    byte[] bArr6 = vVar2.a;
                    int min = Math.min(vVar.a(), 10 - this.k);
                    vVar.h(this.k, min, bArr6);
                    int i30 = this.k + min;
                    this.k = i30;
                    if (i30 == 10) {
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
                } else if (i12 == 3) {
                    int i31 = this.m ? 7 : 5;
                    byte[] bArr7 = hVar.b;
                    int min2 = Math.min(vVar.a(), i31 - this.k);
                    vVar.h(this.k, min2, bArr7);
                    int i32 = this.k + min2;
                    this.k = i32;
                    if (i32 == i31) {
                        hVar.q(0);
                        if (this.r) {
                            hVar.t(10);
                        } else {
                            int i33 = hVar.i(2) + 1;
                            if (i33 != 2) {
                                e2.a.n("AdtsReader", "Detected audio object type: " + i33 + ", but assuming AAC LC.");
                                i33 = 2;
                            }
                            hVar.t(5);
                            int i34 = hVar.i(3);
                            int i35 = this.p;
                            byte[] bArr8 = {(byte) (((i33 << 3) & 248) | ((i35 >> 1) & 7)), (byte) (((i34 << 3) & 120) | ((i35 << 7) & 128))};
                            c3.a n10 = c3.b.n(new a4.h(bArr8, 2), false);
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
                        hVar.t(4);
                        int i36 = hVar.i(13);
                        int i37 = i36 - 7;
                        if (this.m) {
                            i37 = i36 - 9;
                        }
                        h0 h0Var2 = this.h;
                        long j3 = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = h0Var2;
                        this.w = j3;
                        this.t = i37;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(vVar.a(), this.t - this.k);
                    this.v.d(min3, vVar);
                    int i38 = this.k + min3;
                    this.k = i38;
                    if (i38 == this.t) {
                        e2.d.g(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (vVar.a() != 0) {
                hVar.b[0] = vVar.a[vVar.b];
                hVar.q(2);
                int i39 = hVar.i(4);
                int i40 = this.p;
                if (i40 == -1 || i39 == i40) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i39;
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
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.g = f0Var.e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 1);
        this.h = R1;
        this.v = R1;
        if (!this.a) {
            this.i = new c3.n();
            return;
        }
        f0Var.a();
        f0Var.b();
        h0 R12 = qVar.R1(f0Var.d, 5);
        this.i = R12;
        b2.r rVar = new b2.r();
        f0Var.b();
        rVar.a = f0Var.e;
        rVar.p = r0.n(this.f);
        rVar.q = r0.n("application/id3");
        i2.g.u(rVar, R12);
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.u = j3;
    }

    @Override // j4.i
    public final void f(boolean z10) {
    }
}
