package e3;

import a3.k;
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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements o {
    public final v a;
    public final k b;
    public final boolean c;
    public final rb.a d;
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

    public b(int i10, rb.a aVar) {
        this.d = aVar;
        this.c = (i10 & 1) == 0;
        this.a = new v(12);
        this.b = new k();
        this.f = new qb.b(5);
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        v vVar = this.a;
        pVar.b(0, 12, vVar.a);
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
    /* JADX WARN: Removed duplicated region for block: B:174:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        boolean z10;
        e eVar;
        int i10;
        int i11;
        int i12;
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
                int i13 = this.e;
                int i14 = 4;
                e eVar3 = null;
                k kVar = this.b;
                v vVar = this.a;
                switch (i13) {
                    case 0:
                        if (!b(pVar)) {
                            throw s0.a(null, "AVI Header List not found");
                        }
                        pVar.r(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        pVar.readFully(vVar.a, 0, 12);
                        vVar.J(0);
                        kVar.getClass();
                        kVar.a = vVar.l();
                        kVar.b = vVar.l();
                        kVar.c = 0;
                        if (kVar.a != 1414744396) {
                            throw s0.a(null, "LIST expected, found: " + kVar.a);
                        }
                        int l4 = vVar.l();
                        kVar.c = l4;
                        if (l4 == 1819436136) {
                            this.l = kVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw s0.a(null, "hdrl expected, found: " + kVar.c);
                    case 2:
                        int i15 = this.l - 4;
                        v vVar2 = new v(i15);
                        pVar.readFully(vVar2.a, 0, i15);
                        f b10 = f.b(1819436136, vVar2);
                        int i16 = b10.b;
                        if (i16 != 1819436136) {
                            throw s0.a(null, "Unexpected header list type " + i16);
                        }
                        c cVar = (c) b10.a(c.class);
                        if (cVar == null) {
                            throw s0.a(null, "AviHeader not found");
                        }
                        this.g = cVar;
                        this.h = cVar.c * cVar.a;
                        ArrayList arrayList = new ArrayList();
                        g0 listIterator = b10.a.listIterator(0);
                        int i17 = 0;
                        while (listIterator.hasNext()) {
                            a aVar = (a) listIterator.next();
                            if (aVar.getType() == 1819440243) {
                                f fVar = (f) aVar;
                                int i18 = i17 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    e2.a.n("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    e2.a.n("AviExtractor", "Missing Stream Format");
                                } else {
                                    long j10 = dVar.c;
                                    String str = d0.a;
                                    long Y = d0.Y(dVar.d, 1000000 * dVar.b, j10, RoundingMode.DOWN);
                                    b2.s sVar2 = gVar.a;
                                    r a2 = sVar2.a();
                                    a2.a = Integer.toString(i17);
                                    int i19 = dVar.e;
                                    if (i19 != 0) {
                                        a2.r = i19;
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a2.b = hVar.a;
                                    }
                                    int h = r0.h(sVar2.r);
                                    if (h == 1 || h == 2) {
                                        h0 R1 = this.f.R1(i17, h);
                                        i2.g.u(a2, R1);
                                        this.h = Math.max(this.h, Y);
                                        eVar = new e(i17, dVar, R1);
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i17 = i18;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i17 = i18;
                            }
                        }
                        this.i = (e[]) arrayList.toArray(new e[0]);
                        this.f.Z0();
                        this.e = 3;
                        return 0;
                    case 3:
                        if (this.m != -1) {
                            long position2 = pVar.getPosition();
                            i10 = 16;
                            long j11 = this.m;
                            if (position2 != j11) {
                                this.j = j11;
                                return 0;
                            }
                        } else {
                            i10 = 16;
                        }
                        pVar.b(0, 12, vVar.a);
                        pVar.q();
                        vVar.J(0);
                        kVar.getClass();
                        kVar.a = vVar.l();
                        kVar.b = vVar.l();
                        kVar.c = 0;
                        int l10 = vVar.l();
                        int i20 = kVar.a;
                        if (i20 == 1179011410) {
                            pVar.r(12);
                            return 0;
                        }
                        if (i20 != 1414744396 || l10 != 1769369453) {
                            this.j = pVar.getPosition() + kVar.b + 8;
                            return 0;
                        }
                        long position3 = pVar.getPosition();
                        this.m = position3;
                        this.n = position3 + kVar.b + 8;
                        if (!this.p) {
                            c cVar2 = this.g;
                            cVar2.getClass();
                            if ((cVar2.b & i10) == i10) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.P1(new t(this.h));
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
                            int i21 = vVar3.b;
                            vVar3.K(8);
                            long l13 = vVar3.l();
                            long j12 = this.m;
                            r20 = l13 <= j12 ? j12 + 8 : 0L;
                            vVar3.J(i21);
                        }
                        while (vVar3.a() >= 16) {
                            int l14 = vVar3.l();
                            int l15 = vVar3.l();
                            long l16 = vVar3.l() + r20;
                            vVar3.K(i14);
                            e[] eVarArr = this.i;
                            int length = eVarArr.length;
                            while (true) {
                                if (i12 < length) {
                                    eVar2 = eVarArr[i12];
                                    i12 = (eVar2.c == l14 || eVar2.d == l14) ? 0 : i12 + 1;
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
                                    int i22 = eVar2.k;
                                    jArr2[i22] = l16;
                                    eVar2.n[i22] = eVar2.j;
                                    eVar2.k = i22 + 1;
                                }
                                eVar2.j++;
                            }
                            i14 = 4;
                        }
                        for (e eVar4 : this.i) {
                            eVar4.m = Arrays.copyOf(eVar4.m, eVar4.k);
                            eVar4.n = Arrays.copyOf(eVar4.n, eVar4.k);
                            if ((eVar4.c & 1651965952) == 1651965952 && eVar4.a.f != 0 && (i11 = eVar4.k) > 0) {
                                eVar4.f = i11;
                            }
                        }
                        this.p = true;
                        if (this.i.length == 0) {
                            this.f.P1(new t(this.h));
                        } else {
                            this.f.P1(new t(this, this.h, 2));
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
                            int i23 = eVar5.h;
                            int a10 = i23 - eVar5.b.a(pVar, i23, false);
                            eVar5.h = a10;
                            boolean z12 = a10 == 0;
                            if (z12) {
                                if (eVar5.g > 0) {
                                    h0 h0Var = eVar5.b;
                                    int i24 = eVar5.i;
                                    h0Var.c((eVar5.e * i24) / eVar5.f, Arrays.binarySearch(eVar5.n, i24) >= 0 ? 1 : 0, eVar5.g, 0, null);
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
                        pVar.b(0, 12, vVar.a);
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
