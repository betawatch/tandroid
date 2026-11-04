package fc;

import b4.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final dc.d a;
    public final int b;
    public final int c;
    public final int d;
    public final d e;
    public final int f;

    public d(n nVar, dc.d dVar, int i3, int i10, int i11, d dVar2, dc.e eVar) {
        this.a = dVar;
        this.b = i3;
        dc.d dVar3 = dc.d.h;
        int i12 = (dVar == dVar3 || dVar2 == null) ? i10 : dVar2.c;
        this.c = i12;
        this.d = i11;
        this.e = dVar2;
        boolean z10 = false;
        int i13 = dVar2 != null ? dVar2.f : 0;
        if ((dVar == dVar3 && dVar2 == null && i12 != 0) || (dVar2 != null && i12 != dVar2.c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (dVar2 == null || dVar != dVar2.a || z10) ? i13 + dVar.a(eVar) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i13 += ((String) nVar.b).substring(i3, i11 + i3).getBytes(((zb.d) nVar.c).a[i10].charset()).length * 8;
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
