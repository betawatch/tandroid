package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzai extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzaj zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzxn zzxnVar, zzaj zzajVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzxnVar;
        this.zzc = zzajVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, zw2Var);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object b = xde.b(zzahVar, this);
        vx2 vx2Var = vx2.a;
        return b == vx2Var ? vx2Var : b;
    }
}
