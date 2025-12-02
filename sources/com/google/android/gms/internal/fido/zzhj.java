package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzhj extends IOException {
    public zzhj(String str) {
        super(str);
    }

    public zzhj(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
