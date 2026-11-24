package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzax extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzbaVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzax zzaxVar = new zzax(this.zzb, fw2Var);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object b = h9e.b(zzawVar, this);
        bx2 bx2Var = bx2.a;
        return b == bx2Var ? bx2Var : b;
    }
}
