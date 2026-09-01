package b4;

import android.util.Pair;
import j3.m0;
import j3.n0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k implements i {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public r3.v b;
    public final d0 c;
    public final h5.w d;
    public final v e;
    public final boolean[] f = new boolean[4];
    public final j g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public k(d0 d0Var) {
        this.c = d0Var;
        j jVar = new j();
        jVar.d = new byte[128];
        this.g = jVar;
        if (d0Var != null) {
            this.e = new v(178);
            this.d = new h5.w();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        j jVar;
        v vVar;
        int i10;
        boolean z4;
        long j10;
        long j11;
        long j12;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        long j13;
        h5.a.j(this.b);
        int i14 = wVar.b;
        int i15 = wVar.c;
        byte[] bArr = wVar.a;
        this.h += wVar.a();
        this.b.d(wVar.a(), wVar);
        while (true) {
            int r10 = h5.a.r(bArr, i14, i15, this.f);
            jVar = this.g;
            vVar = this.e;
            if (r10 == i15) {
                break;
            }
            int i16 = r10 + 3;
            int i17 = wVar.a[i16] & 255;
            int i18 = r10 - i14;
            if (this.j) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    jVar.a(i14, r10, bArr);
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
                            f10 = i23 * 4;
                            i12 = i22 * 3;
                        } else if (i24 == 3) {
                            f10 = i23 * 16;
                            i12 = i22 * 9;
                        } else if (i24 != 4) {
                            f11 = 1.0f;
                            m0 m0Var = new m0();
                            m0Var.a = str;
                            m0Var.o = "video/mpeg2";
                            m0Var.t = i22;
                            m0Var.u = i23;
                            m0Var.x = f11;
                            m0Var.q = Collections.singletonList(copyOf);
                            n0 n0Var = new n0(m0Var);
                            i13 = (copyOf[7] & 15) - 1;
                            if (i13 >= 0 || i13 >= 8) {
                                j13 = 0;
                            } else {
                                double d = q[i13];
                                byte b11 = copyOf[jVar.c + 9];
                                int i25 = (b11 & 96) >> 5;
                                if (i25 != (b11 & 31)) {
                                    d = ((i25 + 1.0d) / (r6 + 1)) * d;
                                }
                                j13 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(n0Var, Long.valueOf(j13));
                            this.b.b((n0) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f10 = i23 * 121;
                            i12 = i22 * 100;
                        }
                        f11 = f10 / i12;
                        m0 m0Var2 = new m0();
                        m0Var2.a = str;
                        m0Var2.o = "video/mpeg2";
                        m0Var2.t = i22;
                        m0Var2.u = i23;
                        m0Var2.x = f11;
                        m0Var2.q = Collections.singletonList(copyOf);
                        n0 n0Var2 = new n0(m0Var2);
                        i13 = (copyOf[7] & 15) - 1;
                        if (i13 >= 0) {
                        }
                        j13 = 0;
                        Pair create2 = Pair.create(n0Var2, Long.valueOf(j13));
                        this.b.b((n0) create2.first);
                        this.k = ((Long) create2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i10 = i15;
                    if (i17 == 179) {
                        jVar.a = true;
                    }
                }
                jVar.a(0, 3, j.e);
            }
            if (vVar != null) {
                if (i18 > 0) {
                    vVar.a(i14, r10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i18;
                }
                if (vVar.e(i11)) {
                    int J = h5.a.J(vVar.c, (byte[]) vVar.f);
                    int i26 = h5.d0.a;
                    byte[] bArr2 = (byte[]) vVar.f;
                    h5.w wVar2 = this.d;
                    wVar2.D(J, bArr2);
                    this.c.a(this.n, wVar2);
                }
                if (i17 == 178) {
                    z4 = true;
                    if (wVar.a[r10 + 2] == 1) {
                        vVar.g(i17);
                    }
                    if (i17 != 0 || i17 == 179) {
                        int i27 = i10 - r10;
                        if (this.p && this.j) {
                            j12 = this.n;
                            if (j12 != -9223372036854775807L) {
                                j10 = -9223372036854775807L;
                                this.b.c(j12, this.o ? 1 : 0, ((int) (this.h - this.m)) - i27, i27, null);
                                if (this.i || this.p) {
                                    this.m = this.h - i27;
                                    j11 = this.l;
                                    if (j11 == j10) {
                                        long j14 = this.n;
                                        j11 = j14 != j10 ? j14 + this.k : j10;
                                    }
                                    this.n = j11;
                                    this.o = false;
                                    this.l = j10;
                                    this.i = true;
                                }
                                this.p = i17 == 0;
                            }
                        }
                        j10 = -9223372036854775807L;
                        if (this.i) {
                        }
                        this.m = this.h - i27;
                        j11 = this.l;
                        if (j11 == j10) {
                        }
                        this.n = j11;
                        this.o = false;
                        this.l = j10;
                        this.i = true;
                        this.p = i17 == 0;
                    } else if (i17 == 184) {
                        this.o = z4;
                    }
                    i14 = i16;
                    i15 = i10;
                }
            }
            z4 = true;
            if (i17 != 0) {
            }
            int i272 = i10 - r10;
            if (this.p) {
                j12 = this.n;
                if (j12 != -9223372036854775807L) {
                }
            }
            j10 = -9223372036854775807L;
            if (this.i) {
            }
            this.m = this.h - i272;
            j11 = this.l;
            if (j11 == j10) {
            }
            this.n = j11;
            this.o = false;
            this.l = j10;
            this.i = true;
            this.p = i17 == 0;
            i14 = i16;
            i15 = i10;
        }
        if (!this.j) {
            jVar.a(i14, i15, bArr);
        }
        if (vVar != null) {
            vVar.a(i14, i15, bArr);
        }
    }

    @Override // b4.i
    public final void b() {
        h5.a.m(this.f);
        j jVar = this.g;
        jVar.a = false;
        jVar.b = 0;
        jVar.c = 0;
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.a = h0Var.e;
        h0Var.b();
        this.b = mVar.i2(h0Var.d, 2);
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.b(mVar, h0Var);
        }
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        this.l = j10;
    }

    @Override // b4.i
    public final void d() {
    }
}
