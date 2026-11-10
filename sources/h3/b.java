package h3;

import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.s;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b implements o {
    public final x a;
    public final b7.d b;
    public final boolean c;
    public final s d;
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

    public b(int i7, s sVar) {
        this.d = sVar;
        this.c = (i7 & 1) == 0;
        this.a = new x(12);
        this.b = new b7.d();
        this.f = new qb.a(8);
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        x xVar = this.a;
        pVar.b(0, 12, xVar.a);
        xVar.N(0);
        if (xVar.o() != 1179011410) {
            return false;
        }
        xVar.O(4);
        return xVar.o() == 541677121;
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.e = 0;
        if (this.c) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f = qVar;
        this.j = -1L;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            if (eVar.k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.n[m0.f(eVar.m, j3, true)];
            }
        }
        if (j3 != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, f3.s sVar) {
        boolean z9;
        e eVar;
        int i7;
        int i10;
        e eVar2;
        if (this.j != -1) {
            long position = pVar.getPosition();
            long j3 = this.j;
            if (j3 < position || j3 > 262144 + position) {
                sVar.a = j3;
                z9 = true;
                this.j = -1L;
                if (!z9) {
                    return 1;
                }
                int i11 = this.e;
                int i12 = 4;
                e eVar3 = null;
                b7.d dVar = this.b;
                x xVar = this.a;
                switch (i11) {
                    case 0:
                        if (!b(pVar)) {
                            throw t0.a(null, "AVI Header List not found");
                        }
                        pVar.s(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        pVar.readFully(xVar.a, 0, 12);
                        xVar.N(0);
                        dVar.getClass();
                        dVar.a = xVar.o();
                        dVar.b = xVar.o();
                        dVar.c = 0;
                        if (dVar.a != 1414744396) {
                            throw t0.a(null, "LIST expected, found: " + dVar.a);
                        }
                        int o4 = xVar.o();
                        dVar.c = o4;
                        if (o4 == 1819436136) {
                            this.l = dVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw t0.a(null, "hdrl expected, found: " + dVar.c);
                    case 2:
                        int i13 = this.l - 4;
                        x xVar2 = new x(i13);
                        pVar.readFully(xVar2.a, 0, i13);
                        f b10 = f.b(1819436136, xVar2);
                        int i14 = b10.b;
                        if (i14 != 1819436136) {
                            throw t0.a(null, "Unexpected header list type " + i14);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw t0.a(null, "AviHeader not found");
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
                                    h2.a.l("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    h2.a.l("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j10 = dVar2.c;
                                    String str = m0.a;
                                    long a02 = m0.a0(dVar2.d, 1000000 * dVar2.b, j10, RoundingMode.DOWN);
                                    u uVar = gVar.a;
                                    t a10 = uVar.a();
                                    a10.a = Integer.toString(i15);
                                    int i17 = dVar2.e;
                                    if (i17 != 0) {
                                        a10.s = i17;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a10.b = hVar.a;
                                    }
                                    int h = s0.h(uVar.s);
                                    if (h == 1 || h == 2) {
                                        j0 O1 = this.f.O1(i15, h);
                                        O1.g(new u(a10));
                                        O1.d(a02);
                                        this.h = Math.max(this.h, a02);
                                        eVar = new e(i15, dVar2, O1);
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
                        this.f.U0();
                        this.e = 3;
                        return 0;
                    case 3:
                        if (this.m != -1) {
                            long position2 = pVar.getPosition();
                            long j11 = this.m;
                            if (position2 != j11) {
                                this.j = j11;
                                return 0;
                            }
                        }
                        pVar.b(0, 12, xVar.a);
                        pVar.q();
                        xVar.N(0);
                        dVar.getClass();
                        dVar.a = xVar.o();
                        dVar.b = xVar.o();
                        dVar.c = 0;
                        int o10 = xVar.o();
                        int i18 = dVar.a;
                        if (i18 == 1179011410) {
                            pVar.s(12);
                            return 0;
                        }
                        if (i18 != 1414744396 || o10 != 1769369453) {
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
                            this.f.f(new f3.t(this.h));
                            this.p = true;
                        }
                        this.j = pVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        pVar.readFully(xVar.a, 0, 8);
                        xVar.N(0);
                        int o11 = xVar.o();
                        int o12 = xVar.o();
                        if (o11 != 829973609) {
                            this.j = pVar.getPosition() + o12;
                            return 0;
                        }
                        this.e = 5;
                        this.o = o12;
                        return 0;
                    case 5:
                        x xVar3 = new x(this.o);
                        pVar.readFully(xVar3.a, 0, this.o);
                        if (xVar3.a() >= 16) {
                            int i19 = xVar3.b;
                            xVar3.O(8);
                            long o13 = xVar3.o();
                            long j12 = this.m;
                            r20 = o13 <= j12 ? j12 + 8 : 0L;
                            xVar3.N(i19);
                        }
                        while (xVar3.a() >= 16) {
                            int o14 = xVar3.o();
                            int o15 = xVar3.o();
                            long o16 = xVar3.o() + r20;
                            xVar3.O(i12);
                            e[] eVarArr = this.i;
                            int length = eVarArr.length;
                            while (true) {
                                if (i10 < length) {
                                    eVar2 = eVarArr[i10];
                                    i10 = (eVar2.c == o14 || eVar2.d == o14) ? 0 : i10 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                boolean z10 = (o15 & 16) == 16;
                                if (eVar2.l == -1) {
                                    eVar2.l = o16;
                                }
                                if (z10) {
                                    if (eVar2.k == eVar2.n.length) {
                                        long[] jArr = eVar2.m;
                                        eVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = eVar2.n;
                                        eVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = eVar2.m;
                                    int i20 = eVar2.k;
                                    jArr2[i20] = o16;
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
                            if ((eVar4.c & 1651965952) == 1651965952 && eVar4.a.f != 0 && (i7 = eVar4.k) > 0) {
                                eVar4.f = i7;
                            }
                        }
                        this.p = true;
                        if (this.i.length == 0) {
                            this.f.f(new f3.t(this.h));
                        } else {
                            this.f.f(new f3.t(this, this.h, 2));
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
                            int e10 = i21 - eVar5.b.e(pVar, i21, false);
                            eVar5.h = e10;
                            boolean z11 = e10 == 0;
                            if (z11) {
                                if (eVar5.g > 0) {
                                    j0 j0Var = eVar5.b;
                                    int i22 = eVar5.i;
                                    j0Var.c((eVar5.e * i22) / eVar5.f, Arrays.binarySearch(eVar5.n, i22) >= 0 ? 1 : 0, eVar5.g, 0, null);
                                }
                                eVar5.i++;
                            }
                            if (z11) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((pVar.getPosition() & 1) == 1) {
                            pVar.s(1);
                        }
                        pVar.b(0, 12, xVar.a);
                        xVar.N(0);
                        int o17 = xVar.o();
                        if (o17 == 1414744396) {
                            xVar.N(8);
                            pVar.s(xVar.o() == 1769369453 ? 12 : 8);
                            pVar.q();
                            return 0;
                        }
                        int o18 = xVar.o();
                        if (o17 == 1263424842) {
                            this.j = pVar.getPosition() + o18 + 8;
                            return 0;
                        }
                        pVar.s(8);
                        pVar.q();
                        for (e eVar6 : this.i) {
                            if (eVar6.c == o17 || eVar6.d == o17) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.j = pVar.getPosition() + o18;
                                    return 0;
                                }
                                eVar3.g = o18;
                                eVar3.h = o18;
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
                pVar.s((int) (j3 - position));
            }
        }
        z9 = false;
        this.j = -1L;
        if (!z9) {
        }
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
