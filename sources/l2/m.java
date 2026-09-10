package l2;

import b2.r0;
import com.google.firebase.messaging.s;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import x2.r;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m {
    public final y2.o a;
    public final s b;
    public final int[] c;
    public final int d;
    public final g2.h e;
    public final long f;
    public final int g;
    public final p h;
    public final k[] i;
    public r j;
    public m2.c k;
    public int l;
    public u2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l2.m] */
    public m(b2.p pVar, y2.o oVar, m2.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, g2.h hVar, long j3, int i12, boolean z10, ArrayList arrayList, p pVar2) {
        m2.m mVar;
        k[] kVarArr;
        b2.s sVar2;
        c3.o hVar2;
        v2.d dVar;
        ?? obj = new Object();
        obj.a = oVar;
        obj.k = cVar;
        obj.b = sVar;
        obj.c = iArr;
        obj.j = rVar;
        obj.d = i11;
        obj.e = hVar;
        obj.l = i10;
        obj.f = j3;
        obj.g = i12;
        p pVar3 = pVar2;
        obj.h = pVar3;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.i = new k[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        m mVar2 = obj;
        while (i14 < mVar2.i.length) {
            m2.m mVar3 = (m2.m) a2.get(rVar.h(i14));
            m2.b m10 = sVar.m(mVar3.b);
            k[] kVarArr2 = mVar2.i;
            m2.b bVar = m10 == null ? (m2.b) mVar3.b.get(i13) : m10;
            b2.s sVar3 = mVar3.a;
            pVar.getClass();
            String str = sVar3.q;
            if (!r0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar3;
                    sVar2 = sVar3;
                    kVarArr = kVarArr2;
                    hVar2 = new u3.d((rb.a) pVar.c, pVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new k3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new g3.a(1);
                } else {
                    int i15 = z10 ? 4 : 0;
                    mVar = mVar3;
                    int i16 = pVar.b ? i15 : i15 | 32;
                    kVarArr = kVarArr2;
                    sVar2 = sVar3;
                    hVar2 = new w3.h((rb.a) pVar.c, i16, null, arrayList, pVar3);
                }
                dVar = new v2.d(hVar2, i11, sVar2);
                v2.d dVar2 = dVar;
                int i17 = i14;
                long j10 = d;
                kVarArr[i17] = new k(j10, mVar, bVar, dVar2, 0L, mVar.d());
                i14 = i17 + 1;
                mVar2 = this;
                pVar3 = pVar2;
                d = j10;
                i13 = 0;
            } else if (pVar.b) {
                hVar2 = new z3.h(((rb.a) pVar.c).d(sVar3), sVar3);
            } else {
                dVar = null;
                mVar = mVar3;
                kVarArr = kVarArr2;
                v2.d dVar22 = dVar;
                int i172 = i14;
                long j102 = d;
                kVarArr[i172] = new k(j102, mVar, bVar, dVar22, 0L, mVar.d());
                i14 = i172 + 1;
                mVar2 = this;
                pVar3 = pVar2;
                d = j102;
                i13 = 0;
            }
            mVar = mVar3;
            sVar2 = sVar3;
            kVarArr = kVarArr2;
            dVar = new v2.d(hVar2, i11, sVar2);
            v2.d dVar222 = dVar;
            int i1722 = i14;
            long j1022 = d;
            kVarArr[i1722] = new k(j1022, mVar, bVar, dVar222, 0L, mVar.d());
            i14 = i1722 + 1;
            mVar2 = this;
            pVar3 = pVar2;
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

    public final k b(int i10) {
        k[] kVarArr = this.i;
        k kVar = kVarArr[i10];
        m2.b m10 = this.b.m(kVar.b.b);
        if (m10 == null || m10.equals(kVar.c)) {
            return kVar;
        }
        k kVar2 = new k(kVar.e, kVar.b, m10, kVar.a, kVar.f, kVar.d);
        kVarArr[i10] = kVar2;
        return kVar2;
    }
}
