package l4;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f0 {
    public final int a;
    public final int b;
    public int c;
    public final Object d;
    public Object e;

    public f0(int i3, int i10) {
        this(TLObject.FLAG_31, i3, i10);
    }

    public Socket a(InetAddress[] inetAddressArr) {
        oc.h hVar = new oc.h();
        ArrayList arrayList = new ArrayList(inetAddressArr.length);
        int i3 = 0;
        e5.u uVar = null;
        int i10 = 0;
        for (InetAddress inetAddress : inetAddressArr) {
            int i11 = this.b;
            if ((i11 != 2 || (inetAddress instanceof Inet4Address)) && (i11 != 3 || (inetAddress instanceof Inet6Address))) {
                int i12 = i10 + this.c;
                e5.u uVar2 = new e5.u(i12, 10);
                arrayList.add(new oc.t(hVar, (SocketFactory) this.d, new InetSocketAddress(inetAddress, ((oc.a) this.e).b), this.a, uVar, uVar2));
                uVar = uVar2;
                i10 = i12;
            }
        }
        hVar.b = arrayList;
        hVar.a = new CountDownLatch(((ArrayList) hVar.b).size());
        ArrayList arrayList2 = (ArrayList) hVar.b;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ((oc.t) obj).start();
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
        throw new oc.v(44, "No viable interface to connect");
    }

    public void b() {
        int i3 = this.c;
        this.c = i3 == Integer.MIN_VALUE ? this.a : i3 + this.b;
        this.e = ((String) this.d) + this.c;
    }

    public void c() {
        if (this.c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public f0(int i3, int i10, int i11) {
        this.d = i3 != Integer.MIN_VALUE ? com.google.android.recaptcha.internal.a.h(i3, "/") : "";
        this.a = i10;
        this.b = i11;
        this.c = TLObject.FLAG_31;
        this.e = "";
    }

    public f0(SocketFactory socketFactory, oc.a aVar, int i3, int i10, int i11) {
        this.d = socketFactory;
        this.e = aVar;
        this.a = i3;
        this.b = i10;
        this.c = i11;
    }
}
