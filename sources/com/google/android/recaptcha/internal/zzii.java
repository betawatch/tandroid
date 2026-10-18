package com.google.android.recaptcha.internal;

import id.c;
import id.g;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;
import v7.h8;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i10 = zzby.zza;
        this.zza = h8.a(zzih.zza);
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
