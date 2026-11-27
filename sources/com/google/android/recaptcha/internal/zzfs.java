package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzfs extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzgb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgb zzgbVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzgbVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzfs(this.zzb, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        up2 up2Var;
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            up2Var = this.zzb.zzb;
            this.zza = 1;
            Object h = ((vp2) up2Var).h(this);
            vx2 vx2Var = vx2.a;
            if (h == vx2Var) {
                return vx2Var;
            }
        }
        return g9c.a;
    }
}
