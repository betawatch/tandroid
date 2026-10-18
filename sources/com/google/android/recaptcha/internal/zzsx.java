package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class zzsx extends IOException {
    private boolean zza;

    public zzsx(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzsx(String str) {
        super(str);
    }
}
