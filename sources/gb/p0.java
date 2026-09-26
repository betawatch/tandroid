package gb;

import java.net.InetAddress;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public class p0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() != 9) {
            return InetAddress.getByName(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.r(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
