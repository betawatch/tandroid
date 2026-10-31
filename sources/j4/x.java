package j4;

import e2.k0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x implements h0 {
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

    public x(i iVar) {
        this.a = iVar;
    }

    @Override // j4.h0
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
                    iVar.g(xVar.c == 0);
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
                        if (b(xVar, (byte[]) gVar.b, Math.min(10, this.i)) && b(xVar, null, this.i)) {
                            gVar.d0(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                gVar.f0(4);
                                gVar.f0(1);
                                gVar.f0(1);
                                long i17 = (gVar.i(15) << 15) | (gVar.i(3) << 30) | gVar.i(15);
                                gVar.f0(1);
                                if (!this.h && this.g) {
                                    gVar.f0(4);
                                    gVar.f0(1);
                                    gVar.f0(1);
                                    gVar.f0(1);
                                    this.e.b((gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i17);
                            }
                            i15 |= this.k ? 4 : 0;
                            iVar.h(i15, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = xVar.a();
                        int i18 = this.j;
                        int i19 = i18 == i12 ? 0 : a2 - i18;
                        if (i19 > 0) {
                            a2 -= i19;
                            xVar.M(xVar.b + a2);
                        }
                        iVar.c(xVar);
                        int i20 = this.j;
                        if (i20 != i12) {
                            int i21 = i20 - a2;
                            this.j = i21;
                            if (i21 == 0) {
                                iVar.g(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(xVar, (byte[]) gVar.b, 9)) {
                    this.c = c() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i12 = -1;
            i13 = 2;
        }
    }

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
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

    public final boolean c() {
        a4.g gVar = this.b;
        gVar.d0(0);
        int i10 = gVar.i(24);
        if (i10 != 1) {
            a1.g.w(i10, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        gVar.f0(8);
        int i11 = gVar.i(16);
        gVar.f0(5);
        this.k = gVar.h();
        gVar.f0(2);
        this.f = gVar.h();
        this.g = gVar.h();
        gVar.f0(6);
        int i12 = gVar.i(8);
        this.i = i12;
        if (i11 == 0) {
            this.j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.j = i13;
            if (i13 < 0) {
                e2.a.l("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    @Override // j4.h0
    public final void d(k0 k0Var, c3.q qVar, g0 g0Var) {
        this.e = k0Var;
        this.a.f(qVar, g0Var);
    }

    @Override // j4.h0
    public final void e() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.e();
    }
}
