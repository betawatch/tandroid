package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzeb extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
        this.zzg = zzhhVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, fw2Var);
        zzebVar.zzh = obj;
        return zzebVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        if (r15 != r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r15 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r15 != r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r15 != r5) goto L28;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        zzeq zzeqVar;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        if (i == 0) {
            qse.b(obj);
            zzgrVar = (zzgr) this.zzh;
            zzeh zzehVar = this.zzb;
            zzeqVar = zzehVar.zzc;
            if (zzeqVar != null) {
                String str = this.zzc;
                this.zzh = zzgrVar;
                this.zza = 1;
                obj = new zzhf(45, new zzeg(zzeqVar, str, null), null);
            } else {
                zzdw zzdwVar = this.zzd;
                if (zzdwVar == null) {
                    String str2 = this.zzc;
                    zzdq zzdqVar = this.zze;
                    zzfp zzfpVar = new zzfp(str2);
                    zzdwVar = rp5.a(zzdqVar, zzdq.zza) ? new zzge(zzfpVar) : new zzgb(zzfpVar, new zzct());
                }
                zzdw zzdwVar2 = zzdwVar;
                String str3 = this.zzc;
                long j = this.zzf;
                zzhh zzhhVar = this.zzg;
                this.zzh = zzgrVar;
                this.zza = 3;
                obj = new zzhg(new zzee(zzehVar, j, zzdwVar2, str3, zzhhVar, null));
            }
            return bx2Var;
        }
        if (i == 1) {
            zzgrVar = (zzgr) this.zzh;
            qse.b(obj);
            this.zzh = null;
            this.zza = 2;
            obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
        } else {
            if (i == 2) {
                qse.b(obj);
                return (zzeq) obj;
            }
            if (i != 3) {
                qse.b(obj);
                return (zzeq) obj;
            }
            zzgrVar = (zzgr) this.zzh;
            qse.b(obj);
            this.zzh = null;
            this.zza = 4;
            obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
        }
    }
}
