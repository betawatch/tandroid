package l5;

import java.util.HashMap;
import org.telegram.ui.ss0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.f = new HashMap();
        mVar.d = Long.valueOf(sVar.a.d());
        mVar.e = Long.valueOf(sVar.b.d());
        mVar.a = this.b;
        mVar.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        mVar.b = aVar.a;
        q5.a aVar2 = (q5.a) bVar;
        aVar2.b.execute(new ss0(aVar2, b10, gVar, mVar.g(), 21));
    }
}
