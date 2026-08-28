package com.google.android.recaptcha.internal;

import g7.x5;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i9 = zzby.zza;
        this.zza = x5.a(zzih.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzig) ((g) this.zza).a()).zzb(str)) {
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
