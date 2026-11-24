// default package

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class jg5 extends r63 {
    public final byte b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jg5(IOException iOException, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.b = i2;
    }

    public static jg5 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !smd.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new ig5("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new jg5(iOException, i2, i);
    }

    public jg5(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }

    public jg5() {
        super(2008);
        this.b = (byte) 1;
    }

    public jg5(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }
}
