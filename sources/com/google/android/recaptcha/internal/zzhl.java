package com.google.android.recaptcha.internal;

import j7.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzhl {
    private final HttpURLConnection zza;

    public zzhl(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e6) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e6.getMessage(), null, 8, null);
        } catch (IOException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e11.getMessage(), null, 8, null);
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e6) {
            throw new zzcg(zzce.zzc, zzcd.zzaf, e6.getMessage(), null, 8, null);
        } catch (IOException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzae, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzak, e11.getMessage(), null, 8, null);
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
            j.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            f0.a(zzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzcg(zzce.zzc, zzcd.zzaw, null, null, 12, null);
            }
            try {
                Object zzb = zztsVar.zzD().zzb(byteArray);
                j.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzts) zzb;
            } catch (Exception e6) {
                throw new zzcg(zzce.zzc, zzcd.zzG, e6.getMessage(), null, 8, null);
            }
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzah, e10.getMessage(), null, 8, null);
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e6) {
            throw new zzcg(zzce.zzc, zzcd.zzac, e6.getMessage(), null, 8, null);
        } catch (IOException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzad, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzaj, e11.getMessage(), null, 8, null);
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzcg e6) {
            throw e6;
        } catch (IOException e10) {
            throw new zzcg(zzce.zzc, zzcd.zzag, e10.getMessage(), null, 8, null);
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzal, e11.getMessage(), null, 8, null);
        }
    }
}
