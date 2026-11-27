package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzf extends yfb implements is4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j, zzg zzgVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = j;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, zw2Var);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r6;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
            if (i == 0) {
                ixe.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                a = e0f.a(j, zzeVar, this);
            } else {
                if (i != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ixe.b(obj);
                    throw zzcgVar;
                }
                ixe.b(obj);
                a = obj;
            }
            Object obj2 = ((he9) a).a;
            ixe.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e) {
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j2 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j2, e, this) != vx2Var) {
                throw zza;
            }
        }
    }
}
