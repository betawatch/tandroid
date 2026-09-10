package com.google.android.recaptcha.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.i;
import w7.k6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class zzhl {
    private final HttpURLConnection zza;

    public zzhl(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e.getMessage(), null, 8, null);
        } catch (IOException e7) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e7.getMessage(), null, 8, null);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e10.getMessage(), null, 8, null);
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e.getMessage(), null, 8, null);
        } catch (IOException e7) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e7.getMessage(), null, 8, null);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e10.getMessage(), null, 8, null);
        }
    }

    public final zzts zza(zzts zztsVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzcg(zzce.zzc, zzcd.zzax, null, null, 12, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzcg(zzce.zzc, zzcd.zzK, null, null, 12, null);
                    }
                    throw new zzcg(zzce.zzc, zzcd.zzi, null, null, 12, null);
                }
                throw new zzcg(zzce.zzi, zzcd.zzJ, null, null, 12, null);
            }
            InputStream zzf = zzf();
            i.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            k6.a(zzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzcg(zzce.zzc, zzcd.zzaw, null, null, 12, null);
            }
            try {
                Object zzb = zztsVar.zzD().zzb(byteArray);
                i.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzts) zzb;
            } catch (Exception e) {
                throw new zzcg(zzce.zzc, zzcd.zzG, e.getMessage(), null, 8, null);
            }
        } catch (Exception e7) {
            throw new zzcg(zzce.zzc, zzcd.zzah, e7.getMessage(), null, 8, null);
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzcg(zzce.zzc, zzcd.zzac, e.getMessage(), null, 8, null);
        } catch (IOException e7) {
            throw new zzcg(zzce.zzc, zzcd.zzad, e7.getMessage(), null, 8, null);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzaj, e10.getMessage(), null, 8, null);
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzcg e) {
            throw e;
        } catch (IOException e7) {
            throw new zzcg(zzce.zzc, zzcd.zzag, e7.getMessage(), null, 8, null);
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzal, e10.getMessage(), null, 8, null);
        }
    }
}
