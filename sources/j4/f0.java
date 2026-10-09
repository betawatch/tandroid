package j4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f0 {
    public final int a;
    public final int b;
    public int c;
    public final Object d;
    public Object e;

    public f0(int i10, int i11) {
        this(TLObject.FLAG_31, i10, i11);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        sc.h hVar = new sc.h();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i10 = 0;
        c5.b0 b0Var = null;
        int i11 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i12 = this.b;
            if ((i12 != 2 || (inetAddress instanceof Inet4Address)) && (i12 != 3 || (inetAddress instanceof Inet6Address))) {
                int i13 = i11 + this.c;
                c5.b0 b0Var2 = new c5.b0(i13, 10);
                arrayList.add(new sc.t(hVar, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((sc.a) this.e).b), this.a, b0Var, b0Var2));
                b0Var = b0Var2;
                i11 = i13;
            }
        }
        hVar.b = arrayList;
        hVar.a = new CountDownLatch(((ArrayList) hVar.b).size());
        ArrayList arrayList2 = (ArrayList) hVar.b;
        int size = arrayList2.size();
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((sc.t) obj).start();
        }
        ((CountDownLatch) hVar.a).await();
        Socket socket = (Socket) hVar.c;
        if (socket != null) {
            return socket;
        }
        Exception exc = (Exception) hVar.d;
        if (exc != null) {
            throw exc;
        }
        throw new sc.w(44, "No viable interface to connect");
    }

    public void b() {
        int i10 = this.c;
        this.c = i10 == Integer.MIN_VALUE ? this.a : i10 + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public void c() {
        if (this.c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public f0(int i10, int i11, int i12) {
        this.d = i10 != Integer.MIN_VALUE ? a1.g.n(i10, "/") : "";
        this.a = i11;
        this.b = i12;
        this.c = TLObject.FLAG_31;
        this.e = "";
    }

    public f0(SocketFactory socketFactory, sc.a aVar, int i10, int i11, int i12) {
        this.d = socketFactory;
        this.e = aVar;
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }
}
