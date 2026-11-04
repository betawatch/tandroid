package l4;

import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Arrays;
import java.util.Collections;
import k2.o0;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements i {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final c0 a;
    public final g2.y b;
    public final boolean[] c = new boolean[4];
    public final l d;
    public final o0 e;
    public m f;
    public long g;
    public String h;
    public i0 i;
    public boolean j;
    public long k;

    public n(c0 c0Var) {
        this.a = c0Var;
        l lVar = new l();
        lVar.e = new byte[128];
        this.d = lVar;
        this.k = -9223372036854775807L;
        this.e = new o0(hs.I2);
        this.b = new g2.y();
    }

    @Override // l4.i
    public final void a() {
        h2.o.b(this.c);
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // l4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        float f10;
        this.f.getClass();
        this.i.getClass();
        int i13 = yVar.b;
        int i14 = yVar.c;
        byte[] bArr = yVar.a;
        this.g += yVar.a();
        this.i.e(yVar.a(), yVar);
        while (true) {
            int c2 = h2.o.c(bArr, i13, i14, this.c);
            l lVar = this.d;
            o0 o0Var = this.e;
            if (c2 == i14) {
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
            int i15 = c2 + 3;
            byte b10 = yVar.a[i15];
            int i16 = b10 & 255;
            int i17 = c2 - i13;
            if (this.j) {
                i3 = i14;
                i10 = i15;
            } else {
                if (i17 > 0) {
                    lVar.a(i13, c2, bArr);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                int i19 = lVar.b;
                if (i19 != 0) {
                    i3 = i14;
                    if (i19 == 1) {
                        i10 = i15;
                        i12 = 0;
                        if (i16 != 181) {
                            g2.a.l("H263Reader", "Unexpected start code value");
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
                                i0 i0Var = this.i;
                                int i20 = lVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf(lVar.e, lVar.c);
                                c4.f fVar = new c4.f(copyOf, copyOf.length);
                                fVar.M(i20);
                                fVar.M(4);
                                fVar.K();
                                fVar.L(8);
                                if (fVar.i()) {
                                    fVar.L(4);
                                    fVar.L(3);
                                }
                                int j10 = fVar.j(4);
                                if (j10 == 15) {
                                    int j11 = fVar.j(8);
                                    int j12 = fVar.j(8);
                                    if (j12 == 0) {
                                        g2.a.l("H263Reader", "Invalid aspect ratio");
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
                                            g2.a.l("H263Reader", "Unhandled video object layer shape");
                                        }
                                        fVar.K();
                                        int j13 = fVar.j(16);
                                        fVar.K();
                                        if (fVar.i()) {
                                            if (j13 == 0) {
                                                g2.a.l("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i21 = 0;
                                                for (int i22 = j13 - 1; i22 > 0; i22 >>= 1) {
                                                    i21++;
                                                }
                                                fVar.L(i21);
                                            }
                                        }
                                        fVar.K();
                                        int j14 = fVar.j(13);
                                        fVar.K();
                                        int j15 = fVar.j(13);
                                        fVar.K();
                                        fVar.K();
                                        d2.u uVar = new d2.u();
                                        uVar.a = str;
                                        uVar.q = u0.n("video/mp2t");
                                        uVar.r = u0.n("video/mp4v-es");
                                        uVar.y = j14;
                                        uVar.z = j15;
                                        uVar.E = f10;
                                        uVar.u = Collections.singletonList(copyOf);
                                        f1.w(uVar, i0Var);
                                        this.j = true;
                                    } else {
                                        f10 = j11 / j12;
                                        if (fVar.i()) {
                                        }
                                        if (fVar.j(2) != 0) {
                                        }
                                        fVar.K();
                                        int j132 = fVar.j(16);
                                        fVar.K();
                                        if (fVar.i()) {
                                        }
                                        fVar.K();
                                        int j142 = fVar.j(13);
                                        fVar.K();
                                        int j152 = fVar.j(13);
                                        fVar.K();
                                        fVar.K();
                                        d2.u uVar2 = new d2.u();
                                        uVar2.a = str;
                                        uVar2.q = u0.n("video/mp2t");
                                        uVar2.r = u0.n("video/mp4v-es");
                                        uVar2.y = j142;
                                        uVar2.z = j152;
                                        uVar2.E = f10;
                                        uVar2.u = Collections.singletonList(copyOf);
                                        f1.w(uVar2, i0Var);
                                        this.j = true;
                                    }
                                } else if (j10 < 7) {
                                    f10 = l[j10];
                                    if (fVar.i()) {
                                    }
                                    if (fVar.j(2) != 0) {
                                    }
                                    fVar.K();
                                    int j1322 = fVar.j(16);
                                    fVar.K();
                                    if (fVar.i()) {
                                    }
                                    fVar.K();
                                    int j1422 = fVar.j(13);
                                    fVar.K();
                                    int j1522 = fVar.j(13);
                                    fVar.K();
                                    fVar.K();
                                    d2.u uVar22 = new d2.u();
                                    uVar22.a = str;
                                    uVar22.q = u0.n("video/mp2t");
                                    uVar22.r = u0.n("video/mp4v-es");
                                    uVar22.y = j1422;
                                    uVar22.z = j1522;
                                    uVar22.E = f10;
                                    uVar22.u = Collections.singletonList(copyOf);
                                    f1.w(uVar22, i0Var);
                                    this.j = true;
                                } else {
                                    g2.a.l("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                    if (fVar.i()) {
                                    }
                                    if (fVar.j(2) != 0) {
                                    }
                                    fVar.K();
                                    int j13222 = fVar.j(16);
                                    fVar.K();
                                    if (fVar.i()) {
                                    }
                                    fVar.K();
                                    int j14222 = fVar.j(13);
                                    fVar.K();
                                    int j15222 = fVar.j(13);
                                    fVar.K();
                                    fVar.K();
                                    d2.u uVar222 = new d2.u();
                                    uVar222.a = str;
                                    uVar222.q = u0.n("video/mp2t");
                                    uVar222.r = u0.n("video/mp4v-es");
                                    uVar222.y = j14222;
                                    uVar222.z = j15222;
                                    uVar222.E = f10;
                                    uVar222.u = Collections.singletonList(copyOf);
                                    f1.w(uVar222, i0Var);
                                    this.j = true;
                                }
                            } else {
                                i12 = 0;
                            }
                        } else if ((b10 & 240) != 32) {
                            g2.a.l("H263Reader", "Unexpected start code value");
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
                            g2.a.l("H263Reader", "Unexpected start code value");
                            lVar.a = false;
                            lVar.c = 0;
                            lVar.b = 0;
                        } else {
                            lVar.b = 3;
                        }
                    }
                } else {
                    i3 = i14;
                    i10 = i15;
                    i12 = 0;
                    if (i16 == 176) {
                        lVar.b = 1;
                        lVar.a = true;
                    }
                }
                lVar.a(i12, 3, l.f);
            }
            this.f.a(i13, c2, bArr);
            if (o0Var != null) {
                if (i17 > 0) {
                    o0Var.a(i13, c2, bArr);
                    i11 = 0;
                } else {
                    i11 = -i17;
                }
                if (o0Var.e(i11)) {
                    int p10 = h2.o.p(o0Var.e, (byte[]) o0Var.f);
                    String str2 = n0.a;
                    byte[] bArr2 = (byte[]) o0Var.f;
                    g2.y yVar2 = this.b;
                    yVar2.L(p10, bArr2);
                    this.a.a(this.k, yVar2);
                }
                if (i16 == 178) {
                    z10 = true;
                    if (yVar.a[c2 + 2] == 1) {
                        o0Var.h(i16);
                    }
                    int i23 = i3 - c2;
                    this.f.b(i23, this.g - i23, this.j);
                    m mVar = this.f;
                    long j16 = this.k;
                    mVar.e = i16;
                    mVar.d = false;
                    mVar.b = (i16 != 182 || i16 == 179) ? z10 : false;
                    mVar.c = i16 != 182 ? z10 : false;
                    mVar.f = 0;
                    mVar.h = j16;
                    i14 = i3;
                    i13 = i10;
                }
            }
            z10 = true;
            int i232 = i3 - c2;
            this.f.b(i232, this.g - i232, this.j);
            m mVar2 = this.f;
            long j162 = this.k;
            mVar2.e = i16;
            mVar2.d = false;
            mVar2.b = (i16 != 182 || i16 == 179) ? z10 : false;
            mVar2.c = i16 != 182 ? z10 : false;
            mVar2.f = 0;
            mVar2.h = j162;
            i14 = i3;
            i13 = i10;
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
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

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.k = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.h = (String) f0Var.e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.c, 2);
        this.i = i02;
        this.f = new m(i02);
        this.a.b(qVar, f0Var);
    }
}
