package lb;

import fb.u;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
