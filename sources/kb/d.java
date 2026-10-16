package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
