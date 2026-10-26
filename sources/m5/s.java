package m5;

import aa.m0;
import java.util.HashMap;
import org.telegram.ui.ag0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s {
    public final i a;
    public final String b;
    public final j5.c c;
    public final j5.e d;
    public final t e;

    public s(i iVar, String str, j5.c cVar, j5.e eVar, t tVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(j5.a aVar, j5.g gVar) {
        j5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        t tVar = this.e;
        r5.b bVar = tVar.c;
        i b10 = this.a.b(aVar.c);
        m0 m0Var = new m0();
        m0Var.f = new HashMap();
        m0Var.a = Long.valueOf(tVar.a.o());
        m0Var.e = Long.valueOf(tVar.b.o());
        m0Var.b = this.b;
        m0Var.d = new m(this.c, (byte[]) eVar.apply(aVar.b));
        m0Var.c = aVar.a;
        r5.a aVar2 = (r5.a) bVar;
        aVar2.b.execute(new ag0(aVar2, b10, gVar, m0Var.h(), 29));
    }
}
