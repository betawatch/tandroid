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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dm5 implements Closeable {
    public final URL a;
    public volatile Future b;
    public Task c;

    public dm5(URL url) {
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
            wa3.d("Content-Length exceeds max size of 1048576");
            return null;
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            h61 h61Var = new h61(inputStream);
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
                        int read = h61Var.read(bArr, i3, min - i3);
                        if (read == -1) {
                            a = esd.a(arrayDeque, i2);
                            break loop0;
                        }
                        i3 += read;
                        i2 += read;
                    }
                    long j = i * (i < 4096 ? 4 : 2);
                    i = j > 2147483647L ? ConnectionsManager.DEFAULT_DATACENTER_ID : j < -2147483648L ? TLObject.FLAG_31 : (int) j;
                } else {
                    if (h61Var.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                    a = esd.a(arrayDeque, 2147483639);
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + a.length + " bytes from " + url);
            }
            if (a.length > 1048576) {
                wa3.d("Image exceeds max size of 1048576");
                return null;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
            if (decodeByteArray == null) {
                zg.e(url, "Failed to decode image: ");
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
