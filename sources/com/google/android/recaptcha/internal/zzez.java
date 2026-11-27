package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzez extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfp zzfpVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzfpVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzez zzezVar = new zzez(this.zzb, zw2Var);
        zzezVar.zzc = obj;
        return zzezVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzez) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = (zzhk) this.zzc;
        zzfp zzfpVar = this.zzb;
        mx2 c = zzfp.zzf(zzfpVar).zza().c();
        zzey zzeyVar = new zzey(zzfpVar, zzhkVar, null);
        this.zza = 1;
        Object c2 = fud.c(c, zzeyVar, this);
        vx2 vx2Var = vx2.a;
        return c2 == vx2Var ? vx2Var : c2;
    }
}
