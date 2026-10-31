package com.google.android.recaptcha.internal;

import ad.c;
import ad.h;
import com.google.android.recaptcha.RecaptchaAction;
import ib.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import l9.b;
import ld.l;
import org.telegram.tgnet.TLObject;
import td.e0;
import td.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzgb implements zzdw {
    private final zzfp zza;
    private s zzb = e0.a();
    private final c zzc;
    private zzcg zzd;
    private zzxn zze;
    private zzdv zzf;

    public zzgb(zzfp zzfpVar, zzct zzctVar) {
        zzdu zzduVar;
        this.zza = zzfpVar;
        int i10 = zzby.zza;
        this.zzc = a.a(zzfv.zza);
        zzduVar = zzdv.zza;
        this.zzf = zzduVar;
    }

    public static final /* synthetic */ zzcr zzd(zzgb zzgbVar) {
        return (zzcr) ((h) zzgbVar.zzc).a();
    }

    public static final /* synthetic */ boolean zzo(zzgb zzgbVar, Exception exc) {
        if (!(exc instanceof zzcg)) {
            return true;
        }
        zzcg zzcgVar = (zzcg) exc;
        return (i.a(zzcgVar.zzb(), zzce.zzd) || i.a(zzcgVar.zzb(), zzce.zze) || i.a(zzcgVar.zzb(), zzce.zzf)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzp(l lVar, cd.c cVar) {
        zzfr zzfrVar;
        int i10;
        zzcs zzcsVar;
        if (cVar instanceof zzfr) {
            zzfrVar = (zzfr) cVar;
            int i11 = zzfrVar.zzc;
            if ((i11 & TLObject.FLAG_31) != 0) {
                zzfrVar.zzc = i11 - TLObject.FLAG_31;
                Object obj = zzfrVar.zza;
                Object obj2 = dd.a.a;
                i10 = zzfrVar.zzc;
                if (i10 != 0) {
                    b.b(obj);
                    zzcs zzcsVar2 = new zzcs();
                    zzfrVar.zzd = zzcsVar2;
                    zzfrVar.zzc = 1;
                    if (lVar.invoke(zzfrVar) == obj2) {
                        return obj2;
                    }
                    zzcsVar = zzcsVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzcsVar = zzfrVar.zzd;
                    b.b(obj);
                }
                zzcsVar.zzc();
                return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzfrVar = new zzfr(this, cVar);
        Object obj3 = zzfrVar.zza;
        Object obj22 = dd.a.a;
        i10 = zzfrVar.zzc;
        if (i10 != 0) {
        }
        zzcsVar.zzc();
        return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzq(long j10, cd.c cVar) {
        return new zzhg(new zzga(this, j10, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j10, cd.c cVar) {
        return new zzhg(new zzfq(this, j10, str, recaptchaAction, null));
    }

    @Override // com.google.android.recaptcha.internal.zzdw
    public final Object zzb(long j10, cd.c cVar) {
        return zzq(j10, cVar);
    }

    public final zzdv zze() {
        return this.zzf;
    }
}
