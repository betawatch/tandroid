package b4;

import j3.m0;
import j3.n0;
import java.util.Arrays;
import java.util.Collections;
import l3.p0;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public r3.v f;
    public r3.v g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public r3.v t;
    public long u;
    public final h5.v b = new h5.v(new byte[7], 7);
    public final h5.w c = new h5.w(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public e(String str, boolean z4) {
        this.a = z4;
        this.d = str;
    }

    @Override // b4.i
    public final void a(h5.w wVar) {
        int i10;
        byte b10;
        int i11;
        this.f.getClass();
        int i12 = h5.d0.a;
        while (wVar.a() > 0) {
            int i13 = this.h;
            h5.w wVar2 = this.c;
            int i14 = 0;
            h5.v vVar = this.b;
            int i15 = 4;
            int i16 = 1;
            if (i13 == 0) {
                byte[] bArr = wVar.a;
                int i17 = wVar.b;
                int i18 = wVar.c;
                while (true) {
                    if (i17 >= i18) {
                        wVar.F(i17);
                        break;
                    }
                    i10 = i17 + 1;
                    b10 = bArr[i17];
                    int i19 = b10 & 255;
                    if (this.j == 512 && ((65280 | (((byte) i19) & 255)) & 65526) == 65520) {
                        if (!this.l) {
                            int i20 = i17 - 1;
                            wVar.F(i17);
                            byte[] bArr2 = vVar.b;
                            if (wVar.a() >= i16) {
                                wVar.e(i14, i16, bArr2);
                                vVar.p(i15);
                                int i21 = vVar.i(i16);
                                int i22 = this.m;
                                if (i22 == -1 || i21 == i22) {
                                    if (this.n != -1) {
                                        byte[] bArr3 = vVar.b;
                                        if (wVar.a() < i16) {
                                            break;
                                        }
                                        wVar.e(i14, i16, bArr3);
                                        vVar.p(2);
                                        i11 = 4;
                                        if (vVar.i(4) == this.n) {
                                            wVar.F(i10);
                                        }
                                    } else {
                                        i11 = 4;
                                    }
                                    byte[] bArr4 = vVar.b;
                                    if (wVar.a() >= i11) {
                                        wVar.e(i14, i11, bArr4);
                                        vVar.p(14);
                                        int i23 = vVar.i(13);
                                        if (i23 >= 7) {
                                            byte[] bArr5 = wVar.a;
                                            int i24 = wVar.c;
                                            int i25 = i20 + i23;
                                            if (i25 >= i24) {
                                                break;
                                            }
                                            byte b11 = bArr5[i25];
                                            if (b11 != -1) {
                                                if (b11 == 73) {
                                                    int i26 = i25 + 1;
                                                    if (i26 != i24) {
                                                        if (bArr5[i26] == 68) {
                                                            int i27 = i25 + 2;
                                                            if (i27 != i24) {
                                                                if (bArr5[i27] == 51) {
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
                                                int i28 = i25 + 1;
                                                if (i28 != i24) {
                                                    byte b12 = bArr5[i28];
                                                    if (((65280 | (b12 & 255)) & 65526) == 65520 && ((b12 & 8) >> 3) == i21) {
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
                    int i29 = this.j;
                    int i30 = i19 | i29;
                    if (i30 == 329) {
                        this.j = 768;
                    } else if (i30 == 511) {
                        this.j = 512;
                    } else if (i30 == 836) {
                        this.j = 1024;
                    } else {
                        if (i30 == 1075) {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            wVar2.F(0);
                            wVar.F(i10);
                            break;
                        }
                        if (i29 != 256) {
                            this.j = 256;
                            i14 = 0;
                            i15 = 4;
                            i16 = 1;
                        }
                    }
                    i17 = i10;
                    i14 = 0;
                    i15 = 4;
                    i16 = 1;
                }
                this.o = (b10 & 8) >> 3;
                this.k = (b10 & 1) == 0;
                if (this.l) {
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.h = 1;
                    this.i = 0;
                }
                wVar.F(i10);
            } else if (i13 != 1) {
                if (i13 == 2) {
                    byte[] bArr6 = wVar2.a;
                    int min = Math.min(wVar.a(), 10 - this.i);
                    wVar.e(this.i, min, bArr6);
                    int i31 = this.i + min;
                    this.i = i31;
                    if (i31 == 10) {
                        this.g.d(10, wVar2);
                        wVar2.F(6);
                        r3.v vVar2 = this.g;
                        int t6 = wVar2.t() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = vVar2;
                        this.u = 0L;
                        this.r = t6;
                    }
                } else if (i13 == 3) {
                    int i32 = this.k ? 7 : 5;
                    byte[] bArr7 = vVar.b;
                    int min2 = Math.min(wVar.a(), i32 - this.i);
                    wVar.e(this.i, min2, bArr7);
                    int i33 = this.i + min2;
                    this.i = i33;
                    if (i33 == i32) {
                        vVar.p(0);
                        if (this.p) {
                            vVar.s(10);
                        } else {
                            int i34 = vVar.i(2) + 1;
                            if (i34 != 2) {
                                h5.a.K("AdtsReader", "Detected audio object type: " + i34 + ", but assuming AAC LC.");
                                i34 = 2;
                            }
                            vVar.s(5);
                            int i35 = vVar.i(3);
                            int i36 = this.n;
                            byte[] bArr8 = {(byte) (((i34 << 3) & 248) | ((i36 >> 1) & 7)), (byte) (((i35 << 3) & 120) | ((i36 << 7) & 128))};
                            p0 h = l3.a.h(new h5.v(bArr8, 2), false);
                            m0 m0Var = new m0();
                            m0Var.a = this.e;
                            m0Var.o = MediaController.AUDIO_MIME_TYPE;
                            m0Var.h = (String) h.c;
                            m0Var.B = h.b;
                            m0Var.C = h.a;
                            m0Var.q = Collections.singletonList(bArr8);
                            m0Var.c = this.d;
                            n0 n0Var = new n0(m0Var);
                            this.q = 1024000000 / n0Var.Q;
                            this.f.b(n0Var);
                            this.p = true;
                        }
                        vVar.s(4);
                        int i37 = vVar.i(13);
                        int i38 = i37 - 7;
                        if (this.k) {
                            i38 = i37 - 9;
                        }
                        r3.v vVar3 = this.f;
                        long j10 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = vVar3;
                        this.u = j10;
                        this.r = i38;
                    }
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(wVar.a(), this.r - this.i);
                    this.t.d(min3, wVar);
                    int i39 = this.i + min3;
                    this.i = i39;
                    int i40 = this.r;
                    if (i39 == i40) {
                        long j11 = this.s;
                        if (j11 != -9223372036854775807L) {
                            this.t.c(j11, 1, i40, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (wVar.a() != 0) {
                vVar.b[0] = wVar.a[wVar.b];
                vVar.p(2);
                int i41 = vVar.i(4);
                int i42 = this.n;
                if (i42 == -1 || i41 == i42) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = i41;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // b4.i
    public final void b() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.e = h0Var.e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 1);
        this.f = i22;
        this.t = i22;
        if (!this.a) {
            this.g = new r3.j();
            return;
        }
        h0Var.a();
        h0Var.b();
        r3.v i23 = mVar.i2(h0Var.d, 5);
        this.g = i23;
        m0 m0Var = new m0();
        h0Var.b();
        m0Var.a = h0Var.e;
        m0Var.o = "application/id3";
        i23.b(new n0(m0Var));
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.s = j10;
        }
    }

    @Override // b4.i
    public final void d() {
    }
}
