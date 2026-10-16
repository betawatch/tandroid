package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.q1;
import b2.x;
import e2.m0;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import g2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ji.h5;
import org.telegram.ui.Wallet.k5;
import p2.w;
import v7.b8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final g2.h b;
    public final g2.h c;
    public final h5 d;
    public final w[] e;
    public final x[] f;
    public final p2.d g;
    public final q1 h;
    public final List i;
    public final j2.k k;
    public boolean l;
    public u2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public x2.p r;
    public final m.l j = new m.l(4);
    public byte[] m = m0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, p2.d dVar, w[] wVarArr, x[] xVarArr, m.h hVar, c0 c0Var, h5 h5Var, List list, j2.k kVar) {
        this.a = cVar;
        this.g = dVar;
        this.e = wVarArr;
        this.f = xVarArr;
        this.d = h5Var;
        this.i = list;
        this.k = kVar;
        g2.h createDataSource = ((g2.g) hVar.b).createDataSource();
        this.b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.c = ((g2.g) hVar.b).createDataSource();
        this.h = new q1("", xVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            if ((xVarArr[i10].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        q1 q1Var = this.h;
        int[] f7 = b8.f(arrayList);
        g gVar = new g(q1Var, f7);
        gVar.g = gVar.s(q1Var.d[f7[0]]);
        this.r = gVar;
    }

    public static h f(p2.m mVar, long j10, int i10) {
        long j11 = mVar.k;
        n0 n0Var = mVar.s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = mVar.r;
        if (i11 == n0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < n0Var.size()) {
                return new h((p2.k) n0Var.get(i10), j10, i10);
            }
            return null;
        }
        p2.j jVar = (p2.j) n0Var2.get(i11);
        if (i10 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i10 < jVar.x.size()) {
            return new h((p2.k) jVar.x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < n0Var2.size()) {
            return new h((p2.k) n0Var2.get(i12), j10 + 1, -1);
        }
        if (n0Var.isEmpty()) {
            return null;
        }
        return new h((p2.k) n0Var.get(0), j10 + 1, 0);
    }

    public final k5 a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.d dVar = this.g;
        p2.c cVar = (p2.c) dVar.d.get(uri);
        w wVar = cVar != null ? cVar.a : null;
        wVar.getClass();
        HashMap hashMap = wVar.b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.c cVar2 = (p2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                p2.b bVar = (p2.b) i2.d.i(cVar2.b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.r) {
                    i10++;
                }
            }
        }
        return new k5(size, i10, this.r.length(), d(elapsedRealtime));
    }

    public final v2.m[] b(j jVar, long j10) {
        List list;
        i iVar = this;
        j jVar2 = jVar;
        int a2 = jVar2 == null ? -1 : iVar.h.a(jVar2.d);
        int length = iVar.r.length();
        v2.m[] mVarArr = new v2.m[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int h = iVar.r.h(i10);
            Uri c10 = iVar.e[h].c();
            p2.d dVar = iVar.g;
            if (dVar.f(c10)) {
                p2.m b10 = dVar.b(c10, z10);
                b10.getClass();
                long j11 = b10.h - dVar.I;
                Pair e = iVar.e(jVar2, h != a2 ? true : z10, b10, j11, j10);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j12 = b10.k;
                n0 n0Var = b10.s;
                n0 n0Var2 = b10.r;
                int i11 = (int) (longValue - j12);
                if (i11 < 0 || n0Var2.size() < i11) {
                    l0 l0Var = n0.b;
                    list = x1.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < n0Var2.size()) {
                        if (intValue != -1) {
                            p2.j jVar3 = (p2.j) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.x.size()) {
                                n0 n0Var3 = jVar3.x;
                                arrayList.addAll(n0Var3.subList(intValue, n0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(n0Var2.subList(i11, n0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < n0Var.size()) {
                            arrayList.addAll(n0Var.subList(intValue, n0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                mVarArr[i10] = new f(j11, list);
            } else {
                mVarArr[i10] = v2.m.B;
            }
            i10++;
            iVar = this;
            jVar2 = jVar;
            z10 = false;
        }
        return mVarArr;
    }

    public final int c(j jVar) {
        int i10 = jVar.E;
        if (i10 == -1) {
            return 1;
        }
        p2.m b10 = this.g.b(jVar.x, false);
        b10.getClass();
        n0 n0Var = b10.r;
        int i11 = (int) (jVar.s - b10.k);
        if (i11 < 0) {
            return 1;
        }
        n0 n0Var2 = i11 < n0Var.size() ? ((p2.j) n0Var.get(i11)).x : b10.s;
        if (i10 >= n0Var2.size()) {
            return 2;
        }
        p2.h hVar = (p2.h) n0Var2.get(i10);
        if (hVar.x) {
            return 0;
        }
        return Objects.equals(Uri.parse(e2.e.f(b10.a, hVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final int d(long j10) {
        int i10;
        x2.p pVar = this.r;
        int length = pVar.length();
        int i11 = 0;
        while (i10 < length) {
            int h = pVar.h(i10);
            if (!pVar.a(i10, j10)) {
                i10 = this.g.e(this.e[h], j10) ? 0 : i10 + 1;
            }
            i11++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da A[EDGE_INSN: B:58:0x00da->B:60:0x00da BREAK  A[LOOP:0: B:44:0x00ae->B:48:0x00d7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair e(j jVar, boolean z10, p2.m mVar, long j10, long j11) {
        n0 n0Var;
        int i10;
        boolean z11 = true;
        if (jVar != null) {
            long j12 = jVar.s;
            int i11 = jVar.E;
            if (!z10) {
                if (!jVar.X) {
                    return new Pair(Long.valueOf(j12), Integer.valueOf(i11));
                }
                if (i11 == -1) {
                    j12 = jVar.b();
                }
                return new Pair(Long.valueOf(j12), Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
            }
        }
        long j13 = mVar.u;
        long j14 = mVar.k;
        n0 n0Var2 = mVar.s;
        n0 n0Var3 = mVar.r;
        long j15 = j10 + j13;
        long j16 = (jVar == null || this.q) ? j11 : jVar.h;
        if (!mVar.o && j16 >= j15) {
            return new Pair(Long.valueOf(j14 + n0Var3.size()), -1);
        }
        long j17 = j16 - j10;
        Long valueOf = Long.valueOf(j17);
        p2.d dVar = this.g;
        if (dVar.H && jVar != null) {
            z11 = false;
        }
        int d = m0.d(n0Var3, valueOf, z11);
        long j18 = d + j14;
        if (!dVar.H) {
            return new Pair(Long.valueOf(j18), -1);
        }
        if (d >= 0) {
            if (!n0Var3.isEmpty()) {
                p2.j jVar2 = (p2.j) n0Var3.get(d);
                if (j17 < jVar2.e + jVar2.c) {
                    n0Var = jVar2.x;
                    i10 = 0;
                    while (true) {
                        if (i10 < n0Var.size()) {
                            break;
                        }
                        p2.h hVar = (p2.h) n0Var.get(i10);
                        if (j17 >= hVar.e + hVar.c) {
                            i10++;
                        } else if (hVar.w) {
                            j18 += (n0Var != n0Var2 || n0Var3.isEmpty()) ? 0L : 1L;
                            r3 = i10;
                        }
                    }
                }
            }
            n0Var = n0Var2;
            i10 = 0;
            while (true) {
                if (i10 < n0Var.size()) {
                }
                i10++;
            }
        }
        return new Pair(Long.valueOf(j18), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e g(int i10, Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        m.l lVar = this.j;
        byte[] bArr = (byte[]) ((d) lVar.a).remove(uri);
        if (bArr != null) {
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        x xVar = this.f[i10];
        int n10 = this.r.n();
        Object q6 = this.r.q();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, mVar, 3, xVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = m0.b;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
