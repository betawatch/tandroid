package com.google.android.recaptcha.internal;

import a8.ab;
import gd.c;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i7 = zzby.zza;
        this.zza = ab.b(zzih.zza);
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
