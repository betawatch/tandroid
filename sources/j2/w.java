package j2;

import a8.ga;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class w extends j {
    public final int b;

    public w() {
        super(2008);
        this.b = 1;
    }

    public static w a(IOException iOException, int i7) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ga.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new v("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new w(iOException, i10, i7);
    }

    public w(String str, int i7) {
        super(str, i7 == 2000 ? 2001 : i7);
        this.b = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(IOException iOException, int i7, int i10) {
        super(iOException, i7);
        if (i7 == 2000 && i10 == 1) {
            i7 = 2001;
        }
        this.b = i10;
    }

    public w(String str, IOException iOException, int i7) {
        super(str, iOException, i7 == 2000 ? 2001 : i7);
        this.b = 1;
    }
}
