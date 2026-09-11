package j4;

import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 a;
    public final e2.v b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final l0 e;
    public m f;
    public long g;
    public String h;
    public h0 i;
    public boolean j;
    public long k;

    public n(c0 c0Var) {
        this.a = c0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new l0(178);
        this.b = new e2.v();
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
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        e2.d.h(this.f);
        e2.d.h(this.i);
        int i14 = vVar.b;
        int i15 = vVar.c;
        byte[] bArr = vVar.a;
        this.g += vVar.a();
        this.i.d(vVar.a(), vVar);
        while (true) {
            int b10 = f2.p.b(bArr, i14, i15, this.c);
            l lVar = this.d;
            l0 l0Var = this.e;
            if (b10 == i15) {
                if (!this.j) {
                    lVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (l0Var != null) {
                    l0Var.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = b10 + 3;
            byte b11 = vVar.a[i16];
            int i17 = b11 & 255;
            int i18 = b10 - i14;
            if (this.j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    lVar.a(i14, b10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = lVar.b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            e2.a.n("H263Reader", "Unexpected start code value");
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
                                h0 h0Var = this.i;
                                int i21 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                a4.h hVar = new a4.h(copyOf, copyOf.length);
                                hVar.u(i21);
                                hVar.u(4);
                                hVar.s();
                                hVar.t(8);
                                if (hVar.h()) {
                                    hVar.t(4);
                                    hVar.t(3);
                                }
                                int i22 = hVar.i(4);
                                if (i22 == 15) {
                                    int i23 = hVar.i(8);
                                    int i24 = hVar.i(8);
                                    if (i24 == 0) {
                                        e2.a.n("H263Reader", "Invalid aspect ratio");
                                        f7 = 1.0f;
                                        if (hVar.h()) {
                                            hVar.t(2);
                                            hVar.t(1);
                                            if (hVar.h()) {
                                                hVar.t(15);
                                                hVar.s();
                                                hVar.t(15);
                                                hVar.s();
                                                hVar.t(15);
                                                hVar.s();
                                                hVar.t(3);
                                                hVar.t(11);
                                                hVar.s();
                                                hVar.t(15);
                                                hVar.s();
                                            }
                                        }
                                        if (hVar.i(2) != 0) {
                                            e2.a.n("H263Reader", "Unhandled video object layer shape");
                                        }
                                        hVar.s();
                                        int i25 = hVar.i(16);
                                        hVar.s();
                                        if (hVar.h()) {
                                            if (i25 == 0) {
                                                e2.a.n("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i26 = 0;
                                                for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                                    i26++;
                                                }
                                                hVar.t(i26);
                                            }
                                        }
                                        hVar.s();
                                        int i28 = hVar.i(13);
                                        hVar.s();
                                        int i29 = hVar.i(13);
                                        hVar.s();
                                        hVar.s();
                                        b2.r rVar = new b2.r();
                                        rVar.a = str;
                                        rVar.p = r0.n("video/mp2t");
                                        rVar.q = r0.n("video/mp4v-es");
                                        rVar.x = i28;
                                        rVar.y = i29;
                                        rVar.D = f7;
                                        rVar.t = Collections.singletonList(copyOf);
                                        i2.g.u(rVar, h0Var);
                                        this.j = true;
                                    } else {
                                        f7 = i23 / i24;
                                        if (hVar.h()) {
                                        }
                                        if (hVar.i(2) != 0) {
                                        }
                                        hVar.s();
                                        int i252 = hVar.i(16);
                                        hVar.s();
                                        if (hVar.h()) {
                                        }
                                        hVar.s();
                                        int i282 = hVar.i(13);
                                        hVar.s();
                                        int i292 = hVar.i(13);
                                        hVar.s();
                                        hVar.s();
                                        b2.r rVar2 = new b2.r();
                                        rVar2.a = str;
                                        rVar2.p = r0.n("video/mp2t");
                                        rVar2.q = r0.n("video/mp4v-es");
                                        rVar2.x = i282;
                                        rVar2.y = i292;
                                        rVar2.D = f7;
                                        rVar2.t = Collections.singletonList(copyOf);
                                        i2.g.u(rVar2, h0Var);
                                        this.j = true;
                                    }
                                } else if (i22 < 7) {
                                    f7 = l[i22];
                                    if (hVar.h()) {
                                    }
                                    if (hVar.i(2) != 0) {
                                    }
                                    hVar.s();
                                    int i2522 = hVar.i(16);
                                    hVar.s();
                                    if (hVar.h()) {
                                    }
                                    hVar.s();
                                    int i2822 = hVar.i(13);
                                    hVar.s();
                                    int i2922 = hVar.i(13);
                                    hVar.s();
                                    hVar.s();
                                    b2.r rVar22 = new b2.r();
                                    rVar22.a = str;
                                    rVar22.p = r0.n("video/mp2t");
                                    rVar22.q = r0.n("video/mp4v-es");
                                    rVar22.x = i2822;
                                    rVar22.y = i2922;
                                    rVar22.D = f7;
                                    rVar22.t = Collections.singletonList(copyOf);
                                    i2.g.u(rVar22, h0Var);
                                    this.j = true;
                                } else {
                                    e2.a.n("H263Reader", "Invalid aspect ratio");
                                    f7 = 1.0f;
                                    if (hVar.h()) {
                                    }
                                    if (hVar.i(2) != 0) {
                                    }
                                    hVar.s();
                                    int i25222 = hVar.i(16);
                                    hVar.s();
                                    if (hVar.h()) {
                                    }
                                    hVar.s();
                                    int i28222 = hVar.i(13);
                                    hVar.s();
                                    int i29222 = hVar.i(13);
                                    hVar.s();
                                    hVar.s();
                                    b2.r rVar222 = new b2.r();
                                    rVar222.a = str;
                                    rVar222.p = r0.n("video/mp2t");
                                    rVar222.q = r0.n("video/mp4v-es");
                                    rVar222.x = i28222;
                                    rVar222.y = i29222;
                                    rVar222.D = f7;
                                    rVar222.t = Collections.singletonList(copyOf);
                                    i2.g.u(rVar222, h0Var);
                                    this.j = true;
                                }
                            } else {
                                i13 = 0;
                            }
                        } else if ((b11 & 240) != 32) {
                            e2.a.n("H263Reader", "Unexpected start code value");
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
                            e2.a.n("H263Reader", "Unexpected start code value");
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
            this.f.a(i14, b10, bArr);
            if (l0Var != null) {
                if (i18 > 0) {
                    l0Var.a(i14, b10, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (l0Var.e(i12)) {
                    int m10 = f2.p.m(l0Var.e, (byte[]) l0Var.f);
                    String str2 = e2.d0.a;
                    byte[] bArr2 = (byte[]) l0Var.f;
                    e2.v vVar2 = this.b;
                    vVar2.H(m10, bArr2);
                    this.a.a(this.k, vVar2);
                }
                if (i17 == 178) {
                    if (vVar.a[b10 + 2] == 1) {
                        l0Var.h(i17);
                    }
                    int i30 = i10 - b10;
                    this.f.b(i30, this.g - i30, this.j);
                    m mVar = this.f;
                    long j3 = this.k;
                    mVar.e = i17;
                    mVar.d = false;
                    mVar.b = i17 != 182 || i17 == 179;
                    mVar.c = i17 != 182;
                    mVar.f = 0;
                    mVar.h = j3;
                    i15 = i10;
                    i14 = i11;
                }
            }
            int i302 = i10 - b10;
            this.f.b(i302, this.g - i302, this.j);
            m mVar2 = this.f;
            long j32 = this.k;
            mVar2.e = i17;
            mVar2.d = false;
            mVar2.b = i17 != 182 || i17 == 179;
            mVar2.c = i17 != 182;
            mVar2.f = 0;
            mVar2.h = j32;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override // j4.i
    public final void d() {
        f2.p.a(this.c);
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
        l0 l0Var = this.e;
        if (l0Var != null) {
            l0Var.g();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.h = f0Var.e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.i = R1;
        this.f = new m(R1);
        this.a.b(qVar, f0Var);
    }

    @Override // j4.i
    public final void f(boolean z10) {
        e2.d.h(this.f);
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
    public final void g(int i10, long j3) {
        this.k = j3;
    }
}
