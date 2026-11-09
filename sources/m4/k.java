package m4;

import android.util.Pair;
import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Arrays;
import java.util.Collections;
import l2.o0;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k implements i {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public j0 b;
    public final c0 c;
    public final String d;
    public final h2.x e;
    public final o0 f;
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
            this.f = new o0(qs.I2);
            this.e = new h2.x();
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
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h2.x xVar) {
        j jVar;
        o0 o0Var;
        int i7;
        boolean z9;
        long j3;
        long j10;
        boolean z10;
        boolean z11;
        long j11;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        long j12;
        this.b.getClass();
        int i13 = xVar.b;
        int i14 = xVar.c;
        byte[] bArr = xVar.a;
        this.i += xVar.a();
        this.b.b(xVar.a(), xVar);
        while (true) {
            int c10 = i2.o.c(bArr, i13, i14, this.g);
            jVar = this.h;
            o0Var = this.f;
            if (c10 == i14) {
                break;
            }
            int i15 = c10 + 3;
            int i16 = xVar.a[i15] & 255;
            int i17 = c10 - i13;
            if (this.k) {
                i7 = i14;
            } else {
                if (i17 > 0) {
                    jVar.a(i13, c10, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                if (jVar.a) {
                    int i19 = jVar.b - i18;
                    jVar.b = i19;
                    if (jVar.c == 0 && i16 == 181) {
                        jVar.c = i19;
                        i7 = i14;
                    } else {
                        jVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(jVar.d, jVar.b);
                        int i20 = copyOf[4] & 255;
                        byte b10 = copyOf[5];
                        i7 = i14;
                        int i21 = ((b10 & 255) >> 4) | (i20 << 4);
                        int i22 = (copyOf[6] & 255) | ((b10 & 15) << 8);
                        int i23 = (copyOf[7] & 240) >> 4;
                        if (i23 == 2) {
                            f10 = i22 * 4;
                            i11 = i21 * 3;
                        } else if (i23 == 3) {
                            f10 = i22 * 16;
                            i11 = i21 * 9;
                        } else if (i23 != 4) {
                            f11 = 1.0f;
                            e2.t tVar = new e2.t();
                            tVar.a = str;
                            tVar.q = s0.n(this.d);
                            tVar.r = s0.n("video/mpeg2");
                            tVar.y = i21;
                            tVar.z = i22;
                            tVar.E = f11;
                            tVar.u = Collections.singletonList(copyOf);
                            e2.u uVar = new e2.u(tVar);
                            i12 = (copyOf[7] & 15) - 1;
                            if (i12 >= 0 || i12 >= 8) {
                                j12 = 0;
                            } else {
                                double d = r[i12];
                                byte b11 = copyOf[jVar.c + 9];
                                int i24 = (b11 & 96) >> 5;
                                if (i24 != (b11 & 31)) {
                                    d = ((i24 + 1.0d) / (r6 + 1)) * d;
                                }
                                j12 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(uVar, Long.valueOf(j12));
                            this.b.g((e2.u) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f10 = i22 * qs.F1;
                            i11 = i21 * 100;
                        }
                        f11 = f10 / i11;
                        e2.t tVar2 = new e2.t();
                        tVar2.a = str;
                        tVar2.q = s0.n(this.d);
                        tVar2.r = s0.n("video/mpeg2");
                        tVar2.y = i21;
                        tVar2.z = i22;
                        tVar2.E = f11;
                        tVar2.u = Collections.singletonList(copyOf);
                        e2.u uVar2 = new e2.u(tVar2);
                        i12 = (copyOf[7] & 15) - 1;
                        if (i12 >= 0) {
                        }
                        j12 = 0;
                        Pair create2 = Pair.create(uVar2, Long.valueOf(j12));
                        this.b.g((e2.u) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i7 = i14;
                    if (i16 == 179) {
                        jVar.a = true;
                    }
                }
                jVar.a(0, 3, j.e);
            }
            if (o0Var != null) {
                if (i17 > 0) {
                    o0Var.a(i13, c10, bArr);
                    i10 = 0;
                } else {
                    i10 = -i17;
                }
                if (o0Var.e(i10)) {
                    int p10 = i2.o.p(o0Var.e, (byte[]) o0Var.f);
                    String str2 = m0.a;
                    byte[] bArr2 = (byte[]) o0Var.f;
                    h2.x xVar2 = this.e;
                    xVar2.L(p10, bArr2);
                    this.c.a(this.o, xVar2);
                }
                if (i16 == 178) {
                    z9 = true;
                    if (xVar.a[c10 + 2] == 1) {
                        o0Var.h(i16);
                    }
                    if (i16 != 0 || i16 == 179) {
                        int i25 = i7 - c10;
                        if (this.q && this.k) {
                            j11 = this.o;
                            if (j11 != -9223372036854775807L) {
                                j3 = -9223372036854775807L;
                                this.b.c(j11, this.p ? 1 : 0, ((int) (this.i - this.n)) - i25, i25, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i25;
                                    j10 = this.m;
                                    if (j10 == j3) {
                                        long j13 = this.o;
                                        j10 = j13 != j3 ? j13 + this.l : j3;
                                    }
                                    this.o = j10;
                                    z10 = false;
                                    this.p = false;
                                    this.m = j3;
                                    z11 = true;
                                    this.j = true;
                                } else {
                                    z11 = true;
                                    z10 = false;
                                }
                                this.q = i16 == 0 ? z11 : z10;
                            }
                        }
                        j3 = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i25;
                        j10 = this.m;
                        if (j10 == j3) {
                        }
                        this.o = j10;
                        z10 = false;
                        this.p = false;
                        this.m = j3;
                        z11 = true;
                        this.j = true;
                        this.q = i16 == 0 ? z11 : z10;
                    } else if (i16 == 184) {
                        this.p = z9;
                    }
                    i13 = i15;
                    i14 = i7;
                }
            }
            z9 = true;
            if (i16 != 0) {
            }
            int i252 = i7 - c10;
            if (this.q) {
                j11 = this.o;
                if (j11 != -9223372036854775807L) {
                }
            }
            j3 = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i252;
            j10 = this.m;
            if (j10 == j3) {
            }
            this.o = j10;
            z10 = false;
            this.p = false;
            this.m = j3;
            z11 = true;
            this.j = true;
            this.q = i16 == 0 ? z11 : z10;
            i13 = i15;
            i14 = i7;
        }
        if (!this.k) {
            jVar.a(i13, i14, bArr);
        }
        if (o0Var != null) {
            o0Var.a(i13, i14, bArr);
        }
    }

    @Override // m4.i
    public final void d() {
        i2.o.b(this.g);
        j jVar = this.h;
        jVar.a = false;
        jVar.b = 0;
        jVar.c = 0;
        o0 o0Var = this.f;
        if (o0Var != null) {
            o0Var.g();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // m4.i
    public final void e(boolean z9) {
        this.b.getClass();
        if (z9) {
            boolean z10 = this.p;
            this.b.c(this.o, z10 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.m = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.a = (String) g0Var.e;
        g0Var.c();
        this.b = qVar.O1(g0Var.c, 2);
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.b(qVar, g0Var);
        }
    }
}
