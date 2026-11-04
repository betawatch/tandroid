package l4;

import android.util.Pair;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Arrays;
import java.util.Collections;
import k2.o0;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements i {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public i0 b;
    public final c0 c;
    public final String d;
    public final g2.y e;
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
            this.f = new o0(hs.I2);
            this.e = new g2.y();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // l4.i
    public final void a() {
        h2.o.b(this.g);
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    @Override // l4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g2.y yVar) {
        j jVar;
        o0 o0Var;
        int i3;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        long j12;
        int i10;
        float f10;
        int i11;
        float f11;
        int i12;
        long j13;
        this.b.getClass();
        int i13 = yVar.b;
        int i14 = yVar.c;
        byte[] bArr = yVar.a;
        this.i += yVar.a();
        this.b.e(yVar.a(), yVar);
        while (true) {
            int c2 = h2.o.c(bArr, i13, i14, this.g);
            jVar = this.h;
            o0Var = this.f;
            if (c2 == i14) {
                break;
            }
            int i15 = c2 + 3;
            int i16 = yVar.a[i15] & 255;
            int i17 = c2 - i13;
            if (this.k) {
                i3 = i14;
            } else {
                if (i17 > 0) {
                    jVar.a(i13, c2, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                if (jVar.a) {
                    int i19 = jVar.b - i18;
                    jVar.b = i19;
                    if (jVar.c == 0 && i16 == 181) {
                        jVar.c = i19;
                        i3 = i14;
                    } else {
                        jVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(jVar.d, jVar.b);
                        int i20 = copyOf[4] & 255;
                        byte b10 = copyOf[5];
                        i3 = i14;
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
                            d2.u uVar = new d2.u();
                            uVar.a = str;
                            uVar.q = u0.n(this.d);
                            uVar.r = u0.n("video/mpeg2");
                            uVar.y = i21;
                            uVar.z = i22;
                            uVar.E = f11;
                            uVar.u = Collections.singletonList(copyOf);
                            d2.v vVar = new d2.v(uVar);
                            i12 = (copyOf[7] & 15) - 1;
                            if (i12 >= 0 || i12 >= 8) {
                                j13 = 0;
                            } else {
                                double d = r[i12];
                                byte b11 = copyOf[jVar.c + 9];
                                int i24 = (b11 & 96) >> 5;
                                if (i24 != (b11 & 31)) {
                                    d = ((i24 + 1.0d) / (r6 + 1)) * d;
                                }
                                j13 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(vVar, Long.valueOf(j13));
                            this.b.g((d2.v) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f10 = i22 * hs.F1;
                            i11 = i21 * 100;
                        }
                        f11 = f10 / i11;
                        d2.u uVar2 = new d2.u();
                        uVar2.a = str;
                        uVar2.q = u0.n(this.d);
                        uVar2.r = u0.n("video/mpeg2");
                        uVar2.y = i21;
                        uVar2.z = i22;
                        uVar2.E = f11;
                        uVar2.u = Collections.singletonList(copyOf);
                        d2.v vVar2 = new d2.v(uVar2);
                        i12 = (copyOf[7] & 15) - 1;
                        if (i12 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(vVar2, Long.valueOf(j13));
                        this.b.g((d2.v) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i3 = i14;
                    if (i16 == 179) {
                        jVar.a = true;
                    }
                }
                jVar.a(0, 3, j.e);
            }
            if (o0Var != null) {
                if (i17 > 0) {
                    o0Var.a(i13, c2, bArr);
                    i10 = 0;
                } else {
                    i10 = -i17;
                }
                if (o0Var.e(i10)) {
                    int p10 = h2.o.p(o0Var.e, (byte[]) o0Var.f);
                    String str2 = n0.a;
                    byte[] bArr2 = (byte[]) o0Var.f;
                    g2.y yVar2 = this.e;
                    yVar2.L(p10, bArr2);
                    this.c.a(this.o, yVar2);
                }
                if (i16 == 178) {
                    z10 = true;
                    if (yVar.a[c2 + 2] == 1) {
                        o0Var.h(i16);
                    }
                    if (i16 != 0 || i16 == 179) {
                        int i25 = i3 - c2;
                        if (this.q && this.k) {
                            j12 = this.o;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.d(j12, this.p ? 1 : 0, ((int) (this.i - this.n)) - i25, i25, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i25;
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
                                this.q = i16 == 0 ? z12 : z11;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i25;
                        j11 = this.m;
                        if (j11 == j10) {
                        }
                        this.o = j11;
                        z11 = false;
                        this.p = false;
                        this.m = j10;
                        z12 = true;
                        this.j = true;
                        this.q = i16 == 0 ? z12 : z11;
                    } else if (i16 == 184) {
                        this.p = z10;
                    }
                    i13 = i15;
                    i14 = i3;
                }
            }
            z10 = true;
            if (i16 != 0) {
            }
            int i252 = i3 - c2;
            if (this.q) {
                j12 = this.o;
                if (j12 != -9223372036854775807L) {
                }
            }
            j10 = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i252;
            j11 = this.m;
            if (j11 == j10) {
            }
            this.o = j11;
            z11 = false;
            this.p = false;
            this.m = j10;
            z12 = true;
            this.j = true;
            this.q = i16 == 0 ? z12 : z11;
            i13 = i15;
            i14 = i3;
        }
        if (!this.k) {
            jVar.a(i13, i14, bArr);
        }
        if (o0Var != null) {
            o0Var.a(i13, i14, bArr);
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
        this.b.getClass();
        if (z10) {
            boolean z11 = this.p;
            this.b.d(this.o, z11 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.m = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.a = (String) f0Var.e;
        f0Var.c();
        this.b = qVar.i0(f0Var.c, 2);
        c0 c0Var = this.c;
        if (c0Var != null) {
            c0Var.b(qVar, f0Var);
        }
    }
}
