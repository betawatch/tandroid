package l5;

import java.util.HashMap;
import org.telegram.ui.hs0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class s {
    public final i a;
    public final String b;
    public final i5.c c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.a = iVar;
        this.b = str;
        this.c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        t tVar = this.e;
        q5.b bVar = tVar.c;
        i b10 = this.a.b(aVar.c);
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        nVar.f = new HashMap();
        nVar.d = Long.valueOf(tVar.a.q());
        nVar.e = Long.valueOf(tVar.b.q());
        nVar.a = this.b;
        nVar.c = new m(this.c, (byte[]) eVar.apply(aVar.b));
        nVar.b = aVar.a;
        q5.a aVar2 = (q5.a) bVar;
        aVar2.b.execute(new hs0(aVar2, b10, gVar, nVar.g(), 22));
    }
}
