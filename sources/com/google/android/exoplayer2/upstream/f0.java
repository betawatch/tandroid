package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class f0 extends n {
    public final int c;

    public f0() {
        super(2008);
        this.c = 1;
    }

    public static f0 a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !h7.d0.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new e0("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new f0(iOException, i11, i10);
    }

    public f0(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(IOException iOException, int i10, int i11) {
        super(iOException, i10);
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        this.c = i11;
    }

    public f0(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.c = 1;
    }
}
