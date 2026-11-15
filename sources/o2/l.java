package o2;

import a3.u;
import bg.v0;
import e2.s0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class l {
    public final b3.p a;
    public final xi.e b;
    public final int[] c;
    public final int d;
    public final j2.h e;
    public final long f;
    public final int g;
    public final o h;
    public final j[] i;
    public u j;
    public p2.c k;
    public int l;
    public x2.b m;
    public boolean n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o2.l] */
    public l(v0 v0Var, b3.p pVar, p2.c cVar, xi.e eVar, int i7, int[] iArr, u uVar, int i10, j2.h hVar, long j3, int i11, boolean z10, ArrayList arrayList, o oVar) {
        p2.m mVar;
        j[] jVarArr;
        e2.u uVar2;
        f3.o hVar2;
        y2.e eVar2;
        ?? obj = new Object();
        obj.a = pVar;
        obj.k = cVar;
        obj.b = eVar;
        obj.c = iArr;
        obj.j = uVar;
        obj.d = i10;
        obj.e = hVar;
        obj.l = i7;
        obj.f = j3;
        obj.g = i11;
        o oVar2 = oVar;
        obj.h = oVar2;
        long d = cVar.d(i7);
        ArrayList a10 = obj.a();
        obj.i = new j[uVar.length()];
        int i12 = 0;
        int i13 = 0;
        l lVar = obj;
        while (i13 < lVar.i.length) {
            p2.m mVar2 = (p2.m) a10.get(uVar.i(i13));
            p2.b I = eVar.I(mVar2.b);
            j[] jVarArr2 = lVar.i;
            p2.b bVar = I == null ? (p2.b) mVar2.b.get(i12) : I;
            e2.u uVar3 = mVar2.a;
            v0Var.getClass();
            String str = uVar3.r;
            if (!s0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    uVar2 = uVar3;
                    jVarArr = jVarArr2;
                    hVar2 = new x3.f((nb.a) v0Var.c, v0Var.a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new n3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new b4.a(0);
                } else {
                    int i14 = z10 ? 4 : 0;
                    int g10 = (v0Var.a ? i14 : i14 | 32) | z3.h.g(v0Var.b);
                    mVar = mVar2;
                    jVarArr = jVarArr2;
                    uVar2 = uVar3;
                    hVar2 = new z3.h((nb.a) v0Var.c, g10, null, arrayList, oVar2);
                }
                eVar2 = new y2.e(hVar2, i10, uVar2);
                y2.e eVar3 = eVar2;
                int i15 = i13;
                long j10 = d;
                jVarArr[i15] = new j(j10, mVar, bVar, eVar3, 0L, mVar.c());
                i13 = i15 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j10;
                i12 = 0;
            } else if (v0Var.a) {
                hVar2 = new c4.h(((nb.a) v0Var.c).f(uVar3), uVar3);
            } else {
                eVar2 = null;
                mVar = mVar2;
                jVarArr = jVarArr2;
                y2.e eVar32 = eVar2;
                int i152 = i13;
                long j102 = d;
                jVarArr[i152] = new j(j102, mVar, bVar, eVar32, 0L, mVar.c());
                i13 = i152 + 1;
                lVar = this;
                oVar2 = oVar;
                d = j102;
                i12 = 0;
            }
            mVar = mVar2;
            uVar2 = uVar3;
            jVarArr = jVarArr2;
            eVar2 = new y2.e(hVar2, i10, uVar2);
            y2.e eVar322 = eVar2;
            int i1522 = i13;
            long j1022 = d;
            jVarArr[i1522] = new j(j1022, mVar, bVar, eVar322, 0L, mVar.c());
            i13 = i1522 + 1;
            lVar = this;
            oVar2 = oVar;
            d = j1022;
            i12 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.c) {
            arrayList.addAll(((p2.a) list.get(i7)).c);
        }
        return arrayList;
    }

    public final j b(int i7) {
        j[] jVarArr = this.i;
        j jVar = jVarArr[i7];
        p2.b I = this.b.I(jVar.b.b);
        if (I == null || I.equals(jVar.c)) {
            return jVar;
        }
        j jVar2 = new j(jVar.e, jVar.b, I, jVar.a, jVar.f, jVar.d);
        jVarArr[i7] = jVar2;
        return jVar2;
    }
}
