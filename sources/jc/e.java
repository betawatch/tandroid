package jc;

import com.google.firebase.messaging.m;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e {
    public final hc.e a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(m mVar, hc.e eVar, int i10, int i11, int i12, e eVar2, hc.f fVar) {
        this.a = eVar;
        this.b = i10;
        hc.e eVar3 = hc.e.h;
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
