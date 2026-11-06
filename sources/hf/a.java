package hf;

import gf.e;
import kf.g;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a implements nf.a {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i7) {
        this('*');
        switch (i7) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // nf.a
    public final void a(s sVar, s sVar2, int i7) {
        String.valueOf(this.a);
        g gVar = i7 == 1 ? new g(0) : new g(3);
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

    @Override // nf.a
    public final char b() {
        return this.a;
    }

    @Override // nf.a
    public final int c(e eVar, e eVar2) {
        if (eVar.d || eVar2.c) {
            int i7 = eVar2.h;
            if (i7 % 3 != 0 && (eVar.h + i7) % 3 == 0) {
                return 0;
            }
        }
        return (eVar.g < 2 || eVar2.g < 2) ? 1 : 2;
    }

    @Override // nf.a
    public final int d() {
        return 1;
    }

    @Override // nf.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
