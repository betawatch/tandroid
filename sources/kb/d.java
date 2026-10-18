package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
