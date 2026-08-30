package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import k7.o7;
import kotlin.jvm.internal.j;
import sc.c;
import sc.g;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzhp implements zzhn {
    private final c zza;

    public zzhp() {
        int i10 = zzby.zza;
        this.zza = o7.a(zzho.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final zzxn zza(String str, zzzd zzzdVar) {
        zzhl zzhlVar = null;
        try {
            try {
                zzhlVar = ((zzhm) ((g) this.zza).a()).zza(str);
                zzhlVar.zzc();
                zzhlVar.zze(zzzdVar.zzd());
                zzts zza = zzhlVar.zza(zzxn.zzj());
                j.b(zza);
                zzxn zzxnVar = (zzxn) zza;
                zzhlVar.zzd();
                return zzxnVar;
            } catch (zzcg e) {
                if (zzhlVar == null) {
                    throw e;
                }
                if (!j.a(e.zza(), zzcd.zzax)) {
                    throw e;
                }
                try {
                    throw zzcf.zza(zzzj.zzg(zzhlVar.zzb().getErrorStream()).zzi());
                } catch (Exception e6) {
                    throw new zzcg(zzce.zzc, zzcd.zzG, e6.getMessage(), null, 8, null);
                }
            } catch (Exception e10) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e10.getMessage(), null, 8, null);
            }
        } finally {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final String zzb(String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
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
                    InputStreamReader inputStreamReader = "gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream());
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[8192];
                    for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                        stringWriter.write(cArr, 0, read);
                    }
                    String stringWriter2 = stringWriter.toString();
                    j.d(stringWriter2, "toString(...)");
                    return stringWriter2;
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
