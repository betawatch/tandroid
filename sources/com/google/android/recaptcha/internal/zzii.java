package com.google.android.recaptcha.internal;

import a8.bb;
import gd.c;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i7 = zzby.zza;
        this.zza = bb.b(zzih.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzig) this.zza.getValue()).zzb(str)) {
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        }
        URLConnection openConnection = new URL(str).openConnection();
        j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
