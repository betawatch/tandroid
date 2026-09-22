package gb;

import java.util.Date;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class e implements db.v {
    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        if (aVar.a == Date.class) {
            return new h(g.a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
