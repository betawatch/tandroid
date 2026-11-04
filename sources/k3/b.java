package k3;

import c4.f;
import d2.u;
import d2.u0;
import e3.l;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.p1;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements o {
    public final y a = new y(4);
    public final y b = new y(9);
    public final y c = new y(11);
    public final y d = new y();
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

    @Override // e3.o
    public final boolean b(p pVar) {
        y yVar = this.a;
        l lVar = (l) pVar;
        lVar.h(yVar.a, 0, 3, false);
        yVar.N(0);
        if (yVar.D() == 4607062) {
            lVar.h(yVar.a, 0, 2, false);
            yVar.N(0);
            if ((yVar.H() & hs.Z3) == 0) {
                lVar.h(yVar.a, 0, 4, false);
                yVar.N(0);
                int m10 = yVar.m();
                lVar.f = 0;
                lVar.w(m10, false);
                lVar.h(yVar.a, 0, 4, false);
                yVar.N(0);
                if (yVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.f = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        long j10;
        long j11;
        int i3;
        int i10;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        this.f.getClass();
        while (true) {
            int i11 = this.g;
            if (i11 == 1) {
                y yVar = this.b;
                if (!pVar.d(yVar.a, 0, 9, true)) {
                    return -1;
                }
                yVar.N(0);
                yVar.O(4);
                int A = yVar.A();
                boolean z13 = (A & 4) != 0;
                boolean z14 = (A & 1) != 0;
                if (z13 && this.o == null) {
                    this.o = new a(this.f.i0(8, 1));
                }
                if (z14 && this.p == null) {
                    this.p = new e(this.f.i0(9, 2));
                }
                this.f.L();
                this.j = yVar.m() - 5;
                this.g = 2;
            } else if (i11 == 2) {
                pVar.u(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i11 == 3) {
                y yVar2 = this.c;
                if (!pVar.d(yVar2.a, 0, 11, true)) {
                    return -1;
                }
                yVar2.N(0);
                this.k = yVar2.A();
                this.l = yVar2.D();
                this.m = yVar2.D();
                this.m = ((yVar2.A() << 24) | this.m) * 1000;
                yVar2.O(3);
                this.g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.h;
                c cVar = this.e;
                if (z15) {
                    j10 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j11 = 0;
                    i3 = this.k;
                    if (i3 == 8 || this.o == null) {
                        i10 = 0;
                        if (i3 == 9 || this.p == null) {
                            j12 = -9223372036854775807L;
                            if (i3 == 18 || this.n) {
                                pVar.u(this.l);
                                z10 = false;
                                z11 = false;
                            } else {
                                y g7 = g(pVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (g7.A() == 2 && "onMetaData".equals(c.g1(g7)) && g7.a() != 0 && g7.A() == 8) {
                                    HashMap f12 = c.f1(g7);
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
                                                double d10 = d;
                                                cVar.c[i12] = (long) (((Double) obj6).doubleValue() * d10);
                                                cVar.d[i12] = ((Double) obj5).longValue();
                                                i12++;
                                                d = d10;
                                            }
                                        }
                                    }
                                }
                                long j13 = cVar.b;
                                if (j13 != -9223372036854775807L) {
                                    this.f.f(new e3.y(j13, cVar.d, cVar.c));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.f(new t(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            y g10 = g(pVar);
                            eVar.getClass();
                            int A2 = g10.A();
                            int i13 = (A2 >> 4) & 15;
                            int i14 = A2 & 15;
                            if (i14 != 7) {
                                throw new d(p1.i(i14, "Video format not supported: "));
                            }
                            eVar.g = i13;
                            if (i13 != 5) {
                                y yVar3 = eVar.b;
                                e3.i0 i0Var = (e3.i0) eVar.a;
                                y yVar4 = eVar.c;
                                int A3 = g10.A();
                                g10.f(3);
                                byte[] bArr = g10.a;
                                j12 = -9223372036854775807L;
                                int i15 = g10.b;
                                int i16 = i15 + 1;
                                g10.b = i16;
                                int i17 = ((bArr[i15] & 255) << 24) >> 8;
                                g10.b = i15 + 2;
                                int i18 = ((bArr[i16] & 255) << 8) | i17;
                                g10.b = i15 + 3;
                                long j14 = (((bArr[r5] & 255) | i18) * 1000) + j11;
                                boolean z16 = false;
                                if (A3 == 0 && !eVar.e) {
                                    byte[] bArr2 = new byte[g10.a()];
                                    y yVar5 = new y(bArr2);
                                    g10.k(0, g10.a(), bArr2);
                                    e3.d a10 = e3.d.a(yVar5);
                                    eVar.d = a10.b;
                                    u uVar = new u();
                                    uVar.q = u0.n("video/x-flv");
                                    uVar.r = u0.n("video/avc");
                                    uVar.j = a10.l;
                                    uVar.y = a10.c;
                                    uVar.z = a10.d;
                                    uVar.E = a10.k;
                                    uVar.u = a10.a;
                                    f1.w(uVar, i0Var);
                                    eVar.e = true;
                                } else if (A3 == 1 && eVar.e) {
                                    int i19 = eVar.g == 1 ? 1 : 0;
                                    if (eVar.f || i19 != 0) {
                                        byte[] bArr3 = yVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i20 = 4 - eVar.d;
                                        int i21 = 0;
                                        while (g10.a() > 0) {
                                            g10.k(i20, eVar.d, yVar4.a);
                                            yVar4.N(0);
                                            int E = yVar4.E();
                                            yVar3.N(0);
                                            i0Var.e(4, yVar3);
                                            i0Var.e(E, g10);
                                            i21 = i21 + 4 + E;
                                        }
                                        ((e3.i0) eVar.a).d(j14, i19, i21, 0, null);
                                        eVar.f = true;
                                        z16 = true;
                                    }
                                }
                                if (z16) {
                                    z10 = true;
                                    z11 = true;
                                }
                            } else {
                                j12 = -9223372036854775807L;
                            }
                        }
                        z10 = false;
                        z11 = true;
                    } else {
                        if (!this.n) {
                            this.f.f(new t(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        y g11 = g(pVar);
                        e3.i0 i0Var2 = (e3.i0) aVar.a;
                        if (aVar.b) {
                            i10 = 0;
                            g11.O(1);
                        } else {
                            int A4 = g11.A();
                            int i22 = (A4 >> 4) & 15;
                            aVar.d = i22;
                            i10 = 0;
                            if (i22 == 2) {
                                int i23 = a.e[(A4 >> 2) & 3];
                                u uVar2 = new u();
                                uVar2.q = u0.n("video/x-flv");
                                uVar2.r = u0.n("audio/mpeg");
                                uVar2.J = 1;
                                uVar2.K = i23;
                                f1.w(uVar2, i0Var2);
                                aVar.c = true;
                            } else if (i22 == 7 || i22 == 8) {
                                String str = i22 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                u uVar3 = new u();
                                uVar3.q = u0.n("video/x-flv");
                                uVar3.r = u0.n(str);
                                uVar3.J = 1;
                                uVar3.K = 8000;
                                f1.w(uVar3, i0Var2);
                                aVar.c = true;
                            } else if (i22 != 10) {
                                throw new d("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        e3.i0 i0Var3 = (e3.i0) aVar.a;
                        if (aVar.d == 2) {
                            int a11 = g11.a();
                            i0Var3.e(a11, g11);
                            ((e3.i0) aVar.a).d(j11, 1, a11, 0, null);
                        } else {
                            int A5 = g11.A();
                            z12 = false;
                            if (A5 == 0 && !aVar.c) {
                                int a12 = g11.a();
                                byte[] bArr4 = new byte[a12];
                                g11.k(0, a12, bArr4);
                                e3.a n4 = e3.b.n(new f(bArr4, a12), false);
                                u uVar4 = new u();
                                uVar4.q = u0.n("video/x-flv");
                                uVar4.r = u0.n("audio/mp4a-latm");
                                uVar4.j = n4.a;
                                uVar4.J = n4.c;
                                uVar4.K = n4.b;
                                uVar4.u = Collections.singletonList(bArr4);
                                f1.w(uVar4, i0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || A5 == 1) {
                                int a13 = g11.a();
                                i0Var3.e(a13, g11);
                                ((e3.i0) aVar.a).d(j11, 1, a13, 0, null);
                            }
                            z11 = true;
                            j12 = -9223372036854775807L;
                            z10 = z12;
                        }
                        z12 = true;
                        z11 = true;
                        j12 = -9223372036854775807L;
                        z10 = z12;
                    }
                    if (!this.h && z10) {
                        this.h = true;
                        this.i = cVar.b != j12 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z11) {
                        return i10;
                    }
                } else {
                    j10 = this.m;
                }
                j11 = j10;
                i3 = this.k;
                if (i3 == 8) {
                }
                i10 = 0;
                if (i3 == 9) {
                }
                j12 = -9223372036854775807L;
                if (i3 == 18) {
                }
                pVar.u(this.l);
                z10 = false;
                z11 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = cVar.b != j12 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z11) {
                }
            }
        }
    }

    public final y g(p pVar) {
        int i3 = this.l;
        y yVar = this.d;
        byte[] bArr = yVar.a;
        if (i3 > bArr.length) {
            yVar.L(0, new byte[Math.max(bArr.length * 2, i3)]);
        } else {
            yVar.N(0);
        }
        yVar.M(this.l);
        pVar.readFully(yVar.a, 0, this.l);
        return yVar;
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
