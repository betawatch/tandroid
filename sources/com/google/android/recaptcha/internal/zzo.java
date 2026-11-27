package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzo extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzq zzqVar, long j, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzqVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, zw2Var);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            Object b = xde.b(zznVar, this);
            vx2 vx2Var = vx2.a;
            if (b == vx2Var) {
                return vx2Var;
            }
        }
        return g9c.a;
    }
}
