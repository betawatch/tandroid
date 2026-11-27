package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private up2 zzb = xwd.a();
    private final h26 zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        int i = zzby.zza;
        this.zzc = ure.b(zzfv.zza);
        zzduVar = zzdv.zza;
        this.zzf = zzduVar;
    }

    public static final /* synthetic */ zzcr zzd(zzgb zzgbVar) {
        return (zzcr) zzgbVar.zzc.getValue();
    }

    public static final /* synthetic */ boolean zzo(zzgb zzgbVar, Exception exc) {
        if (!(exc instanceof zzcg)) {
            return true;
        }
        zzcg zzcgVar = (zzcg) exc;
        return (ur5.a(zzcgVar.zzb(), zzce.zzd) || ur5.a(zzcgVar.zzb(), zzce.zze) || ur5.a(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzp(ur4 ur4Var, zw2 zw2Var) {
        zzfr zzfrVar;
        int i;
        zzcs zzcsVar;
        if (zw2Var instanceof zzfr) {
            zzfrVar = (zzfr) zw2Var;
            int i2 = zzfrVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzfrVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzfrVar.zza;
                i = zzfrVar.zzc;
                if (i != 0) {
                    ixe.b(obj);
                    zzcs zzcsVar2 = new zzcs();
                    zzfrVar.zzd = zzcsVar2;
                    zzfrVar.zzc = 1;
                    Object invoke = ur4Var.invoke(zzfrVar);
                    Object obj2 = vx2.a;
                    if (invoke == obj2) {
                        return obj2;
                    }
                    zzcsVar = zzcsVar2;
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzcsVar = zzfrVar.zzd;
                    ixe.b(obj);
                }
                zzcsVar.zzc();
                return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzfrVar = new zzfr(this, zw2Var);
        Object obj3 = zzfrVar.zza;
        i = zzfrVar.zzc;
        if (i != 0) {
        }
        zzcsVar.zzc();
        return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j, zw2 zw2Var) {
        return new zzhg(new zzga(this, j, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, zw2 zw2Var) {
        return new zzhg(new zzfq(this, j, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j, zw2 zw2Var) {
        return zzq(j, zw2Var);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
