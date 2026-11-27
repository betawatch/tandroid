package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzll extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzxn zzxnVar, zzly zzlyVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, zw2Var);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (((com.google.android.recaptcha.internal.zzhg) r12).zza(r0, r11) != r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r12 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r12.zzc(r0, r11) != r3) goto L22;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object ge9Var;
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        if (i == 0) {
            ixe.b(obj);
            zzhkVar = (zzhk) this.zzd;
            zzxn zzxnVar = this.zzb;
            if (zzxnVar.zzV() && zzxnVar.zzT() && zzxnVar.zzS()) {
                zzly zzlyVar = this.zzc;
                zzlyVar.zze = zzxnVar;
                this.zzd = zzhkVar;
                this.zza = 2;
                obj = zzly.zzu(zzlyVar, this);
            } else {
                zzdj zzn = this.zzc.zzn();
                zzmc zzmcVar = zzmc.zzd;
                this.zza = 1;
            }
            return vx2Var;
        }
        if (i == 1) {
            ixe.b(obj);
            ge9Var = new ge9(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new he9(ge9Var);
        }
        if (i != 2) {
            ixe.b(obj);
            ge9Var = f9c.a;
            return new he9(ge9Var);
        }
        zzhkVar = (zzhk) this.zzd;
        ixe.b(obj);
        this.zzd = null;
        this.zza = 3;
    }
}
