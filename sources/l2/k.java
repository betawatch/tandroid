package l2;

import b2.p;
import b2.r0;
import b2.s;
import com.google.firebase.messaging.t;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class k {
    public final y2.m a;
    public final t b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final n h;
    public final i[] i;
    public r j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.k] */
    public k(p pVar, y2.m mVar, m2.c cVar, t tVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar) {
        m2.m mVar2;
        i[] iVarArr;
        s sVar;
        c3.o iVar;
        v2.d dVar;
        ?? obj = new Object();
        obj.a = mVar;
        obj.k = cVar;
        obj.b = tVar;
        obj.c = iArr;
        obj.j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j3;
        obj.g = i12;
        n nVar2 = nVar;
        obj.h = nVar2;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new i[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i14));
            m2.b j10 = tVar.j(mVar3.b);
            i[] iVarArr2 = kVar.i;
            m2.b bVar = j10 == null ? (m2.b) mVar3.b.get(i13) : j10;
            s sVar2 = mVar3.a;
            pVar.getClass();
            String str = sVar2.q;
            if (!r0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar2 = mVar3;
                    sVar = sVar2;
                    iVarArr = iVarArr2;
                    iVar = new u3.d((qb.b) pVar.c, pVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    iVar = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    mVar2 = mVar3;
                    int i16 = pVar.b ? i15 : i15 | 32;
                    iVarArr = iVarArr2;
                    sVar = sVar2;
                    iVar = new w3.i((qb.b) pVar.c, i16, null, arrayList, nVar2);
                }
                dVar = new v2.d(iVar, i11, sVar);
                v2.d dVar2 = dVar;
                int i17 = i14;
                long j11 = d;
                iVarArr[i17] = new i(j11, mVar2, bVar, dVar2, 0L, mVar2.d());
                i14 = i17 + 1;
                kVar = this;
                nVar2 = nVar;
                d = j11;
                i13 = 0;
            } else if (pVar.b) {
                iVar = new z3.h(((qb.b) pVar.c).x(sVar2), sVar2);
            } else {
                dVar = null;
                mVar2 = mVar3;
                iVarArr = iVarArr2;
                v2.d dVar22 = dVar;
                int i172 = i14;
                long j112 = d;
                iVarArr[i172] = new i(j112, mVar2, bVar, dVar22, 0L, mVar2.d());
                i14 = i172 + 1;
                kVar = this;
                nVar2 = nVar;
                d = j112;
                i13 = 0;
            }
            mVar2 = mVar3;
            sVar = sVar2;
            iVarArr = iVarArr2;
            dVar = new v2.d(iVar, i11, sVar);
            v2.d dVar222 = dVar;
            int i1722 = i14;
            long j1122 = d;
            iVarArr[i1722] = new i(j1122, mVar2, bVar, dVar222, 0L, mVar2.d());
            i14 = i1722 + 1;
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
        m2.b j3 = this.b.j(iVar.b.b);
        if (j3 == null || j3.equals(iVar.c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.b, j3, iVar.a, iVar.f, iVar.d);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
