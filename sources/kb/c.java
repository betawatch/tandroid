package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
