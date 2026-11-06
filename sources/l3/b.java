package l3;

import d4.f;
import e2.s0;
import f3.j0;
import f3.l;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import f3.z;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jg.g;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements o {
    public final x a = new x(4);
    public final x b = new x(9);
    public final x c = new x(11);
    public final x d = new x();
    public final c e;
    public q f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public e p;

    public b() {
        c cVar = new c(new n());
        cVar.b = -9223372036854775807L;
        cVar.c = new long[0];
        cVar.d = new long[0];
        this.e = cVar;
        this.g = 1;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        x xVar = this.a;
        l lVar = (l) pVar;
        lVar.k(xVar.a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.k(xVar.a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & qs.Z3) == 0) {
                lVar.k(xVar.a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f = 0;
                lVar.v(m10, false);
                lVar.k(xVar.a, 0, 4, false);
                xVar.N(0);
                if (xVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.f = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        long j3;
        long j10;
        int i7;
        int i10;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        this.f.getClass();
        while (true) {
            int i11 = this.g;
            if (i11 == 1) {
                x xVar = this.b;
                if (!pVar.c(xVar.a, 0, 9, true)) {
                    return -1;
                }
                xVar.N(0);
                xVar.O(4);
                int A = xVar.A();
                boolean z12 = (A & 4) != 0;
                boolean z13 = (A & 1) != 0;
                if (z12 && this.o == null) {
                    this.o = new a(this.f.O1(8, 1));
                }
                if (z13 && this.p == null) {
                    this.p = new e(this.f.O1(9, 2));
                }
                this.f.U0();
                this.j = xVar.m() - 5;
                this.g = 2;
            } else if (i11 == 2) {
                pVar.s(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i11 == 3) {
                x xVar2 = this.c;
                if (!pVar.c(xVar2.a, 0, 11, true)) {
                    return -1;
                }
                xVar2.N(0);
                this.k = xVar2.A();
                this.l = xVar2.D();
                this.m = xVar2.D();
                this.m = ((xVar2.A() << 24) | this.m) * 1000;
                xVar2.O(3);
                this.g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z14 = this.h;
                c cVar = this.e;
                if (z14) {
                    j3 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j10 = 0;
                    i7 = this.k;
                    if (i7 == 8 || this.o == null) {
                        i10 = 0;
                        if (i7 == 9 || this.p == null) {
                            j11 = -9223372036854775807L;
                            if (i7 == 18 || this.n) {
                                pVar.s(this.l);
                                z9 = false;
                                z10 = false;
                            } else {
                                x g10 = g(pVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (g10.A() == 2 && "onMetaData".equals(c.g1(g10)) && g10.a() != 0 && g10.A() == 8) {
                                    HashMap f12 = c.f1(g10);
                                    Object obj = f12.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            cVar.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = f12.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.c = new long[size];
                                            cVar.d = new long[size];
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj5 = list.get(i12);
                                                Object obj6 = list2.get(i12);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.c = new long[0];
                                                    cVar.d = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                cVar.c[i12] = (long) (((Double) obj6).doubleValue() * d2);
                                                cVar.d[i12] = ((Double) obj5).longValue();
                                                i12++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j12 = cVar.b;
                                if (j12 != -9223372036854775807L) {
                                    this.f.f(new z(j12, cVar.d, cVar.c));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.f(new t(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            x g11 = g(pVar);
                            eVar.getClass();
                            int A2 = g11.A();
                            int i13 = (A2 >> 4) & 15;
                            int i14 = A2 & 15;
                            if (i14 != 7) {
                                throw new d(g.j(i14, "Video format not supported: "));
                            }
                            eVar.g = i13;
                            if (i13 != 5) {
                                x xVar3 = eVar.b;
                                j0 j0Var = (j0) eVar.a;
                                x xVar4 = eVar.c;
                                int A3 = g11.A();
                                g11.f(3);
                                byte[] bArr = g11.a;
                                j11 = -9223372036854775807L;
                                int i15 = g11.b;
                                int i16 = i15 + 1;
                                g11.b = i16;
                                int i17 = ((bArr[i15] & 255) << 24) >> 8;
                                g11.b = i15 + 2;
                                int i18 = ((bArr[i16] & 255) << 8) | i17;
                                g11.b = i15 + 3;
                                long j13 = (((bArr[r5] & 255) | i18) * 1000) + j10;
                                boolean z15 = false;
                                if (A3 == 0 && !eVar.e) {
                                    byte[] bArr2 = new byte[g11.a()];
                                    x xVar5 = new x(bArr2);
                                    g11.k(0, g11.a(), bArr2);
                                    f3.d a10 = f3.d.a(xVar5);
                                    eVar.d = a10.b;
                                    e2.t tVar = new e2.t();
                                    tVar.q = s0.n("video/x-flv");
                                    tVar.r = s0.n("video/avc");
                                    tVar.j = a10.l;
                                    tVar.y = a10.c;
                                    tVar.z = a10.d;
                                    tVar.E = a10.k;
                                    tVar.u = a10.a;
                                    f1.s(tVar, j0Var);
                                    eVar.e = true;
                                } else if (A3 == 1 && eVar.e) {
                                    int i19 = eVar.g == 1 ? 1 : 0;
                                    if (eVar.f || i19 != 0) {
                                        byte[] bArr3 = xVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i20 = 4 - eVar.d;
                                        int i21 = 0;
                                        while (g11.a() > 0) {
                                            g11.k(i20, eVar.d, xVar4.a);
                                            xVar4.N(0);
                                            int E = xVar4.E();
                                            xVar3.N(0);
                                            j0Var.b(4, xVar3);
                                            j0Var.b(E, g11);
                                            i21 = i21 + 4 + E;
                                        }
                                        ((j0) eVar.a).c(j13, i19, i21, 0, null);
                                        eVar.f = true;
                                        z15 = true;
                                    }
                                }
                                if (z15) {
                                    z9 = true;
                                    z10 = true;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        z9 = false;
                        z10 = true;
                    } else {
                        if (!this.n) {
                            this.f.f(new t(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        x g12 = g(pVar);
                        j0 j0Var2 = (j0) aVar.a;
                        if (aVar.b) {
                            i10 = 0;
                            g12.O(1);
                        } else {
                            int A4 = g12.A();
                            int i22 = (A4 >> 4) & 15;
                            aVar.d = i22;
                            i10 = 0;
                            if (i22 == 2) {
                                int i23 = a.e[(A4 >> 2) & 3];
                                e2.t tVar2 = new e2.t();
                                tVar2.q = s0.n("video/x-flv");
                                tVar2.r = s0.n("audio/mpeg");
                                tVar2.J = 1;
                                tVar2.K = i23;
                                f1.s(tVar2, j0Var2);
                                aVar.c = true;
                            } else if (i22 == 7 || i22 == 8) {
                                String str = i22 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                e2.t tVar3 = new e2.t();
                                tVar3.q = s0.n("video/x-flv");
                                tVar3.r = s0.n(str);
                                tVar3.J = 1;
                                tVar3.K = 8000;
                                f1.s(tVar3, j0Var2);
                                aVar.c = true;
                            } else if (i22 != 10) {
                                throw new d("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        j0 j0Var3 = (j0) aVar.a;
                        if (aVar.d == 2) {
                            int a11 = g12.a();
                            j0Var3.b(a11, g12);
                            ((j0) aVar.a).c(j10, 1, a11, 0, null);
                        } else {
                            int A5 = g12.A();
                            z11 = false;
                            if (A5 == 0 && !aVar.c) {
                                int a12 = g12.a();
                                byte[] bArr4 = new byte[a12];
                                g12.k(0, a12, bArr4);
                                f3.a n10 = f3.b.n(new f(bArr4, a12), false);
                                e2.t tVar4 = new e2.t();
                                tVar4.q = s0.n("video/x-flv");
                                tVar4.r = s0.n("audio/mp4a-latm");
                                tVar4.j = n10.a;
                                tVar4.J = n10.c;
                                tVar4.K = n10.b;
                                tVar4.u = Collections.singletonList(bArr4);
                                f1.s(tVar4, j0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || A5 == 1) {
                                int a13 = g12.a();
                                j0Var3.b(a13, g12);
                                ((j0) aVar.a).c(j10, 1, a13, 0, null);
                            }
                            z10 = true;
                            j11 = -9223372036854775807L;
                            z9 = z11;
                        }
                        z11 = true;
                        z10 = true;
                        j11 = -9223372036854775807L;
                        z9 = z11;
                    }
                    if (!this.h && z9) {
                        this.h = true;
                        this.i = cVar.b != j11 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z10) {
                        return i10;
                    }
                } else {
                    j3 = this.m;
                }
                j10 = j3;
                i7 = this.k;
                if (i7 == 8) {
                }
                i10 = 0;
                if (i7 == 9) {
                }
                j11 = -9223372036854775807L;
                if (i7 == 18) {
                }
                pVar.s(this.l);
                z9 = false;
                z10 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = cVar.b != j11 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z10) {
                }
            }
        }
    }

    public final x g(p pVar) {
        int i7 = this.l;
        x xVar = this.d;
        byte[] bArr = xVar.a;
        if (i7 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.l);
        pVar.readFully(xVar.a, 0, this.l);
        return xVar;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
