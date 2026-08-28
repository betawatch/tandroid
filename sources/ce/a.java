package ce;

import fe.c;
import ie.p;
import ie.s;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements le.a {
    @Override // le.a
    public final int a(c cVar, c cVar2) {
        return (cVar.g < 2 || cVar2.g < 2) ? 0 : 2;
    }

    @Override // le.a
    public final void b(s sVar, s sVar2, int i9) {
        be.a aVar = new be.a();
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

    @Override // le.a
    public final char c() {
        return '~';
    }

    @Override // le.a
    public final int d() {
        return 2;
    }

    @Override // le.a
    public final char e() {
        return '~';
    }
}
