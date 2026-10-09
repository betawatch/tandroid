package e3;

import a3.l;
import b2.r;
import b2.r0;
import b2.s0;
import c3.h0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b implements o {
    public final v a;
    public final l b;
    public final boolean c;
    public final ob.a d;
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

    public b(int i10, ob.a aVar) {
        this.d = aVar;
        this.c = (i10 & 1) == 0;
        this.a = new v(12);
        this.b = new l();
        this.f = new ob.a(5);
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        v vVar = this.a;
        pVar.a(0, 12, vVar.a);
        vVar.J(0);
        if (vVar.l() == 1179011410) {
            vVar.K(4);
            if (vVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.e = 0;
        if (this.c) {
            qVar = new m(qVar, this.d);
        }
        this.f = qVar;
        this.j = -1L;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            if (eVar.k == 0) {
                eVar.i = 0;
            } else {
                eVar.i = eVar.n[d0.e(eVar.m, j3, true)];
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

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        boolean z10;
        e eVar;
        int i10;
        int i11;
        e eVar2;
        if (this.j != -1) {
            long position = pVar.getPosition();
            long j3 = this.j;
            if (j3 < position || j3 > 262144 + position) {
                sVar.a = j3;
                z10 = true;
                this.j = -1L;
                if (!z10) {
                    return 1;
                }
                int i12 = this.e;
                int i13 = 4;
                e eVar3 = null;
                l lVar = this.b;
                v vVar = this.a;
                switch (i12) {
                    case 0:
                        if (!a(pVar)) {
                            throw s0.a(null, "AVI Header List not found");
                        }
                        pVar.r(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        pVar.readFully(vVar.a, 0, 12);
                        vVar.J(0);
                        lVar.getClass();
                        lVar.a = vVar.l();
                        lVar.b = vVar.l();
                        lVar.c = 0;
                        if (lVar.a != 1414744396) {
                            throw s0.a(null, "LIST expected, found: " + lVar.a);
                        }
                        int l4 = vVar.l();
                        lVar.c = l4;
                        if (l4 == 1819436136) {
                            this.l = lVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw s0.a(null, "hdrl expected, found: " + lVar.c);
                    case 2:
                        int i14 = this.l - 4;
                        v vVar2 = new v(i14);
                        pVar.readFully(vVar2.a, 0, i14);
                        f b10 = f.b(1819436136, vVar2);
                        int i15 = b10.b;
                        if (i15 != 1819436136) {
                            throw s0.a(null, "Unexpected header list type " + i15);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw s0.a(null, "AviHeader not found");
                        }
                        this.g = cVar;
                        this.h = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        g0 listIterator = b10.a.listIterator(0);
                        int i16 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i17 = i16 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    e2.a.n("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    e2.a.n("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j10 = dVar.c;
                                    String str = d0.a;
                                    long X = d0.X(dVar.d, 1000000 * dVar.b, j10, RoundingMode.DOWN);
                                    b2.s sVar2 = gVar.a;
                                    r a2 = sVar2.a();
                                    a2.a = Integer.toString(i16);
                                    int i18 = dVar.e;
                                    if (i18 != 0) {
                                        a2.r = i18;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int h = r0.h(sVar2.r);
                                    if (h == 1 || h == 2) {
                                        h0 f22 = this.f.f2(i16, h);
                                        hg.c.s(a2, f22);
                                        this.h = Math.max(this.h, X);
                                        eVar = new e(i16, dVar, f22);
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
                        this.f.k1();
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
                        pVar.a(0, 12, vVar.a);
                        pVar.q();
                        vVar.J(0);
                        lVar.getClass();
                        lVar.a = vVar.l();
                        lVar.b = vVar.l();
                        lVar.c = 0;
                        int l10 = vVar.l();
                        int i19 = lVar.a;
                        if (i19 == 1179011410) {
                            pVar.r(12);
                            return 0;
                        }
                        if (i19 != 1414744396 || l10 != 1769369453) {
                            this.j = pVar.getPosition() + lVar.b + 8;
                            return 0;
                        }
                        long position3 = pVar.getPosition();
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
                            this.f.d2(new t(this.h));
                            this.p = true;
                        }
                        this.j = pVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        pVar.readFully(vVar.a, 0, 8);
                        vVar.J(0);
                        int l11 = vVar.l();
                        int l12 = vVar.l();
                        if (l11 != 829973609) {
                            this.j = pVar.getPosition() + l12;
                            return 0;
                        }
                        this.e = 5;
                        this.o = l12;
                        return 0;
                    case 5:
                        v vVar3 = new v(this.o);
                        pVar.readFully(vVar3.a, 0, this.o);
                        if (vVar3.a() >= 16) {
                            int i20 = vVar3.b;
                            vVar3.K(8);
                            long l13 = vVar3.l();
                            long j12 = this.m;
                            r20 = l13 <= j12 ? j12 + 8 : 0L;
                            vVar3.J(i20);
                        }
                        while (vVar3.a() >= 16) {
                            int l14 = vVar3.l();
                            int l15 = vVar3.l();
                            long l16 = vVar3.l() + r20;
                            vVar3.K(i13);
                            e[] eVarArr = this.i;
                            int length = eVarArr.length;
                            while (true) {
                                if (i11 < length) {
                                    eVar2 = eVarArr[i11];
                                    i11 = (eVar2.c == l14 || eVar2.d == l14) ? 0 : i11 + 1;
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                boolean z11 = (l15 & 16) == 16;
                                if (eVar2.l == -1) {
                                    eVar2.l = l16;
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
                                    jArr2[i21] = l16;
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
                            this.f.d2(new t(this.h));
                        } else {
                            this.f.d2(new t(this, this.h, 2));
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
                            int i22 = eVar5.h;
                            int a10 = i22 - eVar5.b.a(pVar, i22, false);
                            eVar5.h = a10;
                            boolean z12 = a10 == 0;
                            if (z12) {
                                if (eVar5.g > 0) {
                                    h0 h0Var = eVar5.b;
                                    int i23 = eVar5.i;
                                    h0Var.c((eVar5.e * i23) / eVar5.f, Arrays.binarySearch(eVar5.n, i23) >= 0 ? 1 : 0, eVar5.g, 0, null);
                                }
                                eVar5.i++;
                            }
                            if (z12) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((pVar.getPosition() & 1) == 1) {
                            pVar.r(1);
                        }
                        pVar.a(0, 12, vVar.a);
                        vVar.J(0);
                        int l17 = vVar.l();
                        if (l17 == 1414744396) {
                            vVar.J(8);
                            pVar.r(vVar.l() == 1769369453 ? 12 : 8);
                            pVar.q();
                            return 0;
                        }
                        int l18 = vVar.l();
                        if (l17 == 1263424842) {
                            this.j = pVar.getPosition() + l18 + 8;
                            return 0;
                        }
                        pVar.r(8);
                        pVar.q();
                        for (e eVar6 : this.i) {
                            if (eVar6.c == l17 || eVar6.d == l17) {
                                eVar3 = eVar6;
                                if (eVar3 != null) {
                                    this.j = pVar.getPosition() + l18;
                                    return 0;
                                }
                                eVar3.g = l18;
                                eVar3.h = l18;
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
                pVar.r((int) (j3 - position));
            }
        }
        z10 = false;
        this.j = -1L;
        if (!z10) {
        }
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
