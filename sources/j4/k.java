package j4;

import android.util.Pair;
import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k implements i {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public h0 b;
    public final c0 c;
    public final String d;
    public final e2.v e;
    public final l0 f;
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

    public k(c0 c0Var, String str) {
        this.c = c0Var;
        this.d = str;
        j jVar = new j();
        jVar.d = new byte[128];
        this.h = jVar;
        if (c0Var != null) {
            this.f = new l0(178);
            this.e = new e2.v();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e2.v vVar) {
        j jVar;
        l0 l0Var;
        int i10;
        boolean z10;
        long j3;
        long j10;
        long j11;
        int i11;
        float f7;
        int i12;
        float f10;
        int i13;
        long j12;
        e2.d.h(this.b);
        int i14 = vVar.b;
        int i15 = vVar.c;
        byte[] bArr = vVar.a;
        this.i += vVar.a();
        this.b.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i14, i15, this.g);
            jVar = this.h;
            l0Var = this.f;
            if (b10 == i15) {
                break;
            }
            int i16 = b10 + 3;
            int i17 = vVar.a[i16] & 255;
            int i18 = b10 - i14;
            if (this.k) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    jVar.a(i14, b10, bArr);
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
                        byte b11 = copyOf[5];
                        i10 = i15;
                        int i22 = ((b11 & 255) >> 4) | (i21 << 4);
                        int i23 = (copyOf[6] & 255) | ((b11 & 15) << 8);
                        int i24 = (copyOf[7] & 240) >> 4;
                        if (i24 == 2) {
                            f7 = i23 * 4;
                            i12 = i22 * 3;
                        } else if (i24 == 3) {
                            f7 = i23 * 16;
                            i12 = i22 * 9;
                        } else if (i24 != 4) {
                            f10 = 1.0f;
                            b2.r rVar = new b2.r();
                            rVar.a = str;
                            rVar.p = r0.n(this.d);
                            rVar.q = r0.n("video/mpeg2");
                            rVar.x = i22;
                            rVar.y = i23;
                            rVar.D = f10;
                            rVar.t = Collections.singletonList(copyOf);
                            b2.s sVar = new b2.s(rVar);
                            i13 = (copyOf[7] & 15) - 1;
                            if (i13 >= 0 || i13 >= 8) {
                                j12 = 0;
                            } else {
                                double d = r[i13];
                                byte b12 = copyOf[jVar.c + 9];
                                int i25 = (b12 & 96) >> 5;
                                if (i25 != (b12 & 31)) {
                                    d = ((i25 + 1.0d) / (r6 + 1)) * d;
                                }
                                j12 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(sVar, Long.valueOf(j12));
                            this.b.b((b2.s) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f7 = i23 * 121;
                            i12 = i22 * 100;
                        }
                        f10 = f7 / i12;
                        b2.r rVar2 = new b2.r();
                        rVar2.a = str;
                        rVar2.p = r0.n(this.d);
                        rVar2.q = r0.n("video/mpeg2");
                        rVar2.x = i22;
                        rVar2.y = i23;
                        rVar2.D = f10;
                        rVar2.t = Collections.singletonList(copyOf);
                        b2.s sVar2 = new b2.s(rVar2);
                        i13 = (copyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                        }
                        j12 = 0;
                        Pair create2 = Pair.create(sVar2, Long.valueOf(j12));
                        this.b.b((b2.s) create2.first);
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
            if (l0Var != null) {
                if (i18 > 0) {
                    l0Var.a(i14, b10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (l0Var.e(i11)) {
                    int m10 = f2.p.m(l0Var.e, (byte[]) l0Var.f);
                    String str2 = e2.d0.a;
                    byte[] bArr2 = (byte[]) l0Var.f;
                    e2.v vVar2 = this.e;
                    vVar2.H(m10, bArr2);
                    this.c.a(this.o, vVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (vVar.a[b10 + 2] == 1) {
                        l0Var.h(i17);
                    }
                    if (i17 != 0 || i17 == 179) {
                        int i26 = i10 - b10;
                        if (this.q && this.k) {
                            j11 = this.o;
                            if (j11 != -9223372036854775807L) {
                                j3 = -9223372036854775807L;
                                this.b.c(j11, this.p ? 1 : 0, ((int) (this.i - this.n)) - i26, i26, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i26;
                                    j10 = this.m;
                                    if (j10 == j3) {
                                        long j13 = this.o;
                                        j10 = j13 != j3 ? j13 + this.l : j3;
                                    }
                                    this.o = j10;
                                    this.p = false;
                                    this.m = j3;
                                    this.j = true;
                                }
                                this.q = i17 == 0;
                            }
                        }
                        j3 = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i26;
                        j10 = this.m;
                        if (j10 == j3) {
                        }
                        this.o = j10;
                        this.p = false;
                        this.m = j3;
                        this.j = true;
                        this.q = i17 == 0;
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
            int i262 = i10 - b10;
            if (this.q) {
                j11 = this.o;
                if (j11 != -9223372036854775807L) {
                }
            }
            j3 = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i262;
            j10 = this.m;
            if (j10 == j3) {
            }
            this.o = j10;
            this.p = false;
            this.m = j3;
            this.j = true;
            this.q = i17 == 0;
            i14 = i16;
            i15 = i10;
        }
        if (!this.k) {
            jVar.a(i14, i15, bArr);
        }
        if (l0Var != null) {
            l0Var.a(i14, i15, bArr);
        }
    }

    @Override // j4.i
    public final void d() {
        f2.p.a(this.g);
        j jVar = this.h;
        jVar.a = false;
        jVar.b = 0;
        jVar.c = 0;
        l0 l0Var = this.f;
        if (l0Var != null) {
            l0Var.g();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.a = f0Var.e;
        f0Var.b();
        this.b = qVar.R1(f0Var.d, 2);
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }

    @Override // j4.i
    public final void f(boolean z10) {
        e2.d.h(this.b);
        if (z10) {
            boolean z11 = this.p;
            this.b.c(this.o, z11 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.m = j3;
    }
}
