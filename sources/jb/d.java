package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
