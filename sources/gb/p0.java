package gb;

import java.net.InetAddress;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
