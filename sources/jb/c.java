package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
