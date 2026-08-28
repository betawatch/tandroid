package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class f0 extends n {
    public final int c;

    public f0() {
        super(2008);
        this.c = 1;
    }

    public static f0 a(IOException iOException, int i9) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !g7.b0.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new e0("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new f0(iOException, i10, i9);
    }

    public f0(String str, int i9) {
        super(str, i9 == 2000 ? 2001 : i9);
        this.c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(IOException iOException, int i9, int i10) {
        super(iOException, i9);
        if (i9 == 2000 && i10 == 1) {
            i9 = 2001;
        }
        this.c = i10;
    }

    public f0(String str, IOException iOException, int i9) {
        super(str, iOException, i9 == 2000 ? 2001 : i9);
        this.c = 1;
    }
}
