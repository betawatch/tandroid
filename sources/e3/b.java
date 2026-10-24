package e3;

import a3.l;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.q;
import c3.r;
import c3.s;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t7.u;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b implements q {
    public final x a;
    public final l b;
    public final boolean c;
    public final u d;
    public int e;
    public s f;
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

    public b(int i10, u uVar) {
        this.d = uVar;
        this.c = (i10 & 1) == 0;
        this.a = new x(12);
        this.b = new l();
        this.f = new pb.a(4);
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // c3.q
    public final boolean a(r rVar) {
        x xVar = this.a;
        rVar.a(0, 12, xVar.a);
        xVar.N(0);
        if (xVar.o() != 1179011410) {
            return false;
        }
        xVar.O(4);
        return xVar.o() == 541677121;
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.e = 0;
        if (this.c) {
            sVar = new c2.b(sVar, this.d);
        }
        this.f = sVar;
        this.j = -1L;
    }

    @Override // c3.q
    public final void d(long j10, long j11) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            if (eVar.k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.n[m0.f(eVar.m, j10, true)];
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

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    @Override // c3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(r rVar, c3.u uVar) {
        boolean z10;
        e eVar;
        int i10;
        int i11;
        e eVar2;
        if (this.j != -1) {
            long position = rVar.getPosition();
            long j10 = this.j;
            if (j10 < position || j10 > 262144 + position) {
                uVar.a = j10;
                z10 = true;
                this.j = -1L;
                if (!z10) {
                    return 1;
                }
                int i12 = this.e;
                int i13 = 4;
                e eVar3 = null;
                l lVar = this.b;
                x xVar = this.a;
                switch (i12) {
                    case 0:
                        if (!a(rVar)) {
                            throw w0.a(null, "AVI Header List not found");
                        }
                        rVar.r(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        rVar.readFully(xVar.a, 0, 12);
                        xVar.N(0);
                        lVar.getClass();
                        lVar.a = xVar.o();
                        lVar.b = xVar.o();
                        lVar.c = 0;
                        if (lVar.a != 1414744396) {
                            throw w0.a(null, "LIST expected, found: " + lVar.a);
                        }
                        int o10 = xVar.o();
                        lVar.c = o10;
                        if (o10 == 1819436136) {
                            this.l = lVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw w0.a(null, "hdrl expected, found: " + lVar.c);
                    case 2:
                        int i14 = this.l - 4;
                        x xVar2 = new x(i14);
                        rVar.readFully(xVar2.a, 0, i14);
                        f b10 = f.b(1819436136, xVar2);
                        int i15 = b10.b;
                        if (i15 != 1819436136) {
                            throw w0.a(null, "Unexpected header list type " + i15);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw w0.a(null, "AviHeader not found");
                        }
                        this.g = cVar;
                        this.h = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        l0 listIterator = b10.a.listIterator(0);
                        int i16 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i17 = i16 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    e2.a.l("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    e2.a.l("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j11 = dVar.c;
                                    String str = m0.a;
                                    long a02 = m0.a0(dVar.d, 1000000 * dVar.b, j11, RoundingMode.DOWN);
                                    w wVar = gVar.a;
                                    v a2 = wVar.a();
                                    a2.a = Integer.toString(i16);
                                    int i18 = dVar.e;
                                    if (i18 != 0) {
                                        a2.s = i18;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int h = v0.h(wVar.s);
                                    if (h == 1 || h == 2) {
                                        c3.l0 j02 = this.f.j0(i16, h);
                                        j02.b(new w(a2));
                                        j02.e(a02);
                                        this.h = Math.max(this.h, a02);
                                        eVar = new e(i16, dVar, j02);
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i16 = i17;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i16 = i17;
                            }
                        }
                        this.i = (e[]) arrayList.toArray(new e[0]);
                        this.f.C();
                        this.e = 3;
                        return 0;
                    case 3:
                        if (this.m != -1) {
                            long position2 = rVar.getPosition();
                            long j12 = this.m;
                            if (position2 != j12) {
                                this.j = j12;
                                return 0;
                            }
                        }
                        rVar.a(0, 12, xVar.a);
                        rVar.q();
                        xVar.N(0);
                        lVar.getClass();
                        lVar.a = xVar.o();
                        lVar.b = xVar.o();
                        lVar.c = 0;
                        int o11 = xVar.o();
                        int i19 = lVar.a;
                        if (i19 == 1179011410) {
                            rVar.r(12);
                            return 0;
                        }
                        if (i19 != 1414744396 || o11 != 1769369453) {
                            this.j = rVar.getPosition() + lVar.b + 8;
                            return 0;
                        }
                        long position3 = rVar.getPosition();
                        this.m = position3;
                        this.n = position3 + lVar.b + 8;
                        if (!this.p) {
                            c cVar2 = this.g;
                            cVar2.getClass();
                            if ((cVar2.b & 16) == 16) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.g0(new c3.v(this.h));
                            this.p = true;
                        }
                        this.j = rVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        rVar.readFully(xVar.a, 0, 8);
                        xVar.N(0);
                        int o12 = xVar.o();
                        int o13 = xVar.o();
                        if (o12 != 829973609) {
                            this.j = rVar.getPosition() + o13;
                            return 0;
                        }
                        this.e = 5;
                        this.o = o13;
                        return 0;
                    case 5:
                        x xVar3 = new x(this.o);
                        rVar.readFully(xVar3.a, 0, this.o);
                        if (xVar3.a() >= 16) {
                            int i20 = xVar3.b;
                            xVar3.O(8);
                            long o14 = xVar3.o();
                            long j13 = this.m;
                            r20 = o14 <= j13 ? j13 + 8 : 0L;
                            xVar3.N(i20);
                        }
                        while (xVar3.a() >= 16) {
                            int o15 = xVar3.o();
                            int o16 = xVar3.o();
                            long o17 = xVar3.o() + r20;
                            xVar3.O(i13);
                            e[] eVarArr = this.i;
                            int length = eVarArr.length;
                            while (true) {
                                if (i11 < length) {
                                    eVar2 = eVarArr[i11];
                                    i11 = (eVar2.c == o15 || eVar2.d == o15) ? 0 : i11 + 1;
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
                                    int i21 = eVar2.k;
                                    jArr2[i21] = o17;
                                    eVar2.n[i21] = eVar2.j;
                                    eVar2.k = i21 + 1;
                                }
                                eVar2.j++;
                            }
                            i13 = 4;
                        }
                        for (e eVar4 : this.i) {
                            eVar4.m = Arrays.copyOf(eVar4.m, eVar4.k);
                            eVar4.n = Arrays.copyOf(eVar4.n, eVar4.k);
                            if ((eVar4.c & 1651965952) == 1651965952 && eVar4.a.f != 0 && (i10 = eVar4.k) > 0) {
                                eVar4.f = i10;
                            }
                        }
                        this.p = true;
                        if (this.i.length == 0) {
                            this.f.g0(new c3.v(this.h));
                        } else {
                            this.f.g0(new c3.v(this, this.h, 2));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (rVar.getPosition() >= this.n) {
                            return -1;
                        }
                        e eVar5 = this.k;
                        if (eVar5 != null) {
                            int i22 = eVar5.h;
                            int a10 = i22 - eVar5.b.a(rVar, i22, false);
                            eVar5.h = a10;
                            boolean z12 = a10 == 0;
                            if (z12) {
                                if (eVar5.g > 0) {
                                    c3.l0 l0Var = eVar5.b;
                                    int i23 = eVar5.i;
                                    l0Var.c((eVar5.e * i23) / eVar5.f, Arrays.binarySearch(eVar5.n, i23) >= 0 ? 1 : 0, eVar5.g, 0, null);
                                }
                                eVar5.i++;
                            }
                            if (z12) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((rVar.getPosition() & 1) == 1) {
                            rVar.r(1);
                        }
                        rVar.a(0, 12, xVar.a);
                        xVar.N(0);
                        int o18 = xVar.o();
                        if (o18 == 1414744396) {
                            xVar.N(8);
                            rVar.r(xVar.o() == 1769369453 ? 12 : 8);
                            rVar.q();
                            return 0;
                        }
                        int o19 = xVar.o();
                        if (o18 == 1263424842) {
                            this.j = rVar.getPosition() + o19 + 8;
                            return 0;
                        }
                        rVar.r(8);
                        rVar.q();
                        for (e eVar6 : this.i) {
                            if (eVar6.c == o18 || eVar6.d == o18) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.j = rVar.getPosition() + o19;
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
                rVar.r((int) (j10 - position));
            }
        }
        z10 = false;
        this.j = -1L;
        if (!z10) {
        }
    }

    @Override // c3.q
    public final q b() {
        return this;
    }

    @Override // c3.q
    public final void release() {
    }
}
