package o2;

import android.net.Uri;
import android.util.Pair;
import b2.l1;
import e2.d0;
import e9.a1;
import e9.i0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ji.u4;
import k2.g0;
import v7.x7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final g2.h b;
    public final g2.h c;
    public final g0 d;
    public final Uri[] e;
    public final b2.s[] f;
    public final p2.c g;
    public final l1 h;
    public final List i;
    public final j2.k k;
    public boolean l;
    public u2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public x2.r r;
    public final l.d j = new l.d();
    public byte[] m = d0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, p2.c cVar2, Uri[] uriArr, b2.s[] sVarArr, u4 u4Var, c0 c0Var, g0 g0Var, List list, j2.k kVar) {
        this.a = cVar;
        this.g = cVar2;
        this.e = uriArr;
        this.f = sVarArr;
        this.d = g0Var;
        this.i = list;
        this.k = kVar;
        g2.h createDataSource = ((g2.g) u4Var.b).createDataSource();
        this.b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.c = ((g2.g) u4Var.b).createDataSource();
        this.h = new l1("", sVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((sVarArr[i10].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        l1 l1Var = this.h;
        int[] f7 = x7.f(arrayList);
        g gVar = new g(l1Var, f7);
        gVar.g = gVar.s(l1Var.d[f7[0]]);
        this.r = gVar;
    }

    public static h d(p2.l lVar, long j3, int i10) {
        long j10 = lVar.k;
        i0 i0Var = lVar.s;
        int i11 = (int) (j3 - j10);
        i0 i0Var2 = lVar.r;
        if (i11 == i0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < i0Var.size()) {
                return new h((p2.j) i0Var.get(i10), j3, i10);
            }
            return null;
        }
        p2.i iVar = (p2.i) i0Var2.get(i11);
        if (i10 == -1) {
            return new h(iVar, j3, -1);
        }
        if (i10 < iVar.x.size()) {
            return new h((p2.j) iVar.x.get(i10), j3, i10);
        }
        int i12 = i11 + 1;
        if (i12 < i0Var2.size()) {
            return new h((p2.j) i0Var2.get(i12), j3 + 1, -1);
        }
        if (i0Var.isEmpty()) {
            return null;
        }
        return new h((p2.j) i0Var.get(0), j3 + 1, 0);
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
            p2.c cVar = iVar.g;
            if (cVar.c(uri)) {
                p2.l a10 = cVar.a(uri, z10);
                a10.getClass();
                long j10 = a10.h - cVar.y;
                Pair c10 = iVar.c(jVar2, h != a2, a10, j10, j3);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j11 = a10.k;
                i0 i0Var = a10.s;
                i0 i0Var2 = a10.r;
                int i11 = (int) (longValue - j11);
                if (i11 < 0 || i0Var2.size() < i11) {
                    e9.g0 g0Var = i0.b;
                    list = a1.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            p2.i iVar2 = (p2.i) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(iVar2);
                            } else if (intValue < iVar2.x.size()) {
                                i0 i0Var3 = iVar2.x;
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
        p2.l a2 = this.g.a(this.e[this.h.a(jVar.d)], false);
        a2.getClass();
        i0 i0Var = a2.r;
        int i11 = (int) (jVar.s - a2.k);
        if (i11 < 0) {
            return 1;
        }
        i0 i0Var2 = i11 < i0Var.size() ? ((p2.i) i0Var.get(i11)).x : a2.s;
        if (i10 >= i0Var2.size()) {
            return 2;
        }
        p2.g gVar = (p2.g) i0Var2.get(i10);
        if (gVar.x) {
            return 0;
        }
        return Objects.equals(Uri.parse(e2.a.l(a2.a, gVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final Pair c(j jVar, boolean z10, p2.l lVar, long j3, long j10) {
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
        long j12 = lVar.u;
        i0 i0Var = lVar.s;
        long j13 = lVar.k;
        i0 i0Var2 = lVar.r;
        long j14 = j12 + j3;
        if (jVar != null && !this.q) {
            j10 = jVar.h;
        }
        if (!lVar.o && j10 >= j14) {
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
            p2.i iVar = (p2.i) i0Var2.get(c10);
            i0 i0Var3 = j15 < iVar.e + iVar.c ? iVar.x : i0Var;
            while (true) {
                if (i11 >= i0Var3.size()) {
                    break;
                }
                p2.g gVar = (p2.g) i0Var3.get(i11);
                if (j15 >= gVar.e + gVar.c) {
                    i11++;
                } else if (gVar.w) {
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
        l.d dVar = this.j;
        byte[] bArr = (byte[]) ((d) dVar.b).remove(uri);
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
