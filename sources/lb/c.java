package lb;

import fb.g;
import fb.u;
import fb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // fb.v
    public final u create(g gVar, mb.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new mb.a(Date.class)));
    }
}
