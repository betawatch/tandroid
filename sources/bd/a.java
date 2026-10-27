package bd;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final /* synthetic */ k c;

    public a(k kVar, InputStream inputStream, Socket socket) {
        this.c = kVar;
        this.a = inputStream;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        k kVar = this.c;
        Socket socket = this.b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            d dVar = new d(kVar, new rb.c(8), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            k.d(outputStream);
        } catch (Exception e10) {
            e = e10;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                k.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.c.c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.c.c).remove(this);
            throw th;
        }
        k.d(inputStream);
        k.d(socket);
        ((List) kVar.c.c).remove(this);
    }
}
