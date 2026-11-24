package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzbf extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzbo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbf(zzbo zzboVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzboVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzbf(this.zzb, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbf) create((zzgr) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i == 0) {
            zzbe zzbeVar = new zzbe(this.zzb, null);
            this.zza = 1;
            Object b = h9e.b(zzbeVar, this);
            bx2 bx2Var = bx2.a;
            if (b == bx2Var) {
                return bx2Var;
            }
        }
        return g5c.a;
    }
}
