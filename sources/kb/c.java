package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
