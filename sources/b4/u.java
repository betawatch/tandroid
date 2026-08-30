package b4;

import j3.m0;
import j3.n0;
import l3.o0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u implements i {
    public final h5.w a;
    public final o0 b;
    public final String c;
    public r3.v d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public u(String str) {
        h5.w wVar = new h5.w(4);
        this.a = wVar;
        wVar.a[0] = -1;
        this.b = new o0();
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // b4.i
    public final void a(h5.w wVar) {
        h5.a.j(this.d);
        while (wVar.a() > 0) {
            int i10 = this.f;
            h5.w wVar2 = this.a;
            if (i10 == 0) {
                byte[] bArr = wVar.a;
                int i11 = wVar.b;
                int i12 = wVar.c;
                while (true) {
                    if (i11 >= i12) {
                        wVar.F(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z4 = (b10 & 255) == 255;
                    boolean z10 = this.i && (b10 & 224) == 224;
                    this.i = z4;
                    if (z10) {
                        wVar.F(i11 + 1);
                        this.i = false;
                        wVar2.a[1] = bArr[i11];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(wVar.a(), 4 - this.g);
                wVar.e(this.g, min, wVar2.a);
                int i13 = this.g + min;
                this.g = i13;
                if (i13 >= 4) {
                    wVar2.F(0);
                    int g10 = wVar2.g();
                    o0 o0Var = this.b;
                    if (o0Var.a(g10)) {
                        this.k = o0Var.b;
                        if (!this.h) {
                            int i14 = o0Var.c;
                            this.j = (o0Var.f * 1000000) / i14;
                            m0 m0Var = new m0();
                            m0Var.a = this.e;
                            m0Var.o = (String) o0Var.g;
                            m0Var.p = 4096;
                            m0Var.B = o0Var.d;
                            m0Var.C = i14;
                            m0Var.c = this.c;
                            this.d.b(new n0(m0Var));
                            this.h = true;
                        }
                        wVar2.F(0);
                        this.d.d(4, wVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(wVar.a(), this.k - this.g);
                this.d.d(min2, wVar);
                int i15 = this.g + min2;
                this.g = i15;
                int i16 = this.k;
                if (i15 >= i16) {
                    long j10 = this.l;
                    if (j10 != -9223372036854775807L) {
                        this.d.c(j10, 1, i16, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // b4.i
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.e = h0Var.e;
        h0Var.b();
        this.d = mVar.c2(h0Var.d, 1);
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.l = j10;
        }
    }

    @Override // b4.i
    public final void d() {
    }
}
