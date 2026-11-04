package n2;

import a3.r;
import cg.v0;
import d2.u0;
import d2.v;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l {
    public final r a;
    public final za.p b;
    public final int[] c;
    public final int d;
    public final i2.h e;
    public final long f;
    public final int g;
    public final o h;
    public final j[] i;
    public z2.p j;
    public o2.c k;
    public int l;
    public w2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n2.l] */
    public l(v0 v0Var, r rVar, o2.c cVar, za.p pVar, int i3, int[] iArr, z2.p pVar2, int i10, i2.h hVar, long j10, int i11, boolean z10, ArrayList arrayList, o oVar) {
        o2.m mVar;
        j[] jVarArr;
        v vVar;
        e3.o iVar;
        x2.e eVar;
        ?? obj = new Object();
        obj.a = rVar;
        obj.k = cVar;
        obj.b = pVar;
        obj.c = iArr;
        obj.j = pVar2;
        obj.d = i10;
        obj.e = hVar;
        obj.l = i3;
        obj.f = j10;
        obj.g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i3);
        ArrayList a10 = obj.a();
        obj.i = new j[pVar2.length()];
        int i12 = 0;
        int i13 = 0;
        l lVar = obj;
        while (i13 < lVar.i.length) {
            o2.m mVar2 = (o2.m) a10.get(pVar2.i(i13));
            o2.b B = pVar.B(mVar2.b);
            j[] jVarArr2 = lVar.i;
            o2.b bVar = B == null ? (o2.b) mVar2.b.get(i12) : B;
            v vVar2 = mVar2.a;
            v0Var.getClass();
            String str = vVar2.r;
            if (!u0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    vVar = vVar2;
                    jVarArr = jVarArr2;
                    iVar = new w3.f((mb.b) v0Var.c, v0Var.a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new m3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    iVar = new a4.a(0);
                } else {
                    int i14 = z10 ? 4 : 0;
                    int g7 = (v0Var.a ? i14 : i14 | 32) | y3.i.g(v0Var.b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    vVar = vVar2;
                    iVar = new y3.i((mb.b) v0Var.c, g7, null, arrayList, oVar2);
                }
                eVar = new x2.e(iVar, i10, vVar);
                x2.e eVar2 = eVar;
                int i15 = i13;
                long j11 = d;
                jVarArr[i15] = new j(j11, mVar, bVar, eVar2, 0L, mVar.c());
                i13 = i15 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j11;
                i12 = 0;
            } else if (v0Var.a) {
                iVar = new b4.h(((mb.b) v0Var.c).h(vVar2), vVar2);
            } else {
                eVar = null;
                mVar = mVar2;
                jVarArr = jVarArr2;
                x2.e eVar22 = eVar;
                int i152 = i13;
                long j112 = d;
                jVarArr[i152] = new j(j112, mVar, bVar, eVar22, 0L, mVar.c());
                i13 = i152 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j112;
                i12 = 0;
            }
            mVar = mVar2;
            vVar = vVar2;
            jVarArr = jVarArr2;
            eVar = new x2.e(iVar, i10, vVar);
            x2.e eVar222 = eVar;
            int i1522 = i13;
            long j1122 = d;
            jVarArr[i1522] = new j(j1122, mVar, bVar, eVar222, 0L, mVar.c());
            i13 = i1522 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1122;
            i12 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.c) {
            arrayList.addAll(((o2.a) list.get(i3)).c);
        }
        return arrayList;
    }

    public final j b(int i3) {
        j[] jVarArr = this.i;
        j jVar = jVarArr[i3];
        o2.b B = this.b.B(jVar.b.b);
        if (B == null || B.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, B, jVar.a, jVar.f, jVar.d);
        jVarArr[i3] = jVar2;
        return jVar2;
    }
}
