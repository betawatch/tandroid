package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements i {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public i0 h;
    public i0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public i0 v;
    public long w;
    public final c4.f b = new c4.f(new byte[7], 7);
    public final g2.y c = new g2.y(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public e(int i3, String str, String str2, boolean z10) {
        this.a = z10;
        this.d = str;
        this.e = i3;
        this.f = str2;
    }

    @Override // l4.i
    public final void a() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // l4.i
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        byte b10;
        char c2;
        ?? r42;
        int i11;
        char c10;
        int i12;
        char c11;
        int i13;
        this.h.getClass();
        String str = n0.a;
        while (yVar.a() > 0) {
            int i14 = this.j;
            char c12 = 65535;
            g2.y yVar2 = this.c;
            int i15 = 3;
            c4.f fVar = this.b;
            int i16 = 0;
            int i17 = 4;
            int i18 = 1;
            if (i14 == 0) {
                byte[] bArr = yVar.a;
                int i19 = yVar.b;
                int i20 = yVar.c;
                while (true) {
                    if (i19 >= i20) {
                        yVar.N(i19);
                        break;
                    }
                    i3 = i19 + 1;
                    i10 = i15;
                    b10 = bArr[i19];
                    int i21 = b10 & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i21) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c2 = c12;
                        r42 = i18;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i22 = i19 - 1;
                        yVar.N(i19);
                        byte[] bArr2 = (byte[]) fVar.b;
                        if (yVar.a() >= i18) {
                            yVar.k(i16, i18, bArr2);
                            fVar.J(i17);
                            int j10 = fVar.j(i18);
                            int i23 = this.o;
                            if (i23 == -1 || j10 == i23) {
                                if (this.p != -1) {
                                    byte[] bArr3 = (byte[]) fVar.b;
                                    if (yVar.a() < i18) {
                                        break;
                                    }
                                    yVar.k(i16, i18, bArr3);
                                    fVar.J(2);
                                    i13 = 4;
                                    if (fVar.j(4) == this.p) {
                                        yVar.N(i3);
                                    }
                                } else {
                                    i13 = 4;
                                }
                                byte[] bArr4 = (byte[]) fVar.b;
                                if (yVar.a() >= i13) {
                                    yVar.k(i16, i13, bArr4);
                                    fVar.J(14);
                                    int j11 = fVar.j(13);
                                    if (j11 >= 7) {
                                        byte[] bArr5 = yVar.a;
                                        int i24 = yVar.c;
                                        int i25 = i22 + j11;
                                        if (i25 < i24) {
                                            byte b11 = bArr5[i25];
                                            c2 = 65535;
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
                                                    if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == j10) {
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
                                c2 = 65535;
                            }
                            r42 = true;
                        }
                        c2 = 65535;
                        r42 = true;
                    }
                    int i29 = this.l;
                    int i30 = i21 | i29;
                    if (i30 == 329) {
                        i11 = 3;
                        c10 = 256;
                        i12 = 0;
                        c11 = 2;
                        this.l = 768;
                    } else if (i30 == 511) {
                        i11 = 3;
                        c10 = 256;
                        i12 = 0;
                        c11 = 2;
                        this.l = 512;
                    } else if (i30 == 836) {
                        i11 = 3;
                        c10 = 256;
                        i12 = 0;
                        c11 = 2;
                        this.l = 1024;
                    } else {
                        if (i30 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            yVar2.N(0);
                            yVar.N(i3);
                            break;
                        }
                        c10 = 256;
                        if (i29 != 256) {
                            this.l = 256;
                            i11 = 3;
                            i12 = 0;
                            c11 = 2;
                            i18 = r42;
                            c12 = c2;
                            i17 = 4;
                            i16 = i12;
                            i15 = i11;
                        } else {
                            i11 = 3;
                            i12 = 0;
                            c11 = 2;
                        }
                    }
                    i19 = i3;
                    i18 = r42;
                    c12 = c2;
                    i17 = 4;
                    i16 = i12;
                    i15 = i11;
                }
                this.q = (b10 & 8) >> 3;
                this.m = (b10 & 1) == 0;
                if (this.n) {
                    this.j = i10;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                yVar.N(i3);
            } else if (i14 != 1) {
                if (i14 == 2) {
                    byte[] bArr6 = yVar2.a;
                    int min = Math.min(yVar.a(), 10 - this.k);
                    yVar.k(this.k, min, bArr6);
                    int i31 = this.k + min;
                    this.k = i31;
                    if (i31 == 10) {
                        this.i.e(10, yVar2);
                        yVar2.N(6);
                        i0 i0Var = this.i;
                        int z10 = yVar2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = i0Var;
                        this.w = 0L;
                        this.t = z10;
                    }
                } else if (i14 == 3) {
                    int i32 = this.m ? 7 : 5;
                    byte[] bArr7 = (byte[]) fVar.b;
                    int min2 = Math.min(yVar.a(), i32 - this.k);
                    yVar.k(this.k, min2, bArr7);
                    int i33 = this.k + min2;
                    this.k = i33;
                    if (i33 == i32) {
                        fVar.J(0);
                        if (this.r) {
                            fVar.L(10);
                        } else {
                            int j12 = fVar.j(2) + 1;
                            if (j12 != 2) {
                                g2.a.l("AdtsReader", "Detected audio object type: " + j12 + ", but assuming AAC LC.");
                                j12 = 2;
                            }
                            fVar.L(5);
                            int j13 = fVar.j(3);
                            int i34 = this.p;
                            byte[] bArr8 = {(byte) (((j12 << 3) & hs.X3) | ((i34 >> 1) & 7)), (byte) (((j13 << 3) & 120) | ((i34 << 7) & 128))};
                            e3.a n4 = e3.b.n(new c4.f(bArr8, 2), false);
                            d2.u uVar = new d2.u();
                            uVar.a = this.g;
                            uVar.q = u0.n(this.f);
                            uVar.r = u0.n("audio/mp4a-latm");
                            uVar.j = n4.a;
                            uVar.J = n4.c;
                            uVar.K = n4.b;
                            uVar.u = Collections.singletonList(bArr8);
                            uVar.d = this.d;
                            uVar.f = this.e;
                            d2.v vVar = new d2.v(uVar);
                            this.s = 1024000000 / vVar.L;
                            this.h.g(vVar);
                            this.r = true;
                        }
                        fVar.L(4);
                        int j14 = fVar.j(13);
                        int i35 = j14 - 7;
                        if (this.m) {
                            i35 = j14 - 9;
                        }
                        i0 i0Var2 = this.h;
                        long j15 = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = i0Var2;
                        this.w = j15;
                        this.t = i35;
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(yVar.a(), this.t - this.k);
                    this.v.e(min3, yVar);
                    int i36 = this.k + min3;
                    this.k = i36;
                    if (i36 == this.t) {
                        zb.p(this.u != -9223372036854775807L);
                        this.v.d(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (yVar.a() != 0) {
                ((byte[]) fVar.b)[0] = yVar.a[yVar.b];
                fVar.J(2);
                int j16 = fVar.j(4);
                int i37 = this.p;
                if (i37 == -1 || j16 == i37) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = j16;
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

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.u = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.g = (String) f0Var.e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.c, 1);
        this.h = i02;
        this.v = i02;
        if (!this.a) {
            this.i = new e3.n();
            return;
        }
        f0Var.b();
        f0Var.c();
        i0 i03 = qVar.i0(f0Var.c, 5);
        this.i = i03;
        d2.u uVar = new d2.u();
        f0Var.c();
        uVar.a = (String) f0Var.e;
        uVar.q = u0.n(this.f);
        uVar.r = u0.n("application/id3");
        f1.w(uVar, i03);
    }

    @Override // l4.i
    public final void d(boolean z10) {
    }
}
