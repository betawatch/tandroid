package j4;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w implements g0 {
    public final i a;
    public final a4.h b = new a4.h(new byte[10], 10);
    public int c = 0;
    public int d;
    public e2.b0 e;
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
    public final void a(int i10, e2.v vVar) {
        e2.d.h(this.e);
        int i11 = i10 & 1;
        int i12 = -1;
        int i13 = 2;
        i iVar = this.a;
        if (i11 != 0) {
            int i14 = this.c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    e2.a.n("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        e2.a.n("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    iVar.f(vVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i15 = i10;
        while (vVar.a() > 0) {
            int i16 = this.c;
            if (i16 != 0) {
                a4.h hVar = this.b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (b(vVar, hVar.b, Math.min(10, this.i)) && b(vVar, null, this.i)) {
                            hVar.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                hVar.t(4);
                                hVar.t(1);
                                hVar.t(1);
                                long i17 = (hVar.i(15) << 15) | (hVar.i(3) << 30) | hVar.i(15);
                                hVar.t(1);
                                if (!this.h && this.g) {
                                    hVar.t(4);
                                    hVar.t(1);
                                    hVar.t(1);
                                    hVar.t(1);
                                    this.e.b((hVar.i(3) << 30) | (hVar.i(15) << 15) | hVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i17);
                            }
                            i15 |= this.k ? 4 : 0;
                            iVar.g(i15, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        int a2 = vVar.a();
                        int i18 = this.j;
                        int i19 = i18 == i12 ? 0 : a2 - i18;
                        if (i19 > 0) {
                            a2 -= i19;
                            vVar.I(vVar.b + a2);
                        }
                        iVar.b(vVar);
                        int i20 = this.j;
                        if (i20 != i12) {
                            int i21 = i20 - a2;
                            this.j = i21;
                            if (i21 == 0) {
                                iVar.f(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (b(vVar, hVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                vVar.K(vVar.a());
            }
            i12 = -1;
            i13 = 2;
        }
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.K(min);
        } else {
            vVar.h(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        return i11 == i10;
    }

    @Override // j4.g0
    public final void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.e = b0Var;
        this.a.e(qVar, f0Var);
    }

    @Override // j4.g0
    public final void d() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        a4.h hVar = this.b;
        hVar.q(0);
        int i10 = hVar.i(24);
        if (i10 != 1) {
            e2.n(i10, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        hVar.t(8);
        int i11 = hVar.i(16);
        hVar.t(5);
        this.k = hVar.h();
        hVar.t(2);
        this.f = hVar.h();
        this.g = hVar.h();
        hVar.t(6);
        int i12 = hVar.i(8);
        this.i = i12;
        if (i11 == 0) {
            this.j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.j = i13;
            if (i13 < 0) {
                e2.a.n("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }
}
