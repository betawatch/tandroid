package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzcw extends yfb implements is4 {
    int zza;
    final /* synthetic */ ur4 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i, long j, long j2, double d, ur4 ur4Var, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = ur4Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        ur4 ur4Var = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object zza = zzcxVar.zza(20, 100L, 1000L, 2.0d, ur4Var, this);
        vx2 vx2Var = vx2.a;
        return zza == vx2Var ? vx2Var : zza;
    }
}
