package com.google.android.recaptcha.internal;

import gd.c;
import gd.g;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.i;
import v7.s7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class zzhp implements zzhn {
    private final c zza;

    public zzhp() {
        int i10 = zzby.zza;
        this.zza = s7.a(zzho.zza);
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
                i.b(zza);
                zzxn zzxnVar = (zzxn) zza;
                zzhlVar.zzd();
                return zzxnVar;
            } catch (zzcg e7) {
                if (zzhlVar == null) {
                    throw e7;
                }
                if (!i.a(e7.zza(), zzcd.zzax)) {
                    throw e7;
                }
                try {
                    throw zzcf.zza(zzzj.zzg(zzhlVar.zzb().getErrorStream()).zzi());
                } catch (Exception e10) {
                    throw new zzcg(zzce.zzc, zzcd.zzG, e10.getMessage(), null, 8, null);
                }
            } catch (Exception e11) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e11.getMessage(), null, 8, null);
            }
        } finally {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final String zzb(String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
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
                    i.d(stringWriter2, "toString(...)");
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
