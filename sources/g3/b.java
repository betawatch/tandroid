package g3;

import b4.n;
import d2.u;
import d2.u0;
import d2.v;
import d2.v0;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements o {
    public final y a;
    public final a7.d b;
    public final boolean c;
    public final mb.b d;
    public int e;
    public q f;
    public c g;
    public long h;
    public e[] i;
    public long j;
    public e k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public b(int i3, mb.b bVar) {
        this.d = bVar;
        this.c = (i3 & 1) == 0;
        this.a = new y(12);
        this.b = new a7.d();
        this.f = new mb.b(6);
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // e3.o
    public final boolean b(p pVar) {
        y yVar = this.a;
        pVar.c(0, 12, yVar.a);
        yVar.N(0);
        if (yVar.o() != 1179011410) {
            return false;
        }
        yVar.O(4);
        return yVar.o() == 541677121;
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.e = 0;
        if (this.c) {
            qVar = new n(qVar, this.d);
        }
        this.f = qVar;
        this.j = -1L;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            if (eVar.k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.n[n0.f(eVar.m, j10, true)];
            }
        }
        if (j10 != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        boolean z10;
        e eVar;
        int i3;
        int i10;
        e eVar2;
        if (this.j != -1) {
            long position = pVar.getPosition();
            long j10 = this.j;
            if (j10 < position || j10 > 262144 + position) {
                sVar.a = j10;
                z10 = true;
                this.j = -1L;
                if (!z10) {
                    return 1;
                }
                int i11 = this.e;
                int i12 = 4;
                e eVar3 = null;
                a7.d dVar = this.b;
                y yVar = this.a;
                switch (i11) {
                    case 0:
                        if (!b(pVar)) {
                            throw v0.a(null, "AVI Header List not found");
                        }
                        pVar.u(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        pVar.readFully(yVar.a, 0, 12);
                        yVar.N(0);
                        dVar.getClass();
                        dVar.a = yVar.o();
                        dVar.b = yVar.o();
                        dVar.c = 0;
                        if (dVar.a != 1414744396) {
                            throw v0.a(null, "LIST expected, found: " + dVar.a);
                        }
                        int o10 = yVar.o();
                        dVar.c = o10;
                        if (o10 == 1819436136) {
                            this.l = dVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw v0.a(null, "hdrl expected, found: " + dVar.c);
                    case 2:
                        int i13 = this.l - 4;
                        y yVar2 = new y(i13);
                        pVar.readFully(yVar2.a, 0, i13);
                        f b10 = f.b(1819436136, yVar2);
                        int i14 = b10.b;
                        if (i14 != 1819436136) {
                            throw v0.a(null, "Unexpected header list type " + i14);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw v0.a(null, "AviHeader not found");
                        }
                        this.g = cVar;
                        this.h = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        g0 listIterator = b10.a.listIterator(0);
                        int i15 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i16 = i15 + 1;
                                d dVar2 = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar2 == null) {
                                    g2.a.l("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    g2.a.l("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j11 = dVar2.c;
                                    String str = n0.a;
                                    long a02 = n0.a0(dVar2.d, 1000000 * dVar2.b, j11, RoundingMode.DOWN);
                                    v vVar = gVar.a;
                                    u a10 = vVar.a();
                                    a10.a = Integer.toString(i15);
                                    int i17 = dVar2.e;
                                    if (i17 != 0) {
                                        a10.s = i17;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a10.b = hVar.a;
                                    }
                                    int h = u0.h(vVar.s);
                                    if (h == 1 || h == 2) {
                                        e3.i0 i02 = this.f.i0(i15, h);
                                        i02.g(new v(a10));
                                        i02.b(a02);
                                        this.h = Math.max(this.h, a02);
                                        eVar = new e(i15, dVar2, i02);
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i15 = i16;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i15 = i16;
                            }
                        }
                        this.i = (e[]) arrayList.toArray(new e[0]);
                        this.f.L();
                        this.e = 3;
                        return 0;
                    case 3:
                        if (this.m != -1) {
                            long position2 = pVar.getPosition();
                            long j12 = this.m;
                            if (position2 != j12) {
                                this.j = j12;
                                return 0;
                            }
                        }
                        pVar.c(0, 12, yVar.a);
                        pVar.o();
                        yVar.N(0);
                        dVar.getClass();
                        dVar.a = yVar.o();
                        dVar.b = yVar.o();
                        dVar.c = 0;
                        int o11 = yVar.o();
                        int i18 = dVar.a;
                        if (i18 == 1179011410) {
                            pVar.u(12);
                            return 0;
                        }
                        if (i18 != 1414744396 || o11 != 1769369453) {
                            this.j = pVar.getPosition() + dVar.b + 8;
                            return 0;
                        }
                        long position3 = pVar.getPosition();
                        this.m = position3;
                        this.n = position3 + dVar.b + 8;
                        if (!this.p) {
                            c cVar2 = this.g;
                            cVar2.getClass();
                            if ((cVar2.b & 16) == 16) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.f(new t(this.h));
                            this.p = true;
                        }
                        this.j = pVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        pVar.readFully(yVar.a, 0, 8);
                        yVar.N(0);
                        int o12 = yVar.o();
                        int o13 = yVar.o();
                        if (o12 != 829973609) {
                            this.j = pVar.getPosition() + o13;
                            return 0;
                        }
                        this.e = 5;
                        this.o = o13;
                        return 0;
                    case 5:
                        y yVar3 = new y(this.o);
                        pVar.readFully(yVar3.a, 0, this.o);
                        if (yVar3.a() >= 16) {
                            int i19 = yVar3.b;
                            yVar3.O(8);
                            long o14 = yVar3.o();
                            long j13 = this.m;
                            r20 = o14 <= j13 ? j13 + 8 : 0L;
                            yVar3.N(i19);
                        }
                        while (yVar3.a() >= 16) {
                            int o15 = yVar3.o();
                            int o16 = yVar3.o();
                            long o17 = yVar3.o() + r20;
                            yVar3.O(i12);
                            e[] eVarArr = this.i;
                            int length = eVarArr.length;
                            while (true) {
                                if (i10 < length) {
                                    eVar2 = eVarArr[i10];
                                    i10 = (eVar2.c == o15 || eVar2.d == o15) ? 0 : i10 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                boolean z11 = (o16 & 16) == 16;
                                if (eVar2.l == -1) {
                                    eVar2.l = o17;
                                }
                                if (z11) {
                                    if (eVar2.k == eVar2.n.length) {
                                        long[] jArr = eVar2.m;
                                        eVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.n;
                                        eVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.m;
                                    int i20 = eVar2.k;
                                    jArr2[i20] = o17;
                                    eVar2.n[i20] = eVar2.j;
                                    eVar2.k = i20 + 1;
                                }
                                eVar2.j++;
                            }
                            i12 = 4;
                        }
                        for (e eVar4 : this.i) {
                            eVar4.m = Arrays.copyOf(eVar4.m, eVar4.k);
                            eVar4.n = Arrays.copyOf(eVar4.n, eVar4.k);
                            if ((eVar4.c & 1651965952) == 1651965952 && eVar4.a.f != 0 && (i3 = eVar4.k) > 0) {
                                eVar4.f = i3;
                            }
                        }
                        this.p = true;
                        if (this.i.length == 0) {
                            this.f.f(new t(this.h));
                        } else {
                            this.f.f(new t(this, this.h, 2));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (pVar.getPosition() >= this.n) {
                            return -1;
                        }
                        e eVar5 = this.k;
                        if (eVar5 != null) {
                            int i21 = eVar5.h;
                            int a11 = i21 - eVar5.b.a(pVar, i21, false);
                            eVar5.h = a11;
                            boolean z12 = a11 == 0;
                            if (z12) {
                                if (eVar5.g > 0) {
                                    e3.i0 i0Var = eVar5.b;
                                    int i22 = eVar5.i;
                                    i0Var.d((eVar5.e * i22) / eVar5.f, Arrays.binarySearch(eVar5.n, i22) >= 0 ? 1 : 0, eVar5.g, 0, null);
                                }
                                eVar5.i++;
                            }
                            if (z12) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((pVar.getPosition() & 1) == 1) {
                            pVar.u(1);
                        }
                        pVar.c(0, 12, yVar.a);
                        yVar.N(0);
                        int o18 = yVar.o();
                        if (o18 == 1414744396) {
                            yVar.N(8);
                            pVar.u(yVar.o() == 1769369453 ? 12 : 8);
                            pVar.o();
                            return 0;
                        }
                        int o19 = yVar.o();
                        if (o18 == 1263424842) {
                            this.j = pVar.getPosition() + o19 + 8;
                            return 0;
                        }
                        pVar.u(8);
                        pVar.o();
                        for (e eVar6 : this.i) {
                            if (eVar6.c == o18 || eVar6.d == o18) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.j = pVar.getPosition() + o19;
                                    return 0;
                                }
                                eVar3.g = o19;
                                eVar3.h = o19;
                                this.k = eVar3;
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
                pVar.u((int) (j10 - position));
            }
        }
        z10 = false;
        this.j = -1L;
        if (!z10) {
        }
    }

    @Override // e3.o
    public final o a() {
        return this;
    }

    @Override // e3.o
    public final void release() {
    }
}
