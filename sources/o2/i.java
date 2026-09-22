package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.c0;
import k2.u;
import v7.y7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final g2.h b;
    public final g2.h c;
    public final mi.a d;
    public final Uri[] e;
    public final b2.s[] f;
    public final p2.d g;
    public final l1 h;
    public final List i;
    public final j2.k k;
    public boolean l;
    public u2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public x2.r r;
    public final c0 j = new c0();
    public byte[] m = d0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, Uri[] uriArr, b2.s[] sVarArr, u uVar, g2.c0 c0Var, mi.a aVar, List list, j2.k kVar) {
        this.a = cVar;
        this.g = dVar;
        this.e = uriArr;
        this.f = sVarArr;
        this.d = aVar;
        this.i = list;
        this.k = kVar;
        g2.h createDataSource = ((g2.g) uVar.b).createDataSource();
        this.b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.c = ((g2.g) uVar.b).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = y7.f(arrayList);
        g gVar = new g(l1Var, f7);
        gVar.g = gVar.s(l1Var.d[f7[0]]);
        this.r = gVar;
    }

    public static h d(p2.m mVar, long j3, int i10) {
        long j10 = mVar.k;
        i0 i0Var = mVar.s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = mVar.r;
        if (i11 == i0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < i0Var.size()) {
                return new h((p2.k) i0Var.get(i10), j3, i10);
            }
            return null;
        }
        p2.j jVar = (p2.j) i0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j3, -1);
        }
        if (i10 < jVar.x.size()) {
            return new h((p2.k) jVar.x.get(i10), j3, i10);
        }
        int i12 = i11 + 1;
        if (i12 < i0Var2.size()) {
            return new h((p2.k) i0Var2.get(i12), j3 + 1, -1);
        }
        if (i0Var.isEmpty()) {
            return null;
        }
        return new h((p2.k) i0Var.get(0), j3 + 1, 0);
    }

    public final v2.l[] a(j jVar, long j3) {
        List list;
        i iVar = this;
        j jVar2 = jVar;
        int a2 = jVar2 == null ? -1 : iVar.h.a(jVar2.d);
        int length = iVar.r.length();
        v2.l[] lVarArr = new v2.l[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.r.h(i10);
            Uri uri = iVar.e[h];
            p2.d dVar = iVar.g;
            if (dVar.c(uri)) {
                p2.m a10 = dVar.a(uri, z10);
                a10.getClass();
                long j10 = a10.h - dVar.y;
                Pair c10 = iVar.c(jVar2, h != a2, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.k;
                i0 i0Var = a10.s;
                i0 i0Var2 = a10.r;
                int i11 = (int) (longValue - j11);
                if (i11 < 0 || i0Var2.size() < i11) {
                    g0 g0Var = i0.b;
                    list = a1.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.x.size()) {
                                i0 i0Var3 = jVar3.x;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (a10.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                lVarArr[i10] = new f(j10, list);
            } else {
                lVarArr[i10] = v2.l.B;
            }
            i10++;
            iVar = this;
            jVar2 = jVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(j jVar) {
        int i10 = jVar.E;
        if (i10 == -1) {
            return 1;
        }
        p2.m a2 = this.g.a(this.e[this.h.a(jVar.d)], false);
        a2.getClass();
        i0 i0Var = a2.r;
        int i11 = (int) (jVar.s - a2.k);
        if (i11 < 0) {
            return 1;
        }
        i0 i0Var2 = i11 < i0Var.size() ? ((p2.j) i0Var.get(i11)).x : a2.s;
        if (i10 >= i0Var2.size()) {
            return 2;
        }
        p2.h hVar = (p2.h) i0Var2.get(i10);
        if (hVar.x) {
            return 0;
        }
        return Objects.equals(Uri.parse(e2.a.l(a2.a, hVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z10, p2.m mVar, long j3, long j10) {
        boolean z11 = true;
        if (jVar != null) {
            long j11 = jVar.s;
            int i10 = jVar.E;
            if (!z10) {
                if (!jVar.X) {
                    return new Pair(Long.valueOf(j11), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j11 = jVar.b();
                }
                return new Pair(Long.valueOf(j11), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j12 = mVar.u;
        i0 i0Var = mVar.s;
        long j13 = mVar.k;
        i0 i0Var2 = mVar.r;
        long j14 = j12 + j3;
        if (jVar != null && !this.q) {
            j10 = jVar.h;
        }
        if (!mVar.o && j10 >= j14) {
            return new Pair(Long.valueOf(j13 + i0Var2.size()), -1);
        }
        long j15 = j10 - j3;
        Long valueOf = Long.valueOf(j15);
        int i11 = 0;
        if (this.g.x && jVar != null) {
            z11 = false;
        }
        int c10 = d0.c(i0Var2, valueOf, z11);
        long j16 = c10 + j13;
        if (c10 >= 0) {
            p2.j jVar2 = (p2.j) i0Var2.get(c10);
            i0 i0Var3 = j15 < jVar2.e + jVar2.c ? jVar2.x : i0Var;
            while (true) {
                if (i11 >= i0Var3.size()) {
                    break;
                }
                p2.h hVar = (p2.h) i0Var3.get(i11);
                if (j15 >= hVar.e + hVar.c) {
                    i11++;
                } else if (hVar.w) {
                    j16 += i0Var3 == i0Var ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j16), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e e(int i10, Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        c0 c0Var = this.j;
        byte[] bArr = (byte[]) ((d) c0Var.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        b2.s sVar = this.f[i10];
        int n10 = this.r.n();
        Object q6 = this.r.q();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, mVar, 3, sVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = d0.b;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
