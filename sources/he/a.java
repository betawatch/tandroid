package he;

import ke.c;
import ne.p;
import ne.s;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements qe.a {
    @Override // qe.a
    public final void a(s sVar, s sVar2, int i10) {
        ge.a aVar = new ge.a();
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

    @Override // qe.a
    public final char b() {
        return '~';
    }

    @Override // qe.a
    public final int c(c cVar, c cVar2) {
        return (cVar.g < 2 || cVar2.g < 2) ? 0 : 2;
    }

    @Override // qe.a
    public final int d() {
        return 2;
    }

    @Override // qe.a
    public final char e() {
        return '~';
    }
}
