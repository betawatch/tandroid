package o5;

import h2.e0;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s {
    public final i a;
    public final String b;
    public final l5.c c;
    public final l5.e d;
    public final t e;

    public s(i iVar, String str, l5.c cVar, l5.e eVar, t tVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        t tVar = this.e;
        t5.c cVar = tVar.c;
        i b10 = this.a.b(aVar.c);
        e0 e0Var = new e0();
        e0Var.f = new HashMap();
        e0Var.d = Long.valueOf(tVar.a.s());
        e0Var.e = Long.valueOf(tVar.b.s());
        e0Var.a = this.b;
        e0Var.c = new m(this.c, (byte[]) eVar.apply(aVar.b));
        e0Var.b = aVar.a;
        l5.b bVar = aVar.d;
        if (bVar != null) {
            e0Var.g = bVar.a;
        }
        t5.b bVar2 = (t5.b) cVar;
        bVar2.b.execute(new t5.a(bVar2, b10, gVar, e0Var.b(), 0));
    }
}
