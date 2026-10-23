package l5;

import java.util.HashMap;
import org.telegram.ui.fn0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        lVar.f = new HashMap();
        lVar.d = Long.valueOf(tVar.a.d());
        lVar.e = Long.valueOf(tVar.b.d());
        lVar.a = this.b;
        lVar.c = new m(this.c, (byte[]) eVar.apply(aVar.b));
        lVar.b = aVar.a;
        q5.a aVar2 = (q5.a) bVar;
        aVar2.b.execute(new fn0(aVar2, b10, gVar, lVar.h(), 26));
    }
}
