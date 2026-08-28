package o3;

import d5.f0;
import d5.q;
import d5.y;
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
import o8.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements k {
    public int c;
    public c e;
    public long h;
    public e i;
    public int m;
    public boolean n;
    public final y a = new y(12);
    public final a8.b b = new a8.b();
    public m d = new ya.b(14);
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
        int i9;
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
                int i10 = this.c;
                e eVar3 = null;
                a8.b bVar = this.b;
                y yVar = this.a;
                switch (i10) {
                    case 0:
                        if (!f(lVar)) {
                            throw t1.a("AVI Header List not found", null);
                        }
                        ((m3.h) lVar).u(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((m3.h) lVar).d(yVar.a, 0, 12, false);
                        yVar.C(0);
                        bVar.getClass();
                        bVar.a = yVar.g();
                        bVar.b = yVar.g();
                        bVar.c = 0;
                        if (bVar.a != 1414744396) {
                            throw t1.a("LIST expected, found: " + bVar.a, null);
                        }
                        int g10 = yVar.g();
                        bVar.c = g10;
                        if (g10 == 1819436136) {
                            this.j = bVar.b;
                            this.c = 2;
                            return 0;
                        }
                        throw t1.a("hdrl expected, found: " + bVar.c, null);
                    case 2:
                        int i11 = this.j - 4;
                        y yVar2 = new y(i11);
                        ((m3.h) lVar).d(yVar2.a, 0, i11, false);
                        f b10 = f.b(1819436136, yVar2);
                        int i12 = b10.b;
                        if (i12 != 1819436136) {
                            throw t1.a("Unexpected header list type " + i12, null);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw t1.a("AviHeader not found", null);
                        }
                        this.e = cVar;
                        this.f = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        x listIterator = b10.a.listIterator(0);
                        int i13 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i14 = i13 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    d5.a.K("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    d5.a.K("AviExtractor", "Missing Stream Format");
                                } else {
                                    long O = f0.O(dVar.d, dVar.b * 1000000, dVar.c);
                                    t0 t0Var = gVar.a;
                                    s0 a2 = t0Var.a();
                                    a2.a = Integer.toString(i13);
                                    int i15 = dVar.e;
                                    if (i15 != 0) {
                                        a2.p = i15;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int g11 = q.g(t0Var.B);
                                    if (g11 == 1 || g11 == 2) {
                                        w I = this.d.I(i13, g11);
                                        I.c(new t0(a2));
                                        eVar = new e(i13, g11, O, dVar.d, I);
                                        this.f = O;
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i13 = i14;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i13 = i14;
                            }
                        }
                        this.g = (e[]) arrayList.toArray(new e[0]);
                        this.d.B();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j12 = this.k;
                        if (j12 != -1 && ((m3.h) lVar).d != j12) {
                            this.h = j12;
                            return 0;
                        }
                        ((m3.h) lVar).g(yVar.a, 0, 12, false);
                        m3.h hVar2 = (m3.h) lVar;
                        hVar2.f = 0;
                        yVar.C(0);
                        bVar.getClass();
                        bVar.a = yVar.g();
                        bVar.b = yVar.g();
                        bVar.c = 0;
                        int g12 = yVar.g();
                        int i16 = bVar.a;
                        if (i16 == 1179011410) {
                            hVar2.u(12);
                            return 0;
                        }
                        if (i16 != 1414744396 || g12 != 1769369453) {
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
                            this.d.y(new o(this.f));
                            this.n = true;
                        }
                        this.h = hVar2.d + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        ((m3.h) lVar).d(yVar.a, 0, 8, false);
                        yVar.C(0);
                        int g13 = yVar.g();
                        int g14 = yVar.g();
                        if (g13 != 829973609) {
                            this.h = ((m3.h) lVar).d + g14;
                            return 0;
                        }
                        this.c = 5;
                        this.m = g14;
                        return 0;
                    case 5:
                        y yVar3 = new y(this.m);
                        ((m3.h) lVar).d(yVar3.a, 0, this.m, false);
                        if (yVar3.a() >= 16) {
                            int i17 = yVar3.b;
                            yVar3.D(8);
                            long g15 = yVar3.g();
                            long j14 = this.k;
                            r7 = g15 <= j14 ? j14 + 8 : 0L;
                            yVar3.C(i17);
                        }
                        while (yVar3.a() >= 16) {
                            int g16 = yVar3.g();
                            int g17 = yVar3.g();
                            long g18 = yVar3.g() + r7;
                            yVar3.g();
                            e[] eVarArr = this.g;
                            int length = eVarArr.length;
                            while (true) {
                                if (i9 < length) {
                                    eVar2 = eVarArr[i9];
                                    i9 = (eVar2.b == g16 || eVar2.c == g16) ? 0 : i9 + 1;
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
                                    int i18 = eVar2.j;
                                    jArr2[i18] = g18;
                                    eVar2.l[i18] = eVar2.i;
                                    eVar2.j = i18 + 1;
                                }
                                eVar2.i++;
                            }
                        }
                        for (e eVar4 : this.g) {
                            eVar4.k = Arrays.copyOf(eVar4.k, eVar4.j);
                            eVar4.l = Arrays.copyOf(eVar4.l, eVar4.j);
                        }
                        this.n = true;
                        this.d.y(new o(this, this.f, 2));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        if (((m3.h) lVar).d >= this.l) {
                            return -1;
                        }
                        e eVar5 = this.i;
                        if (eVar5 != null) {
                            int i19 = eVar5.g;
                            int b11 = i19 - eVar5.a.b(lVar, i19, false);
                            eVar5.g = b11;
                            boolean z11 = b11 == 0;
                            if (z11) {
                                if (eVar5.f > 0) {
                                    w wVar = eVar5.a;
                                    int i20 = eVar5.h;
                                    wVar.e((eVar5.d * i20) / eVar5.e, Arrays.binarySearch(eVar5.l, i20) >= 0 ? 1 : 0, eVar5.f, 0, null);
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
                            hVar3.u(1);
                        }
                        hVar3.g(yVar.a, 0, 12, false);
                        yVar.C(0);
                        int g19 = yVar.g();
                        if (g19 == 1414744396) {
                            yVar.C(8);
                            hVar3.u(yVar.g() == 1769369453 ? 12 : 8);
                            hVar3.f = 0;
                            return 0;
                        }
                        int g20 = yVar.g();
                        if (g19 == 1263424842) {
                            this.h = hVar3.d + g20 + 8;
                            return 0;
                        }
                        hVar3.u(8);
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
                ((m3.h) lVar).u((int) (j10 - j11));
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
        y yVar = this.a;
        lVar.c(0, 12, yVar.a);
        yVar.C(0);
        if (yVar.g() == 1179011410) {
            yVar.D(4);
            if (yVar.g() == 541677121) {
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
                eVar.h = eVar.l[f0.e(eVar.k, j10, true)];
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
