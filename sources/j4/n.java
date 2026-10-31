package j4;

import b2.v0;
import c3.k0;
import e2.l0;
import i2.p0;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 a;
    public final e2.x b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final p0 e;
    public m f;
    public long g;
    public String h;
    public k0 i;
    public boolean j;
    public long k;

    public n(d0 d0Var) {
        this.a = d0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new p0(zs.I2);
        this.b = new e2.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(e2.x xVar) {
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
            p0 p0Var = this.e;
            if (c10 == i15) {
                if (!this.j) {
                    lVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (p0Var != null) {
                    p0Var.a(i14, i15, bArr);
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
                                k0 k0Var = this.i;
                                int i21 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                a4.g gVar = new a4.g(copyOf, copyOf.length);
                                gVar.g0(i21);
                                gVar.g0(4);
                                gVar.e0();
                                gVar.f0(8);
                                if (gVar.h()) {
                                    gVar.f0(4);
                                    gVar.f0(3);
                                }
                                int i22 = gVar.i(4);
                                if (i22 == 15) {
                                    int i23 = gVar.i(8);
                                    int i24 = gVar.i(8);
                                    if (i24 == 0) {
                                        e2.a.l("H263Reader", "Invalid aspect ratio");
                                        f7 = 1.0f;
                                        if (gVar.h()) {
                                            gVar.f0(2);
                                            gVar.f0(1);
                                            if (gVar.h()) {
                                                gVar.f0(15);
                                                gVar.e0();
                                                gVar.f0(15);
                                                gVar.e0();
                                                gVar.f0(15);
                                                gVar.e0();
                                                gVar.f0(3);
                                                gVar.f0(11);
                                                gVar.e0();
                                                gVar.f0(15);
                                                gVar.e0();
                                            }
                                        }
                                        if (gVar.i(2) != 0) {
                                            e2.a.l("H263Reader", "Unhandled video object layer shape");
                                        }
                                        gVar.e0();
                                        int i25 = gVar.i(16);
                                        gVar.e0();
                                        if (gVar.h()) {
                                            if (i25 == 0) {
                                                e2.a.l("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i26 = 0;
                                                for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                                    i26++;
                                                }
                                                gVar.f0(i26);
                                            }
                                        }
                                        gVar.e0();
                                        int i28 = gVar.i(13);
                                        gVar.e0();
                                        int i29 = gVar.i(13);
                                        gVar.e0();
                                        gVar.e0();
                                        b2.w wVar = new b2.w();
                                        wVar.a = str;
                                        wVar.q = v0.n("video/mp2t");
                                        wVar.r = v0.n("video/mp4v-es");
                                        wVar.y = i28;
                                        wVar.z = i29;
                                        wVar.E = f7;
                                        wVar.u = Collections.singletonList(copyOf);
                                        i0.a.r(wVar, k0Var);
                                        this.j = true;
                                    } else {
                                        f7 = i23 / i24;
                                        if (gVar.h()) {
                                        }
                                        if (gVar.i(2) != 0) {
                                        }
                                        gVar.e0();
                                        int i252 = gVar.i(16);
                                        gVar.e0();
                                        if (gVar.h()) {
                                        }
                                        gVar.e0();
                                        int i282 = gVar.i(13);
                                        gVar.e0();
                                        int i292 = gVar.i(13);
                                        gVar.e0();
                                        gVar.e0();
                                        b2.w wVar2 = new b2.w();
                                        wVar2.a = str;
                                        wVar2.q = v0.n("video/mp2t");
                                        wVar2.r = v0.n("video/mp4v-es");
                                        wVar2.y = i282;
                                        wVar2.z = i292;
                                        wVar2.E = f7;
                                        wVar2.u = Collections.singletonList(copyOf);
                                        i0.a.r(wVar2, k0Var);
                                        this.j = true;
                                    }
                                } else if (i22 < 7) {
                                    f7 = l[i22];
                                    if (gVar.h()) {
                                    }
                                    if (gVar.i(2) != 0) {
                                    }
                                    gVar.e0();
                                    int i2522 = gVar.i(16);
                                    gVar.e0();
                                    if (gVar.h()) {
                                    }
                                    gVar.e0();
                                    int i2822 = gVar.i(13);
                                    gVar.e0();
                                    int i2922 = gVar.i(13);
                                    gVar.e0();
                                    gVar.e0();
                                    b2.w wVar22 = new b2.w();
                                    wVar22.a = str;
                                    wVar22.q = v0.n("video/mp2t");
                                    wVar22.r = v0.n("video/mp4v-es");
                                    wVar22.y = i2822;
                                    wVar22.z = i2922;
                                    wVar22.E = f7;
                                    wVar22.u = Collections.singletonList(copyOf);
                                    i0.a.r(wVar22, k0Var);
                                    this.j = true;
                                } else {
                                    e2.a.l("H263Reader", "Invalid aspect ratio");
                                    f7 = 1.0f;
                                    if (gVar.h()) {
                                    }
                                    if (gVar.i(2) != 0) {
                                    }
                                    gVar.e0();
                                    int i25222 = gVar.i(16);
                                    gVar.e0();
                                    if (gVar.h()) {
                                    }
                                    gVar.e0();
                                    int i28222 = gVar.i(13);
                                    gVar.e0();
                                    int i29222 = gVar.i(13);
                                    gVar.e0();
                                    gVar.e0();
                                    b2.w wVar222 = new b2.w();
                                    wVar222.a = str;
                                    wVar222.q = v0.n("video/mp2t");
                                    wVar222.r = v0.n("video/mp4v-es");
                                    wVar222.y = i28222;
                                    wVar222.z = i29222;
                                    wVar222.E = f7;
                                    wVar222.u = Collections.singletonList(copyOf);
                                    i0.a.r(wVar222, k0Var);
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
            if (p0Var != null) {
                if (i18 > 0) {
                    p0Var.a(i14, c10, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (p0Var.e(i12)) {
                    int p5 = f2.q.p(p0Var.e, (byte[]) p0Var.f);
                    String str2 = l0.a;
                    byte[] bArr2 = (byte[]) p0Var.f;
                    e2.x xVar2 = this.b;
                    xVar2.L(p5, bArr2);
                    this.a.a(this.k, xVar2);
                }
                if (i17 == 178) {
                    z10 = true;
                    if (xVar.a[c10 + 2] == 1) {
                        p0Var.h(i17);
                    }
                    int i30 = i10 - c10;
                    this.f.b(i30, this.g - i30, this.j);
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
            int i302 = i10 - c10;
            this.f.b(i302, this.g - i302, this.j);
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
    public final void e() {
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
        p0 p0Var = this.e;
        if (p0Var != null) {
            p0Var.g();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.c, 2);
        this.i = I1;
        this.f = new m(I1);
        this.a.b(qVar, g0Var);
    }

    @Override // j4.i
    public final void g(boolean z10) {
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
    public final void h(int i10, long j10) {
        this.k = j10;
    }
}
