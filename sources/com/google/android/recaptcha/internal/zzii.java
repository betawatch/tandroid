package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzii {
    private final h26 zza;

    public zzii() {
        int i = zzby.zza;
        this.zza = ure.b(zzih.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzig) this.zza.getValue()).zzb(str)) {
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        openConnection.getClass();
        return (HttpURLConnection) openConnection;
    }
}
