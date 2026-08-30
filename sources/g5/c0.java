package g5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import k7.z6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class c0 extends n {
    public final int c;

    public c0() {
        super(2008);
        this.c = 1;
    }

    public static c0 a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !z6.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new b0("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new c0(iOException, i11, i10);
    }

    public c0(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(IOException iOException, int i10, int i11) {
        super(iOException, i10);
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        this.c = i11;
    }

    public c0(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.c = 1;
    }
}
