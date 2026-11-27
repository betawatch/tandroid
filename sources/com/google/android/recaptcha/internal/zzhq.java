package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzhq extends yfb implements is4 {
    final /* synthetic */ zzht zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzzd zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhq(zzht zzhtVar, String str, zzzd zzzdVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zza = zzhtVar;
        this.zzb = str;
        this.zzc = zzzdVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzhq(this.zza, this.zzb, this.zzc, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        try {
            zzht zzhtVar = this.zza;
            zzig zzb = zzht.zzb(zzhtVar);
            String str = this.zzb;
            if (zzb.zzb(str)) {
                return zzht.zza(zzhtVar).zza(str, this.zzc);
            }
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaz, e2.getMessage(), null, 8, null);
        }
    }
}
