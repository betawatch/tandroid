package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.play.core.integrity.StandardIntegrityException;
import gd.c;
import gd.g;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.e;
import v7.s7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        int i10;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i10 = 44;
            } else if (errorCode == -12) {
                i10 = 39;
            } else if (errorCode == -3) {
                i10 = 30;
            } else if (errorCode == -2) {
                i10 = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case -19:
                        i10 = 54;
                        break;
                    case -18:
                        i10 = 53;
                        break;
                    case -17:
                        i10 = 52;
                        break;
                    case -16:
                        i10 = 43;
                        break;
                    case -15:
                        i10 = 42;
                        break;
                    case -14:
                        i10 = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i10 = 36;
                                break;
                            case -8:
                                i10 = 35;
                                break;
                            case -7:
                                i10 = 34;
                                break;
                            case -6:
                                i10 = 33;
                                break;
                            case -5:
                                i10 = 32;
                                break;
                            default:
                                i10 = 2;
                                break;
                        }
                }
            } else {
                i10 = 28;
            }
        } else {
            i10 = 45;
        }
        zzys zzf = zzyt.zzf();
        zzf.zzq(i10);
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
        int i10 = zzby.zza;
        this.zze = s7.a(zzaz.zza);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar, int i10, e eVar) {
        this(new zzbo(28800000L), new zzcz(k6.e.b));
    }
}
