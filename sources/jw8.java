// default package

import android.util.SparseArray;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jw8 implements s84 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public dk4 i;
    public u84 j;
    public boolean k;
    public final vqb a = new vqb(0);
    public final yw7 c = new yw7(TLObject.FLAG_12);
    public final SparseArray b = new SparseArray();
    public final hw8 d = new hw8((byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        long j;
        ?? r3;
        ?? r2;
        long j2;
        rv3 rv3Var;
        hw8 hw8Var = this.d;
        vqb vqbVar = hw8Var.b;
        this.j.getClass();
        long j3 = ((vb3) t84Var).c;
        long j4 = -9223372036854775807L;
        if (j3 != -1 && !hw8Var.d) {
            yw7 yw7Var = hw8Var.c;
            if (!hw8Var.f) {
                vb3 vb3Var = (vb3) t84Var;
                long j5 = vb3Var.c;
                int min = (int) Math.min(20000L, j5);
                long j6 = j5 - min;
                if (vb3Var.d != j6) {
                    u21Var.a = j6;
                    return 1;
                }
                yw7Var.K(min);
                vb3Var.f = 0;
                vb3Var.d(yw7Var.a, 0, min, false);
                int i = yw7Var.b;
                int i2 = yw7Var.c - 4;
                while (true) {
                    if (i2 < i) {
                        break;
                    }
                    if (hw8.b(i2, yw7Var.a) == 442) {
                        yw7Var.N(i2 + 4);
                        long c = hw8.c(yw7Var);
                        if (c != -9223372036854775807L) {
                            j4 = c;
                            break;
                        }
                    }
                    i2--;
                }
                hw8Var.h = j4;
                hw8Var.f = true;
                return 0;
            }
            if (hw8Var.h == -9223372036854775807L) {
                hw8Var.a((vb3) t84Var);
                return 0;
            }
            if (hw8Var.e) {
                long j7 = hw8Var.g;
                if (j7 == -9223372036854775807L) {
                    hw8Var.a((vb3) t84Var);
                    return 0;
                }
                hw8Var.i = vqbVar.c(hw8Var.h) - vqbVar.b(j7);
                hw8Var.a((vb3) t84Var);
                return 0;
            }
            vb3 vb3Var2 = (vb3) t84Var;
            int min2 = (int) Math.min(20000L, vb3Var2.c);
            if (vb3Var2.d != 0) {
                u21Var.a = 0L;
                return 1;
            }
            yw7Var.K(min2);
            vb3Var2.f = 0;
            vb3Var2.d(yw7Var.a, 0, min2, false);
            int i3 = yw7Var.b;
            int i4 = yw7Var.c;
            while (true) {
                if (i3 >= i4 - 3) {
                    break;
                }
                if (hw8.b(i3, yw7Var.a) == 442) {
                    yw7Var.N(i3 + 4);
                    long c2 = hw8.c(yw7Var);
                    if (c2 != -9223372036854775807L) {
                        j4 = c2;
                        break;
                    }
                }
                i3++;
            }
            hw8Var.g = j4;
            hw8Var.e = true;
            return 0;
        }
        if (this.k) {
            j = 0;
            r3 = 1;
            r2 = 0;
        } else {
            this.k = true;
            long j8 = hw8Var.i;
            if (j8 != -9223372036854775807L) {
                j = 0;
                r3 = 1;
                r2 = 0;
                dk4 dk4Var = new dk4(new f8e(), new mj4(vqbVar), j8, 1 + j8, 0L, j3, 188L, 1000);
                this.i = dk4Var;
                this.j.f0(dk4Var.a);
            } else {
                r3 = 1;
                r2 = 0;
                j = 0;
                this.j.f0(new od0(j8));
            }
        }
        dk4 dk4Var2 = this.i;
        if (dk4Var2 != null && dk4Var2.c != null) {
            return dk4Var2.a((vb3) t84Var, u21Var);
        }
        vb3 vb3Var3 = (vb3) t84Var;
        vb3Var3.f = r2;
        long f = j3 != -1 ? j3 - vb3Var3.f() : -1L;
        if (f != -1 && f < 4) {
            g();
            return -1;
        }
        yw7 yw7Var2 = this.c;
        if (!vb3Var3.d(yw7Var2.a, r2, 4, r3)) {
            g();
            return -1;
        }
        yw7Var2.N(r2);
        int m = yw7Var2.m();
        if (m == 441) {
            g();
            return -1;
        }
        if (m == 442) {
            vb3Var3.d(yw7Var2.a, r2, 10, r2);
            yw7Var2.N(9);
            vb3Var3.m((yw7Var2.A() & 7) + 14, r2);
            return r2;
        }
        if (m == 443) {
            vb3Var3.d(yw7Var2.a, r2, 2, r2);
            yw7Var2.N(r2);
            vb3Var3.m(yw7Var2.H() + 6, r2);
            return r2;
        }
        if (((m & (-256)) >> 8) != r3) {
            vb3Var3.m(r3, r2);
            return r2;
        }
        int i5 = m & nm7.d4;
        SparseArray sparseArray = this.b;
        iw8 iw8Var = (iw8) sparseArray.get(i5);
        if (!this.e) {
            if (iw8Var == null) {
                if (i5 == 189) {
                    rv3Var = new f4("video/mp2p");
                    this.f = r3;
                    this.h = vb3Var3.d;
                } else if ((m & nm7.A3) == 192) {
                    rv3Var = new vh7(null, r2, "video/mp2p");
                    this.f = r3;
                    this.h = vb3Var3.d;
                } else if ((m & nm7.O3) == 224) {
                    rv3Var = new wd5(null, "video/mp2p");
                    this.g = r3;
                    this.h = vb3Var3.d;
                } else {
                    rv3Var = null;
                }
                if (rv3Var != null) {
                    rv3Var.h(this.j, new l4c(i5, 256));
                    iw8Var = new iw8(rv3Var, this.a);
                    sparseArray.put(i5, iw8Var);
                }
            }
            if (vb3Var3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r3;
                this.j.B();
            }
        }
        vb3Var3.d(yw7Var2.a, r2, 2, r2);
        yw7Var2.N(r2);
        int H = yw7Var2.H() + 6;
        if (iw8Var == null) {
            vb3Var3.m(H, r2);
            return r2;
        }
        yw7Var2.K(H);
        vb3Var3.c(yw7Var2.a, r2, H, r2);
        yw7Var2.N(6);
        rv3 rv3Var2 = iw8Var.a;
        ye1 ye1Var = iw8Var.c;
        yw7Var2.k(r2, 3, ye1Var.b);
        ye1Var.l(r2);
        ye1Var.n(8);
        iw8Var.d = ye1Var.e();
        iw8Var.e = ye1Var.e();
        ye1Var.n(6);
        yw7Var2.k(r2, ye1Var.f(8), ye1Var.b);
        ye1Var.l(r2);
        vqb vqbVar2 = iw8Var.b;
        if (iw8Var.d) {
            ye1Var.n(4);
            ye1Var.n(r3);
            ye1Var.n(r3);
            long f2 = (ye1Var.f(3) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15);
            ye1Var.n(r3);
            if (!iw8Var.f && iw8Var.e) {
                ye1Var.n(4);
                ye1Var.n(r3);
                ye1Var.n(r3);
                ye1Var.n(r3);
                vqbVar2.b((ye1Var.f(3) << 30) | (ye1Var.f(15) << 15) | ye1Var.f(15));
                iw8Var.f = r3;
            }
            j2 = vqbVar2.b(f2);
        } else {
            j2 = j;
        }
        rv3Var2.g(4, j2);
        rv3Var2.b(yw7Var2);
        rv3Var2.e();
        yw7Var2.M(yw7Var2.a.length);
        return r2;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        byte[] bArr = new byte[14];
        vb3 vb3Var = (vb3) t84Var;
        vb3Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            vb3Var.a(bArr[13] & 7, false);
            vb3Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        vqb vqbVar = this.a;
        boolean z = vqbVar.e() == -9223372036854775807L;
        if (!z) {
            long d = vqbVar.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            vqbVar.g(j2);
        }
        dk4 dk4Var = this.i;
        if (dk4Var != null) {
            dk4Var.d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            iw8 iw8Var = (iw8) sparseArray.valueAt(i);
            iw8Var.f = false;
            iw8Var.a.d();
            i++;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.j = u84Var;
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((iw8) sparseArray.valueAt(i)).a.f();
            i++;
        }
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
