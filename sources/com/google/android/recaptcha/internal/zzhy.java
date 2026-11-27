package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzhy extends yfb implements is4 {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhy(zzib zzibVar, String str, String str2, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzibVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzhy(this.zza, this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return g9c.a;
        } catch (Exception e) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e.getMessage(), null, 8, null);
        }
    }
}
