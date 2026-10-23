package o2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.p1;
import b2.w;
import e2.m0;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import g2.c0;
import i2.o1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.w0;
import ki.t1;
import p2.x;
import si.z;
import v7.b8;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class i {
    public final c a;
    public final g2.h b;
    public final g2.h c;
    public final w0 d;
    public final x[] e;
    public final w[] f;
    public final p2.e g;
    public final p1 h;
    public final List i;
    public final j2.j k;
    public boolean l;
    public u2.b n;
    public Uri o;
    public Uri p;
    public boolean q;
    public x2.p r;
    public final t1 j = new t1(10);
    public byte[] m = m0.b;
    public long s = -9223372036854775807L;

    public i(c cVar, p2.e eVar, x[] xVarArr, w[] wVarArr, l2.f fVar, c0 c0Var, w0 w0Var, List list, j2.j jVar) {
        this.a = cVar;
        this.g = eVar;
        this.e = xVarArr;
        this.f = wVarArr;
        this.d = w0Var;
        this.i = list;
        this.k = jVar;
        g2.h createDataSource = ((g2.g) fVar.b).createDataSource();
        this.b = createDataSource;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        this.c = ((g2.g) fVar.b).createDataSource();
        this.h = new p1("", wVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if ((wVarArr[i10].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        p1 p1Var = this.h;
        int[] f7 = b8.f(arrayList);
        g gVar = new g(p1Var, f7);
        gVar.g = gVar.s(p1Var.d[f7[0]]);
        this.r = gVar;
    }

    public static h f(p2.n nVar, long j10, int i10) {
        long j11 = nVar.k;
        n0 n0Var = nVar.s;
        int i11 = (int) (j10 - j11);
        n0 n0Var2 = nVar.r;
        if (i11 == n0Var2.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < n0Var.size()) {
                return new h((p2.l) n0Var.get(i10), j10, i10);
            }
            return null;
        }
        p2.k kVar = (p2.k) n0Var2.get(i11);
        if (i10 == -1) {
            return new h(kVar, j10, -1);
        }
        if (i10 < kVar.x.size()) {
            return new h((p2.l) kVar.x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < n0Var2.size()) {
            return new h((p2.l) n0Var2.get(i12), j10 + 1, -1);
        }
        if (n0Var.isEmpty()) {
            return null;
        }
        return new h((p2.l) n0Var.get(0), j10 + 1, 0);
    }

    public final z a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p2.e eVar = this.g;
        p2.d dVar = (p2.d) eVar.d.get(uri);
        x xVar = dVar != null ? dVar.a : null;
        xVar.getClass();
        HashMap hashMap = xVar.b;
        int size = hashMap.size();
        m2 it = y0.u(hashMap.values()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            p2.d dVar2 = (p2.d) eVar.d.get(uri2);
            if (dVar2 != null) {
                p2.c cVar = (p2.c) o1.j(dVar2.b, uri2, uri2);
                cVar.getClass();
                if (elapsedRealtime <= cVar.r) {
                    i10++;
                }
            }
        }
        return new z(size, i10, this.r.length(), d(elapsedRealtime));
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
            p2.e eVar = iVar.g;
            if (eVar.g(c10)) {
                p2.n b10 = eVar.b(c10, z10);
                b10.getClass();
                long j11 = b10.h - eVar.I;
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
                            p2.k kVar = (p2.k) n0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(kVar);
                            } else if (intValue < kVar.x.size()) {
                                n0 n0Var3 = kVar.x;
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
        p2.n b10 = this.g.b(jVar.x, false);
        b10.getClass();
        n0 n0Var = b10.r;
        int i11 = (int) (jVar.s - b10.k);
        if (i11 < 0) {
            return 1;
        }
        n0 n0Var2 = i11 < n0Var.size() ? ((p2.k) n0Var.get(i11)).x : b10.s;
        if (i10 >= n0Var2.size()) {
            return 2;
        }
        p2.i iVar = (p2.i) n0Var2.get(i10);
        if (iVar.x) {
            return 0;
        }
        return Objects.equals(Uri.parse(e2.e.f(b10.a, iVar.a)), jVar.b.a) ? 1 : 2;
    }

    public final int d(long j10) {
        int i10;
        x2.p pVar = this.r;
        int length = pVar.length();
        int i11 = 0;
        while (i10 < length) {
            int h = pVar.h(i10);
            if (!pVar.a(i10, j10)) {
                i10 = this.g.f(this.e[h], j10) ? 0 : i10 + 1;
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
    public final Pair e(j jVar, boolean z10, p2.n nVar, long j10, long j11) {
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
        long j13 = nVar.u;
        long j14 = nVar.k;
        n0 n0Var2 = nVar.s;
        n0 n0Var3 = nVar.r;
        long j15 = j10 + j13;
        long j16 = (jVar == null || this.q) ? j11 : jVar.h;
        if (!nVar.o && j16 >= j15) {
            return new Pair(Long.valueOf(j14 + n0Var3.size()), -1);
        }
        long j17 = j16 - j10;
        Long valueOf = Long.valueOf(j17);
        p2.e eVar = this.g;
        if (eVar.H && jVar != null) {
            z11 = false;
        }
        int d = m0.d(n0Var3, valueOf, z11);
        long j18 = d + j14;
        if (!eVar.H) {
            return new Pair(Long.valueOf(j18), -1);
        }
        if (d >= 0) {
            if (!n0Var3.isEmpty()) {
                p2.k kVar = (p2.k) n0Var3.get(d);
                if (j17 < kVar.e + kVar.c) {
                    n0Var = kVar.x;
                    i10 = 0;
                    while (true) {
                        if (i10 < n0Var.size()) {
                            break;
                        }
                        p2.i iVar = (p2.i) n0Var.get(i10);
                        if (j17 >= iVar.e + iVar.c) {
                            i10++;
                        } else if (iVar.w) {
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
    public final e g(Uri uri, int i10, boolean z10) {
        if (uri == null) {
            return null;
        }
        t1 t1Var = this.j;
        byte[] bArr = (byte[]) ((d) t1Var.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        g2.m mVar = new g2.m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        w wVar = this.f[i10];
        int n10 = this.r.n();
        Object q6 = this.r.q();
        byte[] bArr2 = this.m;
        e eVar = new e(this.c, mVar, 3, wVar, n10, q6, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = m0.b;
        }
        eVar.s = bArr2;
        return eVar;
    }
}
