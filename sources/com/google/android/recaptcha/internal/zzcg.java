package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzcg extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzce zzc;
    private final zzcd zzd;
    private final String zze;
    private final Exception zzf;
    private final Map zzg;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ku7 ku7Var = new ku7(zzzk.zzc, new zzcg(zzce.zzc, zzcd.zzd, null, null, 12, null));
        zzzk zzzkVar = zzzk.zzd;
        zzce zzceVar = zzce.zzb;
        int i = 12;
        t93 t93Var = null;
        zzb = qi6.c(ku7Var, new ku7(zzzkVar, new zzcg(zzceVar, zzcd.zzc, null, 0 == true ? 1 : 0, 12, null)), new ku7(zzzk.zze, new zzcg(zzce.zzd, zzcd.zze, null, 0 == true ? 1 : 0, i, t93Var)), new ku7(zzzk.zzf, new zzcg(zzce.zze, zzcd.zzf, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, t93Var)), new ku7(zzzk.zzi, new zzcg(zzce.zzf, zzcd.zzg, null, null, 12, null)), new ku7(zzzk.zzh, new zzcg(zzce.zzg, zzcd.zzh, null, 0 == true ? 1 : 0, 12, null)), new ku7(zzzk.zzj, new zzcg(zzceVar, zzcd.zzj, null, 0 == true ? 1 : 0, 12, null)));
    }

    public zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc) {
        this.zzc = zzceVar;
        this.zzd = zzcdVar;
        this.zze = str;
        this.zzf = exc;
        zzce zzceVar2 = zzce.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzg = qi6.c(new ku7(zzceVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new ku7(zzce.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new ku7(zzce.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new ku7(zzce.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new ku7(zzce.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new ku7(zzce.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new ku7(zzce.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new ku7(zzce.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new ku7(zzce.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.zzf;
    }

    public final zzcd zza() {
        return this.zzd;
    }

    public final zzce zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzcd zzcdVar = this.zzd;
        if (rp5.a(zzcdVar, zzcd.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (rp5.a(zzcdVar, zzcd.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzg.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }

    public /* synthetic */ zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc, int i, t93 t93Var) {
        this(zzceVar, zzcdVar, (i & 4) != 0 ? null : str, null);
    }
}
