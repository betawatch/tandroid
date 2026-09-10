package jc;

import com.google.firebase.messaging.m;
import hc.g;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e {
    public final hc.f a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(m mVar, hc.f fVar, int i10, int i11, int i12, e eVar, g gVar) {
        this.a = fVar;
        this.b = i10;
        hc.f fVar2 = hc.f.h;
        int i13 = (fVar == fVar2 || eVar == null) ? i11 : eVar.c;
        this.c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z10 = false;
        int i14 = eVar != null ? eVar.f : 0;
        if ((fVar == fVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || fVar != eVar.a || z10) ? i14 + fVar.a(gVar) + 4 : i14;
        int ordinal = fVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i14 += ((String) mVar.b).substring(i10, i12 + i10).getBytes(((dc.e) mVar.c).a[i11].charset()).length * 8;
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
