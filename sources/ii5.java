// default package

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ii5 extends d83 {
    public final byte b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ii5(IOException iOException, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = i2;
    }

    public static ii5 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !vod.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new hi5("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new ii5(iOException, i2, i);
    }

    public ii5(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }

    public ii5() {
        super(2008);
        this.b = (byte) 1;
    }

    public ii5(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }
}
