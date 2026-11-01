package l5;

import java.util.HashMap;
import org.telegram.ui.ox0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        q5.c cVar = sVar.c;
        i b10 = this.a.b(aVar.c);
        j2.f fVar = new j2.f();
        fVar.f = new HashMap();
        fVar.d = Long.valueOf(sVar.a.g());
        fVar.e = Long.valueOf(sVar.b.g());
        fVar.a = this.b;
        fVar.c = new l(this.c, (byte[]) eVar.apply(aVar.b));
        fVar.b = aVar.a;
        q5.b bVar = (q5.b) cVar;
        bVar.b.execute(new ox0(bVar, b10, gVar, fVar.f(), 12));
    }
}
