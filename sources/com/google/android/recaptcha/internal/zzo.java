package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzo extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzq zzqVar, long j, zzxn zzxnVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzqVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, fw2Var);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            Object b = h9e.b(zznVar, this);
            bx2 bx2Var = bx2.a;
            if (b == bx2Var) {
                return bx2Var;
            }
        }
        return g5c.a;
    }
}
