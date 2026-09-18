package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;
import v7.s7;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i10 = zzby.zza;
        this.zza = s7.a(zzih.zza);
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
