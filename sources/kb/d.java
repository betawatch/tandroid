package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
