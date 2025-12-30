package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import java.nio.charset.StandardCharsets;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zzba implements zzar {
    private final zzbo zza;
    private final zzda zzb;
    private boolean zzc;
    private String zzd;
    private final Lazy zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzba() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar) {
        this.zza = zzboVar;
        this.zzb = zzdaVar;
        this.zzc = true;
        this.zzd = "";
        int i = zzby.zza;
        this.zze = LazyKt.lazy(zzaz.zza);
    }

    public static final /* synthetic */ Application zzb(zzba zzbaVar) {
        return (Application) zzbaVar.zze.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzp(zzqm zzqmVar) {
        zzpp zzg = zzpp.zzg();
        byte[] zzo = zzqmVar.zzo();
        byte[] zzd = zzpg.zza().zza(zzg.zzi(zzo, 0, zzo.length), StandardCharsets.UTF_8).zzd();
        zzqm zzl = zzqm.zzl(zzd, 0, zzd.length);
        zzpp zzh = zzpp.zzh();
        byte[] zzo2 = zzl.zzo();
        return zzh.zzi(zzo2, 0, zzo2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzc(String str, Continuation continuation) {
        return zzam.zza(this, str, continuation);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, Continuation continuation) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), continuation);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, Continuation continuation) {
        return new zzhg(new zzax(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, Continuation continuation) {
        return new zzhg(new zzay(this, zzxpVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, Continuation continuation) {
        int i;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i = 44;
            } else if (errorCode == -12) {
                i = 39;
            } else if (errorCode == -3) {
                i = 30;
            } else if (errorCode == -2) {
                i = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i = 54;
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i = 53;
                        break;
                    case -17:
                        i = 52;
                        break;
                    case -16:
                        i = 43;
                        break;
                    case -15:
                        i = 42;
                        break;
                    case -14:
                        i = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i = 36;
                                break;
                            case -8:
                                i = 35;
                                break;
                            case -7:
                                i = 34;
                                break;
                            case -6:
                                i = 33;
                                break;
                            case -5:
                                i = 32;
                                break;
                            default:
                                i = 2;
                                break;
                        }
                }
            } else {
                i = 28;
            }
        } else {
            i = 45;
        }
        zzys zzf = zzyt.zzf();
        zzf.zzq(i);
        zzf.zzr(15);
        return zzas.zza(this, (zzyt) zzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final void zzh(zzyg zzygVar) {
        this.zzd = zzp(zzygVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final boolean zzi() {
        return this.zzc;
    }

    public final void zzo(boolean z) {
        this.zzc = false;
    }

    public /* synthetic */ zzba(zzbo zzboVar, zzda zzdaVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(new zzbo(28800000L), new zzcz(GoogleApiAvailabilityLight.getInstance()));
    }
}
