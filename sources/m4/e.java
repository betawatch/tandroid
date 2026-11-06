package m4;

import a8.ia;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final d4.f b = new d4.f(new byte[7], 7);
    public final h2.x c = new h2.x(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public e(int i7, String str, String str2, boolean z9) {
        this.a = z9;
        this.d = str;
        this.e = i7;
        this.f = str2;
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
    @Override // m4.i
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        byte b10;
        char c10;
        ?? r42;
        int i11;
        char c11;
        int i12;
        char c12;
        int i13;
        this.h.getClass();
        String str = m0.a;
        while (xVar.a() > 0) {
            int i14 = this.j;
            char c13 = 65535;
            h2.x xVar2 = this.c;
            int i15 = 3;
            d4.f fVar = this.b;
            int i16 = 0;
            int i17 = 4;
            int i18 = 1;
            if (i14 == 0) {
                byte[] bArr = xVar.a;
                int i19 = xVar.b;
                int i20 = xVar.c;
                while (true) {
                    if (i19 >= i20) {
                        xVar.N(i19);
                        break;
                    }
                    i7 = i19 + 1;
                    i10 = i15;
                    b10 = bArr[i19];
                    int i21 = b10 & 255;
                    if (this.l != 512 || (((65280 | ((((byte) i21) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c10 = c13;
                        r42 = i18;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i22 = i19 - 1;
                        xVar.N(i19);
                        byte[] bArr2 = (byte[]) fVar.b;
                        if (xVar.a() >= i18) {
                            xVar.k(i16, i18, bArr2);
                            fVar.J(i17);
                            int j3 = fVar.j(i18);
                            int i23 = this.o;
                            if (i23 == -1 || j3 == i23) {
                                if (this.p != -1) {
                                    byte[] bArr3 = (byte[]) fVar.b;
                                    if (xVar.a() < i18) {
                                        break;
                                    }
                                    xVar.k(i16, i18, bArr3);
                                    fVar.J(2);
                                    i13 = 4;
                                    if (fVar.j(4) == this.p) {
                                        xVar.N(i7);
                                    }
                                } else {
                                    i13 = 4;
                                }
                                byte[] bArr4 = (byte[]) fVar.b;
                                if (xVar.a() >= i13) {
                                    xVar.k(i16, i13, bArr4);
                                    fVar.J(14);
                                    int j10 = fVar.j(13);
                                    if (j10 >= 7) {
                                        byte[] bArr5 = xVar.a;
                                        int i24 = xVar.c;
                                        int i25 = i22 + j10;
                                        if (i25 < i24) {
                                            byte b11 = bArr5[i25];
                                            c10 = 65535;
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
                                                    if ((((65280 | ((b12 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b12 & 8) >> 3) == j3) {
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
                    int i29 = this.l;
                    int i30 = i21 | i29;
                    if (i30 == 329) {
                        i11 = 3;
                        c11 = 256;
                        i12 = 0;
                        c12 = 2;
                        this.l = 768;
                    } else if (i30 == 511) {
                        i11 = 3;
                        c11 = 256;
                        i12 = 0;
                        c12 = 2;
                        this.l = 512;
                    } else if (i30 == 836) {
                        i11 = 3;
                        c11 = 256;
                        i12 = 0;
                        c12 = 2;
                        this.l = 1024;
                    } else {
                        if (i30 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            xVar2.N(0);
                            xVar.N(i7);
                            break;
                        }
                        c11 = 256;
                        if (i29 != 256) {
                            this.l = 256;
                            i11 = 3;
                            i12 = 0;
                            c12 = 2;
                            i18 = r42;
                            c13 = c10;
                            i17 = 4;
                            i16 = i12;
                            i15 = i11;
                        } else {
                            i11 = 3;
                            i12 = 0;
                            c12 = 2;
                        }
                    }
                    i19 = i7;
                    i18 = r42;
                    c13 = c10;
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
                xVar.N(i7);
            } else if (i14 != 1) {
                if (i14 == 2) {
                    byte[] bArr6 = xVar2.a;
                    int min = Math.min(xVar.a(), 10 - this.k);
                    xVar.k(this.k, min, bArr6);
                    int i31 = this.k + min;
                    this.k = i31;
                    if (i31 == 10) {
                        this.i.b(10, xVar2);
                        xVar2.N(6);
                        j0 j0Var = this.i;
                        int z9 = xVar2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = j0Var;
                        this.w = 0L;
                        this.t = z9;
                    }
                } else if (i14 == 3) {
                    int i32 = this.m ? 7 : 5;
                    byte[] bArr7 = (byte[]) fVar.b;
                    int min2 = Math.min(xVar.a(), i32 - this.k);
                    xVar.k(this.k, min2, bArr7);
                    int i33 = this.k + min2;
                    this.k = i33;
                    if (i33 == i32) {
                        fVar.J(0);
                        if (this.r) {
                            fVar.L(10);
                        } else {
                            int j11 = fVar.j(2) + 1;
                            if (j11 != 2) {
                                h2.a.l("AdtsReader", "Detected audio object type: " + j11 + ", but assuming AAC LC.");
                                j11 = 2;
                            }
                            fVar.L(5);
                            int j12 = fVar.j(3);
                            int i34 = this.p;
                            byte[] bArr8 = {(byte) (((j11 << 3) & qs.X3) | ((i34 >> 1) & 7)), (byte) (((j12 << 3) & 120) | ((i34 << 7) & 128))};
                            f3.a n10 = f3.b.n(new d4.f(bArr8, 2), false);
                            e2.t tVar = new e2.t();
                            tVar.a = this.g;
                            tVar.q = s0.n(this.f);
                            tVar.r = s0.n("audio/mp4a-latm");
                            tVar.j = n10.a;
                            tVar.J = n10.c;
                            tVar.K = n10.b;
                            tVar.u = Collections.singletonList(bArr8);
                            tVar.d = this.d;
                            tVar.f = this.e;
                            e2.u uVar = new e2.u(tVar);
                            this.s = 1024000000 / uVar.L;
                            this.h.g(uVar);
                            this.r = true;
                        }
                        fVar.L(4);
                        int j13 = fVar.j(13);
                        int i35 = j13 - 7;
                        if (this.m) {
                            i35 = j13 - 9;
                        }
                        j0 j0Var2 = this.h;
                        long j14 = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = j0Var2;
                        this.w = j14;
                        this.t = i35;
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(xVar.a(), this.t - this.k);
                    this.v.b(min3, xVar);
                    int i36 = this.k + min3;
                    this.k = i36;
                    if (i36 == this.t) {
                        ia.p(this.u != -9223372036854775807L);
                        this.v.c(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (xVar.a() != 0) {
                ((byte[]) fVar.b)[0] = xVar.a[xVar.b];
                fVar.J(2);
                int j15 = fVar.j(4);
                int i37 = this.p;
                if (i37 == -1 || j15 == i37) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = j15;
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

    @Override // m4.i
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.u = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.g = (String) g0Var.e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.c, 1);
        this.h = O1;
        this.v = O1;
        if (!this.a) {
            this.i = new f3.n();
            return;
        }
        g0Var.b();
        g0Var.c();
        j0 O12 = qVar.O1(g0Var.c, 5);
        this.i = O12;
        e2.t tVar = new e2.t();
        g0Var.c();
        tVar.a = (String) g0Var.e;
        tVar.q = s0.n(this.f);
        tVar.r = s0.n("application/id3");
        f1.s(tVar, O12);
    }

    @Override // m4.i
    public final void e(boolean z9) {
    }
}
