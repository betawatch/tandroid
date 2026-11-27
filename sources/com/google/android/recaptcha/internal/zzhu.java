package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzhu extends yfb implements is4 {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhu(zzib zzibVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzibVar;
        this.zzb = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzhu(this.zza, this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhu) create((zzgr) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        return zzib.zzb(this.zza).zzb(this.zzb);
    }
}
