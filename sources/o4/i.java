package o4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import d5.f0;
import g7.r6;
import h3.t0;
import j$.util.DesugarCollections;
import j4.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.c0;
import n5.e0;
import o8.l0;
import o8.x;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i {
    public final j a;
    public final com.google.android.exoplayer2.upstream.m b;
    public final com.google.android.exoplayer2.upstream.m c;
    public final c0 d;
    public final Uri[] e;
    public final t0[] f;
    public final p4.c g;
    public final i1 h;
    public final List i;
    public final i3.l k;
    public boolean l;
    public j4.b n;
    public Uri o;
    public boolean p;
    public b5.t q;
    public boolean s;
    public final n2.p j = new n2.p(4);
    public byte[] m = f0.f;
    public long r = -9223372036854775807L;

    public i(j jVar, p4.c cVar, Uri[] uriArr, t0[] t0VarArr, e0 e0Var, y0 y0Var, c0 c0Var, List list, i3.l lVar) {
        this.a = jVar;
        this.g = cVar;
        this.e = uriArr;
        this.f = t0VarArr;
        this.d = c0Var;
        this.i = list;
        this.k = lVar;
        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) e0Var.b).createDataSource();
        this.b = createDataSource;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        this.c = ((com.google.android.exoplayer2.upstream.l) e0Var.b).createDataSource();
        this.h = new i1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < uriArr.length; i9++) {
            if ((t0VarArr[i9].e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        i1 i1Var = this.h;
        int[] e10 = r6.e(arrayList);
        g gVar = new g(i1Var, e10);
        gVar.g = gVar.a(i1Var.d[e10[0]]);
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
        int i9 = 0;
        while (i9 < length) {
            int j11 = iVar.q.j(i9);
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
                int i10 = (int) (longValue - j13);
                if (i10 < 0 || zVar2.size() < i10) {
                    x xVar = z.b;
                    list = l0.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < zVar2.size()) {
                        if (intValue != -1) {
                            p4.g gVar = (p4.g) zVar2.get(i10);
                            if (intValue == 0) {
                                arrayList.add(gVar);
                            } else if (intValue < gVar.x.size()) {
                                z zVar3 = gVar.x;
                                arrayList.addAll(zVar3.subList(intValue, zVar3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(zVar2.subList(i10, zVar2.size()));
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
                lVarArr[i9] = new f(j12, list);
            } else {
                lVarArr[i9] = l4.l.q;
            }
            i9++;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        int i9 = kVar.A;
        if (i9 == -1) {
            return 1;
        }
        p4.j a2 = this.g.a(this.e[this.h.a(kVar.d)], false);
        a2.getClass();
        z zVar = a2.r;
        int i10 = (int) (kVar.s - a2.k);
        if (i10 < 0) {
            return 1;
        }
        z zVar2 = i10 < zVar.size() ? ((p4.g) zVar.get(i10)).x : a2.s;
        if (i9 >= zVar2.size()) {
            return 2;
        }
        p4.e eVar = (p4.e) zVar2.get(i9);
        if (eVar.x) {
            return 0;
        }
        return f0.a(Uri.parse(d5.a.G(a2.a, eVar.a)), kVar.b.a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z10, p4.j jVar, long j10, long j11) {
        boolean z11 = true;
        if (kVar != null) {
            long j12 = kVar.s;
            int i9 = kVar.A;
            if (!z10) {
                if (!kVar.T) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i9));
                }
                if (i9 == -1) {
                    j12 = kVar.b();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i9 != -1 ? i9 + 1 : -1));
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
        int i10 = 0;
        if (this.g.x && kVar != null) {
            z11 = false;
        }
        int c10 = f0.c(zVar2, valueOf, z11);
        long j17 = c10 + j14;
        if (c10 >= 0) {
            p4.g gVar = (p4.g) zVar2.get(c10);
            z zVar3 = j16 < gVar.e + gVar.c ? gVar.x : zVar;
            while (true) {
                if (i10 >= zVar3.size()) {
                    break;
                }
                p4.e eVar = (p4.e) zVar3.get(i10);
                if (j16 >= eVar.e + eVar.c) {
                    i10++;
                } else if (eVar.w) {
                    j17 += zVar3 == zVar ? 1L : 0L;
                    r1 = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j17), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i9) {
        if (uri == null) {
            return null;
        }
        n2.p pVar = this.j;
        byte[] bArr = (byte[]) ((d) pVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f[i9];
        int p6 = this.q.p();
        Object r10 = this.q.r();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, qVar, 3, t0Var, p6, r10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = f0.f;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
