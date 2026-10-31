package l2;

import b2.v0;
import b2.x;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;
import x2.q;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l {
    public final y2.m a;
    public final xa.n b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final o h;
    public final j[] i;
    public q j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.l] */
    public l(c5.e eVar, y2.m mVar, m2.c cVar, xa.n nVar, int i10, int[] iArr, q qVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        m2.m mVar2;
        j[] jVarArr;
        x xVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.a = mVar;
        obj.k = cVar;
        obj.b = nVar;
        obj.c = iArr;
        obj.j = qVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j10;
        obj.g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new j[qVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.i.length) {
            m2.m mVar3 = (m2.m) a2.get(qVar.h(i14));
            m2.b W = nVar.W(mVar3.b);
            j[] jVarArr2 = lVar.i;
            m2.b bVar = W == null ? (m2.b) mVar3.b.get(i13) : W;
            x xVar2 = mVar3.a;
            eVar.getClass();
            String str = xVar2.r;
            if (!v0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    xVar = xVar2;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.f((u) eVar.c, eVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    int g10 = (eVar.b ? i15 : i15 | 32) | w3.h.g(eVar.a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    xVar = xVar2;
                    hVar2 = new w3.h((u) eVar.c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(hVar2, i11, xVar);
                v2.e eVar3 = eVar2;
                int i16 = i14;
                long j11 = d;
                jVarArr[i16] = new j(j11, mVar2, bVar, eVar3, 0L, mVar2.d());
                i14 = i16 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j11;
                i13 = 0;
            } else if (eVar.b) {
                hVar2 = new z3.h(((u) eVar.c).m(xVar2), xVar2);
            } else {
                eVar2 = null;
                mVar2 = mVar3;
                jVarArr = jVarArr2;
                v2.e eVar32 = eVar2;
                int i162 = i14;
                long j112 = d;
                jVarArr[i162] = new j(j112, mVar2, bVar, eVar32, 0L, mVar2.d());
                i14 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i13 = 0;
            }
            mVar2 = mVar3;
            xVar = xVar2;
            jVarArr = jVarArr2;
            eVar2 = new v2.e(hVar2, i11, xVar);
            v2.e eVar322 = eVar2;
            int i1622 = i14;
            long j1122 = d;
            jVarArr[i1622] = new j(j1122, mVar2, bVar, eVar322, 0L, mVar2.d());
            i14 = i1622 + 1;
            lVar = this;
            oVar2 = oVar;
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

    public final j b(int i10) {
        j[] jVarArr = this.i;
        j jVar = jVarArr[i10];
        m2.b W = this.b.W(jVar.b.b);
        if (W == null || W.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, W, jVar.a, jVar.f, jVar.d);
        jVarArr[i10] = jVar2;
        return jVar2;
    }
}
