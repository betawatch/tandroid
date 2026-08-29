package o4;

import com.google.android.exoplayer2.upstream.r0;
import com.google.firebase.messaging.s;
import d5.r;
import j3.t0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l {
    public final r0 a;
    public final s b;
    public final int[] c;
    public final int d;
    public final com.google.android.exoplayer2.upstream.m e;
    public final long f;
    public final o g;
    public final j[] h;
    public r i;
    public p4.c j;
    public int k;
    public l4.b l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o4.l] */
    public l(r0 r0Var, p4.c cVar, s sVar, int i10, int[] iArr, r rVar, int i11, com.google.android.exoplayer2.upstream.m mVar, long j10, boolean z10, ArrayList arrayList, o oVar) {
        o3.k iVar;
        int i12;
        n4.d dVar;
        ?? obj = new Object();
        obj.a = r0Var;
        obj.j = cVar;
        obj.b = sVar;
        obj.c = iArr;
        obj.i = rVar;
        obj.d = i11;
        obj.e = mVar;
        obj.k = i10;
        obj.f = j10;
        obj.g = oVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new j[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        l lVar = obj;
        while (i14 < lVar.h.length) {
            p4.m mVar2 = (p4.m) a2.get(rVar.i(i14));
            p4.b L = sVar.L(mVar2.b);
            j[] jVarArr = lVar.h;
            int i15 = i14;
            L = L == null ? (p4.b) mVar2.b.get(i13) : L;
            t0 t0Var = mVar2.a;
            String str = t0Var.A;
            if (f5.o.i(str)) {
                i12 = i15;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i12 = i15;
                    iVar = new u3.e(1);
                } else {
                    i12 = i15;
                    iVar = new w3.i(z10 ? 4 : 0, null, arrayList, oVar);
                }
                dVar = new n4.d(iVar, i11, t0Var);
            }
            n4.d dVar2 = dVar;
            int i16 = i12;
            jVarArr[i16] = new j(d, mVar2, L, dVar2, 0L, mVar2.c());
            i14 = i16 + 1;
            lVar = this;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.c) {
            arrayList.addAll(((p4.a) list.get(i10)).c);
        }
        return arrayList;
    }

    public final j b(int i10) {
        j[] jVarArr = this.h;
        j jVar = jVarArr[i10];
        p4.b L = this.b.L(jVar.b.b);
        if (L == null || L.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, L, jVar.a, jVar.f, jVar.d);
        jVarArr[i10] = jVar2;
        return jVar2;
    }
}
