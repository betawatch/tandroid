package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzeg extends ccb implements eq4 {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzeq zzeqVar, String str, fw2 fw2Var) {
        super(2, fw2Var);
        this.zza = zzeqVar;
        this.zzb = str;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzeg(this.zza, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        zzeq zzeqVar = this.zza;
        if (rp5.a(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
