package gb;

import java.util.UUID;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class q0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as UUID; at path ");
            v9.append(aVar.j());
            throw new db.j(v9.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
