// default package

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fka {
    public final SocketFactory a;
    public final qa b;
    public final short c;
    public final int d;
    public final short e;

    /* JADX WARN: Multi-variable type inference failed */
    public fka(SocketFactory socketFactory, qa qaVar, int i, int i2, int i3) {
        this.a = socketFactory;
        this.b = qaVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final Socket a(InetAddress[] inetAddressArr) {
        wtc wtcVar = new wtc();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i = 0;
        dd ddVar = null;
        int i2 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i3 = this.d;
            if ((i3 != 2 || (inetAddress instanceof Inet4Address)) && (i3 != 3 || (inetAddress instanceof Inet6Address))) {
                int i4 = i2 + this.e;
                dd ddVar2 = new dd(i4, (byte) 17);
                arrayList.add(new eka(wtcVar, this.a, new InetSocketAddress(inetAddress, this.b.b), this.c, ddVar, ddVar2));
                ddVar = ddVar2;
                i2 = i4;
            }
        }
        wtcVar.b = arrayList;
        wtcVar.a = new CountDownLatch(((ArrayList) wtcVar.b).size());
        ArrayList arrayList2 = (ArrayList) wtcVar.b;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((eka) obj).start();
        }
        ((CountDownLatch) wtcVar.a).await();
        Socket socket = (Socket) wtcVar.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) wtcVar.d;
        if (exc != null) {
            throw exc;
        }
        throw new cuc(44, "No viable interface to connect");
    }
}
