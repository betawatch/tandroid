package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzex extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j, zzye zzyeVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzfpVar;
        this.zzc = j;
        this.zzd = zzyeVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, zw2Var);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        mx2 c = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object c2 = fud.c(c, zzewVar, this);
        vx2 vx2Var = vx2.a;
        return c2 == vx2Var ? vx2Var : c2;
    }
}
