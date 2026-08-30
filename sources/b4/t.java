package b4;

import j3.m0;
import j3.n0;
import j3.r1;
import java.util.Collections;
import l3.p0;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final h5.w b;
    public final h5.v c;
    public r3.v d;
    public String e;
    public n0 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public t(String str) {
        this.a = str;
        h5.w wVar = new h5.w(1024);
        this.b = wVar;
        byte[] bArr = wVar.a;
        this.c = new h5.v(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (r23.l == false) goto L88;
     */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        int i10;
        boolean h;
        h5.a.j(this.d);
        while (wVar.a() > 0) {
            int i11 = this.g;
            if (i11 != 0) {
                if (i11 != 1) {
                    h5.w wVar2 = this.b;
                    h5.v vVar = this.c;
                    if (i11 == 2) {
                        int u10 = ((this.j & (-225)) << 8) | wVar.u();
                        this.i = u10;
                        if (u10 > wVar2.a.length) {
                            wVar2.C(u10);
                            byte[] bArr = wVar2.a;
                            vVar.getClass();
                            vVar.n(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(wVar.a(), this.i - this.h);
                        wVar.e(this.h, min, vVar.b);
                        int i12 = this.h + min;
                        this.h = i12;
                        if (i12 == this.i) {
                            vVar.p(0);
                            if (!vVar.h()) {
                                this.l = true;
                                int i13 = vVar.i(1);
                                int i14 = i13 == 1 ? vVar.i(1) : 0;
                                this.m = i14;
                                if (i14 != 0) {
                                    throw r1.a(null, null);
                                }
                                if (i13 == 1) {
                                    vVar.i((vVar.i(2) + 1) * 8);
                                }
                                if (!vVar.h()) {
                                    throw r1.a(null, null);
                                }
                                this.n = vVar.i(6);
                                int i15 = vVar.i(4);
                                int i16 = vVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw r1.a(null, null);
                                }
                                if (i13 == 0) {
                                    int g10 = vVar.g();
                                    int b10 = vVar.b();
                                    p0 h9 = l3.a.h(vVar, true);
                                    this.u = (String) h9.c;
                                    this.r = h9.a;
                                    this.t = h9.b;
                                    int b11 = b10 - vVar.b();
                                    vVar.p(g10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    vVar.j(b11, bArr2);
                                    m0 m0Var = new m0();
                                    m0Var.a = this.e;
                                    m0Var.o = MediaController.AUDIO_MIME_TYPE;
                                    m0Var.h = this.u;
                                    m0Var.B = this.t;
                                    m0Var.C = this.r;
                                    m0Var.q = Collections.singletonList(bArr2);
                                    m0Var.c = this.a;
                                    n0 n0Var = new n0(m0Var);
                                    if (!n0Var.equals(this.f)) {
                                        this.f = n0Var;
                                        this.s = 1024000000 / n0Var.Q;
                                        this.d.b(n0Var);
                                    }
                                } else {
                                    int b12 = vVar.b();
                                    p0 h10 = l3.a.h(vVar, true);
                                    this.u = (String) h10.c;
                                    this.r = h10.a;
                                    this.t = h10.b;
                                    vVar.s(vVar.i((vVar.i(2) + 1) * 8) - (b12 - vVar.b()));
                                }
                                int i17 = vVar.i(3);
                                this.o = i17;
                                if (i17 == 0) {
                                    vVar.s(8);
                                } else if (i17 == 1) {
                                    vVar.s(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    vVar.s(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    vVar.s(1);
                                }
                                boolean h11 = vVar.h();
                                this.p = h11;
                                this.q = 0L;
                                if (h11) {
                                    if (i13 == 1) {
                                        this.q = vVar.i((vVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = vVar.h();
                                            this.q = (this.q << 8) + vVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (vVar.h()) {
                                    vVar.s(8);
                                }
                            }
                            if (this.m != 0) {
                                throw r1.a(null, null);
                            }
                            if (this.n != 0) {
                                throw r1.a(null, null);
                            }
                            if (this.o != 0) {
                                throw r1.a(null, null);
                            }
                            int i18 = 0;
                            do {
                                i10 = vVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int g11 = vVar.g();
                            if ((g11 & 7) == 0) {
                                wVar2.F(g11 >> 3);
                            } else {
                                vVar.j(i18 * 8, wVar2.a);
                                wVar2.F(0);
                            }
                            this.d.d(i18, wVar2);
                            long j10 = this.k;
                            if (j10 != -9223372036854775807L) {
                                this.d.c(j10, 1, i18, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                vVar.s((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int u11 = wVar.u();
                    if ((u11 & 224) == 224) {
                        this.j = u11;
                        this.g = 2;
                    } else if (u11 != 86) {
                        this.g = 0;
                    }
                }
            } else if (wVar.u() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // b4.i
    public final void b() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.d = mVar.c2(h0Var.d, 1);
        h0Var.b();
        this.e = h0Var.e;
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
