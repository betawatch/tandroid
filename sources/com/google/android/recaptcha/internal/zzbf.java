package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzbf extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzbo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbo zzboVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzboVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzbf(this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            Object b = xde.b(zzbeVar, this);
            vx2 vx2Var = vx2.a;
            if (b == vx2Var) {
                return vx2Var;
            }
        }
        return f9c.a;
    }
}
