package gb;

import java.util.UUID;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as UUID; at path ");
            w10.append(aVar.j());
            throw new db.j(w10.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
