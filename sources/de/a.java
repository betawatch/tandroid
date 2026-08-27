package de;

import ge.c;
import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements me.a {
    @Override // me.a
    public final char a() {
        return '~';
    }

    @Override // me.a
    public final void b(s sVar, s sVar2, int i10) {
        ce.a aVar = new ce.a();
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

    @Override // me.a
    public final int c(c cVar, c cVar2) {
        return (cVar.g < 2 || cVar2.g < 2) ? 0 : 2;
    }

    @Override // me.a
    public final int d() {
        return 2;
    }

    @Override // me.a
    public final char e() {
        return '~';
    }
}
