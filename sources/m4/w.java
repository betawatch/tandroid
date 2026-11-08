package m4;

import h2.k0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w implements h0 {
    public final i a;
    public final d4.f b = new d4.f(new byte[10], 10);
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

    @Override // m4.h0
    public final void a(int i7, h2.x xVar) {
        this.e.getClass();
        int i10 = i7 & 1;
        int i11 = -1;
        int i12 = 2;
        i iVar = this.a;
        if (i10 != 0) {
            int i13 = this.c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    h2.a.l("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        h2.a.l("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.e(xVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i14 = i7;
        while (xVar.a() > 0) {
            int i15 = this.c;
            if (i15 != 0) {
                d4.f fVar = this.b;
                if (i15 != 1) {
                    if (i15 == i12) {
                        if (c(xVar, (byte[]) fVar.b, Math.min(10, this.i)) && c(xVar, null, this.i)) {
                            fVar.J(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                fVar.L(4);
                                fVar.L(1);
                                fVar.L(1);
                                long j3 = (fVar.j(15) << 15) | (fVar.j(3) << 30) | fVar.j(15);
                                fVar.L(1);
                                if (!this.h && this.g) {
                                    fVar.L(4);
                                    fVar.L(1);
                                    fVar.L(1);
                                    fVar.L(1);
                                    this.e.b((fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(j3);
                            }
                            i14 |= this.k ? 4 : 0;
                            iVar.f(i14, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        int a10 = xVar.a();
                        int i16 = this.j;
                        int i17 = i16 == i11 ? 0 : a10 - i16;
                        if (i17 > 0) {
                            a10 -= i17;
                            xVar.M(xVar.b + a10);
                        }
                        iVar.c(xVar);
                        int i18 = this.j;
                        if (i18 != i11) {
                            int i19 = i18 - a10;
                            this.j = i19;
                            if (i19 == 0) {
                                iVar.e(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (c(xVar, (byte[]) fVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i11 = -1;
            i12 = 2;
        }
    }

    @Override // m4.h0
    public final void b(k0 k0Var, f3.q qVar, g0 g0Var) {
        this.e = k0Var;
        this.a.g(qVar, g0Var);
    }

    public final boolean c(h2.x xVar, byte[] bArr, int i7) {
        int min = Math.min(xVar.a(), i7 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.O(min);
        } else {
            xVar.k(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        return i10 == i7;
    }

    @Override // m4.h0
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        d4.f fVar = this.b;
        fVar.J(0);
        int j3 = fVar.j(24);
        if (j3 != 1) {
            com.google.android.recaptcha.internal.a.o(j3, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        fVar.L(8);
        int j10 = fVar.j(16);
        fVar.L(5);
        this.k = fVar.i();
        fVar.L(2);
        this.f = fVar.i();
        this.g = fVar.i();
        fVar.L(6);
        int j11 = fVar.j(8);
        this.i = j11;
        if (j10 == 0) {
            this.j = -1;
        } else {
            int i7 = (j10 - 3) - j11;
            this.j = i7;
            if (i7 < 0) {
                h2.a.l("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
