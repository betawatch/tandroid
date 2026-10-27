package l2;

import b2.w0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k {
    public final y2.m a;
    public final ti.e b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final n h;
    public final i[] i;
    public q j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.k] */
    public k(d5.f fVar, y2.m mVar, m2.c cVar, ti.e eVar, int i10, int[] iArr, q qVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, n nVar) {
        m2.m mVar2;
        i[] iVarArr;
        x xVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.a = mVar;
        obj.k = cVar;
        obj.b = eVar;
        obj.c = iArr;
        obj.j = qVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j10;
        obj.g = i12;
        n nVar2 = nVar;
        obj.h = nVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new i[qVar.length()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.i.length) {
            m2.m mVar3 = (m2.m) a2.get(qVar.h(i14));
            m2.b t10 = eVar.t(mVar3.b);
            i[] iVarArr2 = kVar.i;
            m2.b bVar = t10 == null ? (m2.b) mVar3.b.get(i13) : t10;
            x xVar2 = mVar3.a;
            fVar.getClass();
            String str = xVar2.r;
            if (!w0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    iVarArr = iVarArr2;
                    hVar2 = new u3.f((qb.a) fVar.c, fVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    int g7 = (fVar.b ? i15 : i15 | 32) | w3.h.g(fVar.a);
                    mVar2 = mVar3;
                    iVarArr = iVarArr2;
                    xVar = xVar2;
                    hVar2 = new w3.h((qb.a) fVar.c, g7, null, arrayList, nVar2);
                }
                eVar2 = new v2.e(hVar2, i11, xVar);
                v2.e eVar3 = eVar2;
                int i16 = i14;
                long j11 = d;
                iVarArr[i16] = new i(j11, mVar2, bVar, eVar3, 0L, mVar2.c());
                i14 = i16 + 1;
                kVar = this;
                nVar2 = nVar;
                d = j11;
                i13 = 0;
            } else if (fVar.b) {
                hVar2 = new z3.h(((qb.a) fVar.c).f0(xVar2), xVar2);
            } else {
                eVar2 = null;
                mVar2 = mVar3;
                iVarArr = iVarArr2;
                v2.e eVar32 = eVar2;
                int i162 = i14;
                long j112 = d;
                iVarArr[i162] = new i(j112, mVar2, bVar, eVar32, 0L, mVar2.c());
                i14 = i162 + 1;
                kVar = this;
                nVar2 = nVar;
                d = j112;
                i13 = 0;
            }
            mVar2 = mVar3;
            xVar = xVar2;
            iVarArr = iVarArr2;
            eVar2 = new v2.e(hVar2, i11, xVar);
            v2.e eVar322 = eVar2;
            int i1622 = i14;
            long j1122 = d;
            iVarArr[i1622] = new i(j1122, mVar2, bVar, eVar322, 0L, mVar2.c());
            i14 = i1622 + 1;
            kVar = this;
            nVar2 = nVar;
            d = j1122;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.c) {
            arrayList.addAll(((m2.a) list.get(i10)).c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.i;
        i iVar = iVarArr[i10];
        m2.b t10 = this.b.t(iVar.b.b);
        if (t10 == null || t10.equals(iVar.c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.b, t10, iVar.a, iVar.f, iVar.d);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
