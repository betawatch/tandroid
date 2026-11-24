// default package

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fma extends Thread {
    public final e7a a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final short d;
    public final de e;
    public final de f;

    /* JADX WARN: Multi-variable type inference failed */
    public fma(e7a e7aVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i, de deVar, de deVar2) {
        this.a = e7aVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i;
        this.e = deVar;
        this.f = deVar2;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.H(exc);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    public final void b(Socket socket) {
        synchronized (this.a) {
            if (((CountDownLatch) this.f.c).getCount() == 0) {
                return;
            }
            this.a.J(this, socket);
            ((CountDownLatch) this.f.c).countDown();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        Socket socket = null;
        try {
            de deVar = this.e;
            if (deVar != null) {
                ((CountDownLatch) deVar.c).await(deVar.b, TimeUnit.MILLISECONDS);
            }
            e7a e7aVar = this.a;
            synchronized (e7aVar) {
                z = ((Socket) e7aVar.c) != null;
            }
            if (z) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i = iq9.a;
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
