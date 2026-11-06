package m4;

import e2.s0;
import f3.j0;
import h2.m0;
import java.util.Arrays;
import java.util.Collections;
import l2.o0;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 a;
    public final h2.x b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f;
    public long g;
    public String h;
    public j0 i;
    public boolean j;
    public long k;

    public n(c0 c0Var) {
        this.a = c0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new o0(qs.I2);
        this.b = new h2.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        boolean z9;
        int i11;
        int i12;
        float f10;
        this.f.getClass();
        this.i.getClass();
        int i13 = xVar.b;
        int i14 = xVar.c;
        byte[] bArr = xVar.a;
        this.g += xVar.a();
        this.i.b(xVar.a(), xVar);
        while (true) {
            int c10 = i2.o.c(bArr, i13, i14, this.c);
            l lVar = this.d;
            o0 o0Var = this.e;
            if (c10 == i14) {
                if (!this.j) {
                    lVar.a(i13, i14, bArr);
                }
                this.f.a(i13, i14, bArr);
                if (o0Var != null) {
                    o0Var.a(i13, i14, bArr);
                    return;
                }
                return;
            }
            int i15 = c10 + 3;
            byte b10 = xVar.a[i15];
            int i16 = b10 & 255;
            int i17 = c10 - i13;
            if (this.j) {
                i7 = i14;
                i10 = i15;
            } else {
                if (i17 > 0) {
                    lVar.a(i13, c10, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                int i19 = lVar.b;
                if (i19 != 0) {
                    i7 = i14;
                    if (i19 == 1) {
                        i10 = i15;
                        i12 = 0;
                        if (i16 != 181) {
                            h2.a.l("H263Reader", "Unexpected start code value");
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            lVar.b = 2;
                        }
                    } else if (i19 != 2) {
                        i10 = i15;
                        if (i19 != 3) {
                            if (i19 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i16 == 179 || i16 == 181) {
                                lVar.c -= i18;
                                lVar.a = false;
                                j0 j0Var = this.i;
                                int i20 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                d4.f fVar = new d4.f(copyOf, copyOf.length);
                                fVar.M(i20);
                                fVar.M(4);
                                fVar.K();
                                fVar.L(8);
                                if (fVar.i()) {
                                    fVar.L(4);
                                    fVar.L(3);
                                }
                                int j3 = fVar.j(4);
                                if (j3 == 15) {
                                    int j10 = fVar.j(8);
                                    int j11 = fVar.j(8);
                                    if (j11 == 0) {
                                        h2.a.l("H263Reader", "Invalid aspect ratio");
                                        f10 = 1.0f;
                                        if (fVar.i()) {
                                            fVar.L(2);
                                            fVar.L(1);
                                            if (fVar.i()) {
                                                fVar.L(15);
                                                fVar.K();
                                                fVar.L(15);
                                                fVar.K();
                                                fVar.L(15);
                                                fVar.K();
                                                fVar.L(3);
                                                fVar.L(11);
                                                fVar.K();
                                                fVar.L(15);
                                                fVar.K();
                                            }
                                        }
                                        if (fVar.j(2) != 0) {
                                            h2.a.l("H263Reader", "Unhandled video object layer shape");
                                        }
                                        fVar.K();
                                        int j12 = fVar.j(16);
                                        fVar.K();
                                        if (fVar.i()) {
                                            if (j12 == 0) {
                                                h2.a.l("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i21 = 0;
                                                for (int i22 = j12 - 1; i22 > 0; i22 >>= 1) {
                                                    i21++;
                                                }
                                                fVar.L(i21);
                                            }
                                        }
                                        fVar.K();
                                        int j13 = fVar.j(13);
                                        fVar.K();
                                        int j14 = fVar.j(13);
                                        fVar.K();
                                        fVar.K();
                                        e2.t tVar = new e2.t();
                                        tVar.a = str;
                                        tVar.q = s0.n("video/mp2t");
                                        tVar.r = s0.n("video/mp4v-es");
                                        tVar.y = j13;
                                        tVar.z = j14;
                                        tVar.E = f10;
                                        tVar.u = Collections.singletonList(copyOf);
                                        f1.s(tVar, j0Var);
                                        this.j = true;
                                    } else {
                                        f10 = j10 / j11;
                                        if (fVar.i()) {
                                        }
                                        if (fVar.j(2) != 0) {
                                        }
                                        fVar.K();
                                        int j122 = fVar.j(16);
                                        fVar.K();
                                        if (fVar.i()) {
                                        }
                                        fVar.K();
                                        int j132 = fVar.j(13);
                                        fVar.K();
                                        int j142 = fVar.j(13);
                                        fVar.K();
                                        fVar.K();
                                        e2.t tVar2 = new e2.t();
                                        tVar2.a = str;
                                        tVar2.q = s0.n("video/mp2t");
                                        tVar2.r = s0.n("video/mp4v-es");
                                        tVar2.y = j132;
                                        tVar2.z = j142;
                                        tVar2.E = f10;
                                        tVar2.u = Collections.singletonList(copyOf);
                                        f1.s(tVar2, j0Var);
                                        this.j = true;
                                    }
                                } else if (j3 < 7) {
                                    f10 = l[j3];
                                    if (fVar.i()) {
                                    }
                                    if (fVar.j(2) != 0) {
                                    }
                                    fVar.K();
                                    int j1222 = fVar.j(16);
                                    fVar.K();
                                    if (fVar.i()) {
                                    }
                                    fVar.K();
                                    int j1322 = fVar.j(13);
                                    fVar.K();
                                    int j1422 = fVar.j(13);
                                    fVar.K();
                                    fVar.K();
                                    e2.t tVar22 = new e2.t();
                                    tVar22.a = str;
                                    tVar22.q = s0.n("video/mp2t");
                                    tVar22.r = s0.n("video/mp4v-es");
                                    tVar22.y = j1322;
                                    tVar22.z = j1422;
                                    tVar22.E = f10;
                                    tVar22.u = Collections.singletonList(copyOf);
                                    f1.s(tVar22, j0Var);
                                    this.j = true;
                                } else {
                                    h2.a.l("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                    if (fVar.i()) {
                                    }
                                    if (fVar.j(2) != 0) {
                                    }
                                    fVar.K();
                                    int j12222 = fVar.j(16);
                                    fVar.K();
                                    if (fVar.i()) {
                                    }
                                    fVar.K();
                                    int j13222 = fVar.j(13);
                                    fVar.K();
                                    int j14222 = fVar.j(13);
                                    fVar.K();
                                    fVar.K();
                                    e2.t tVar222 = new e2.t();
                                    tVar222.a = str;
                                    tVar222.q = s0.n("video/mp2t");
                                    tVar222.r = s0.n("video/mp4v-es");
                                    tVar222.y = j13222;
                                    tVar222.z = j14222;
                                    tVar222.E = f10;
                                    tVar222.u = Collections.singletonList(copyOf);
                                    f1.s(tVar222, j0Var);
                                    this.j = true;
                                }
                            } else {
                                i12 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            h2.a.l("H263Reader", "Unexpected start code value");
                            i12 = 0;
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            i12 = 0;
                            lVar.d = lVar.c;
                            lVar.b = 4;
                        }
                    } else {
                        i10 = i15;
                        i12 = 0;
                        if (i16 > 31) {
                            h2.a.l("H263Reader", "Unexpected start code value");
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            lVar.b = 3;
                        }
                    }
                } else {
                    i7 = i14;
                    i10 = i15;
                    i12 = 0;
                    if (i16 == 176) {
                        lVar.b = 1;
                        lVar.a = true;
                    }
                }
                lVar.a(i12, 3, l.f);
            }
            this.f.a(i13, c10, bArr);
            if (o0Var != null) {
                if (i17 > 0) {
                    o0Var.a(i13, c10, bArr);
                    i11 = 0;
                } else {
                    i11 = -i17;
                }
                if (o0Var.e(i11)) {
                    int p10 = i2.o.p(o0Var.e, (byte[]) o0Var.f);
                    String str2 = m0.a;
                    byte[] bArr2 = (byte[]) o0Var.f;
                    h2.x xVar2 = this.b;
                    xVar2.L(p10, bArr2);
                    this.a.a(this.k, xVar2);
                }
                if (i16 == 178) {
                    z9 = true;
                    if (xVar.a[c10 + 2] == 1) {
                        o0Var.h(i16);
                    }
                    int i23 = i7 - c10;
                    this.f.b(i23, this.g - i23, this.j);
                    m mVar = this.f;
                    long j15 = this.k;
                    mVar.e = i16;
                    mVar.d = false;
                    mVar.b = (i16 != 182 || i16 == 179) ? z9 : false;
                    mVar.c = i16 != 182 ? z9 : false;
                    mVar.f = 0;
                    mVar.h = j15;
                    i14 = i7;
                    i13 = i10;
                }
            }
            z9 = true;
            int i232 = i7 - c10;
            this.f.b(i232, this.g - i232, this.j);
            m mVar2 = this.f;
            long j152 = this.k;
            mVar2.e = i16;
            mVar2.d = false;
            mVar2.b = (i16 != 182 || i16 == 179) ? z9 : false;
            mVar2.c = i16 != 182 ? z9 : false;
            mVar2.f = 0;
            mVar2.h = j152;
            i14 = i7;
            i13 = i10;
        }
    }

    @Override // m4.i
    public final void d() {
        i2.o.b(this.c);
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
        o0 o0Var = this.e;
        if (o0Var != null) {
            o0Var.g();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // m4.i
    public final void e(boolean z9) {
        this.f.getClass();
        if (z9) {
            this.f.b(0, this.g, this.j);
            m mVar = this.f;
            mVar.b = false;
            mVar.c = false;
            mVar.d = false;
            mVar.e = -1;
        }
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.k = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.h = (String) g0Var.e;
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.c, 2);
        this.i = O1;
        this.f = new m(O1);
        this.a.b(qVar, g0Var);
    }
}
