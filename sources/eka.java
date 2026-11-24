// default package

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eka extends Thread {
    public final wtc a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final dd e;
    public final dd f;

    /* JADX WARN: Multi-variable type inference failed */
    public eka(wtc wtcVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, dd ddVar, dd ddVar2) {
        this.a = wtcVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = ddVar;
        this.f = ddVar2;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.A(exc);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    public final void b(Socket socket) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.C(this, socket);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        Socket socket = null;
        try {
            dd ddVar = this.e;
            if (ddVar != null) {
                ((CountDownLatch) ddVar.c).await(ddVar.b, TimeUnit.MILLISECONDS);
            }
            wtc wtcVar = this.a;
            synchronized (wtcVar) {
                z = ((Socket) wtcVar.c) != null;
            }
            if (z) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i = go9.a;
            createSocket.connect(this.c, this.d);
            b(createSocket);
        } catch (Exception e) {
            a(e);
            if (0 != 0) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
