package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzj extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzgr zzgrVar, zzg zzgVar, String str, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = str;
        this.zzf = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzj(this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r2) goto L10;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzgr zzgrVar;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            String str = this.zze;
            long j = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            obj = new zzhg(new zzb(zzgVar, str, j, null));
        } else {
            if (i != 1) {
                ixe.b(obj);
                return obj;
            }
            zzgrVar = (zzgr) this.zza;
            ixe.b(obj);
        }
        this.zza = null;
        this.zzb = 2;
        Object zza = ((zzhg) obj).zza(zzgrVar.zza(), this);
        return zza != vx2Var ? zza : vx2Var;
    }
}
