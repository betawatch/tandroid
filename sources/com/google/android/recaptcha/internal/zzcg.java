package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import dd.e;
import ed.s;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        e eVar = new e(zzzk.zzc, new zzcg(zzce.zzc, zzcd.zzd, null, null, 12, null));
        zzzk zzzkVar = zzzk.zzd;
        zzce zzceVar = zzce.zzb;
        int i3 = 12;
        f fVar = null;
        zzb = s.d(eVar, new e(zzzkVar, new zzcg(zzceVar, zzcd.zzc, null, 0 == true ? 1 : 0, 12, null)), new e(zzzk.zze, new zzcg(zzce.zzd, zzcd.zze, null, 0 == true ? 1 : 0, i3, fVar)), new e(zzzk.zzf, new zzcg(zzce.zze, zzcd.zzf, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i3, fVar)), new e(zzzk.zzi, new zzcg(zzce.zzf, zzcd.zzg, null, null, 12, null)), new e(zzzk.zzh, new zzcg(zzce.zzg, zzcd.zzh, null, 0 == true ? 1 : 0, 12, null)), new e(zzzk.zzj, new zzcg(zzceVar, zzcd.zzj, null, 0 == true ? 1 : 0, 12, null)));
    }

    public zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc) {
        this.zzc = zzceVar;
        this.zzd = zzcdVar;
        this.zze = str;
        this.zzf = exc;
        zzce zzceVar2 = zzce.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzg = s.d(new e(zzceVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new e(zzce.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new e(zzce.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), new e(zzce.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new e(zzce.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new e(zzce.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new e(zzce.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new e(zzce.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), new e(zzce.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
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
        if (j.a(zzcdVar, zzcd.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (j.a(zzcdVar, zzcd.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzg.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }

    public /* synthetic */ zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc, int i3, f fVar) {
        this(zzceVar, zzcdVar, (i3 & 4) != 0 ? null : str, null);
    }
}
