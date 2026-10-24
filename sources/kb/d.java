package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
