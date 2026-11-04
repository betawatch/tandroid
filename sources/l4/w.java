package l4;

import g2.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w implements g0 {
    public final i a;
    public final c4.f b = new c4.f(new byte[10], 10);
    public int c = 0;
    public int d;
    public l0 e;
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

    @Override // l4.g0
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // l4.g0
    public final void b(l0 l0Var, e3.q qVar, f0 f0Var) {
        this.e = l0Var;
        this.a.f(qVar, f0Var);
    }

    @Override // l4.g0
    public final void c(int i3, g2.y yVar) {
        this.e.getClass();
        int i10 = i3 & 1;
        int i11 = -1;
        int i12 = 2;
        i iVar = this.a;
        if (i10 != 0) {
            int i13 = this.c;
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    g2.a.l("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        g2.a.l("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.d(yVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i14 = i3;
        while (yVar.a() > 0) {
            int i15 = this.c;
            if (i15 != 0) {
                c4.f fVar = this.b;
                if (i15 != 1) {
                    if (i15 == i12) {
                        if (d(yVar, (byte[]) fVar.b, Math.min(10, this.i)) && d(yVar, null, this.i)) {
                            fVar.J(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                fVar.L(4);
                                fVar.L(1);
                                fVar.L(1);
                                long j10 = (fVar.j(15) << 15) | (fVar.j(3) << 30) | fVar.j(15);
                                fVar.L(1);
                                if (!this.h && this.g) {
                                    fVar.L(4);
                                    fVar.L(1);
                                    fVar.L(1);
                                    fVar.L(1);
                                    this.e.b((fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(j10);
                            }
                            i14 |= this.k ? 4 : 0;
                            iVar.e(i14, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException();
                        }
                        int a10 = yVar.a();
                        int i16 = this.j;
                        int i17 = i16 == i11 ? 0 : a10 - i16;
                        if (i17 > 0) {
                            a10 -= i17;
                            yVar.M(yVar.b + a10);
                        }
                        iVar.c(yVar);
                        int i18 = this.j;
                        if (i18 != i11) {
                            int i19 = i18 - a10;
                            this.j = i19;
                            if (i19 == 0) {
                                iVar.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(yVar, (byte[]) fVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                yVar.O(yVar.a());
            }
            i11 = -1;
            i12 = 2;
        }
    }

    public final boolean d(g2.y yVar, byte[] bArr, int i3) {
        int min = Math.min(yVar.a(), i3 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.O(min);
        } else {
            yVar.k(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        return i10 == i3;
    }

    public final boolean e() {
        c4.f fVar = this.b;
        fVar.J(0);
        int j10 = fVar.j(24);
        if (j10 != 1) {
            com.google.android.recaptcha.internal.a.o(j10, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        fVar.L(8);
        int j11 = fVar.j(16);
        fVar.L(5);
        this.k = fVar.i();
        fVar.L(2);
        this.f = fVar.i();
        this.g = fVar.i();
        fVar.L(6);
        int j12 = fVar.j(8);
        this.i = j12;
        if (j11 == 0) {
            this.j = -1;
        } else {
            int i3 = (j11 - 3) - j12;
            this.j = i3;
            if (i3 < 0) {
                g2.a.l("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
