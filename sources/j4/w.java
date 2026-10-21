package j4;

import e2.k0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class w implements g0 {
    public final i a;
    public final a4.g b = new a4.g(new byte[10], 10);
    public int c = 0;
    public int d;
    public k0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public w(i iVar) {
        this.a = iVar;
    }

    @Override // j4.g0
    public final void a(int i10, e2.x xVar) {
        this.e.getClass();
        int i11 = i10 & 1;
        int i12 = -1;
        int i13 = 2;
        i iVar = this.a;
        if (i11 != 0) {
            int i14 = this.c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    e2.a.l("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        e2.a.l("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.e(xVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i15 = i10;
        while (xVar.a() > 0) {
            int i16 = this.c;
            if (i16 != 0) {
                a4.g gVar = this.b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (d(xVar, gVar.b, Math.min(10, this.i)) && d(xVar, null, this.i)) {
                            gVar.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                gVar.o(4);
                                gVar.o(1);
                                gVar.o(1);
                                long g10 = (gVar.g(15) << 15) | (gVar.g(3) << 30) | gVar.g(15);
                                gVar.o(1);
                                if (!this.h && this.g) {
                                    gVar.o(4);
                                    gVar.o(1);
                                    gVar.o(1);
                                    gVar.o(1);
                                    this.e.b((gVar.g(3) << 30) | (gVar.g(15) << 15) | gVar.g(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(g10);
                            }
                            i15 |= this.k ? 4 : 0;
                            iVar.f(i15, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = xVar.a();
                        int i17 = this.j;
                        int i18 = i17 == i12 ? 0 : a2 - i17;
                        if (i18 > 0) {
                            a2 -= i18;
                            xVar.M(xVar.b + a2);
                        }
                        iVar.a(xVar);
                        int i19 = this.j;
                        if (i19 != i12) {
                            int i20 = i19 - a2;
                            this.j = i20;
                            if (i20 == 0) {
                                iVar.e(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(xVar, gVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i12 = -1;
            i13 = 2;
        }
    }

    @Override // j4.g0
    public final void b(k0 k0Var, c3.q qVar, f0 f0Var) {
        this.e = k0Var;
        this.a.d(qVar, f0Var);
    }

    @Override // j4.g0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.O(min);
        } else {
            xVar.k(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        return i11 == i10;
    }

    public final boolean e() {
        a4.g gVar = this.b;
        gVar.m(0);
        int g10 = gVar.g(24);
        if (g10 != 1) {
            a1.g.x(g10, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        gVar.o(8);
        int g11 = gVar.g(16);
        gVar.o(5);
        this.k = gVar.f();
        gVar.o(2);
        this.f = gVar.f();
        this.g = gVar.f();
        gVar.o(6);
        int g12 = gVar.g(8);
        this.i = g12;
        if (g11 == 0) {
            this.j = -1;
        } else {
            int i10 = (g11 - 3) - g12;
            this.j = i10;
            if (i10 < 0) {
                e2.a.l("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
