package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzfq extends IOException {
    public zzfq(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzfq(String str) {
        super(str);
    }
}
