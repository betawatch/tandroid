package b4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w implements i0 {
    public final i a;
    public final h5.v b = new h5.v(new byte[10], 10);
    public int c = 0;
    public int d;
    public h5.c0 e;
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

    @Override // b4.i0
    public final void a(int i10, h5.w wVar) {
        int i11;
        h5.a.j(this.e);
        int i12 = i10 & 1;
        i iVar = this.a;
        int i13 = 2;
        int i14 = 0;
        if (i12 != 0) {
            int i15 = this.c;
            if (i15 != 0 && i15 != 1) {
                if (i15 == 2) {
                    h5.a.K("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i15 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        h5.a.K("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.d();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i16 = i10;
        while (wVar.a() > 0) {
            int i17 = this.c;
            if (i17 != 0) {
                h5.v vVar = this.b;
                if (i17 != 1) {
                    if (i17 == i13) {
                        if (d(wVar, vVar.b, Math.min(10, this.i)) && d(wVar, null, this.i)) {
                            vVar.p(i14);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                vVar.s(4);
                                vVar.s(1);
                                vVar.s(1);
                                long i18 = (vVar.i(15) << 15) | (vVar.i(3) << 30) | vVar.i(15);
                                vVar.s(1);
                                if (!this.h && this.g) {
                                    vVar.s(4);
                                    vVar.s(1);
                                    vVar.s(1);
                                    vVar.s(1);
                                    this.e.b((vVar.i(3) << 30) | (vVar.i(15) << 15) | vVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i18);
                            }
                            i16 |= this.k ? 4 : 0;
                            iVar.e(i16, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i17 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = wVar.a();
                        int i19 = this.j;
                        int i20 = i19 == -1 ? 0 : a2 - i19;
                        if (i20 > 0) {
                            a2 -= i20;
                            wVar.E(wVar.b + a2);
                        }
                        iVar.a(wVar);
                        int i21 = this.j;
                        if (i21 != -1) {
                            int i22 = i21 - a2;
                            this.j = i22;
                            if (i22 == 0) {
                                iVar.d();
                                this.c = 1;
                                this.d = i14;
                            }
                        }
                    }
                } else if (d(wVar, vVar.b, 9)) {
                    vVar.p(0);
                    int i23 = vVar.i(24);
                    if (i23 != 1) {
                        e2.c.q(i23, "Unexpected start code prefix: ", "PesReader");
                        this.j = -1;
                        i11 = 0;
                    } else {
                        vVar.s(8);
                        int i24 = vVar.i(16);
                        vVar.s(5);
                        this.k = vVar.h();
                        vVar.s(2);
                        this.f = vVar.h();
                        this.g = vVar.h();
                        vVar.s(6);
                        int i25 = vVar.i(8);
                        this.i = i25;
                        if (i24 == 0) {
                            this.j = -1;
                        } else {
                            int i26 = (i24 - 3) - i25;
                            this.j = i26;
                            if (i26 < 0) {
                                h5.a.K("PesReader", "Found negative packet payload size: " + this.j);
                                this.j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.c = i11;
                    this.d = 0;
                }
            } else {
                wVar.G(wVar.a());
            }
            i13 = 2;
            i14 = 0;
        }
    }

    @Override // b4.i0
    public final void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // b4.i0
    public final void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
        this.e = c0Var;
        this.a.c(mVar, h0Var);
    }

    public final boolean d(h5.w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.G(min);
        } else {
            wVar.e(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        return i11 == i10;
    }
}
