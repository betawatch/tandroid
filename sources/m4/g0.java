package m4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g0 {
    public final int a;
    public final int b;
    public int c;
    public final Object d;
    public Object e;

    public g0(int i7, int i10) {
        this(TLObject.FLAG_31, i7, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        rc.h hVar = new rc.h();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i7 = 0;
        f5.u uVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.c;
                f5.u uVar2 = new f5.u(i12, 15);
                arrayList.add(new rc.t(hVar, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((rc.a) this.e).b), this.a, uVar, uVar2));
                uVar = uVar2;
                i10 = i12;
            }
        }
        hVar.b = arrayList;
        hVar.a = new CountDownLatch(((ArrayList) hVar.b).size());
        ArrayList arrayList2 = (ArrayList) hVar.b;
        int size = arrayList2.size();
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((rc.t) obj).start();
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
        throw new rc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i7 = this.c;
        this.c = i7 == Integer.MIN_VALUE ? this.a : i7 + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public void c() {
        if (this.c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public g0(int i7, int i10, int i11) {
        this.d = i7 != Integer.MIN_VALUE ? com.google.android.recaptcha.internal.a.i(i7, "/") : "";
        this.a = i10;
        this.b = i11;
        this.c = TLObject.FLAG_31;
        this.e = "";
    }

    public g0(SocketFactory socketFactory, rc.a aVar, int i7, int i10, int i11) {
        this.d = socketFactory;
        this.e = aVar;
        this.a = i7;
        this.b = i10;
        this.c = i11;
    }
}
