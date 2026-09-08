package j4;

import b2.r0;
import b2.s0;
import c3.h0;
import java.util.Collections;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class t implements i {
    public final String a;
    public final int b;
    public final e2.v c;
    public final a4.h d;
    public h0 e;
    public String f;
    public b2.s g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public t(String str, int i10) {
        this.a = str;
        this.b = i10;
        e2.v vVar = new e2.v(1024);
        this.c = vVar;
        byte[] bArr = vVar.a;
        this.d = new a4.h(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a2, code lost:
    
        if (r23.m == false) goto L89;
     */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e2.v vVar) {
        int i10;
        boolean h;
        e2.d.h(this.e);
        while (vVar.a() > 0) {
            int i11 = this.h;
            if (i11 != 0) {
                if (i11 != 1) {
                    e2.v vVar2 = this.c;
                    a4.h hVar = this.d;
                    if (i11 == 2) {
                        int x10 = ((this.k & (-225)) << 8) | vVar.x();
                        this.j = x10;
                        if (x10 > vVar2.a.length) {
                            vVar2.G(x10);
                            byte[] bArr = vVar2.a;
                            hVar.getClass();
                            hVar.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int min = Math.min(vVar.a(), this.j - this.i);
                        vVar.h(this.i, min, hVar.b);
                        int i12 = this.i + min;
                        this.i = i12;
                        if (i12 == this.j) {
                            hVar.q(0);
                            if (!hVar.h()) {
                                this.m = true;
                                int i13 = hVar.i(1);
                                int i14 = i13 == 1 ? hVar.i(1) : 0;
                                this.n = i14;
                                if (i14 != 0) {
                                    throw s0.a(null, null);
                                }
                                if (i13 == 1) {
                                    hVar.i((hVar.i(2) + 1) * 8);
                                }
                                if (!hVar.h()) {
                                    throw s0.a(null, null);
                                }
                                this.o = hVar.i(6);
                                int i15 = hVar.i(4);
                                int i16 = hVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw s0.a(null, null);
                                }
                                if (i13 == 0) {
                                    int g10 = hVar.g();
                                    int b10 = hVar.b();
                                    c3.a n10 = c3.b.n(hVar, true);
                                    this.v = n10.a;
                                    this.s = n10.b;
                                    this.u = n10.c;
                                    int b11 = b10 - hVar.b();
                                    hVar.q(g10);
                                    byte[] bArr2 = new byte[(b11 + 7) / 8];
                                    hVar.j(b11, bArr2);
                                    b2.r rVar = new b2.r();
                                    rVar.a = this.f;
                                    rVar.p = r0.n("video/mp2t");
                                    rVar.q = r0.n(MediaController.AUDIO_MIME_TYPE);
                                    rVar.j = this.v;
                                    rVar.I = this.u;
                                    rVar.J = this.s;
                                    rVar.t = Collections.singletonList(bArr2);
                                    rVar.d = this.a;
                                    rVar.f = this.b;
                                    b2.s sVar = new b2.s(rVar);
                                    if (!sVar.equals(this.g)) {
                                        this.g = sVar;
                                        this.t = 1024000000 / sVar.K;
                                        this.e.b(sVar);
                                    }
                                } else {
                                    int b12 = hVar.b();
                                    c3.a n11 = c3.b.n(hVar, true);
                                    this.v = n11.a;
                                    this.s = n11.b;
                                    this.u = n11.c;
                                    hVar.t(hVar.i((hVar.i(2) + 1) * 8) - (b12 - hVar.b()));
                                }
                                int i17 = hVar.i(3);
                                this.p = i17;
                                if (i17 == 0) {
                                    hVar.t(8);
                                } else if (i17 == 1) {
                                    hVar.t(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    hVar.t(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    hVar.t(1);
                                }
                                boolean h10 = hVar.h();
                                this.q = h10;
                                this.r = 0L;
                                if (h10) {
                                    if (i13 == 1) {
                                        this.r = hVar.i((hVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            h = hVar.h();
                                            this.r = (this.r << 8) + hVar.i(8);
                                        } while (h);
                                    }
                                }
                                if (hVar.h()) {
                                    hVar.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw s0.a(null, null);
                            }
                            if (this.o != 0) {
                                throw s0.a(null, null);
                            }
                            if (this.p != 0) {
                                throw s0.a(null, null);
                            }
                            int i18 = 0;
                            do {
                                i10 = hVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int g11 = hVar.g();
                            if ((g11 & 7) == 0) {
                                vVar2.J(g11 >> 3);
                            } else {
                                hVar.j(i18 * 8, vVar2.a);
                                vVar2.J(0);
                            }
                            this.e.d(i18, vVar2);
                            e2.d.g(this.l != -9223372036854775807L);
                            this.e.c(this.l, 1, i18, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                hVar.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int x11 = vVar.x();
                    if ((x11 & 224) == 224) {
                        this.k = x11;
                        this.h = 2;
                    } else if (x11 != 86) {
                        this.h = 0;
                    }
                }
            } else if (vVar.x() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // j4.i
    public final void d() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = qVar.R1(f0Var.d, 1);
        f0Var.b();
        this.f = f0Var.e;
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.l = j3;
    }

    @Override // j4.i
    public final void f(boolean z10) {
    }
}
