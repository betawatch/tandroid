package fe;

import ie.c;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements oe.a {
    @Override // oe.a
    public final void a(s sVar, s sVar2, int i10) {
        ee.a aVar = new ee.a();
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

    @Override // oe.a
    public final char b() {
        return '~';
    }

    @Override // oe.a
    public final int c(c cVar, c cVar2) {
        return (cVar.g < 2 || cVar2.g < 2) ? 0 : 2;
    }

    @Override // oe.a
    public final int d() {
        return 2;
    }

    @Override // oe.a
    public final char e() {
        return '~';
    }
}
