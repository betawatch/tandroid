package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzl extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, String str, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzl zzlVar = new zzl(this.zzb, this.zzc, this.zzd, zw2Var);
        zzlVar.zze = obj;
        return zzlVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzl) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzk zzkVar = new zzk(this.zzb, this.zzc, (zzgr) this.zze, this.zzd, null);
        this.zza = 1;
        Object b = xde.b(zzkVar, this);
        vx2 vx2Var = vx2.a;
        return b == vx2Var ? vx2Var : b;
    }
}
