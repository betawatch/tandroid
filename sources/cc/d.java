package cc;

import ac.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public final ac.f a;
    public final int b;
    public final int c;
    public final int d;
    public final d e;
    public final int f;

    public d(ac.a aVar, ac.f fVar, int i10, int i11, int i12, d dVar, h hVar) {
        this.a = fVar;
        this.b = i10;
        ac.f fVar2 = ac.f.h;
        int i13 = (fVar == fVar2 || dVar == null) ? i11 : dVar.c;
        this.c = i13;
        this.d = i12;
        this.e = dVar;
        boolean z10 = false;
        int i14 = dVar != null ? dVar.f : 0;
        if ((fVar == fVar2 && dVar == null && i13 != 0) || (dVar != null && i13 != dVar.c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (dVar == null || fVar != dVar.a || z10) ? i14 + fVar.a(hVar) + 4 : i14;
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i14 += ((String) aVar.b).substring(i10, i12 + i10).getBytes(((wb.d) aVar.c).a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                } else if (ordinal == 6) {
                    i14 += 13;
                }
                this.f = i14;
            }
            i15 = i12 == 1 ? 6 : 11;
        } else if (i12 != 1) {
            i15 = i12 == 2 ? 7 : 10;
        }
        i14 += i15;
        this.f = i14;
    }
}
