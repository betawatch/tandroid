package ge;

import fe.c;
import ie.g;
import ie.p;
import ie.s;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements le.a {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i9) {
        this('*');
        switch (i9) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // le.a
    public final int a(c cVar, c cVar2) {
        if (cVar.d || cVar2.c) {
            int i9 = cVar2.h;
            if (i9 % 3 != 0 && (cVar.h + i9) % 3 == 0) {
                return 0;
            }
        }
        return (cVar.g < 2 || cVar2.g < 2) ? 1 : 2;
    }

    @Override // le.a
    public final void b(s sVar, s sVar2, int i9) {
        String.valueOf(this.a);
        g gVar = i9 == 1 ? new g(0) : new g(3);
        p pVar = (p) sVar.f;
        while (pVar != null && pVar != sVar2) {
            p pVar2 = (p) pVar.f;
            gVar.b(pVar);
            pVar = pVar2;
        }
        gVar.g();
        p pVar3 = (p) sVar.f;
        gVar.f = pVar3;
        if (pVar3 != null) {
            pVar3.e = gVar;
        }
        gVar.e = sVar;
        sVar.f = gVar;
        p pVar4 = (p) sVar.b;
        gVar.b = pVar4;
        if (((p) gVar.f) == null) {
            pVar4.d = gVar;
        }
    }

    @Override // le.a
    public final char c() {
        return this.a;
    }

    @Override // le.a
    public final int d() {
        return 1;
    }

    @Override // le.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
