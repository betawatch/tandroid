package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzao extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzar zzarVar, String str, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzarVar;
        this.zzc = str;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzao zzaoVar = new zzao(this.zzb, this.zzc, zw2Var);
        zzaoVar.zzd = obj;
        return zzaoVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r8 != r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r8 != r2) goto L17;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        vx2 vx2Var = vx2.a;
        try {
        } catch (Exception e) {
            zzar zzarVar = this.zzb;
            this.zza = 2;
            obj = zzarVar.zzg(e, this);
        }
        if (i == 0) {
            ixe.b(obj);
            zzhk zzhkVar = (zzhk) this.zzd;
            zzar zzarVar2 = this.zzb;
            int zza = zzarVar2.zza();
            zzan zzanVar = new zzan(zzarVar2, this.zzc, null);
            this.zza = 1;
            obj = new zzhf(37, zzanVar, new Integer(zza)).zza(zzhkVar, this);
        } else {
            if (i != 1) {
                ixe.b(obj);
                return (zzat) obj;
            }
            ixe.b(obj);
        }
        return (zzat) obj;
    }
}
