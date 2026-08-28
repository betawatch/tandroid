package com.google.android.recaptcha.internal;

import g7.e8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzhl {
    private final HttpURLConnection zza;

    public zzhl(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e10.getMessage(), null, 8, null);
        } catch (IOException e11) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e12.getMessage(), null, 8, null);
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e10.getMessage(), null, 8, null);
        } catch (IOException e11) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e12.getMessage(), null, 8, null);
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
            e8.a(zzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzcg(zzce.zzc, zzcd.zzaw, null, null, 12, null);
            }
            try {
                Object zzb = zztsVar.zzD().zzb(byteArray);
                i.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzts) zzb;
            } catch (Exception e10) {
                throw new zzcg(zzce.zzc, zzcd.zzG, e10.getMessage(), null, 8, null);
            }
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzah, e11.getMessage(), null, 8, null);
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzac, e10.getMessage(), null, 8, null);
        } catch (IOException e11) {
            throw new zzcg(zzce.zzc, zzcd.zzad, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzc, zzcd.zzaj, e12.getMessage(), null, 8, null);
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzcg e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzcg(zzce.zzc, zzcd.zzag, e11.getMessage(), null, 8, null);
        } catch (Exception e12) {
            throw new zzcg(zzce.zzc, zzcd.zzal, e12.getMessage(), null, 8, null);
        }
    }
}
