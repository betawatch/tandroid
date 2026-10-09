package j4;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class w implements g0 {
    public final i a;
    public final a4.g b = new a4.g(new byte[10], 10);
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
                    iVar.e(vVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i15 = i10;
        while (vVar.a() > 0) {
            int i16 = this.c;
            if (i16 != 0) {
                a4.g gVar = this.b;
                if (i16 != 1) {
                    if (i16 == i13) {
                        if (d(vVar, gVar.b, Math.min(10, this.i)) && d(vVar, null, this.i)) {
                            gVar.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                gVar.t(4);
                                gVar.t(1);
                                gVar.t(1);
                                long i17 = (gVar.i(15) << 15) | (gVar.i(3) << 30) | gVar.i(15);
                                gVar.t(1);
                                if (!this.h && this.g) {
                                    gVar.t(4);
                                    gVar.t(1);
                                    gVar.t(1);
                                    gVar.t(1);
                                    this.e.b((gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(i17);
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
                        int a2 = vVar.a();
                        int i18 = this.j;
                        int i19 = i18 == i12 ? 0 : a2 - i18;
                        if (i19 > 0) {
                            a2 -= i19;
                            vVar.I(vVar.b + a2);
                        }
                        iVar.a(vVar);
                        int i20 = this.j;
                        if (i20 != i12) {
                            int i21 = i20 - a2;
                            this.j = i21;
                            if (i21 == 0) {
                                iVar.e(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(vVar, gVar.b, 9)) {
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

    @Override // j4.g0
    public final void b(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.e = b0Var;
        this.a.d(qVar, f0Var);
    }

    @Override // j4.g0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(e2.v vVar, byte[] bArr, int i10) {
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

    public final boolean e() {
        a4.g gVar = this.b;
        gVar.q(0);
        int i10 = gVar.i(24);
        if (i10 != 1) {
            e2.m(i10, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        gVar.t(8);
        int i11 = gVar.i(16);
        gVar.t(5);
        this.k = gVar.h();
        gVar.t(2);
        this.f = gVar.h();
        this.g = gVar.h();
        gVar.t(6);
        int i12 = gVar.i(8);
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
