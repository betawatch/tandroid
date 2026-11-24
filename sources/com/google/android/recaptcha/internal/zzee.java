package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzee extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzhh zzf;
    private /* synthetic */ Object zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzeh zzehVar, long j, zzdw zzdwVar, String str, zzhh zzhhVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzehVar;
        this.zzc = j;
        this.zzd = zzdwVar;
        this.zze = str;
        this.zzf = zzhhVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, fw2Var);
        zzeeVar.zzg = obj;
        return zzeeVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzee) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r8).zza(r0, r7) != r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r8 != r2) goto L13;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzhkVar = (zzhk) this.zzg;
                zzeh zzehVar = this.zzb;
                long j = this.zzc;
                zzeh.zzf(zzehVar, j);
                zzdw zzdwVar = this.zzd;
                this.zzg = zzhkVar;
                this.zza = 1;
                obj = zzdwVar.zzb(j, this);
            } else {
                if (i != 1) {
                    qse.b(obj);
                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
                    this.zzb.zzc = zzeqVar;
                    return zzeqVar;
                }
                zzhkVar = (zzhk) this.zzg;
                qse.b(obj);
            }
            this.zzg = null;
            this.zza = 2;
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zza, e2.getMessage(), null, 8, null);
        }
    }
}
