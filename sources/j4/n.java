package j4;

import b2.v0;
import c3.l0;
import e2.m0;
import i2.n0;
import i2.o1;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 a;
    public final e2.x b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final n0 e;
    public m f;
    public long g;
    public String h;
    public l0 i;
    public boolean j;
    public long k;

    public n(c0 c0Var) {
        this.a = c0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new n0(178);
        this.b = new e2.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e2.x xVar) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        float f7;
        this.f.getClass();
        this.i.getClass();
        int i14 = xVar.b;
        int i15 = xVar.c;
        byte[] bArr = xVar.a;
        this.g += xVar.a();
        this.i.d(xVar.a(), xVar);
        while (true) {
            int c10 = f2.q.c(bArr, i14, i15, this.c);
            l lVar = this.d;
            n0 n0Var = this.e;
            if (c10 == i15) {
                if (!this.j) {
                    lVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (n0Var != null) {
                    n0Var.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = c10 + 3;
            byte b10 = xVar.a[i16];
            int i17 = b10 & 255;
            int i18 = c10 - i14;
            if (this.j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    lVar.a(i14, c10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = lVar.b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            e2.a.l("H263Reader", "Unexpected start code value");
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            lVar.b = 2;
                        }
                    } else if (i20 != 2) {
                        i11 = i16;
                        if (i20 != 3) {
                            if (i20 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i17 == 179 || i17 == 181) {
                                lVar.c -= i19;
                                lVar.a = false;
                                l0 l0Var = this.i;
                                int i21 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                a4.g gVar = new a4.g(copyOf, copyOf.length);
                                gVar.p(i21);
                                gVar.p(4);
                                gVar.n();
                                gVar.o(8);
                                if (gVar.f()) {
                                    gVar.o(4);
                                    gVar.o(3);
                                }
                                int g10 = gVar.g(4);
                                if (g10 == 15) {
                                    int g11 = gVar.g(8);
                                    int g12 = gVar.g(8);
                                    if (g12 == 0) {
                                        e2.a.l("H263Reader", "Invalid aspect ratio");
                                        f7 = 1.0f;
                                        if (gVar.f()) {
                                            gVar.o(2);
                                            gVar.o(1);
                                            if (gVar.f()) {
                                                gVar.o(15);
                                                gVar.n();
                                                gVar.o(15);
                                                gVar.n();
                                                gVar.o(15);
                                                gVar.n();
                                                gVar.o(3);
                                                gVar.o(11);
                                                gVar.n();
                                                gVar.o(15);
                                                gVar.n();
                                            }
                                        }
                                        if (gVar.g(2) != 0) {
                                            e2.a.l("H263Reader", "Unhandled video object layer shape");
                                        }
                                        gVar.n();
                                        int g13 = gVar.g(16);
                                        gVar.n();
                                        if (gVar.f()) {
                                            if (g13 == 0) {
                                                e2.a.l("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i22 = 0;
                                                for (int i23 = g13 - 1; i23 > 0; i23 >>= 1) {
                                                    i22++;
                                                }
                                                gVar.o(i22);
                                            }
                                        }
                                        gVar.n();
                                        int g14 = gVar.g(13);
                                        gVar.n();
                                        int g15 = gVar.g(13);
                                        gVar.n();
                                        gVar.n();
                                        b2.v vVar = new b2.v();
                                        vVar.a = str;
                                        vVar.q = v0.n("video/mp2t");
                                        vVar.r = v0.n("video/mp4v-es");
                                        vVar.y = g14;
                                        vVar.z = g15;
                                        vVar.E = f7;
                                        vVar.u = Collections.singletonList(copyOf);
                                        o1.v(vVar, l0Var);
                                        this.j = true;
                                    } else {
                                        f7 = g11 / g12;
                                        if (gVar.f()) {
                                        }
                                        if (gVar.g(2) != 0) {
                                        }
                                        gVar.n();
                                        int g132 = gVar.g(16);
                                        gVar.n();
                                        if (gVar.f()) {
                                        }
                                        gVar.n();
                                        int g142 = gVar.g(13);
                                        gVar.n();
                                        int g152 = gVar.g(13);
                                        gVar.n();
                                        gVar.n();
                                        b2.v vVar2 = new b2.v();
                                        vVar2.a = str;
                                        vVar2.q = v0.n("video/mp2t");
                                        vVar2.r = v0.n("video/mp4v-es");
                                        vVar2.y = g142;
                                        vVar2.z = g152;
                                        vVar2.E = f7;
                                        vVar2.u = Collections.singletonList(copyOf);
                                        o1.v(vVar2, l0Var);
                                        this.j = true;
                                    }
                                } else if (g10 < 7) {
                                    f7 = l[g10];
                                    if (gVar.f()) {
                                    }
                                    if (gVar.g(2) != 0) {
                                    }
                                    gVar.n();
                                    int g1322 = gVar.g(16);
                                    gVar.n();
                                    if (gVar.f()) {
                                    }
                                    gVar.n();
                                    int g1422 = gVar.g(13);
                                    gVar.n();
                                    int g1522 = gVar.g(13);
                                    gVar.n();
                                    gVar.n();
                                    b2.v vVar22 = new b2.v();
                                    vVar22.a = str;
                                    vVar22.q = v0.n("video/mp2t");
                                    vVar22.r = v0.n("video/mp4v-es");
                                    vVar22.y = g1422;
                                    vVar22.z = g1522;
                                    vVar22.E = f7;
                                    vVar22.u = Collections.singletonList(copyOf);
                                    o1.v(vVar22, l0Var);
                                    this.j = true;
                                } else {
                                    e2.a.l("H263Reader", "Invalid aspect ratio");
                                    f7 = 1.0f;
                                    if (gVar.f()) {
                                    }
                                    if (gVar.g(2) != 0) {
                                    }
                                    gVar.n();
                                    int g13222 = gVar.g(16);
                                    gVar.n();
                                    if (gVar.f()) {
                                    }
                                    gVar.n();
                                    int g14222 = gVar.g(13);
                                    gVar.n();
                                    int g15222 = gVar.g(13);
                                    gVar.n();
                                    gVar.n();
                                    b2.v vVar222 = new b2.v();
                                    vVar222.a = str;
                                    vVar222.q = v0.n("video/mp2t");
                                    vVar222.r = v0.n("video/mp4v-es");
                                    vVar222.y = g14222;
                                    vVar222.z = g15222;
                                    vVar222.E = f7;
                                    vVar222.u = Collections.singletonList(copyOf);
                                    o1.v(vVar222, l0Var);
                                    this.j = true;
                                }
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            e2.a.l("H263Reader", "Unexpected start code value");
                            i13 = 0;
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            i13 = 0;
                            lVar.d = lVar.c;
                            lVar.b = 4;
                        }
                    } else {
                        i11 = i16;
                        i13 = 0;
                        if (i17 > 31) {
                            e2.a.l("H263Reader", "Unexpected start code value");
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            lVar.b = 3;
                        }
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i13 = 0;
                    if (i17 == 176) {
                        lVar.b = 1;
                        lVar.a = true;
                    }
                }
                lVar.a(i13, 3, l.f);
            }
            this.f.a(i14, c10, bArr);
            if (n0Var != null) {
                if (i18 > 0) {
                    n0Var.a(i14, c10, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (n0Var.e(i12)) {
                    int p5 = f2.q.p(n0Var.e, (byte[]) n0Var.f);
                    String str2 = m0.a;
                    byte[] bArr2 = (byte[]) n0Var.f;
                    e2.x xVar2 = this.b;
                    xVar2.L(p5, bArr2);
                    this.a.a(this.k, xVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (xVar.a[c10 + 2] == 1) {
                        n0Var.h(i17);
                    }
                    int i24 = i10 - c10;
                    this.f.b(i24, this.g - i24, this.j);
                    m mVar = this.f;
                    long j10 = this.k;
                    mVar.e = i17;
                    mVar.d = false;
                    mVar.b = (i17 != 182 || i17 == 179) ? z10 : false;
                    mVar.c = i17 != 182 ? z10 : false;
                    mVar.f = 0;
                    mVar.h = j10;
                    i15 = i10;
                    i14 = i11;
                }
            }
            z10 = true;
            int i242 = i10 - c10;
            this.f.b(i242, this.g - i242, this.j);
            m mVar2 = this.f;
            long j102 = this.k;
            mVar2.e = i17;
            mVar2.d = false;
            mVar2.b = (i17 != 182 || i17 == 179) ? z10 : false;
            mVar2.c = i17 != 182 ? z10 : false;
            mVar2.f = 0;
            mVar2.h = j102;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override // j4.i
    public final void c() {
        f2.q.b(this.c);
        l lVar = this.d;
        lVar.a = false;
        lVar.c = 0;
        lVar.b = 0;
        m mVar = this.f;
        if (mVar != null) {
            mVar.b = false;
            mVar.c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        n0 n0Var = this.e;
        if (n0Var != null) {
            n0Var.g();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // j4.i
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        l0 j02 = sVar.j0(f0Var.c, 2);
        this.i = j02;
        this.f = new m(j02);
        this.a.b(sVar, f0Var);
    }

    @Override // j4.i
    public final void e(boolean z10) {
        this.f.getClass();
        if (z10) {
            this.f.b(0, this.g, this.j);
            m mVar = this.f;
            mVar.b = false;
            mVar.c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
        this.k = j10;
    }
}
