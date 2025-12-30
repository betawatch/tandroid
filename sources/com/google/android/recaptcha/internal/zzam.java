package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class zzam {
    public static /* synthetic */ Object zza(zzar zzarVar, String str, Continuation continuation) {
        return new zzhg(new zzao(zzarVar, str, null));
    }

    public static /* synthetic */ Object zzc(zzar zzarVar, zzxp zzxpVar, Continuation continuation) {
        return new zzhg(new zzaq(null));
    }

    public static /* synthetic */ Object zzd(zzar zzarVar, Exception exc, Continuation continuation) {
        int i = true != (exc instanceof TimeoutCancellationException) ? 2 : 27;
        int zza = zzarVar.zza();
        zzys zzf = zzyt.zzf();
        zzf.zzf(zza);
        zzf.zzr(13);
        zzf.zzq(i);
        return zzas.zza(zzarVar, (zzyt) zzf.zzk());
    }
}
