package o3;

import d5.g0;
import d5.q;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.util.ArrayList;
import java.util.Arrays;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.w;
import p8.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements k {
    public int c;
    public c e;
    public long h;
    public e i;
    public int m;
    public boolean n;
    public final z a = new z(12);
    public final b8.b b = new b8.b();
    public m d = new w9.d(14);
    public e[] g = new e[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(l lVar, n nVar) {
        boolean z10;
        e eVar;
        int i10;
        e eVar2;
        long j10 = this.h;
        if (j10 != -1) {
            long j11 = ((m3.h) lVar).d;
            if (j10 < j11 || j10 > 262144 + j11) {
                nVar.a = j10;
                z10 = true;
                this.h = -1L;
                if (!z10) {
                    return 1;
                }
                int i11 = this.c;
                e eVar3 = null;
                b8.b bVar = this.b;
                z zVar = this.a;
                switch (i11) {
                    case 0:
                        if (!f(lVar)) {
                            throw t1.a("AVI Header List not found", null);
                        }
                        ((m3.h) lVar).t(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((m3.h) lVar).d(zVar.a, 0, 12, false);
                        zVar.C(0);
                        bVar.getClass();
                        bVar.a = zVar.g();
                        bVar.b = zVar.g();
                        bVar.c = 0;
                        if (bVar.a != 1414744396) {
                            throw t1.a("LIST expected, found: " + bVar.a, null);
                        }
                        int g10 = zVar.g();
                        bVar.c = g10;
                        if (g10 == 1819436136) {
                            this.j = bVar.b;
                            this.c = 2;
                            return 0;
                        }
                        throw t1.a("hdrl expected, found: " + bVar.c, null);
                    case 2:
                        int i12 = this.j - 4;
                        z zVar2 = new z(i12);
                        ((m3.h) lVar).d(zVar2.a, 0, i12, false);
                        f b10 = f.b(1819436136, zVar2);
                        int i13 = b10.b;
                        if (i13 != 1819436136) {
                            throw t1.a("Unexpected header list type " + i13, null);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw t1.a("AviHeader not found", null);
                        }
                        this.e = cVar;
                        this.f = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        x listIterator = b10.a.listIterator(0);
                        int i14 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i15 = i14 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    d5.a.K("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    d5.a.K("AviExtractor", "Missing Stream Format");
                                } else {
                                    long O = g0.O(dVar.d, dVar.b * 1000000, dVar.c);
                                    t0 t0Var = gVar.a;
                                    s0 a2 = t0Var.a();
                                    a2.a = Integer.toString(i14);
                                    int i16 = dVar.e;
                                    if (i16 != 0) {
                                        a2.p = i16;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int g11 = q.g(t0Var.B);
                                    if (g11 == 1 || g11 == 2) {
                                        w C = this.d.C(i14, g11);
                                        C.c(new t0(a2));
                                        eVar = new e(i14, g11, O, dVar.d, C);
                                        this.f = O;
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i14 = i15;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i14 = i15;
                            }
                        }
                        this.g = (e[]) arrayList.toArray(new e[0]);
                        this.d.A();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j12 = this.k;
                        if (j12 != -1 && ((m3.h) lVar).d != j12) {
                            this.h = j12;
                            return 0;
                        }
                        ((m3.h) lVar).g(zVar.a, 0, 12, false);
                        m3.h hVar2 = (m3.h) lVar;
                        hVar2.f = 0;
                        zVar.C(0);
                        bVar.getClass();
                        bVar.a = zVar.g();
                        bVar.b = zVar.g();
                        bVar.c = 0;
                        int g12 = zVar.g();
                        int i17 = bVar.a;
                        if (i17 == 1179011410) {
                            hVar2.t(12);
                            return 0;
                        }
                        if (i17 != 1414744396 || g12 != 1769369453) {
                            this.h = hVar2.d + bVar.b + 8;
                            return 0;
                        }
                        long j13 = hVar2.d;
                        this.k = j13;
                        this.l = j13 + bVar.b + 8;
                        if (!this.n) {
                            c cVar2 = this.e;
                            cVar2.getClass();
                            if ((cVar2.b & 16) == 16) {
                                this.c = 4;
                                this.h = this.l;
                                return 0;
                            }
                            this.d.n(new o(this.f));
                            this.n = true;
                        }
                        this.h = hVar2.d + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        ((m3.h) lVar).d(zVar.a, 0, 8, false);
                        zVar.C(0);
                        int g13 = zVar.g();
                        int g14 = zVar.g();
                        if (g13 != 829973609) {
                            this.h = ((m3.h) lVar).d + g14;
                            return 0;
                        }
                        this.c = 5;
                        this.m = g14;
                        return 0;
                    case 5:
                        z zVar3 = new z(this.m);
                        ((m3.h) lVar).d(zVar3.a, 0, this.m, false);
                        if (zVar3.a() >= 16) {
                            int i18 = zVar3.b;
                            zVar3.D(8);
                            long g15 = zVar3.g();
                            long j14 = this.k;
                            r7 = g15 <= j14 ? j14 + 8 : 0L;
                            zVar3.C(i18);
                        }
                        while (zVar3.a() >= 16) {
                            int g16 = zVar3.g();
                            int g17 = zVar3.g();
                            long g18 = zVar3.g() + r7;
                            zVar3.g();
                            e[] eVarArr = this.g;
                            int length = eVarArr.length;
                            while (true) {
                                if (i10 < length) {
                                    eVar2 = eVarArr[i10];
                                    i10 = (eVar2.b == g16 || eVar2.c == g16) ? 0 : i10 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                if ((g17 & 16) == 16) {
                                    if (eVar2.j == eVar2.l.length) {
                                        long[] jArr = eVar2.k;
                                        eVar2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.l;
                                        eVar2.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.k;
                                    int i19 = eVar2.j;
                                    jArr2[i19] = g18;
                                    eVar2.l[i19] = eVar2.i;
                                    eVar2.j = i19 + 1;
                                }
                                eVar2.i++;
                            }
                        }
                        for (e eVar4 : this.g) {
                            eVar4.k = Arrays.copyOf(eVar4.k, eVar4.j);
                            eVar4.l = Arrays.copyOf(eVar4.l, eVar4.j);
                        }
                        this.n = true;
                        this.d.n(new o(this, this.f, 2));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        if (((m3.h) lVar).d >= this.l) {
                            return -1;
                        }
                        e eVar5 = this.i;
                        if (eVar5 != null) {
                            int i20 = eVar5.g;
                            int b11 = i20 - eVar5.a.b(lVar, i20, false);
                            eVar5.g = b11;
                            boolean z11 = b11 == 0;
                            if (z11) {
                                if (eVar5.f > 0) {
                                    w wVar = eVar5.a;
                                    int i21 = eVar5.h;
                                    wVar.e((eVar5.d * i21) / eVar5.e, Arrays.binarySearch(eVar5.l, i21) >= 0 ? 1 : 0, eVar5.f, 0, null);
                                }
                                eVar5.h++;
                            }
                            if (z11) {
                                this.i = null;
                            }
                            return 0;
                        }
                        m3.h hVar3 = (m3.h) lVar;
                        if ((hVar3.d & 1) == 1) {
                            hVar3.t(1);
                        }
                        hVar3.g(zVar.a, 0, 12, false);
                        zVar.C(0);
                        int g19 = zVar.g();
                        if (g19 == 1414744396) {
                            zVar.C(8);
                            hVar3.t(zVar.g() == 1769369453 ? 12 : 8);
                            hVar3.f = 0;
                            return 0;
                        }
                        int g20 = zVar.g();
                        if (g19 == 1263424842) {
                            this.h = hVar3.d + g20 + 8;
                            return 0;
                        }
                        hVar3.t(8);
                        hVar3.f = 0;
                        for (e eVar6 : this.g) {
                            if (eVar6.b == g19 || eVar6.c == g19) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.h = hVar3.d + g20;
                                    return 0;
                                }
                                eVar3.f = g20;
                                eVar3.g = g20;
                                this.i = eVar3;
                                return 0;
                            }
                        }
                        if (eVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                ((m3.h) lVar).t((int) (j10 - j11));
            }
        }
        z10 = false;
        this.h = -1L;
        if (!z10) {
        }
    }

    @Override // m3.k
    public final void c(m mVar) {
        this.c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override // m3.k
    public final boolean f(l lVar) {
        z zVar = this.a;
        lVar.b(0, 12, zVar.a);
        zVar.C(0);
        if (zVar.g() == 1179011410) {
            zVar.D(4);
            if (zVar.g() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        this.h = -1L;
        this.i = null;
        for (e eVar : this.g) {
            if (eVar.j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.l[g0.e(eVar.k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
