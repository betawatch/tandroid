package b4;

import j3.m0;
import j3.n0;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 a;
    public final h5.w b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final v e;
    public m f;
    public long g;
    public String h;
    public r3.v i;
    public boolean j;
    public long k;

    public n(d0 d0Var) {
        this.a = d0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new v(178);
        this.b = new h5.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        int i10;
        int i11;
        m mVar;
        long j10;
        int i12;
        int i13;
        float f10;
        h5.a.j(this.f);
        h5.a.j(this.i);
        int i14 = wVar.b;
        int i15 = wVar.c;
        byte[] bArr = wVar.a;
        this.g += wVar.a();
        this.i.d(wVar.a(), wVar);
        while (true) {
            int r10 = h5.a.r(bArr, i14, i15, this.c);
            l lVar = this.d;
            v vVar = this.e;
            if (r10 == i15) {
                if (!this.j) {
                    lVar.a(i14, i15, bArr);
                }
                this.f.a(i14, i15, bArr);
                if (vVar != null) {
                    vVar.a(i14, i15, bArr);
                    return;
                }
                return;
            }
            int i16 = r10 + 3;
            byte b10 = wVar.a[i16];
            int i17 = b10 & 255;
            int i18 = r10 - i14;
            if (this.j) {
                i10 = i15;
                i11 = i16;
            } else {
                if (i18 > 0) {
                    lVar.a(i14, r10, bArr);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = lVar.b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i11 = i16;
                        i13 = 0;
                        if (i17 != 181) {
                            h5.a.K("H263Reader", "Unexpected start code value");
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
                                r3.v vVar2 = this.i;
                                int i21 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                h5.v vVar3 = new h5.v(copyOf, copyOf.length);
                                vVar3.t(i21);
                                vVar3.t(4);
                                vVar3.r();
                                vVar3.s(8);
                                if (vVar3.h()) {
                                    vVar3.s(4);
                                    vVar3.s(3);
                                }
                                int i22 = vVar3.i(4);
                                if (i22 == 15) {
                                    int i23 = vVar3.i(8);
                                    int i24 = vVar3.i(8);
                                    if (i24 == 0) {
                                        h5.a.K("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                        if (vVar3.h()) {
                                            vVar3.s(2);
                                            vVar3.s(1);
                                            if (vVar3.h()) {
                                                vVar3.s(15);
                                                vVar3.r();
                                                vVar3.s(15);
                                                vVar3.r();
                                                vVar3.s(15);
                                                vVar3.r();
                                                vVar3.s(3);
                                                vVar3.s(11);
                                                vVar3.r();
                                                vVar3.s(15);
                                                vVar3.r();
                                            }
                                        }
                                        if (vVar3.i(2) != 0) {
                                            h5.a.K("H263Reader", "Unhandled video object layer shape");
                                        }
                                        vVar3.r();
                                        int i25 = vVar3.i(16);
                                        vVar3.r();
                                        if (vVar3.h()) {
                                            if (i25 == 0) {
                                                h5.a.K("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i26 = 0;
                                                for (int i27 = i25 - 1; i27 > 0; i27 >>= 1) {
                                                    i26++;
                                                }
                                                vVar3.s(i26);
                                            }
                                        }
                                        vVar3.r();
                                        int i28 = vVar3.i(13);
                                        vVar3.r();
                                        int i29 = vVar3.i(13);
                                        vVar3.r();
                                        vVar3.r();
                                        m0 m0Var = new m0();
                                        m0Var.a = str;
                                        m0Var.o = "video/mp4v-es";
                                        m0Var.t = i28;
                                        m0Var.u = i29;
                                        m0Var.x = f10;
                                        m0Var.q = Collections.singletonList(copyOf);
                                        vVar2.b(new n0(m0Var));
                                        this.j = true;
                                    } else {
                                        f10 = i23 / i24;
                                        if (vVar3.h()) {
                                        }
                                        if (vVar3.i(2) != 0) {
                                        }
                                        vVar3.r();
                                        int i252 = vVar3.i(16);
                                        vVar3.r();
                                        if (vVar3.h()) {
                                        }
                                        vVar3.r();
                                        int i282 = vVar3.i(13);
                                        vVar3.r();
                                        int i292 = vVar3.i(13);
                                        vVar3.r();
                                        vVar3.r();
                                        m0 m0Var2 = new m0();
                                        m0Var2.a = str;
                                        m0Var2.o = "video/mp4v-es";
                                        m0Var2.t = i282;
                                        m0Var2.u = i292;
                                        m0Var2.x = f10;
                                        m0Var2.q = Collections.singletonList(copyOf);
                                        vVar2.b(new n0(m0Var2));
                                        this.j = true;
                                    }
                                } else if (i22 < 7) {
                                    f10 = l[i22];
                                    if (vVar3.h()) {
                                    }
                                    if (vVar3.i(2) != 0) {
                                    }
                                    vVar3.r();
                                    int i2522 = vVar3.i(16);
                                    vVar3.r();
                                    if (vVar3.h()) {
                                    }
                                    vVar3.r();
                                    int i2822 = vVar3.i(13);
                                    vVar3.r();
                                    int i2922 = vVar3.i(13);
                                    vVar3.r();
                                    vVar3.r();
                                    m0 m0Var22 = new m0();
                                    m0Var22.a = str;
                                    m0Var22.o = "video/mp4v-es";
                                    m0Var22.t = i2822;
                                    m0Var22.u = i2922;
                                    m0Var22.x = f10;
                                    m0Var22.q = Collections.singletonList(copyOf);
                                    vVar2.b(new n0(m0Var22));
                                    this.j = true;
                                } else {
                                    h5.a.K("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                    if (vVar3.h()) {
                                    }
                                    if (vVar3.i(2) != 0) {
                                    }
                                    vVar3.r();
                                    int i25222 = vVar3.i(16);
                                    vVar3.r();
                                    if (vVar3.h()) {
                                    }
                                    vVar3.r();
                                    int i28222 = vVar3.i(13);
                                    vVar3.r();
                                    int i29222 = vVar3.i(13);
                                    vVar3.r();
                                    vVar3.r();
                                    m0 m0Var222 = new m0();
                                    m0Var222.a = str;
                                    m0Var222.o = "video/mp4v-es";
                                    m0Var222.t = i28222;
                                    m0Var222.u = i29222;
                                    m0Var222.x = f10;
                                    m0Var222.q = Collections.singletonList(copyOf);
                                    vVar2.b(new n0(m0Var222));
                                    this.j = true;
                                }
                            } else {
                                i13 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            h5.a.K("H263Reader", "Unexpected start code value");
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
                            h5.a.K("H263Reader", "Unexpected start code value");
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
            this.f.a(i14, r10, bArr);
            if (vVar != null) {
                if (i18 > 0) {
                    vVar.a(i14, r10, bArr);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (vVar.e(i12)) {
                    int J = h5.a.J(vVar.c, (byte[]) vVar.f);
                    int i30 = h5.d0.a;
                    byte[] bArr2 = (byte[]) vVar.f;
                    h5.w wVar2 = this.b;
                    wVar2.D(J, bArr2);
                    this.a.a(this.k, wVar2);
                }
                if (i17 == 178) {
                    if (wVar.a[r10 + 2] == 1) {
                        vVar.g(i17);
                    }
                    int i31 = i10 - r10;
                    long j11 = this.g - i31;
                    mVar = this.f;
                    boolean z4 = this.j;
                    if (mVar.e == 182 && z4 && mVar.b) {
                        j10 = mVar.h;
                        if (j10 != -9223372036854775807L) {
                            mVar.a.c(j10, mVar.d ? 1 : 0, (int) (j11 - mVar.g), i31, null);
                        }
                    }
                    if (mVar.e != 179) {
                        mVar.g = j11;
                    }
                    m mVar2 = this.f;
                    long j12 = this.k;
                    mVar2.e = i17;
                    mVar2.d = false;
                    mVar2.b = i17 != 182 || i17 == 179;
                    mVar2.c = i17 != 182;
                    mVar2.f = 0;
                    mVar2.h = j12;
                    i15 = i10;
                    i14 = i11;
                }
            }
            int i312 = i10 - r10;
            long j112 = this.g - i312;
            mVar = this.f;
            boolean z42 = this.j;
            if (mVar.e == 182) {
                j10 = mVar.h;
                if (j10 != -9223372036854775807L) {
                }
            }
            if (mVar.e != 179) {
            }
            m mVar22 = this.f;
            long j122 = this.k;
            mVar22.e = i17;
            mVar22.d = false;
            mVar22.b = i17 != 182 || i17 == 179;
            mVar22.c = i17 != 182;
            mVar22.f = 0;
            mVar22.h = j122;
            i15 = i10;
            i14 = i11;
        }
    }

    @Override // b4.i
    public final void b() {
        h5.a.m(this.c);
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
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.h = h0Var.e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 2);
        this.i = i22;
        this.f = new m(i22);
        this.a.b(mVar, h0Var);
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // b4.i
    public final void d() {
    }
}
