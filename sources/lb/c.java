package lb;

import fb.g;
import fb.u;
import fb.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
