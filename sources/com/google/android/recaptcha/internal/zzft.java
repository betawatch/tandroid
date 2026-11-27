package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzft extends yfb implements ur4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j, zzgb zzgbVar, zw2 zw2Var) {
        super(1, zw2Var);
        this.zzb = j;
        this.zzc = zzgbVar;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        return new zzft(this.zzb, this.zzc, zw2Var);
    }

    @Override // ur4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((zw2) obj)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            Object a = e0f.a(j, zzfsVar, this);
            vx2 vx2Var = vx2.a;
            if (a == vx2Var) {
                return vx2Var;
            }
        }
        return g9c.a;
    }
}
