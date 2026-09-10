package l5;

import java.util.HashMap;
import org.telegram.ui.fy0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class r {
    public final i a;
    public final String b;
    public final i5.c c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        s sVar = this.e;
        q5.b bVar = sVar.c;
        i b10 = this.a.b(aVar.c);
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        nVar.f = new HashMap();
        nVar.d = Long.valueOf(sVar.a.u());
        nVar.e = Long.valueOf(sVar.b.u());
        nVar.a = this.b;
        nVar.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        nVar.b = aVar.a;
        q5.a aVar2 = (q5.a) bVar;
        aVar2.b.execute(new fy0(aVar2, b10, gVar, nVar.g(), 20));
    }
}
