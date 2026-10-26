package ib;

import java.net.InetAddress;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class p0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        if (aVar.x() != 9) {
            return InetAddress.getByName(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.r(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
