package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
