package n5;

import g2.f0;
import java.util.HashMap;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r {
    public final i a;
    public final String b;
    public final k5.c c;
    public final k5.e d;
    public final s e;

    public r(i iVar, String str, k5.c cVar, k5.e eVar, s sVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(k5.a aVar, k5.g gVar) {
        k5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        s sVar = this.e;
        s5.b bVar = sVar.c;
        i b10 = this.a.b(aVar.c);
        f0 f0Var = new f0();
        f0Var.f = new HashMap();
        f0Var.d = Long.valueOf(sVar.a.o());
        f0Var.e = Long.valueOf(sVar.b.o());
        f0Var.a = this.b;
        f0Var.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        f0Var.b = aVar.a;
        k5.b bVar2 = aVar.d;
        if (bVar2 != null) {
            f0Var.g = bVar2.a;
        }
        s5.a aVar2 = (s5.a) bVar;
        aVar2.b.execute(new ih0(aVar2, b10, gVar, f0Var.b(), 27));
    }
}
