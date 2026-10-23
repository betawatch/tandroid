package l2;

import b2.v0;
import b2.w;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import t7.u;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class l {
    public final y2.m a;
    public final qi.e b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final o h;
    public final j[] i;
    public x2.p j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.l] */
    public l(c5.f fVar, y2.m mVar, m2.c cVar, qi.e eVar, int i10, int[] iArr, x2.p pVar, int i11, g2.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, o oVar) {
        m2.m mVar2;
        j[] jVarArr;
        w wVar;
        c3.o hVar2;
        v2.e eVar2;
        ?? obj = new Object();
        obj.a = mVar;
        obj.k = cVar;
        obj.b = eVar;
        obj.c = iArr;
        obj.j = pVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j10;
        obj.g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new j[pVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.i.length) {
            m2.m mVar3 = (m2.m) a2.get(pVar.h(i14));
            m2.b G = eVar.G(mVar3.b);
            j[] jVarArr2 = lVar.i;
            m2.b bVar = G == null ? (m2.b) mVar3.b.get(i13) : G;
            w wVar2 = mVar3.a;
            fVar.getClass();
            String str = wVar2.r;
            if (!v0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    wVar = wVar2;
                    jVarArr = jVarArr2;
                    hVar2 = new u3.f((u) fVar.c, fVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    int g10 = (fVar.b ? i15 : i15 | 32) | w3.h.g(fVar.a);
                    mVar2 = mVar3;
                    jVarArr = jVarArr2;
                    wVar = wVar2;
                    hVar2 = new w3.h((u) fVar.c, g10, null, arrayList, oVar2);
                }
                eVar2 = new v2.e(hVar2, i11, wVar);
                v2.e eVar3 = eVar2;
                int i16 = i14;
                long j11 = d;
                jVarArr[i16] = new j(j11, mVar2, bVar, eVar3, 0L, mVar2.c());
                i14 = i16 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j11;
                i13 = 0;
            } else if (fVar.b) {
                hVar2 = new z3.h(((u) fVar.c).y(wVar2), wVar2);
            } else {
                eVar2 = null;
                mVar2 = mVar3;
                jVarArr = jVarArr2;
                v2.e eVar32 = eVar2;
                int i162 = i14;
                long j112 = d;
                jVarArr[i162] = new j(j112, mVar2, bVar, eVar32, 0L, mVar2.c());
                i14 = i162 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i13 = 0;
            }
            mVar2 = mVar3;
            wVar = wVar2;
            jVarArr = jVarArr2;
            eVar2 = new v2.e(hVar2, i11, wVar);
            v2.e eVar322 = eVar2;
            int i1622 = i14;
            long j1122 = d;
            jVarArr[i1622] = new j(j1122, mVar2, bVar, eVar322, 0L, mVar2.c());
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
        m2.b G = this.b.G(jVar.b.b);
        if (G == null || G.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, G, jVar.a, jVar.f, jVar.d);
        jVarArr[i10] = jVar2;
        return jVar2;
    }
}
