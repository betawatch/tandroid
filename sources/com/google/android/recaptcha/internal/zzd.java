package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzd extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzg zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, long j, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzgVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, zw2Var);
        zzdVar.zze = obj;
        return zzdVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r11 != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r11 == r4) goto L22;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        f9c f9cVar = f9c.a;
        vx2 vx2Var = vx2.a;
        try {
        } catch (Exception e) {
            zzg zzgVar = this.zzb;
            zzgVar.zza = false;
            this.zza = 2;
            obj = zzgVar.zzf(e, this);
        }
        if (i == 0) {
            ixe.b(obj);
            zzgr zzgrVar = (zzgr) this.zze;
            zzg zzgVar2 = this.zzb;
            if (zzgVar2.zzi()) {
                return f9cVar;
            }
            long j = this.zzc;
            zzc zzcVar = new zzc(zzgrVar, zzgVar2, this.zzd, null);
            this.zza = 1;
            obj = e0f.a(j, zzcVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    zzcg zzcgVar = (zzcg) this.zze;
                    ixe.b(obj);
                    throw zzcgVar;
                }
                ixe.b(obj);
                zzg zzgVar3 = this.zzb;
                zzcg zzcgVar2 = (zzcg) obj;
                this.zze = zzcgVar2;
                this.zza = 3;
                if (zzgVar3.zzc(zzcgVar2, this) != vx2Var) {
                    throw zzcgVar2;
                }
                return vx2Var;
            }
            ixe.b(obj);
        }
        ixe.b(((he9) obj).a);
        this.zzb.zza = true;
        return f9cVar;
    }
}
