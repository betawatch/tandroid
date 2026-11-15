package ic;

import ab.q;
import gc.f;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d {
    public final gc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final d e;
    public final int f;

    public d(q qVar, gc.e eVar, int i7, int i10, int i11, d dVar, f fVar) {
        this.a = eVar;
        this.b = i7;
        gc.e eVar2 = gc.e.h;
        int i12 = (eVar == eVar2 || dVar == null) ? i10 : dVar.c;
        this.c = i12;
        this.d = i11;
        this.e = dVar;
        boolean z10 = false;
        int i13 = dVar != null ? dVar.f : 0;
        if ((eVar == eVar2 && dVar == null && i12 != 0) || (dVar != null && i12 != dVar.c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (dVar == null || eVar != dVar.a || z10) ? i13 + eVar.a(fVar) + 4 : i13;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i13 += ((String) qVar.b).substring(i7, i11 + i7).getBytes(((cc.f) qVar.c).a[i10].charset()).length * 8;
                    if (z10) {
                        i13 += 12;
                    }
                } else if (ordinal == 6) {
                    i13 += 13;
                }
                this.f = i13;
            }
            i14 = i11 == 1 ? 6 : 11;
        } else if (i11 != 1) {
            i14 = i11 == 2 ? 7 : 10;
        }
        i13 += i14;
        this.f = i13;
    }
}
