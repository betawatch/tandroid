package lb;

import fb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
