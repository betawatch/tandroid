// default package

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gma {
    public final SocketFactory a;
    public final qa b;
    public final short c;
    public final int d;
    public final short e;

    /* JADX WARN: Multi-variable type inference failed */
    public gma(SocketFactory socketFactory, qa qaVar, int i, int i2, int i3) {
        this.a = socketFactory;
        this.b = qaVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final Socket a(InetAddress[] inetAddressArr) {
        e7a e7aVar = new e7a();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i = 0;
        de deVar = null;
        int i2 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i3 = this.d;
            if ((i3 != 2 || (inetAddress instanceof Inet4Address)) && (i3 != 3 || (inetAddress instanceof Inet6Address))) {
                int i4 = i2 + this.e;
                de deVar2 = new de(i4, (byte) 17);
                arrayList.add(new fma(e7aVar, this.a, new InetSocketAddress(inetAddress, this.b.b), this.c, deVar, deVar2));
                deVar = deVar2;
                i2 = i4;
            }
        }
        e7aVar.b = arrayList;
        e7aVar.a = new CountDownLatch(((ArrayList) e7aVar.b).size());
        ArrayList arrayList2 = (ArrayList) e7aVar.b;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((fma) obj).start();
        }
        ((CountDownLatch) e7aVar.a).await();
        Socket socket = (Socket) e7aVar.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) e7aVar.d;
        if (exc != null) {
            throw exc;
        }
        throw new dwc(44, "No viable interface to connect");
    }
}
