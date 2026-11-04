package com.google.android.recaptcha.internal;

import b8.hb;
import dd.c;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzhp implements zzhn {
    private final c zza;

    public zzhp() {
        int i3 = zzby.zza;
        this.zza = hb.b(zzho.zza);
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
                j.b(zza);
                zzxn zzxnVar = (zzxn) zza;
                zzhlVar.zzd();
                return zzxnVar;
            } catch (zzcg e10) {
                if (zzhlVar == null) {
                    throw e10;
                }
                if (!j.a(e10.zza(), zzcd.zzax)) {
                    throw e10;
                }
                try {
                    throw zzcf.zza(zzzj.zzg(zzhlVar.zzb().getErrorStream()).zzi());
                } catch (Exception e11) {
                    throw new zzcg(zzce.zzc, zzcd.zzG, e11.getMessage(), null, 8, null);
                }
            } catch (Exception e12) {
                throw new zzcg(zzce.zzc, zzcd.zzF, e12.getMessage(), null, 8, null);
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
                    char[] cArr = new char[TLObject.FLAG_13];
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
