package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private mq2 zzb = kud.a();
    private final d26 zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        int i = zzby.zza;
        this.zzc = fpe.b(zzfv.zza);
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
        return (rr5.a(zzcgVar.zzb(), zzce.zzd) || rr5.a(zzcgVar.zzb(), zzce.zze) || rr5.a(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzp(rr4 rr4Var, px2 px2Var) {
        zzfr zzfrVar;
        int i;
        zzcs zzcsVar;
        if (px2Var instanceof zzfr) {
            zzfrVar = (zzfr) px2Var;
            int i2 = zzfrVar.zzc;
            if ((i2 & TLObject.FLAG_31) != 0) {
                zzfrVar.zzc = i2 - TLObject.FLAG_31;
                Object obj = zzfrVar.zza;
                i = zzfrVar.zzc;
                if (i != 0) {
                    tue.b(obj);
                    zzcs zzcsVar2 = new zzcs();
                    zzfrVar.zzd = zzcsVar2;
                    zzfrVar.zzc = 1;
                    Object invoke = rr4Var.invoke(zzfrVar);
                    Object obj2 = ly2.a;
                    if (invoke == obj2) {
                        return obj2;
                    }
                    zzcsVar = zzcsVar2;
                } else {
                    if (i != 1) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzcsVar = zzfrVar.zzd;
                    tue.b(obj);
                }
                zzcsVar.zzc();
                return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzfrVar = new zzfr(this, px2Var);
        Object obj3 = zzfrVar.zza;
        i = zzfrVar.zzc;
        if (i != 0) {
        }
        zzcsVar.zzc();
        return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j, px2 px2Var) {
        return new zzhg(new zzga(this, j, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, px2 px2Var) {
        return new zzhg(new zzfq(this, j, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j, px2 px2Var) {
        return zzq(j, px2Var);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
