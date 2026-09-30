package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // db.v
    public final u create(g gVar, kb.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new kb.a(Date.class)));
    }
}
