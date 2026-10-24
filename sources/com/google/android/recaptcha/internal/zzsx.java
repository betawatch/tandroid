package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
