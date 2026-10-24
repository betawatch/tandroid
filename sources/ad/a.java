package ad;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final InputStream a;
    public final Socket b;
    public final /* synthetic */ m c;

    public a(m mVar, InputStream inputStream, Socket socket) {
        this.c = mVar;
        this.a = inputStream;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OutputStream outputStream;
        InputStream inputStream = this.a;
        m mVar = this.c;
        Socket socket = this.b;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = socket.getOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            f fVar = new f(mVar, new e(0), this.a, outputStream, socket.getInetAddress());
            while (!socket.isClosed()) {
                fVar.c();
            }
            m.d(outputStream);
        } catch (Exception e7) {
            e = e7;
            outputStream2 = outputStream;
            if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                m.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
            }
            m.d(outputStream2);
            m.d(inputStream);
            m.d(socket);
            ((List) mVar.c.c).remove(this);
        } catch (Throwable th3) {
            th = th3;
            outputStream2 = outputStream;
            m.d(outputStream2);
            m.d(inputStream);
            m.d(socket);
            ((List) mVar.c.c).remove(this);
            throw th;
        }
        m.d(inputStream);
        m.d(socket);
        ((List) mVar.c.c).remove(this);
    }
}
