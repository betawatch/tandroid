package ef;

import df.e;
import gf.g;
import gf.p;
import gf.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements kf.a {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i3) {
        this('*');
        switch (i3) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // kf.a
    public final int a(e eVar, e eVar2) {
        if (eVar.d || eVar2.c) {
            int i3 = eVar2.h;
            if (i3 % 3 != 0 && (eVar.h + i3) % 3 == 0) {
                return 0;
            }
        }
        return (eVar.g < 2 || eVar2.g < 2) ? 1 : 2;
    }

    @Override // kf.a
    public final char b() {
        return this.a;
    }

    @Override // kf.a
    public final void c(s sVar, s sVar2, int i3) {
        String.valueOf(this.a);
        g gVar = i3 == 1 ? new g(0) : new g(3);
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

    @Override // kf.a
    public final int d() {
        return 1;
    }

    @Override // kf.a
    public final char e() {
        return this.a;
    }

    public a(char c2) {
        this.a = c2;
    }
}
