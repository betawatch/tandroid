package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzeo extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzeqVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzeo zzeoVar = new zzeo(this.zzb, this.zzc, this.zzd, zw2Var);
        zzeoVar.zze = obj;
        return zzeoVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeo) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r10 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r10 != r2) goto L13;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzdw zzdwVar;
        zzeo zzeoVar;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzeq zzeqVar = this.zzb;
                long j = this.zzc;
                RecaptchaAction recaptchaAction = this.zzd;
                zzeq.zzd(zzeqVar, j, recaptchaAction);
                zzdwVar = zzeqVar.zzb;
                String zzb = zzgrVar.zza().zzb();
                this.zze = zzgrVar;
                this.zza = 1;
                zzeoVar = this;
                obj = zzdwVar.zza(zzb, recaptchaAction, j, zzeoVar);
            } else {
                if (i != 1) {
                    ixe.b(obj);
                    String str = (String) obj;
                    if (str.length() != 0) {
                        return str;
                    }
                    throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                }
                zzgrVar = (zzgr) this.zze;
                ixe.b(obj);
                zzeoVar = this;
            }
            zzeoVar.zze = null;
            zzeoVar.zza = 2;
            obj = ((zzhg) obj).zza(zzgrVar.zza(), zzeoVar);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzX, e2.getMessage(), null, 8, null);
        }
    }
}
