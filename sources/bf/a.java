package bf;

import af.f;
import df.g;
import df.p;
import df.s;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements gf.a {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        this('*');
        switch (i10) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // gf.a
    public final char a() {
        return this.a;
    }

    @Override // gf.a
    public final void b(s sVar, s sVar2, int i10) {
        String.valueOf(this.a);
        g gVar = i10 == 1 ? new g(0) : new g(3);
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

    @Override // gf.a
    public final int c() {
        return 1;
    }

    @Override // gf.a
    public final int d(f fVar, f fVar2) {
        if (fVar.d || fVar2.c) {
            int i10 = fVar2.h;
            if (i10 % 3 != 0 && (fVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (fVar.g < 2 || fVar2.g < 2) ? 1 : 2;
    }

    @Override // gf.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
