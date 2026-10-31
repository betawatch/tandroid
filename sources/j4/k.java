package j4;

import android.util.Pair;
import b2.v0;
import c3.k0;
import e2.l0;
import i2.p0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k implements i {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public k0 b;
    public final d0 c;
    public final String d;
    public final e2.x e;
    public final p0 f;
    public final boolean[] g = new boolean[4];
    public final j h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public k(d0 d0Var, String str) {
        this.c = d0Var;
        this.d = str;
        j jVar = new j();
        jVar.d = new byte[128];
        this.h = jVar;
        if (d0Var != null) {
            this.f = new p0(zs.I2);
            this.e = new e2.x();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(e2.x xVar) {
        j jVar;
        p0 p0Var;
        int i10;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        int i11;
        float f7;
        int i12;
        float f10;
        int i13;
        long j13;
        this.b.getClass();
        int i14 = xVar.b;
        int i15 = xVar.c;
        byte[] bArr = xVar.a;
        this.i += xVar.a();
        this.b.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.q.c(bArr, i14, i15, this.g);
            jVar = this.h;
            p0Var = this.f;
            if (c10 == i15) {
                break;
            }
            int i16 = c10 + 3;
            int i17 = xVar.a[i16] & 255;
            int i18 = c10 - i14;
            if (this.k) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    jVar.a(i14, c10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                if (jVar.a) {
                    int i20 = jVar.b - i19;
                    jVar.b = i20;
                    if (jVar.c == 0 && i17 == 181) {
                        jVar.c = i20;
                        i10 = i15;
                    } else {
                        jVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(jVar.d, jVar.b);
                        int i21 = copyOf[4] & 255;
                        byte b10 = copyOf[5];
                        i10 = i15;
                        int i22 = ((b10 & 255) >> 4) | (i21 << 4);
                        int i23 = (copyOf[6] & 255) | ((b10 & 15) << 8);
                        int i24 = (copyOf[7] & 240) >> 4;
                        if (i24 == 2) {
                            f7 = i23 * 4;
                            i12 = i22 * 3;
                        } else if (i24 == 3) {
                            f7 = i23 * 16;
                            i12 = i22 * 9;
                        } else if (i24 != 4) {
                            f10 = 1.0f;
                            b2.w wVar = new b2.w();
                            wVar.a = str;
                            wVar.q = v0.n(this.d);
                            wVar.r = v0.n("video/mpeg2");
                            wVar.y = i22;
                            wVar.z = i23;
                            wVar.E = f10;
                            wVar.u = Collections.singletonList(copyOf);
                            b2.x xVar2 = new b2.x(wVar);
                            i13 = (copyOf[7] & 15) - 1;
                            if (i13 >= 0 || i13 >= 8) {
                                j13 = 0;
                            } else {
                                double d = r[i13];
                                byte b11 = copyOf[jVar.c + 9];
                                int i25 = (b11 & 96) >> 5;
                                if (i25 != (b11 & 31)) {
                                    d = ((i25 + 1.0d) / (r6 + 1)) * d;
                                }
                                j13 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(xVar2, Long.valueOf(j13));
                            this.b.b((b2.x) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f7 = i23 * zs.F1;
                            i12 = i22 * 100;
                        }
                        f10 = f7 / i12;
                        b2.w wVar2 = new b2.w();
                        wVar2.a = str;
                        wVar2.q = v0.n(this.d);
                        wVar2.r = v0.n("video/mpeg2");
                        wVar2.y = i22;
                        wVar2.z = i23;
                        wVar2.E = f10;
                        wVar2.u = Collections.singletonList(copyOf);
                        b2.x xVar22 = new b2.x(wVar2);
                        i13 = (copyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(xVar22, Long.valueOf(j13));
                        this.b.b((b2.x) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i10 = i15;
                    if (i17 == 179) {
                        jVar.a = true;
                    }
                }
                jVar.a(0, 3, j.e);
            }
            if (p0Var != null) {
                if (i18 > 0) {
                    p0Var.a(i14, c10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (p0Var.e(i11)) {
                    int p5 = f2.q.p(p0Var.e, (byte[]) p0Var.f);
                    String str2 = l0.a;
                    byte[] bArr2 = (byte[]) p0Var.f;
                    e2.x xVar3 = this.e;
                    xVar3.L(p5, bArr2);
                    this.c.a(this.o, xVar3);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (xVar.a[c10 + 2] == 1) {
                        p0Var.h(i17);
                    }
                    if (i17 != 0 || i17 == 179) {
                        int i26 = i10 - c10;
                        if (this.q && this.k) {
                            j12 = this.o;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.c(j12, this.p ? 1 : 0, ((int) (this.i - this.n)) - i26, i26, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i26;
                                    j11 = this.m;
                                    if (j11 == j10) {
                                        long j14 = this.o;
                                        j11 = j14 != j10 ? j14 + this.l : j10;
                                    }
                                    this.o = j11;
                                    z11 = false;
                                    this.p = false;
                                    this.m = j10;
                                    z12 = true;
                                    this.j = true;
                                } else {
                                    z12 = true;
                                    z11 = false;
                                }
                                this.q = i17 == 0 ? z12 : z11;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i26;
                        j11 = this.m;
                        if (j11 == j10) {
                        }
                        this.o = j11;
                        z11 = false;
                        this.p = false;
                        this.m = j10;
                        z12 = true;
                        this.j = true;
                        this.q = i17 == 0 ? z12 : z11;
                    } else if (i17 == 184) {
                        this.p = z10;
                    }
                    i14 = i16;
                    i15 = i10;
                }
            }
            z10 = true;
            if (i17 != 0) {
            }
            int i262 = i10 - c10;
            if (this.q) {
                j12 = this.o;
                if (j12 != -9223372036854775807L) {
                }
            }
            j10 = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i262;
            j11 = this.m;
            if (j11 == j10) {
            }
            this.o = j11;
            z11 = false;
            this.p = false;
            this.m = j10;
            z12 = true;
            this.j = true;
            this.q = i17 == 0 ? z12 : z11;
            i14 = i16;
            i15 = i10;
        }
        if (!this.k) {
            jVar.a(i14, i15, bArr);
        }
        if (p0Var != null) {
            p0Var.a(i14, i15, bArr);
        }
    }

    @Override // j4.i
    public final void e() {
        f2.q.b(this.g);
        j jVar = this.h;
        jVar.a = false;
        jVar.b = 0;
        jVar.c = 0;
        p0 p0Var = this.f;
        if (p0Var != null) {
            p0Var.g();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.a = (String) g0Var.e;
        g0Var.c();
        this.b = qVar.I1(g0Var.c, 2);
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.b(qVar, g0Var);
        }
    }

    @Override // j4.i
    public final void g(boolean z10) {
        this.b.getClass();
        if (z10) {
            boolean z11 = this.p;
            this.b.c(this.o, z11 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.m = j10;
    }
}
