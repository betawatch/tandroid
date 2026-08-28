package gc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            d dVar = new d(kVar, new android.support.v4.media.c(15), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                dVar.c();
            }
            k.d(outputStream);
        } catch (Exception e11) {
            e = e11;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                k.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            k.d(outputStream2);
            k.d(inputStream);
            k.d(socket);
            ((List) kVar.c.c).remove(this);
        } catch (Throwable th2) {
            th = th2;
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
