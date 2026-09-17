package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
