package m4;

import com.google.android.exoplayer2.upstream.r0;
import com.google.firebase.messaging.t;
import d5.q;
import h3.t0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
    public final r0 a;
    public final t b;
    public final int[] c;
    public final int d;
    public final com.google.android.exoplayer2.upstream.m e;
    public final long f;
    public final n g;
    public final i[] h;
    public b5.t i;
    public n4.c j;
    public int k;
    public j4.b l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m4.k] */
    public k(r0 r0Var, n4.c cVar, t tVar, int i9, int[] iArr, b5.t tVar2, int i10, com.google.android.exoplayer2.upstream.m mVar, long j10, boolean z10, ArrayList arrayList, n nVar) {
        m3.k iVar;
        int i11;
        l4.d dVar;
        ?? obj = new Object();
        obj.a = r0Var;
        obj.j = cVar;
        obj.b = tVar;
        obj.c = iArr;
        obj.i = tVar2;
        obj.d = i10;
        obj.e = mVar;
        obj.k = i9;
        obj.f = j10;
        obj.g = nVar;
        long d = cVar.d(i9);
        ArrayList a2 = obj.a();
        obj.h = new i[tVar2.length()];
        int i12 = 0;
        int i13 = 0;
        k kVar = obj;
        while (i13 < kVar.h.length) {
            n4.m mVar2 = (n4.m) a2.get(tVar2.j(i13));
            n4.b L = tVar.L(mVar2.b);
            i[] iVarArr = kVar.h;
            int i14 = i13;
            L = L == null ? (n4.b) mVar2.b.get(i12) : L;
            t0 t0Var = mVar2.a;
            String str = t0Var.A;
            if (q.i(str)) {
                i11 = i14;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i11 = i14;
                    iVar = new s3.d(1);
                } else {
                    i11 = i14;
                    iVar = new u3.i(z10 ? 4 : 0, null, arrayList, nVar);
                }
                dVar = new l4.d(iVar, i10, t0Var);
            }
            l4.d dVar2 = dVar;
            int i15 = i11;
            iVarArr[i15] = new i(d, mVar2, L, dVar2, 0L, mVar2.c());
            i13 = i15 + 1;
            kVar = this;
            i12 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i9 : this.c) {
            arrayList.addAll(((n4.a) list.get(i9)).c);
        }
        return arrayList;
    }

    public final i b(int i9) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i9];
        n4.b L = this.b.L(iVar.b.b);
        if (L == null || L.equals(iVar.c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.b, L, iVar.a, iVar.f, iVar.d);
        iVarArr[i9] = iVar2;
        return iVar2;
    }
}
