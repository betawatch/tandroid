package g2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import v7.s6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public class v extends j {
    public final int c;

    public v() {
        super(2008);
        this.c = 1;
    }

    public static v a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !s6.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new u("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new v(iOException, i11, i10);
    }

    public v(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.c = 1;
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
        this.c = i11;
    }

    public v(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.c = 1;
    }
}
