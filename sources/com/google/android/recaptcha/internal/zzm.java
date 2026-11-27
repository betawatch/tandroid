package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzm extends yfb implements is4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzgr zzc;
    final /* synthetic */ zzg zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzxn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzgr zzgrVar, zzg zzgVar, long j, zzxn zzxnVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzc = zzgrVar;
        this.zzd = zzgVar;
        this.zze = j;
        this.zzf = zzxnVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzm(this.zzc, this.zzd, this.zze, this.zzf, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzm) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhf) r11).zza(r0.zza(), r10) != r3) goto L16;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ge9Var;
        zzgr zzgrVar;
        int i = this.zzb;
        vx2 vx2Var = vx2.a;
        try {
        } catch (zzcg e) {
            ge9Var = new ge9(e);
        }
        if (i == 0) {
            ixe.b(obj);
            zzgrVar = this.zzc;
            zzg zzgVar = this.zzd;
            long j = this.zze;
            zzxn zzxnVar = this.zzf;
            this.zza = zzgrVar;
            this.zzb = 1;
            zzhf zzhfVar = new zzhf(zzgVar.zzk(), new zzd(zzgVar, j, zzxnVar, null), null);
            if (zzhfVar != vx2Var) {
                obj = zzhfVar;
            }
            return vx2Var;
        }
        if (i != 1) {
            ixe.b(obj);
            ge9Var = f9c.a;
            return new he9(ge9Var);
        }
        zzgrVar = (zzgr) this.zza;
        ixe.b(obj);
        this.zza = null;
        this.zzb = 2;
    }
}
