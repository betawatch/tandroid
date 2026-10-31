package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import ib.a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i10 = zzby.zza;
        this.zza = a.a(zzih.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzig) ((h) this.zza).a()).zzb(str)) {
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
