package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
