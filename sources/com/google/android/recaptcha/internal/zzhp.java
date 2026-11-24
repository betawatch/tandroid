package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzhp implements zzhn {
    private final d06 zza;

    public zzhp() {
        int i = zzby.zza;
        this.zza = cne.b(zzho.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzhn
    public final zzxn zza(String str, zzzd zzzdVar) {
        zzhl zzhlVar = null;
        try {
            try {
                try {
                    zzhlVar = ((zzhm) this.zza.getValue()).zza(str);
                    zzhlVar.zzc();
                    zzhlVar.zze(zzzdVar.zzd());
                    zzts zza = zzhlVar.zza(zzxn.zzj());
                    zza.getClass();
                    zzxn zzxnVar = (zzxn) zza;
                    zzhlVar.zzd();
                    return zzxnVar;
                } catch (zzcg e) {
                    if (zzhlVar == null) {
                        throw e;
                    }
                    if (!rp5.a(e.zza(), zzcd.zzax)) {
                        throw e;
                    }
                    try {
                        throw zzcf.zza(zzzj.zzg(zzhlVar.zzb().getErrorStream()).zzi());
                    } catch (Exception e2) {
                        throw new zzcg(zzce.zzc, zzcd.zzG, e2.getMessage(), null, 8, null);
                    }
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
                openConnection.getClass();
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
                    stringWriter2.getClass();
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
