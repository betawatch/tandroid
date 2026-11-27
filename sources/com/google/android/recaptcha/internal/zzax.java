package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzax extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzbaVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzax zzaxVar = new zzax(this.zzb, zw2Var);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object b = xde.b(zzawVar, this);
        vx2 vx2Var = vx2.a;
        return b == vx2Var ? vx2Var : b;
    }
}
