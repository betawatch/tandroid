package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzll extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzly zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzll(zzxn zzxnVar, zzly zzlyVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzxnVar;
        this.zzc = zzlyVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzll zzllVar = new zzll(this.zzb, this.zzc, px2Var);
        zzllVar.zzd = obj;
        return zzllVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzll) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzhk zzhkVar;
        Object sc9Var;
        int i = this.zza;
        ly2 ly2Var = ly2.a;
        if (i == 0) {
            tue.b(obj);
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
            return ly2Var;
        }
        if (i == 1) {
            tue.b(obj);
            sc9Var = new sc9(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
            return new tc9(sc9Var);
        }
        if (i != 2) {
            tue.b(obj);
            sc9Var = g7c.a;
            return new tc9(sc9Var);
        }
        zzhkVar = (zzhk) this.zzd;
        tue.b(obj);
        this.zzd = null;
        this.zza = 3;
    }
}
