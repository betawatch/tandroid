package com.google.android.recaptcha.internal;

import a8.ab;
import af.b;
import com.google.android.recaptcha.RecaptchaAction;
import gd.c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import rd.l;
import zd.b0;
import zd.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private s zzb = b0.a();
    private final c zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        int i7 = zzby.zza;
        this.zzc = ab.b(zzfv.zza);
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
        return (j.a(zzcgVar.zzb(), zzce.zzd) || j.a(zzcgVar.zzb(), zzce.zze) || j.a(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzp(l lVar, id.c cVar) {
        zzfr zzfrVar;
        int i7;
        zzcs zzcsVar;
        if (cVar instanceof zzfr) {
            zzfrVar = (zzfr) cVar;
            int i10 = zzfrVar.zzc;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zzfrVar.zzc = i10 - TLObject.FLAG_31;
                Object obj = zzfrVar.zza;
                Object obj2 = jd.a.a;
                i7 = zzfrVar.zzc;
                if (i7 != 0) {
                    b.c(obj);
                    zzcs zzcsVar2 = new zzcs();
                    zzfrVar.zzd = zzcsVar2;
                    zzfrVar.zzc = 1;
                    if (lVar.invoke(zzfrVar) == obj2) {
                        return obj2;
                    }
                    zzcsVar = zzcsVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzcsVar = zzfrVar.zzd;
                    b.c(obj);
                }
                zzcsVar.zzc();
                return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzfrVar = new zzfr(this, cVar);
        Object obj3 = zzfrVar.zza;
        Object obj22 = jd.a.a;
        i7 = zzfrVar.zzc;
        if (i7 != 0) {
        }
        zzcsVar.zzc();
        return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j3, id.c cVar) {
        return new zzhg(new zzga(this, j3, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j3, id.c cVar) {
        return new zzhg(new zzfq(this, j3, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j3, id.c cVar) {
        return zzq(j3, cVar);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
