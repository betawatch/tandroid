package g2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import v7.r6;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class v extends j {
    public final int c;

    public v() {
        super(2008);
        this.c = 1;
    }

    public static v a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !r6.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
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
