package com.google.android.recaptcha.internal;

import android.app.Application;
import b8.hb;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dd.c;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.f;
import m6.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final /* synthetic */ Object zzc(String str, fd.c cVar) {
        return zzam.zza(this, str, cVar);
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final /* synthetic */ Object zzd(zzxp zzxpVar, fd.c cVar) {
        Object zzd;
        zzd = zzhj.zzd(36, zza(), new zzap(this, zzxpVar, null), cVar);
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zze(String str, fd.c cVar) {
        return new zzhg(new zzax(this, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzf(zzxp zzxpVar, fd.c cVar) {
        return new zzhg(new zzay(this, zzxpVar, null));
    }

    @Override // com.google.android.recaptcha.internal.zzar
    public final Object zzg(Exception exc, fd.c cVar) {
        int i3;
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        if (exc instanceof StandardIntegrityException) {
            int errorCode = ((StandardIntegrityException) exc).getErrorCode();
            if (errorCode == -100) {
                i3 = 44;
            } else if (errorCode == -12) {
                i3 = 39;
            } else if (errorCode == -3) {
                i3 = 30;
            } else if (errorCode == -2) {
                i3 = 29;
            } else if (errorCode != -1) {
                switch (errorCode) {
                    case -19:
                        i3 = 54;
                        break;
                    case -18:
                        i3 = 53;
                        break;
                    case -17:
                        i3 = 52;
                        break;
                    case -16:
                        i3 = 43;
                        break;
                    case -15:
                        i3 = 42;
                        break;
                    case -14:
                        i3 = 41;
                        break;
                    default:
                        switch (errorCode) {
                            case -9:
                                i3 = 36;
                                break;
                            case -8:
                                i3 = 35;
                                break;
                            case -7:
                                i3 = 34;
                                break;
                            case -6:
                                i3 = 33;
                                break;
                            case -5:
                                i3 = 32;
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                }
            } else {
                i3 = 28;
            }
        } else {
            i3 = 45;
        }
        zzys zzf = zzyt.zzf();
        zzf.zzq(i3);
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
        int i3 = zzby.zza;
        this.zze = hb.b(zzaz.zza);
    }

    public zzba(zzbo zzboVar, zzda zzdaVar, int i3, f fVar) {
        this(new zzbo(28800000L), new zzcz(e.b));
    }
}
