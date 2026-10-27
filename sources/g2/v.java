package g2;

import a8.wb;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class v extends j {
    public final int b;

    public v() {
        super(2008);
        this.b = 1;
    }

    public static v a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !wb.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new v(iOException, i11, i10);
    }

    public v(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.b = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(IOException iOException, int i10, int i11) {
        super(iOException, i10);
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        this.b = i11;
    }

    public v(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.b = 1;
    }
}
