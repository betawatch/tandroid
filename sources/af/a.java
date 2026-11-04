package af;

import df.e;
import gf.p;
import gf.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements kf.a {
    @Override // kf.a
    public final int a(e eVar, e eVar2) {
        return (eVar.g < 2 || eVar2.g < 2) ? 0 : 2;
    }

    @Override // kf.a
    public final char b() {
        return '~';
    }

    @Override // kf.a
    public final void c(s sVar, s sVar2, int i3) {
        ze.a aVar = new ze.a();
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

    @Override // kf.a
    public final int d() {
        return 2;
    }

    @Override // kf.a
    public final char e() {
        return '~';
    }
}
