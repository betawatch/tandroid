package o4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import d5.g0;
import h3.t0;
import h7.u6;
import j$.util.DesugarCollections;
import j4.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.b0;
import p8.l0;
import p8.x;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i {
    public final j a;
    public final com.google.android.exoplayer2.upstream.m b;
    public final com.google.android.exoplayer2.upstream.m c;
    public final n1.d d;
    public final Uri[] e;
    public final t0[] f;
    public final p4.c g;
    public final i1 h;
    public final List i;
    public final i3.k k;
    public boolean l;
    public j4.b n;
    public Uri o;
    public boolean p;
    public b5.s q;
    public boolean s;
    public final b0 j = new b0(3);
    public byte[] m = g0.f;
    public long r = -9223372036854775807L;

    public i(j jVar, p4.c cVar, Uri[] uriArr, t0[] t0VarArr, m5.o oVar, y0 y0Var, n1.d dVar, List list, i3.k kVar) {
        this.a = jVar;
        this.g = cVar;
        this.e = uriArr;
        this.f = t0VarArr;
        this.d = dVar;
        this.i = list;
        this.k = kVar;
        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) oVar.b).createDataSource();
        this.b = createDataSource;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        this.c = ((com.google.android.exoplayer2.upstream.l) oVar.b).createDataSource();
        this.h = new i1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((t0VarArr[i10].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        i1 i1Var = this.h;
        int[] e9 = u6.e(arrayList);
        g gVar = new g(i1Var, e9);
        gVar.g = gVar.a(i1Var.d[e9[0]]);
        this.q = gVar;
    }

    public final l4.l[] a(k kVar, long j10) {
        List list;
        i iVar = this;
        k kVar2 = kVar;
        int a2 = kVar2 == null ? -1 : iVar.h.a(kVar2.d);
        int length = iVar.q.length();
        l4.l[] lVarArr = new l4.l[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int j11 = iVar.q.j(i10);
            Uri uri = iVar.e[j11];
            p4.c cVar = iVar.g;
            if (cVar.c(uri)) {
                p4.j a3 = cVar.a(uri, z10);
                a3.getClass();
                long j12 = a3.h - cVar.y;
                Pair c10 = iVar.c(kVar2, j11 != a2, a3, j12, j10);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                long j13 = a3.k;
                z zVar = a3.s;
                z zVar2 = a3.r;
                int i11 = (int) (longValue - j13);
                if (i11 < 0 || zVar2.size() < i11) {
                    x xVar = z.b;
                    list = l0.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < zVar2.size()) {
                        if (intValue != -1) {
                            p4.g gVar = (p4.g) zVar2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(gVar);
                            } else if (intValue < gVar.x.size()) {
                                z zVar3 = gVar.x;
                                arrayList.addAll(zVar3.subList(intValue, zVar3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(zVar2.subList(i11, zVar2.size()));
                        intValue = 0;
                    }
                    if (a3.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < zVar.size()) {
                            arrayList.addAll(zVar.subList(intValue, zVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                lVarArr[i10] = new f(j12, list);
            } else {
                lVarArr[i10] = l4.l.o;
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        int i10 = kVar.A;
        if (i10 == -1) {
            return 1;
        }
        p4.j a2 = this.g.a(this.e[this.h.a(kVar.d)], false);
        a2.getClass();
        z zVar = a2.r;
        int i11 = (int) (kVar.s - a2.k);
        if (i11 < 0) {
            return 1;
        }
        z zVar2 = i11 < zVar.size() ? ((p4.g) zVar.get(i11)).x : a2.s;
        if (i10 >= zVar2.size()) {
            return 2;
        }
        p4.e eVar = (p4.e) zVar2.get(i10);
        if (eVar.x) {
            return 0;
        }
        return g0.a(Uri.parse(d5.a.G(a2.a, eVar.a)), kVar.b.a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z10, p4.j jVar, long j10, long j11) {
        boolean z11 = true;
        if (kVar != null) {
            long j12 = kVar.s;
            int i10 = kVar.A;
            if (!z10) {
                if (!kVar.T) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    j12 = kVar.b();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j13 = jVar.u;
        z zVar = jVar.s;
        long j14 = jVar.k;
        z zVar2 = jVar.r;
        long j15 = j13 + j10;
        if (kVar != null && !this.p) {
            j11 = kVar.h;
        }
        if (!jVar.o && j11 >= j15) {
            return new Pair(Long.valueOf(j14 + zVar2.size()), -1);
        }
        long j16 = j11 - j10;
        Long valueOf = Long.valueOf(j16);
        int i11 = 0;
        if (this.g.x && kVar != null) {
            z11 = false;
        }
        int c10 = g0.c(zVar2, valueOf, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p4.g gVar = (p4.g) zVar2.get(c10);
            z zVar3 = j16 < gVar.e + gVar.c ? gVar.x : zVar;
            while (true) {
                if (i11 >= zVar3.size()) {
                    break;
                }
                p4.e eVar = (p4.e) zVar3.get(i11);
                if (j16 >= eVar.e + eVar.c) {
                    i11++;
                } else if (eVar.w) {
                    j17 += zVar3 == zVar ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        b0 b0Var = this.j;
        byte[] bArr = (byte[]) ((d) b0Var.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f[i10];
        int p6 = this.q.p();
        Object r10 = this.q.r();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, qVar, 3, t0Var, p6, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = g0.f;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
