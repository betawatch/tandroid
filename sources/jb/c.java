package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
