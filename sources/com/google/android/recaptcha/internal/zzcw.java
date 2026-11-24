package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzcw extends ccb implements eq4 {
    int zza;
    final /* synthetic */ qp4 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i, long j, long j2, double d, qp4 qp4Var, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = qp4Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        qp4 qp4Var = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object zza = zzcxVar.zza(20, 100L, 1000L, 2.0d, qp4Var, this);
        bx2 bx2Var = bx2.a;
        return zza == bx2Var ? bx2Var : zza;
    }
}
