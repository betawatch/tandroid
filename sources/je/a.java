package je;

import ie.c;
import le.g;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements oe.a {
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

    @Override // oe.a
    public final void a(s sVar, s sVar2, int i10) {
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

    @Override // oe.a
    public final char b() {
        return this.a;
    }

    @Override // oe.a
    public final int c(c cVar, c cVar2) {
        if (cVar.d || cVar2.c) {
            int i10 = cVar2.h;
            if (i10 % 3 != 0 && (cVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (cVar.g < 2 || cVar2.g < 2) ? 1 : 2;
    }

    @Override // oe.a
    public final int d() {
        return 1;
    }

    @Override // oe.a
    public final char e() {
        return this.a;
    }

    public a(char c3) {
        this.a = c3;
    }
}
