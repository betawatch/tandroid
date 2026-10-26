package cf;

import bf.e;
import ef.g;
import ef.p;
import ef.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements hf.a {
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

    @Override // hf.a
    public final int a(e eVar, e eVar2) {
        if (eVar.d || eVar2.c) {
            int i10 = eVar2.h;
            if (i10 % 3 != 0 && (eVar.h + i10) % 3 == 0) {
                return 0;
            }
        }
        return (eVar.g < 2 || eVar2.g < 2) ? 1 : 2;
    }

    @Override // hf.a
    public final char b() {
        return this.a;
    }

    @Override // hf.a
    public final int c() {
        return 1;
    }

    @Override // hf.a
    public final void d(s sVar, s sVar2, int i10) {
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

    @Override // hf.a
    public final char e() {
        return this.a;
    }

    public a(char c10) {
        this.a = c10;
    }
}
