package l2;

import b2.p;
import b2.r0;
import b2.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k {
    public final y2.n a;
    public final fg.f b;
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
    public k(p pVar, y2.n nVar, m2.c cVar, fg.f fVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, n nVar2) {
        m2.m mVar;
        i[] iVarArr;
        s sVar;
        c3.o hVar2;
        v2.d dVar;
        ?? obj = new Object();
        obj.a = nVar;
        obj.k = cVar;
        obj.b = fVar;
        obj.c = iArr;
        obj.j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j3;
        obj.g = i12;
        n nVar3 = nVar2;
        obj.h = nVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new i[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.i.length) {
            m2.m mVar2 = (m2.m) a2.get(rVar.h(i14));
            m2.b P = fVar.P(mVar2.b);
            i[] iVarArr2 = kVar.i;
            m2.b bVar = P == null ? (m2.b) mVar2.b.get(i13) : P;
            s sVar2 = mVar2.a;
            pVar.getClass();
            String str = sVar2.q;
            if (!r0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    sVar = sVar2;
                    iVarArr = iVarArr2;
                    hVar2 = new u3.d((rb.a) pVar.c, pVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    mVar = mVar2;
                    int i16 = pVar.b ? i15 : i15 | 32;
                    iVarArr = iVarArr2;
                    sVar = sVar2;
                    hVar2 = new w3.h((rb.a) pVar.c, i16, null, arrayList, nVar3);
                }
                dVar = new v2.d(hVar2, i11, sVar);
                v2.d dVar2 = dVar;
                int i17 = i14;
                long j10 = d;
                iVarArr[i17] = new i(j10, mVar, bVar, dVar2, 0L, mVar.d());
                i14 = i17 + 1;
                kVar = this;
                nVar3 = nVar2;
                d = j10;
                i13 = 0;
            } else if (pVar.b) {
                hVar2 = new z3.h(((rb.a) pVar.c).v(sVar2), sVar2);
            } else {
                dVar = null;
                mVar = mVar2;
                iVarArr = iVarArr2;
                v2.d dVar22 = dVar;
                int i172 = i14;
                long j102 = d;
                iVarArr[i172] = new i(j102, mVar, bVar, dVar22, 0L, mVar.d());
                i14 = i172 + 1;
                kVar = this;
                nVar3 = nVar2;
                d = j102;
                i13 = 0;
            }
            mVar = mVar2;
            sVar = sVar2;
            iVarArr = iVarArr2;
            dVar = new v2.d(hVar2, i11, sVar);
            v2.d dVar222 = dVar;
            int i1722 = i14;
            long j1022 = d;
            iVarArr[i1722] = new i(j1022, mVar, bVar, dVar222, 0L, mVar.d());
            i14 = i1722 + 1;
            kVar = this;
            nVar3 = nVar2;
            d = j1022;
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
        m2.b P = this.b.P(iVar.b.b);
        if (P == null || P.equals(iVar.c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.b, P, iVar.a, iVar.f, iVar.d);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
