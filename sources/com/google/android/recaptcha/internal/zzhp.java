package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzhp implements zzhn {
    private final Lazy zza;

    public zzhp() {
        int i = zzby.zza;
        this.zza = LazyKt.lazy(zzho.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final zzxn zza(String str, zzzd zzzdVar) {
        zzhl zzhlVar = null;
        try {
            try {
                zzhlVar = ((zzhm) this.zza.getValue()).zza(str);
                zzhlVar.zzc();
                zzhlVar.zze(zzzdVar.zzd());
                zzts zza = zzhlVar.zza(zzxn.zzj());
                Intrinsics.checkNotNull(zza);
                zzxn zzxnVar = (zzxn) zza;
                zzhlVar.zzd();
                return zzxnVar;
            } catch (zzcg e) {
                if (zzhlVar == null) {
                    throw e;
                }
                if (!Intrinsics.areEqual(e.zza(), zzcd.zzax)) {
                    throw e;
                }
                try {
                    throw zzcf.zza(zzzj.zzg(zzhlVar.zzb().getErrorStream()).zzi());
                } catch (Exception e2) {
                    throw new zzcg(zzce.zzc, zzcd.zzG, e2.getMessage(), null, 8, null);
                }
            } catch (Exception e3) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e3.getMessage(), null, 8, null);
            }
        } finally {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final String zzb(String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzcg(zzce.zzc, new zzcd(httpURLConnection.getResponseCode()), null, null, 12, null);
                }
                try {
                    return TextStreamsKt.readText(Intrinsics.areEqual("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzcg(zzce.zzc, zzcd.zzP, null, null, 12, null);
                }
            } catch (Exception unused2) {
                throw new zzcg(zzce.zzc, zzcd.zzO, null, null, 12, null);
            }
        } catch (Exception unused3) {
            throw new zzcg(zzce.zzb, zzcd.zzN, null, null, 12, null);
        }
    }
}
