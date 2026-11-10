package o5;

import h2.e0;
import java.util.HashMap;
import org.telegram.ui.mo0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r {
    public final i a;
    public final String b;
    public final l5.c c;
    public final l5.e d;
    public final s e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        s sVar = this.e;
        t5.b bVar = sVar.c;
        i b10 = this.a.b(aVar.c);
        e0 e0Var = new e0();
        e0Var.f = new HashMap();
        e0Var.d = Long.valueOf(sVar.a.s());
        e0Var.e = Long.valueOf(sVar.b.s());
        e0Var.a = this.b;
        e0Var.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        e0Var.b = aVar.a;
        l5.b bVar2 = aVar.d;
        if (bVar2 != null) {
            e0Var.g = bVar2.a;
        }
        t5.a aVar2 = (t5.a) bVar;
        aVar2.b.execute(new mo0(aVar2, b10, gVar, e0Var.b(), 26));
    }
}
