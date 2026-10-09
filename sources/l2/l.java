package l2;

import b2.r0;
import com.google.firebase.messaging.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l {
    public final y2.m a;
    public final s b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final o h;
    public final j[] i;
    public r j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.l] */
    public l(b2.p pVar, y2.m mVar, m2.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, o oVar) {
        m2.m mVar2;
        j[] jVarArr;
        b2.s sVar2;
        c3.o jVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.a = mVar;
        obj.k = cVar;
        obj.b = sVar;
        obj.c = iArr;
        obj.j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j3;
        obj.g = i12;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new j[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i14));
            m2.b j10 = sVar.j(mVar3.b);
            j[] jVarArr2 = lVar.i;
            m2.b bVar = j10 == null ? (m2.b) mVar3.b.get(i13) : j10;
            b2.s sVar3 = mVar3.a;
            pVar.getClass();
            String str = sVar3.q;
            if (!r0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    sVar2 = sVar3;
                    jVarArr = jVarArr2;
                    jVar = new u3.d((ob.a) pVar.c, pVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    jVar = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    jVar = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    mVar2 = mVar3;
                    int i16 = pVar.b ? i15 : i15 | 32;
                    jVarArr = jVarArr2;
                    sVar2 = sVar3;
                    jVar = new w3.j((ob.a) pVar.c, i16, null, arrayList, oVar2);
                }
                dVar = new v2.d(jVar, i11, sVar2);
                v2.d dVar2 = dVar;
                int i17 = i14;
                long j11 = d;
                jVarArr[i17] = new j(j11, mVar2, bVar, dVar2, 0L, mVar2.c());
                i14 = i17 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j11;
                i13 = 0;
            } else if (pVar.b) {
                jVar = new z3.h(((ob.a) pVar.c).s0(sVar3), sVar3);
            } else {
                dVar = null;
                mVar2 = mVar3;
                jVarArr = jVarArr2;
                v2.d dVar22 = dVar;
                int i172 = i14;
                long j112 = d;
                jVarArr[i172] = new j(j112, mVar2, bVar, dVar22, 0L, mVar2.c());
                i14 = i172 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i13 = 0;
            }
            mVar2 = mVar3;
            sVar2 = sVar3;
            jVarArr = jVarArr2;
            dVar = new v2.d(jVar, i11, sVar2);
            v2.d dVar222 = dVar;
            int i1722 = i14;
            long j1122 = d;
            jVarArr[i1722] = new j(j1122, mVar2, bVar, dVar222, 0L, mVar2.c());
            i14 = i1722 + 1;
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
        m2.b j3 = this.b.j(jVar.b.b);
        if (j3 == null || j3.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, j3, jVar.a, jVar.f, jVar.d);
        jVarArr[i10] = jVar2;
        return jVar2;
    }
}
