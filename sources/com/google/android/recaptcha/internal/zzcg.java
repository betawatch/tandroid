package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
        Pair pair = TuplesKt.to(zzzk.zzc, new zzcg(zzce.zzc, zzcd.zzd, null, null, 12, null));
        zzzk zzzkVar = zzzk.zzd;
        zzce zzceVar = zzce.zzb;
        zzb = MapsKt.mapOf(pair, TuplesKt.to(zzzkVar, new zzcg(zzceVar, zzcd.zzc, 0 == true ? 1 : 0, null, 12, null)), TuplesKt.to(zzzk.zze, new zzcg(zzce.zzd, zzcd.zze, null, 0 == true ? 1 : 0, 12, null)), TuplesKt.to(zzzk.zzf, new zzcg(zzce.zze, zzcd.zzf, 0 == true ? 1 : 0, null, 12, null)), TuplesKt.to(zzzk.zzi, new zzcg(zzce.zzf, zzcd.zzg, null, null, 12, null)), TuplesKt.to(zzzk.zzh, new zzcg(zzce.zzg, zzcd.zzh, 0 == true ? 1 : 0, null, 12, null)), TuplesKt.to(zzzk.zzj, new zzcg(zzceVar, zzcd.zzj, null, null, 12, 0 == true ? 1 : 0)));
    }

    public zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc) {
        this.zzc = zzceVar;
        this.zzd = zzcdVar;
        this.zze = str;
        this.zzf = exc;
        zzce zzceVar2 = zzce.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzg = MapsKt.mapOf(TuplesKt.to(zzceVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), TuplesKt.to(zzce.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), TuplesKt.to(zzce.zzi, new RecaptchaException(recaptchaErrorCode, null, 2, null)), TuplesKt.to(zzce.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), TuplesKt.to(zzce.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), TuplesKt.to(zzce.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), TuplesKt.to(zzce.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), TuplesKt.to(zzce.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), TuplesKt.to(zzce.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
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
        if (Intrinsics.areEqual(zzcdVar, zzcd.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (Intrinsics.areEqual(zzcdVar, zzcd.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzg.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }

    public /* synthetic */ zzcg(zzce zzceVar, zzcd zzcdVar, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zzceVar, zzcdVar, (i & 4) != 0 ? null : str, null);
    }
}
