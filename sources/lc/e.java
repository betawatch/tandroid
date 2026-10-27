package lc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e {
    public final jc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(c2.b bVar, jc.e eVar, int i10, int i11, int i12, e eVar2, jc.f fVar) {
        this.a = eVar;
        this.b = i10;
        jc.e eVar3 = jc.e.h;
        int i13 = (eVar == eVar3 || eVar2 == null) ? i11 : eVar2.c;
        this.c = i13;
        this.d = i12;
        this.e = eVar2;
        boolean z10 = false;
        int i14 = eVar2 != null ? eVar2.f : 0;
        if ((eVar == eVar3 && eVar2 == null && i13 != 0) || (eVar2 != null && i13 != eVar2.c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar2 == null || eVar != eVar2.a || z10) ? i14 + eVar.a(fVar) + 4 : i14;
        int ordinal = eVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i14 += ((String) bVar.b).substring(i10, i12 + i10).getBytes(((fc.d) bVar.c).a[i11].charset()).length * 8;
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
