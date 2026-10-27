package com.google.android.recaptcha.internal;

import a8.id;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jd.c;
import jd.g;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzii {
    private final c zza;

    public zzii() {
        int i10 = zzby.zza;
        this.zza = id.a(zzih.zza);
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
