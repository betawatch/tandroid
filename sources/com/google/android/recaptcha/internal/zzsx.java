package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
