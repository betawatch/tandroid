package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzet extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzfp zzfpVar, String str, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzfpVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzet zzetVar = new zzet(this.zzb, this.zzc, this.zzd, fw2Var);
        zzetVar.zze = obj;
        return zzetVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r8 != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r8 != r2) goto L13;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzgrVar = (zzgr) this.zze;
                zzq zzb = zzfp.zzb(this.zzb);
                String str = this.zzc;
                long j = this.zzd;
                this.zze = zzgrVar;
                this.zza = 1;
                obj = zzb.zzb(str, j, this);
            } else {
                if (i != 1) {
                    qse.b(obj);
                    return (zzxx) obj;
                }
                zzgrVar = (zzgr) this.zze;
                qse.b(obj);
            }
            this.zze = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } catch (zzcg e) {
            throw e;
        } catch (mob e2) {
            throw new zzcg(zzce.zzb, zzcd.zzb, e2.getMessage(), null, 8, null);
        } catch (Exception e3) {
            throw new zzcg(zzce.zzb, zzcd.zzaa, e3.getMessage(), null, 8, null);
        }
    }
}
