package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
