package lc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends Thread {
    public final h a;
    public final SocketFactory b;
    public final InetSocketAddress c;
    public final int d;
    public final c5.x e;
    public final c5.x f;

    public u(h hVar, SocketFactory socketFactory, InetSocketAddress inetSocketAddress, int i10, c5.x xVar, c5.x xVar2) {
        this.a = hVar;
        this.b = socketFactory;
        this.c = inetSocketAddress;
        this.d = i10;
        this.e = xVar;
        this.f = xVar2;
    }

    public final void a(Exception exc) {
        synchronized (this.a) {
            try {
                if (((CountDownLatch) this.f.c).getCount() == 0) {
                    return;
                }
                this.a.a(exc);
                ((CountDownLatch) this.f.c).countDown();
            } finally {
            }
        }
    }

    public final void b(Socket socket) {
        synchronized (this.a) {
            try {
                if (((CountDownLatch) this.f.c).getCount() == 0) {
                    return;
                }
                this.a.b(this, socket);
                ((CountDownLatch) this.f.c).countDown();
            } finally {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10;
        Socket socket = null;
        try {
            c5.x xVar = this.e;
            if (xVar != null) {
                ((CountDownLatch) xVar.c).await(xVar.b, TimeUnit.MILLISECONDS);
            }
            h hVar = this.a;
            synchronized (hVar) {
                z10 = ((Socket) hVar.c) != null;
            }
            if (z10) {
                return;
            }
            Socket createSocket = this.b.createSocket();
            int i10 = r.a;
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
