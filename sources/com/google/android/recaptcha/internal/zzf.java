package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzf extends ccb implements eq4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzg zzc;
    final /* synthetic */ String zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(long j, zzg zzgVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = j;
        this.zzc = zzgVar;
        this.zzd = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, fw2Var);
        zzfVar.zze = obj;
        return zzfVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzf) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r6;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        int i = this.zza;
        bx2 bx2Var = bx2.a;
        try {
            if (i == 0) {
                qse.b(obj);
                zzgr zzgrVar = (zzgr) this.zze;
                long j = this.zzb;
                zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
                this.zza = 1;
                a = mve.a(j, zzeVar, this);
            } else {
                if (i != 1) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    qse.b(obj);
                    throw zzcgVar;
                }
                qse.b(obj);
                a = obj;
            }
            Object obj2 = ((ta9) a).a;
            qse.b(obj2);
            return (zzxx) obj2;
        } catch (Exception e) {
            zzcg zza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
            zzg zzgVar = this.zzc;
            String str = this.zzd;
            long j2 = this.zzb;
            this.zze = zza;
            this.zza = 2;
            if (zzgVar.zze(str, j2, e, this) != bx2Var) {
                throw zza;
            }
        }
    }
}
