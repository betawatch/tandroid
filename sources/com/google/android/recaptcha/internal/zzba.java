package com.google.android.recaptcha.internal;

import a8.ab;
import android.app.Application;
import com.google.android.play.core.integrity.StandardIntegrityException;
import gd.c;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.f;
import n6.e;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zzba implements zzar {
    private final zzbo zza;
    private final zzda zzb;
    private boolean zzc;
    private String zzd;
    private final c zze;

    public zzba() {
        this(null, null, 3, null);
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
    public final /* synthetic */ Object zzc(String str, id.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, id.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, id.c cVar) {
        return new zzhg(new zzax(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, id.c cVar) {
        return new zzhg(new zzay(this, zzxpVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, id.c cVar) {
        int i7;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i7 = 44;
            } else if (errorCode == -12) {
                i7 = 39;
            } else if (errorCode == -3) {
                i7 = 30;
            } else if (errorCode == -2) {
                i7 = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case -19:
                        i7 = 54;
                        break;
                    case -18:
                        i7 = 53;
                        break;
                    case -17:
                        i7 = 52;
                        break;
                    case -16:
                        i7 = 43;
                        break;
                    case -15:
                        i7 = 42;
                        break;
                    case -14:
                        i7 = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i7 = 36;
                                break;
                            case -8:
                                i7 = 35;
                                break;
                            case -7:
                                i7 = 34;
                                break;
                            case -6:
                                i7 = 33;
                                break;
                            case -5:
                                i7 = 32;
                                break;
                            default:
                                i7 = 2;
                                break;
                        }
                }
            } else {
                i7 = 28;
            }
        } else {
            i7 = 45;
        }
        zzys zzf = zzyt.zzf();
        zzf.zzq(i7);
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

    public final void zzo(boolean z9) {
        this.zzc = false;
    }

    public zzba(zzbo zzboVar, zzda zzdaVar) {
        this.zza = zzboVar;
        this.zzb = zzdaVar;
        this.zzc = true;
        this.zzd = "";
        int i7 = zzby.zza;
        this.zze = ab.b(zzaz.zza);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar, int i7, f fVar) {
        this(new zzbo(28800000L), new zzcz(e.b));
    }
}
