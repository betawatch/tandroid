package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
