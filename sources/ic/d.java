package ic;

import ab.q;
import cc.f;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public final gc.d a;
    public final int b;
    public final int c;
    public final int d;
    public final d e;
    public final int f;

    public d(q qVar, gc.d dVar, int i7, int i10, int i11, d dVar2, gc.e eVar) {
        this.a = dVar;
        this.b = i7;
        gc.d dVar3 = gc.d.h;
        int i12 = (dVar == dVar3 || dVar2 == null) ? i10 : dVar2.c;
        this.c = i12;
        this.d = i11;
        this.e = dVar2;
        boolean z9 = false;
        int i13 = dVar2 != null ? dVar2.f : 0;
        if ((dVar == dVar3 && dVar2 == null && i12 != 0) || (dVar2 != null && i12 != dVar2.c)) {
            z9 = true;
        }
        int i14 = 4;
        i13 = (dVar2 == null || dVar != dVar2.a || z9) ? i13 + dVar.a(eVar) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i13 += ((String) qVar.b).substring(i7, i11 + i7).getBytes(((f) qVar.c).a[i10].charset()).length * 8;
                    if (z9) {
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
