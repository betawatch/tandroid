// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dk5 implements Closeable {
    public final URL a;
    public volatile Future b;
    public Task c;

    public dk5(URL url) {
        this.a = url;
    }

    public final Bitmap a() {
        byte[] a;
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            k93.f("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            a51 a51Var = new a51(inputStream);
            ArrayDeque arrayDeque = new ArrayDeque(20);
            int i = 128;
            int i2 = 0;
            loop0: while (true) {
                if (i2 < 2147483639) {
                    int min = Math.min(i, 2147483639 - i2);
                    byte[] bArr = new byte[min];
                    arrayDeque.add(bArr);
                    int i3 = 0;
                    while (i3 < min) {
                        int read = a51Var.read(bArr, i3, min - i3);
                        if (read == -1) {
                            a = bqd.a(arrayDeque, i2);
                            break loop0;
                        }
                        i3 += read;
                        i2 += read;
                    }
                    long j = i * (i < 4096 ? 4 : 2);
                    i = j > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j < -2147483648L ? TLObject.FLAG_31 : (int) j;
                } else {
                    if (a51Var.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                    a = bqd.a(arrayDeque, 2147483639);
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + a.length + " bytes from " + url);
            }
            if (a.length > 1048576) {
                k93.f("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
            if (decodeByteArray == null) {
                ag.e(url, "Failed to decode image: ");
                return null;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
            }
            return decodeByteArray;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}
