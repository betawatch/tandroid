package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
