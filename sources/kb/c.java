package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // eb.v
    public final u create(g gVar, lb.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new lb.a(Date.class)));
    }
}
