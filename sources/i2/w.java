package i2;

import b8.xb;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class w extends k {
    public final int b;

    public w() {
        super(2008);
        this.b = 1;
    }

    public static w a(IOException iOException, int i3) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !xb.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new v("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new w(iOException, i10, i3);
    }

    public w(String str, int i3) {
        super(str, i3 == 2000 ? 2001 : i3);
        this.b = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(IOException iOException, int i3, int i10) {
        super(iOException, i3);
        if (i3 == 2000 && i10 == 1) {
            i3 = 2001;
        }
        this.b = i10;
    }

    public w(String str, IOException iOException, int i3) {
        super(str, iOException, i3 == 2000 ? 2001 : i3);
        this.b = 1;
    }
}
