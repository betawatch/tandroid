package df;

import gf.e;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements nf.a {
    @Override // nf.a
    public final void a(s sVar, s sVar2, int i7) {
        cf.a aVar = new cf.a();
        p pVar = (p) sVar.f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f;
            aVar.b(pVar);
            pVar = pVar2;
        }
        aVar.g();
        p pVar3 = (p) sVar.f;
        aVar.f = pVar3;
        if (pVar3 != null) {
            pVar3.e = aVar;
        }
        aVar.e = sVar;
        sVar.f = aVar;
        p pVar4 = (p) sVar.b;
        aVar.b = pVar4;
        if (((p) aVar.f) == null) {
            pVar4.d = aVar;
        }
    }

    @Override // nf.a
    public final char b() {
        return '~';
    }

    @Override // nf.a
    public final int c(e eVar, e eVar2) {
        return (eVar.g < 2 || eVar2.g < 2) ? 0 : 2;
    }

    @Override // nf.a
    public final int d() {
        return 2;
    }

    @Override // nf.a
    public final char e() {
        return '~';
    }
}
