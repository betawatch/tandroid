package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
