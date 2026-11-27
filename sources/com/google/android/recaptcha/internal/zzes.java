package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzes extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ zzye zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzfp zzfpVar, zzye zzyeVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzfpVar;
        this.zzc = zzyeVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzes(this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzer zzerVar = new zzer(this.zzb, this.zzc, null);
        this.zza = 1;
        Object b = xde.b(zzerVar, this);
        vx2 vx2Var = vx2.a;
        return b == vx2Var ? vx2Var : b;
    }
}
