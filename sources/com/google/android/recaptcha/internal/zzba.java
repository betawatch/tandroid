package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.play.core.integrity.StandardIntegrityException;
import g7.x5;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.e;
import oc.c;
import oc.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        return (Application) ((g) zzbaVar.zze).a();
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
    public final /* synthetic */ Object zzc(String str, qc.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, qc.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, qc.c cVar) {
        return new zzhg(new zzax(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, qc.c cVar) {
        return new zzhg(new zzay(this, zzxpVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, qc.c cVar) {
        int i9;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i9 = 44;
            } else if (errorCode == -12) {
                i9 = 39;
            } else if (errorCode == -3) {
                i9 = 30;
            } else if (errorCode == -2) {
                i9 = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case -19:
                        i9 = 54;
                        break;
                    case -18:
                        i9 = 53;
                        break;
                    case -17:
                        i9 = 52;
                        break;
                    case -16:
                        i9 = 43;
                        break;
                    case -15:
                        i9 = 42;
                        break;
                    case -14:
                        i9 = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i9 = 36;
                                break;
                            case -8:
                                i9 = 35;
                                break;
                            case -7:
                                i9 = 34;
                                break;
                            case -6:
                                i9 = 33;
                                break;
                            case -5:
                                i9 = 32;
                                break;
                            default:
                                i9 = 2;
                                break;
                        }
                }
            } else {
                i9 = 28;
            }
        } else {
            i9 = 45;
        }
        zzys zzf = zzyt.zzf();
        zzf.zzq(i9);
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

    public final void zzo(boolean z10) {
        this.zzc = false;
    }

    public zzba(zzbo zzboVar, zzda zzdaVar) {
        this.zza = zzboVar;
        this.zzb = zzdaVar;
        this.zzc = true;
        this.zzd = "";
        int i9 = zzby.zza;
        this.zze = x5.a(zzaz.zza);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar, int i9, e eVar) {
        this(new zzbo(28800000L), new zzcz(u5.e.b));
    }
}
